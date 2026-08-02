package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9500f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9501g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9502h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile y[] f9503i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9504a;

    /* renamed from: b, reason: collision with root package name */
    public long f9505b;

    /* renamed from: c, reason: collision with root package name */
    public int f9506c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9507d;

    /* renamed from: e, reason: collision with root package name */
    public long f9508e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f9503i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9503i == null) {
                        f9503i = new y[0];
                    }
                } finally {
                }
            }
        }
        return f9503i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9504a = bArr;
        this.f9505b = 0L;
        this.f9506c = 0;
        this.f9507d = bArr;
        this.f9508e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f9504a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9504a);
        }
        long j4 = this.f9505b;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        int i4 = this.f9506c;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i4);
        }
        if (!Arrays.equals(this.f9507d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f9507d);
        }
        long j5 = this.f9508e;
        return j5 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f9504a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9504a);
        }
        long j4 = this.f9505b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        int i4 = this.f9506c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        if (!Arrays.equals(this.f9507d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f9507d);
        }
        long j5 = this.f9508e;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f9504a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f9505b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f9506c = readInt32;
                }
            } else if (readTag == 34) {
                this.f9507d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f9508e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
