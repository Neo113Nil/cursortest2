package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdxt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzw implements zzdjy {
    private final zzdxt zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    public zzw(zzdxt zzdxtVar, zzv zzvVar, String str, int i) {
        this.zza = zzdxtVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
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
            str = new JSONObject(zzbjVar.zzc).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "RenderSignals.getRequestId");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zza(str, zzbjVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
    }
}
