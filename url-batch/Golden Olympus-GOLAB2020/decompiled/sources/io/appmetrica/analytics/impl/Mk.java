package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Mk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Mk[] f37980c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37981a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f37982b;

    public Mk() {
        a();
    }

    public static Mk[] b() {
        if (f37980c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37980c == null) {
                        f37980c = new Mk[0];
                    }
                } finally {
                }
            }
        }
        return f37980c;
    }

    public final Mk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f37981a = bArr;
        this.f37982b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f37981a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f37981a);
        }
        return !Arrays.equals(this.f37982b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f37982b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f37981a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37981a);
        }
        if (!Arrays.equals(this.f37982b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f37982b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37981a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f37982b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Mk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Mk().mergeFrom(codedInputByteBufferNano);
    }

    public static Mk a(byte[] bArr) {
        return (Mk) MessageNano.mergeFrom(new Mk(), bArr);
    }
}
