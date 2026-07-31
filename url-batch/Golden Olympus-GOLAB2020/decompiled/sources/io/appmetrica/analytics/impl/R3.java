package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class R3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile R3[] f38181c;

    /* renamed from: a, reason: collision with root package name */
    public String f38182a;

    /* renamed from: b, reason: collision with root package name */
    public String f38183b;

    public R3() {
        a();
    }

    public static R3[] b() {
        if (f38181c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38181c == null) {
                        f38181c = new R3[0];
                    }
                } finally {
                }
            }
        }
        return f38181c;
    }

    public final R3 a() {
        this.f38182a = "";
        this.f38183b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f38182a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f38182a);
        }
        return !this.f38183b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f38183b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f38182a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f38182a);
        }
        if (!this.f38183b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f38183b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38182a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38183b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static R3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new R3().mergeFrom(codedInputByteBufferNano);
    }

    public static R3 a(byte[] bArr) {
        return (R3) MessageNano.mergeFrom(new R3(), bArr);
    }
}
