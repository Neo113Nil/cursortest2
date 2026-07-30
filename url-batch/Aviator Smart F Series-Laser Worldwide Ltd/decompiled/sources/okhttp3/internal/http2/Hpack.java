package okhttp3.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.yanzhenjie.kalle.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.c;
import okio.e;
import okio.j0;
import okio.x0;

/* loaded from: classes5.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final e source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(x0 source, int i8) {
            this(source, i8, 0, 4, null);
            s.checkNotNullParameter(source, "source");
        }

        private final void adjustDynamicTableByteCount() {
            int i8 = this.maxDynamicTableByteCount;
            int i9 = this.dynamicTableByteCount;
            if (i8 < i9) {
                if (i8 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i9 - i8);
                }
            }
        }

        private final void clearDynamicTable() {
            k.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i8) {
            return this.nextHeaderIndex + 1 + i8;
        }

        private final int evictToRecoverBytes(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i9 = this.nextHeaderIndex;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    s.checkNotNull(header);
                    int i11 = header.hpackSize;
                    i8 -= i11;
                    this.dynamicTableByteCount -= i11;
                    this.headerCount--;
                    i10++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i9 + 1, headerArr, i9 + 1 + i10, this.headerCount);
                this.nextHeaderIndex += i10;
            }
            return i10;
        }

        private final ByteString getName(int i8) {
            if (isStaticHeader(i8)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i8].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i8 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    s.checkNotNull(header);
                    return header.name;
                }
            }
            throw new IOException(s.stringPlus("Header index too large ", Integer.valueOf(i8 + 1)));
        }

        private final void insertIntoDynamicTable(int i8, Header header) {
            this.headerList.add(header);
            int i9 = header.hpackSize;
            if (i8 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i8)];
                s.checkNotNull(header2);
                i9 -= header2.hpackSize;
            }
            int i10 = this.maxDynamicTableByteCount;
            if (i9 > i10) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i9) - i10);
            if (i8 == -1) {
                int i11 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i11 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i12 = this.nextHeaderIndex;
                this.nextHeaderIndex = i12 - 1;
                this.dynamicTable[i12] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i8 + dynamicTableIndex(i8) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i9;
        }

        private final boolean isStaticHeader(int i8) {
            return i8 >= 0 && i8 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i8) {
            if (isStaticHeader(i8)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i8]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i8 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    s.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(s.stringPlus("Header index too large ", Integer.valueOf(i8 + 1)));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i8) {
            insertIntoDynamicTable(-1, new Header(getName(i8), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i8) {
            this.headerList.add(new Header(getName(i8), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> list = CollectionsKt___CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final ByteString readByteString() {
            int readByte = readByte();
            boolean z7 = (readByte & 128) == 128;
            long readInt = readInt(readByte, 127);
            if (!z7) {
                return this.source.readByteString(readInt);
            }
            c cVar = new c();
            Huffman.INSTANCE.decode(this.source, readInt, cVar);
            return cVar.readByteString();
        }

        public final void readHeaders() {
            while (!this.source.exhausted()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                }
                if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new IOException(s.stringPlus("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        public final int readInt(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i9 + (readByte << i11);
                }
                i9 += (readByte & 127) << i11;
                i11 += 7;
            }
        }

        public Reader(x0 source, int i8, int i9) {
            s.checkNotNullParameter(source, "source");
            this.headerTableSizeSetting = i8;
            this.maxDynamicTableByteCount = i9;
            this.headerList = new ArrayList();
            this.source = j0.buffer(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Reader(x0 x0Var, int i8, int i9, int i10, o oVar) {
            this(x0Var, i8, (i10 & 4) != 0 ? i8 : i9);
        }
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final c out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i8, c out) {
            this(i8, false, out, 2, null);
            s.checkNotNullParameter(out, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i8 = this.maxDynamicTableByteCount;
            int i9 = this.dynamicTableByteCount;
            if (i8 < i9) {
                if (i8 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i9 - i8);
                }
            }
        }

        private final void clearDynamicTable() {
            k.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i9 = this.nextHeaderIndex;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    s.checkNotNull(header);
                    i8 -= header.hpackSize;
                    int i11 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    s.checkNotNull(header2);
                    this.dynamicTableByteCount = i11 - header2.hpackSize;
                    this.headerCount--;
                    i10++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i9 + 1, headerArr, i9 + 1 + i10, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i12 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.nextHeaderIndex += i10;
            }
            return i10;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i8 = header.hpackSize;
            int i9 = this.maxDynamicTableByteCount;
            if (i8 > i9) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i8) - i9);
            int i10 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i10 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i11 = this.nextHeaderIndex;
            this.nextHeaderIndex = i11 - 1;
            this.dynamicTable[i11] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i8;
        }

        public final void resizeHeaderTable(int i8) {
            this.headerTableSizeSetting = i8;
            int min = Math.min(i8, 16384);
            int i9 = this.maxDynamicTableByteCount;
            if (i9 == min) {
                return;
            }
            if (min < i9) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(ByteString data) {
            s.checkNotNullParameter(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.size()) {
                    c cVar = new c();
                    huffman.encode(data, cVar);
                    ByteString readByteString = cVar.readByteString();
                    writeInt(readByteString.size(), 127, 128);
                    this.out.write(readByteString);
                    return;
                }
            }
            writeInt(data.size(), 127, 0);
            this.out.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void writeHeaders(List<Header> headerBlock) {
            int i8;
            int i9;
            s.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i10 = this.smallestHeaderTableSizeSetting;
                if (i10 < this.maxDynamicTableByteCount) {
                    writeInt(i10, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Header header = headerBlock.get(i11);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i9 = intValue + 1;
                    if (2 <= i9 && i9 < 8) {
                        if (s.areEqual(hpack.getSTATIC_HEADER_TABLE()[intValue].value, byteString)) {
                            i8 = i9;
                        } else if (s.areEqual(hpack.getSTATIC_HEADER_TABLE()[i9].value, byteString)) {
                            i8 = i9;
                            i9 = intValue + 2;
                        }
                        if (i9 == -1) {
                            int i13 = this.nextHeaderIndex + 1;
                            int length = this.dynamicTable.length;
                            while (true) {
                                if (i13 >= length) {
                                    break;
                                }
                                int i14 = i13 + 1;
                                Header header2 = this.dynamicTable[i13];
                                s.checkNotNull(header2);
                                if (s.areEqual(header2.name, asciiLowercase)) {
                                    Header header3 = this.dynamicTable[i13];
                                    s.checkNotNull(header3);
                                    if (s.areEqual(header3.value, byteString)) {
                                        i9 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i13 - this.nextHeaderIndex);
                                        break;
                                    } else if (i8 == -1) {
                                        i8 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i13 - this.nextHeaderIndex);
                                    }
                                }
                                i13 = i14;
                            }
                        }
                        if (i9 == -1) {
                            writeInt(i9, 127, 128);
                        } else if (i8 == -1) {
                            this.out.writeByte(64);
                            writeByteString(asciiLowercase);
                            writeByteString(byteString);
                            insertIntoDynamicTable(header);
                        } else if (!asciiLowercase.startsWith(Header.PSEUDO_PREFIX) || s.areEqual(Header.TARGET_AUTHORITY, asciiLowercase)) {
                            writeInt(i8, 63, 64);
                            writeByteString(byteString);
                            insertIntoDynamicTable(header);
                        } else {
                            writeInt(i8, 15, 0);
                            writeByteString(byteString);
                        }
                        i11 = i12;
                    }
                    i8 = i9;
                } else {
                    i8 = -1;
                }
                i9 = -1;
                if (i9 == -1) {
                }
                if (i9 == -1) {
                }
                i11 = i12;
            }
        }

        public final void writeInt(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.out.writeByte(i8 | i10);
                return;
            }
            this.out.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.out.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.out.writeByte(i11);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(c out) {
            this(0, false, out, 3, null);
            s.checkNotNullParameter(out, "out");
        }

        public Writer(int i8, boolean z7, c out) {
            s.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i8;
            this.useCompression = z7;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i8;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Writer(int i8, boolean z7, c cVar, int i9, o oVar) {
            this((i9 & 1) != 0 ? 4096 : i8, (i9 & 2) != 0 ? true : z7, cVar);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(byteString, HttpManager.HTTP_GET), new Header(byteString, HttpManager.HTTP_POST), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, "https"), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", i.VALUE_ACCEPT_ENCODING), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header(FileDownloadModel.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header(TypedValues.TransitionType.S_FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header(SessionDescription.ATTR_RANGE, ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i8].name)) {
                linkedHashMap.put(headerArr2[i8].name, Integer.valueOf(i8));
            }
            i8 = i9;
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        s.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final ByteString checkLowercase(ByteString name) {
        s.checkNotNullParameter(name, "name");
        int size = name.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            byte b8 = name.getByte(i8);
            if (65 <= b8 && b8 <= 90) {
                throw new IOException(s.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", name.utf8()));
            }
            i8 = i9;
        }
        return name;
    }

    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
