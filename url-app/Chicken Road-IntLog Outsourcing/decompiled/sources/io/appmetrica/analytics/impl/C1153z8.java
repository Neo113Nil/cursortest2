package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153z8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1153z8[] f9623b;

    /* renamed from: a, reason: collision with root package name */
    public C1077w8 f9624a;

    public C1153z8() {
        a();
    }

    public static C1153z8[] b() {
        if (f9623b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9623b == null) {
                        f9623b = new C1153z8[0];
                    }
                } finally {
                }
            }
        }
        return f9623b;
    }

    public final C1153z8 a() {
        this.f9624a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1077w8 c1077w8 = this.f9624a;
        return c1077w8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c1077w8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C1077w8 c1077w8 = this.f9624a;
        if (c1077w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1077w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1153z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f9624a == null) {
                    this.f9624a = new C1077w8();
                }
                codedInputByteBufferNano.readMessage(this.f9624a);
            }
        }
    }

    public static C1153z8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1153z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1153z8 a(byte[] bArr) {
        return (C1153z8) MessageNano.mergeFrom(new C1153z8(), bArr);
    }
}
