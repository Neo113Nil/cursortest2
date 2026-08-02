package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558d9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0558d9[] f11671c;

    /* renamed from: a, reason: collision with root package name */
    public int f11672a;

    /* renamed from: b, reason: collision with root package name */
    public String f11673b;

    public C0558d9() {
        a();
    }

    public static C0558d9[] b() {
        if (f11671c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11671c == null) {
                        f11671c = new C0558d9[0];
                    }
                } finally {
                }
            }
        }
        return f11671c;
    }

    public final C0558d9 a() {
        this.f11672a = 2;
        this.f11673b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f11672a;
        if (i4 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i4);
        }
        return !this.f11673b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f11673b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f11672a;
        if (i4 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        if (!this.f11673b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f11673b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0558d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                            this.f11672a = readInt32;
                            break;
                    }
                } else if (readTag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f11673b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C0558d9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0558d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0558d9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0558d9) MessageNano.mergeFrom(new C0558d9(), bArr);
    }
}
