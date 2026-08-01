package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bumptech.glide.load.Key;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdnn {
    private final Context zza;
    private final zzdmw zzb;
    private final zzasi zzc;
    private final zzcbt zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzayp zzf;
    private final Executor zzg;
    private final zzbfw zzh;
    private final zzdof zzi;
    private final zzdqu zzj;
    private final ScheduledExecutorService zzk;
    private final zzdpp zzl;
    private final zzdtp zzm;
    private final zzfje zzn;
    private final zzfla zzo;
    private final zzeep zzp;
    private final zzefa zzq;

    public zzdnn(Context context, zzdmw zzdmwVar, zzasi zzasiVar, zzcbt zzcbtVar, com.google.android.gms.ads.internal.zza zzaVar, zzayp zzaypVar, Executor executor, zzfeq zzfeqVar, zzdof zzdofVar, zzdqu zzdquVar, ScheduledExecutorService scheduledExecutorService, zzdtp zzdtpVar, zzfje zzfjeVar, zzfla zzflaVar, zzeep zzeepVar, zzdpp zzdppVar, zzefa zzefaVar) {
        this.zza = context;
        this.zzb = zzdmwVar;
        this.zzc = zzasiVar;
        this.zzd = zzcbtVar;
        this.zze = zzaVar;
        this.zzf = zzaypVar;
        this.zzg = executor;
        this.zzh = zzfeqVar.zzi;
        this.zzi = zzdofVar;
        this.zzj = zzdquVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdtpVar;
        this.zzn = zzfjeVar;
        this.zzo = zzflaVar;
        this.zzp = zzeepVar;
        this.zzl = zzdppVar;
        this.zzq = zzefaVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfwu.zzl();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfwu.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfwu.zzj(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgbb.zzf(listenableFuture, Exception.class, new zzgai(obj2) { // from class: com.google.android.gms.internal.ads.zzdnl
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgbb.zzh(null);
            }
        }, zzcca.zzf);
    }

    private static ListenableFuture zzm(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgbb.zzn(listenableFuture, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj2) {
                return obj2 != null ? ListenableFuture.this : zzgbb.zzg(new zzejt(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcca.zzf) : zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgbb.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzgbb.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgbb.zzh(new zzbfu(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgbb.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzftn() { // from class: com.google.android.gms.internal.ads.zzdnd
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return new zzbfu(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgbb.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgbb.zzm(zzgbb.zzd(arrayList), new zzftn() { // from class: com.google.android.gms.internal.ads.zzdni
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbfu zzbfuVar : (List) obj) {
                    if (zzbfuVar != null) {
                        arrayList2.add(zzbfuVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfdu zzfduVar, zzfdy zzfdyVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfduVar, zzfdyVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgbb.zzn(zzb, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdne
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                zzcgv zzcgvVar = (zzcgv) obj;
                if (zzcgvVar == null || zzcgvVar.zzq() == null) {
                    throw new zzejt(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcca.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    final /* synthetic */ zzbfr zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbfr(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfdu zzfduVar, zzfdy zzfdyVar, String str, String str2, Object obj) throws Exception {
        zzcgv zza = this.zzj.zza(zzqVar, zzfduVar, zzfdyVar);
        final zzcce zza2 = zzcce.zza(zza);
        zzdpm zzb = this.zzl.zzb();
        zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdD)).booleanValue()) {
            zza.zzad("/getNativeAdViewSignals", zzbkc.zzs);
        }
        zza.zzad("/getNativeClickMeta", zzbkc.zzt);
        zza.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzdnh
            @Override // com.google.android.gms.internal.ads.zzcig
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcce zzcceVar = zzcce.this;
                if (z) {
                    zzcceVar.zzb();
                    return;
                }
                zzcceVar.zzd(new zzejt(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcgv zza = zzchh.zza(this.zza, zzcik.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq);
        final zzcce zza2 = zzcce.zza(zza);
        zza.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzdnj
            @Override // com.google.android.gms.internal.ads.zzcig
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcce.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeW)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", Key.STRING_CHARSET_NAME);
        }
        return zza2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgbb.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgbb.zzm(zzo(optJSONArray, false, true), new zzftn() { // from class: com.google.android.gms.internal.ads.zzdnk
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return zzdnn.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbfw zzbfwVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfwVar.zzb, zzbfwVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzfdu zzfduVar, final zzfdy zzfdyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjA)).booleanValue()) {
            return zzgbb.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgbb.zzh(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgbb.zzh(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgbb.zzh(null);
        }
        final ListenableFuture zzn = zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzdnn.this.zzb(zzk, zzfduVar, zzfdyVar, optString, optString2, obj);
            }
        }, zzcca.zze);
        return zzgbb.zzn(zzn, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                if (((zzcgv) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzejt(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcca.zzf);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzfdu zzfduVar, zzfdy zzfdyVar) {
        ListenableFuture zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "html_containers", "instream");
        if (zzg != null) {
            return zzp(zzg, zzfduVar, zzfdyVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgbb.zzh(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjz)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                zzcbn.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzgbb.zzh(null);
            }
        } else if (!z) {
            zza = this.zzi.zza(optJSONObject);
            return zzl(zzgbb.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdE)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        zza = zzp(optJSONObject, zzfduVar, zzfdyVar);
        return zzl(zzgbb.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdE)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
