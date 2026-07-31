package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0143e8 extends MessageNano {
    public static volatile C0143e8[] b;

    /* renamed from: a, reason: collision with root package name */
    public C0169f8 f1233a;

    public C0143e8() {
        a();
    }

    public static C0143e8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0143e8[0];
                }
            }
        }
        return b;
    }

    public final C0143e8 a() {
        this.f1233a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0169f8 c0169f8 = this.f1233a;
        return c0169f8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0169f8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0169f8 c0169f8 = this.f1233a;
        if (c0169f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0169f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0143e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f1233a == null) {
                    this.f1233a = new C0169f8();
                }
                codedInputByteBufferNano.readMessage(this.f1233a);
            }
        }
        return this;
    }

    public static C0143e8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0143e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0143e8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0143e8) MessageNano.mergeFrom(new C0143e8(), bArr);
    }
}
