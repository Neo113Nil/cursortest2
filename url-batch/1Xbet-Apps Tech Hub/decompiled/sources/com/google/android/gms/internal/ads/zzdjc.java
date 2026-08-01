package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdjc implements zzbkd {
    private final WeakReference zza;

    /* synthetic */ zzdjc(zzdjh zzdjhVar, zzdjb zzdjbVar) {
        this.zza = new WeakReference(zzdjhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcyf zzcyfVar;
        zzdgc zzdgcVar;
        zzdgc zzdgcVar2;
        zzdjh zzdjhVar = (zzdjh) this.zza.get();
        if (zzdjhVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzcyfVar = zzdjhVar.zzh;
            zzcyfVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkb)).booleanValue()) {
                zzdgcVar = zzdjhVar.zzi;
                zzdgcVar.zzbL();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdgcVar2 = zzdjhVar.zzi;
                zzdgcVar2.zzs();
            }
        }
    }
}
