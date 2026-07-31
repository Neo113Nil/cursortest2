package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3138z8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C3138z8[] f40322b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f40323a;

    public C3138z8() {
        a();
    }

    public static C3138z8[] b() {
        if (f40322b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40322b == null) {
                        f40322b = new C3138z8[0];
                    }
                } finally {
                }
            }
        }
        return f40322b;
    }

    public final C3138z8 a() {
        this.f40323a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f40323a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f40323a;
            if (i4 >= bArr2.length) {
                return computeSerializedSize + i5 + i6;
            }
            byte[] bArr3 = bArr2[i4];
            if (bArr3 != null) {
                i6++;
                i5 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i5;
            }
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[][] bArr = this.f40323a;
        if (bArr != null && bArr.length > 0) {
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.f40323a;
                if (i4 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i4];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3138z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f40323a;
                int length = bArr == null ? 0 : bArr.length;
                int i4 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i4][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i4 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f40323a = bArr2;
            }
        }
        return this;
    }

    public static C3138z8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3138z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3138z8 a(byte[] bArr) {
        return (C3138z8) MessageNano.mergeFrom(new C3138z8(), bArr);
    }
}
