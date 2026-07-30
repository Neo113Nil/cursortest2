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
public final class sk0 {
    public static final sk0 n;
    public static final sk0 o;
    public static final sk0[] p;
    public static final /* synthetic */ sk0[] q;
    public final int m;

    /* JADX INFO: Fake field, exist only in values array */
    sk0 EF0;

    static {
        m51 m51Var = m51.q;
        sk0 sk0Var = new sk0("DOUBLE", 0, 0, 1, m51Var);
        m51 m51Var2 = m51.p;
        sk0 sk0Var2 = new sk0("FLOAT", 1, 1, 1, m51Var2);
        m51 m51Var3 = m51.o;
        sk0 sk0Var3 = new sk0("INT64", 2, 2, 1, m51Var3);
        sk0 sk0Var4 = new sk0("UINT64", 3, 3, 1, m51Var3);
        m51 m51Var4 = m51.n;
        sk0 sk0Var5 = new sk0("INT32", 4, 4, 1, m51Var4);
        sk0 sk0Var6 = new sk0("FIXED64", 5, 5, 1, m51Var3);
        sk0 sk0Var7 = new sk0("FIXED32", 6, 6, 1, m51Var4);
        m51 m51Var5 = m51.r;
        sk0 sk0Var8 = new sk0("BOOL", 7, 7, 1, m51Var5);
        m51 m51Var6 = m51.s;
        sk0 sk0Var9 = new sk0("STRING", 8, 8, 1, m51Var6);
        m51 m51Var7 = m51.v;
        sk0 sk0Var10 = new sk0("MESSAGE", 9, 9, 1, m51Var7);
        m51 m51Var8 = m51.t;
        sk0 sk0Var11 = new sk0("BYTES", 10, 10, 1, m51Var8);
        sk0 sk0Var12 = new sk0("UINT32", 11, 11, 1, m51Var4);
        m51 m51Var9 = m51.u;
        sk0 sk0Var13 = new sk0("ENUM", 12, 12, 1, m51Var9);
        sk0 sk0Var14 = new sk0("SFIXED32", 13, 13, 1, m51Var4);
        sk0 sk0Var15 = new sk0("SFIXED64", 14, 14, 1, m51Var3);
        sk0 sk0Var16 = new sk0("SINT32", 15, 15, 1, m51Var4);
        sk0 sk0Var17 = new sk0("SINT64", 16, 16, 1, m51Var3);
        sk0 sk0Var18 = new sk0("GROUP", 17, 17, 1, m51Var7);
        sk0 sk0Var19 = new sk0("DOUBLE_LIST", 18, 18, 2, m51Var);
        sk0 sk0Var20 = new sk0("FLOAT_LIST", 19, 19, 2, m51Var2);
        sk0 sk0Var21 = new sk0("INT64_LIST", 20, 20, 2, m51Var3);
        sk0 sk0Var22 = new sk0("UINT64_LIST", 21, 21, 2, m51Var3);
        sk0 sk0Var23 = new sk0("INT32_LIST", 22, 22, 2, m51Var4);
        sk0 sk0Var24 = new sk0("FIXED64_LIST", 23, 23, 2, m51Var3);
        sk0 sk0Var25 = new sk0("FIXED32_LIST", 24, 24, 2, m51Var4);
        sk0 sk0Var26 = new sk0("BOOL_LIST", 25, 25, 2, m51Var5);
        sk0 sk0Var27 = new sk0("STRING_LIST", 26, 26, 2, m51Var6);
        sk0 sk0Var28 = new sk0("MESSAGE_LIST", 27, 27, 2, m51Var7);
        sk0 sk0Var29 = new sk0("BYTES_LIST", 28, 28, 2, m51Var8);
        sk0 sk0Var30 = new sk0("UINT32_LIST", 29, 29, 2, m51Var4);
        sk0 sk0Var31 = new sk0("ENUM_LIST", 30, 30, 2, m51Var9);
        sk0 sk0Var32 = new sk0("SFIXED32_LIST", 31, 31, 2, m51Var4);
        sk0 sk0Var33 = new sk0("SFIXED64_LIST", 32, 32, 2, m51Var3);
        sk0 sk0Var34 = new sk0("SINT32_LIST", 33, 33, 2, m51Var4);
        sk0 sk0Var35 = new sk0("SINT64_LIST", 34, 34, 2, m51Var3);
        sk0 sk0Var36 = new sk0("DOUBLE_LIST_PACKED", 35, 35, 3, m51Var);
        n = sk0Var36;
        sk0 sk0Var37 = new sk0("FLOAT_LIST_PACKED", 36, 36, 3, m51Var2);
        sk0 sk0Var38 = new sk0("INT64_LIST_PACKED", 37, 37, 3, m51Var3);
        sk0 sk0Var39 = new sk0("UINT64_LIST_PACKED", 38, 38, 3, m51Var3);
        sk0 sk0Var40 = new sk0("INT32_LIST_PACKED", 39, 39, 3, m51Var4);
        sk0 sk0Var41 = new sk0("FIXED64_LIST_PACKED", 40, 40, 3, m51Var3);
        sk0 sk0Var42 = new sk0("FIXED32_LIST_PACKED", 41, 41, 3, m51Var4);
        sk0 sk0Var43 = new sk0("BOOL_LIST_PACKED", 42, 42, 3, m51Var5);
        sk0 sk0Var44 = new sk0("UINT32_LIST_PACKED", 43, 43, 3, m51Var4);
        sk0 sk0Var45 = new sk0("ENUM_LIST_PACKED", 44, 44, 3, m51Var9);
        sk0 sk0Var46 = new sk0("SFIXED32_LIST_PACKED", 45, 45, 3, m51Var4);
        sk0 sk0Var47 = new sk0("SFIXED64_LIST_PACKED", 46, 46, 3, m51Var3);
        sk0 sk0Var48 = new sk0("SINT32_LIST_PACKED", 47, 47, 3, m51Var4);
        sk0 sk0Var49 = new sk0("SINT64_LIST_PACKED", 48, 48, 3, m51Var3);
        o = sk0Var49;
        q = new sk0[]{sk0Var, sk0Var2, sk0Var3, sk0Var4, sk0Var5, sk0Var6, sk0Var7, sk0Var8, sk0Var9, sk0Var10, sk0Var11, sk0Var12, sk0Var13, sk0Var14, sk0Var15, sk0Var16, sk0Var17, sk0Var18, sk0Var19, sk0Var20, sk0Var21, sk0Var22, sk0Var23, sk0Var24, sk0Var25, sk0Var26, sk0Var27, sk0Var28, sk0Var29, sk0Var30, sk0Var31, sk0Var32, sk0Var33, sk0Var34, sk0Var35, sk0Var36, sk0Var37, sk0Var38, sk0Var39, sk0Var40, sk0Var41, sk0Var42, sk0Var43, sk0Var44, sk0Var45, sk0Var46, sk0Var47, sk0Var48, sk0Var49, new sk0("GROUP_LIST", 49, 49, 2, m51Var7), new sk0("MAP", 50, 50, 4, m51.m)};
        sk0[] values = values();
        p = new sk0[values.length];
        for (sk0 sk0Var50 : values) {
            p[sk0Var50.m] = sk0Var50;
        }
    }

    public sk0(String str, int i, int i2, int i3, m51 m51Var) {
        this.m = i2;
        int u = q40.u(i3);
        if (u == 1) {
            m51Var.getClass();
        } else if (u == 3) {
            m51Var.getClass();
        }
        if (i3 == 1) {
            m51Var.ordinal();
        }
    }

    public static sk0 valueOf(String str) {
        return (sk0) Enum.valueOf(sk0.class, str);
    }

    public static sk0[] values() {
        return (sk0[]) q.clone();
    }
}
