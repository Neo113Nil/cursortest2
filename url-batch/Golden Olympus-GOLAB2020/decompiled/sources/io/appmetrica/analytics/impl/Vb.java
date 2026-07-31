package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Vb extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Vb[] f38416f;

    /* renamed from: a, reason: collision with root package name */
    public String f38417a;

    /* renamed from: b, reason: collision with root package name */
    public String f38418b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38419c;

    /* renamed from: d, reason: collision with root package name */
    public String f38420d;

    /* renamed from: e, reason: collision with root package name */
    public String f38421e;

    public Vb() {
        a();
    }

    public static Vb[] b() {
        if (f38416f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38416f == null) {
                        f38416f = new Vb[0];
                    }
                } finally {
                }
            }
        }
        return f38416f;
    }

    public final Vb a() {
        this.f38417a = "";
        this.f38418b = "";
        this.f38419c = false;
        this.f38420d = "";
        this.f38421e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f38417a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f38417a);
        }
        if (!this.f38418b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f38418b);
        }
        boolean z4 = this.f38419c;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z4);
        }
        if (!this.f38420d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f38420d);
        }
        return !this.f38421e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f38421e) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f38417a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f38417a);
        }
        if (!this.f38418b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f38418b);
        }
        boolean z4 = this.f38419c;
        if (z4) {
            codedOutputByteBufferNano.writeBool(22, z4);
        }
        if (!this.f38420d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f38420d);
        }
        if (!this.f38421e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f38421e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Vb b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Vb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38417a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f38418b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f38419c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f38420d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38421e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Vb a(byte[] bArr) {
        return (Vb) MessageNano.mergeFrom(new Vb(), bArr);
    }
}
