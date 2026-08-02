package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855om extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0855om[] f12532b;

    /* renamed from: a, reason: collision with root package name */
    public long f12533a;

    public C0855om() {
        a();
    }

    public static C0855om[] b() {
        if (f12532b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12532b == null) {
                        f12532b = new C0855om[0];
                    }
                } finally {
                }
            }
        }
        return f12532b;
    }

    public final C0855om a() {
        this.f12533a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f12533a;
        return j4 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f12533a;
        if (j4 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0855om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f12533a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0855om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0855om) MessageNano.mergeFrom(new C0855om(), bArr);
    }

    public static C0855om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0855om().mergeFrom(codedInputByteBufferNano);
    }
}
