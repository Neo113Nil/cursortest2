package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class D3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile D3[] f6663c;

    /* renamed from: a, reason: collision with root package name */
    public String f6664a;

    /* renamed from: b, reason: collision with root package name */
    public String f6665b;

    public D3() {
        a();
    }

    public static D3[] b() {
        if (f6663c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6663c == null) {
                        f6663c = new D3[0];
                    }
                } finally {
                }
            }
        }
        return f6663c;
    }

    public final D3 a() {
        this.f6664a = "";
        this.f6665b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6664a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6664a);
        }
        return !this.f6665b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f6665b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6664a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6664a);
        }
        if (!this.f6665b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6665b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6664a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6665b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static D3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new D3().mergeFrom(codedInputByteBufferNano);
    }

    public static D3 a(byte[] bArr) {
        return (D3) MessageNano.mergeFrom(new D3(), bArr);
    }
}
