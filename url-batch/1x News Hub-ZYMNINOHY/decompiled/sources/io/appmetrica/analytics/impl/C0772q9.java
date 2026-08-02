package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772q9 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8141g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8142h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8143i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0772q9[] f8144j;

    /* renamed from: a, reason: collision with root package name */
    public C0694n9[] f8145a;

    /* renamed from: b, reason: collision with root package name */
    public C0565i9 f8146b;

    /* renamed from: c, reason: collision with root package name */
    public C0487f9[] f8147c;

    /* renamed from: d, reason: collision with root package name */
    public C0720o9[] f8148d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f8149e;
    public byte[][] f;

    public C0772q9() {
        a();
    }

    public static C0772q9[] b() {
        if (f8144j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8144j == null) {
                        f8144j = new C0772q9[0];
                    }
                } finally {
                }
            }
        }
        return f8144j;
    }

    public final C0772q9 a() {
        this.f8145a = C0694n9.b();
        this.f8146b = null;
        this.f8147c = C0487f9.b();
        this.f8148d = C0720o9.b();
        this.f8149e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0694n9[] c0694n9Arr = this.f8145a;
        int i3 = 0;
        if (c0694n9Arr != null && c0694n9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0694n9[] c0694n9Arr2 = this.f8145a;
                if (i4 >= c0694n9Arr2.length) {
                    break;
                }
                C0694n9 c0694n9 = c0694n9Arr2[i4];
                if (c0694n9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0694n9) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0565i9 c0565i9 = this.f8146b;
        if (c0565i9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0565i9);
        }
        C0487f9[] c0487f9Arr = this.f8147c;
        if (c0487f9Arr != null && c0487f9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0487f9[] c0487f9Arr2 = this.f8147c;
                if (i5 >= c0487f9Arr2.length) {
                    break;
                }
                C0487f9 c0487f9 = c0487f9Arr2[i5];
                if (c0487f9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0487f9) + computeSerializedSize;
                }
                i5++;
            }
        }
        C0720o9[] c0720o9Arr = this.f8148d;
        if (c0720o9Arr != null && c0720o9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0720o9[] c0720o9Arr2 = this.f8148d;
                if (i6 >= c0720o9Arr2.length) {
                    break;
                }
                C0720o9 c0720o9 = c0720o9Arr2[i6];
                if (c0720o9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0720o9) + computeSerializedSize;
                }
                i6++;
            }
        }
        String[] strArr = this.f8149e;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr2 = this.f8149e;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    i9++;
                    i8 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i7++;
            }
            computeSerializedSize = computeSerializedSize + i8 + i9;
        }
        byte[][] bArr = this.f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f;
            if (i3 >= bArr2.length) {
                return computeSerializedSize + i10 + i11;
            }
            byte[] bArr3 = bArr2[i3];
            if (bArr3 != null) {
                i11++;
                i10 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i10;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0694n9[] c0694n9Arr = this.f8145a;
        int i3 = 0;
        if (c0694n9Arr != null && c0694n9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0694n9[] c0694n9Arr2 = this.f8145a;
                if (i4 >= c0694n9Arr2.length) {
                    break;
                }
                C0694n9 c0694n9 = c0694n9Arr2[i4];
                if (c0694n9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0694n9);
                }
                i4++;
            }
        }
        C0565i9 c0565i9 = this.f8146b;
        if (c0565i9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0565i9);
        }
        C0487f9[] c0487f9Arr = this.f8147c;
        if (c0487f9Arr != null && c0487f9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0487f9[] c0487f9Arr2 = this.f8147c;
                if (i5 >= c0487f9Arr2.length) {
                    break;
                }
                C0487f9 c0487f9 = c0487f9Arr2[i5];
                if (c0487f9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0487f9);
                }
                i5++;
            }
        }
        C0720o9[] c0720o9Arr = this.f8148d;
        if (c0720o9Arr != null && c0720o9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0720o9[] c0720o9Arr2 = this.f8148d;
                if (i6 >= c0720o9Arr2.length) {
                    break;
                }
                C0720o9 c0720o9 = c0720o9Arr2[i6];
                if (c0720o9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0720o9);
                }
                i6++;
            }
        }
        String[] strArr = this.f8149e;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f8149e;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i7++;
            }
        }
        byte[][] bArr = this.f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f;
                if (i3 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i3];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0772q9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0772q9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0772q9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0694n9[] c0694n9Arr = this.f8145a;
                int length = c0694n9Arr == null ? 0 : c0694n9Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0694n9[] c0694n9Arr2 = new C0694n9[i3];
                if (length != 0) {
                    System.arraycopy(c0694n9Arr, 0, c0694n9Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0694n9 c0694n9 = new C0694n9();
                    c0694n9Arr2[length] = c0694n9;
                    codedInputByteBufferNano.readMessage(c0694n9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0694n9 c0694n92 = new C0694n9();
                c0694n9Arr2[length] = c0694n92;
                codedInputByteBufferNano.readMessage(c0694n92);
                this.f8145a = c0694n9Arr2;
            } else if (readTag == 34) {
                if (this.f8146b == null) {
                    this.f8146b = new C0565i9();
                }
                codedInputByteBufferNano.readMessage(this.f8146b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0487f9[] c0487f9Arr = this.f8147c;
                int length2 = c0487f9Arr == null ? 0 : c0487f9Arr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                C0487f9[] c0487f9Arr2 = new C0487f9[i4];
                if (length2 != 0) {
                    System.arraycopy(c0487f9Arr, 0, c0487f9Arr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    C0487f9 c0487f9 = new C0487f9();
                    c0487f9Arr2[length2] = c0487f9;
                    codedInputByteBufferNano.readMessage(c0487f9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0487f9 c0487f92 = new C0487f9();
                c0487f9Arr2[length2] = c0487f92;
                codedInputByteBufferNano.readMessage(c0487f92);
                this.f8147c = c0487f9Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0720o9[] c0720o9Arr = this.f8148d;
                int length3 = c0720o9Arr == null ? 0 : c0720o9Arr.length;
                int i5 = repeatedFieldArrayLength3 + length3;
                C0720o9[] c0720o9Arr2 = new C0720o9[i5];
                if (length3 != 0) {
                    System.arraycopy(c0720o9Arr, 0, c0720o9Arr2, 0, length3);
                }
                while (length3 < i5 - 1) {
                    C0720o9 c0720o9 = new C0720o9();
                    c0720o9Arr2[length3] = c0720o9;
                    codedInputByteBufferNano.readMessage(c0720o9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0720o9 c0720o92 = new C0720o9();
                c0720o9Arr2[length3] = c0720o92;
                codedInputByteBufferNano.readMessage(c0720o92);
                this.f8148d = c0720o9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f8149e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i6 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i6];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i6 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f8149e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i7 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i7][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i7 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f = bArr2;
            }
        }
        return this;
    }

    public static C0772q9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0772q9) MessageNano.mergeFrom(new C0772q9(), bArr);
    }
}
