package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcqg {
    private final String zza;
    private final zzbpd zzb;
    private final Executor zzc;
    private zzcql zzd;
    private final zzbkd zze = new zzcqd(this);
    private final zzbkd zzf = new zzcqf(this);

    public zzcqg(String str, zzbpd zzbpdVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbpdVar;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcqg zzcqgVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcqgVar.zza);
    }

    public final void zzc(zzcql zzcqlVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcqlVar;
    }

    public final void zzd(zzcgv zzcgvVar) {
        zzcgvVar.zzad("/updateActiveView", this.zze);
        zzcgvVar.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcgv zzcgvVar) {
        zzcgvVar.zzau("/updateActiveView", this.zze);
        zzcgvVar.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
