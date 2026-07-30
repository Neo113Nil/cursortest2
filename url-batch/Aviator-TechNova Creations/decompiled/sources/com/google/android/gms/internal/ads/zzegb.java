package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzegb {
    private final Context zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzika zzd;
    private final VersionInfoParcel zze;
    private final zzefx zzf;
    private final zzdxz zzg;

    zzegb(Context context, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzika zzikaVar, VersionInfoParcel versionInfoParcel, zzefx zzefxVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzikaVar;
        this.zze = versionInfoParcel;
        this.zzf = zzefxVar;
        this.zzg = zzdxzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzegw) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpB)).booleanValue()) {
                zzdxy zza = this.zzg.zza();
                zza.zzc("action", "ptard");
                zza.zzc("ptard", "l");
                zza.zzd();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzegb.this.zzb();
                }
            });
            return;
        }
        zzefy zzefyVar = new zzefy(this);
        zzegd zzb = this.zzf.zzb();
        zzb.zzb(zzefyVar);
        final zzeel zza = zzb.zza().zza();
        zzgzy zzgzyVar = this.zzb;
        Objects.requireNonNull(zza);
        zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeel.this.zza();
            }
        });
    }

    final /* synthetic */ zzdxz zzd() {
        return this.zzg;
    }
}
