package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589j8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0589j8[] f7628b;

    /* renamed from: a, reason: collision with root package name */
    public C0615k8 f7629a;

    public C0589j8() {
        a();
    }

    public static C0589j8[] b() {
        if (f7628b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7628b == null) {
                        f7628b = new C0589j8[0];
                    }
                } finally {
                }
            }
        }
        return f7628b;
    }

    public final C0589j8 a() {
        this.f7629a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0615k8 c0615k8 = this.f7629a;
        return c0615k8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0615k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0615k8 c0615k8 = this.f7629a;
        if (c0615k8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0615k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0589j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f7629a == null) {
                    this.f7629a = new C0615k8();
                }
                codedInputByteBufferNano.readMessage(this.f7629a);
            }
        }
        return this;
    }

    public static C0589j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0589j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0589j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0589j8) MessageNano.mergeFrom(new C0589j8(), bArr);
    }
}
