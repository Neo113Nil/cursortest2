package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871o9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0871o9[] f8914e;

    /* renamed from: a, reason: collision with root package name */
    public int f8915a;

    /* renamed from: b, reason: collision with root package name */
    public int f8916b;

    /* renamed from: c, reason: collision with root package name */
    public String f8917c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8918d;

    public C0871o9() {
        a();
    }

    public static C0871o9[] b() {
        if (f8914e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8914e == null) {
                        f8914e = new C0871o9[0];
                    }
                } finally {
                }
            }
        }
        return f8914e;
    }

    public final C0871o9 a() {
        this.f8915a = 0;
        this.f8916b = 0;
        this.f8917c = "";
        this.f8918d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f8915a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f8916b;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i3);
        }
        if (!this.f8917c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f8917c);
        }
        boolean z = this.f8918d;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f8915a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f8916b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i3);
        }
        if (!this.f8917c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f8917c);
        }
        boolean z = this.f8918d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0871o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f8915a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f8916b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f8917c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8918d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0871o9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0871o9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0871o9 a(byte[] bArr) {
        return (C0871o9) MessageNano.mergeFrom(new C0871o9(), bArr);
    }
}
