package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class oq3 {

    /* renamed from: i, reason: collision with root package name */
    public static final oq3 f9770i;

    /* renamed from: j, reason: collision with root package name */
    public static final oq3 f9771j;

    /* renamed from: k, reason: collision with root package name */
    public static final oq3 f9772k;

    /* renamed from: l, reason: collision with root package name */
    public static final oq3 f9773l;

    /* renamed from: m, reason: collision with root package name */
    public static final oq3 f9774m;

    /* renamed from: n, reason: collision with root package name */
    public static final oq3 f9775n;

    /* renamed from: o, reason: collision with root package name */
    public static final oq3 f9776o;

    /* renamed from: p, reason: collision with root package name */
    public static final oq3 f9777p;

    /* renamed from: q, reason: collision with root package name */
    public static final oq3 f9778q;

    /* renamed from: r, reason: collision with root package name */
    public static final oq3 f9779r;

    /* renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ oq3[] f9780s;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f9781f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f9782g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f9783h;

    static {
        oq3 oq3Var = new oq3("VOID", 0, Void.class, Void.class, null);
        f9770i = oq3Var;
        Class cls = Integer.TYPE;
        oq3 oq3Var2 = new oq3("INT", 1, cls, Integer.class, 0);
        f9771j = oq3Var2;
        oq3 oq3Var3 = new oq3("LONG", 2, Long.TYPE, Long.class, 0L);
        f9772k = oq3Var3;
        oq3 oq3Var4 = new oq3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f9773l = oq3Var4;
        oq3 oq3Var5 = new oq3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f9774m = oq3Var5;
        oq3 oq3Var6 = new oq3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f9775n = oq3Var6;
        oq3 oq3Var7 = new oq3("STRING", 6, String.class, String.class, "");
        f9776o = oq3Var7;
        oq3 oq3Var8 = new oq3("BYTE_STRING", 7, uo3.class, uo3.class, uo3.f12885g);
        f9777p = oq3Var8;
        oq3 oq3Var9 = new oq3("ENUM", 8, cls, Integer.class, null);
        f9778q = oq3Var9;
        oq3 oq3Var10 = new oq3("MESSAGE", 9, Object.class, Object.class, null);
        f9779r = oq3Var10;
        f9780s = new oq3[]{oq3Var, oq3Var2, oq3Var3, oq3Var4, oq3Var5, oq3Var6, oq3Var7, oq3Var8, oq3Var9, oq3Var10};
    }

    private oq3(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f9781f = cls;
        this.f9782g = cls2;
        this.f9783h = obj;
    }

    public static oq3[] values() {
        return (oq3[]) f9780s.clone();
    }

    public final Class<?> b() {
        return this.f9782g;
    }
}
