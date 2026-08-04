package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcfv {
    private final zzcfu zza;
    private final zzcfw zzb;

    public zzcfv(zzcfw zzcfwVar, zzcfu zzcfuVar) {
        this.zza = zzcfuVar;
        this.zzb = zzcfwVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcfw zzcfwVar = this.zzb;
        zzauu zzS = ((zzcgd) zzcfwVar).zzS();
        if (zzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaup zzb = zzS.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcfwVar.getContext() != null) {
            return zzb.zzf(zzcfwVar.getContext(), str, ((zzcgf) zzcfwVar).zzE(), zzcfwVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcfw zzcfwVar = this.zzb;
        zzauu zzS = ((zzcgd) zzcfwVar).zzS();
        if (zzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaup zzb = zzS.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcfwVar.getContext() != null) {
            return zzb.zzj(zzcfwVar.getContext(), ((zzcgf) zzcfwVar).zzE(), zzcfwVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfv.this.zza(str);
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
