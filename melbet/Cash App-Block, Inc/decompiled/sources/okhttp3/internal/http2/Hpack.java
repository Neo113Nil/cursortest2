package okhttp3.internal.http2;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public abstract class Hpack {
    public static final Map NAME_TO_FIRST_INDEX;
    public static final Header[] STATIC_HEADER_TABLE;

    public final class Reader {
        public int dynamicTableByteCount;
        public int headerCount;
        public long headerListByteCount;
        public final RealBufferedSource source;
        public int maxDynamicTableByteCount = 4096;
        public final ArrayList headerList = new ArrayList();
        public Header[] dynamicTable = new Header[8];
        public int nextHeaderIndex = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.source = new RealBufferedSource(continuationSource);
        }

        public final void addHeader(Header header) {
            this.headerList.add(header);
            long size$okio = this.headerListByteCount + header.value.getSize$okio() + header.name.getSize$okio();
            this.headerListByteCount = size$okio;
            if (size$okio <= 262144) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$4("header byte count limit of 262144 exceeded");
        }

        public final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    int i4 = header.hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        public final ByteString getName(int i) {
            if (i >= 0) {
                Header[] headerArr = Hpack.STATIC_HEADER_TABLE;
                if (i <= headerArr.length - 1) {
                    return headerArr[i].name;
                }
            }
            int length = this.nextHeaderIndex + 1 + (i - Hpack.STATIC_HEADER_TABLE.length);
            if (length >= 0) {
                Header[] headerArr2 = this.dynamicTable;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    header.getClass();
                    return header.name;
                }
            }
            Path$$ExternalSyntheticBUOutline0.m$3(i + 1, "Header index too large ");
            return null;
        }

        public final void insertIntoDynamicTable(Header header) {
            addHeader(header);
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                ArraysKt___ArraysJvmKt.fill(r7, 0, this.dynamicTable.length, null);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final ByteString readByteString() {
            RealBufferedSource realBufferedSource = this.source;
            byte readByte = realBufferedSource.readByte();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            int i = readByte & 255;
            int i2 = 0;
            boolean z = (readByte & 128) == 128;
            long readInt = readInt(i, 127);
            if (this.headerListByteCount + readInt > 262144) {
                a$$ExternalSyntheticBUOutline0.m$4("header byte count limit of 262144 exceeded");
                return null;
            }
            if (!z) {
                return realBufferedSource.readByteString(readInt);
            }
            Buffer buffer = new Buffer();
            int[] iArr = Huffman.CODES;
            realBufferedSource.getClass();
            Huffman.Node node = Huffman.root;
            Huffman.Node node2 = node;
            int i3 = 0;
            for (long j = 0; j < readInt; j++) {
                byte readByte2 = realBufferedSource.readByte();
                byte[] bArr2 = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                i2 = (i2 << 8) | (readByte2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    Huffman.Node[] nodeArr = (Huffman.Node[]) node2.children;
                    nodeArr.getClass();
                    node2 = nodeArr[(i2 >>> (i3 - 8)) & 255];
                    node2.getClass();
                    if (((Huffman.Node[]) node2.children) == null) {
                        buffer.m4335writeByte(node2.symbol);
                        i3 -= node2.terminalBitCount;
                        node2 = node;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node[] nodeArr2 = (Huffman.Node[]) node2.children;
                nodeArr2.getClass();
                Huffman.Node node3 = nodeArr2[(i2 << (8 - i3)) & 255];
                node3.getClass();
                int i4 = node3.terminalBitCount;
                if (((Huffman.Node[]) node3.children) != null || i4 > i3) {
                    break;
                }
                buffer.m4335writeByte(node3.symbol);
                i3 -= i4;
                node2 = node;
            }
            return buffer.readByteString(buffer.size);
        }

        public final int readInt(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            long j = i2;
            int i4 = 0;
            int i5 = 0;
            while (i4 != 5) {
                byte readByte = this.source.readByte();
                byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                i4++;
                long j2 = (readByte & Byte.MAX_VALUE) << i5;
                if (j2 > 2147483647L - j) {
                    a$$ExternalSyntheticBUOutline0.m$4("HPACK integer overflow");
                    return 0;
                }
                j += j2;
                if ((readByte & 128) == 0) {
                    return (int) j;
                }
                i5 += 7;
            }
            a$$ExternalSyntheticBUOutline0.m$4("HPACK integer overflow");
            return 0;
        }
    }

    public final class Writer {
        public int dynamicTableByteCount;
        public boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public final Buffer out;
        public int smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
        public int maxDynamicTableByteCount = 4096;
        public Header[] dynamicTable = new Header[8];
        public int nextHeaderIndex = 7;

        public Writer(Buffer buffer) {
            this.out = buffer;
        }

        public final void evictToRecoverBytes(int i) {
            int i2;
            if (i > 0) {
                int length = this.dynamicTable.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    i -= header.hpackSize;
                    int i4 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    header2.getClass();
                    this.dynamicTableByteCount = i4 - header2.hpackSize;
                    this.headerCount--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i6 = this.nextHeaderIndex + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
        }

        public final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                Header[] headerArr = this.dynamicTable;
                ArraysKt___ArraysJvmKt.fill(headerArr, 0, headerArr.length, null);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr2 = this.dynamicTable;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr3;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void writeByteString(ByteString byteString) {
            byteString.getClass();
            int[] iArr = Huffman.CODES;
            int size$okio = byteString.getSize$okio();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < size$okio; i++) {
                byte internalGet$okio = byteString.internalGet$okio(i);
                byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                j2 += Huffman.CODE_BIT_COUNTS[internalGet$okio & 255];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int size$okio2 = byteString.getSize$okio();
            Buffer buffer = this.out;
            if (i2 >= size$okio2) {
                writeInt(byteString.getSize$okio(), 127, 0);
                buffer.m4333write(byteString);
                return;
            }
            Buffer buffer2 = new Buffer();
            int[] iArr2 = Huffman.CODES;
            int size$okio3 = byteString.getSize$okio();
            int i3 = 0;
            for (int i4 = 0; i4 < size$okio3; i4++) {
                byte internalGet$okio2 = byteString.internalGet$okio(i4);
                byte[] bArr2 = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                int i5 = internalGet$okio2 & 255;
                int i6 = Huffman.CODES[i5];
                byte b = Huffman.CODE_BIT_COUNTS[i5];
                j = (j << b) | i6;
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    buffer2.m4335writeByte((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                buffer2.m4335writeByte((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            ByteString readByteString = buffer2.readByteString(buffer2.size);
            writeInt(readByteString.getSize$okio(), 127, 128);
            buffer.m4333write(readByteString);
        }

        public final void writeHeaders(ArrayList arrayList) {
            int i;
            int i2;
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header header = (Header) arrayList.get(i4);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Integer num = (Integer) Hpack.NAME_TO_FIRST_INDEX.get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        Header[] headerArr = Hpack.STATIC_HEADER_TABLE;
                        if (Intrinsics.areEqual(headerArr[intValue].value, byteString)) {
                            i = i2;
                        } else if (Intrinsics.areEqual(headerArr[i2].value, byteString)) {
                            i2 = intValue + 2;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i5];
                        header2.getClass();
                        if (Intrinsics.areEqual(header2.name, asciiLowercase)) {
                            Header header3 = this.dynamicTable[i5];
                            header3.getClass();
                            if (Intrinsics.areEqual(header3.value, byteString)) {
                                i2 = Hpack.STATIC_HEADER_TABLE.length + (i5 - this.nextHeaderIndex);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    writeInt(i2, 127, 128);
                } else if (i == -1) {
                    this.out.m4335writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else {
                    ByteString byteString2 = Header.PSEUDO_PREFIX;
                    asciiLowercase.getClass();
                    byteString2.getClass();
                    if (!asciiLowercase.rangeEquals(0, byteString2.getSize$okio(), byteString2) || Intrinsics.areEqual(Header.TARGET_AUTHORITY, asciiLowercase)) {
                        writeInt(i, 63, 64);
                        writeByteString(byteString);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(i, 15, 0);
                        writeByteString(byteString);
                    }
                }
            }
        }

        public final void writeInt(int i, int i2, int i3) {
            Buffer buffer = this.out;
            if (i < i2) {
                buffer.m4335writeByte(i | i3);
                return;
            }
            buffer.m4335writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                buffer.m4335writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            buffer.m4335writeByte(i4);
        }
    }

    static {
        Header header = new Header("", Header.TARGET_AUTHORITY);
        ByteString byteString = Header.TARGET_METHOD;
        Header header2 = new Header("GET", byteString);
        Header header3 = new Header("POST", byteString);
        ByteString byteString2 = Header.TARGET_PATH;
        Header header4 = new Header("/", byteString2);
        Header header5 = new Header("/index.html", byteString2);
        ByteString byteString3 = Header.TARGET_SCHEME;
        Header header6 = new Header("http", byteString3);
        Header header7 = new Header("https", byteString3);
        ByteString byteString4 = Header.RESPONSE_STATUS;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header("200", byteString4), new Header("204", byteString4), new Header("206", byteString4), new Header("304", byteString4), new Header("400", byteString4), new Header("404", byteString4), new Header("500", byteString4), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header(InquiryField.DateField.TYPE, ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        STATIC_HEADER_TABLE = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(headerArr[i].name, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        NAME_TO_FIRST_INDEX = unmodifiableMap;
    }

    public static void checkLowercase(ByteString byteString) {
        byteString.getClass();
        int size$okio = byteString.getSize$okio();
        for (int i = 0; i < size$okio; i++) {
            byte internalGet$okio = byteString.internalGet$okio(i);
            if (65 <= internalGet$okio && internalGet$okio < 91) {
                a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.utf8()));
                return;
            }
        }
    }
}
