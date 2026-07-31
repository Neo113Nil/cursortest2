package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0438pm extends MessageNano {
    public static volatile C0438pm[] b;

    /* renamed from: a, reason: collision with root package name */
    public long f1440a;

    public C0438pm() {
        a();
    }

    public static C0438pm[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0438pm[0];
                }
            }
        }
        return b;
    }

    public final C0438pm a() {
        this.f1440a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f1440a;
        return j != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f1440a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0438pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f1440a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0438pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0438pm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0438pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0438pm) MessageNano.mergeFrom(new C0438pm(), bArr);
    }
}
