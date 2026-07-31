package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class E8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile E8[] f37417c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37418a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f37419b;

    public E8() {
        a();
    }

    public static E8[] b() {
        if (f37417c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37417c == null) {
                        f37417c = new E8[0];
                    }
                } finally {
                }
            }
        }
        return f37417c;
    }

    public final E8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f37418a = bArr;
        this.f37419b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f37418a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f37418a);
        }
        return !Arrays.equals(this.f37419b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f37419b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f37418a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37418a);
        }
        if (!Arrays.equals(this.f37419b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f37419b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37418a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f37419b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static E8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new E8().mergeFrom(codedInputByteBufferNano);
    }

    public static E8 a(byte[] bArr) {
        return (E8) MessageNano.mergeFrom(new E8(), bArr);
    }
}
