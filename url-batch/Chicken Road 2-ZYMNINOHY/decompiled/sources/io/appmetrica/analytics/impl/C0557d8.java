package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557d8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0557d8[] f11669b;

    /* renamed from: a, reason: collision with root package name */
    public C0582e8 f11670a;

    public C0557d8() {
        a();
    }

    public static C0557d8[] b() {
        if (f11669b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11669b == null) {
                        f11669b = new C0557d8[0];
                    }
                } finally {
                }
            }
        }
        return f11669b;
    }

    public final C0557d8 a() {
        this.f11670a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0582e8 c0582e8 = this.f11670a;
        return c0582e8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0582e8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0582e8 c0582e8 = this.f11670a;
        if (c0582e8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0582e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0557d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f11670a == null) {
                    this.f11670a = new C0582e8();
                }
                codedInputByteBufferNano.readMessage(this.f11670a);
            }
        }
        return this;
    }

    public static C0557d8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0557d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0557d8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0557d8) MessageNano.mergeFrom(new C0557d8(), bArr);
    }
}
