package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class t extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile t[] f5986c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5987a;

    /* renamed from: b, reason: collision with root package name */
    public s f5988b;

    public t() {
        a();
    }

    public static t[] b() {
        if (f5986c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5986c == null) {
                        f5986c = new t[0];
                    }
                } finally {
                }
            }
        }
        return f5986c;
    }

    public final t a() {
        this.f5987a = true;
        this.f5988b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f5987a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        s sVar = this.f5988b;
        return sVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, sVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f5987a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        s sVar = this.f5988b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5987a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5988b == null) {
                    this.f5988b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f5988b);
            }
        }
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
