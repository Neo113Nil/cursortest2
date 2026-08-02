package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712j9 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f12107g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12108h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12109i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0712j9[] f12110j;

    /* renamed from: a, reason: collision with root package name */
    public C0635g9[] f12111a;

    /* renamed from: b, reason: collision with root package name */
    public C0506b9 f12112b;

    /* renamed from: c, reason: collision with root package name */
    public Y8[] f12113c;

    /* renamed from: d, reason: collision with root package name */
    public C0661h9[] f12114d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f12115e;

    /* renamed from: f, reason: collision with root package name */
    public byte[][] f12116f;

    public C0712j9() {
        a();
    }

    public static C0712j9[] b() {
        if (f12110j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12110j == null) {
                        f12110j = new C0712j9[0];
                    }
                } finally {
                }
            }
        }
        return f12110j;
    }

    public final C0712j9 a() {
        this.f12111a = C0635g9.b();
        this.f12112b = null;
        this.f12113c = Y8.b();
        this.f12114d = C0661h9.b();
        this.f12115e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f12116f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0635g9[] c0635g9Arr = this.f12111a;
        int i4 = 0;
        if (c0635g9Arr != null && c0635g9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0635g9[] c0635g9Arr2 = this.f12111a;
                if (i5 >= c0635g9Arr2.length) {
                    break;
                }
                C0635g9 c0635g9 = c0635g9Arr2[i5];
                if (c0635g9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0635g9) + computeSerializedSize;
                }
                i5++;
            }
        }
        C0506b9 c0506b9 = this.f12112b;
        if (c0506b9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0506b9);
        }
        Y8[] y8Arr = this.f12113c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i6 = 0;
            while (true) {
                Y8[] y8Arr2 = this.f12113c;
                if (i6 >= y8Arr2.length) {
                    break;
                }
                Y8 y8 = y8Arr2[i6];
                if (y8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, y8) + computeSerializedSize;
                }
                i6++;
            }
        }
        C0661h9[] c0661h9Arr = this.f12114d;
        if (c0661h9Arr != null && c0661h9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0661h9[] c0661h9Arr2 = this.f12114d;
                if (i7 >= c0661h9Arr2.length) {
                    break;
                }
                C0661h9 c0661h9 = c0661h9Arr2[i7];
                if (c0661h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0661h9) + computeSerializedSize;
                }
                i7++;
            }
        }
        String[] strArr = this.f12115e;
        if (strArr != null && strArr.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f12115e;
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
        byte[][] bArr = this.f12116f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr2 = this.f12116f;
            if (i4 >= bArr2.length) {
                return computeSerializedSize + i11 + i12;
            }
            byte[] bArr3 = bArr2[i4];
            if (bArr3 != null) {
                i12++;
                i11 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i11;
            }
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0635g9[] c0635g9Arr = this.f12111a;
        int i4 = 0;
        if (c0635g9Arr != null && c0635g9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0635g9[] c0635g9Arr2 = this.f12111a;
                if (i5 >= c0635g9Arr2.length) {
                    break;
                }
                C0635g9 c0635g9 = c0635g9Arr2[i5];
                if (c0635g9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0635g9);
                }
                i5++;
            }
        }
        C0506b9 c0506b9 = this.f12112b;
        if (c0506b9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0506b9);
        }
        Y8[] y8Arr = this.f12113c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i6 = 0;
            while (true) {
                Y8[] y8Arr2 = this.f12113c;
                if (i6 >= y8Arr2.length) {
                    break;
                }
                Y8 y8 = y8Arr2[i6];
                if (y8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, y8);
                }
                i6++;
            }
        }
        C0661h9[] c0661h9Arr = this.f12114d;
        if (c0661h9Arr != null && c0661h9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0661h9[] c0661h9Arr2 = this.f12114d;
                if (i7 >= c0661h9Arr2.length) {
                    break;
                }
                C0661h9 c0661h9 = c0661h9Arr2[i7];
                if (c0661h9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0661h9);
                }
                i7++;
            }
        }
        String[] strArr = this.f12115e;
        if (strArr != null && strArr.length > 0) {
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.f12115e;
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
        byte[][] bArr = this.f12116f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f12116f;
                if (i4 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i4];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0712j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0712j9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0712j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0635g9[] c0635g9Arr = this.f12111a;
                int length = c0635g9Arr == null ? 0 : c0635g9Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0635g9[] c0635g9Arr2 = new C0635g9[i4];
                if (length != 0) {
                    System.arraycopy(c0635g9Arr, 0, c0635g9Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0635g9 c0635g9 = new C0635g9();
                    c0635g9Arr2[length] = c0635g9;
                    codedInputByteBufferNano.readMessage(c0635g9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0635g9 c0635g92 = new C0635g9();
                c0635g9Arr2[length] = c0635g92;
                codedInputByteBufferNano.readMessage(c0635g92);
                this.f12111a = c0635g9Arr2;
            } else if (readTag == 34) {
                if (this.f12112b == null) {
                    this.f12112b = new C0506b9();
                }
                codedInputByteBufferNano.readMessage(this.f12112b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                Y8[] y8Arr = this.f12113c;
                int length2 = y8Arr == null ? 0 : y8Arr.length;
                int i5 = repeatedFieldArrayLength2 + length2;
                Y8[] y8Arr2 = new Y8[i5];
                if (length2 != 0) {
                    System.arraycopy(y8Arr, 0, y8Arr2, 0, length2);
                }
                while (length2 < i5 - 1) {
                    Y8 y8 = new Y8();
                    y8Arr2[length2] = y8;
                    codedInputByteBufferNano.readMessage(y8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                Y8 y82 = new Y8();
                y8Arr2[length2] = y82;
                codedInputByteBufferNano.readMessage(y82);
                this.f12113c = y8Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0661h9[] c0661h9Arr = this.f12114d;
                int length3 = c0661h9Arr == null ? 0 : c0661h9Arr.length;
                int i6 = repeatedFieldArrayLength3 + length3;
                C0661h9[] c0661h9Arr2 = new C0661h9[i6];
                if (length3 != 0) {
                    System.arraycopy(c0661h9Arr, 0, c0661h9Arr2, 0, length3);
                }
                while (length3 < i6 - 1) {
                    C0661h9 c0661h9 = new C0661h9();
                    c0661h9Arr2[length3] = c0661h9;
                    codedInputByteBufferNano.readMessage(c0661h9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0661h9 c0661h92 = new C0661h9();
                c0661h9Arr2[length3] = c0661h92;
                codedInputByteBufferNano.readMessage(c0661h92);
                this.f12114d = c0661h9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f12115e;
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
                this.f12115e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f12116f;
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
                this.f12116f = bArr2;
            }
        }
        return this;
    }

    public static C0712j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0712j9) MessageNano.mergeFrom(new C0712j9(), bArr);
    }
}
