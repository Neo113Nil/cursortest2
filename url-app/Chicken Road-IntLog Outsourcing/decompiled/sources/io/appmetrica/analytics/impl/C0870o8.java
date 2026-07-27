package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870o8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0870o8[] f8911c;

    /* renamed from: a, reason: collision with root package name */
    public int f8912a;

    /* renamed from: b, reason: collision with root package name */
    public C0766k8 f8913b;

    public C0870o8() {
        a();
    }

    public static C0870o8[] b() {
        if (f8911c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8911c == null) {
                        f8911c = new C0870o8[0];
                    }
                } finally {
                }
            }
        }
        return f8911c;
    }

    public final C0870o8 a() {
        this.f8912a = 0;
        this.f8913b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f8912a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        C0766k8 c0766k8 = this.f8913b;
        return c0766k8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0766k8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f8912a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        C0766k8 c0766k8 = this.f8913b;
        if (c0766k8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0766k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0870o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f8912a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f8913b == null) {
                    this.f8913b = new C0766k8();
                }
                codedInputByteBufferNano.readMessage(this.f8913b);
            }
        }
    }

    public static C0870o8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0870o8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0870o8 a(byte[] bArr) {
        return (C0870o8) MessageNano.mergeFrom(new C0870o8(), bArr);
    }
}
