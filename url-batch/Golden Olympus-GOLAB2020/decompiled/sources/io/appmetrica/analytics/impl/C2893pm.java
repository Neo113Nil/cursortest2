package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2893pm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2893pm[] f39631b;

    /* renamed from: a, reason: collision with root package name */
    public long f39632a;

    public C2893pm() {
        a();
    }

    public static C2893pm[] b() {
        if (f39631b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39631b == null) {
                        f39631b = new C2893pm[0];
                    }
                } finally {
                }
            }
        }
        return f39631b;
    }

    public final C2893pm a() {
        this.f39632a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f39632a;
        return j4 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j4 = this.f39632a;
        if (j4 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2893pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39632a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C2893pm a(byte[] bArr) {
        return (C2893pm) MessageNano.mergeFrom(new C2893pm(), bArr);
    }

    public static C2893pm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2893pm().mergeFrom(codedInputByteBufferNano);
    }
}
