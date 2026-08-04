package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcgx {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcgx(zzcgw zzcgwVar, byte[] bArr) {
        this.zza = zzcgwVar.zzd();
        this.zzb = zzcgwVar.zze();
        this.zzd = zzcgwVar.zzg();
        this.zzc = zzcgwVar.zzf();
    }

    final Context zza() {
        return this.zzb;
    }

    final Context zzb() {
        return this.zzb;
    }

    final WeakReference zzc() {
        return this.zzd;
    }

    final VersionInfoParcel zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }

    final zzcgu zzf() {
        return new zzcgu(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final zzbfc zzh() {
        return new zzbfc(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }
}
