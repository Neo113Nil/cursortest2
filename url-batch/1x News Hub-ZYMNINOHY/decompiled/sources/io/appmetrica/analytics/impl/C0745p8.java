package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745p8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0745p8[] f8069b;

    /* renamed from: a, reason: collision with root package name */
    public C0693n8 f8070a;

    public C0745p8() {
        a();
    }

    public static C0745p8[] b() {
        if (f8069b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8069b == null) {
                        f8069b = new C0745p8[0];
                    }
                } finally {
                }
            }
        }
        return f8069b;
    }

    public final C0745p8 a() {
        this.f8070a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0693n8 c0693n8 = this.f8070a;
        return c0693n8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0693n8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0693n8 c0693n8 = this.f8070a;
        if (c0693n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0693n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0745p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f8070a == null) {
                    this.f8070a = new C0693n8();
                }
                codedInputByteBufferNano.readMessage(this.f8070a);
            }
        }
        return this;
    }

    public static C0745p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0745p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0745p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0745p8) MessageNano.mergeFrom(new C0745p8(), bArr);
    }
}
