package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3074wm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C3074wm[] f40098b;

    /* renamed from: a, reason: collision with root package name */
    public long f40099a;

    public C3074wm() {
        a();
    }

    public static C3074wm[] b() {
        if (f40098b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40098b == null) {
                        f40098b = new C3074wm[0];
                    }
                } finally {
                }
            }
        }
        return f40098b;
    }

    public final C3074wm a() {
        this.f40099a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f40099a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f40099a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3074wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f40099a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C3074wm a(byte[] bArr) {
        return (C3074wm) MessageNano.mergeFrom(new C3074wm(), bArr);
    }

    public static C3074wm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3074wm().mergeFrom(codedInputByteBufferNano);
    }
}
