package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635f6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0635f6[] f8168c;

    /* renamed from: a, reason: collision with root package name */
    public int f8169a;

    /* renamed from: b, reason: collision with root package name */
    public String f8170b;

    public C0635f6() {
        a();
    }

    public static C0635f6[] b() {
        if (f8168c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8168c == null) {
                        f8168c = new C0635f6[0];
                    }
                } finally {
                }
            }
        }
        return f8168c;
    }

    public final C0635f6 a() {
        this.f8169a = 0;
        this.f8170b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f8169a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !this.f8170b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f8170b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f8169a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!this.f8170b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8170b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0635f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f8169a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8170b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0635f6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0635f6().mergeFrom(codedInputByteBufferNano);
    }

    public static C0635f6 a(byte[] bArr) {
        return (C0635f6) MessageNano.mergeFrom(new C0635f6(), bArr);
    }
}
