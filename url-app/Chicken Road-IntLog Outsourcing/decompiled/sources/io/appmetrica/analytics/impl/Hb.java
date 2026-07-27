package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Hb extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Hb[] f6868f;

    /* renamed from: a, reason: collision with root package name */
    public String f6869a;

    /* renamed from: b, reason: collision with root package name */
    public String f6870b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6871c;

    /* renamed from: d, reason: collision with root package name */
    public String f6872d;

    /* renamed from: e, reason: collision with root package name */
    public String f6873e;

    public Hb() {
        a();
    }

    public static Hb[] b() {
        if (f6868f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6868f == null) {
                        f6868f = new Hb[0];
                    }
                } finally {
                }
            }
        }
        return f6868f;
    }

    public final Hb a() {
        this.f6869a = "";
        this.f6870b = "";
        this.f6871c = false;
        this.f6872d = "";
        this.f6873e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6869a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6869a);
        }
        if (!this.f6870b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f6870b);
        }
        boolean z = this.f6871c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.f6872d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f6872d);
        }
        return !this.f6873e.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f6873e) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6869a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6869a);
        }
        if (!this.f6870b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f6870b);
        }
        boolean z = this.f6871c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.f6872d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f6872d);
        }
        if (!this.f6873e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f6873e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Hb b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Hb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6869a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f6870b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f6871c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f6872d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6873e = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Hb a(byte[] bArr) {
        return (Hb) MessageNano.mergeFrom(new Hb(), bArr);
    }
}
