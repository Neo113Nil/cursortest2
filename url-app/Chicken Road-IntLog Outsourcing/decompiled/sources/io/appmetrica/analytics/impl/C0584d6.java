package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584d6 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0584d6[] f8030b;

    /* renamed from: a, reason: collision with root package name */
    public String f8031a;

    public C0584d6() {
        a();
    }

    public static C0584d6[] b() {
        if (f8030b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8030b == null) {
                        f8030b = new C0584d6[0];
                    }
                } finally {
                }
            }
        }
        return f8030b;
    }

    public final C0584d6 a() {
        this.f8031a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f8031a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f8031a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0584d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8031a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0584d6 a(byte[] bArr) {
        return (C0584d6) MessageNano.mergeFrom(new C0584d6(), bArr);
    }

    public static C0584d6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0584d6().mergeFrom(codedInputByteBufferNano);
    }
}
