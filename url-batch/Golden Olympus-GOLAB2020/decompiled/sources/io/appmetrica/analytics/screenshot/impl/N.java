package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class N extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile N[] f40712d;

    /* renamed from: a, reason: collision with root package name */
    public K f40713a;

    /* renamed from: b, reason: collision with root package name */
    public M f40714b;

    /* renamed from: c, reason: collision with root package name */
    public L f40715c;

    public N() {
        a();
    }

    public static N[] b() {
        if (f40712d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40712d == null) {
                        f40712d = new N[0];
                    }
                } finally {
                }
            }
        }
        return f40712d;
    }

    public final N a() {
        this.f40713a = null;
        this.f40714b = null;
        this.f40715c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        K k4 = this.f40713a;
        if (k4 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, k4);
        }
        M m4 = this.f40714b;
        if (m4 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, m4);
        }
        L l4 = this.f40715c;
        return l4 != null ? CodedOutputByteBufferNano.computeMessageSize(3, l4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        K k4 = this.f40713a;
        if (k4 != null) {
            codedOutputByteBufferNano.writeMessage(1, k4);
        }
        M m4 = this.f40714b;
        if (m4 != null) {
            codedOutputByteBufferNano.writeMessage(2, m4);
        }
        L l4 = this.f40715c;
        if (l4 != null) {
            codedOutputByteBufferNano.writeMessage(3, l4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f40713a == null) {
                    this.f40713a = new K();
                }
                codedInputByteBufferNano.readMessage(this.f40713a);
            } else if (readTag == 18) {
                if (this.f40714b == null) {
                    this.f40714b = new M();
                }
                codedInputByteBufferNano.readMessage(this.f40714b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f40715c == null) {
                    this.f40715c = new L();
                }
                codedInputByteBufferNano.readMessage(this.f40715c);
            }
        }
        return this;
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new N().mergeFrom(codedInputByteBufferNano);
    }

    public static N a(byte[] bArr) {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }
}
