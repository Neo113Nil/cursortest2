package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class X1 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile X1[] f11218d;

    /* renamed from: a, reason: collision with root package name */
    public W1[] f11219a;

    /* renamed from: b, reason: collision with root package name */
    public V1 f11220b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f11221c;

    public X1() {
        a();
    }

    public static X1[] b() {
        if (f11218d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11218d == null) {
                        f11218d = new X1[0];
                    }
                } finally {
                }
            }
        }
        return f11218d;
    }

    public final X1 a() {
        this.f11219a = W1.b();
        this.f11220b = null;
        this.f11221c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        W1[] w1Arr = this.f11219a;
        int i4 = 0;
        if (w1Arr != null && w1Arr.length > 0) {
            int i5 = 0;
            while (true) {
                W1[] w1Arr2 = this.f11219a;
                if (i5 >= w1Arr2.length) {
                    break;
                }
                W1 w12 = w1Arr2[i5];
                if (w12 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, w12) + computeSerializedSize;
                }
                i5++;
            }
        }
        V1 v12 = this.f11220b;
        if (v12 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, v12);
        }
        String[] strArr = this.f11221c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f11221c;
            if (i4 >= strArr2.length) {
                return computeSerializedSize + i6 + i7;
            }
            String str = strArr2[i4];
            if (str != null) {
                i7++;
                i6 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i6;
            }
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        W1[] w1Arr = this.f11219a;
        int i4 = 0;
        if (w1Arr != null && w1Arr.length > 0) {
            int i5 = 0;
            while (true) {
                W1[] w1Arr2 = this.f11219a;
                if (i5 >= w1Arr2.length) {
                    break;
                }
                W1 w12 = w1Arr2[i5];
                if (w12 != null) {
                    codedOutputByteBufferNano.writeMessage(1, w12);
                }
                i5++;
            }
        }
        V1 v12 = this.f11220b;
        if (v12 != null) {
            codedOutputByteBufferNano.writeMessage(2, v12);
        }
        String[] strArr = this.f11221c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f11221c;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                W1[] w1Arr = this.f11219a;
                int length = w1Arr == null ? 0 : w1Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                W1[] w1Arr2 = new W1[i4];
                if (length != 0) {
                    System.arraycopy(w1Arr, 0, w1Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    W1 w12 = new W1();
                    w1Arr2[length] = w12;
                    codedInputByteBufferNano.readMessage(w12);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                W1 w13 = new W1();
                w1Arr2[length] = w13;
                codedInputByteBufferNano.readMessage(w13);
                this.f11219a = w1Arr2;
            } else if (readTag == 18) {
                if (this.f11220b == null) {
                    this.f11220b = new V1();
                }
                codedInputByteBufferNano.readMessage(this.f11220b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f11221c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i5 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i5];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i5 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f11221c = strArr2;
            }
        }
        return this;
    }

    public static X1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X1().mergeFrom(codedInputByteBufferNano);
    }

    public static X1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X1) MessageNano.mergeFrom(new X1(), bArr);
    }
}
