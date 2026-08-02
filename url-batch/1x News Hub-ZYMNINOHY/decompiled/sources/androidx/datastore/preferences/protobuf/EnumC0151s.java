package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0151s {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0151s f2346b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0151s f2347c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0151s[] f2348d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0151s[] f2349e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2350a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0151s EF0;

    static {
        B b3 = B.DOUBLE;
        EnumC0151s enumC0151s = new EnumC0151s("DOUBLE", 0, 0, 1, b3);
        B b4 = B.FLOAT;
        EnumC0151s enumC0151s2 = new EnumC0151s("FLOAT", 1, 1, 1, b4);
        B b5 = B.LONG;
        EnumC0151s enumC0151s3 = new EnumC0151s("INT64", 2, 2, 1, b5);
        EnumC0151s enumC0151s4 = new EnumC0151s("UINT64", 3, 3, 1, b5);
        B b6 = B.INT;
        EnumC0151s enumC0151s5 = new EnumC0151s("INT32", 4, 4, 1, b6);
        EnumC0151s enumC0151s6 = new EnumC0151s("FIXED64", 5, 5, 1, b5);
        EnumC0151s enumC0151s7 = new EnumC0151s("FIXED32", 6, 6, 1, b6);
        B b7 = B.BOOLEAN;
        EnumC0151s enumC0151s8 = new EnumC0151s("BOOL", 7, 7, 1, b7);
        B b8 = B.STRING;
        EnumC0151s enumC0151s9 = new EnumC0151s("STRING", 8, 8, 1, b8);
        B b9 = B.MESSAGE;
        EnumC0151s enumC0151s10 = new EnumC0151s("MESSAGE", 9, 9, 1, b9);
        B b10 = B.BYTE_STRING;
        EnumC0151s enumC0151s11 = new EnumC0151s("BYTES", 10, 10, 1, b10);
        EnumC0151s enumC0151s12 = new EnumC0151s("UINT32", 11, 11, 1, b6);
        B b11 = B.ENUM;
        EnumC0151s enumC0151s13 = new EnumC0151s("ENUM", 12, 12, 1, b11);
        EnumC0151s enumC0151s14 = new EnumC0151s("SFIXED32", 13, 13, 1, b6);
        EnumC0151s enumC0151s15 = new EnumC0151s("SFIXED64", 14, 14, 1, b5);
        EnumC0151s enumC0151s16 = new EnumC0151s("SINT32", 15, 15, 1, b6);
        EnumC0151s enumC0151s17 = new EnumC0151s("SINT64", 16, 16, 1, b5);
        EnumC0151s enumC0151s18 = new EnumC0151s("GROUP", 17, 17, 1, b9);
        EnumC0151s enumC0151s19 = new EnumC0151s("DOUBLE_LIST", 18, 18, 2, b3);
        EnumC0151s enumC0151s20 = new EnumC0151s("FLOAT_LIST", 19, 19, 2, b4);
        EnumC0151s enumC0151s21 = new EnumC0151s("INT64_LIST", 20, 20, 2, b5);
        EnumC0151s enumC0151s22 = new EnumC0151s("UINT64_LIST", 21, 21, 2, b5);
        EnumC0151s enumC0151s23 = new EnumC0151s("INT32_LIST", 22, 22, 2, b6);
        EnumC0151s enumC0151s24 = new EnumC0151s("FIXED64_LIST", 23, 23, 2, b5);
        EnumC0151s enumC0151s25 = new EnumC0151s("FIXED32_LIST", 24, 24, 2, b6);
        EnumC0151s enumC0151s26 = new EnumC0151s("BOOL_LIST", 25, 25, 2, b7);
        EnumC0151s enumC0151s27 = new EnumC0151s("STRING_LIST", 26, 26, 2, b8);
        EnumC0151s enumC0151s28 = new EnumC0151s("MESSAGE_LIST", 27, 27, 2, b9);
        EnumC0151s enumC0151s29 = new EnumC0151s("BYTES_LIST", 28, 28, 2, b10);
        EnumC0151s enumC0151s30 = new EnumC0151s("UINT32_LIST", 29, 29, 2, b6);
        EnumC0151s enumC0151s31 = new EnumC0151s("ENUM_LIST", 30, 30, 2, b11);
        EnumC0151s enumC0151s32 = new EnumC0151s("SFIXED32_LIST", 31, 31, 2, b6);
        EnumC0151s enumC0151s33 = new EnumC0151s("SFIXED64_LIST", 32, 32, 2, b5);
        EnumC0151s enumC0151s34 = new EnumC0151s("SINT32_LIST", 33, 33, 2, b6);
        EnumC0151s enumC0151s35 = new EnumC0151s("SINT64_LIST", 34, 34, 2, b5);
        EnumC0151s enumC0151s36 = new EnumC0151s("DOUBLE_LIST_PACKED", 35, 35, 3, b3);
        f2346b = enumC0151s36;
        EnumC0151s enumC0151s37 = new EnumC0151s("FLOAT_LIST_PACKED", 36, 36, 3, b4);
        EnumC0151s enumC0151s38 = new EnumC0151s("INT64_LIST_PACKED", 37, 37, 3, b5);
        EnumC0151s enumC0151s39 = new EnumC0151s("UINT64_LIST_PACKED", 38, 38, 3, b5);
        EnumC0151s enumC0151s40 = new EnumC0151s("INT32_LIST_PACKED", 39, 39, 3, b6);
        EnumC0151s enumC0151s41 = new EnumC0151s("FIXED64_LIST_PACKED", 40, 40, 3, b5);
        EnumC0151s enumC0151s42 = new EnumC0151s("FIXED32_LIST_PACKED", 41, 41, 3, b6);
        EnumC0151s enumC0151s43 = new EnumC0151s("BOOL_LIST_PACKED", 42, 42, 3, b7);
        EnumC0151s enumC0151s44 = new EnumC0151s("UINT32_LIST_PACKED", 43, 43, 3, b6);
        EnumC0151s enumC0151s45 = new EnumC0151s("ENUM_LIST_PACKED", 44, 44, 3, b11);
        EnumC0151s enumC0151s46 = new EnumC0151s("SFIXED32_LIST_PACKED", 45, 45, 3, b6);
        EnumC0151s enumC0151s47 = new EnumC0151s("SFIXED64_LIST_PACKED", 46, 46, 3, b5);
        EnumC0151s enumC0151s48 = new EnumC0151s("SINT32_LIST_PACKED", 47, 47, 3, b6);
        EnumC0151s enumC0151s49 = new EnumC0151s("SINT64_LIST_PACKED", 48, 48, 3, b5);
        f2347c = enumC0151s49;
        f2349e = new EnumC0151s[]{enumC0151s, enumC0151s2, enumC0151s3, enumC0151s4, enumC0151s5, enumC0151s6, enumC0151s7, enumC0151s8, enumC0151s9, enumC0151s10, enumC0151s11, enumC0151s12, enumC0151s13, enumC0151s14, enumC0151s15, enumC0151s16, enumC0151s17, enumC0151s18, enumC0151s19, enumC0151s20, enumC0151s21, enumC0151s22, enumC0151s23, enumC0151s24, enumC0151s25, enumC0151s26, enumC0151s27, enumC0151s28, enumC0151s29, enumC0151s30, enumC0151s31, enumC0151s32, enumC0151s33, enumC0151s34, enumC0151s35, enumC0151s36, enumC0151s37, enumC0151s38, enumC0151s39, enumC0151s40, enumC0151s41, enumC0151s42, enumC0151s43, enumC0151s44, enumC0151s45, enumC0151s46, enumC0151s47, enumC0151s48, enumC0151s49, new EnumC0151s("GROUP_LIST", 49, 49, 2, b9), new EnumC0151s("MAP", 50, 50, 4, B.VOID)};
        EnumC0151s[] values = values();
        f2348d = new EnumC0151s[values.length];
        for (EnumC0151s enumC0151s50 : values) {
            f2348d[enumC0151s50.f2350a] = enumC0151s50;
        }
    }

    public EnumC0151s(String str, int i3, int i4, int i5, B b3) {
        this.f2350a = i4;
        int b4 = M.j.b(i5);
        if (b4 == 1) {
            b3.getClass();
        } else if (b4 == 3) {
            b3.getClass();
        }
        if (i5 == 1) {
            b3.ordinal();
        }
    }

    public static EnumC0151s valueOf(String str) {
        return (EnumC0151s) Enum.valueOf(EnumC0151s.class, str);
    }

    public static EnumC0151s[] values() {
        return (EnumC0151s[]) f2349e.clone();
    }
}
