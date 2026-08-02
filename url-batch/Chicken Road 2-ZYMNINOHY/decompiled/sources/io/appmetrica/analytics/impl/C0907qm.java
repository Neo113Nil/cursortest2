package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907qm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0907qm[] f12628b;

    /* renamed from: a, reason: collision with root package name */
    public long f12629a;

    public C0907qm() {
        a();
    }

    public static C0907qm[] b() {
        if (f12628b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12628b == null) {
                        f12628b = new C0907qm[0];
                    }
                } finally {
                }
            }
        }
        return f12628b;
    }

    public final C0907qm a() {
        this.f12629a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f12629a;
        return j4 != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f12629a;
        if (j4 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0907qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f12629a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0907qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0907qm) MessageNano.mergeFrom(new C0907qm(), bArr);
    }

    public static C0907qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0907qm().mergeFrom(codedInputByteBufferNano);
    }
}
