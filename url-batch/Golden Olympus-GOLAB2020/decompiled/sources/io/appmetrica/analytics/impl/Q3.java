package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Q3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Q3[] f38152c;

    /* renamed from: a, reason: collision with root package name */
    public S3 f38153a;

    /* renamed from: b, reason: collision with root package name */
    public int f38154b;

    public Q3() {
        a();
    }

    public static Q3[] b() {
        if (f38152c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38152c == null) {
                        f38152c = new Q3[0];
                    }
                } finally {
                }
            }
        }
        return f38152c;
    }

    public final Q3 a() {
        this.f38153a = null;
        this.f38154b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        S3 s32 = this.f38153a;
        if (s32 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s32);
        }
        int i4 = this.f38154b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        S3 s32 = this.f38153a;
        if (s32 != null) {
            codedOutputByteBufferNano.writeMessage(1, s32);
        }
        int i4 = this.f38154b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f38153a == null) {
                    this.f38153a = new S3();
                }
                codedInputByteBufferNano.readMessage(this.f38153a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f38154b = readInt32;
                }
            }
        }
        return this;
    }

    public static Q3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Q3().mergeFrom(codedInputByteBufferNano);
    }

    public static Q3 a(byte[] bArr) {
        return (Q3) MessageNano.mergeFrom(new Q3(), bArr);
    }
}
