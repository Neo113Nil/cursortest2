package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdlj implements zzbfv {
    final /* synthetic */ zzdmg zza;
    final /* synthetic */ ViewGroup zzb;

    zzdlj(zzdmg zzdmgVar, ViewGroup viewGroup) {
        this.zza = zzdmgVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzc() {
        zzfwu zzfwuVar = zzdlg.zza;
        Map zzm = this.zza.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfwuVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzm.get((String) zzfwuVar.get(i));
            i++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
