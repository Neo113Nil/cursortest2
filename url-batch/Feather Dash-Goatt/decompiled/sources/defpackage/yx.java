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
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yx {
    public static final yx e;
    public static final yx g;
    public static final yx[] h;
    public static final /* synthetic */ yx[] i;
    public final int d;

    /* JADX INFO: Fake field, exist only in values array */
    yx EF0;

    static {
        hb0 hb0Var = hb0.i;
        yx yxVar = new yx("DOUBLE", 0, 0, 1, hb0Var);
        hb0 hb0Var2 = hb0.h;
        yx yxVar2 = new yx("FLOAT", 1, 1, 1, hb0Var2);
        hb0 hb0Var3 = hb0.g;
        yx yxVar3 = new yx("INT64", 2, 2, 1, hb0Var3);
        yx yxVar4 = new yx("UINT64", 3, 3, 1, hb0Var3);
        hb0 hb0Var4 = hb0.e;
        yx yxVar5 = new yx("INT32", 4, 4, 1, hb0Var4);
        yx yxVar6 = new yx("FIXED64", 5, 5, 1, hb0Var3);
        yx yxVar7 = new yx("FIXED32", 6, 6, 1, hb0Var4);
        hb0 hb0Var5 = hb0.j;
        yx yxVar8 = new yx("BOOL", 7, 7, 1, hb0Var5);
        hb0 hb0Var6 = hb0.k;
        yx yxVar9 = new yx("STRING", 8, 8, 1, hb0Var6);
        hb0 hb0Var7 = hb0.n;
        yx yxVar10 = new yx("MESSAGE", 9, 9, 1, hb0Var7);
        hb0 hb0Var8 = hb0.l;
        yx yxVar11 = new yx("BYTES", 10, 10, 1, hb0Var8);
        yx yxVar12 = new yx("UINT32", 11, 11, 1, hb0Var4);
        hb0 hb0Var9 = hb0.m;
        yx yxVar13 = new yx("ENUM", 12, 12, 1, hb0Var9);
        yx yxVar14 = new yx("SFIXED32", 13, 13, 1, hb0Var4);
        yx yxVar15 = new yx("SFIXED64", 14, 14, 1, hb0Var3);
        yx yxVar16 = new yx("SINT32", 15, 15, 1, hb0Var4);
        yx yxVar17 = new yx("SINT64", 16, 16, 1, hb0Var3);
        yx yxVar18 = new yx("GROUP", 17, 17, 1, hb0Var7);
        yx yxVar19 = new yx("DOUBLE_LIST", 18, 18, 2, hb0Var);
        yx yxVar20 = new yx("FLOAT_LIST", 19, 19, 2, hb0Var2);
        yx yxVar21 = new yx("INT64_LIST", 20, 20, 2, hb0Var3);
        yx yxVar22 = new yx("UINT64_LIST", 21, 21, 2, hb0Var3);
        yx yxVar23 = new yx("INT32_LIST", 22, 22, 2, hb0Var4);
        yx yxVar24 = new yx("FIXED64_LIST", 23, 23, 2, hb0Var3);
        yx yxVar25 = new yx("FIXED32_LIST", 24, 24, 2, hb0Var4);
        yx yxVar26 = new yx("BOOL_LIST", 25, 25, 2, hb0Var5);
        yx yxVar27 = new yx("STRING_LIST", 26, 26, 2, hb0Var6);
        yx yxVar28 = new yx("MESSAGE_LIST", 27, 27, 2, hb0Var7);
        yx yxVar29 = new yx("BYTES_LIST", 28, 28, 2, hb0Var8);
        yx yxVar30 = new yx("UINT32_LIST", 29, 29, 2, hb0Var4);
        yx yxVar31 = new yx("ENUM_LIST", 30, 30, 2, hb0Var9);
        yx yxVar32 = new yx("SFIXED32_LIST", 31, 31, 2, hb0Var4);
        yx yxVar33 = new yx("SFIXED64_LIST", 32, 32, 2, hb0Var3);
        yx yxVar34 = new yx("SINT32_LIST", 33, 33, 2, hb0Var4);
        yx yxVar35 = new yx("SINT64_LIST", 34, 34, 2, hb0Var3);
        yx yxVar36 = new yx("DOUBLE_LIST_PACKED", 35, 35, 3, hb0Var);
        e = yxVar36;
        yx yxVar37 = new yx("FLOAT_LIST_PACKED", 36, 36, 3, hb0Var2);
        yx yxVar38 = new yx("INT64_LIST_PACKED", 37, 37, 3, hb0Var3);
        yx yxVar39 = new yx("UINT64_LIST_PACKED", 38, 38, 3, hb0Var3);
        yx yxVar40 = new yx("INT32_LIST_PACKED", 39, 39, 3, hb0Var4);
        yx yxVar41 = new yx("FIXED64_LIST_PACKED", 40, 40, 3, hb0Var3);
        yx yxVar42 = new yx("FIXED32_LIST_PACKED", 41, 41, 3, hb0Var4);
        yx yxVar43 = new yx("BOOL_LIST_PACKED", 42, 42, 3, hb0Var5);
        yx yxVar44 = new yx("UINT32_LIST_PACKED", 43, 43, 3, hb0Var4);
        yx yxVar45 = new yx("ENUM_LIST_PACKED", 44, 44, 3, hb0Var9);
        yx yxVar46 = new yx("SFIXED32_LIST_PACKED", 45, 45, 3, hb0Var4);
        yx yxVar47 = new yx("SFIXED64_LIST_PACKED", 46, 46, 3, hb0Var3);
        yx yxVar48 = new yx("SINT32_LIST_PACKED", 47, 47, 3, hb0Var4);
        yx yxVar49 = new yx("SINT64_LIST_PACKED", 48, 48, 3, hb0Var3);
        g = yxVar49;
        i = new yx[]{yxVar, yxVar2, yxVar3, yxVar4, yxVar5, yxVar6, yxVar7, yxVar8, yxVar9, yxVar10, yxVar11, yxVar12, yxVar13, yxVar14, yxVar15, yxVar16, yxVar17, yxVar18, yxVar19, yxVar20, yxVar21, yxVar22, yxVar23, yxVar24, yxVar25, yxVar26, yxVar27, yxVar28, yxVar29, yxVar30, yxVar31, yxVar32, yxVar33, yxVar34, yxVar35, yxVar36, yxVar37, yxVar38, yxVar39, yxVar40, yxVar41, yxVar42, yxVar43, yxVar44, yxVar45, yxVar46, yxVar47, yxVar48, yxVar49, new yx("GROUP_LIST", 49, 49, 2, hb0Var7), new yx("MAP", 50, 50, 4, hb0.d)};
        yx[] values = values();
        h = new yx[values.length];
        for (yx yxVar50 : values) {
            h[yxVar50.d] = yxVar50;
        }
    }

    public yx(String str, int i2, int i3, int i4, hb0 hb0Var) {
        this.d = i3;
        int v = qy0.v(i4);
        if (v == 1) {
            hb0Var.getClass();
        } else if (v == 3) {
            hb0Var.getClass();
        }
        if (i4 == 1) {
            hb0Var.ordinal();
        }
    }

    public static yx valueOf(String str) {
        return (yx) Enum.valueOf(yx.class, str);
    }

    public static yx[] values() {
        return (yx[]) i.clone();
    }
}
