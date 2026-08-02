package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002z8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1002z8[] f8666b;

    /* renamed from: a, reason: collision with root package name */
    public C0926w8 f8667a;

    public C1002z8() {
        a();
    }

    public static C1002z8[] b() {
        if (f8666b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8666b == null) {
                        f8666b = new C1002z8[0];
                    }
                } finally {
                }
            }
        }
        return f8666b;
    }

    public final C1002z8 a() {
        this.f8667a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0926w8 c0926w8 = this.f8667a;
        return c0926w8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0926w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0926w8 c0926w8 = this.f8667a;
        if (c0926w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0926w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1002z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f8667a == null) {
                    this.f8667a = new C0926w8();
                }
                codedInputByteBufferNano.readMessage(this.f8667a);
            }
        }
        return this;
    }

    public static C1002z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1002z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1002z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1002z8) MessageNano.mergeFrom(new C1002z8(), bArr);
    }
}
