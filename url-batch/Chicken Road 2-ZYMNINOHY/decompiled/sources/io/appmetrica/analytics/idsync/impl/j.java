package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile j[] f9925b;

    /* renamed from: a, reason: collision with root package name */
    public int f9926a;

    public j() {
        a();
    }

    public static j[] b() {
        if (f9925b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9925b == null) {
                        f9925b = new j[0];
                    }
                } finally {
                }
            }
        }
        return f9925b;
    }

    public final j a() {
        this.f9926a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f9926a;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(1, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f9926a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1) {
                    this.f9926a = readInt32;
                }
            }
        }
        return this;
    }

    public static j a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (j) MessageNano.mergeFrom(new j(), bArr);
    }

    public static j b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new j().mergeFrom(codedInputByteBufferNano);
    }
}
