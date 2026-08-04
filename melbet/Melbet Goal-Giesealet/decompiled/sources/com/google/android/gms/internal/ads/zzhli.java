package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public enum zzhli {
    DOUBLE(zzhlj.DOUBLE, 1),
    FLOAT(zzhlj.FLOAT, 5),
    INT64(zzhlj.LONG, 0),
    UINT64(zzhlj.LONG, 0),
    INT32(zzhlj.INT, 0),
    FIXED64(zzhlj.LONG, 1),
    FIXED32(zzhlj.INT, 5),
    BOOL(zzhlj.BOOLEAN, 0),
    STRING(zzhlj.STRING, 2),
    GROUP(zzhlj.MESSAGE, 3),
    MESSAGE(zzhlj.MESSAGE, 2),
    BYTES(zzhlj.BYTE_STRING, 2),
    UINT32(zzhlj.INT, 0),
    ENUM(zzhlj.ENUM, 0),
    SFIXED32(zzhlj.INT, 5),
    SFIXED64(zzhlj.LONG, 1),
    SINT32(zzhlj.INT, 0),
    SINT64(zzhlj.LONG, 0);

    private final zzhlj zzs;
    private final int zzt;

    zzhli(zzhlj zzhljVar, int i) {
        this.zzs = zzhljVar;
        this.zzt = i;
    }

    public final zzhlj zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
