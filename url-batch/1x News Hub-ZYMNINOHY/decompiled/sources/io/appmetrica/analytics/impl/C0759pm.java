package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759pm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0759pm[] f8104b;

    /* renamed from: a, reason: collision with root package name */
    public String f8105a;

    public C0759pm() {
        a();
    }

    public static C0759pm[] b() {
        if (f8104b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8104b == null) {
                        f8104b = new C0759pm[0];
                    }
                } finally {
                }
            }
        }
        return f8104b;
    }

    public final C0759pm a() {
        this.f8105a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f8105a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f8105a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8105a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8105a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0759pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f8105a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0759pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0759pm) MessageNano.mergeFrom(new C0759pm(), bArr);
    }

    public static C0759pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0759pm().mergeFrom(codedInputByteBufferNano);
    }
}
