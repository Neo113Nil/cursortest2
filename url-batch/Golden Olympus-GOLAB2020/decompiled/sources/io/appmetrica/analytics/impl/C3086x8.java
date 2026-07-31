package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3086x8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C3086x8[] f40157b;

    /* renamed from: a, reason: collision with root package name */
    public C3112y8 f40158a;

    public C3086x8() {
        a();
    }

    public static C3086x8[] b() {
        if (f40157b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40157b == null) {
                        f40157b = new C3086x8[0];
                    }
                } finally {
                }
            }
        }
        return f40157b;
    }

    public final C3086x8 a() {
        this.f40158a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3112y8 c3112y8 = this.f40158a;
        return c3112y8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c3112y8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3112y8 c3112y8 = this.f40158a;
        if (c3112y8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3112y8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3086x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f40158a == null) {
                    this.f40158a = new C3112y8();
                }
                codedInputByteBufferNano.readMessage(this.f40158a);
            }
        }
        return this;
    }

    public static C3086x8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3086x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3086x8 a(byte[] bArr) {
        return (C3086x8) MessageNano.mergeFrom(new C3086x8(), bArr);
    }
}
