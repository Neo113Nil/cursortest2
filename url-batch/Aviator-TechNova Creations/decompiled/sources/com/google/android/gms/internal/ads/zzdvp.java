package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdvp {
    private final zzfkg zza;
    private final zzdvm zzb;

    zzdvp(zzfkg zzfkgVar, zzdvm zzdvmVar) {
        this.zza = zzfkgVar;
        this.zzb = zzdvmVar;
    }

    public final zzfki zza(String str, JSONObject jSONObject) throws zzfjr {
        zzbtw zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbuu(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbuu(new zzbwl());
            } else {
                zzbtt zzd = zzd();
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
            zzfki zzfkiVar = new zzfki(zzb);
            this.zzb.zza(str, zzfkiVar);
            return zzfkiVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfjr(th);
        }
    }

    public final zzbvs zzb(String str) throws RemoteException {
        zzbvs zze = zzd().zze(str);
        this.zzb.zzb(str, zze);
        return zze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final zzbtt zzd() throws RemoteException {
        zzbtt zzd = this.zza.zzd();
        if (zzd != null) {
            return zzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
