package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class C9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C9[] f37283e;

    /* renamed from: a, reason: collision with root package name */
    public int f37284a;

    /* renamed from: b, reason: collision with root package name */
    public int f37285b;

    /* renamed from: c, reason: collision with root package name */
    public String f37286c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37287d;

    public C9() {
        a();
    }

    public static C9[] b() {
        if (f37283e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37283e == null) {
                        f37283e = new C9[0];
                    }
                } finally {
                }
            }
        }
        return f37283e;
    }

    public final C9 a() {
        this.f37284a = 0;
        this.f37285b = 0;
        this.f37286c = "";
        this.f37287d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f37284a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        int i5 = this.f37285b;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i5);
        }
        if (!this.f37286c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f37286c);
        }
        boolean z4 = this.f37287d;
        return z4 ? CodedOutputByteBufferNano.computeBoolSize(4, z4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f37284a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        int i5 = this.f37285b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i5);
        }
        if (!this.f37286c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f37286c);
        }
        boolean z4 = this.f37287d;
        if (z4) {
            codedOutputByteBufferNano.writeBool(4, z4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f37284a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f37285b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f37286c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f37287d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C9().mergeFrom(codedInputByteBufferNano);
    }

    public static C9 a(byte[] bArr) {
        return (C9) MessageNano.mergeFrom(new C9(), bArr);
    }
}
