package com.google.android.gms.internal.play_billing;

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
/* renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0213c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0213c1 f2839b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0213c1 f2840c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0213c1[] f2841d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0213c1[] f2842e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2843a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0213c1 EF0;

    static {
        EnumC0249o1 enumC0249o1 = EnumC0249o1.f2899e;
        EnumC0213c1 enumC0213c1 = new EnumC0213c1("DOUBLE", 0, 0, 1, enumC0249o1);
        EnumC0249o1 enumC0249o12 = EnumC0249o1.f2898d;
        EnumC0213c1 enumC0213c12 = new EnumC0213c1("FLOAT", 1, 1, 1, enumC0249o12);
        EnumC0249o1 enumC0249o13 = EnumC0249o1.f2897c;
        EnumC0213c1 enumC0213c13 = new EnumC0213c1("INT64", 2, 2, 1, enumC0249o13);
        EnumC0213c1 enumC0213c14 = new EnumC0213c1("UINT64", 3, 3, 1, enumC0249o13);
        EnumC0249o1 enumC0249o14 = EnumC0249o1.f2896b;
        EnumC0213c1 enumC0213c15 = new EnumC0213c1("INT32", 4, 4, 1, enumC0249o14);
        EnumC0213c1 enumC0213c16 = new EnumC0213c1("FIXED64", 5, 5, 1, enumC0249o13);
        EnumC0213c1 enumC0213c17 = new EnumC0213c1("FIXED32", 6, 6, 1, enumC0249o14);
        EnumC0249o1 enumC0249o15 = EnumC0249o1.f;
        EnumC0213c1 enumC0213c18 = new EnumC0213c1("BOOL", 7, 7, 1, enumC0249o15);
        EnumC0249o1 enumC0249o16 = EnumC0249o1.f2900g;
        EnumC0213c1 enumC0213c19 = new EnumC0213c1("STRING", 8, 8, 1, enumC0249o16);
        EnumC0249o1 enumC0249o17 = EnumC0249o1.f2903j;
        EnumC0213c1 enumC0213c110 = new EnumC0213c1("MESSAGE", 9, 9, 1, enumC0249o17);
        EnumC0249o1 enumC0249o18 = EnumC0249o1.f2901h;
        EnumC0213c1 enumC0213c111 = new EnumC0213c1("BYTES", 10, 10, 1, enumC0249o18);
        EnumC0213c1 enumC0213c112 = new EnumC0213c1("UINT32", 11, 11, 1, enumC0249o14);
        EnumC0249o1 enumC0249o19 = EnumC0249o1.f2902i;
        EnumC0213c1 enumC0213c113 = new EnumC0213c1("ENUM", 12, 12, 1, enumC0249o19);
        EnumC0213c1 enumC0213c114 = new EnumC0213c1("SFIXED32", 13, 13, 1, enumC0249o14);
        EnumC0213c1 enumC0213c115 = new EnumC0213c1("SFIXED64", 14, 14, 1, enumC0249o13);
        EnumC0213c1 enumC0213c116 = new EnumC0213c1("SINT32", 15, 15, 1, enumC0249o14);
        EnumC0213c1 enumC0213c117 = new EnumC0213c1("SINT64", 16, 16, 1, enumC0249o13);
        EnumC0213c1 enumC0213c118 = new EnumC0213c1("GROUP", 17, 17, 1, enumC0249o17);
        EnumC0213c1 enumC0213c119 = new EnumC0213c1("DOUBLE_LIST", 18, 18, 2, enumC0249o1);
        EnumC0213c1 enumC0213c120 = new EnumC0213c1("FLOAT_LIST", 19, 19, 2, enumC0249o12);
        EnumC0213c1 enumC0213c121 = new EnumC0213c1("INT64_LIST", 20, 20, 2, enumC0249o13);
        EnumC0213c1 enumC0213c122 = new EnumC0213c1("UINT64_LIST", 21, 21, 2, enumC0249o13);
        EnumC0213c1 enumC0213c123 = new EnumC0213c1("INT32_LIST", 22, 22, 2, enumC0249o14);
        EnumC0213c1 enumC0213c124 = new EnumC0213c1("FIXED64_LIST", 23, 23, 2, enumC0249o13);
        EnumC0213c1 enumC0213c125 = new EnumC0213c1("FIXED32_LIST", 24, 24, 2, enumC0249o14);
        EnumC0213c1 enumC0213c126 = new EnumC0213c1("BOOL_LIST", 25, 25, 2, enumC0249o15);
        EnumC0213c1 enumC0213c127 = new EnumC0213c1("STRING_LIST", 26, 26, 2, enumC0249o16);
        EnumC0213c1 enumC0213c128 = new EnumC0213c1("MESSAGE_LIST", 27, 27, 2, enumC0249o17);
        EnumC0213c1 enumC0213c129 = new EnumC0213c1("BYTES_LIST", 28, 28, 2, enumC0249o18);
        EnumC0213c1 enumC0213c130 = new EnumC0213c1("UINT32_LIST", 29, 29, 2, enumC0249o14);
        EnumC0213c1 enumC0213c131 = new EnumC0213c1("ENUM_LIST", 30, 30, 2, enumC0249o19);
        EnumC0213c1 enumC0213c132 = new EnumC0213c1("SFIXED32_LIST", 31, 31, 2, enumC0249o14);
        EnumC0213c1 enumC0213c133 = new EnumC0213c1("SFIXED64_LIST", 32, 32, 2, enumC0249o13);
        EnumC0213c1 enumC0213c134 = new EnumC0213c1("SINT32_LIST", 33, 33, 2, enumC0249o14);
        EnumC0213c1 enumC0213c135 = new EnumC0213c1("SINT64_LIST", 34, 34, 2, enumC0249o13);
        EnumC0213c1 enumC0213c136 = new EnumC0213c1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0249o1);
        f2839b = enumC0213c136;
        EnumC0213c1 enumC0213c137 = new EnumC0213c1("FLOAT_LIST_PACKED", 36, 36, 3, enumC0249o12);
        EnumC0213c1 enumC0213c138 = new EnumC0213c1("INT64_LIST_PACKED", 37, 37, 3, enumC0249o13);
        EnumC0213c1 enumC0213c139 = new EnumC0213c1("UINT64_LIST_PACKED", 38, 38, 3, enumC0249o13);
        EnumC0213c1 enumC0213c140 = new EnumC0213c1("INT32_LIST_PACKED", 39, 39, 3, enumC0249o14);
        EnumC0213c1 enumC0213c141 = new EnumC0213c1("FIXED64_LIST_PACKED", 40, 40, 3, enumC0249o13);
        EnumC0213c1 enumC0213c142 = new EnumC0213c1("FIXED32_LIST_PACKED", 41, 41, 3, enumC0249o14);
        EnumC0213c1 enumC0213c143 = new EnumC0213c1("BOOL_LIST_PACKED", 42, 42, 3, enumC0249o15);
        EnumC0213c1 enumC0213c144 = new EnumC0213c1("UINT32_LIST_PACKED", 43, 43, 3, enumC0249o14);
        EnumC0213c1 enumC0213c145 = new EnumC0213c1("ENUM_LIST_PACKED", 44, 44, 3, enumC0249o19);
        EnumC0213c1 enumC0213c146 = new EnumC0213c1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0249o14);
        EnumC0213c1 enumC0213c147 = new EnumC0213c1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0249o13);
        EnumC0213c1 enumC0213c148 = new EnumC0213c1("SINT32_LIST_PACKED", 47, 47, 3, enumC0249o14);
        EnumC0213c1 enumC0213c149 = new EnumC0213c1("SINT64_LIST_PACKED", 48, 48, 3, enumC0249o13);
        f2840c = enumC0213c149;
        f2842e = new EnumC0213c1[]{enumC0213c1, enumC0213c12, enumC0213c13, enumC0213c14, enumC0213c15, enumC0213c16, enumC0213c17, enumC0213c18, enumC0213c19, enumC0213c110, enumC0213c111, enumC0213c112, enumC0213c113, enumC0213c114, enumC0213c115, enumC0213c116, enumC0213c117, enumC0213c118, enumC0213c119, enumC0213c120, enumC0213c121, enumC0213c122, enumC0213c123, enumC0213c124, enumC0213c125, enumC0213c126, enumC0213c127, enumC0213c128, enumC0213c129, enumC0213c130, enumC0213c131, enumC0213c132, enumC0213c133, enumC0213c134, enumC0213c135, enumC0213c136, enumC0213c137, enumC0213c138, enumC0213c139, enumC0213c140, enumC0213c141, enumC0213c142, enumC0213c143, enumC0213c144, enumC0213c145, enumC0213c146, enumC0213c147, enumC0213c148, enumC0213c149, new EnumC0213c1("GROUP_LIST", 49, 49, 2, enumC0249o17), new EnumC0213c1("MAP", 50, 50, 4, EnumC0249o1.f2895a)};
        EnumC0213c1[] values = values();
        f2841d = new EnumC0213c1[values.length];
        for (EnumC0213c1 enumC0213c150 : values) {
            f2841d[enumC0213c150.f2843a] = enumC0213c150;
        }
    }

    public EnumC0213c1(String str, int i3, int i4, int i5, EnumC0249o1 enumC0249o1) {
        this.f2843a = i4;
        int i6 = i5 - 1;
        if (i6 == 1) {
            enumC0249o1.getClass();
        } else if (i6 == 3) {
            enumC0249o1.getClass();
        }
        if (i5 == 1) {
            EnumC0249o1 enumC0249o12 = EnumC0249o1.f2895a;
            enumC0249o1.ordinal();
        }
    }

    public static EnumC0213c1[] values() {
        return (EnumC0213c1[]) f2842e.clone();
    }
}
