package com.squareup.wire;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class ProtoReader {
    public final ArrayList bufferStack;
    public long limit;
    public FieldEncoding nextFieldEncoding;
    public long pos;
    public long pushedLimit;
    public int recursionDepth;
    public final BufferedSource source;
    public int state;
    public int tag;

    public ProtoReader(BufferedSource bufferedSource) {
        bufferedSource.getClass();
        this.source = bufferedSource;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    public void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
        ProtoWriter protoWriter = new ProtoWriter((BufferedSink) this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        rawProtoAdapter.getClass();
        rawProtoAdapter.encodeWithTag(protoWriter, i, obj);
    }

    public final void afterPackableScalar(int i) {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j <= j2) {
            if (j != j2) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1L;
            this.state = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public final long beforeLengthDelimitedScalar() {
        if (this.state != 2) {
            StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
        }
        long j = this.limit - this.pos;
        this.source.require(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 5) {
                    StringBuilder sb = new StringBuilder("unexpected state: ");
                    sb.append(this.state);
                    sb.append(". Reader position: ");
                    sb.append(this.pos);
                    sb.append(". Last read tag: ");
                    throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
                }
            } else if (this.pos >= this.limit) {
                this.limit = this.pushedLimit;
                this.pushedLimit = -1L;
                this.state = 6;
                return false;
            }
        }
        return true;
    }

    public long beginMessage() {
        if (this.state != 2) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to beginMessage()");
            return 0L;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            a$$ExternalSyntheticBUOutline0.m$4("Wire recursion limit exceeded");
            return 0L;
        }
        ArrayList arrayList = this.bufferStack;
        if (i > arrayList.size()) {
            arrayList.add(new Buffer());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public ByteString endMessageAndGetUnknownFields(long j) {
        if (this.state != 6) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to endMessage()");
            return null;
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            a$$ExternalSyntheticBUOutline0.m$1("No corresponding call to beginMessage()");
            return null;
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = j;
            Buffer buffer = (Buffer) this.bufferStack.get(i);
            long j2 = buffer.size;
            return j2 > 0 ? buffer.readByteString(j2) : ByteString.EMPTY;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public final int internalReadVarint32() {
        int i;
        BufferedSource bufferedSource = this.source;
        bufferedSource.require(1L);
        this.pos++;
        byte readByte = bufferedSource.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        bufferedSource.require(1L);
        this.pos++;
        byte readByte2 = bufferedSource.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            bufferedSource.require(1L);
            this.pos++;
            byte readByte3 = bufferedSource.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                bufferedSource.require(1L);
                this.pos++;
                byte readByte4 = bufferedSource.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    bufferedSource.require(1L);
                    this.pos++;
                    byte readByte5 = bufferedSource.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            bufferedSource.require(1L);
                            this.pos++;
                            if (bufferedSource.readByte() < 0) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Malformed VARINT. Reader position: ");
                        sb.append(this.pos);
                        sb.append(". Last read tag: ");
                        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i | i2;
    }

    public int nextTag() {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit && !this.source.exhausted()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
            }
            int i2 = internalReadVarint32 >>> 3;
            this.tag = i2;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int internalReadVarint322 = internalReadVarint32();
                if (internalReadVarint322 < 0) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(internalReadVarint322, "Negative length: ", ". Reader position: ");
                    m2m.append(this.pos);
                    m2m.append(". Last read tag: ");
                    throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m2m, this.tag, '.'));
                }
                if (this.pushedLimit != -1) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return 0;
                }
                long j = this.limit;
                this.pushedLimit = j;
                long j2 = this.pos + internalReadVarint322;
                this.limit = j2;
                if (j2 <= j) {
                    return this.tag;
                }
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    sb2.append(this.pos);
                    sb2.append(". Last read tag: ");
                    throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, this.tag, '.'));
                }
                if (i3 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i2;
                }
                StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "Unexpected field encoding: ", ". Reader position: ");
                m2m2.append(this.pos);
                m2m2.append(". Last read tag: ");
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m2m2, this.tag, '.'));
            }
            skipGroup(i2);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public ByteString readBytes() {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        BufferedSource bufferedSource = this.source;
        bufferedSource.require(beforeLengthDelimitedScalar);
        return bufferedSource.readByteString(beforeLengthDelimitedScalar);
    }

    public int readFixed32() {
        int i = this.state;
        if (i == 5 || i == 2) {
            BufferedSource bufferedSource = this.source;
            bufferedSource.require(4L);
            this.pos += 4;
            int readIntLe = bufferedSource.readIntLe();
            afterPackableScalar(5);
            return readIntLe;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
    }

    public long readFixed64() {
        int i = this.state;
        if (i == 1 || i == 2) {
            BufferedSource bufferedSource = this.source;
            bufferedSource.require(8L);
            this.pos += 8;
            long readLongLe = bufferedSource.readLongLe();
            afterPackableScalar(1);
            return readLongLe;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
    }

    public String readString() {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        BufferedSource bufferedSource = this.source;
        bufferedSource.require(beforeLengthDelimitedScalar);
        return bufferedSource.readUtf8(beforeLengthDelimitedScalar);
    }

    public void readUnknownField(int i) {
        FieldEncoding peekFieldEncoding = peekFieldEncoding();
        peekFieldEncoding.getClass();
        addUnknownField(i, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(this));
    }

    public int readVarint32() {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
    }

    public long readVarint64() {
        int i = this.state;
        if (i != 0 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            BufferedSource bufferedSource = this.source;
            bufferedSource.require(1L);
            this.pos++;
            j |= (r6 & Byte.MAX_VALUE) << i2;
            if ((bufferedSource.readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("Malformed VARINT. Reader position: ");
        sb2.append(this.pos);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, this.tag, '.'));
    }

    public void skip() {
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
        } else if (i == 5) {
            readFixed32();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to skip()");
        }
    }

    public final void skipGroup(int i) {
        while (this.pos < this.limit) {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource.exhausted()) {
                break;
            }
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
            }
            int i2 = internalReadVarint32 >>> 3;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i3 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i3 == 2) {
                int internalReadVarint322 = internalReadVarint32();
                if (internalReadVarint322 < 0) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(internalReadVarint322, "Negative length: ", ". Reader position: ");
                    m2m.append(this.pos);
                    m2m.append(". Last read tag: ");
                    m2m.append(i2);
                    m2m.append('.');
                    throw new ProtocolException(m2m.toString());
                }
                long j = internalReadVarint322;
                this.pos += j;
                bufferedSource.skip(j);
            } else {
                if (i3 == 3) {
                    int i4 = this.recursionDepth + 1;
                    this.recursionDepth = i4;
                    if (i4 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i2);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i3 == 4) {
                    if (i2 == i) {
                        return;
                    }
                    throw new ProtocolException("Unexpected end group. Reader position: " + this.pos + ". Last read tag: " + i2 + '.');
                }
                if (i3 != 5) {
                    StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "Unexpected field encoding: ", ". Reader position: ");
                    m2m2.append(this.pos);
                    m2m2.append(". Last read tag: ");
                    m2m2.append(i2);
                    m2m2.append('.');
                    throw new ProtocolException(m2m2.toString());
                }
                this.state = 5;
                readFixed32();
            }
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
    }
}
