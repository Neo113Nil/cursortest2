package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdrp {
    private final Context zza;
    private final zzdqv zzb;
    private final zzazh zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbgd zzf;
    private final Executor zzg;
    private final zzbkh zzh;
    private final zzdsh zzi;
    private final zzduv zzj;
    private final ScheduledExecutorService zzk;
    private final zzdtq zzl;
    private final zzdxz zzm;
    private final zzfqk zzn;
    private final zzeiu zzo;
    private final zzejf zzp;
    private final zzfjo zzq;
    private final zzdxt zzr;
    private final zzdzc zzs;

    public zzdrp(Context context, zzdqv zzdqvVar, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, Executor executor, zzfjk zzfjkVar, zzdsh zzdshVar, zzduv zzduvVar, ScheduledExecutorService scheduledExecutorService, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = context;
        this.zzb = zzdqvVar;
        this.zzc = zzazhVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbgdVar;
        this.zzg = executor;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzdshVar;
        this.zzj = zzduvVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdxzVar;
        this.zzn = zzfqkVar;
        this.zzo = zzeiuVar;
        this.zzl = zzdtqVar;
        this.zzp = zzejfVar;
        this.zzq = zzfjoVar;
        this.zzr = zzdxtVar;
        this.zzs = zzdzcVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzguf.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzguf.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzez zzt = zzt(optJSONArray.optJSONObject(i));
            if (zzt != null) {
                arrayList.add(zzt);
            }
        }
        return zzguf.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z, boolean z2, zzdxh zzdxhVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgzo.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdro.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ListenableFuture zzn(JSONObject jSONObject, boolean z, zzdxh zzdxhVar) {
        HashMap hashMap;
        final String optString;
        int i;
        double d;
        if (jSONObject == null) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeP))) {
                HashMap hashMap2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeQ)).split(",")) {
                    try {
                        hashMap2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                hashMap = hashMap2;
                optString = jSONObject.optString("url");
                if (!TextUtils.isEmpty(optString) && hashMap == null) {
                    return zzgzo.zza(null);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue() && zzdxhVar != null) {
                    this.zzr.zze().putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                }
                final double optDouble = jSONObject.optDouble("scale", 1.0d);
                boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
                final int optInt = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
                final int optInt2 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
                if (!z) {
                    i = optInt;
                    d = optDouble;
                } else {
                    if (hashMap == null) {
                        return zzr(jSONObject.optBoolean("require"), zzgzo.zzk(this.zzb.zza(optString, optDouble, optBoolean), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdre
                            @Override // com.google.android.gms.internal.ads.zzgqt
                            public final /* synthetic */ Object apply(Object obj) {
                                return new zzbkd(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                            }
                        }, this.zzg), null);
                    }
                    d = optDouble;
                    i = optInt;
                }
                return zzgzo.zza(new zzbkd(null, Uri.parse(optString), d, i, optInt2, hashMap));
            }
        }
        hashMap = null;
        optString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString)) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final double optDouble2 = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean2 = jSONObject.optBoolean("is_transparent", true);
        final int optInt3 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
        final int optInt22 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
        if (!z) {
        }
        return zzgzo.zza(new zzbkd(null, Uri.parse(optString), d, i, optInt22, hashMap));
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfirVar, zzfiuVar, zzs(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0)), zzbVar, zzcceVar);
        return zzgzo.zzj(zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzcjl zzcjlVar = (zzcjl) obj;
                if (zzcjlVar == null || zzcjlVar.zzh() == null) {
                    throw new zzenv(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcei.zzg);
    }

    private static ListenableFuture zzq(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgzo.zzh(listenableFuture, Exception.class, new zzgyw(obj2) { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgzo.zza(null);
            }
        }, zzcei.zzg);
    }

    private static ListenableFuture zzr(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgzo.zzj(listenableFuture, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return obj2 != null ? ListenableFuture.this : zzgzo.zzc(new zzenv(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcei.zzg) : zzq(listenableFuture, null);
    }

    private static final com.google.android.gms.ads.internal.client.zzez zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(optString, optString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdxhVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        zzbkh zzbkhVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbkhVar.zzb, zzbkhVar.zzd, zzdxhVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfir zzfirVar, final zzfiu zzfiuVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlx)).booleanValue()) {
            return zzgzo.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgzo.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
            if (optJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeP))) {
                return zzgzo.zza(null);
            }
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzs = zzs(optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture zzj = zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdrp.this.zzh(zzs, zzfirVar, zzfiuVar, zzbVar, zzcceVar, optString, optString2, obj);
            }
        }, zzcei.zzf);
        return zzgzo.zzj(zzj, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                if (((zzcjl) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzenv(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcei.zzg);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzr(optJSONObject.optBoolean("require"), zzgzo.zzk(zzm(optJSONArray, false, true, zzdxhVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrh
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzdrp.this.zzi(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgzo.zza(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdrp.this.zzj(optString, zzcceVar, zzbVar, obj);
            }
        }, zzcei.zzf);
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcen zzcenVar = new zzcen();
        zzgzo.zzr(listenableFuture, new zzdrd(this, zzcenVar), zzcei.zzf);
        return zzcenVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        ListenableFuture zza;
        zzdrp zzdrpVar;
        boolean z = false;
        JSONObject zzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (zzi != null) {
            return zzp(zzi, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlw)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
                return zzgzo.zza(null);
            }
        } else if (!z) {
            zza = this.zzi.zza(optJSONObject, zzbVar, zzcceVar);
            zzdrpVar = this;
            return zzq(zzgzo.zzi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, zzdrpVar.zzk), null);
        }
        zzdrpVar = this;
        zza = zzdrpVar.zzp(optJSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        return zzq(zzgzo.zzi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, zzdrpVar.zzk), null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, String str, String str2, Object obj) {
        zzdzc zzdzcVar;
        zzcjl zza = this.zzj.zza(zzrVar, zzfirVar, zzfiuVar);
        final zzcem zza2 = zzcem.zza(zza);
        zzdtn zza3 = this.zzl.zza();
        zzclj zzP = zza.zzP();
        zzbgv zzbgvVar = zzbhe.zzpf;
        zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzo, this.zzn, this.zzm, null, zza3, null, null, null, null, null, null, null);
        zza.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zza.zzab("/getNativeClickMeta", zzbog.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziR)).booleanValue() && (zzdzcVar = this.zzs) != null) {
                zza.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
            }
        }
        zza.zzP().zzS(true);
        zza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcem zzcemVar = zzcem.this;
                if (z) {
                    zzcemVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcemVar.zzd(new zzenv(1, sb.toString()));
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ zzbka zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzo = zzo(jSONObject, "bg_color");
        Integer zzo2 = zzo(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbka(optString, list, zzo, zzo2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzcce zzcceVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzejf zzejfVar = this.zzp;
        zzcjl zza = zzckb.zza(context, zzclv.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzejfVar, this.zzq, this.zzm);
        final zzcem zza2 = zzcem.zza(zza);
        zza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdrm
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzcem.this.zzb();
            }
        });
        zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            if (zzcceVar != null) {
                zza.zzP().zzj(zzcceVar);
            }
            zza.zzP().zzi(zzbVar);
        }
        return zza2;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}
