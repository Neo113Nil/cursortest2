package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public enum zzgxo {
    DOUBLE(0, 1, zzgyp.DOUBLE),
    FLOAT(1, 1, zzgyp.FLOAT),
    INT64(2, 1, zzgyp.LONG),
    UINT64(3, 1, zzgyp.LONG),
    INT32(4, 1, zzgyp.INT),
    FIXED64(5, 1, zzgyp.LONG),
    FIXED32(6, 1, zzgyp.INT),
    BOOL(7, 1, zzgyp.BOOLEAN),
    STRING(8, 1, zzgyp.STRING),
    MESSAGE(9, 1, zzgyp.MESSAGE),
    BYTES(10, 1, zzgyp.BYTE_STRING),
    UINT32(11, 1, zzgyp.INT),
    ENUM(12, 1, zzgyp.ENUM),
    SFIXED32(13, 1, zzgyp.INT),
    SFIXED64(14, 1, zzgyp.LONG),
    SINT32(15, 1, zzgyp.INT),
    SINT64(16, 1, zzgyp.LONG),
    GROUP(17, 1, zzgyp.MESSAGE),
    DOUBLE_LIST(18, 2, zzgyp.DOUBLE),
    FLOAT_LIST(19, 2, zzgyp.FLOAT),
    INT64_LIST(20, 2, zzgyp.LONG),
    UINT64_LIST(21, 2, zzgyp.LONG),
    INT32_LIST(22, 2, zzgyp.INT),
    FIXED64_LIST(23, 2, zzgyp.LONG),
    FIXED32_LIST(24, 2, zzgyp.INT),
    BOOL_LIST(25, 2, zzgyp.BOOLEAN),
    STRING_LIST(26, 2, zzgyp.STRING),
    MESSAGE_LIST(27, 2, zzgyp.MESSAGE),
    BYTES_LIST(28, 2, zzgyp.BYTE_STRING),
    UINT32_LIST(29, 2, zzgyp.INT),
    ENUM_LIST(30, 2, zzgyp.ENUM),
    SFIXED32_LIST(31, 2, zzgyp.INT),
    SFIXED64_LIST(32, 2, zzgyp.LONG),
    SINT32_LIST(33, 2, zzgyp.INT),
    SINT64_LIST(34, 2, zzgyp.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgyp.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgyp.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgyp.LONG),
    UINT64_LIST_PACKED(38, 3, zzgyp.LONG),
    INT32_LIST_PACKED(39, 3, zzgyp.INT),
    FIXED64_LIST_PACKED(40, 3, zzgyp.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgyp.INT),
    BOOL_LIST_PACKED(42, 3, zzgyp.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgyp.INT),
    ENUM_LIST_PACKED(44, 3, zzgyp.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgyp.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgyp.LONG),
    SINT32_LIST_PACKED(47, 3, zzgyp.INT),
    SINT64_LIST_PACKED(48, 3, zzgyp.LONG),
    GROUP_LIST(49, 2, zzgyp.MESSAGE),
    MAP(50, 4, zzgyp.VOID);

    private static final zzgxo[] zzZ;
    private final int zzab;

    static {
        zzgxo[] values = values();
        zzZ = new zzgxo[values.length];
        for (zzgxo zzgxoVar : values) {
            zzZ[zzgxoVar.zzab] = zzgxoVar;
        }
    }

    zzgxo(int i, int i2, zzgyp zzgypVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzgypVar.zza();
        } else if (i3 == 3) {
            zzgypVar.zza();
        }
        if (i2 == 1) {
            zzgyp zzgypVar2 = zzgyp.VOID;
            zzgypVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}
