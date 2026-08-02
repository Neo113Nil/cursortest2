package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbte {
    private static zzbym zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;
    private final String zze;

    public zzbte(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdx zzdxVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
        this.zze = str;
    }

    public static zzbym zza(Context context) {
        zzbym zzbymVar;
        synchronized (zzbte.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzboi());
            }
            zzbymVar = zza;
        }
        return zzbymVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl zza2;
        long currentTimeMillis = System.currentTimeMillis();
        zzbym zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        if (zzdxVar == null) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
            zzmVar.zzg(currentTimeMillis);
            zza2 = zzmVar.zza();
        } else {
            zzdxVar.zzq(currentTimeMillis);
            zza2 = com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, this.zzd);
        }
        try {
            zza3.zzf(wrap, new zzbyq(this.zze, this.zzc.name(), null, zza2), new zzbtd(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
