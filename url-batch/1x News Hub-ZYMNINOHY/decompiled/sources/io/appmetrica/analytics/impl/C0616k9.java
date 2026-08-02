package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616k9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0616k9[] f7711c;

    /* renamed from: a, reason: collision with root package name */
    public int f7712a;

    /* renamed from: b, reason: collision with root package name */
    public String f7713b;

    public C0616k9() {
        a();
    }

    public static C0616k9[] b() {
        if (f7711c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7711c == null) {
                        f7711c = new C0616k9[0];
                    }
                } finally {
                }
            }
        }
        return f7711c;
    }

    public final C0616k9 a() {
        this.f7712a = 2;
        this.f7713b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7712a;
        if (i3 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
        }
        return !this.f7713b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f7713b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7712a;
        if (i3 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        if (!this.f7713b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7713b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0616k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                            this.f7712a = readInt32;
                            break;
                    }
                } else if (readTag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f7713b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C0616k9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0616k9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0616k9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0616k9) MessageNano.mergeFrom(new C0616k9(), bArr);
    }
}
