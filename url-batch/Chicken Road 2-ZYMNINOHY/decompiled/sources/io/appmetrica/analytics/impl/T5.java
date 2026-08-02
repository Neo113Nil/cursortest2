package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile T5[] f10978c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10979a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10980b;

    public T5() {
        a();
    }

    public static T5[] b() {
        if (f10978c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10978c == null) {
                        f10978c = new T5[0];
                    }
                } finally {
                }
            }
        }
        return f10978c;
    }

    public final T5 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f10979a = bArr;
        this.f10980b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f10979a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f10979a);
        }
        return !Arrays.equals(this.f10980b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f10980b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f10979a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f10979a);
        }
        if (!Arrays.equals(this.f10980b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f10980b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f10979a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10980b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static T5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T5().mergeFrom(codedInputByteBufferNano);
    }

    public static T5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T5) MessageNano.mergeFrom(new T5(), bArr);
    }
}
