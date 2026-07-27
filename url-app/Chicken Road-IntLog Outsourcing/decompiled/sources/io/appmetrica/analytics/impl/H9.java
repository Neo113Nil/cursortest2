package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6858c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6859d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6860e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6861f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6862g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6863h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6864i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile H9[] f6865j;

    /* renamed from: a, reason: collision with root package name */
    public int f6866a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6867b;

    public H9() {
        a();
    }

    public static H9[] b() {
        if (f6865j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6865j == null) {
                        f6865j = new H9[0];
                    }
                } finally {
                }
            }
        }
        return f6865j;
    }

    public final H9 a() {
        this.f6866a = 0;
        this.f6867b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6866a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !Arrays.equals(this.f6867b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6867b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6866a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!Arrays.equals(this.f6867b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6867b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f6866a = readInt32;
                        break;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6867b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static H9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new H9().mergeFrom(codedInputByteBufferNano);
    }

    public static H9 a(byte[] bArr) {
        return (H9) MessageNano.mergeFrom(new H9(), bArr);
    }
}
