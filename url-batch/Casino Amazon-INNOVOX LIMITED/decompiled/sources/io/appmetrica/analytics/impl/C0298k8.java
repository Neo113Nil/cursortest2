package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0298k8 extends MessageNano {
    public static volatile C0298k8[] b;

    /* renamed from: a, reason: collision with root package name */
    public C0247i8 f1338a;

    public C0298k8() {
        a();
    }

    public static C0298k8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0298k8[0];
                }
            }
        }
        return b;
    }

    public final C0298k8 a() {
        this.f1338a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0247i8 c0247i8 = this.f1338a;
        return c0247i8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0247i8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0247i8 c0247i8 = this.f1338a;
        if (c0247i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0247i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0298k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f1338a == null) {
                    this.f1338a = new C0247i8();
                }
                codedInputByteBufferNano.readMessage(this.f1338a);
            }
        }
        return this;
    }

    public static C0298k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0298k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0298k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0298k8) MessageNano.mergeFrom(new C0298k8(), bArr);
    }
}
