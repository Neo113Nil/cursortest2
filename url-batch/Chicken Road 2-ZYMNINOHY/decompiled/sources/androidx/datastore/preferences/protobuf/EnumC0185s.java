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
public final class EnumC0185s {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0185s f4692b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0185s f4693c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0185s[] f4694d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0185s[] f4695e;

    /* renamed from: a, reason: collision with root package name */
    public final int f4696a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0185s EF0;

    static {
        B b4 = B.DOUBLE;
        EnumC0185s enumC0185s = new EnumC0185s("DOUBLE", 0, 0, 1, b4);
        B b5 = B.FLOAT;
        EnumC0185s enumC0185s2 = new EnumC0185s("FLOAT", 1, 1, 1, b5);
        B b6 = B.LONG;
        EnumC0185s enumC0185s3 = new EnumC0185s("INT64", 2, 2, 1, b6);
        EnumC0185s enumC0185s4 = new EnumC0185s("UINT64", 3, 3, 1, b6);
        B b7 = B.INT;
        EnumC0185s enumC0185s5 = new EnumC0185s("INT32", 4, 4, 1, b7);
        EnumC0185s enumC0185s6 = new EnumC0185s("FIXED64", 5, 5, 1, b6);
        EnumC0185s enumC0185s7 = new EnumC0185s("FIXED32", 6, 6, 1, b7);
        B b8 = B.BOOLEAN;
        EnumC0185s enumC0185s8 = new EnumC0185s("BOOL", 7, 7, 1, b8);
        B b9 = B.STRING;
        EnumC0185s enumC0185s9 = new EnumC0185s("STRING", 8, 8, 1, b9);
        B b10 = B.MESSAGE;
        EnumC0185s enumC0185s10 = new EnumC0185s("MESSAGE", 9, 9, 1, b10);
        B b11 = B.BYTE_STRING;
        EnumC0185s enumC0185s11 = new EnumC0185s("BYTES", 10, 10, 1, b11);
        EnumC0185s enumC0185s12 = new EnumC0185s("UINT32", 11, 11, 1, b7);
        B b12 = B.ENUM;
        EnumC0185s enumC0185s13 = new EnumC0185s("ENUM", 12, 12, 1, b12);
        EnumC0185s enumC0185s14 = new EnumC0185s("SFIXED32", 13, 13, 1, b7);
        EnumC0185s enumC0185s15 = new EnumC0185s("SFIXED64", 14, 14, 1, b6);
        EnumC0185s enumC0185s16 = new EnumC0185s("SINT32", 15, 15, 1, b7);
        EnumC0185s enumC0185s17 = new EnumC0185s("SINT64", 16, 16, 1, b6);
        EnumC0185s enumC0185s18 = new EnumC0185s("GROUP", 17, 17, 1, b10);
        EnumC0185s enumC0185s19 = new EnumC0185s("DOUBLE_LIST", 18, 18, 2, b4);
        EnumC0185s enumC0185s20 = new EnumC0185s("FLOAT_LIST", 19, 19, 2, b5);
        EnumC0185s enumC0185s21 = new EnumC0185s("INT64_LIST", 20, 20, 2, b6);
        EnumC0185s enumC0185s22 = new EnumC0185s("UINT64_LIST", 21, 21, 2, b6);
        EnumC0185s enumC0185s23 = new EnumC0185s("INT32_LIST", 22, 22, 2, b7);
        EnumC0185s enumC0185s24 = new EnumC0185s("FIXED64_LIST", 23, 23, 2, b6);
        EnumC0185s enumC0185s25 = new EnumC0185s("FIXED32_LIST", 24, 24, 2, b7);
        EnumC0185s enumC0185s26 = new EnumC0185s("BOOL_LIST", 25, 25, 2, b8);
        EnumC0185s enumC0185s27 = new EnumC0185s("STRING_LIST", 26, 26, 2, b9);
        EnumC0185s enumC0185s28 = new EnumC0185s("MESSAGE_LIST", 27, 27, 2, b10);
        EnumC0185s enumC0185s29 = new EnumC0185s("BYTES_LIST", 28, 28, 2, b11);
        EnumC0185s enumC0185s30 = new EnumC0185s("UINT32_LIST", 29, 29, 2, b7);
        EnumC0185s enumC0185s31 = new EnumC0185s("ENUM_LIST", 30, 30, 2, b12);
        EnumC0185s enumC0185s32 = new EnumC0185s("SFIXED32_LIST", 31, 31, 2, b7);
        EnumC0185s enumC0185s33 = new EnumC0185s("SFIXED64_LIST", 32, 32, 2, b6);
        EnumC0185s enumC0185s34 = new EnumC0185s("SINT32_LIST", 33, 33, 2, b7);
        EnumC0185s enumC0185s35 = new EnumC0185s("SINT64_LIST", 34, 34, 2, b6);
        EnumC0185s enumC0185s36 = new EnumC0185s("DOUBLE_LIST_PACKED", 35, 35, 3, b4);
        f4692b = enumC0185s36;
        EnumC0185s enumC0185s37 = new EnumC0185s("FLOAT_LIST_PACKED", 36, 36, 3, b5);
        EnumC0185s enumC0185s38 = new EnumC0185s("INT64_LIST_PACKED", 37, 37, 3, b6);
        EnumC0185s enumC0185s39 = new EnumC0185s("UINT64_LIST_PACKED", 38, 38, 3, b6);
        EnumC0185s enumC0185s40 = new EnumC0185s("INT32_LIST_PACKED", 39, 39, 3, b7);
        EnumC0185s enumC0185s41 = new EnumC0185s("FIXED64_LIST_PACKED", 40, 40, 3, b6);
        EnumC0185s enumC0185s42 = new EnumC0185s("FIXED32_LIST_PACKED", 41, 41, 3, b7);
        EnumC0185s enumC0185s43 = new EnumC0185s("BOOL_LIST_PACKED", 42, 42, 3, b8);
        EnumC0185s enumC0185s44 = new EnumC0185s("UINT32_LIST_PACKED", 43, 43, 3, b7);
        EnumC0185s enumC0185s45 = new EnumC0185s("ENUM_LIST_PACKED", 44, 44, 3, b12);
        EnumC0185s enumC0185s46 = new EnumC0185s("SFIXED32_LIST_PACKED", 45, 45, 3, b7);
        EnumC0185s enumC0185s47 = new EnumC0185s("SFIXED64_LIST_PACKED", 46, 46, 3, b6);
        EnumC0185s enumC0185s48 = new EnumC0185s("SINT32_LIST_PACKED", 47, 47, 3, b7);
        EnumC0185s enumC0185s49 = new EnumC0185s("SINT64_LIST_PACKED", 48, 48, 3, b6);
        f4693c = enumC0185s49;
        f4695e = new EnumC0185s[]{enumC0185s, enumC0185s2, enumC0185s3, enumC0185s4, enumC0185s5, enumC0185s6, enumC0185s7, enumC0185s8, enumC0185s9, enumC0185s10, enumC0185s11, enumC0185s12, enumC0185s13, enumC0185s14, enumC0185s15, enumC0185s16, enumC0185s17, enumC0185s18, enumC0185s19, enumC0185s20, enumC0185s21, enumC0185s22, enumC0185s23, enumC0185s24, enumC0185s25, enumC0185s26, enumC0185s27, enumC0185s28, enumC0185s29, enumC0185s30, enumC0185s31, enumC0185s32, enumC0185s33, enumC0185s34, enumC0185s35, enumC0185s36, enumC0185s37, enumC0185s38, enumC0185s39, enumC0185s40, enumC0185s41, enumC0185s42, enumC0185s43, enumC0185s44, enumC0185s45, enumC0185s46, enumC0185s47, enumC0185s48, enumC0185s49, new EnumC0185s("GROUP_LIST", 49, 49, 2, b10), new EnumC0185s("MAP", 50, 50, 4, B.VOID)};
        EnumC0185s[] values = values();
        f4694d = new EnumC0185s[values.length];
        for (EnumC0185s enumC0185s50 : values) {
            f4694d[enumC0185s50.f4696a] = enumC0185s50;
        }
    }

    public EnumC0185s(String str, int i4, int i5, int i6, B b4) {
        this.f4696a = i5;
        int b5 = M.j.b(i6);
        if (b5 == 1) {
            b4.getClass();
        } else if (b5 == 3) {
            b4.getClass();
        }
        if (i6 == 1) {
            b4.ordinal();
        }
    }

    public static EnumC0185s valueOf(String str) {
        return (EnumC0185s) Enum.valueOf(EnumC0185s.class, str);
    }

    public static EnumC0185s[] values() {
        return (EnumC0185s[]) f4695e.clone();
    }
}
