package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class r extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile r[] f12632c;

    /* renamed from: a, reason: collision with root package name */
    public long f12633a;

    /* renamed from: b, reason: collision with root package name */
    public int f12634b;

    public r() {
        a();
    }

    public static r[] b() {
        if (f12632c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12632c == null) {
                        f12632c = new r[0];
                    }
                } finally {
                }
            }
        }
        return f12632c;
    }

    public final r a() {
        this.f12633a = 0L;
        this.f12634b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f12633a;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        int i4 = this.f12634b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f12633a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        int i4 = this.f12634b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12633a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12634b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    public static r a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
