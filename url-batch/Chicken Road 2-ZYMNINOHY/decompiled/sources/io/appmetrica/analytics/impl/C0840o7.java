package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840o7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0840o7[] f12500d;

    /* renamed from: a, reason: collision with root package name */
    public long f12501a;

    /* renamed from: b, reason: collision with root package name */
    public long f12502b;

    /* renamed from: c, reason: collision with root package name */
    public int f12503c;

    public C0840o7() {
        a();
    }

    public static C0840o7[] b() {
        if (f12500d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12500d == null) {
                        f12500d = new C0840o7[0];
                    }
                } finally {
                }
            }
        }
        return f12500d;
    }

    public final C0840o7 a() {
        this.f12501a = -1L;
        this.f12502b = -1L;
        this.f12503c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f12501a;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        long j5 = this.f12502b;
        if (j5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j5);
        }
        int i4 = this.f12503c;
        return i4 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f12501a;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        long j5 = this.f12502b;
        if (j5 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j5);
        }
        int i4 = this.f12503c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0840o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12501a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f12502b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f12503c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0840o7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0840o7().mergeFrom(codedInputByteBufferNano);
    }

    public static C0840o7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0840o7) MessageNano.mergeFrom(new C0840o7(), bArr);
    }
}
