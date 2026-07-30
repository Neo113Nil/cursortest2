package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public enum zzies {
    DOUBLE(zziet.DOUBLE, 1),
    FLOAT(zziet.FLOAT, 5),
    INT64(zziet.LONG, 0),
    UINT64(zziet.LONG, 0),
    INT32(zziet.INT, 0),
    FIXED64(zziet.LONG, 1),
    FIXED32(zziet.INT, 5),
    BOOL(zziet.BOOLEAN, 0),
    STRING(zziet.STRING, 2),
    GROUP(zziet.MESSAGE, 3),
    MESSAGE(zziet.MESSAGE, 2),
    BYTES(zziet.BYTE_STRING, 2),
    UINT32(zziet.INT, 0),
    ENUM(zziet.ENUM, 0),
    SFIXED32(zziet.INT, 5),
    SFIXED64(zziet.LONG, 1),
    SINT32(zziet.INT, 0),
    SINT64(zziet.LONG, 0);

    private final zziet zzs;
    private final int zzt;

    zzies(zziet zzietVar, int i) {
        this.zzs = zzietVar;
        this.zzt = i;
    }

    public final zziet zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
