package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661g6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0661g6[] f8227g;

    /* renamed from: a, reason: collision with root package name */
    public String f8228a;

    /* renamed from: b, reason: collision with root package name */
    public String f8229b;

    /* renamed from: c, reason: collision with root package name */
    public int f8230c;

    /* renamed from: d, reason: collision with root package name */
    public String f8231d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8232e;

    /* renamed from: f, reason: collision with root package name */
    public int f8233f;

    public C0661g6() {
        a();
    }

    public static C0661g6[] b() {
        if (f8227g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8227g == null) {
                        f8227g = new C0661g6[0];
                    }
                } finally {
                }
            }
        }
        return f8227g;
    }

    public final C0661g6 a() {
        this.f8228a = "";
        this.f8229b = "";
        this.f8230c = -1;
        this.f8231d = "";
        this.f8232e = false;
        this.f8233f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8228a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8228a);
        }
        if (!this.f8229b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8229b);
        }
        int i2 = this.f8230c;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i2);
        }
        if (!this.f8231d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f8231d);
        }
        boolean z = this.f8232e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i3 = this.f8233f;
        return i3 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f8228a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8228a);
        }
        if (!this.f8229b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8229b);
        }
        int i2 = this.f8230c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i2);
        }
        if (!this.f8231d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8231d);
        }
        boolean z = this.f8232e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i3 = this.f8233f;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0661g6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0661g6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0661g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8228a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8229b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f8230c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f8231d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f8232e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8233f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    public static C0661g6 a(byte[] bArr) {
        return (C0661g6) MessageNano.mergeFrom(new C0661g6(), bArr);
    }
}
