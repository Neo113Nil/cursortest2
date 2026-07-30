package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbog {
    public static final zzboh zza = zzbof.zza;
    public static final zzboh zzb = zzbnw.zza;
    public static final zzboh zzc = zzbnx.zza;
    public static final zzboh zzd = new zzbno();
    public static final zzboh zze = new zzbnp();
    public static final zzboh zzf = zzboc.zza;
    public static final zzboh zzg = new zzbnq();
    public static final zzboh zzh = new zzbnr();
    public static final zzboh zzi = zzbod.zza;
    public static final zzboh zzj = new zzbns();
    public static final zzboh zzk = new zzbnt();
    public static final zzboh zzl = new zzchf();
    public static final zzboh zzm = new zzchg();
    public static final zzboh zzn = new zzbna();
    public static final zzboy zzo = new zzboy();
    public static final zzboh zzp = new zzbnu();
    public static final zzboh zzq = new zzbnv();
    public static final zzboh zzr = new zzbnb();
    public static final zzboh zzs = new zzbnc();
    public static final zzboh zzt = new zzbnd();
    public static final zzboh zzu = new zzbne();
    public static final zzboh zzv = new zzbnf();
    public static final zzboh zzw = new zzbng();
    public static final zzboh zzx = new zzbnh();
    public static final zzboh zzy = new zzbni();
    public static final zzboh zzz = new zzbnj();
    public static final zzboh zzA = new zzbnk();
    public static final zzboh zzB = new zzbnm();
    public static final zzboh zzC = new zzbnn();

    public static ListenableFuture zza(zzcjl zzcjlVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzazh zzS = zzcjlVar.zzS();
            zzfjo zzT = zzcjlVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzT == null) {
                if (zzS != null && zzS.zza(parse)) {
                    parse = zzS.zzd(parse, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
                }
            } else if (zzS != null && zzS.zza(parse)) {
                parse = zzT.zza(parse, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
            }
        } catch (zzazi unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        }
        Map hashMap = new HashMap();
        if (zzcjlVar.zzC() != null) {
            hashMap = zzcjlVar.zzC().zzaw;
        }
        final String zzb2 = zzccs.zzb(parse, zzcjlVar.getContext(), hashMap);
        long longValue = ((Long) zzbjd.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 254715000) {
            return zzgzo.zza(zzb2);
        }
        zzgzg zzw2 = zzgzg.zzw(zzcjlVar.zzaF());
        zzbny zzbnyVar = zzbny.zza;
        zzgzy zzgzyVar = zzcei.zzg;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzw2, Throwable.class, zzbnyVar, zzgzyVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbnz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                String str2 = (String) obj;
                zzboh zzbohVar = zzbog.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbjd.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) zzbjd.zza.zze();
                    String str5 = (String) zzbjd.zzb.zze();
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
        }, zzgzyVar), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzboa
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzboh zzbohVar = zzbog.zza;
                if (((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzgzyVar);
    }

    public static zzboh zzb(final zzdjm zzdjmVar, final zzcrv zzcrvVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjm.this);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcrv zzcrvVar2 = zzcrvVar;
                zzgzg zzw2 = zzgzg.zzw(zzbog.zza(zzcjlVar, str));
                zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzboe
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcrv zzcrvVar3;
                        String str2 = (String) obj2;
                        zzboh zzbohVar = zzbog.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar3 = zzcrv.this) != null && zzcrv.zzc(str)) ? zzcrvVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(str2);
                    }
                };
                zzgzy zzgzyVar = zzcei.zza;
                zzgzo.zzr((zzgzg) zzgzo.zzj(zzw2, zzgywVar, zzgzyVar), new zzbnl(zzcjlVar), zzgzyVar);
            }
        };
    }

    public static void zzc(Map map, zzdjm zzdjmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmi)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(AppEventsConstants.EVENT_PARAM_VALUE_YES) && zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zze(zzckx zzckxVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzckxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            String.valueOf(optString7);
                            String valueOf = String.valueOf(optString7);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e2);
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
                ((zzbrd) zzckxVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbrd) zzckxVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbrd) zzckxVar).zzd("openableIntents", new JSONObject());
        }
    }
}
