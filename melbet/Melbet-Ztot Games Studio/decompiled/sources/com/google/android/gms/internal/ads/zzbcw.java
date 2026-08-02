package com.google.android.gms.internal.ads;

import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzbcw extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbcx zzb;

    zzbcw(zzbcx zzbcxVar, String str) {
        this.zza = str;
        this.zzb = zzbcxVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        CustomTabsSession customTabsSession;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbcx zzbcxVar = this.zzb;
            customTabsSession = zzbcxVar.zze;
            customTabsSession.postMessage(zzbcxVar.zzc(this.zza, str).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        CustomTabsSession customTabsSession;
        String query = queryInfo.getQuery();
        try {
            zzbcx zzbcxVar = this.zzb;
            customTabsSession = zzbcxVar.zze;
            customTabsSession.postMessage(zzbcxVar.zzd(this.zza, query).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
