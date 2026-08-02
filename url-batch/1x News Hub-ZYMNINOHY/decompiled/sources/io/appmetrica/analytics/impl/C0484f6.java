package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484f6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0484f6[] f7301c;

    /* renamed from: a, reason: collision with root package name */
    public int f7302a;

    /* renamed from: b, reason: collision with root package name */
    public String f7303b;

    public C0484f6() {
        a();
    }

    public static C0484f6[] b() {
        if (f7301c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7301c == null) {
                        f7301c = new C0484f6[0];
                    }
                } finally {
                }
            }
        }
        return f7301c;
    }

    public final C0484f6 a() {
        this.f7302a = 0;
        this.f7303b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7302a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        return !this.f7303b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f7303b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7302a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        if (!this.f7303b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7303b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0484f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f7302a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7303b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0484f6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0484f6().mergeFrom(codedInputByteBufferNano);
    }

    public static C0484f6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0484f6) MessageNano.mergeFrom(new C0484f6(), bArr);
    }
}
