package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Mi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Mi[] f7153c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7154a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7155b;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (f7153c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7153c == null) {
                        f7153c = new Mi[0];
                    }
                } finally {
                }
            }
        }
        return f7153c;
    }

    public final Mi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7154a = bArr;
        this.f7155b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7154a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7154a);
        }
        return !Arrays.equals(this.f7155b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7155b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f7154a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7154a);
        }
        if (!Arrays.equals(this.f7155b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7155b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7154a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7155b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    public static Mi a(byte[] bArr) {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
