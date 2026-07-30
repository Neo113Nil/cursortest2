package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeeg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcma zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfjk zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfoo zzi;
    private final zzdxt zzj;
    private final zzfqk zzk;
    private final zzdej zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzcac zzq;

    zzeeg(zzcma zzcmaVar, Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, String str, zzfoo zzfooVar, zzdxt zzdxtVar, zzcac zzcacVar, zzehb zzehbVar, ScheduledExecutorService scheduledExecutorService, zzfqk zzfqkVar, zzdej zzdejVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfjkVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfooVar;
        zzcmaVar.zzB();
        this.zzj = zzdxtVar;
        this.zzq = zzcacVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfqkVar;
        this.zzl = zzdejVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ListenableFuture zzg(String str, final String str2) {
        ListenableFuture zza2;
        String str3;
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgzo.zzc(new zzenv(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfoe zzn = zzfoe.zzn(context, 11);
        zzn.zza();
        zzbsz zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        zzbst zzbstVar = zzbsw.zza;
        final zzbsp zza3 = zzb.zza("google.afma.response.normalize", zzbstVar, zzbstVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzia)).booleanValue()) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.zzn = jSONObject.optString("fetch_url", "");
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused2) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                str4 = this.zzn;
                final List list = this.zzo;
                if (TextUtils.isEmpty(str4)) {
                }
                zzgyw zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzeef
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        String str6 = (String) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        String str7 = str2;
                        try {
                            jSONObject4.put("headers", new JSONObject());
                            jSONObject4.put(SDKConstants.PARAM_A2U_BODY, str6);
                            jSONObject3.put("base_url", "");
                            jSONObject3.put("signals", new JSONObject(str7));
                            jSONObject2.put("request", jSONObject3);
                            jSONObject2.put("response", jSONObject4);
                            jSONObject2.put("flags", new JSONObject());
                            return zzgzo.zza(jSONObject2);
                        } catch (JSONException e) {
                            String valueOf = String.valueOf(e.getCause());
                            String.valueOf(valueOf);
                            throw new JSONException("Preloaded loader: ".concat(String.valueOf(valueOf)));
                        }
                    }
                };
                Executor executor = this.zzf;
                ListenableFuture zzj = zzgzo.zzj(zzgzo.zzj(zzgzo.zzj(zza2, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeeb
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzeeg.this.zzb(zza3, (JSONObject) obj);
                    }
                }, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeec
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzeeg.this.zzc((JSONObject) obj);
                    }
                }, executor);
                zzfon.zzd(zzj, this.zzi, zzn);
                zzgzo.zzr(zzj, new zzeea(this), zzcei.zzg);
                return zzj;
            }
            str4 = this.zzn;
            final List list2 = this.zzo;
            if (TextUtils.isEmpty(str4)) {
                this.zzj.zzd("sst", ExifInterface.GPS_MEASUREMENT_2D);
                String str6 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzic);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzib)).booleanValue()) {
                    List zze = zzgrr.zzb(zza).zze(str4);
                    if (zze.size() < 2) {
                        zza2 = zzgzo.zzc(new zzenv(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) zze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                final zzegy zzegyVar = new zzegy(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6, false);
                zza2 = (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzeeg.this.zzd(zzegyVar);
                    }
                })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzid)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeee
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzeeg.this.zze(list2, (Exception) obj);
                    }
                }, this.zzf);
            } else {
                zza2 = zzgzo.zza(str3);
                this.zzj.zzd("sst", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
        } else {
            zza2 = zzgzo.zza(str);
            this.zzj.zzd("sst", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        zzgyw zzgywVar2 = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzeef
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str62 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put(SDKConstants.PARAM_A2U_BODY, str62);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgzo.zza(jSONObject2);
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e.getCause());
                    String.valueOf(valueOf);
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(valueOf)));
                }
            }
        };
        Executor executor2 = this.zzf;
        ListenableFuture zzj2 = zzgzo.zzj(zzgzo.zzj(zzgzo.zzj(zza2, zzgywVar2, executor2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeeg.this.zzb(zza3, (JSONObject) obj);
            }
        }, executor2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeeg.this.zzc((JSONObject) obj);
            }
        }, executor2);
        zzfon.zzd(zzj2, this.zzi, zzn);
        zzgzo.zzr(zzj2, new zzeea(this), zzcei.zzg);
        return zzj2;
    }

    private final void zzh(zzdxh zzdxhVar) {
        Bundle zze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
            zze.putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0231, code lost:
    
        if (r5.zze(r1, r2, r4) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ef A[Catch: all -> 0x0247, TryCatch #2 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0105, B:36:0x010d, B:37:0x0113, B:41:0x011c, B:44:0x0152, B:47:0x0130, B:50:0x013d, B:52:0x0158, B:55:0x00e4, B:57:0x016c, B:60:0x0189, B:64:0x0191, B:66:0x01b6, B:68:0x01cb, B:70:0x01ef, B:71:0x0204, B:74:0x0218, B:76:0x021e, B:77:0x022b, B:79:0x022d, B:81:0x0236, B:86:0x0233, B:87:0x01f9, B:88:0x01de, B:91:0x019f, B:94:0x0179, B:95:0x017e), top: B:21:0x0080, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021e A[Catch: all -> 0x0247, TryCatch #2 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0105, B:36:0x010d, B:37:0x0113, B:41:0x011c, B:44:0x0152, B:47:0x0130, B:50:0x013d, B:52:0x0158, B:55:0x00e4, B:57:0x016c, B:60:0x0189, B:64:0x0191, B:66:0x01b6, B:68:0x01cb, B:70:0x01ef, B:71:0x0204, B:74:0x0218, B:76:0x021e, B:77:0x022b, B:79:0x022d, B:81:0x0236, B:86:0x0233, B:87:0x01f9, B:88:0x01de, B:91:0x019f, B:94:0x0179, B:95:0x017e), top: B:21:0x0080, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022d A[Catch: all -> 0x0247, TryCatch #2 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0105, B:36:0x010d, B:37:0x0113, B:41:0x011c, B:44:0x0152, B:47:0x0130, B:50:0x013d, B:52:0x0158, B:55:0x00e4, B:57:0x016c, B:60:0x0189, B:64:0x0191, B:66:0x01b6, B:68:0x01cb, B:70:0x01ef, B:71:0x0204, B:74:0x0218, B:76:0x021e, B:77:0x022b, B:79:0x022d, B:81:0x0236, B:86:0x0233, B:87:0x01f9, B:88:0x01de, B:91:0x019f, B:94:0x0179, B:95:0x017e), top: B:21:0x0080, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9 A[Catch: all -> 0x0247, TryCatch #2 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0105, B:36:0x010d, B:37:0x0113, B:41:0x011c, B:44:0x0152, B:47:0x0130, B:50:0x013d, B:52:0x0158, B:55:0x00e4, B:57:0x016c, B:60:0x0189, B:64:0x0191, B:66:0x01b6, B:68:0x01cb, B:70:0x01ef, B:71:0x0204, B:74:0x0218, B:76:0x021e, B:77:0x022b, B:79:0x022d, B:81:0x0236, B:86:0x0233, B:87:0x01f9, B:88:0x01de, B:91:0x019f, B:94:0x0179, B:95:0x017e), top: B:21:0x0080, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        String str;
        int i;
        String str2;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zze().putLong(zzdxh.SCAR_PRELOADER_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String str3 = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(str3)) {
            String zzj = zzj(str3);
            zzbgv zzbgvVar = zzbhe.zzhW;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzj.isEmpty()) {
                int lastIndexOf = str3.lastIndexOf("&request_id=");
                zzj = lastIndexOf != -1 ? str3.substring(lastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(zzj)) {
                return zzgzo.zzc(new zzenv(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzv zzt = this.zzb.zzt();
                zzdxt zzdxtVar = this.zzj;
                String zzb = zzt.zzb(zzj, zzdxtVar);
                String str4 = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && !TextUtils.isEmpty(zzb)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(zzb).optJSONObject("extras");
                        if (optJSONObject != null) {
                            if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhY)).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhZ)).split(",")) : Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(","))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(optJSONObject.optString("query_info_type", "")))) {
                                int lastIndexOf2 = str3.lastIndexOf("&");
                                String substring = lastIndexOf2 != -1 ? str3.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zzj.getBytes(StandardCharsets.UTF_8);
                                        if (!TextUtils.isEmpty(zzb)) {
                                            try {
                                                string = new JSONObject(zzb).getString("arek");
                                            } catch (JSONException e) {
                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                            }
                                            str3 = zzfka.zzb(decode, bytes, string, zzdxtVar);
                                        }
                                        string = null;
                                        str3 = zzfka.zzb(decode, bytes, string, zzdxtVar);
                                    } catch (IllegalArgumentException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    try {
                        str = new JSONObject(str3).optString("render_id", "");
                    } catch (JSONException unused2) {
                        str = "";
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    String str5 = "";
                    try {
                        str5 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                    } catch (IllegalArgumentException e3) {
                        String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "PreloadedLoader.decodeRenderId");
                    }
                    List zze = zzgrr.zza(zzgqq.zzc(AbstractJsonLexerKt.COLON)).zze(str5);
                    if (zze.size() == 2) {
                        str4 = (String) zze.get(0);
                        i = Integer.parseInt((String) zze.get(1));
                        Pair pair = str4 == null ? new Pair(str4, Integer.valueOf(i)) : new Pair("", 0);
                        str2 = (String) pair.first;
                        int intValue = ((Integer) pair.second).intValue();
                        if (!TextUtils.isEmpty(str2) && intValue > 0) {
                            if (!zzt.zzd(zzj, str2)) {
                                return zzgzo.zzc(new zzenv(10, "The ad has already been shown."));
                            }
                        }
                        zzt.zzc(zzj);
                        if (!TextUtils.isEmpty(zzb)) {
                            return zzg(str3, zzi(zzb));
                        }
                    } else {
                        String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                    }
                }
                i = 0;
                if (str4 == null) {
                }
                str2 = (String) pair.first;
                int intValue2 = ((Integer) pair.second).intValue();
                if (!TextUtils.isEmpty(str2)) {
                    if (!zzt.zzd(zzj, str2)) {
                    }
                }
                zzt.zzc(zzj);
                if (!TextUtils.isEmpty(zzb)) {
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhO)).booleanValue()) {
                String str6 = zzcVar.zza;
                String str7 = zzcVar.zzb;
                String zzj2 = zzj(str6);
                String zzj3 = zzj(str7);
                if (TextUtils.isEmpty(zzj3) || !zzj2.equals(zzj3)) {
                    this.zzj.zzc().put("ridmm", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                } else {
                    this.zzb.zzt().zzc(zzj2);
                    this.zzj.zzc().put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, zzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzgzo.zzc(new zzenv(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(zzbsp zzbspVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbspVar.zzb(jSONObject);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject) {
        zzfiz zzfizVar = new zzfiz(this.zze);
        String jSONObject2 = jSONObject.toString();
        return zzgzo.zza(new zzfjc(zzfizVar, zzfjb.zza(new StringReader(jSONObject2), this.zzp)));
    }

    final /* synthetic */ String zzd(zzegy zzegyVar) {
        zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzie)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i2);
                    throw new zzenv(1, sb.toString());
                }
                zzegy zzegyVar2 = zzegyVar;
                zzegz zza2 = new zzeha(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzegyVar);
                zzegz zzegzVar = zza2;
                int i3 = zza2.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i));
                }
                if (i3 == 200) {
                    zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zza2.zzc;
                }
                i++;
                i2 = i3;
            } catch (Exception e) {
                throw new zzenv(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    final /* synthetic */ ListenableFuture zze(List list, Exception exc) {
        zzenv zzenvVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzenvVar = new zzenv(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzenv) {
            zzenvVar = (zzenv) exc;
        } else {
            zzenvVar = new zzenv(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzenvVar.getMessage() == null ? "" : zzenvVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zze = zzgrr.zza(zzgqq.zzc(AbstractJsonLexerKt.COLON)).zze(message);
                    if (zze.size() == 2) {
                        message = (String) zze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfqg.zzd(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgzo.zzc(zzenvVar);
    }

    final /* synthetic */ zzdej zzf() {
        return this.zzl;
    }
}
