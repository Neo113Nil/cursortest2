package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Am extends MessageNano {

    /* renamed from: D, reason: collision with root package name */
    public static final int f5763D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f5764E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f5765F = 1;

    /* renamed from: G, reason: collision with root package name */
    public static volatile Am[] f5766G;

    /* renamed from: A, reason: collision with root package name */
    public C0991ym f5767A;

    /* renamed from: B, reason: collision with root package name */
    public C0940wm[] f5768B;

    /* renamed from: C, reason: collision with root package name */
    public C0888um f5769C;

    /* renamed from: a, reason: collision with root package name */
    public String f5770a;

    /* renamed from: b, reason: collision with root package name */
    public long f5771b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f5772c;

    /* renamed from: d, reason: collision with root package name */
    public String f5773d;

    /* renamed from: e, reason: collision with root package name */
    public String f5774e;
    public String[] f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f5775g;

    /* renamed from: h, reason: collision with root package name */
    public C0862tm[] f5776h;

    /* renamed from: i, reason: collision with root package name */
    public C0914vm f5777i;

    /* renamed from: j, reason: collision with root package name */
    public String f5778j;

    /* renamed from: k, reason: collision with root package name */
    public String f5779k;

    /* renamed from: l, reason: collision with root package name */
    public String f5780l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5781m;

    /* renamed from: n, reason: collision with root package name */
    public String f5782n;
    public String[] o;

    /* renamed from: p, reason: collision with root package name */
    public C1016zm f5783p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5784q;

    /* renamed from: r, reason: collision with root package name */
    public String f5785r;

    /* renamed from: s, reason: collision with root package name */
    public long f5786s;

    /* renamed from: t, reason: collision with root package name */
    public long f5787t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5788u;
    public C0966xm v;

    /* renamed from: w, reason: collision with root package name */
    public int f5789w;

    /* renamed from: x, reason: collision with root package name */
    public int f5790x;

    /* renamed from: y, reason: collision with root package name */
    public C0836sm f5791y;
    public C0810rm z;

    public Am() {
        a();
    }

    public static Am[] b() {
        if (f5766G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5766G == null) {
                        f5766G = new Am[0];
                    }
                } finally {
                }
            }
        }
        return f5766G;
    }

    public final Am a() {
        this.f5770a = "";
        this.f5771b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f5772c = strArr;
        this.f5773d = "";
        this.f5774e = "";
        this.f = strArr;
        this.f5775g = strArr;
        this.f5776h = C0862tm.b();
        this.f5777i = null;
        this.f5778j = "";
        this.f5779k = "";
        this.f5780l = "";
        this.f5781m = false;
        this.f5782n = "";
        this.o = strArr;
        this.f5783p = null;
        this.f5784q = false;
        this.f5785r = "";
        this.f5786s = 0L;
        this.f5787t = 0L;
        this.f5788u = false;
        this.v = null;
        this.f5789w = 600;
        this.f5790x = 1;
        this.f5791y = null;
        this.z = null;
        this.f5767A = null;
        this.f5768B = C0940wm.b();
        this.f5769C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5770a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5770a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f5771b) + computeSerializedSize;
        String[] strArr = this.f5772c;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.f5772c;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i4++;
            }
            computeInt64Size = computeInt64Size + i5 + i6;
        }
        if (!this.f5773d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f5773d);
        }
        if (!this.f5774e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f5774e);
        }
        String[] strArr3 = this.f;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr4 = this.f;
                if (i7 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i7];
                if (str2 != null) {
                    i9++;
                    i8 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i7++;
            }
            computeInt64Size = computeInt64Size + i8 + i9;
        }
        String[] strArr5 = this.f5775g;
        if (strArr5 != null && strArr5.length > 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                String[] strArr6 = this.f5775g;
                if (i10 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i10];
                if (str3 != null) {
                    i12++;
                    i11 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i10++;
            }
            computeInt64Size = computeInt64Size + i11 + i12;
        }
        C0862tm[] c0862tmArr = this.f5776h;
        if (c0862tmArr != null && c0862tmArr.length > 0) {
            int i13 = 0;
            while (true) {
                C0862tm[] c0862tmArr2 = this.f5776h;
                if (i13 >= c0862tmArr2.length) {
                    break;
                }
                C0862tm c0862tm = c0862tmArr2[i13];
                if (c0862tm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c0862tm) + computeInt64Size;
                }
                i13++;
            }
        }
        C0914vm c0914vm = this.f5777i;
        if (c0914vm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c0914vm);
        }
        if (!this.f5778j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f5778j);
        }
        if (!this.f5779k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f5779k);
        }
        if (!this.f5780l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f5780l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f5781m) + computeInt64Size;
        if (!this.f5782n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f5782n);
        }
        String[] strArr7 = this.o;
        if (strArr7 != null && strArr7.length > 0) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr8 = this.o;
                if (i14 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i14];
                if (str4 != null) {
                    i16++;
                    i15 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i14++;
            }
            computeBoolSize = computeBoolSize + i15 + i16;
        }
        C1016zm c1016zm = this.f5783p;
        if (c1016zm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c1016zm);
        }
        boolean z = this.f5784q;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.f5785r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f5785r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f5787t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f5786s) + computeBoolSize;
        boolean z2 = this.f5788u;
        if (z2) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        C0966xm c0966xm = this.v;
        if (c0966xm != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c0966xm);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f5790x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f5789w) + computeInt64Size2;
        C0836sm c0836sm = this.f5791y;
        if (c0836sm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0836sm);
        }
        C0810rm c0810rm = this.z;
        if (c0810rm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0810rm);
        }
        C0991ym c0991ym = this.f5767A;
        if (c0991ym != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c0991ym);
        }
        C0940wm[] c0940wmArr = this.f5768B;
        if (c0940wmArr != null && c0940wmArr.length > 0) {
            while (true) {
                C0940wm[] c0940wmArr2 = this.f5768B;
                if (i3 >= c0940wmArr2.length) {
                    break;
                }
                C0940wm c0940wm = c0940wmArr2[i3];
                if (c0940wm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c0940wm) + computeInt32Size;
                }
                i3++;
            }
        }
        C0888um c0888um = this.f5769C;
        return c0888um != null ? CodedOutputByteBufferNano.computeMessageSize(32, c0888um) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f5770a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5770a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f5771b);
        String[] strArr = this.f5772c;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f5772c;
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
        if (!this.f5773d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5773d);
        }
        if (!this.f5774e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f5774e);
        }
        String[] strArr3 = this.f;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i5++;
            }
        }
        String[] strArr5 = this.f5775g;
        if (strArr5 != null && strArr5.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr6 = this.f5775g;
                if (i6 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i6];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i6++;
            }
        }
        C0862tm[] c0862tmArr = this.f5776h;
        if (c0862tmArr != null && c0862tmArr.length > 0) {
            int i7 = 0;
            while (true) {
                C0862tm[] c0862tmArr2 = this.f5776h;
                if (i7 >= c0862tmArr2.length) {
                    break;
                }
                C0862tm c0862tm = c0862tmArr2[i7];
                if (c0862tm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0862tm);
                }
                i7++;
            }
        }
        C0914vm c0914vm = this.f5777i;
        if (c0914vm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0914vm);
        }
        if (!this.f5778j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f5778j);
        }
        if (!this.f5779k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f5779k);
        }
        if (!this.f5780l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f5780l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f5781m);
        if (!this.f5782n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f5782n);
        }
        String[] strArr7 = this.o;
        if (strArr7 != null && strArr7.length > 0) {
            int i8 = 0;
            while (true) {
                String[] strArr8 = this.o;
                if (i8 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i8];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i8++;
            }
        }
        C1016zm c1016zm = this.f5783p;
        if (c1016zm != null) {
            codedOutputByteBufferNano.writeMessage(16, c1016zm);
        }
        boolean z = this.f5784q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.f5785r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f5785r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f5786s);
        codedOutputByteBufferNano.writeInt64(22, this.f5787t);
        boolean z2 = this.f5788u;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        C0966xm c0966xm = this.v;
        if (c0966xm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0966xm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f5789w);
        codedOutputByteBufferNano.writeInt32(26, this.f5790x);
        C0836sm c0836sm = this.f5791y;
        if (c0836sm != null) {
            codedOutputByteBufferNano.writeMessage(27, c0836sm);
        }
        C0810rm c0810rm = this.z;
        if (c0810rm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0810rm);
        }
        C0991ym c0991ym = this.f5767A;
        if (c0991ym != null) {
            codedOutputByteBufferNano.writeMessage(30, c0991ym);
        }
        C0940wm[] c0940wmArr = this.f5768B;
        if (c0940wmArr != null && c0940wmArr.length > 0) {
            while (true) {
                C0940wm[] c0940wmArr2 = this.f5768B;
                if (i3 >= c0940wmArr2.length) {
                    break;
                }
                C0940wm c0940wm = c0940wmArr2[i3];
                if (c0940wm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0940wm);
                }
                i3++;
            }
        }
        C0888um c0888um = this.f5769C;
        if (c0888um != null) {
            codedOutputByteBufferNano.writeMessage(32, c0888um);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Am b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Am().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f5770a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f5771b = codedInputByteBufferNano.readInt64();
                    break;
                case C0642l9.f7781G /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f5772c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i3];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f5772c = strArr2;
                    break;
                case 34:
                    this.f5773d = codedInputByteBufferNano.readString();
                    break;
                case C0642l9.f7786M /* 42 */:
                    this.f5774e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i4 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i4];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f5775g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i5 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i5];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i5 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f5775g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C0862tm[] c0862tmArr = this.f5776h;
                    int length4 = c0862tmArr == null ? 0 : c0862tmArr.length;
                    int i6 = repeatedFieldArrayLength4 + length4;
                    C0862tm[] c0862tmArr2 = new C0862tm[i6];
                    if (length4 != 0) {
                        System.arraycopy(c0862tmArr, 0, c0862tmArr2, 0, length4);
                    }
                    while (length4 < i6 - 1) {
                        C0862tm c0862tm = new C0862tm();
                        c0862tmArr2[length4] = c0862tm;
                        codedInputByteBufferNano.readMessage(c0862tm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C0862tm c0862tm2 = new C0862tm();
                    c0862tmArr2[length4] = c0862tm2;
                    codedInputByteBufferNano.readMessage(c0862tm2);
                    this.f5776h = c0862tmArr2;
                    break;
                case 74:
                    if (this.f5777i == null) {
                        this.f5777i = new C0914vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5777i);
                    break;
                case 82:
                    this.f5778j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f5779k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f5780l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f5781m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f5782n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i7 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i7];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i7 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.o = strArr8;
                    break;
                case 130:
                    if (this.f5783p == null) {
                        this.f5783p = new C1016zm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5783p);
                    break;
                case 136:
                    this.f5784q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f5785r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f5786s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f5787t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f5788u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.v == null) {
                        this.v = new C0966xm();
                    }
                    codedInputByteBufferNano.readMessage(this.v);
                    break;
                case 200:
                    this.f5789w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f5790x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f5791y == null) {
                        this.f5791y = new C0836sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5791y);
                    break;
                case 234:
                    if (this.z == null) {
                        this.z = new C0810rm();
                    }
                    codedInputByteBufferNano.readMessage(this.z);
                    break;
                case 242:
                    if (this.f5767A == null) {
                        this.f5767A = new C0991ym();
                    }
                    codedInputByteBufferNano.readMessage(this.f5767A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C0940wm[] c0940wmArr = this.f5768B;
                    int length6 = c0940wmArr == null ? 0 : c0940wmArr.length;
                    int i8 = repeatedFieldArrayLength6 + length6;
                    C0940wm[] c0940wmArr2 = new C0940wm[i8];
                    if (length6 != 0) {
                        System.arraycopy(c0940wmArr, 0, c0940wmArr2, 0, length6);
                    }
                    while (length6 < i8 - 1) {
                        C0940wm c0940wm = new C0940wm();
                        c0940wmArr2[length6] = c0940wm;
                        codedInputByteBufferNano.readMessage(c0940wm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C0940wm c0940wm2 = new C0940wm();
                    c0940wmArr2[length6] = c0940wm2;
                    codedInputByteBufferNano.readMessage(c0940wm2);
                    this.f5768B = c0940wmArr2;
                    break;
                case 258:
                    if (this.f5769C == null) {
                        this.f5769C = new C0888um();
                    }
                    codedInputByteBufferNano.readMessage(this.f5769C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static Am a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Am) MessageNano.mergeFrom(new Am(), bArr);
    }
}
