package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2944rm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2944rm[] f39754b;

    /* renamed from: a, reason: collision with root package name */
    public long f39755a;

    public C2944rm() {
        a();
    }

    public static C2944rm[] b() {
        if (f39754b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39754b == null) {
                        f39754b = new C2944rm[0];
                    }
                } finally {
                }
            }
        }
        return f39754b;
    }

    public final C2944rm a() {
        this.f39755a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f39755a;
        return j4 != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j4 = this.f39755a;
        if (j4 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2944rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f39755a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C2944rm a(byte[] bArr) {
        return (C2944rm) MessageNano.mergeFrom(new C2944rm(), bArr);
    }

    public static C2944rm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2944rm().mergeFrom(codedInputByteBufferNano);
    }
}
