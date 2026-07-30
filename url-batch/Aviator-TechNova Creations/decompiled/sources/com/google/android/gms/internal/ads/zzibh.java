package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public enum zzibh {
    DOUBLE(0, 1, zzici.DOUBLE),
    FLOAT(1, 1, zzici.FLOAT),
    INT64(2, 1, zzici.LONG),
    UINT64(3, 1, zzici.LONG),
    INT32(4, 1, zzici.INT),
    FIXED64(5, 1, zzici.LONG),
    FIXED32(6, 1, zzici.INT),
    BOOL(7, 1, zzici.BOOLEAN),
    STRING(8, 1, zzici.STRING),
    MESSAGE(9, 1, zzici.MESSAGE),
    BYTES(10, 1, zzici.BYTE_STRING),
    UINT32(11, 1, zzici.INT),
    ENUM(12, 1, zzici.ENUM),
    SFIXED32(13, 1, zzici.INT),
    SFIXED64(14, 1, zzici.LONG),
    SINT32(15, 1, zzici.INT),
    SINT64(16, 1, zzici.LONG),
    GROUP(17, 1, zzici.MESSAGE),
    DOUBLE_LIST(18, 2, zzici.DOUBLE),
    FLOAT_LIST(19, 2, zzici.FLOAT),
    INT64_LIST(20, 2, zzici.LONG),
    UINT64_LIST(21, 2, zzici.LONG),
    INT32_LIST(22, 2, zzici.INT),
    FIXED64_LIST(23, 2, zzici.LONG),
    FIXED32_LIST(24, 2, zzici.INT),
    BOOL_LIST(25, 2, zzici.BOOLEAN),
    STRING_LIST(26, 2, zzici.STRING),
    MESSAGE_LIST(27, 2, zzici.MESSAGE),
    BYTES_LIST(28, 2, zzici.BYTE_STRING),
    UINT32_LIST(29, 2, zzici.INT),
    ENUM_LIST(30, 2, zzici.ENUM),
    SFIXED32_LIST(31, 2, zzici.INT),
    SFIXED64_LIST(32, 2, zzici.LONG),
    SINT32_LIST(33, 2, zzici.INT),
    SINT64_LIST(34, 2, zzici.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzici.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzici.FLOAT),
    INT64_LIST_PACKED(37, 3, zzici.LONG),
    UINT64_LIST_PACKED(38, 3, zzici.LONG),
    INT32_LIST_PACKED(39, 3, zzici.INT),
    FIXED64_LIST_PACKED(40, 3, zzici.LONG),
    FIXED32_LIST_PACKED(41, 3, zzici.INT),
    BOOL_LIST_PACKED(42, 3, zzici.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzici.INT),
    ENUM_LIST_PACKED(44, 3, zzici.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzici.INT),
    SFIXED64_LIST_PACKED(46, 3, zzici.LONG),
    SINT32_LIST_PACKED(47, 3, zzici.INT),
    SINT64_LIST_PACKED(48, 3, zzici.LONG),
    GROUP_LIST(49, 2, zzici.MESSAGE),
    MAP(50, 4, zzici.VOID);

    private static final zzibh[] zzaa;
    private final int zzZ;

    static {
        zzibh[] values = values();
        zzaa = new zzibh[values.length];
        for (zzibh zzibhVar : values) {
            zzaa[zzibhVar.zzZ] = zzibhVar;
        }
    }

    zzibh(int i, int i2, zzici zziciVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zziciVar.zza();
        } else if (i3 == 3) {
            zziciVar.zza();
        }
        if (i2 == 1) {
            zzici zziciVar2 = zzici.VOID;
            zziciVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
