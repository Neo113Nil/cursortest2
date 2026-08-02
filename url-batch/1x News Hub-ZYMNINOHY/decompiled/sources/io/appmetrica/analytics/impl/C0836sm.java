package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836sm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0836sm[] f8325b;

    /* renamed from: a, reason: collision with root package name */
    public long f8326a;

    public C0836sm() {
        a();
    }

    public static C0836sm[] b() {
        if (f8325b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8325b == null) {
                        f8325b = new C0836sm[0];
                    }
                } finally {
                }
            }
        }
        return f8325b;
    }

    public final C0836sm a() {
        this.f8326a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f8326a;
        return j3 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f8326a;
        if (j3 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0836sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f8326a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0836sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0836sm) MessageNano.mergeFrom(new C0836sm(), bArr);
    }

    public static C0836sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0836sm().mergeFrom(codedInputByteBufferNano);
    }
}
