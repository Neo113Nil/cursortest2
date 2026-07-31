package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Yi extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f38563f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f38564g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f38565h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Yi[] f38566i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f38567a;

    /* renamed from: b, reason: collision with root package name */
    public long f38568b;

    /* renamed from: c, reason: collision with root package name */
    public int f38569c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f38570d;

    /* renamed from: e, reason: collision with root package name */
    public long f38571e;

    public Yi() {
        a();
    }

    public static Yi[] b() {
        if (f38566i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38566i == null) {
                        f38566i = new Yi[0];
                    }
                } finally {
                }
            }
        }
        return f38566i;
    }

    public final Yi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f38567a = bArr;
        this.f38568b = 0L;
        this.f38569c = 0;
        this.f38570d = bArr;
        this.f38571e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f38567a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f38567a);
        }
        long j4 = this.f38568b;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        int i4 = this.f38569c;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i4);
        }
        if (!Arrays.equals(this.f38570d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f38570d);
        }
        long j5 = this.f38571e;
        return j5 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f38567a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f38567a);
        }
        long j4 = this.f38568b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        int i4 = this.f38569c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        if (!Arrays.equals(this.f38570d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f38570d);
        }
        long j5 = this.f38571e;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Yi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Yi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38567a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f38568b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f38569c = readInt32;
                }
            } else if (readTag == 34) {
                this.f38570d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38571e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Yi a(byte[] bArr) {
        return (Yi) MessageNano.mergeFrom(new Yi(), bArr);
    }
}
