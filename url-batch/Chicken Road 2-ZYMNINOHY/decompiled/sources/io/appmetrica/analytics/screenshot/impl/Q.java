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
    public static volatile Q[] f13433d;

    /* renamed from: a, reason: collision with root package name */
    public N f13434a;

    /* renamed from: b, reason: collision with root package name */
    public P f13435b;

    /* renamed from: c, reason: collision with root package name */
    public O f13436c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f13433d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13433d == null) {
                        f13433d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f13433d;
    }

    public final Q a() {
        this.f13434a = null;
        this.f13435b = null;
        this.f13436c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        N n = this.f13434a;
        if (n != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n);
        }
        P p2 = this.f13435b;
        if (p2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p2);
        }
        O o = this.f13436c;
        return o != null ? CodedOutputByteBufferNano.computeMessageSize(3, o) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n = this.f13434a;
        if (n != null) {
            codedOutputByteBufferNano.writeMessage(1, n);
        }
        P p2 = this.f13435b;
        if (p2 != null) {
            codedOutputByteBufferNano.writeMessage(2, p2);
        }
        O o = this.f13436c;
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
                if (this.f13434a == null) {
                    this.f13434a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f13434a);
            } else if (readTag == 18) {
                if (this.f13435b == null) {
                    this.f13435b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f13435b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f13436c == null) {
                    this.f13436c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f13436c);
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
