package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792l8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0792l8[] f8677b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f8678a;

    public C0792l8() {
        a();
    }

    public static C0792l8[] b() {
        if (f8677b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8677b == null) {
                        f8677b = new C0792l8[0];
                    }
                } finally {
                }
            }
        }
        return f8677b;
    }

    public final C0792l8 a() {
        this.f8678a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f8678a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f8678a;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i3 + i6;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i6++;
                i3 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[][] bArr = this.f8678a;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f8678a;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0792l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f8678a;
                int length = bArr == null ? 0 : bArr.length;
                int i2 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i2][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i2 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f8678a = bArr2;
            }
        }
    }

    public static C0792l8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0792l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0792l8 a(byte[] bArr) {
        return (C0792l8) MessageNano.mergeFrom(new C0792l8(), bArr);
    }
}
