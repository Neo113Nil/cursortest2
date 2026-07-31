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
public final class EnumC0106s {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0106s f1576f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0106s f1577g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0106s[] f1578h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0106s[] f1579i;

    /* renamed from: e, reason: collision with root package name */
    public final int f1580e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0106s EF0;

    static {
        B b2 = B.DOUBLE;
        EnumC0106s enumC0106s = new EnumC0106s("DOUBLE", 0, 0, 1, b2);
        B b3 = B.FLOAT;
        EnumC0106s enumC0106s2 = new EnumC0106s("FLOAT", 1, 1, 1, b3);
        B b4 = B.LONG;
        EnumC0106s enumC0106s3 = new EnumC0106s("INT64", 2, 2, 1, b4);
        EnumC0106s enumC0106s4 = new EnumC0106s("UINT64", 3, 3, 1, b4);
        B b5 = B.INT;
        EnumC0106s enumC0106s5 = new EnumC0106s("INT32", 4, 4, 1, b5);
        EnumC0106s enumC0106s6 = new EnumC0106s("FIXED64", 5, 5, 1, b4);
        EnumC0106s enumC0106s7 = new EnumC0106s("FIXED32", 6, 6, 1, b5);
        B b6 = B.BOOLEAN;
        EnumC0106s enumC0106s8 = new EnumC0106s("BOOL", 7, 7, 1, b6);
        B b7 = B.STRING;
        EnumC0106s enumC0106s9 = new EnumC0106s("STRING", 8, 8, 1, b7);
        B b8 = B.MESSAGE;
        EnumC0106s enumC0106s10 = new EnumC0106s("MESSAGE", 9, 9, 1, b8);
        B b9 = B.BYTE_STRING;
        EnumC0106s enumC0106s11 = new EnumC0106s("BYTES", 10, 10, 1, b9);
        EnumC0106s enumC0106s12 = new EnumC0106s("UINT32", 11, 11, 1, b5);
        B b10 = B.ENUM;
        EnumC0106s enumC0106s13 = new EnumC0106s("ENUM", 12, 12, 1, b10);
        EnumC0106s enumC0106s14 = new EnumC0106s("SFIXED32", 13, 13, 1, b5);
        EnumC0106s enumC0106s15 = new EnumC0106s("SFIXED64", 14, 14, 1, b4);
        EnumC0106s enumC0106s16 = new EnumC0106s("SINT32", 15, 15, 1, b5);
        EnumC0106s enumC0106s17 = new EnumC0106s("SINT64", 16, 16, 1, b4);
        EnumC0106s enumC0106s18 = new EnumC0106s("GROUP", 17, 17, 1, b8);
        EnumC0106s enumC0106s19 = new EnumC0106s("DOUBLE_LIST", 18, 18, 2, b2);
        EnumC0106s enumC0106s20 = new EnumC0106s("FLOAT_LIST", 19, 19, 2, b3);
        EnumC0106s enumC0106s21 = new EnumC0106s("INT64_LIST", 20, 20, 2, b4);
        EnumC0106s enumC0106s22 = new EnumC0106s("UINT64_LIST", 21, 21, 2, b4);
        EnumC0106s enumC0106s23 = new EnumC0106s("INT32_LIST", 22, 22, 2, b5);
        EnumC0106s enumC0106s24 = new EnumC0106s("FIXED64_LIST", 23, 23, 2, b4);
        EnumC0106s enumC0106s25 = new EnumC0106s("FIXED32_LIST", 24, 24, 2, b5);
        EnumC0106s enumC0106s26 = new EnumC0106s("BOOL_LIST", 25, 25, 2, b6);
        EnumC0106s enumC0106s27 = new EnumC0106s("STRING_LIST", 26, 26, 2, b7);
        EnumC0106s enumC0106s28 = new EnumC0106s("MESSAGE_LIST", 27, 27, 2, b8);
        EnumC0106s enumC0106s29 = new EnumC0106s("BYTES_LIST", 28, 28, 2, b9);
        EnumC0106s enumC0106s30 = new EnumC0106s("UINT32_LIST", 29, 29, 2, b5);
        EnumC0106s enumC0106s31 = new EnumC0106s("ENUM_LIST", 30, 30, 2, b10);
        EnumC0106s enumC0106s32 = new EnumC0106s("SFIXED32_LIST", 31, 31, 2, b5);
        EnumC0106s enumC0106s33 = new EnumC0106s("SFIXED64_LIST", 32, 32, 2, b4);
        EnumC0106s enumC0106s34 = new EnumC0106s("SINT32_LIST", 33, 33, 2, b5);
        EnumC0106s enumC0106s35 = new EnumC0106s("SINT64_LIST", 34, 34, 2, b4);
        EnumC0106s enumC0106s36 = new EnumC0106s("DOUBLE_LIST_PACKED", 35, 35, 3, b2);
        f1576f = enumC0106s36;
        EnumC0106s enumC0106s37 = new EnumC0106s("FLOAT_LIST_PACKED", 36, 36, 3, b3);
        EnumC0106s enumC0106s38 = new EnumC0106s("INT64_LIST_PACKED", 37, 37, 3, b4);
        EnumC0106s enumC0106s39 = new EnumC0106s("UINT64_LIST_PACKED", 38, 38, 3, b4);
        EnumC0106s enumC0106s40 = new EnumC0106s("INT32_LIST_PACKED", 39, 39, 3, b5);
        EnumC0106s enumC0106s41 = new EnumC0106s("FIXED64_LIST_PACKED", 40, 40, 3, b4);
        EnumC0106s enumC0106s42 = new EnumC0106s("FIXED32_LIST_PACKED", 41, 41, 3, b5);
        EnumC0106s enumC0106s43 = new EnumC0106s("BOOL_LIST_PACKED", 42, 42, 3, b6);
        EnumC0106s enumC0106s44 = new EnumC0106s("UINT32_LIST_PACKED", 43, 43, 3, b5);
        EnumC0106s enumC0106s45 = new EnumC0106s("ENUM_LIST_PACKED", 44, 44, 3, b10);
        EnumC0106s enumC0106s46 = new EnumC0106s("SFIXED32_LIST_PACKED", 45, 45, 3, b5);
        EnumC0106s enumC0106s47 = new EnumC0106s("SFIXED64_LIST_PACKED", 46, 46, 3, b4);
        EnumC0106s enumC0106s48 = new EnumC0106s("SINT32_LIST_PACKED", 47, 47, 3, b5);
        EnumC0106s enumC0106s49 = new EnumC0106s("SINT64_LIST_PACKED", 48, 48, 3, b4);
        f1577g = enumC0106s49;
        f1579i = new EnumC0106s[]{enumC0106s, enumC0106s2, enumC0106s3, enumC0106s4, enumC0106s5, enumC0106s6, enumC0106s7, enumC0106s8, enumC0106s9, enumC0106s10, enumC0106s11, enumC0106s12, enumC0106s13, enumC0106s14, enumC0106s15, enumC0106s16, enumC0106s17, enumC0106s18, enumC0106s19, enumC0106s20, enumC0106s21, enumC0106s22, enumC0106s23, enumC0106s24, enumC0106s25, enumC0106s26, enumC0106s27, enumC0106s28, enumC0106s29, enumC0106s30, enumC0106s31, enumC0106s32, enumC0106s33, enumC0106s34, enumC0106s35, enumC0106s36, enumC0106s37, enumC0106s38, enumC0106s39, enumC0106s40, enumC0106s41, enumC0106s42, enumC0106s43, enumC0106s44, enumC0106s45, enumC0106s46, enumC0106s47, enumC0106s48, enumC0106s49, new EnumC0106s("GROUP_LIST", 49, 49, 2, b8), new EnumC0106s("MAP", 50, 50, 4, B.VOID)};
        EnumC0106s[] values = values();
        f1578h = new EnumC0106s[values.length];
        for (EnumC0106s enumC0106s50 : values) {
            f1578h[enumC0106s50.f1580e] = enumC0106s50;
        }
    }

    public EnumC0106s(String str, int i2, int i3, int i4, B b2) {
        this.f1580e = i3;
        int a2 = H.j.a(i4);
        if (a2 == 1) {
            b2.getClass();
        } else if (a2 == 3) {
            b2.getClass();
        }
        if (i4 == 1) {
            b2.ordinal();
        }
    }

    public static EnumC0106s valueOf(String str) {
        return (EnumC0106s) Enum.valueOf(EnumC0106s.class, str);
    }

    public static EnumC0106s[] values() {
        return (EnumC0106s[]) f1579i.clone();
    }
}
