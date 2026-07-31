package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class mt3 {

    /* renamed from: g, reason: collision with root package name */
    public static final mt3 f8707g;

    /* renamed from: h, reason: collision with root package name */
    public static final mt3 f8708h;

    /* renamed from: i, reason: collision with root package name */
    public static final mt3 f8709i;

    /* renamed from: j, reason: collision with root package name */
    public static final mt3 f8710j;

    /* renamed from: k, reason: collision with root package name */
    public static final mt3 f8711k;

    /* renamed from: l, reason: collision with root package name */
    public static final mt3 f8712l;

    /* renamed from: m, reason: collision with root package name */
    public static final mt3 f8713m;

    /* renamed from: n, reason: collision with root package name */
    public static final mt3 f8714n;

    /* renamed from: o, reason: collision with root package name */
    public static final mt3 f8715o;

    /* renamed from: p, reason: collision with root package name */
    public static final mt3 f8716p;

    /* renamed from: q, reason: collision with root package name */
    public static final mt3 f8717q;

    /* renamed from: r, reason: collision with root package name */
    public static final mt3 f8718r;

    /* renamed from: s, reason: collision with root package name */
    public static final mt3 f8719s;

    /* renamed from: t, reason: collision with root package name */
    public static final mt3 f8720t;

    /* renamed from: u, reason: collision with root package name */
    public static final mt3 f8721u;

    /* renamed from: v, reason: collision with root package name */
    public static final mt3 f8722v;

    /* renamed from: w, reason: collision with root package name */
    public static final mt3 f8723w;

    /* renamed from: x, reason: collision with root package name */
    public static final mt3 f8724x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ mt3[] f8725y;

    /* renamed from: f, reason: collision with root package name */
    private final nt3 f8726f;

    static {
        mt3 mt3Var = new mt3("DOUBLE", 0, nt3.DOUBLE, 1);
        f8707g = mt3Var;
        mt3 mt3Var2 = new mt3("FLOAT", 1, nt3.FLOAT, 5);
        f8708h = mt3Var2;
        nt3 nt3Var = nt3.LONG;
        mt3 mt3Var3 = new mt3("INT64", 2, nt3Var, 0);
        f8709i = mt3Var3;
        mt3 mt3Var4 = new mt3("UINT64", 3, nt3Var, 0);
        f8710j = mt3Var4;
        nt3 nt3Var2 = nt3.INT;
        mt3 mt3Var5 = new mt3("INT32", 4, nt3Var2, 0);
        f8711k = mt3Var5;
        mt3 mt3Var6 = new mt3("FIXED64", 5, nt3Var, 1);
        f8712l = mt3Var6;
        mt3 mt3Var7 = new mt3("FIXED32", 6, nt3Var2, 5);
        f8713m = mt3Var7;
        mt3 mt3Var8 = new mt3("BOOL", 7, nt3.BOOLEAN, 0);
        f8714n = mt3Var8;
        mt3 mt3Var9 = new mt3("STRING", 8, nt3.STRING, 2);
        f8715o = mt3Var9;
        nt3 nt3Var3 = nt3.MESSAGE;
        mt3 mt3Var10 = new mt3("GROUP", 9, nt3Var3, 3);
        f8716p = mt3Var10;
        mt3 mt3Var11 = new mt3("MESSAGE", 10, nt3Var3, 2);
        f8717q = mt3Var11;
        mt3 mt3Var12 = new mt3("BYTES", 11, nt3.BYTE_STRING, 2);
        f8718r = mt3Var12;
        mt3 mt3Var13 = new mt3("UINT32", 12, nt3Var2, 0);
        f8719s = mt3Var13;
        mt3 mt3Var14 = new mt3("ENUM", 13, nt3.ENUM, 0);
        f8720t = mt3Var14;
        mt3 mt3Var15 = new mt3("SFIXED32", 14, nt3Var2, 5);
        f8721u = mt3Var15;
        mt3 mt3Var16 = new mt3("SFIXED64", 15, nt3Var, 1);
        f8722v = mt3Var16;
        mt3 mt3Var17 = new mt3("SINT32", 16, nt3Var2, 0);
        f8723w = mt3Var17;
        mt3 mt3Var18 = new mt3("SINT64", 17, nt3Var, 0);
        f8724x = mt3Var18;
        f8725y = new mt3[]{mt3Var, mt3Var2, mt3Var3, mt3Var4, mt3Var5, mt3Var6, mt3Var7, mt3Var8, mt3Var9, mt3Var10, mt3Var11, mt3Var12, mt3Var13, mt3Var14, mt3Var15, mt3Var16, mt3Var17, mt3Var18};
    }

    private mt3(String str, int i7, nt3 nt3Var, int i8) {
        this.f8726f = nt3Var;
    }

    public static mt3[] values() {
        return (mt3[]) f8725y.clone();
    }

    public final nt3 b() {
        return this.f8726f;
    }
}
