package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970t8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0970t8[] f12772b;

    /* renamed from: a, reason: collision with root package name */
    public C0893q8 f12773a;

    public C0970t8() {
        a();
    }

    public static C0970t8[] b() {
        if (f12772b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12772b == null) {
                        f12772b = new C0970t8[0];
                    }
                } finally {
                }
            }
        }
        return f12772b;
    }

    public final C0970t8 a() {
        this.f12773a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0893q8 c0893q8 = this.f12773a;
        return c0893q8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0893q8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0893q8 c0893q8 = this.f12773a;
        if (c0893q8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0893q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0970t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f12773a == null) {
                    this.f12773a = new C0893q8();
                }
                codedInputByteBufferNano.readMessage(this.f12773a);
            }
        }
        return this;
    }

    public static C0970t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0970t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0970t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0970t8) MessageNano.mergeFrom(new C0970t8(), bArr);
    }
}
