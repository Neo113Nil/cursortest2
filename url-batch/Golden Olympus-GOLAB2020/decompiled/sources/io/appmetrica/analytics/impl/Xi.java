package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Xi extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Xi[] f38528d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f38529a;

    /* renamed from: b, reason: collision with root package name */
    public Wi f38530b;

    /* renamed from: c, reason: collision with root package name */
    public Vi f38531c;

    public Xi() {
        a();
    }

    public static Xi[] b() {
        if (f38528d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38528d == null) {
                        f38528d = new Xi[0];
                    }
                } finally {
                }
            }
        }
        return f38528d;
    }

    public final Xi a() {
        this.f38529a = false;
        this.f38530b = null;
        this.f38531c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z4 = this.f38529a;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z4);
        }
        Wi wi = this.f38530b;
        if (wi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wi);
        }
        Vi vi = this.f38531c;
        return vi != null ? CodedOutputByteBufferNano.computeMessageSize(3, vi) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z4 = this.f38529a;
        if (z4) {
            codedOutputByteBufferNano.writeBool(1, z4);
        }
        Wi wi = this.f38530b;
        if (wi != null) {
            codedOutputByteBufferNano.writeMessage(2, wi);
        }
        Vi vi = this.f38531c;
        if (vi != null) {
            codedOutputByteBufferNano.writeMessage(3, vi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f38529a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f38530b == null) {
                    this.f38530b = new Wi();
                }
                codedInputByteBufferNano.readMessage(this.f38530b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f38531c == null) {
                    this.f38531c = new Vi();
                }
                codedInputByteBufferNano.readMessage(this.f38531c);
            }
        }
        return this;
    }

    public static Xi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Xi().mergeFrom(codedInputByteBufferNano);
    }

    public static Xi a(byte[] bArr) {
        return (Xi) MessageNano.mergeFrom(new Xi(), bArr);
    }
}
