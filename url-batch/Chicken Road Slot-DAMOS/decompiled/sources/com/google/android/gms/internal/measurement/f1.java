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
public final class f1 {

    /* renamed from: e, reason: collision with root package name */
    public static final f1 f2270e;

    /* renamed from: i, reason: collision with root package name */
    public static final f1 f2271i;

    /* renamed from: r, reason: collision with root package name */
    public static final f1[] f2272r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f1[] f2273s;

    /* renamed from: d, reason: collision with root package name */
    public final int f2274d;

    /* JADX INFO: Fake field, exist only in values array */
    f1 EF0;

    static {
        w1 w1Var = w1.f2918s;
        f1 f1Var = new f1("DOUBLE", 0, 0, 1, w1Var);
        w1 w1Var2 = w1.f2917r;
        f1 f1Var2 = new f1("FLOAT", 1, 1, 1, w1Var2);
        w1 w1Var3 = w1.f2916i;
        f1 f1Var3 = new f1("INT64", 2, 2, 1, w1Var3);
        f1 f1Var4 = new f1("UINT64", 3, 3, 1, w1Var3);
        w1 w1Var4 = w1.f2915e;
        f1 f1Var5 = new f1("INT32", 4, 4, 1, w1Var4);
        f1 f1Var6 = new f1("FIXED64", 5, 5, 1, w1Var3);
        f1 f1Var7 = new f1("FIXED32", 6, 6, 1, w1Var4);
        w1 w1Var5 = w1.f2919t;
        f1 f1Var8 = new f1("BOOL", 7, 7, 1, w1Var5);
        w1 w1Var6 = w1.f2920u;
        f1 f1Var9 = new f1("STRING", 8, 8, 1, w1Var6);
        w1 w1Var7 = w1.f2923x;
        f1 f1Var10 = new f1("MESSAGE", 9, 9, 1, w1Var7);
        w1 w1Var8 = w1.f2921v;
        f1 f1Var11 = new f1("BYTES", 10, 10, 1, w1Var8);
        f1 f1Var12 = new f1("UINT32", 11, 11, 1, w1Var4);
        w1 w1Var9 = w1.f2922w;
        f1 f1Var13 = new f1("ENUM", 12, 12, 1, w1Var9);
        f1 f1Var14 = new f1("SFIXED32", 13, 13, 1, w1Var4);
        f1 f1Var15 = new f1("SFIXED64", 14, 14, 1, w1Var3);
        f1 f1Var16 = new f1("SINT32", 15, 15, 1, w1Var4);
        f1 f1Var17 = new f1("SINT64", 16, 16, 1, w1Var3);
        f1 f1Var18 = new f1("GROUP", 17, 17, 1, w1Var7);
        f1 f1Var19 = new f1("DOUBLE_LIST", 18, 18, 2, w1Var);
        f1 f1Var20 = new f1("FLOAT_LIST", 19, 19, 2, w1Var2);
        f1 f1Var21 = new f1("INT64_LIST", 20, 20, 2, w1Var3);
        f1 f1Var22 = new f1("UINT64_LIST", 21, 21, 2, w1Var3);
        f1 f1Var23 = new f1("INT32_LIST", 22, 22, 2, w1Var4);
        f1 f1Var24 = new f1("FIXED64_LIST", 23, 23, 2, w1Var3);
        f1 f1Var25 = new f1("FIXED32_LIST", 24, 24, 2, w1Var4);
        f1 f1Var26 = new f1("BOOL_LIST", 25, 25, 2, w1Var5);
        f1 f1Var27 = new f1("STRING_LIST", 26, 26, 2, w1Var6);
        f1 f1Var28 = new f1("MESSAGE_LIST", 27, 27, 2, w1Var7);
        f1 f1Var29 = new f1("BYTES_LIST", 28, 28, 2, w1Var8);
        f1 f1Var30 = new f1("UINT32_LIST", 29, 29, 2, w1Var4);
        f1 f1Var31 = new f1("ENUM_LIST", 30, 30, 2, w1Var9);
        f1 f1Var32 = new f1("SFIXED32_LIST", 31, 31, 2, w1Var4);
        f1 f1Var33 = new f1("SFIXED64_LIST", 32, 32, 2, w1Var3);
        f1 f1Var34 = new f1("SINT32_LIST", 33, 33, 2, w1Var4);
        f1 f1Var35 = new f1("SINT64_LIST", 34, 34, 2, w1Var3);
        f1 f1Var36 = new f1("DOUBLE_LIST_PACKED", 35, 35, 3, w1Var);
        f2270e = f1Var36;
        f1 f1Var37 = new f1("FLOAT_LIST_PACKED", 36, 36, 3, w1Var2);
        f1 f1Var38 = new f1("INT64_LIST_PACKED", 37, 37, 3, w1Var3);
        f1 f1Var39 = new f1("UINT64_LIST_PACKED", 38, 38, 3, w1Var3);
        f1 f1Var40 = new f1("INT32_LIST_PACKED", 39, 39, 3, w1Var4);
        f1 f1Var41 = new f1("FIXED64_LIST_PACKED", 40, 40, 3, w1Var3);
        f1 f1Var42 = new f1("FIXED32_LIST_PACKED", 41, 41, 3, w1Var4);
        f1 f1Var43 = new f1("BOOL_LIST_PACKED", 42, 42, 3, w1Var5);
        f1 f1Var44 = new f1("UINT32_LIST_PACKED", 43, 43, 3, w1Var4);
        f1 f1Var45 = new f1("ENUM_LIST_PACKED", 44, 44, 3, w1Var9);
        f1 f1Var46 = new f1("SFIXED32_LIST_PACKED", 45, 45, 3, w1Var4);
        f1 f1Var47 = new f1("SFIXED64_LIST_PACKED", 46, 46, 3, w1Var3);
        f1 f1Var48 = new f1("SINT32_LIST_PACKED", 47, 47, 3, w1Var4);
        f1 f1Var49 = new f1("SINT64_LIST_PACKED", 48, 48, 3, w1Var3);
        f2271i = f1Var49;
        f2273s = new f1[]{f1Var, f1Var2, f1Var3, f1Var4, f1Var5, f1Var6, f1Var7, f1Var8, f1Var9, f1Var10, f1Var11, f1Var12, f1Var13, f1Var14, f1Var15, f1Var16, f1Var17, f1Var18, f1Var19, f1Var20, f1Var21, f1Var22, f1Var23, f1Var24, f1Var25, f1Var26, f1Var27, f1Var28, f1Var29, f1Var30, f1Var31, f1Var32, f1Var33, f1Var34, f1Var35, f1Var36, f1Var37, f1Var38, f1Var39, f1Var40, f1Var41, f1Var42, f1Var43, f1Var44, f1Var45, f1Var46, f1Var47, f1Var48, f1Var49, new f1("GROUP_LIST", 49, 49, 2, w1Var7), new f1("MAP", 50, 50, 4, w1.f2914d)};
        f1[] values = values();
        f2272r = new f1[values.length];
        for (f1 f1Var50 : values) {
            f2272r[f1Var50.f2274d] = f1Var50;
        }
    }

    public f1(String str, int i3, int i10, int i11, w1 w1Var) {
        this.f2274d = i10;
        int i12 = i11 - 1;
        if (i12 == 1) {
            w1Var.getClass();
        } else if (i12 == 3) {
            w1Var.getClass();
        }
        if (i11 == 1) {
            w1 w1Var2 = w1.f2914d;
            w1Var.ordinal();
        }
    }

    public static f1[] values() {
        return (f1[]) f2273s.clone();
    }
}
