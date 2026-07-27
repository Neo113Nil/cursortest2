package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923q9 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f9072g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9073h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f9074i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0923q9[] f9075j;

    /* renamed from: a, reason: collision with root package name */
    public C0845n9[] f9076a;

    /* renamed from: b, reason: collision with root package name */
    public C0716i9 f9077b;

    /* renamed from: c, reason: collision with root package name */
    public C0638f9[] f9078c;

    /* renamed from: d, reason: collision with root package name */
    public C0871o9[] f9079d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f9080e;

    /* renamed from: f, reason: collision with root package name */
    public byte[][] f9081f;

    public C0923q9() {
        a();
    }

    public static C0923q9[] b() {
        if (f9075j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9075j == null) {
                        f9075j = new C0923q9[0];
                    }
                } finally {
                }
            }
        }
        return f9075j;
    }

    public final C0923q9 a() {
        this.f9076a = C0845n9.b();
        this.f9077b = null;
        this.f9078c = C0638f9.b();
        this.f9079d = C0871o9.b();
        this.f9080e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f9081f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0845n9[] c0845n9Arr = this.f9076a;
        int i2 = 0;
        if (c0845n9Arr != null && c0845n9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0845n9[] c0845n9Arr2 = this.f9076a;
                if (i3 >= c0845n9Arr2.length) {
                    break;
                }
                C0845n9 c0845n9 = c0845n9Arr2[i3];
                if (c0845n9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0845n9) + computeSerializedSize;
                }
                i3++;
            }
        }
        C0716i9 c0716i9 = this.f9077b;
        if (c0716i9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0716i9);
        }
        C0638f9[] c0638f9Arr = this.f9078c;
        if (c0638f9Arr != null && c0638f9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0638f9[] c0638f9Arr2 = this.f9078c;
                if (i6 >= c0638f9Arr2.length) {
                    break;
                }
                C0638f9 c0638f9 = c0638f9Arr2[i6];
                if (c0638f9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0638f9) + computeSerializedSize;
                }
                i6++;
            }
        }
        C0871o9[] c0871o9Arr = this.f9079d;
        if (c0871o9Arr != null && c0871o9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0871o9[] c0871o9Arr2 = this.f9079d;
                if (i7 >= c0871o9Arr2.length) {
                    break;
                }
                C0871o9 c0871o9 = c0871o9Arr2[i7];
                if (c0871o9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0871o9) + computeSerializedSize;
                }
                i7++;
            }
        }
        String[] strArr = this.f9080e;
        if (strArr != null && strArr.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f9080e;
                if (i8 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i8];
                if (str != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i8++;
            }
            computeSerializedSize = computeSerializedSize + i9 + i10;
        }
        byte[][] bArr = this.f9081f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr2 = this.f9081f;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i11 + i12;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i12++;
                i11 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i11;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0845n9[] c0845n9Arr = this.f9076a;
        int i2 = 0;
        if (c0845n9Arr != null && c0845n9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0845n9[] c0845n9Arr2 = this.f9076a;
                if (i3 >= c0845n9Arr2.length) {
                    break;
                }
                C0845n9 c0845n9 = c0845n9Arr2[i3];
                if (c0845n9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0845n9);
                }
                i3++;
            }
        }
        C0716i9 c0716i9 = this.f9077b;
        if (c0716i9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0716i9);
        }
        C0638f9[] c0638f9Arr = this.f9078c;
        if (c0638f9Arr != null && c0638f9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0638f9[] c0638f9Arr2 = this.f9078c;
                if (i6 >= c0638f9Arr2.length) {
                    break;
                }
                C0638f9 c0638f9 = c0638f9Arr2[i6];
                if (c0638f9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0638f9);
                }
                i6++;
            }
        }
        C0871o9[] c0871o9Arr = this.f9079d;
        if (c0871o9Arr != null && c0871o9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0871o9[] c0871o9Arr2 = this.f9079d;
                if (i7 >= c0871o9Arr2.length) {
                    break;
                }
                C0871o9 c0871o9 = c0871o9Arr2[i7];
                if (c0871o9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0871o9);
                }
                i7++;
            }
        }
        String[] strArr = this.f9080e;
        if (strArr != null && strArr.length > 0) {
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.f9080e;
                if (i8 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i8];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i8++;
            }
        }
        byte[][] bArr = this.f9081f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f9081f;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0923q9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0923q9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0923q9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0845n9[] c0845n9Arr = this.f9076a;
                int length = c0845n9Arr == null ? 0 : c0845n9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0845n9[] c0845n9Arr2 = new C0845n9[i2];
                if (length != 0) {
                    System.arraycopy(c0845n9Arr, 0, c0845n9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0845n9 c0845n9 = new C0845n9();
                    c0845n9Arr2[length] = c0845n9;
                    codedInputByteBufferNano.readMessage(c0845n9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0845n9 c0845n92 = new C0845n9();
                c0845n9Arr2[length] = c0845n92;
                codedInputByteBufferNano.readMessage(c0845n92);
                this.f9076a = c0845n9Arr2;
            } else if (readTag == 34) {
                if (this.f9077b == null) {
                    this.f9077b = new C0716i9();
                }
                codedInputByteBufferNano.readMessage(this.f9077b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0638f9[] c0638f9Arr = this.f9078c;
                int length2 = c0638f9Arr == null ? 0 : c0638f9Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                C0638f9[] c0638f9Arr2 = new C0638f9[i3];
                if (length2 != 0) {
                    System.arraycopy(c0638f9Arr, 0, c0638f9Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    C0638f9 c0638f9 = new C0638f9();
                    c0638f9Arr2[length2] = c0638f9;
                    codedInputByteBufferNano.readMessage(c0638f9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0638f9 c0638f92 = new C0638f9();
                c0638f9Arr2[length2] = c0638f92;
                codedInputByteBufferNano.readMessage(c0638f92);
                this.f9078c = c0638f9Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0871o9[] c0871o9Arr = this.f9079d;
                int length3 = c0871o9Arr == null ? 0 : c0871o9Arr.length;
                int i6 = repeatedFieldArrayLength3 + length3;
                C0871o9[] c0871o9Arr2 = new C0871o9[i6];
                if (length3 != 0) {
                    System.arraycopy(c0871o9Arr, 0, c0871o9Arr2, 0, length3);
                }
                while (length3 < i6 - 1) {
                    C0871o9 c0871o9 = new C0871o9();
                    c0871o9Arr2[length3] = c0871o9;
                    codedInputByteBufferNano.readMessage(c0871o9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0871o9 c0871o92 = new C0871o9();
                c0871o9Arr2[length3] = c0871o92;
                codedInputByteBufferNano.readMessage(c0871o92);
                this.f9079d = c0871o9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f9080e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i7 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i7];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i7 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f9080e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f9081f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i8 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i8][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i8 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f9081f = bArr2;
            }
        }
    }

    public static C0923q9 a(byte[] bArr) {
        return (C0923q9) MessageNano.mergeFrom(new C0923q9(), bArr);
    }
}
