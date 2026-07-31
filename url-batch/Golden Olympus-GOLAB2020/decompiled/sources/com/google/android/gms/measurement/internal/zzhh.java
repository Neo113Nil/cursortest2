package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes.dex */
final class zzhh implements Runnable {
    private final zzhg zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    /* synthetic */ zzhh(String str, zzhg zzhgVar, int i4, Throwable th, byte[] bArr, Map map, zzhj zzhjVar) {
        Preconditions.checkNotNull(zzhgVar);
        this.zza = zzhgVar;
        this.zzb = i4;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
