package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbcx {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zze zzb;
    private Runnable zzc;
    private zzbcu zzd;
    private CustomTabsSession zze;
    private String zzf;
    private long zzg = 0;
    private long zzh;
    private JSONArray zzi;
    private Context zzj;

    public zzbcx(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zze zzeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zziT)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj() {
        zzbcu zzbcuVar = this.zzd;
        if (zzbcuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbcuVar.zza().booleanValue()) {
            return;
        }
        if (this.zzf != null && this.zze != null && this.zza != null) {
            if (this.zzg == 0 || com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() > this.zzg) {
            }
            this.zze.requestPostMessageChannel(Uri.parse(this.zzf));
            this.zza.schedule(this.zzc, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziU)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzi == null) {
                this.zzi = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziW));
            }
            jSONObject.put("eids", this.zzi);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zze;
    }

    final JSONObject zzc(String str, String str2) throws JSONException {
        long j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziX)).longValue();
        } else {
            j = 0;
        }
        jSONObject.put("sdk_ttl_ms", j);
        zzk(jSONObject);
        return jSONObject;
    }

    final JSONObject zzd(String str, String str2) throws JSONException {
        long j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziX)).longValue();
        } else {
            j = 0;
        }
        jSONObject.put("sdk_ttl_ms", j);
        zzk(jSONObject);
        return jSONObject;
    }

    final void zzf() {
        this.zzg = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziS)).intValue();
        if (this.zzc == null) {
            this.zzc = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcv
                @Override // java.lang.Runnable
                public final void run() {
                    zzbcx.this.zzj();
                }
            };
        }
        zzj();
    }

    final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zze;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzh).toString());
            zzk(jSONObject);
            customTabsSession.postMessage(jSONObject.toString(), null);
            zzbcw zzbcwVar = new zzbcw(this, str);
            if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
                this.zzb.zzg(this.zze, zzbcwVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzj, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbcwVar);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzh = j;
    }

    public final void zzg(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzj = context;
        this.zzf = str;
        zzbcu zzbcuVar = new zzbcu(this, customTabsCallback);
        this.zzd = zzbcuVar;
        CustomTabsSession newSession = customTabsClient.newSession(zzbcuVar);
        this.zze = newSession;
        if (newSession == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("CustomTabsClient failed to create new session.");
        }
    }
}
