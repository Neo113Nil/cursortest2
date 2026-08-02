package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062wm extends MessageNano {

    /* renamed from: D, reason: collision with root package name */
    public static final int f12952D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f12953E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f12954F = 1;

    /* renamed from: G, reason: collision with root package name */
    public static volatile C1062wm[] f12955G;

    /* renamed from: A, reason: collision with root package name */
    public C1010um f12956A;

    /* renamed from: B, reason: collision with root package name */
    public C0958sm[] f12957B;

    /* renamed from: C, reason: collision with root package name */
    public C0907qm f12958C;

    /* renamed from: a, reason: collision with root package name */
    public String f12959a;

    /* renamed from: b, reason: collision with root package name */
    public long f12960b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f12961c;

    /* renamed from: d, reason: collision with root package name */
    public String f12962d;

    /* renamed from: e, reason: collision with root package name */
    public String f12963e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f12964f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f12965g;

    /* renamed from: h, reason: collision with root package name */
    public C0881pm[] f12966h;

    /* renamed from: i, reason: collision with root package name */
    public C0932rm f12967i;

    /* renamed from: j, reason: collision with root package name */
    public String f12968j;

    /* renamed from: k, reason: collision with root package name */
    public String f12969k;

    /* renamed from: l, reason: collision with root package name */
    public String f12970l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12971m;
    public String n;
    public String[] o;

    /* renamed from: p, reason: collision with root package name */
    public C1036vm f12972p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12973q;

    /* renamed from: r, reason: collision with root package name */
    public String f12974r;

    /* renamed from: s, reason: collision with root package name */
    public long f12975s;

    /* renamed from: t, reason: collision with root package name */
    public long f12976t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12977u;
    public C0984tm v;

    /* renamed from: w, reason: collision with root package name */
    public int f12978w;

    /* renamed from: x, reason: collision with root package name */
    public int f12979x;

    /* renamed from: y, reason: collision with root package name */
    public C0855om f12980y;
    public C0829nm z;

    public C1062wm() {
        a();
    }

    public static C1062wm[] b() {
        if (f12955G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12955G == null) {
                        f12955G = new C1062wm[0];
                    }
                } finally {
                }
            }
        }
        return f12955G;
    }

    public final C1062wm a() {
        this.f12959a = "";
        this.f12960b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f12961c = strArr;
        this.f12962d = "";
        this.f12963e = "";
        this.f12964f = strArr;
        this.f12965g = strArr;
        this.f12966h = C0881pm.b();
        this.f12967i = null;
        this.f12968j = "";
        this.f12969k = "";
        this.f12970l = "";
        this.f12971m = false;
        this.n = "";
        this.o = strArr;
        this.f12972p = null;
        this.f12973q = false;
        this.f12974r = "";
        this.f12975s = 0L;
        this.f12976t = 0L;
        this.f12977u = false;
        this.v = null;
        this.f12978w = 600;
        this.f12979x = 1;
        this.f12980y = null;
        this.z = null;
        this.f12956A = null;
        this.f12957B = C0958sm.b();
        this.f12958C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12959a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12959a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f12960b) + computeSerializedSize;
        String[] strArr = this.f12961c;
        int i4 = 0;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f12961c;
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
        if (!this.f12962d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f12962d);
        }
        if (!this.f12963e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f12963e);
        }
        String[] strArr3 = this.f12964f;
        if (strArr3 != null && strArr3.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr4 = this.f12964f;
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
        String[] strArr5 = this.f12965g;
        if (strArr5 != null && strArr5.length > 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f12965g;
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
        C0881pm[] c0881pmArr = this.f12966h;
        if (c0881pmArr != null && c0881pmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C0881pm[] c0881pmArr2 = this.f12966h;
                if (i14 >= c0881pmArr2.length) {
                    break;
                }
                C0881pm c0881pm = c0881pmArr2[i14];
                if (c0881pm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c0881pm) + computeInt64Size;
                }
                i14++;
            }
        }
        C0932rm c0932rm = this.f12967i;
        if (c0932rm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c0932rm);
        }
        if (!this.f12968j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f12968j);
        }
        if (!this.f12969k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f12969k);
        }
        if (!this.f12970l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f12970l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f12971m) + computeInt64Size;
        if (!this.n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.n);
        }
        String[] strArr7 = this.o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr8 = this.o;
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
        C1036vm c1036vm = this.f12972p;
        if (c1036vm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c1036vm);
        }
        boolean z = this.f12973q;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.f12974r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f12974r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f12976t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f12975s) + computeBoolSize;
        boolean z4 = this.f12977u;
        if (z4) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z4);
        }
        C0984tm c0984tm = this.v;
        if (c0984tm != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c0984tm);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f12979x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f12978w) + computeInt64Size2;
        C0855om c0855om = this.f12980y;
        if (c0855om != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0855om);
        }
        C0829nm c0829nm = this.z;
        if (c0829nm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0829nm);
        }
        C1010um c1010um = this.f12956A;
        if (c1010um != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c1010um);
        }
        C0958sm[] c0958smArr = this.f12957B;
        if (c0958smArr != null && c0958smArr.length > 0) {
            while (true) {
                C0958sm[] c0958smArr2 = this.f12957B;
                if (i4 >= c0958smArr2.length) {
                    break;
                }
                C0958sm c0958sm = c0958smArr2[i4];
                if (c0958sm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c0958sm) + computeInt32Size;
                }
                i4++;
            }
        }
        C0907qm c0907qm = this.f12958C;
        return c0907qm != null ? CodedOutputByteBufferNano.computeMessageSize(32, c0907qm) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12959a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12959a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f12960b);
        String[] strArr = this.f12961c;
        int i4 = 0;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f12961c;
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
        if (!this.f12962d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f12962d);
        }
        if (!this.f12963e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f12963e);
        }
        String[] strArr3 = this.f12964f;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.f12964f;
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
        String[] strArr5 = this.f12965g;
        if (strArr5 != null && strArr5.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr6 = this.f12965g;
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
        C0881pm[] c0881pmArr = this.f12966h;
        if (c0881pmArr != null && c0881pmArr.length > 0) {
            int i8 = 0;
            while (true) {
                C0881pm[] c0881pmArr2 = this.f12966h;
                if (i8 >= c0881pmArr2.length) {
                    break;
                }
                C0881pm c0881pm = c0881pmArr2[i8];
                if (c0881pm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0881pm);
                }
                i8++;
            }
        }
        C0932rm c0932rm = this.f12967i;
        if (c0932rm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0932rm);
        }
        if (!this.f12968j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f12968j);
        }
        if (!this.f12969k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f12969k);
        }
        if (!this.f12970l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f12970l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f12971m);
        if (!this.n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.n);
        }
        String[] strArr7 = this.o;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr8 = this.o;
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
        C1036vm c1036vm = this.f12972p;
        if (c1036vm != null) {
            codedOutputByteBufferNano.writeMessage(16, c1036vm);
        }
        boolean z = this.f12973q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.f12974r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f12974r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f12975s);
        codedOutputByteBufferNano.writeInt64(22, this.f12976t);
        boolean z4 = this.f12977u;
        if (z4) {
            codedOutputByteBufferNano.writeBool(23, z4);
        }
        C0984tm c0984tm = this.v;
        if (c0984tm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0984tm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f12978w);
        codedOutputByteBufferNano.writeInt32(26, this.f12979x);
        C0855om c0855om = this.f12980y;
        if (c0855om != null) {
            codedOutputByteBufferNano.writeMessage(27, c0855om);
        }
        C0829nm c0829nm = this.z;
        if (c0829nm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0829nm);
        }
        C1010um c1010um = this.f12956A;
        if (c1010um != null) {
            codedOutputByteBufferNano.writeMessage(30, c1010um);
        }
        C0958sm[] c0958smArr = this.f12957B;
        if (c0958smArr != null && c0958smArr.length > 0) {
            while (true) {
                C0958sm[] c0958smArr2 = this.f12957B;
                if (i4 >= c0958smArr2.length) {
                    break;
                }
                C0958sm c0958sm = c0958smArr2[i4];
                if (c0958sm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0958sm);
                }
                i4++;
            }
        }
        C0907qm c0907qm = this.f12958C;
        if (c0907qm != null) {
            codedOutputByteBufferNano.writeMessage(32, c0907qm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C1062wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1062wm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1062wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f12959a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f12960b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f12961c;
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
                    this.f12961c = strArr2;
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    this.f12962d = codedInputByteBufferNano.readString();
                    break;
                case C0583e9.f11752M /* 42 */:
                    this.f12963e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f12964f;
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
                    this.f12964f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f12965g;
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
                    this.f12965g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C0881pm[] c0881pmArr = this.f12966h;
                    int length4 = c0881pmArr == null ? 0 : c0881pmArr.length;
                    int i7 = repeatedFieldArrayLength4 + length4;
                    C0881pm[] c0881pmArr2 = new C0881pm[i7];
                    if (length4 != 0) {
                        System.arraycopy(c0881pmArr, 0, c0881pmArr2, 0, length4);
                    }
                    while (length4 < i7 - 1) {
                        C0881pm c0881pm = new C0881pm();
                        c0881pmArr2[length4] = c0881pm;
                        codedInputByteBufferNano.readMessage(c0881pm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C0881pm c0881pm2 = new C0881pm();
                    c0881pmArr2[length4] = c0881pm2;
                    codedInputByteBufferNano.readMessage(c0881pm2);
                    this.f12966h = c0881pmArr2;
                    break;
                case 74:
                    if (this.f12967i == null) {
                        this.f12967i = new C0932rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f12967i);
                    break;
                case 82:
                    this.f12968j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f12969k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f12970l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f12971m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.o;
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
                    this.o = strArr8;
                    break;
                case 130:
                    if (this.f12972p == null) {
                        this.f12972p = new C1036vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f12972p);
                    break;
                case 136:
                    this.f12973q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f12974r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f12975s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f12976t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f12977u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.v == null) {
                        this.v = new C0984tm();
                    }
                    codedInputByteBufferNano.readMessage(this.v);
                    break;
                case 200:
                    this.f12978w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f12979x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f12980y == null) {
                        this.f12980y = new C0855om();
                    }
                    codedInputByteBufferNano.readMessage(this.f12980y);
                    break;
                case 234:
                    if (this.z == null) {
                        this.z = new C0829nm();
                    }
                    codedInputByteBufferNano.readMessage(this.z);
                    break;
                case 242:
                    if (this.f12956A == null) {
                        this.f12956A = new C1010um();
                    }
                    codedInputByteBufferNano.readMessage(this.f12956A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C0958sm[] c0958smArr = this.f12957B;
                    int length6 = c0958smArr == null ? 0 : c0958smArr.length;
                    int i9 = repeatedFieldArrayLength6 + length6;
                    C0958sm[] c0958smArr2 = new C0958sm[i9];
                    if (length6 != 0) {
                        System.arraycopy(c0958smArr, 0, c0958smArr2, 0, length6);
                    }
                    while (length6 < i9 - 1) {
                        C0958sm c0958sm = new C0958sm();
                        c0958smArr2[length6] = c0958sm;
                        codedInputByteBufferNano.readMessage(c0958sm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C0958sm c0958sm2 = new C0958sm();
                    c0958smArr2[length6] = c0958sm2;
                    codedInputByteBufferNano.readMessage(c0958sm2);
                    this.f12957B = c0958smArr2;
                    break;
                case 258:
                    if (this.f12958C == null) {
                        this.f12958C = new C0907qm();
                    }
                    codedInputByteBufferNano.readMessage(this.f12958C);
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

    public static C1062wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1062wm) MessageNano.mergeFrom(new C1062wm(), bArr);
    }
}
