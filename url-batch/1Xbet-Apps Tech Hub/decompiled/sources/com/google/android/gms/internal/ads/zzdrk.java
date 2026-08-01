package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdrk {
    private final zzffk zza;
    private final zzdrh zzb;

    zzdrk(zzffk zzffkVar, zzdrh zzdrhVar) {
        this.zza = zzffkVar;
        this.zzb = zzdrhVar;
    }

    final zzbpr zza() throws RemoteException {
        zzbpr zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzcbn.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrp zzb(String str) throws RemoteException {
        zzbrp zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzffm zzc(String str, JSONObject jSONObject) throws zzfev {
        zzbpu zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbqs(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbqs(new zzbsh());
            } else {
                zzbpr zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        zzcbn.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzffm zzffmVar = new zzffm(zzb);
            this.zzb.zzd(str, zzffmVar);
            return zzffmVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjg)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfev(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
