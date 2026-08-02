package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016zm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1016zm[] f8713b;

    /* renamed from: a, reason: collision with root package name */
    public long f8714a;

    public C1016zm() {
        a();
    }

    public static C1016zm[] b() {
        if (f8713b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8713b == null) {
                        f8713b = new C1016zm[0];
                    }
                } finally {
                }
            }
        }
        return f8713b;
    }

    public final C1016zm a() {
        this.f8714a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f8714a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f8714a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1016zm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8714a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C1016zm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1016zm) MessageNano.mergeFrom(new C1016zm(), bArr);
    }

    public static C1016zm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1016zm().mergeFrom(codedInputByteBufferNano);
    }
}
