package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdjz implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdnx zzd;
    private final Clock zze;
    private zzbhn zzf;
    private zzbjl zzg;

    public zzdjz(zzdnx zzdnxVar, Clock clock) {
        this.zzd = zzdnxVar;
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
            hashMap.put("id", this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final void zza(final zzbhn zzbhnVar) {
        this.zzf = zzbhnVar;
        zzbjl zzbjlVar = this.zzg;
        if (zzbjlVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbjlVar);
        }
        zzbjl zzbjlVar2 = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdjz zzdjzVar = zzdjz.this;
                try {
                    zzdjzVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhn zzbhnVar2 = zzbhnVar;
                zzdjzVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhnVar2 == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbhnVar2.zze(str);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        };
        this.zzg = zzbjlVar2;
        this.zzd.zzd("/unconfirmedClick", zzbjlVar2);
    }

    public final zzbhn zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
