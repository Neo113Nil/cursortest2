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
public final class EnumC0088s {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0088s f1493f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0088s f1494g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0088s[] f1495h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0088s[] f1496i;

    /* renamed from: e, reason: collision with root package name */
    public final int f1497e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0088s EF0;

    static {
        B b2 = B.DOUBLE;
        EnumC0088s enumC0088s = new EnumC0088s("DOUBLE", 0, 0, 1, b2);
        B b3 = B.FLOAT;
        EnumC0088s enumC0088s2 = new EnumC0088s("FLOAT", 1, 1, 1, b3);
        B b4 = B.LONG;
        EnumC0088s enumC0088s3 = new EnumC0088s("INT64", 2, 2, 1, b4);
        EnumC0088s enumC0088s4 = new EnumC0088s("UINT64", 3, 3, 1, b4);
        B b5 = B.INT;
        EnumC0088s enumC0088s5 = new EnumC0088s("INT32", 4, 4, 1, b5);
        EnumC0088s enumC0088s6 = new EnumC0088s("FIXED64", 5, 5, 1, b4);
        EnumC0088s enumC0088s7 = new EnumC0088s("FIXED32", 6, 6, 1, b5);
        B b6 = B.BOOLEAN;
        EnumC0088s enumC0088s8 = new EnumC0088s("BOOL", 7, 7, 1, b6);
        B b7 = B.STRING;
        EnumC0088s enumC0088s9 = new EnumC0088s("STRING", 8, 8, 1, b7);
        B b8 = B.MESSAGE;
        EnumC0088s enumC0088s10 = new EnumC0088s("MESSAGE", 9, 9, 1, b8);
        B b9 = B.BYTE_STRING;
        EnumC0088s enumC0088s11 = new EnumC0088s("BYTES", 10, 10, 1, b9);
        EnumC0088s enumC0088s12 = new EnumC0088s("UINT32", 11, 11, 1, b5);
        B b10 = B.ENUM;
        EnumC0088s enumC0088s13 = new EnumC0088s("ENUM", 12, 12, 1, b10);
        EnumC0088s enumC0088s14 = new EnumC0088s("SFIXED32", 13, 13, 1, b5);
        EnumC0088s enumC0088s15 = new EnumC0088s("SFIXED64", 14, 14, 1, b4);
        EnumC0088s enumC0088s16 = new EnumC0088s("SINT32", 15, 15, 1, b5);
        EnumC0088s enumC0088s17 = new EnumC0088s("SINT64", 16, 16, 1, b4);
        EnumC0088s enumC0088s18 = new EnumC0088s("GROUP", 17, 17, 1, b8);
        EnumC0088s enumC0088s19 = new EnumC0088s("DOUBLE_LIST", 18, 18, 2, b2);
        EnumC0088s enumC0088s20 = new EnumC0088s("FLOAT_LIST", 19, 19, 2, b3);
        EnumC0088s enumC0088s21 = new EnumC0088s("INT64_LIST", 20, 20, 2, b4);
        EnumC0088s enumC0088s22 = new EnumC0088s("UINT64_LIST", 21, 21, 2, b4);
        EnumC0088s enumC0088s23 = new EnumC0088s("INT32_LIST", 22, 22, 2, b5);
        EnumC0088s enumC0088s24 = new EnumC0088s("FIXED64_LIST", 23, 23, 2, b4);
        EnumC0088s enumC0088s25 = new EnumC0088s("FIXED32_LIST", 24, 24, 2, b5);
        EnumC0088s enumC0088s26 = new EnumC0088s("BOOL_LIST", 25, 25, 2, b6);
        EnumC0088s enumC0088s27 = new EnumC0088s("STRING_LIST", 26, 26, 2, b7);
        EnumC0088s enumC0088s28 = new EnumC0088s("MESSAGE_LIST", 27, 27, 2, b8);
        EnumC0088s enumC0088s29 = new EnumC0088s("BYTES_LIST", 28, 28, 2, b9);
        EnumC0088s enumC0088s30 = new EnumC0088s("UINT32_LIST", 29, 29, 2, b5);
        EnumC0088s enumC0088s31 = new EnumC0088s("ENUM_LIST", 30, 30, 2, b10);
        EnumC0088s enumC0088s32 = new EnumC0088s("SFIXED32_LIST", 31, 31, 2, b5);
        EnumC0088s enumC0088s33 = new EnumC0088s("SFIXED64_LIST", 32, 32, 2, b4);
        EnumC0088s enumC0088s34 = new EnumC0088s("SINT32_LIST", 33, 33, 2, b5);
        EnumC0088s enumC0088s35 = new EnumC0088s("SINT64_LIST", 34, 34, 2, b4);
        EnumC0088s enumC0088s36 = new EnumC0088s("DOUBLE_LIST_PACKED", 35, 35, 3, b2);
        f1493f = enumC0088s36;
        EnumC0088s enumC0088s37 = new EnumC0088s("FLOAT_LIST_PACKED", 36, 36, 3, b3);
        EnumC0088s enumC0088s38 = new EnumC0088s("INT64_LIST_PACKED", 37, 37, 3, b4);
        EnumC0088s enumC0088s39 = new EnumC0088s("UINT64_LIST_PACKED", 38, 38, 3, b4);
        EnumC0088s enumC0088s40 = new EnumC0088s("INT32_LIST_PACKED", 39, 39, 3, b5);
        EnumC0088s enumC0088s41 = new EnumC0088s("FIXED64_LIST_PACKED", 40, 40, 3, b4);
        EnumC0088s enumC0088s42 = new EnumC0088s("FIXED32_LIST_PACKED", 41, 41, 3, b5);
        EnumC0088s enumC0088s43 = new EnumC0088s("BOOL_LIST_PACKED", 42, 42, 3, b6);
        EnumC0088s enumC0088s44 = new EnumC0088s("UINT32_LIST_PACKED", 43, 43, 3, b5);
        EnumC0088s enumC0088s45 = new EnumC0088s("ENUM_LIST_PACKED", 44, 44, 3, b10);
        EnumC0088s enumC0088s46 = new EnumC0088s("SFIXED32_LIST_PACKED", 45, 45, 3, b5);
        EnumC0088s enumC0088s47 = new EnumC0088s("SFIXED64_LIST_PACKED", 46, 46, 3, b4);
        EnumC0088s enumC0088s48 = new EnumC0088s("SINT32_LIST_PACKED", 47, 47, 3, b5);
        EnumC0088s enumC0088s49 = new EnumC0088s("SINT64_LIST_PACKED", 48, 48, 3, b4);
        f1494g = enumC0088s49;
        f1496i = new EnumC0088s[]{enumC0088s, enumC0088s2, enumC0088s3, enumC0088s4, enumC0088s5, enumC0088s6, enumC0088s7, enumC0088s8, enumC0088s9, enumC0088s10, enumC0088s11, enumC0088s12, enumC0088s13, enumC0088s14, enumC0088s15, enumC0088s16, enumC0088s17, enumC0088s18, enumC0088s19, enumC0088s20, enumC0088s21, enumC0088s22, enumC0088s23, enumC0088s24, enumC0088s25, enumC0088s26, enumC0088s27, enumC0088s28, enumC0088s29, enumC0088s30, enumC0088s31, enumC0088s32, enumC0088s33, enumC0088s34, enumC0088s35, enumC0088s36, enumC0088s37, enumC0088s38, enumC0088s39, enumC0088s40, enumC0088s41, enumC0088s42, enumC0088s43, enumC0088s44, enumC0088s45, enumC0088s46, enumC0088s47, enumC0088s48, enumC0088s49, new EnumC0088s("GROUP_LIST", 49, 49, 2, b8), new EnumC0088s("MAP", 50, 50, 4, B.VOID)};
        EnumC0088s[] values = values();
        f1495h = new EnumC0088s[values.length];
        for (EnumC0088s enumC0088s50 : values) {
            f1495h[enumC0088s50.f1497e] = enumC0088s50;
        }
    }

    public EnumC0088s(String str, int i2, int i3, int i4, B b2) {
        this.f1497e = i3;
        int b3 = F.j.b(i4);
        if (b3 == 1) {
            b2.getClass();
        } else if (b3 == 3) {
            b2.getClass();
        }
        if (i4 == 1) {
            b2.ordinal();
        }
    }

    public static EnumC0088s valueOf(String str) {
        return (EnumC0088s) Enum.valueOf(EnumC0088s.class, str);
    }

    public static EnumC0088s[] values() {
        return (EnumC0088s[]) f1496i.clone();
    }

    public final int a() {
        return this.f1497e;
    }
}
