package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888um extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0888um[] f8469b;

    /* renamed from: a, reason: collision with root package name */
    public long f8470a;

    public C0888um() {
        a();
    }

    public static C0888um[] b() {
        if (f8469b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8469b == null) {
                        f8469b = new C0888um[0];
                    }
                } finally {
                }
            }
        }
        return f8469b;
    }

    public final C0888um a() {
        this.f8470a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f8470a;
        return j3 != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f8470a;
        if (j3 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0888um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f8470a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0888um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0888um) MessageNano.mergeFrom(new C0888um(), bArr);
    }

    public static C0888um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0888um().mergeFrom(codedInputByteBufferNano);
    }
}
