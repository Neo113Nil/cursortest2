package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdlo implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdpj zzd;
    private final Clock zze;
    private zzbic zzf;
    private zzbkd zzg;

    public zzdlo(zzdpj zzdpjVar, Clock clock) {
        this.zzd = zzdpjVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(FacebookMediationAdapter.KEY_ID, this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final zzbic zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbic zzbicVar) {
        this.zzf = zzbicVar;
        zzbkd zzbkdVar = this.zzg;
        if (zzbkdVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbkdVar);
        }
        zzbkd zzbkdVar2 = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdlo zzdloVar = zzdlo.this;
                try {
                    zzdloVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzcbn.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbic zzbicVar2 = zzbicVar;
                zzdloVar.zza = (String) map.get(FacebookMediationAdapter.KEY_ID);
                String str = (String) map.get("asset_id");
                if (zzbicVar2 == null) {
                    zzcbn.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbicVar2.zzf(str);
                } catch (RemoteException e) {
                    zzcbn.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbkdVar2;
        this.zzd.zzi("/unconfirmedClick", zzbkdVar2);
    }
}
