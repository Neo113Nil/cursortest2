package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3100xm extends MessageNano {

    /* renamed from: E, reason: collision with root package name */
    public static final int f40204E = -1;

    /* renamed from: F, reason: collision with root package name */
    public static final int f40205F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static final int f40206G = 1;

    /* renamed from: H, reason: collision with root package name */
    public static volatile C3100xm[] f40207H;

    /* renamed from: A, reason: collision with root package name */
    public C2841nm f40208A;

    /* renamed from: B, reason: collision with root package name */
    public C3048vm f40209B;

    /* renamed from: C, reason: collision with root package name */
    public C2996tm[] f40210C;

    /* renamed from: D, reason: collision with root package name */
    public C2944rm f40211D;

    /* renamed from: a, reason: collision with root package name */
    public String f40212a;

    /* renamed from: b, reason: collision with root package name */
    public long f40213b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f40214c;

    /* renamed from: d, reason: collision with root package name */
    public String f40215d;

    /* renamed from: e, reason: collision with root package name */
    public String f40216e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f40217f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f40218g;

    /* renamed from: h, reason: collision with root package name */
    public C2919qm[] f40219h;

    /* renamed from: i, reason: collision with root package name */
    public C2970sm f40220i;

    /* renamed from: j, reason: collision with root package name */
    public String f40221j;

    /* renamed from: k, reason: collision with root package name */
    public String f40222k;

    /* renamed from: l, reason: collision with root package name */
    public String f40223l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40224m;

    /* renamed from: n, reason: collision with root package name */
    public String f40225n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f40226o;

    /* renamed from: p, reason: collision with root package name */
    public C3074wm f40227p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f40228q;

    /* renamed from: r, reason: collision with root package name */
    public String f40229r;

    /* renamed from: s, reason: collision with root package name */
    public long f40230s;

    /* renamed from: t, reason: collision with root package name */
    public long f40231t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40232u;

    /* renamed from: v, reason: collision with root package name */
    public C3022um f40233v;

    /* renamed from: w, reason: collision with root package name */
    public int f40234w;

    /* renamed from: x, reason: collision with root package name */
    public int f40235x;

    /* renamed from: y, reason: collision with root package name */
    public C2893pm f40236y;

    /* renamed from: z, reason: collision with root package name */
    public C2867om f40237z;

    public C3100xm() {
        a();
    }

    public static C3100xm[] b() {
        if (f40207H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40207H == null) {
                        f40207H = new C3100xm[0];
                    }
                } finally {
                }
            }
        }
        return f40207H;
    }

    public final C3100xm a() {
        this.f40212a = "";
        this.f40213b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f40214c = strArr;
        this.f40215d = "";
        this.f40216e = "";
        this.f40217f = strArr;
        this.f40218g = strArr;
        this.f40219h = C2919qm.b();
        this.f40220i = null;
        this.f40221j = "";
        this.f40222k = "";
        this.f40223l = "";
        this.f40224m = false;
        this.f40225n = "";
        this.f40226o = strArr;
        this.f40227p = null;
        this.f40228q = false;
        this.f40229r = "";
        this.f40230s = 0L;
        this.f40231t = 0L;
        this.f40232u = false;
        this.f40233v = null;
        this.f40234w = 600;
        this.f40235x = 1;
        this.f40236y = null;
        this.f40237z = null;
        this.f40208A = null;
        this.f40209B = null;
        this.f40210C = C2996tm.b();
        this.f40211D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f40212a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f40212a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f40213b) + computeSerializedSize;
        String[] strArr = this.f40214c;
        int i4 = 0;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f40214c;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i5];
                if (str != null) {
                    i7++;
                    i6 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i5++;
            }
            computeInt64Size = computeInt64Size + i6 + i7;
        }
        if (!this.f40215d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f40215d);
        }
        if (!this.f40216e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f40216e);
        }
        String[] strArr3 = this.f40217f;
        if (strArr3 != null && strArr3.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr4 = this.f40217f;
                if (i8 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i8];
                if (str2 != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i8++;
            }
            computeInt64Size = computeInt64Size + i9 + i10;
        }
        String[] strArr5 = this.f40218g;
        if (strArr5 != null && strArr5.length > 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f40218g;
                if (i11 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i11];
                if (str3 != null) {
                    i13++;
                    i12 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i11++;
            }
            computeInt64Size = computeInt64Size + i12 + i13;
        }
        C2919qm[] c2919qmArr = this.f40219h;
        if (c2919qmArr != null && c2919qmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C2919qm[] c2919qmArr2 = this.f40219h;
                if (i14 >= c2919qmArr2.length) {
                    break;
                }
                C2919qm c2919qm = c2919qmArr2[i14];
                if (c2919qm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c2919qm) + computeInt64Size;
                }
                i14++;
            }
        }
        C2970sm c2970sm = this.f40220i;
        if (c2970sm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c2970sm);
        }
        if (!this.f40221j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f40221j);
        }
        if (!this.f40222k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f40222k);
        }
        if (!this.f40223l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f40223l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f40224m) + computeInt64Size;
        if (!this.f40225n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f40225n);
        }
        String[] strArr7 = this.f40226o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr8 = this.f40226o;
                if (i15 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i15];
                if (str4 != null) {
                    i17++;
                    i16 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i15++;
            }
            computeBoolSize = computeBoolSize + i16 + i17;
        }
        C3074wm c3074wm = this.f40227p;
        if (c3074wm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c3074wm);
        }
        boolean z4 = this.f40228q;
        if (z4) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z4);
        }
        if (!this.f40229r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f40229r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f40231t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f40230s) + computeBoolSize;
        boolean z5 = this.f40232u;
        if (z5) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z5);
        }
        C3022um c3022um = this.f40233v;
        if (c3022um != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c3022um);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f40235x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f40234w) + computeInt64Size2;
        C2893pm c2893pm = this.f40236y;
        if (c2893pm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c2893pm);
        }
        C2867om c2867om = this.f40237z;
        if (c2867om != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c2867om);
        }
        C2841nm c2841nm = this.f40208A;
        if (c2841nm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c2841nm);
        }
        C3048vm c3048vm = this.f40209B;
        if (c3048vm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c3048vm);
        }
        C2996tm[] c2996tmArr = this.f40210C;
        if (c2996tmArr != null && c2996tmArr.length > 0) {
            while (true) {
                C2996tm[] c2996tmArr2 = this.f40210C;
                if (i4 >= c2996tmArr2.length) {
                    break;
                }
                C2996tm c2996tm = c2996tmArr2[i4];
                if (c2996tm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c2996tm) + computeInt32Size;
                }
                i4++;
            }
        }
        C2944rm c2944rm = this.f40211D;
        return c2944rm != null ? CodedOutputByteBufferNano.computeMessageSize(32, c2944rm) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f40212a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f40212a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f40213b);
        String[] strArr = this.f40214c;
        int i4 = 0;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f40214c;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i5];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i5++;
            }
        }
        if (!this.f40215d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f40215d);
        }
        if (!this.f40216e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f40216e);
        }
        String[] strArr3 = this.f40217f;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.f40217f;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i6++;
            }
        }
        String[] strArr5 = this.f40218g;
        if (strArr5 != null && strArr5.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr6 = this.f40218g;
                if (i7 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i7];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i7++;
            }
        }
        C2919qm[] c2919qmArr = this.f40219h;
        if (c2919qmArr != null && c2919qmArr.length > 0) {
            int i8 = 0;
            while (true) {
                C2919qm[] c2919qmArr2 = this.f40219h;
                if (i8 >= c2919qmArr2.length) {
                    break;
                }
                C2919qm c2919qm = c2919qmArr2[i8];
                if (c2919qm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c2919qm);
                }
                i8++;
            }
        }
        C2970sm c2970sm = this.f40220i;
        if (c2970sm != null) {
            codedOutputByteBufferNano.writeMessage(9, c2970sm);
        }
        if (!this.f40221j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f40221j);
        }
        if (!this.f40222k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f40222k);
        }
        if (!this.f40223l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f40223l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f40224m);
        if (!this.f40225n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f40225n);
        }
        String[] strArr7 = this.f40226o;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr8 = this.f40226o;
                if (i9 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i9];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i9++;
            }
        }
        C3074wm c3074wm = this.f40227p;
        if (c3074wm != null) {
            codedOutputByteBufferNano.writeMessage(16, c3074wm);
        }
        boolean z4 = this.f40228q;
        if (z4) {
            codedOutputByteBufferNano.writeBool(17, z4);
        }
        if (!this.f40229r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f40229r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f40230s);
        codedOutputByteBufferNano.writeInt64(22, this.f40231t);
        boolean z5 = this.f40232u;
        if (z5) {
            codedOutputByteBufferNano.writeBool(23, z5);
        }
        C3022um c3022um = this.f40233v;
        if (c3022um != null) {
            codedOutputByteBufferNano.writeMessage(24, c3022um);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f40234w);
        codedOutputByteBufferNano.writeInt32(26, this.f40235x);
        C2893pm c2893pm = this.f40236y;
        if (c2893pm != null) {
            codedOutputByteBufferNano.writeMessage(27, c2893pm);
        }
        C2867om c2867om = this.f40237z;
        if (c2867om != null) {
            codedOutputByteBufferNano.writeMessage(28, c2867om);
        }
        C2841nm c2841nm = this.f40208A;
        if (c2841nm != null) {
            codedOutputByteBufferNano.writeMessage(29, c2841nm);
        }
        C3048vm c3048vm = this.f40209B;
        if (c3048vm != null) {
            codedOutputByteBufferNano.writeMessage(30, c3048vm);
        }
        C2996tm[] c2996tmArr = this.f40210C;
        if (c2996tmArr != null && c2996tmArr.length > 0) {
            while (true) {
                C2996tm[] c2996tmArr2 = this.f40210C;
                if (i4 >= c2996tmArr2.length) {
                    break;
                }
                C2996tm c2996tm = c2996tmArr2[i4];
                if (c2996tm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c2996tm);
                }
                i4++;
            }
        }
        C2944rm c2944rm = this.f40211D;
        if (c2944rm != null) {
            codedOutputByteBufferNano.writeMessage(32, c2944rm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3100xm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3100xm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3100xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f40212a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f40213b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f40214c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i4];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f40214c = strArr2;
                    break;
                case 34:
                    this.f40215d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f40216e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f40217f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i5 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i5];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i5 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f40217f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f40218g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i6 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i6];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i6 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f40218g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C2919qm[] c2919qmArr = this.f40219h;
                    int length4 = c2919qmArr == null ? 0 : c2919qmArr.length;
                    int i7 = repeatedFieldArrayLength4 + length4;
                    C2919qm[] c2919qmArr2 = new C2919qm[i7];
                    if (length4 != 0) {
                        System.arraycopy(c2919qmArr, 0, c2919qmArr2, 0, length4);
                    }
                    while (length4 < i7 - 1) {
                        C2919qm c2919qm = new C2919qm();
                        c2919qmArr2[length4] = c2919qm;
                        codedInputByteBufferNano.readMessage(c2919qm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C2919qm c2919qm2 = new C2919qm();
                    c2919qmArr2[length4] = c2919qm2;
                    codedInputByteBufferNano.readMessage(c2919qm2);
                    this.f40219h = c2919qmArr2;
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    if (this.f40220i == null) {
                        this.f40220i = new C2970sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f40220i);
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    this.f40221j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f40222k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f40223l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f40224m = codedInputByteBufferNano.readBool();
                    break;
                case IronSourceConstants.FIRST_INSTANCE_RESULT /* 114 */:
                    this.f40225n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f40226o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i8 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i8];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i8 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f40226o = strArr8;
                    break;
                case 130:
                    if (this.f40227p == null) {
                        this.f40227p = new C3074wm();
                    }
                    codedInputByteBufferNano.readMessage(this.f40227p);
                    break;
                case 136:
                    this.f40228q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f40229r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f40230s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f40231t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f40232u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f40233v == null) {
                        this.f40233v = new C3022um();
                    }
                    codedInputByteBufferNano.readMessage(this.f40233v);
                    break;
                case 200:
                    this.f40234w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f40235x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f40236y == null) {
                        this.f40236y = new C2893pm();
                    }
                    codedInputByteBufferNano.readMessage(this.f40236y);
                    break;
                case 226:
                    if (this.f40237z == null) {
                        this.f40237z = new C2867om();
                    }
                    codedInputByteBufferNano.readMessage(this.f40237z);
                    break;
                case 234:
                    if (this.f40208A == null) {
                        this.f40208A = new C2841nm();
                    }
                    codedInputByteBufferNano.readMessage(this.f40208A);
                    break;
                case 242:
                    if (this.f40209B == null) {
                        this.f40209B = new C3048vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f40209B);
                    break;
                case IronSourceConstants.INTERSTITIAL_DAILY_CAPPED /* 250 */:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
                    C2996tm[] c2996tmArr = this.f40210C;
                    int length6 = c2996tmArr == null ? 0 : c2996tmArr.length;
                    int i9 = repeatedFieldArrayLength6 + length6;
                    C2996tm[] c2996tmArr2 = new C2996tm[i9];
                    if (length6 != 0) {
                        System.arraycopy(c2996tmArr, 0, c2996tmArr2, 0, length6);
                    }
                    while (length6 < i9 - 1) {
                        C2996tm c2996tm = new C2996tm();
                        c2996tmArr2[length6] = c2996tm;
                        codedInputByteBufferNano.readMessage(c2996tm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C2996tm c2996tm2 = new C2996tm();
                    c2996tmArr2[length6] = c2996tm2;
                    codedInputByteBufferNano.readMessage(c2996tm2);
                    this.f40210C = c2996tmArr2;
                    break;
                case 258:
                    if (this.f40211D == null) {
                        this.f40211D = new C2944rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f40211D);
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

    public static C3100xm a(byte[] bArr) {
        return (C3100xm) MessageNano.mergeFrom(new C3100xm(), bArr);
    }
}
