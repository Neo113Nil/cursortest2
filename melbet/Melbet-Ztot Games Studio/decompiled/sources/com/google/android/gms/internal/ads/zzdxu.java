package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdxu {
    private final zzcgj zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfkf zzg;
    private final zzdsf zzh;
    private final Object zzi = new Object();

    public zzdxu(zzcgj zzcgjVar, Context context, VersionInfoParcel versionInfoParcel, zzffg zzffgVar, Executor executor, String str, zzfkf zzfkfVar, zzdsf zzdsfVar) {
        this.zza = zzcgjVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzffgVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfkfVar;
        zzcgjVar.zzx();
        this.zzh = zzdsfVar;
    }

    private final ListenableFuture zzc(final String str, final String str2) {
        zzfju zza = zzfjt.zza(this.zzb, 11);
        zza.zzi();
        final zzbne zza2 = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzb, this.zzc, this.zza.zzz()).zza("google.afma.response.normalize", zzbnl.zza, zzbnl.zza);
        ListenableFuture zzn = zzgcj.zzn(zzgcj.zzn(zzgcj.zzn(zzgcj.zzh(""), new zzgbq(this) { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgcj.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzbne.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxt
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdxu.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfke.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String zzf(String str, String str2, String str3, zzdsf zzdsfVar) {
        Boolean bool;
        if (!TextUtils.isEmpty(str3)) {
            if (new JSONObject(str3).optString("is_gbid").equals("true")) {
                bool = true;
                if (bool.booleanValue()) {
                    int lastIndexOf = str.lastIndexOf("&");
                    String str4 = null;
                    String substring = lastIndexOf != -1 ? str.substring(0, lastIndexOf) : null;
                    if (!TextUtils.isEmpty(substring)) {
                        try {
                            byte[] decode = Base64.decode(substring, 11);
                            byte[] bytes = str2.getBytes("UTF-8");
                            try {
                                str4 = new JSONObject(str3).getString("arek");
                            } catch (JSONException e) {
                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                            }
                            return zzffv.zzb(decode, bytes, str4, zzdsfVar);
                        } catch (UnsupportedEncodingException e2) {
                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                        }
                    }
                }
            }
            bool = false;
            if (bool.booleanValue()) {
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (r3.zzg(r1, r6, r5) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        String zzb;
        String str;
        String str2 = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str2)) {
            String zze = zze(str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgv)).booleanValue() && zze.isEmpty()) {
                int lastIndexOf = str2.lastIndexOf("&request_id=");
                zze = lastIndexOf != -1 ? str2.substring(lastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(zze)) {
                return zzgcj.zzg(new zzeir(15, "Invalid ad string."));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgL)).booleanValue()) {
                synchronized (this.zzi) {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzl zzo = this.zza.zzo();
                    zzb = zzo.zzb(zze, this.zzh);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgv)).booleanValue()) {
                        str2 = zzf(str2, zze, zzb, this.zzh);
                    }
                    try {
                        str = new JSONObject(str2).optString("render_id", "");
                    } catch (JSONException unused) {
                        str = "";
                    }
                    String str3 = null;
                    int i = 0;
                    if (!TextUtils.isEmpty(str)) {
                        String str4 = "";
                        try {
                            str4 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e) {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "PreloadedLoader.decodeRenderId");
                        }
                        List zze2 = zzfvh.zzb(zzfui.zzc(':')).zze(str4);
                        if (zze2.size() == 2) {
                            str3 = (String) zze2.get(0);
                            i = Integer.parseInt((String) zze2.get(1));
                        } else {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                        }
                    }
                    Pair pair = new Pair(str3, Integer.valueOf(i));
                    String str5 = (String) pair.first;
                    int intValue = ((Integer) pair.second).intValue();
                    if (!TextUtils.isEmpty(str5) && intValue > 0) {
                        if (zzo.zzh(zze, str5)) {
                            return zzgcj.zzg(new zzeir(10, "The ad has already been shown."));
                        }
                    }
                    zzo.zzf(zze);
                }
            } else {
                zzb = this.zza.zzo().zzb(zze, this.zzh);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgv)).booleanValue()) {
                    str2 = zzf(str2, zze, zzb, this.zzh);
                }
            }
            if (!TextUtils.isEmpty(zzb)) {
                return zzc(str2, zzd(zzb));
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgk)).booleanValue()) {
                String str6 = zzcVar.zza;
                String str7 = zzcVar.zzb;
                String zze3 = zze(str6);
                String zze4 = zze(str7);
                if (TextUtils.isEmpty(zze4) || !zze3.equals(zze4)) {
                    this.zzh.zzb().put("ridmm", "true");
                } else {
                    this.zza.zzo().zzf(zze3);
                    this.zzh.zzb().put("request_id", zze3);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzgcj.zzg(new zzeir(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgcj.zzh(new zzfex(new zzfeu(this.zzd), zzfew.zza(new StringReader(jSONObject.toString()), null)));
    }
}
