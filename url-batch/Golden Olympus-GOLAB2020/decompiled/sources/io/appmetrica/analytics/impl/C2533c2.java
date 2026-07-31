package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2533c2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2533c2[] f38760c;

    /* renamed from: a, reason: collision with root package name */
    public String f38761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38762b;

    public C2533c2() {
        a();
    }

    public static C2533c2[] b() {
        if (f38760c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38760c == null) {
                        f38760c = new C2533c2[0];
                    }
                } finally {
                }
            }
        }
        return f38760c;
    }

    public final C2533c2 a() {
        this.f38761a = "";
        this.f38762b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f38762b) + CodedOutputByteBufferNano.computeStringSize(1, this.f38761a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f38761a);
        codedOutputByteBufferNano.writeBool(2, this.f38762b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2533c2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38761a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38762b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C2533c2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2533c2().mergeFrom(codedInputByteBufferNano);
    }

    public static C2533c2 a(byte[] bArr) {
        return (C2533c2) MessageNano.mergeFrom(new C2533c2(), bArr);
    }
}
