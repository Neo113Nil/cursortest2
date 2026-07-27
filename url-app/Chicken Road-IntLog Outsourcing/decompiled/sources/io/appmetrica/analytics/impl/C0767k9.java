package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767k9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0767k9[] f8611c;

    /* renamed from: a, reason: collision with root package name */
    public int f8612a;

    /* renamed from: b, reason: collision with root package name */
    public String f8613b;

    public C0767k9() {
        a();
    }

    public static C0767k9[] b() {
        if (f8611c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8611c == null) {
                        f8611c = new C0767k9[0];
                    }
                } finally {
                }
            }
        }
        return f8611c;
    }

    public final C0767k9 a() {
        this.f8612a = 2;
        this.f8613b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f8612a;
        if (i2 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        return !this.f8613b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f8613b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f8612a;
        if (i2 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!this.f8613b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8613b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0767k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f8612a = readInt32;
                        break;
                }
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8613b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0767k9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0767k9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0767k9 a(byte[] bArr) {
        return (C0767k9) MessageNano.mergeFrom(new C0767k9(), bArr);
    }
}
