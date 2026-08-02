package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzdnh implements zzber {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdni zzb;

    zzdnh(zzdni zzdniVar, String str) {
        this.zzb = zzdniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzc() {
        zzdiw zzdiwVar;
        zzdiw zzdiwVar2;
        zzdni zzdniVar = this.zzb;
        zzdiwVar = zzdniVar.zzd;
        if (zzdiwVar != null) {
            String str = this.zza;
            zzdiwVar2 = zzdniVar.zzd;
            zzdiwVar2.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzd(MotionEvent motionEvent) {
    }
}
