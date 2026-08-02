package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class t extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile t[] f9477c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9478a;

    /* renamed from: b, reason: collision with root package name */
    public s f9479b;

    public t() {
        a();
    }

    public static t[] b() {
        if (f9477c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9477c == null) {
                        f9477c = new t[0];
                    }
                } finally {
                }
            }
        }
        return f9477c;
    }

    public final t a() {
        this.f9478a = true;
        this.f9479b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9478a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        s sVar = this.f9479b;
        return sVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, sVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f9478a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        s sVar = this.f9479b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9478a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f9479b == null) {
                    this.f9479b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f9479b);
            }
        }
        return this;
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
