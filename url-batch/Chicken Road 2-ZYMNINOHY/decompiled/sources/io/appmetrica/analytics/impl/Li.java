package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Li extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f10600f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10601g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10602h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Li[] f10603i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10604a;

    /* renamed from: b, reason: collision with root package name */
    public long f10605b;

    /* renamed from: c, reason: collision with root package name */
    public int f10606c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10607d;

    /* renamed from: e, reason: collision with root package name */
    public long f10608e;

    public Li() {
        a();
    }

    public static Li[] b() {
        if (f10603i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10603i == null) {
                        f10603i = new Li[0];
                    }
                } finally {
                }
            }
        }
        return f10603i;
    }

    public final Li a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f10604a = bArr;
        this.f10605b = 0L;
        this.f10606c = 0;
        this.f10607d = bArr;
        this.f10608e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f10604a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f10604a);
        }
        long j4 = this.f10605b;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        int i4 = this.f10606c;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i4);
        }
        if (!Arrays.equals(this.f10607d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f10607d);
        }
        long j5 = this.f10608e;
        return j5 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f10604a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f10604a);
        }
        long j4 = this.f10605b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        int i4 = this.f10606c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        if (!Arrays.equals(this.f10607d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f10607d);
        }
        long j5 = this.f10608e;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Li b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Li().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f10604a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f10605b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f10606c = readInt32;
                }
            } else if (readTag == 34) {
                this.f10607d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10608e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Li a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Li) MessageNano.mergeFrom(new Li(), bArr);
    }
}
