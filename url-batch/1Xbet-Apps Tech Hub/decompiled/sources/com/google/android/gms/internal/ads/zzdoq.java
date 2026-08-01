package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdoq implements zzbfv {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdor zzb;

    zzdoq(zzdor zzdorVar, String str) {
        this.zzb = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzc() {
        zzdkf zzdkfVar;
        zzdkf zzdkfVar2;
        zzdor zzdorVar = this.zzb;
        zzdkfVar = zzdorVar.zzd;
        if (zzdkfVar != null) {
            String str = this.zza;
            zzdkfVar2 = zzdorVar.zzd;
            zzdkfVar2.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzd(MotionEvent motionEvent) {
    }
}
