package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657g2 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0657g2[] f8218d;

    /* renamed from: a, reason: collision with root package name */
    public C0631f2[] f8219a;

    /* renamed from: b, reason: collision with root package name */
    public C0605e2 f8220b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f8221c;

    public C0657g2() {
        a();
    }

    public static C0657g2[] b() {
        if (f8218d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8218d == null) {
                        f8218d = new C0657g2[0];
                    }
                } finally {
                }
            }
        }
        return f8218d;
    }

    public final C0657g2 a() {
        this.f8219a = C0631f2.b();
        this.f8220b = null;
        this.f8221c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0631f2[] c0631f2Arr = this.f8219a;
        int i2 = 0;
        if (c0631f2Arr != null && c0631f2Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0631f2[] c0631f2Arr2 = this.f8219a;
                if (i3 >= c0631f2Arr2.length) {
                    break;
                }
                C0631f2 c0631f2 = c0631f2Arr2[i3];
                if (c0631f2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0631f2) + computeSerializedSize;
                }
                i3++;
            }
        }
        C0605e2 c0605e2 = this.f8220b;
        if (c0605e2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0605e2);
        }
        String[] strArr = this.f8221c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f8221c;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i6 + i7;
            }
            String str = strArr2[i2];
            if (str != null) {
                i7++;
                i6 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i6;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0631f2[] c0631f2Arr = this.f8219a;
        int i2 = 0;
        if (c0631f2Arr != null && c0631f2Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0631f2[] c0631f2Arr2 = this.f8219a;
                if (i3 >= c0631f2Arr2.length) {
                    break;
                }
                C0631f2 c0631f2 = c0631f2Arr2[i3];
                if (c0631f2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0631f2);
                }
                i3++;
            }
        }
        C0605e2 c0605e2 = this.f8220b;
        if (c0605e2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0605e2);
        }
        String[] strArr = this.f8221c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f8221c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0657g2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0631f2[] c0631f2Arr = this.f8219a;
                int length = c0631f2Arr == null ? 0 : c0631f2Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0631f2[] c0631f2Arr2 = new C0631f2[i2];
                if (length != 0) {
                    System.arraycopy(c0631f2Arr, 0, c0631f2Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0631f2 c0631f2 = new C0631f2();
                    c0631f2Arr2[length] = c0631f2;
                    codedInputByteBufferNano.readMessage(c0631f2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0631f2 c0631f22 = new C0631f2();
                c0631f2Arr2[length] = c0631f22;
                codedInputByteBufferNano.readMessage(c0631f22);
                this.f8219a = c0631f2Arr2;
            } else if (readTag == 18) {
                if (this.f8220b == null) {
                    this.f8220b = new C0605e2();
                }
                codedInputByteBufferNano.readMessage(this.f8220b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f8221c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i3];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f8221c = strArr2;
            }
        }
    }

    public static C0657g2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0657g2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0657g2 a(byte[] bArr) {
        return (C0657g2) MessageNano.mergeFrom(new C0657g2(), bArr);
    }
}
