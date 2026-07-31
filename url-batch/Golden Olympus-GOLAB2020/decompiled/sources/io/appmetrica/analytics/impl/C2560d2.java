package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2560d2 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C2560d2[] f38812d;

    /* renamed from: a, reason: collision with root package name */
    public C2533c2[] f38813a;

    /* renamed from: b, reason: collision with root package name */
    public C2506b2 f38814b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f38815c;

    public C2560d2() {
        a();
    }

    public static C2560d2[] b() {
        if (f38812d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38812d == null) {
                        f38812d = new C2560d2[0];
                    }
                } finally {
                }
            }
        }
        return f38812d;
    }

    public final C2560d2 a() {
        this.f38813a = C2533c2.b();
        this.f38814b = null;
        this.f38815c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2533c2[] c2533c2Arr = this.f38813a;
        int i4 = 0;
        if (c2533c2Arr != null && c2533c2Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C2533c2[] c2533c2Arr2 = this.f38813a;
                if (i5 >= c2533c2Arr2.length) {
                    break;
                }
                C2533c2 c2533c2 = c2533c2Arr2[i5];
                if (c2533c2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c2533c2) + computeSerializedSize;
                }
                i5++;
            }
        }
        C2506b2 c2506b2 = this.f38814b;
        if (c2506b2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2506b2);
        }
        String[] strArr = this.f38815c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f38815c;
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
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2533c2[] c2533c2Arr = this.f38813a;
        int i4 = 0;
        if (c2533c2Arr != null && c2533c2Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C2533c2[] c2533c2Arr2 = this.f38813a;
                if (i5 >= c2533c2Arr2.length) {
                    break;
                }
                C2533c2 c2533c2 = c2533c2Arr2[i5];
                if (c2533c2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c2533c2);
                }
                i5++;
            }
        }
        C2506b2 c2506b2 = this.f38814b;
        if (c2506b2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2506b2);
        }
        String[] strArr = this.f38815c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f38815c;
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
    public final C2560d2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C2533c2[] c2533c2Arr = this.f38813a;
                int length = c2533c2Arr == null ? 0 : c2533c2Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C2533c2[] c2533c2Arr2 = new C2533c2[i4];
                if (length != 0) {
                    System.arraycopy(c2533c2Arr, 0, c2533c2Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C2533c2 c2533c2 = new C2533c2();
                    c2533c2Arr2[length] = c2533c2;
                    codedInputByteBufferNano.readMessage(c2533c2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C2533c2 c2533c22 = new C2533c2();
                c2533c2Arr2[length] = c2533c22;
                codedInputByteBufferNano.readMessage(c2533c22);
                this.f38813a = c2533c2Arr2;
            } else if (readTag == 18) {
                if (this.f38814b == null) {
                    this.f38814b = new C2506b2();
                }
                codedInputByteBufferNano.readMessage(this.f38814b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f38815c;
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
                this.f38815c = strArr2;
            }
        }
        return this;
    }

    public static C2560d2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2560d2().mergeFrom(codedInputByteBufferNano);
    }

    public static C2560d2 a(byte[] bArr) {
        return (C2560d2) MessageNano.mergeFrom(new C2560d2(), bArr);
    }
}
