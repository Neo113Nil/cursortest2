package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039um extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1039um[] f9418b;

    /* renamed from: a, reason: collision with root package name */
    public long f9419a;

    public C1039um() {
        a();
    }

    public static C1039um[] b() {
        if (f9418b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9418b == null) {
                        f9418b = new C1039um[0];
                    }
                } finally {
                }
            }
        }
        return f9418b;
    }

    public final C1039um a() {
        this.f9419a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f9419a;
        return j2 != 864000000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f9419a;
        if (j2 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1039um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9419a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C1039um a(byte[] bArr) {
        return (C1039um) MessageNano.mergeFrom(new C1039um(), bArr);
    }

    public static C1039um b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1039um().mergeFrom(codedInputByteBufferNano);
    }
}
