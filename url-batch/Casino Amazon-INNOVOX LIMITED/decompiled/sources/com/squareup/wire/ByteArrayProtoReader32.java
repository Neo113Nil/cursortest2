package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;

/* compiled from: ByteArrayProtoReader32.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0005H\u0002J\b\u0010/\u001a\u00020\u0005H\u0002J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u00101\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u0005H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020&2\u0006\u00105\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u0005H\u0002J\b\u0010;\u001a\u00020*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/squareup/wire/ByteArrayProtoReader32;", "Lcom/squareup/wire/ProtoReader32;", "source", "", "pos", "", "limit", "<init>", "([BII)V", "recursionDepth", "state", "tag", "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "bufferStack", "", "Lokio/Buffer;", "protoReader", "Lcom/squareup/wire/ProtoReader32AsProtoReader;", "asProtoReader", "Lcom/squareup/wire/ProtoReader;", "beginMessage", "endMessageAndGetUnknownFields", "Lokio/ByteString;", "token", "nextLengthDelimited", "internalNextLengthDelimited", "nextTag", "peekFieldEncoding", "skip", "", "skipGroup", "expectedEndTag", "readBytes", "beforePossiblyPackedScalar", "", "readString", "", "readVarint32", "internalReadVarint32", "readVarint64", "", "readFixed32", "readFixed64", "afterPackableScalar", "fieldEncoding", "beforeLengthDelimitedScalar", "readUnknownField", "addUnknownField", "value", "", "nextFieldMinLengthInBytes", "byteCount", "readByteString", "readUtf8", "readByte", "", "readIntLe", "readLongLe", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteArrayProtoReader32 implements ProtoReader32 {
    private final List<Buffer> bufferStack;
    private int limit;
    private FieldEncoding nextFieldEncoding;
    private int pos;
    private ProtoReader32AsProtoReader protoReader;
    private int pushedLimit;
    private int recursionDepth;
    private final byte[] source;
    private int state;
    private int tag;

    /* compiled from: ByteArrayProtoReader32.kt */
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

    public ByteArrayProtoReader32(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.pos = i;
        this.limit = i2;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1;
        this.bufferStack = new ArrayList();
    }

    public /* synthetic */ ByteArrayProtoReader32(byte[] bArr, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? bArr.length : i2);
    }

    @Override // com.squareup.wire.ProtoReader32
    public ProtoReader asProtoReader() {
        ProtoReader32AsProtoReader protoReader32AsProtoReader = this.protoReader;
        if (protoReader32AsProtoReader != null) {
            return protoReader32AsProtoReader;
        }
        ProtoReader32AsProtoReader protoReader32AsProtoReader2 = new ProtoReader32AsProtoReader(this);
        this.protoReader = protoReader32AsProtoReader2;
        return protoReader32AsProtoReader2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int beginMessage() {
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
        int i2 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString endMessageAndGetUnknownFields(int token) {
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

    @Override // com.squareup.wire.ProtoReader32
    public int nextLengthDelimited() {
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
        int i = this.limit;
        this.pushedLimit = i;
        int i2 = this.pos + internalReadVarint32;
        this.limit = i2;
        if (i2 <= i) {
            return internalReadVarint32;
        }
        throw new EOFException();
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextTag() {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit) {
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

    @Override // com.squareup.wire.ProtoReader32
    /* renamed from: peekFieldEncoding, reason: from getter */
    public FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader32
    public void skip() {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
        } else if (i == 2) {
            skip(beforeLengthDelimitedScalar());
        } else {
            if (i == 5) {
                readFixed32();
                return;
            }
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }

    private final void skipGroup(int expectedEndTag) {
        while (this.pos < this.limit) {
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
                skip(internalReadVarint32());
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

    @Override // com.squareup.wire.ProtoReader32
    public ByteString readBytes() {
        return readByteString(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public boolean beforePossiblyPackedScalar() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return false;
            }
            if (i != 5) {
                throw new ProtocolException("unexpected state: " + this.state);
            }
        }
        return true;
    }

    @Override // com.squareup.wire.ProtoReader32
    public String readString() {
        return readUtf8(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readVarint32() {
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
        byte readByte = readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        byte readByte2 = readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            byte readByte3 = readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                byte readByte4 = readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    byte readByte5 = readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (readByte() < 0) {
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

    @Override // com.squareup.wire.ProtoReader32
    public long readVarint64() {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((readByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readFixed32() {
        int i = this.state;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        int readIntLe = readIntLe();
        afterPackableScalar(5);
        return readIntLe;
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readFixed64() {
        int i = this.state;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        long readLongLe = readLongLe();
        afterPackableScalar(1);
        return readLongLe;
    }

    private final void afterPackableScalar(int fieldEncoding) {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        int i = this.pos;
        int i2 = this.limit;
        if (i > i2) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (i == i2) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
            return;
        }
        this.state = 7;
    }

    private final int beforeLengthDelimitedScalar() {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        int i = this.limit - this.pos;
        this.state = 6;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1;
        return i;
    }

    @Override // com.squareup.wire.ProtoReader32
    public void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        Intrinsics.checkNotNull(nextFieldEncoding);
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    @Override // com.squareup.wire.ProtoReader32
    public void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Intrinsics.checkNotNull(rawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        rawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i == 1) {
            return this.limit - this.pos;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        if (i == 4) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void skip(int byteCount) {
        int i = this.pos + byteCount;
        if (i > this.limit) {
            throw new EOFException();
        }
        this.pos = i;
    }

    private final ByteString readByteString(int byteCount) {
        int i = this.pos + byteCount;
        if (i > this.limit) {
            throw new EOFException();
        }
        ByteString of = ByteString.INSTANCE.of(this.source, this.pos, byteCount);
        this.pos = i;
        return of;
    }

    private final String readUtf8(int byteCount) {
        int i = this.pos;
        int i2 = i + byteCount;
        if (i2 > this.limit) {
            throw new EOFException();
        }
        String decodeToString$default = StringsKt.decodeToString$default(this.source, i, i2, false, 4, null);
        this.pos = i2;
        return decodeToString$default;
    }

    private final byte readByte() {
        int i = this.pos;
        if (i == this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        this.pos = i + 1;
        return bArr[i];
    }

    private final int readIntLe() {
        int i = this.pos;
        if (i + 4 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        int i2 = i + 1;
        this.pos = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.pos = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        int i6 = i + 3;
        this.pos = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 16);
        this.pos = i + 4;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | i7;
    }

    private final long readLongLe() {
        int i = this.pos;
        if (i + 8 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        this.pos = i + 1;
        this.pos = i + 2;
        this.pos = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.pos = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.pos = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.pos = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.pos = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.pos = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }
}
