package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987sm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0987sm[] f9266b;

    /* renamed from: a, reason: collision with root package name */
    public long f9267a;

    public C0987sm() {
        a();
    }

    public static C0987sm[] b() {
        if (f9266b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9266b == null) {
                        f9266b = new C0987sm[0];
                    }
                } finally {
                }
            }
        }
        return f9266b;
    }

    public final C0987sm a() {
        this.f9267a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f9267a;
        return j2 != 10000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f9267a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0987sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f9267a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C0987sm a(byte[] bArr) {
        return (C0987sm) MessageNano.mergeFrom(new C0987sm(), bArr);
    }

    public static C0987sm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0987sm().mergeFrom(codedInputByteBufferNano);
    }
}
