package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdqc {
    private final zzfdy zza;
    private final zzdpz zzb;

    zzdqc(zzfdy zzfdyVar, zzdpz zzdpzVar) {
        this.zza = zzfdyVar;
        this.zzb = zzdpzVar;
    }

    public final zzfea zza(String str, JSONObject jSONObject) throws zzfdj {
        zzbpa zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpy(new zzbrp());
            } else {
                zzbox zzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zzd.zzc(string) ? zzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzd.zzd(string) ? zzd.zzb(string) : zzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                    }
                }
                zzb = zzd.zzb(str);
            }
            zzfea zzfeaVar = new zzfea(zzb);
            this.zzb.zza(str, zzfeaVar);
            return zzfeaVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkf)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfdj(th);
        }
    }

    public final zzbqw zzb(String str) throws RemoteException {
        zzbqw zze = zzd().zze(str);
        this.zzb.zzb(str, zze);
        return zze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final zzbox zzd() throws RemoteException {
        zzbox zzd = this.zza.zzd();
        if (zzd != null) {
            return zzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
