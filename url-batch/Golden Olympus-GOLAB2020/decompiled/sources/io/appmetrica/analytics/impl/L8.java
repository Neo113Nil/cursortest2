package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class L8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile L8[] f37915c;

    /* renamed from: a, reason: collision with root package name */
    public H8 f37916a;

    /* renamed from: b, reason: collision with root package name */
    public K8 f37917b;

    public L8() {
        a();
    }

    public static L8[] b() {
        if (f37915c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37915c == null) {
                        f37915c = new L8[0];
                    }
                } finally {
                }
            }
        }
        return f37915c;
    }

    public final L8 a() {
        this.f37916a = null;
        this.f37917b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        H8 h8 = this.f37916a;
        if (h8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, h8);
        }
        K8 k8 = this.f37917b;
        return k8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        H8 h8 = this.f37916a;
        if (h8 != null) {
            codedOutputByteBufferNano.writeMessage(1, h8);
        }
        K8 k8 = this.f37917b;
        if (k8 != null) {
            codedOutputByteBufferNano.writeMessage(2, k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f37916a == null) {
                    this.f37916a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f37916a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f37917b == null) {
                    this.f37917b = new K8();
                }
                codedInputByteBufferNano.readMessage(this.f37917b);
            }
        }
        return this;
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new L8().mergeFrom(codedInputByteBufferNano);
    }

    public static L8 a(byte[] bArr) {
        return (L8) MessageNano.mergeFrom(new L8(), bArr);
    }
}
