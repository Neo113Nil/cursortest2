package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public enum zzjv {
    STORAGE(zzjw.AD_STORAGE, zzjw.ANALYTICS_STORAGE),
    DMA(zzjw.AD_USER_DATA);

    private final zzjw[] zzd;

    zzjv(zzjw... zzjwVarArr) {
        this.zzd = zzjwVarArr;
    }

    public final zzjw[] zzb() {
        return this.zzd;
    }
}
