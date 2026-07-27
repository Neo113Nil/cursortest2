package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740j8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0740j8[] f8522b;

    /* renamed from: a, reason: collision with root package name */
    public C0766k8 f8523a;

    public C0740j8() {
        a();
    }

    public static C0740j8[] b() {
        if (f8522b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8522b == null) {
                        f8522b = new C0740j8[0];
                    }
                } finally {
                }
            }
        }
        return f8522b;
    }

    public final C0740j8 a() {
        this.f8523a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0766k8 c0766k8 = this.f8523a;
        return c0766k8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c0766k8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0766k8 c0766k8 = this.f8523a;
        if (c0766k8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0766k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0740j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f8523a == null) {
                    this.f8523a = new C0766k8();
                }
                codedInputByteBufferNano.readMessage(this.f8523a);
            }
        }
    }

    public static C0740j8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0740j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0740j8 a(byte[] bArr) {
        return (C0740j8) MessageNano.mergeFrom(new C0740j8(), bArr);
    }
}
