package defpackage;

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
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ym3 {
    public static final ym3 n;
    public static final ym3 o;
    public static final ym3[] p;
    public static final /* synthetic */ ym3[] q;
    public final int m;

    /* JADX INFO: Fake field, exist only in values array */
    ym3 EF0;

    static {
        vn3 vn3Var = vn3.q;
        ym3 ym3Var = new ym3("DOUBLE", 0, 0, 1, vn3Var);
        vn3 vn3Var2 = vn3.p;
        ym3 ym3Var2 = new ym3("FLOAT", 1, 1, 1, vn3Var2);
        vn3 vn3Var3 = vn3.o;
        ym3 ym3Var3 = new ym3("INT64", 2, 2, 1, vn3Var3);
        ym3 ym3Var4 = new ym3("UINT64", 3, 3, 1, vn3Var3);
        vn3 vn3Var4 = vn3.n;
        ym3 ym3Var5 = new ym3("INT32", 4, 4, 1, vn3Var4);
        ym3 ym3Var6 = new ym3("FIXED64", 5, 5, 1, vn3Var3);
        ym3 ym3Var7 = new ym3("FIXED32", 6, 6, 1, vn3Var4);
        vn3 vn3Var5 = vn3.r;
        ym3 ym3Var8 = new ym3("BOOL", 7, 7, 1, vn3Var5);
        vn3 vn3Var6 = vn3.s;
        ym3 ym3Var9 = new ym3("STRING", 8, 8, 1, vn3Var6);
        vn3 vn3Var7 = vn3.v;
        ym3 ym3Var10 = new ym3("MESSAGE", 9, 9, 1, vn3Var7);
        vn3 vn3Var8 = vn3.t;
        ym3 ym3Var11 = new ym3("BYTES", 10, 10, 1, vn3Var8);
        ym3 ym3Var12 = new ym3("UINT32", 11, 11, 1, vn3Var4);
        vn3 vn3Var9 = vn3.u;
        ym3 ym3Var13 = new ym3("ENUM", 12, 12, 1, vn3Var9);
        ym3 ym3Var14 = new ym3("SFIXED32", 13, 13, 1, vn3Var4);
        ym3 ym3Var15 = new ym3("SFIXED64", 14, 14, 1, vn3Var3);
        ym3 ym3Var16 = new ym3("SINT32", 15, 15, 1, vn3Var4);
        ym3 ym3Var17 = new ym3("SINT64", 16, 16, 1, vn3Var3);
        ym3 ym3Var18 = new ym3("GROUP", 17, 17, 1, vn3Var7);
        ym3 ym3Var19 = new ym3("DOUBLE_LIST", 18, 18, 2, vn3Var);
        ym3 ym3Var20 = new ym3("FLOAT_LIST", 19, 19, 2, vn3Var2);
        ym3 ym3Var21 = new ym3("INT64_LIST", 20, 20, 2, vn3Var3);
        ym3 ym3Var22 = new ym3("UINT64_LIST", 21, 21, 2, vn3Var3);
        ym3 ym3Var23 = new ym3("INT32_LIST", 22, 22, 2, vn3Var4);
        ym3 ym3Var24 = new ym3("FIXED64_LIST", 23, 23, 2, vn3Var3);
        ym3 ym3Var25 = new ym3("FIXED32_LIST", 24, 24, 2, vn3Var4);
        ym3 ym3Var26 = new ym3("BOOL_LIST", 25, 25, 2, vn3Var5);
        ym3 ym3Var27 = new ym3("STRING_LIST", 26, 26, 2, vn3Var6);
        ym3 ym3Var28 = new ym3("MESSAGE_LIST", 27, 27, 2, vn3Var7);
        ym3 ym3Var29 = new ym3("BYTES_LIST", 28, 28, 2, vn3Var8);
        ym3 ym3Var30 = new ym3("UINT32_LIST", 29, 29, 2, vn3Var4);
        ym3 ym3Var31 = new ym3("ENUM_LIST", 30, 30, 2, vn3Var9);
        ym3 ym3Var32 = new ym3("SFIXED32_LIST", 31, 31, 2, vn3Var4);
        ym3 ym3Var33 = new ym3("SFIXED64_LIST", 32, 32, 2, vn3Var3);
        ym3 ym3Var34 = new ym3("SINT32_LIST", 33, 33, 2, vn3Var4);
        ym3 ym3Var35 = new ym3("SINT64_LIST", 34, 34, 2, vn3Var3);
        ym3 ym3Var36 = new ym3("DOUBLE_LIST_PACKED", 35, 35, 3, vn3Var);
        n = ym3Var36;
        ym3 ym3Var37 = new ym3("FLOAT_LIST_PACKED", 36, 36, 3, vn3Var2);
        ym3 ym3Var38 = new ym3("INT64_LIST_PACKED", 37, 37, 3, vn3Var3);
        ym3 ym3Var39 = new ym3("UINT64_LIST_PACKED", 38, 38, 3, vn3Var3);
        ym3 ym3Var40 = new ym3("INT32_LIST_PACKED", 39, 39, 3, vn3Var4);
        ym3 ym3Var41 = new ym3("FIXED64_LIST_PACKED", 40, 40, 3, vn3Var3);
        ym3 ym3Var42 = new ym3("FIXED32_LIST_PACKED", 41, 41, 3, vn3Var4);
        ym3 ym3Var43 = new ym3("BOOL_LIST_PACKED", 42, 42, 3, vn3Var5);
        ym3 ym3Var44 = new ym3("UINT32_LIST_PACKED", 43, 43, 3, vn3Var4);
        ym3 ym3Var45 = new ym3("ENUM_LIST_PACKED", 44, 44, 3, vn3Var9);
        ym3 ym3Var46 = new ym3("SFIXED32_LIST_PACKED", 45, 45, 3, vn3Var4);
        ym3 ym3Var47 = new ym3("SFIXED64_LIST_PACKED", 46, 46, 3, vn3Var3);
        ym3 ym3Var48 = new ym3("SINT32_LIST_PACKED", 47, 47, 3, vn3Var4);
        ym3 ym3Var49 = new ym3("SINT64_LIST_PACKED", 48, 48, 3, vn3Var3);
        o = ym3Var49;
        q = new ym3[]{ym3Var, ym3Var2, ym3Var3, ym3Var4, ym3Var5, ym3Var6, ym3Var7, ym3Var8, ym3Var9, ym3Var10, ym3Var11, ym3Var12, ym3Var13, ym3Var14, ym3Var15, ym3Var16, ym3Var17, ym3Var18, ym3Var19, ym3Var20, ym3Var21, ym3Var22, ym3Var23, ym3Var24, ym3Var25, ym3Var26, ym3Var27, ym3Var28, ym3Var29, ym3Var30, ym3Var31, ym3Var32, ym3Var33, ym3Var34, ym3Var35, ym3Var36, ym3Var37, ym3Var38, ym3Var39, ym3Var40, ym3Var41, ym3Var42, ym3Var43, ym3Var44, ym3Var45, ym3Var46, ym3Var47, ym3Var48, ym3Var49, new ym3("GROUP_LIST", 49, 49, 2, vn3Var7), new ym3("MAP", 50, 50, 4, vn3.m)};
        ym3[] values = values();
        p = new ym3[values.length];
        for (ym3 ym3Var50 : values) {
            p[ym3Var50.m] = ym3Var50;
        }
    }

    public ym3(String str, int i, int i2, int i3, vn3 vn3Var) {
        this.m = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            vn3Var.getClass();
        } else if (i4 == 3) {
            vn3Var.getClass();
        }
        if (i3 == 1) {
            vn3 vn3Var2 = vn3.m;
            vn3Var.ordinal();
        }
    }

    public static ym3[] values() {
        return (ym3[]) q.clone();
    }
}
