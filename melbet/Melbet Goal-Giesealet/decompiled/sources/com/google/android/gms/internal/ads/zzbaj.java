package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbaj {
    private com.google.android.gms.ads.internal.client.zzbx zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzek zzd;
    private final AppOpenAd.AppOpenAdLoadCallback zze;
    private final zzbot zzf = new zzbot();
    private final com.google.android.gms.ads.internal.client.zzq zzg = com.google.android.gms.ads.internal.client.zzq.zza;

    public zzbaj(Context context, String str, com.google.android.gms.ads.internal.client.zzek zzekVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzekVar;
        this.zze = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr zzd = com.google.android.gms.ads.internal.client.zzr.zzd();
            com.google.android.gms.ads.internal.client.zzaz zzb = com.google.android.gms.ads.internal.client.zzbb.zzb();
            Context context = this.zzb;
            String str = this.zzc;
            com.google.android.gms.ads.internal.client.zzbx zza = zzb.zza(context, zzd, str, this.zzf);
            this.zza = zza;
            if (zza != null) {
                com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzd;
                zzekVar.zzp(currentTimeMillis);
                this.zza.zzJ(new zzazw(this.zze, str));
                this.zza.zze(this.zzg.zza(context, zzekVar));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
