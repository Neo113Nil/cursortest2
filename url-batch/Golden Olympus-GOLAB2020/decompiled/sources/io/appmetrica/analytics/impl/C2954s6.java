package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2954s6 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2954s6[] f39786b;

    /* renamed from: a, reason: collision with root package name */
    public String f39787a;

    public C2954s6() {
        a();
    }

    public static C2954s6[] b() {
        if (f39786b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39786b == null) {
                        f39786b = new C2954s6[0];
                    }
                } finally {
                }
            }
        }
        return f39786b;
    }

    public final C2954s6 a() {
        this.f39787a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f39787a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f39787a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2954s6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f39787a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C2954s6 a(byte[] bArr) {
        return (C2954s6) MessageNano.mergeFrom(new C2954s6(), bArr);
    }

    public static C2954s6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2954s6().mergeFrom(codedInputByteBufferNano);
    }
}
