package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdsg;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzw implements zzdel {
    private final zzdsg zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    public zzw(zzdsg zzdsgVar, zzv zzvVar, String str, int i) {
        this.zza = zzdsgVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(zzbj zzbjVar) {
        String str;
        if (zzbjVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbjVar.zzc)) {
            this.zzb.zza(this.zzc, zzbjVar.zzb, this.zza);
            return;
        }
        try {
            str = new JSONObject(zzbjVar.zzc).optString("request_id");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "RenderSignals.getRequestId");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zza(str, zzbjVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
    }
}
