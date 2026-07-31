package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Ui extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Ui[] f38374c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f38375a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f38376b;

    public Ui() {
        a();
    }

    public static Ui[] b() {
        if (f38374c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38374c == null) {
                        f38374c = new Ui[0];
                    }
                } finally {
                }
            }
        }
        return f38374c;
    }

    public final Ui a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f38375a = bArr;
        this.f38376b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f38375a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f38375a);
        }
        return !Arrays.equals(this.f38376b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f38376b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f38375a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f38375a);
        }
        if (!Arrays.equals(this.f38376b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f38376b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ui mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38375a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38376b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ui b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ui().mergeFrom(codedInputByteBufferNano);
    }

    public static Ui a(byte[] bArr) {
        return (Ui) MessageNano.mergeFrom(new Ui(), bArr);
    }
}
