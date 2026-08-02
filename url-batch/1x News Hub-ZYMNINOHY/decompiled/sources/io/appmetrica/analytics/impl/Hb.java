package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Hb extends MessageNano {
    public static volatile Hb[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f6074a;

    /* renamed from: b, reason: collision with root package name */
    public String f6075b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6076c;

    /* renamed from: d, reason: collision with root package name */
    public String f6077d;

    /* renamed from: e, reason: collision with root package name */
    public String f6078e;

    public Hb() {
        a();
    }

    public static Hb[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new Hb[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final Hb a() {
        this.f6074a = "";
        this.f6075b = "";
        this.f6076c = false;
        this.f6077d = "";
        this.f6078e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6074a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6074a);
        }
        if (!this.f6075b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f6075b);
        }
        boolean z = this.f6076c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.f6077d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f6077d);
        }
        return !this.f6078e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f6078e) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6074a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6074a);
        }
        if (!this.f6075b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f6075b);
        }
        boolean z = this.f6076c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.f6077d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f6077d);
        }
        if (!this.f6078e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f6078e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Hb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6074a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f6075b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f6076c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f6077d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6078e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Hb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hb) MessageNano.mergeFrom(new Hb(), bArr);
    }
}
