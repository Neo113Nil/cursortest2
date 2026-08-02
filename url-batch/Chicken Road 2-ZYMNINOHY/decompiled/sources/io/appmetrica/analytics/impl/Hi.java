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
public final class Hi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Hi[] f10376c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10377a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10378b;

    public Hi() {
        a();
    }

    public static Hi[] b() {
        if (f10376c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10376c == null) {
                        f10376c = new Hi[0];
                    }
                } finally {
                }
            }
        }
        return f10376c;
    }

    public final Hi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f10377a = bArr;
        this.f10378b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f10377a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f10377a);
        }
        return !Arrays.equals(this.f10378b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f10378b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f10377a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f10377a);
        }
        if (!Arrays.equals(this.f10378b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f10378b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f10377a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10378b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Hi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hi().mergeFrom(codedInputByteBufferNano);
    }

    public static Hi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hi) MessageNano.mergeFrom(new Hi(), bArr);
    }
}
