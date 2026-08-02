package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Q extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Q[] f9004d;

    /* renamed from: a, reason: collision with root package name */
    public N f9005a;

    /* renamed from: b, reason: collision with root package name */
    public P f9006b;

    /* renamed from: c, reason: collision with root package name */
    public O f9007c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f9004d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9004d == null) {
                        f9004d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f9004d;
    }

    public final Q a() {
        this.f9005a = null;
        this.f9006b = null;
        this.f9007c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        N n3 = this.f9005a;
        if (n3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n3);
        }
        P p3 = this.f9006b;
        if (p3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p3);
        }
        O o = this.f9007c;
        return o != null ? CodedOutputByteBufferNano.computeMessageSize(3, o) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n3 = this.f9005a;
        if (n3 != null) {
            codedOutputByteBufferNano.writeMessage(1, n3);
        }
        P p3 = this.f9006b;
        if (p3 != null) {
            codedOutputByteBufferNano.writeMessage(2, p3);
        }
        O o = this.f9007c;
        if (o != null) {
            codedOutputByteBufferNano.writeMessage(3, o);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f9005a == null) {
                    this.f9005a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f9005a);
            } else if (readTag == 18) {
                if (this.f9006b == null) {
                    this.f9006b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f9006b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f9007c == null) {
                    this.f9007c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f9007c);
            }
        }
        return this;
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
