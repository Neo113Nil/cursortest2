package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdpd implements zzbkf {
    final /* synthetic */ zzdqe zza;
    final /* synthetic */ ViewGroup zzb;

    zzdpd(zzdqe zzdqeVar, ViewGroup viewGroup) {
        this.zza = zzdqeVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final void zza() {
        zzguf zzgufVar = zzdpc.zza;
        zzdqe zzdqeVar = this.zza;
        Map zzk = zzdqeVar.zzk();
        if (zzk == null) {
            return;
        }
        int size = zzgufVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzk.get((String) zzgufVar.get(i));
            i++;
            if (obj != null) {
                zzdqeVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final JSONObject zzc() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final JSONObject zzd() {
        return this.zza.zzq();
    }
}
