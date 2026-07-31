package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3035v9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3035v9[] f39971c;

    /* renamed from: a, reason: collision with root package name */
    public String f39972a;

    /* renamed from: b, reason: collision with root package name */
    public long f39973b;

    public C3035v9() {
        a();
    }

    public static C3035v9[] b() {
        if (f39971c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39971c == null) {
                        f39971c = new C3035v9[0];
                    }
                } finally {
                }
            }
        }
        return f39971c;
    }

    public final C3035v9 a() {
        this.f39972a = "";
        this.f39973b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f39973b) + CodedOutputByteBufferNano.computeStringSize(1, this.f39972a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f39972a);
        codedOutputByteBufferNano.writeUInt64(2, this.f39973b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3035v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39972a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39973b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C3035v9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3035v9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3035v9 a(byte[] bArr) {
        return (C3035v9) MessageNano.mergeFrom(new C3035v9(), bArr);
    }
}
