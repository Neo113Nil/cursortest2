package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbdl extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbdn zzb;

    zzbdl(zzbdn zzbdnVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbdnVar);
        this.zzb = zzbdnVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String.valueOf(str);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbdn zzbdnVar = this.zzb;
            zzbdnVar.zzi().postMessage(zzbdnVar.zze(this.zza, str).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbdn zzbdnVar = this.zzb;
            zzbdnVar.zzi().postMessage(zzbdnVar.zzf(this.zza, query).toString(), null);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
