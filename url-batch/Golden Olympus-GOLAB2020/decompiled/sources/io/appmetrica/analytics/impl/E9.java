package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class E9 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f37420f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37421g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f37422h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static volatile E9[] f37423i;

    /* renamed from: a, reason: collision with root package name */
    public B9[] f37424a;

    /* renamed from: b, reason: collision with root package name */
    public C3061w9 f37425b;

    /* renamed from: c, reason: collision with root package name */
    public C2983t9[] f37426c;

    /* renamed from: d, reason: collision with root package name */
    public C9[] f37427d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f37428e;

    public E9() {
        a();
    }

    public static E9[] b() {
        if (f37423i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37423i == null) {
                        f37423i = new E9[0];
                    }
                } finally {
                }
            }
        }
        return f37423i;
    }

    public final E9 a() {
        this.f37424a = B9.b();
        this.f37425b = null;
        this.f37426c = C2983t9.b();
        this.f37427d = C9.b();
        this.f37428e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        B9[] b9Arr = this.f37424a;
        int i4 = 0;
        if (b9Arr != null && b9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                B9[] b9Arr2 = this.f37424a;
                if (i5 >= b9Arr2.length) {
                    break;
                }
                B9 b9 = b9Arr2[i5];
                if (b9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, b9) + computeSerializedSize;
                }
                i5++;
            }
        }
        C3061w9 c3061w9 = this.f37425b;
        if (c3061w9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c3061w9);
        }
        C2983t9[] c2983t9Arr = this.f37426c;
        if (c2983t9Arr != null && c2983t9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C2983t9[] c2983t9Arr2 = this.f37426c;
                if (i6 >= c2983t9Arr2.length) {
                    break;
                }
                C2983t9 c2983t9 = c2983t9Arr2[i6];
                if (c2983t9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c2983t9) + computeSerializedSize;
                }
                i6++;
            }
        }
        C9[] c9Arr = this.f37427d;
        if (c9Arr != null && c9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C9[] c9Arr2 = this.f37427d;
                if (i7 >= c9Arr2.length) {
                    break;
                }
                C9 c9 = c9Arr2[i7];
                if (c9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c9) + computeSerializedSize;
                }
                i7++;
            }
        }
        String[] strArr = this.f37428e;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr2 = this.f37428e;
            if (i4 >= strArr2.length) {
                return computeSerializedSize + i8 + i9;
            }
            String str = strArr2[i4];
            if (str != null) {
                i9++;
                i8 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i8;
            }
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        B9[] b9Arr = this.f37424a;
        int i4 = 0;
        if (b9Arr != null && b9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                B9[] b9Arr2 = this.f37424a;
                if (i5 >= b9Arr2.length) {
                    break;
                }
                B9 b9 = b9Arr2[i5];
                if (b9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, b9);
                }
                i5++;
            }
        }
        C3061w9 c3061w9 = this.f37425b;
        if (c3061w9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3061w9);
        }
        C2983t9[] c2983t9Arr = this.f37426c;
        if (c2983t9Arr != null && c2983t9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C2983t9[] c2983t9Arr2 = this.f37426c;
                if (i6 >= c2983t9Arr2.length) {
                    break;
                }
                C2983t9 c2983t9 = c2983t9Arr2[i6];
                if (c2983t9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c2983t9);
                }
                i6++;
            }
        }
        C9[] c9Arr = this.f37427d;
        if (c9Arr != null && c9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C9[] c9Arr2 = this.f37427d;
                if (i7 >= c9Arr2.length) {
                    break;
                }
                C9 c9 = c9Arr2[i7];
                if (c9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c9);
                }
                i7++;
            }
        }
        String[] strArr = this.f37428e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f37428e;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static E9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new E9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                B9[] b9Arr = this.f37424a;
                int length = b9Arr == null ? 0 : b9Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                B9[] b9Arr2 = new B9[i4];
                if (length != 0) {
                    System.arraycopy(b9Arr, 0, b9Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    B9 b9 = new B9();
                    b9Arr2[length] = b9;
                    codedInputByteBufferNano.readMessage(b9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                B9 b92 = new B9();
                b9Arr2[length] = b92;
                codedInputByteBufferNano.readMessage(b92);
                this.f37424a = b9Arr2;
            } else if (readTag == 34) {
                if (this.f37425b == null) {
                    this.f37425b = new C3061w9();
                }
                codedInputByteBufferNano.readMessage(this.f37425b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C2983t9[] c2983t9Arr = this.f37426c;
                int length2 = c2983t9Arr == null ? 0 : c2983t9Arr.length;
                int i5 = repeatedFieldArrayLength2 + length2;
                C2983t9[] c2983t9Arr2 = new C2983t9[i5];
                if (length2 != 0) {
                    System.arraycopy(c2983t9Arr, 0, c2983t9Arr2, 0, length2);
                }
                while (length2 < i5 - 1) {
                    C2983t9 c2983t9 = new C2983t9();
                    c2983t9Arr2[length2] = c2983t9;
                    codedInputByteBufferNano.readMessage(c2983t9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C2983t9 c2983t92 = new C2983t9();
                c2983t9Arr2[length2] = c2983t92;
                codedInputByteBufferNano.readMessage(c2983t92);
                this.f37426c = c2983t9Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C9[] c9Arr = this.f37427d;
                int length3 = c9Arr == null ? 0 : c9Arr.length;
                int i6 = repeatedFieldArrayLength3 + length3;
                C9[] c9Arr2 = new C9[i6];
                if (length3 != 0) {
                    System.arraycopy(c9Arr, 0, c9Arr2, 0, length3);
                }
                while (length3 < i6 - 1) {
                    C9 c9 = new C9();
                    c9Arr2[length3] = c9;
                    codedInputByteBufferNano.readMessage(c9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C9 c92 = new C9();
                c9Arr2[length3] = c92;
                codedInputByteBufferNano.readMessage(c92);
                this.f37427d = c9Arr2;
            } else if (readTag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f37428e;
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
                this.f37428e = strArr2;
            }
        }
        return this;
    }

    public static E9 a(byte[] bArr) {
        return (E9) MessageNano.mergeFrom(new E9(), bArr);
    }
}
