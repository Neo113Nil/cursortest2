package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Q extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Q[] f9984d;

    /* renamed from: a, reason: collision with root package name */
    public N f9985a;

    /* renamed from: b, reason: collision with root package name */
    public P f9986b;

    /* renamed from: c, reason: collision with root package name */
    public O f9987c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f9984d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9984d == null) {
                        f9984d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f9984d;
    }

    public final Q a() {
        this.f9985a = null;
        this.f9986b = null;
        this.f9987c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        N n6 = this.f9985a;
        if (n6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n6);
        }
        P p5 = this.f9986b;
        if (p5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p5);
        }
        O o2 = this.f9987c;
        return o2 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, o2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        N n6 = this.f9985a;
        if (n6 != null) {
            codedOutputByteBufferNano.writeMessage(1, n6);
        }
        P p5 = this.f9986b;
        if (p5 != null) {
            codedOutputByteBufferNano.writeMessage(2, p5);
        }
        O o2 = this.f9987c;
        if (o2 != null) {
            codedOutputByteBufferNano.writeMessage(3, o2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f9985a == null) {
                    this.f9985a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f9985a);
            } else if (readTag == 18) {
                if (this.f9986b == null) {
                    this.f9986b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f9986b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9987c == null) {
                    this.f9987c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f9987c);
            }
        }
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
