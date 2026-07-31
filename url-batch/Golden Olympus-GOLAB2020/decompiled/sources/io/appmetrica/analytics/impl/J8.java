package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class J8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile J8[] f37821d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37822a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f37823b;

    /* renamed from: c, reason: collision with root package name */
    public K8 f37824c;

    public J8() {
        a();
    }

    public static J8[] b() {
        if (f37821d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37821d == null) {
                        f37821d = new J8[0];
                    }
                } finally {
                }
            }
        }
        return f37821d;
    }

    public final J8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f37822a = bArr;
        this.f37823b = bArr;
        this.f37824c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f37822a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f37822a);
        }
        if (!Arrays.equals(this.f37823b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f37823b);
        }
        K8 k8 = this.f37824c;
        return k8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f37822a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37822a);
        }
        if (!Arrays.equals(this.f37823b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f37823b);
        }
        K8 k8 = this.f37824c;
        if (k8 != null) {
            codedOutputByteBufferNano.writeMessage(3, k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37822a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f37823b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f37824c == null) {
                    this.f37824c = new K8();
                }
                codedInputByteBufferNano.readMessage(this.f37824c);
            }
        }
        return this;
    }

    public static J8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new J8().mergeFrom(codedInputByteBufferNano);
    }

    public static J8 a(byte[] bArr) {
        return (J8) MessageNano.mergeFrom(new J8(), bArr);
    }
}
