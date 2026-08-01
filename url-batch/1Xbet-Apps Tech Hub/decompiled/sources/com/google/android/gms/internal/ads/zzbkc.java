package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbkc {
    public static final zzbkd zza = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbja
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzchw zzchwVar = (zzchw) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzcbn.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzchwVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbmx) zzchwVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbkd zzb = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjc
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzchw zzchwVar = (zzchw) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzic)).booleanValue()) {
                zzcbn.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzcbn.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzchwVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbmx) zzchwVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbkd zzc = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjf
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzbkc.zzb((zzchw) obj, map);
        }
    };
    public static final zzbkd zzd = new zzbju();
    public static final zzbkd zze = new zzbjv();
    public static final zzbkd zzf = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjg
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzchw zzchwVar = (zzchw) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzcbn.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzca(zzchwVar.getContext(), ((zzcie) zzchwVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbkd zzg = new zzbjw();
    public static final zzbkd zzh = new zzbjx();
    public static final zzbkd zzi = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbje
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzcid zzcidVar = (zzcid) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzasi zzI = zzcidVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                zzcbn.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbkd zzj = new zzbjy();
    public static final zzbkd zzk = new zzbjz();
    public static final zzbkd zzl = new zzcev();
    public static final zzbkd zzm = new zzcew();
    public static final zzbkd zzn = new zzbiw();
    public static final zzbks zzo = new zzbks();
    public static final zzbkd zzp = new zzbka();
    public static final zzbkd zzq = new zzbkb();
    public static final zzbkd zzr = new zzbjh();
    public static final zzbkd zzs = new zzbji();
    public static final zzbkd zzt = new zzbjj();
    public static final zzbkd zzu = new zzbjk();
    public static final zzbkd zzv = new zzbjl();
    public static final zzbkd zzw = new zzbjm();
    public static final zzbkd zzx = new zzbjn();
    public static final zzbkd zzy = new zzbjo();
    public static final zzbkd zzz = new zzbjp();
    public static final zzbkd zzA = new zzbjq();
    public static final zzbkd zzB = new zzbjs();
    public static final zzbkd zzC = new zzbjt();

    public static ListenableFuture zza(zzcgv zzcgvVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzasi zzI = zzcgvVar.zzI();
            if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcgvVar.getContext(), zzcgvVar.zzF(), zzcgvVar.zzi());
            }
        } catch (zzasj unused) {
            zzcbn.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzbzu.zzb(parse, zzcgvVar.getContext());
        long longValue = ((Long) zzbeu.zze.zze()).longValue();
        return (longValue <= 0 || longValue > 234310600) ? zzgbb.zzh(zzb2) : zzgbb.zze(zzgbb.zzm(zzgbb.zze(zzgas.zzu(zzcgvVar.zzR()), Throwable.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzbix
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbkd zzbkdVar = zzbkc.zza;
                if (!((Boolean) zzbeu.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzcca.zzf), new zzftn() { // from class: com.google.android.gms.internal.ads.zzbiy
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbkd zzbkdVar = zzbkc.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbeu.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbeu.zza.zze();
                    String str5 = (String) zzbeu.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzcca.zzf), Throwable.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzbiz
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbkd zzbkdVar = zzbkc.zza;
                if (((Boolean) zzbeu.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzcca.zzf);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        com.google.android.gms.internal.ads.zzcbn.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zzb(zzchw zzchwVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzchwVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString(FacebookMediationAdapter.KEY_ID);
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        zzcbn.zzh("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            zzcbn.zzh("Error parsing the url: ".concat(String.valueOf(optString7)), e2);
                        }
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo != null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo != null);
                }
                ((zzbmx) zzchwVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbmx) zzchwVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbmx) zzchwVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdge zzdgeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzka)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdgeVar != null) {
            zzdgeVar.zzbL();
        }
    }
}
