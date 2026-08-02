package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum jkg {
    DOUBLE(0, 1, jlf.DOUBLE),
    FLOAT(1, 1, jlf.FLOAT),
    INT64(2, 1, jlf.LONG),
    UINT64(3, 1, jlf.LONG),
    INT32(4, 1, jlf.INT),
    FIXED64(5, 1, jlf.LONG),
    FIXED32(6, 1, jlf.INT),
    BOOL(7, 1, jlf.BOOLEAN),
    STRING(8, 1, jlf.STRING),
    MESSAGE(9, 1, jlf.MESSAGE),
    BYTES(10, 1, jlf.BYTE_STRING),
    UINT32(11, 1, jlf.INT),
    ENUM(12, 1, jlf.ENUM),
    SFIXED32(13, 1, jlf.INT),
    SFIXED64(14, 1, jlf.LONG),
    SINT32(15, 1, jlf.INT),
    SINT64(16, 1, jlf.LONG),
    GROUP(17, 1, jlf.MESSAGE),
    DOUBLE_LIST(18, 2, jlf.DOUBLE),
    FLOAT_LIST(19, 2, jlf.FLOAT),
    INT64_LIST(20, 2, jlf.LONG),
    UINT64_LIST(21, 2, jlf.LONG),
    INT32_LIST(22, 2, jlf.INT),
    FIXED64_LIST(23, 2, jlf.LONG),
    FIXED32_LIST(24, 2, jlf.INT),
    BOOL_LIST(25, 2, jlf.BOOLEAN),
    STRING_LIST(26, 2, jlf.STRING),
    MESSAGE_LIST(27, 2, jlf.MESSAGE),
    BYTES_LIST(28, 2, jlf.BYTE_STRING),
    UINT32_LIST(29, 2, jlf.INT),
    ENUM_LIST(30, 2, jlf.ENUM),
    SFIXED32_LIST(31, 2, jlf.INT),
    SFIXED64_LIST(32, 2, jlf.LONG),
    SINT32_LIST(33, 2, jlf.INT),
    SINT64_LIST(34, 2, jlf.LONG),
    DOUBLE_LIST_PACKED(35, 3, jlf.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, jlf.FLOAT),
    INT64_LIST_PACKED(37, 3, jlf.LONG),
    UINT64_LIST_PACKED(38, 3, jlf.LONG),
    INT32_LIST_PACKED(39, 3, jlf.INT),
    FIXED64_LIST_PACKED(40, 3, jlf.LONG),
    FIXED32_LIST_PACKED(41, 3, jlf.INT),
    BOOL_LIST_PACKED(42, 3, jlf.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, jlf.INT),
    ENUM_LIST_PACKED(44, 3, jlf.ENUM),
    SFIXED32_LIST_PACKED(45, 3, jlf.INT),
    SFIXED64_LIST_PACKED(46, 3, jlf.LONG),
    SINT32_LIST_PACKED(47, 3, jlf.INT),
    SINT64_LIST_PACKED(48, 3, jlf.LONG),
    GROUP_LIST(49, 2, jlf.MESSAGE),
    MAP(50, 4, jlf.VOID);

    private static final jkg[] aa;
    public final int Z;

    static {
        jkg[] values = values();
        aa = new jkg[values.length];
        for (jkg jkgVar : values) {
            aa[jkgVar.Z] = jkgVar;
        }
    }

    jkg(int i, int i2, jlf jlfVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = jlfVar.k;
        }
        if (i2 == 1) {
            jlf jlfVar2 = jlf.VOID;
            jlfVar.ordinal();
        }
    }
}
