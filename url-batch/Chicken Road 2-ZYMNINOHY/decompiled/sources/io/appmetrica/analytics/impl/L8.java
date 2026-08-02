package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class L8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile L8[] f10582b;

    /* renamed from: a, reason: collision with root package name */
    public K8[] f10583a;

    public L8() {
        a();
    }

    public static L8[] b() {
        if (f10582b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10582b == null) {
                        f10582b = new L8[0];
                    }
                } finally {
                }
            }
        }
        return f10582b;
    }

    public final L8 a() {
        this.f10583a = K8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        K8[] k8Arr = this.f10583a;
        if (k8Arr != null && k8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                K8[] k8Arr2 = this.f10583a;
                if (i4 >= k8Arr2.length) {
                    break;
                }
                K8 k8 = k8Arr2[i4];
                if (k8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, k8) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        K8[] k8Arr = this.f10583a;
        if (k8Arr != null && k8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                K8[] k8Arr2 = this.f10583a;
                if (i4 >= k8Arr2.length) {
                    break;
                }
                K8 k8 = k8Arr2[i4];
                if (k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, k8);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                K8[] k8Arr = this.f10583a;
                int length = k8Arr == null ? 0 : k8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                K8[] k8Arr2 = new K8[i4];
                if (length != 0) {
                    System.arraycopy(k8Arr, 0, k8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    K8 k8 = new K8();
                    k8Arr2[length] = k8;
                    codedInputByteBufferNano.readMessage(k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                K8 k82 = new K8();
                k8Arr2[length] = k82;
                codedInputByteBufferNano.readMessage(k82);
                this.f10583a = k8Arr2;
            }
        }
        return this;
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L8().mergeFrom(codedInputByteBufferNano);
    }

    public static L8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (L8) MessageNano.mergeFrom(new L8(), bArr);
    }
}
