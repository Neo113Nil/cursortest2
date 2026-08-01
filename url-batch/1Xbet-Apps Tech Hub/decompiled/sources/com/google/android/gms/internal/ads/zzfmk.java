package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzfmk {
    private zzfnn zza;
    private long zzb;
    private int zzc;

    public zzfmk() {
        zzb();
        this.zza = new zzfnn(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzfmd.zza().zzg(zza(), str);
    }

    public final void zze(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfmq.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfmd.zza().zzf(zza(), jSONObject);
    }

    public final void zzf(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfmd.zza().zzg(zza(), str);
        }
    }

    public void zzg(zzflj zzfljVar, zzflh zzflhVar) {
        zzh(zzfljVar, zzflhVar, null);
    }

    protected final void zzh(zzflj zzfljVar, zzflh zzflhVar, JSONObject jSONObject) {
        String zzh = zzfljVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfmq.zze(jSONObject2, "environment", "app");
        zzfmq.zze(jSONObject2, "adSessionType", zzflhVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfmq.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfmq.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfmq.zze(jSONObject3, "os", "Android");
        zzfmq.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfmq.zze(jSONObject2, "deviceCategory", zzfmp.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfmq.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfmq.zze(jSONObject4, "partnerName", zzflhVar.zze().zzb());
        zzfmq.zze(jSONObject4, "partnerVersion", zzflhVar.zze().zzc());
        zzfmq.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfmq.zze(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        zzfmq.zze(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, zzfmb.zzb().zza().getApplicationContext().getPackageName());
        zzfmq.zze(jSONObject2, "app", jSONObject5);
        if (zzflhVar.zzf() != null) {
            zzfmq.zze(jSONObject2, "contentUrl", zzflhVar.zzf());
        }
        zzfmq.zze(jSONObject2, "customReferenceData", zzflhVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzflhVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfmd.zza().zzh(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzi(float f) {
        zzfmd.zza().zze(zza(), f);
    }

    final void zzj(WebView webView) {
        this.zza = new zzfnn(webView);
    }

    public void zzk() {
    }

    public final boolean zzl() {
        return this.zza.get() != null;
    }
}
