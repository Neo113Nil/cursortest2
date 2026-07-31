package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class N8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile N8[] f37997b;

    /* renamed from: a, reason: collision with root package name */
    public K8 f37998a;

    public N8() {
        a();
    }

    public static N8[] b() {
        if (f37997b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37997b == null) {
                        f37997b = new N8[0];
                    }
                } finally {
                }
            }
        }
        return f37997b;
    }

    public final N8 a() {
        this.f37998a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        K8 k8 = this.f37998a;
        return k8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        K8 k8 = this.f37998a;
        if (k8 != null) {
            codedOutputByteBufferNano.writeMessage(1, k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f37998a == null) {
                    this.f37998a = new K8();
                }
                codedInputByteBufferNano.readMessage(this.f37998a);
            }
        }
        return this;
    }

    public static N8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new N8().mergeFrom(codedInputByteBufferNano);
    }

    public static N8 a(byte[] bArr) {
        return (N8) MessageNano.mergeFrom(new N8(), bArr);
    }
}
