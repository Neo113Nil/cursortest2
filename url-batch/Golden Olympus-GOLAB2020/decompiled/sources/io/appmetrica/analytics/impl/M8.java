package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class M8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile M8[] f37971c;

    /* renamed from: a, reason: collision with root package name */
    public H8 f37972a;

    /* renamed from: b, reason: collision with root package name */
    public J8 f37973b;

    public M8() {
        a();
    }

    public static M8[] b() {
        if (f37971c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37971c == null) {
                        f37971c = new M8[0];
                    }
                } finally {
                }
            }
        }
        return f37971c;
    }

    public final M8 a() {
        this.f37972a = null;
        this.f37973b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        H8 h8 = this.f37972a;
        if (h8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, h8);
        }
        J8 j8 = this.f37973b;
        return j8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, j8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        H8 h8 = this.f37972a;
        if (h8 != null) {
            codedOutputByteBufferNano.writeMessage(1, h8);
        }
        J8 j8 = this.f37973b;
        if (j8 != null) {
            codedOutputByteBufferNano.writeMessage(2, j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f37972a == null) {
                    this.f37972a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f37972a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f37973b == null) {
                    this.f37973b = new J8();
                }
                codedInputByteBufferNano.readMessage(this.f37973b);
            }
        }
        return this;
    }

    public static M8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new M8().mergeFrom(codedInputByteBufferNano);
    }

    public static M8 a(byte[] bArr) {
        return (M8) MessageNano.mergeFrom(new M8(), bArr);
    }
}
