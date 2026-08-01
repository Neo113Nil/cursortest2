package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: i, reason: collision with root package name */
    public static final c3 f2183i;

    /* renamed from: r, reason: collision with root package name */
    public static final c3 f2184r;

    /* renamed from: s, reason: collision with root package name */
    public static final c3 f2185s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c3[] f2186t;

    /* renamed from: d, reason: collision with root package name */
    public final d3 f2187d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2188e;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF0;

    static {
        c3 c3Var = new c3("DOUBLE", 0, d3.f2216r, 1);
        c3 c3Var2 = new c3("FLOAT", 1, d3.f2215i, 5);
        d3 d3Var = d3.f2214e;
        c3 c3Var3 = new c3("INT64", 2, d3Var, 0);
        c3 c3Var4 = new c3("UINT64", 3, d3Var, 0);
        d3 d3Var2 = d3.f2213d;
        c3 c3Var5 = new c3("INT32", 4, d3Var2, 0);
        c3 c3Var6 = new c3("FIXED64", 5, d3Var, 1);
        c3 c3Var7 = new c3("FIXED32", 6, d3Var2, 5);
        c3 c3Var8 = new c3("BOOL", 7, d3.f2217s, 0);
        c3 c3Var9 = new c3("STRING", 8, d3.f2218t, 2);
        f2183i = c3Var9;
        d3 d3Var3 = d3.f2221w;
        c3 c3Var10 = new c3("GROUP", 9, d3Var3, 3);
        f2184r = c3Var10;
        c3 c3Var11 = new c3("MESSAGE", 10, d3Var3, 2);
        f2185s = c3Var11;
        f2186t = new c3[]{c3Var, c3Var2, c3Var3, c3Var4, c3Var5, c3Var6, c3Var7, c3Var8, c3Var9, c3Var10, c3Var11, new c3("BYTES", 11, d3.f2219u, 2), new c3("UINT32", 12, d3Var2, 0), new c3("ENUM", 13, d3.f2220v, 0), new c3("SFIXED32", 14, d3Var2, 5), new c3("SFIXED64", 15, d3Var, 1), new c3("SINT32", 16, d3Var2, 0), new c3("SINT64", 17, d3Var, 0)};
    }

    public c3(String str, int i3, d3 d3Var, int i10) {
        this.f2187d = d3Var;
        this.f2188e = i10;
    }

    public static c3[] values() {
        return (c3[]) f2186t.clone();
    }
}
