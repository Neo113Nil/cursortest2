package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class M extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile M[] f40709c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f40710a;

    /* renamed from: b, reason: collision with root package name */
    public long f40711b;

    public M() {
        a();
    }

    public static M[] b() {
        if (f40709c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40709c == null) {
                        f40709c = new M[0];
                    }
                } finally {
                }
            }
        }
        return f40709c;
    }

    public final M a() {
        this.f40710a = true;
        this.f40711b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z4 = this.f40710a;
        if (!z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z4);
        }
        long j4 = this.f40711b;
        return j4 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z4 = this.f40710a;
        if (!z4) {
            codedOutputByteBufferNano.writeBool(1, z4);
        }
        long j4 = this.f40711b;
        if (j4 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f40710a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f40711b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static M b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new M().mergeFrom(codedInputByteBufferNano);
    }

    public static M a(byte[] bArr) {
        return (M) MessageNano.mergeFrom(new M(), bArr);
    }
}
