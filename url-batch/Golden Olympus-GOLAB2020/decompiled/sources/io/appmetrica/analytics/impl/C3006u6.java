package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3006u6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3006u6[] f39895c;

    /* renamed from: a, reason: collision with root package name */
    public int f39896a;

    /* renamed from: b, reason: collision with root package name */
    public String f39897b;

    public C3006u6() {
        a();
    }

    public static C3006u6[] b() {
        if (f39895c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39895c == null) {
                        f39895c = new C3006u6[0];
                    }
                } finally {
                }
            }
        }
        return f39895c;
    }

    public final C3006u6 a() {
        this.f39896a = 0;
        this.f39897b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f39896a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        return !this.f39897b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f39897b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f39896a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (!this.f39897b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f39897b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3006u6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f39896a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39897b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C3006u6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3006u6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3006u6 a(byte[] bArr) {
        return (C3006u6) MessageNano.mergeFrom(new C3006u6(), bArr);
    }
}
