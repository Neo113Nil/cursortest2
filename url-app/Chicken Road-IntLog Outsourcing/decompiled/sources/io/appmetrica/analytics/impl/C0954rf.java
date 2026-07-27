package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954rf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0954rf[] f9169d;

    /* renamed from: a, reason: collision with root package name */
    public String f9170a;

    /* renamed from: b, reason: collision with root package name */
    public String f9171b;

    /* renamed from: c, reason: collision with root package name */
    public int f9172c;

    public C0954rf() {
        a();
    }

    public static C0954rf[] b() {
        if (f9169d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9169d == null) {
                        f9169d = new C0954rf[0];
                    }
                } finally {
                }
            }
        }
        return f9169d;
    }

    public final C0954rf a() {
        this.f9170a = "";
        this.f9171b = "";
        this.f9172c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9170a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9170a);
        }
        if (!this.f9171b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f9171b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f9172c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9170a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9170a);
        }
        if (!this.f9171b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f9171b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f9172c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0954rf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9170a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f9171b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f9172c = readInt32;
                }
            }
        }
    }

    public static C0954rf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0954rf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0954rf a(byte[] bArr) {
        return (C0954rf) MessageNano.mergeFrom(new C0954rf(), bArr);
    }
}
