package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class I8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile I8[] f37726b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37727a;

    public I8() {
        a();
    }

    public static I8[] b() {
        if (f37726b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37726b == null) {
                        f37726b = new I8[0];
                    }
                } finally {
                }
            }
        }
        return f37726b;
    }

    public final I8 a() {
        this.f37727a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f37727a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f37727a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f37727a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37727a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f37727a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static I8 a(byte[] bArr) {
        return (I8) MessageNano.mergeFrom(new I8(), bArr);
    }

    public static I8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new I8().mergeFrom(codedInputByteBufferNano);
    }
}
