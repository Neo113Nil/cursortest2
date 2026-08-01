package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.os.EnvironmentCompat;
import com.bumptech.glide.load.Key;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdyv {
    private final zzciq zza;
    private final Context zzb;
    private final zzcbt zzc;
    private final zzfeq zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfkh zzg;
    private final zzffd zzh;
    private final zzdtk zzi;

    public zzdyv(zzciq zzciqVar, Context context, zzcbt zzcbtVar, zzfeq zzfeqVar, Executor executor, String str, zzfkh zzfkhVar, zzdtk zzdtkVar) {
        this.zza = zzciqVar;
        this.zzb = context;
        this.zzc = zzcbtVar;
        this.zzd = zzfeqVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfkhVar;
        this.zzh = zzciqVar.zzw();
        this.zzi = zzdtkVar;
    }

    private final ListenableFuture zzc(final String str, final String str2) {
        zzfjw zza = zzfjv.zza(this.zzb, 11);
        zza.zzh();
        final zzbok zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzz()).zza("google.afma.response.normalize", zzbor.zza, zzbor.zza);
        ListenableFuture zzn = zzgbb.zzn(zzgbb.zzn(zzgbb.zzn(zzgbb.zzh(""), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdys
            @Override // com.google.android.gms.internal.ads.zzgai
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
                    return zzgbb.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdyt
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzbok.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdyu
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdyv.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfkg.zza(zzn, this.zzg, zza);
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
            zzcbn.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        Boolean bool;
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgW)).booleanValue()) {
                String zze = zze(str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhi)).booleanValue() && zze.isEmpty()) {
                    int lastIndexOf = str.lastIndexOf("&request_id=");
                    zze = lastIndexOf != -1 ? str.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(zze)) {
                    return zzgbb.zzg(new zzejt(15, "Invalid ad string."));
                }
                String zzb = this.zza.zzn().zzb(zze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhi)).booleanValue()) {
                    zzdtk zzdtkVar = this.zzi;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals("true")) {
                            bool = true;
                            if (bool.booleanValue()) {
                                int lastIndexOf2 = str.lastIndexOf("&");
                                String str2 = null;
                                String substring = lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zze.getBytes(Key.STRING_CHARSET_NAME);
                                        try {
                                            str2 = new JSONObject(zzb).getString("arek");
                                        } catch (JSONException e) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                        }
                                        str = zzffd.zzb(decode, bytes, str2, zzdtkVar);
                                    } catch (UnsupportedEncodingException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzw(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                        bool = false;
                        if (bool.booleanValue()) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(zzb)) {
                    return zzc(str, zzd(zzb));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgU)).booleanValue()) {
                String str3 = zzcVar.zza;
                String str4 = zzcVar.zzb;
                String zze2 = zze(str3);
                String zze3 = zze(str4);
                if (TextUtils.isEmpty(zze3) || !zze2.equals(zze3)) {
                    this.zzi.zza().put("ridmm", "true");
                } else {
                    this.zza.zzn().zzf(zze2);
                    this.zzi.zza().put("rid", zze2);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzgbb.zzg(new zzejt(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgbb.zzh(new zzfeh(new zzfee(this.zzd), zzfeg.zza(new StringReader(jSONObject.toString()))));
    }
}
