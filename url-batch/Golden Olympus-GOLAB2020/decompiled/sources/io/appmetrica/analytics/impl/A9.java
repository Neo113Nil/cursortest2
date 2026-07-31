package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class A9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f37167d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37168e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37169f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile A9[] f37170g;

    /* renamed from: a, reason: collision with root package name */
    public D9 f37171a;

    /* renamed from: b, reason: collision with root package name */
    public String f37172b;

    /* renamed from: c, reason: collision with root package name */
    public int f37173c;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (f37170g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37170g == null) {
                        f37170g = new A9[0];
                    }
                } finally {
                }
            }
        }
        return f37170g;
    }

    public final A9 a() {
        this.f37171a = null;
        this.f37172b = "";
        this.f37173c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        D9 d9 = this.f37171a;
        if (d9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, d9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f37172b) + computeSerializedSize;
        int i4 = this.f37173c;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i4) + computeStringSize : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        D9 d9 = this.f37171a;
        if (d9 != null) {
            codedOutputByteBufferNano.writeMessage(1, d9);
        }
        codedOutputByteBufferNano.writeString(2, this.f37172b);
        int i4 = this.f37173c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f37171a == null) {
                    this.f37171a = new D9();
                }
                codedInputByteBufferNano.readMessage(this.f37171a);
            } else if (readTag == 18) {
                this.f37172b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f37173c = readInt32;
                }
            }
        }
        return this;
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
