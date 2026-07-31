package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Af extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Af[] f37179d;

    /* renamed from: a, reason: collision with root package name */
    public String f37180a;

    /* renamed from: b, reason: collision with root package name */
    public String f37181b;

    /* renamed from: c, reason: collision with root package name */
    public int f37182c;

    public Af() {
        a();
    }

    public static Af[] b() {
        if (f37179d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37179d == null) {
                        f37179d = new Af[0];
                    }
                } finally {
                }
            }
        }
        return f37179d;
    }

    public final Af a() {
        this.f37180a = "";
        this.f37181b = "";
        this.f37182c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f37180a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f37180a);
        }
        if (!this.f37181b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f37181b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f37182c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f37180a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f37180a);
        }
        if (!this.f37181b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f37181b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f37182c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Af mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37180a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f37181b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f37182c = readInt32;
                }
            }
        }
        return this;
    }

    public static Af b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Af().mergeFrom(codedInputByteBufferNano);
    }

    public static Af a(byte[] bArr) {
        return (Af) MessageNano.mergeFrom(new Af(), bArr);
    }
}
