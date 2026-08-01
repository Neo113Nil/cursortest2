package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcit {
    private final zzcbt zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzcit(zzcir zzcirVar, zzcis zzcisVar) {
        zzcbt zzcbtVar;
        Context context;
        WeakReference weakReference;
        zzcbtVar = zzcirVar.zza;
        this.zza = zzcbtVar;
        context = zzcirVar.zzb;
        this.zzb = context;
        weakReference = zzcirVar.zzc;
        this.zzc = weakReference;
    }

    final Context zza() {
        return this.zzb;
    }

    public final zzasi zzb() {
        return new zzasi(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    final zzbfp zzc() {
        return new zzbfp(this.zzb);
    }

    final zzcbt zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    final WeakReference zzf() {
        return this.zzc;
    }
}
