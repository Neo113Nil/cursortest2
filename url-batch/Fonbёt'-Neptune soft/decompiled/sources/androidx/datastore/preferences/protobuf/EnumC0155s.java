package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
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
public final class EnumC0155s {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0155s f1742f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0155s f1743g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0155s[] f1744h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0155s[] f1745i;

    /* renamed from: e, reason: collision with root package name */
    public final int f1746e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0155s EF6;

    static {
        B b2 = B.DOUBLE;
        EnumC0155s enumC0155s = new EnumC0155s("DOUBLE", 0, 0, 1, b2);
        B b3 = B.FLOAT;
        EnumC0155s enumC0155s2 = new EnumC0155s("FLOAT", 1, 1, 1, b3);
        B b4 = B.LONG;
        EnumC0155s enumC0155s3 = new EnumC0155s("INT64", 2, 2, 1, b4);
        EnumC0155s enumC0155s4 = new EnumC0155s("UINT64", 3, 3, 1, b4);
        B b5 = B.INT;
        EnumC0155s enumC0155s5 = new EnumC0155s("INT32", 4, 4, 1, b5);
        EnumC0155s enumC0155s6 = new EnumC0155s("FIXED64", 5, 5, 1, b4);
        EnumC0155s enumC0155s7 = new EnumC0155s("FIXED32", 6, 6, 1, b5);
        B b6 = B.BOOLEAN;
        EnumC0155s enumC0155s8 = new EnumC0155s("BOOL", 7, 7, 1, b6);
        B b7 = B.STRING;
        EnumC0155s enumC0155s9 = new EnumC0155s("STRING", 8, 8, 1, b7);
        B b8 = B.MESSAGE;
        EnumC0155s enumC0155s10 = new EnumC0155s("MESSAGE", 9, 9, 1, b8);
        B b9 = B.BYTE_STRING;
        EnumC0155s enumC0155s11 = new EnumC0155s("BYTES", 10, 10, 1, b9);
        EnumC0155s enumC0155s12 = new EnumC0155s("UINT32", 11, 11, 1, b5);
        B b10 = B.ENUM;
        EnumC0155s enumC0155s13 = new EnumC0155s("ENUM", 12, 12, 1, b10);
        EnumC0155s enumC0155s14 = new EnumC0155s("SFIXED32", 13, 13, 1, b5);
        EnumC0155s enumC0155s15 = new EnumC0155s("SFIXED64", 14, 14, 1, b4);
        EnumC0155s enumC0155s16 = new EnumC0155s("SINT32", 15, 15, 1, b5);
        EnumC0155s enumC0155s17 = new EnumC0155s("SINT64", 16, 16, 1, b4);
        EnumC0155s enumC0155s18 = new EnumC0155s("GROUP", 17, 17, 1, b8);
        EnumC0155s enumC0155s19 = new EnumC0155s("DOUBLE_LIST", 18, 18, 2, b2);
        EnumC0155s enumC0155s20 = new EnumC0155s("FLOAT_LIST", 19, 19, 2, b3);
        EnumC0155s enumC0155s21 = new EnumC0155s("INT64_LIST", 20, 20, 2, b4);
        EnumC0155s enumC0155s22 = new EnumC0155s("UINT64_LIST", 21, 21, 2, b4);
        EnumC0155s enumC0155s23 = new EnumC0155s("INT32_LIST", 22, 22, 2, b5);
        EnumC0155s enumC0155s24 = new EnumC0155s("FIXED64_LIST", 23, 23, 2, b4);
        EnumC0155s enumC0155s25 = new EnumC0155s("FIXED32_LIST", 24, 24, 2, b5);
        EnumC0155s enumC0155s26 = new EnumC0155s("BOOL_LIST", 25, 25, 2, b6);
        EnumC0155s enumC0155s27 = new EnumC0155s("STRING_LIST", 26, 26, 2, b7);
        EnumC0155s enumC0155s28 = new EnumC0155s("MESSAGE_LIST", 27, 27, 2, b8);
        EnumC0155s enumC0155s29 = new EnumC0155s("BYTES_LIST", 28, 28, 2, b9);
        EnumC0155s enumC0155s30 = new EnumC0155s("UINT32_LIST", 29, 29, 2, b5);
        EnumC0155s enumC0155s31 = new EnumC0155s("ENUM_LIST", 30, 30, 2, b10);
        EnumC0155s enumC0155s32 = new EnumC0155s("SFIXED32_LIST", 31, 31, 2, b5);
        EnumC0155s enumC0155s33 = new EnumC0155s("SFIXED64_LIST", 32, 32, 2, b4);
        EnumC0155s enumC0155s34 = new EnumC0155s("SINT32_LIST", 33, 33, 2, b5);
        EnumC0155s enumC0155s35 = new EnumC0155s("SINT64_LIST", 34, 34, 2, b4);
        EnumC0155s enumC0155s36 = new EnumC0155s("DOUBLE_LIST_PACKED", 35, 35, 3, b2);
        f1742f = enumC0155s36;
        EnumC0155s enumC0155s37 = new EnumC0155s("FLOAT_LIST_PACKED", 36, 36, 3, b3);
        EnumC0155s enumC0155s38 = new EnumC0155s("INT64_LIST_PACKED", 37, 37, 3, b4);
        EnumC0155s enumC0155s39 = new EnumC0155s("UINT64_LIST_PACKED", 38, 38, 3, b4);
        EnumC0155s enumC0155s40 = new EnumC0155s("INT32_LIST_PACKED", 39, 39, 3, b5);
        EnumC0155s enumC0155s41 = new EnumC0155s("FIXED64_LIST_PACKED", 40, 40, 3, b4);
        EnumC0155s enumC0155s42 = new EnumC0155s("FIXED32_LIST_PACKED", 41, 41, 3, b5);
        EnumC0155s enumC0155s43 = new EnumC0155s("BOOL_LIST_PACKED", 42, 42, 3, b6);
        EnumC0155s enumC0155s44 = new EnumC0155s("UINT32_LIST_PACKED", 43, 43, 3, b5);
        EnumC0155s enumC0155s45 = new EnumC0155s("ENUM_LIST_PACKED", 44, 44, 3, b10);
        EnumC0155s enumC0155s46 = new EnumC0155s("SFIXED32_LIST_PACKED", 45, 45, 3, b5);
        EnumC0155s enumC0155s47 = new EnumC0155s("SFIXED64_LIST_PACKED", 46, 46, 3, b4);
        EnumC0155s enumC0155s48 = new EnumC0155s("SINT32_LIST_PACKED", 47, 47, 3, b5);
        EnumC0155s enumC0155s49 = new EnumC0155s("SINT64_LIST_PACKED", 48, 48, 3, b4);
        f1743g = enumC0155s49;
        f1745i = new EnumC0155s[]{enumC0155s, enumC0155s2, enumC0155s3, enumC0155s4, enumC0155s5, enumC0155s6, enumC0155s7, enumC0155s8, enumC0155s9, enumC0155s10, enumC0155s11, enumC0155s12, enumC0155s13, enumC0155s14, enumC0155s15, enumC0155s16, enumC0155s17, enumC0155s18, enumC0155s19, enumC0155s20, enumC0155s21, enumC0155s22, enumC0155s23, enumC0155s24, enumC0155s25, enumC0155s26, enumC0155s27, enumC0155s28, enumC0155s29, enumC0155s30, enumC0155s31, enumC0155s32, enumC0155s33, enumC0155s34, enumC0155s35, enumC0155s36, enumC0155s37, enumC0155s38, enumC0155s39, enumC0155s40, enumC0155s41, enumC0155s42, enumC0155s43, enumC0155s44, enumC0155s45, enumC0155s46, enumC0155s47, enumC0155s48, enumC0155s49, new EnumC0155s("GROUP_LIST", 49, 49, 2, b8), new EnumC0155s("MAP", 50, 50, 4, B.VOID)};
        EnumC0155s[] values = values();
        f1744h = new EnumC0155s[values.length];
        for (EnumC0155s enumC0155s50 : values) {
            f1744h[enumC0155s50.f1746e] = enumC0155s50;
        }
    }

    public EnumC0155s(String str, int i2, int i3, int i4, B b2) {
        this.f1746e = i3;
        int b3 = K.j.b(i4);
        if (b3 == 1) {
            b2.getClass();
        } else if (b3 == 3) {
            b2.getClass();
        }
        if (i4 == 1) {
            b2.ordinal();
        }
    }

    public static EnumC0155s valueOf(String str) {
        return (EnumC0155s) Enum.valueOf(EnumC0155s.class, str);
    }

    public static EnumC0155s[] values() {
        return (EnumC0155s[]) f1745i.clone();
    }

    public final int a() {
        return this.f1746e;
    }
}
