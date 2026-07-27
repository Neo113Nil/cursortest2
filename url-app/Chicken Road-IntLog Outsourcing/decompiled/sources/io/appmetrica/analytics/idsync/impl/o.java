package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class o extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6435c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6436d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static volatile o[] f6437e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6438a;

    /* renamed from: b, reason: collision with root package name */
    public n f6439b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f6437e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6437e == null) {
                        f6437e = new o[0];
                    }
                } finally {
                }
            }
        }
        return f6437e;
    }

    public final o a() {
        this.f6438a = false;
        this.f6439b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f6438a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        n nVar = this.f6439b;
        return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, nVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f6438a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        n nVar = this.f6439b;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(2, nVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6438a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6439b == null) {
                    this.f6439b = new n();
                }
                codedInputByteBufferNano.readMessage(this.f6439b);
            }
        }
    }

    public static o b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new o().mergeFrom(codedInputByteBufferNano);
    }

    public static o a(byte[] bArr) {
        return (o) MessageNano.mergeFrom(new o(), bArr);
    }
}
