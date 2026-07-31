package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class C8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C8[] f37280c;

    /* renamed from: a, reason: collision with root package name */
    public int f37281a;

    /* renamed from: b, reason: collision with root package name */
    public C3112y8 f37282b;

    public C8() {
        a();
    }

    public static C8[] b() {
        if (f37280c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37280c == null) {
                        f37280c = new C8[0];
                    }
                } finally {
                }
            }
        }
        return f37280c;
    }

    public final C8 a() {
        this.f37281a = 0;
        this.f37282b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f37281a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        C3112y8 c3112y8 = this.f37282b;
        return c3112y8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c3112y8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f37281a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        C3112y8 c3112y8 = this.f37282b;
        if (c3112y8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3112y8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f37281a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f37282b == null) {
                    this.f37282b = new C3112y8();
                }
                codedInputByteBufferNano.readMessage(this.f37282b);
            }
        }
        return this;
    }

    public static C8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C8().mergeFrom(codedInputByteBufferNano);
    }

    public static C8 a(byte[] bArr) {
        return (C8) MessageNano.mergeFrom(new C8(), bArr);
    }
}
