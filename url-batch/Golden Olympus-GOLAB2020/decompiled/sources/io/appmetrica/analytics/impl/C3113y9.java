package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3113y9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3113y9[] f40267c;

    /* renamed from: a, reason: collision with root package name */
    public int f40268a;

    /* renamed from: b, reason: collision with root package name */
    public String f40269b;

    public C3113y9() {
        a();
    }

    public static C3113y9[] b() {
        if (f40267c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40267c == null) {
                        f40267c = new C3113y9[0];
                    }
                } finally {
                }
            }
        }
        return f40267c;
    }

    public final C3113y9 a() {
        this.f40268a = 2;
        this.f40269b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f40268a;
        if (i4 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i4);
        }
        return !this.f40269b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f40269b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f40268a;
        if (i4 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        if (!this.f40269b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f40269b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3113y9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
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
                            this.f40268a = readInt32;
                            break;
                    }
                } else if (readTag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f40269b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C3113y9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3113y9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3113y9 a(byte[] bArr) {
        return (C3113y9) MessageNano.mergeFrom(new C3113y9(), bArr);
    }
}
