package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Qk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Qk[] f7346c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7347a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7348b;

    public Qk() {
        a();
    }

    public static Qk[] b() {
        if (f7346c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7346c == null) {
                        f7346c = new Qk[0];
                    }
                } finally {
                }
            }
        }
        return f7346c;
    }

    public final Qk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7347a = bArr;
        this.f7348b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7347a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7347a);
        }
        return !Arrays.equals(this.f7348b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7348b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f7347a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7347a);
        }
        if (!Arrays.equals(this.f7348b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7348b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7347a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7348b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Qk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Qk().mergeFrom(codedInputByteBufferNano);
    }

    public static Qk a(byte[] bArr) {
        return (Qk) MessageNano.mergeFrom(new Qk(), bArr);
    }
}
