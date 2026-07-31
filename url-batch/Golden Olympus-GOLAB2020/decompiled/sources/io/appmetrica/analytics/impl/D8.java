package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class D8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile D8[] f37350b;

    /* renamed from: a, reason: collision with root package name */
    public B8 f37351a;

    public D8() {
        a();
    }

    public static D8[] b() {
        if (f37350b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37350b == null) {
                        f37350b = new D8[0];
                    }
                } finally {
                }
            }
        }
        return f37350b;
    }

    public final D8 a() {
        this.f37351a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        B8 b8 = this.f37351a;
        return b8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, b8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        B8 b8 = this.f37351a;
        if (b8 != null) {
            codedOutputByteBufferNano.writeMessage(1, b8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f37351a == null) {
                    this.f37351a = new B8();
                }
                codedInputByteBufferNano.readMessage(this.f37351a);
            }
        }
        return this;
    }

    public static D8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new D8().mergeFrom(codedInputByteBufferNano);
    }

    public static D8 a(byte[] bArr) {
        return (D8) MessageNano.mergeFrom(new D8(), bArr);
    }
}
