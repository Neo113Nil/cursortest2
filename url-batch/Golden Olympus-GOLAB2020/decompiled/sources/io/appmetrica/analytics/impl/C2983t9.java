package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.t9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2983t9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2983t9[] f39846c;

    /* renamed from: a, reason: collision with root package name */
    public String f39847a;

    /* renamed from: b, reason: collision with root package name */
    public String f39848b;

    public C2983t9() {
        a();
    }

    public static C2983t9[] b() {
        if (f39846c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39846c == null) {
                        f39846c = new C2983t9[0];
                    }
                } finally {
                }
            }
        }
        return f39846c;
    }

    public final C2983t9 a() {
        this.f39847a = "";
        this.f39848b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f39848b) + CodedOutputByteBufferNano.computeStringSize(1, this.f39847a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f39847a);
        codedOutputByteBufferNano.writeString(2, this.f39848b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2983t9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39847a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39848b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C2983t9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2983t9().mergeFrom(codedInputByteBufferNano);
    }

    public static C2983t9 a(byte[] bArr) {
        return (C2983t9) MessageNano.mergeFrom(new C2983t9(), bArr);
    }
}
