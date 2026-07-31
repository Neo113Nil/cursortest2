package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class K7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile K7[] f37868d;

    /* renamed from: a, reason: collision with root package name */
    public long f37869a;

    /* renamed from: b, reason: collision with root package name */
    public long f37870b;

    /* renamed from: c, reason: collision with root package name */
    public int f37871c;

    public K7() {
        a();
    }

    public static K7[] b() {
        if (f37868d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37868d == null) {
                        f37868d = new K7[0];
                    }
                } finally {
                }
            }
        }
        return f37868d;
    }

    public final K7 a() {
        this.f37869a = -1L;
        this.f37870b = -1L;
        this.f37871c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f37869a;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        long j5 = this.f37870b;
        if (j5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j5);
        }
        int i4 = this.f37871c;
        return i4 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j4 = this.f37869a;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        long j5 = this.f37870b;
        if (j5 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j5);
        }
        int i4 = this.f37871c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f37869a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f37870b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f37871c = readInt32;
                }
            }
        }
        return this;
    }

    public static K7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new K7().mergeFrom(codedInputByteBufferNano);
    }

    public static K7 a(byte[] bArr) {
        return (K7) MessageNano.mergeFrom(new K7(), bArr);
    }
}
