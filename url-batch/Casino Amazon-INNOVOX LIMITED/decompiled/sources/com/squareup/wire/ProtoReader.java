package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: ProtoReader.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0007H\u0007J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\u0015H\u0016J\r\u0010!\u001a\u00020\"H\u0010¢\u0006\u0002\b#J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\nH\u0002J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020\nH\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\nH\u0002J\b\u0010-\u001a\u00020\u0007H\u0002J%\u0010.\u001a\u00020\u00152\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000100H\u0087\bø\u0001\u0000¢\u0006\u0002\b1J\u0010\u00102\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\nH\u0016J\"\u00103\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u00105\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"Lcom/squareup/wire/ProtoReader;", "", "source", "Lokio/BufferedSource;", "<init>", "(Lokio/BufferedSource;)V", "pos", "", "limit", "recursionDepth", "", "state", "tag", "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "bufferStack", "", "Lokio/Buffer;", "beginMessage", "endMessageAndGetUnknownFields", "Lokio/ByteString;", "token", "endMessage", "", "nextLengthDelimited", "internalNextLengthDelimited", "nextTag", "peekFieldEncoding", "skip", "skipGroup", "expectedEndTag", "readBytes", "beforePossiblyPackedScalar", "", "beforePossiblyPackedScalar$wire_runtime", "readString", "", "readVarint32", "internalReadVarint32", "readVarint64", "readFixed32", "readFixed64", "afterPackableScalar", "fieldEncoding", "beforeLengthDelimitedScalar", "forEachTag", "tagHandler", "Lkotlin/Function1;", "-forEachTag", "readUnknownField", "addUnknownField", "value", "nextFieldMinLengthInBytes", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ProtoReader {
    public static final int FIELD_ENCODING_MASK = 7;
    public static final int RECURSION_LIMIT = 100;
    public static final int STATE_END_GROUP = 4;
    public static final int STATE_FIXED32 = 5;
    public static final int STATE_FIXED64 = 1;
    public static final int STATE_LENGTH_DELIMITED = 2;
    public static final int STATE_PACKED_TAG = 7;
    public static final int STATE_START_GROUP = 3;
    public static final int STATE_TAG = 6;
    public static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private final List<Buffer> bufferStack;
    private long limit;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;
    private final BufferedSource source;
    private int state;
    private int tag;

    /* compiled from: ProtoReader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProtoReader(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()".toString());
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new Buffer());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public ByteString endMessageAndGetUnknownFields(long token) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()".toString());
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()".toString());
        }
        if (this.pos != this.limit && i != 0) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        this.limit = token;
        Buffer buffer = this.bufferStack.get(i);
        if (buffer.size() > 0) {
            return buffer.readByteString();
        }
        return ByteString.EMPTY;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "prefer endMessageAndGetUnknownFields()", replaceWith = @ReplaceWith(expression = "endMessageAndGetUnknownFields(token)", imports = {}))
    public final void endMessage(long token) throws IOException {
        endMessageAndGetUnknownFields(token);
    }

    public int nextLengthDelimited() throws IOException {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()".toString());
    }

    private final int internalNextLengthDelimited() {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int internalReadVarint32 = internalReadVarint32();
        if (internalReadVarint32 < 0) {
            throw new ProtocolException("Negative length: " + internalReadVarint32);
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        long j = this.limit;
        this.pushedLimit = j;
        long j2 = this.pos + internalReadVarint32;
        this.limit = j2;
        if (j2 <= j) {
            return internalReadVarint32;
        }
        throw new EOFException();
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.exhausted()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = internalReadVarint32 >> 3;
            this.tag = i2;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return this.tag;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return this.tag;
            }
            if (i3 == 2) {
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return this.tag;
                }
                throw new ProtocolException("Unexpected field encoding: " + i3);
            }
            skipGroup(i2);
        }
        return -1;
    }

    /* renamed from: peekFieldEncoding, reason: from getter */
    public FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i == 5) {
                readFixed32();
                return;
            }
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }

    private final void skipGroup(int expectedEndTag) {
        while (this.pos < this.limit && !this.source.exhausted()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i = internalReadVarint32 >> 3;
            int i2 = internalReadVarint32 & 7;
            if (i2 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i2 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i2 == 2) {
                long internalReadVarint322 = internalReadVarint32();
                this.pos += internalReadVarint322;
                this.source.skip(internalReadVarint322);
            } else {
                if (i2 == 3) {
                    int i3 = this.recursionDepth + 1;
                    this.recursionDepth = i3;
                    if (i3 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i2 == 4) {
                    if (i != expectedEndTag) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else if (i2 == 5) {
                    this.state = 5;
                    readFixed32();
                } else {
                    throw new ProtocolException("Unexpected field encoding: " + i2);
                }
            }
        }
        throw new EOFException();
    }

    public ByteString readBytes() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(beforeLengthDelimitedScalar);
        return this.source.readByteString(beforeLengthDelimitedScalar);
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1L;
                this.state = 6;
                return false;
            }
            if (i != 5) {
                throw new ProtocolException("unexpected state: " + this.state);
            }
        }
        return true;
    }

    public String readString() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(beforeLengthDelimitedScalar);
        return this.source.readUtf8(beforeLengthDelimitedScalar);
    }

    public int readVarint32() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        int internalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return internalReadVarint32;
    }

    private final int internalReadVarint32() {
        int i;
        this.source.require(1L);
        this.pos++;
        byte readByte = this.source.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.source.require(1L);
        this.pos++;
        byte readByte2 = this.source.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.source.require(1L);
            this.pos++;
            byte readByte3 = this.source.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.source.require(1L);
                this.pos++;
                byte readByte4 = this.source.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.source.require(1L);
                    this.pos++;
                    byte readByte5 = this.source.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            this.source.require(1L);
                            this.pos++;
                            if (this.source.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i2 | i;
    }

    public long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.source.require(1L);
            this.pos++;
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((this.source.readByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(4L);
        this.pos += 4;
        int readIntLe = this.source.readIntLe();
        afterPackableScalar(5);
        return readIntLe;
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(8L);
        this.pos += 8;
        long readLongLe = this.source.readLongLe();
        afterPackableScalar(1);
        return readLongLe;
    }

    private final void afterPackableScalar(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j == j2) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1L;
            this.state = 6;
            return;
        }
        this.state = 7;
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j = this.limit - this.pos;
        this.source.require(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    /* renamed from: -forEachTag, reason: not valid java name */
    public final ByteString m3850forEachTag(Function1<? super Integer, ? extends Object> tagHandler) {
        Intrinsics.checkNotNullParameter(tagHandler, "tagHandler");
        long beginMessage = beginMessage();
        while (true) {
            int nextTag = nextTag();
            if (nextTag != -1) {
                tagHandler.invoke(Integer.valueOf(nextTag));
            } else {
                return endMessageAndGetUnknownFields(beginMessage);
            }
        }
    }

    public void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        Intrinsics.checkNotNull(nextFieldEncoding);
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    public void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Intrinsics.checkNotNull(rawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        rawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
    }

    public long nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i == 1) {
            return this.limit - this.pos;
        }
        if (i == 2) {
            return 4L;
        }
        if (i == 3) {
            return 8L;
        }
        if (i == 4) {
            return 1L;
        }
        throw new NoWhenBranchMatchedException();
    }
}
