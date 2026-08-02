package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Ki extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Ki[] f10533d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10534a;

    /* renamed from: b, reason: collision with root package name */
    public Ji f10535b;

    /* renamed from: c, reason: collision with root package name */
    public Ii f10536c;

    public Ki() {
        a();
    }

    public static Ki[] b() {
        if (f10533d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10533d == null) {
                        f10533d = new Ki[0];
                    }
                } finally {
                }
            }
        }
        return f10533d;
    }

    public final Ki a() {
        this.f10534a = false;
        this.f10535b = null;
        this.f10536c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f10534a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Ji ji = this.f10535b;
        if (ji != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ji);
        }
        Ii ii = this.f10536c;
        return ii != null ? CodedOutputByteBufferNano.computeMessageSize(3, ii) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f10534a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Ji ji = this.f10535b;
        if (ji != null) {
            codedOutputByteBufferNano.writeMessage(2, ji);
        }
        Ii ii = this.f10536c;
        if (ii != null) {
            codedOutputByteBufferNano.writeMessage(3, ii);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f10534a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f10535b == null) {
                    this.f10535b = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f10535b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f10536c == null) {
                    this.f10536c = new Ii();
                }
                codedInputByteBufferNano.readMessage(this.f10536c);
            }
        }
        return this;
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static Ki a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }
}
