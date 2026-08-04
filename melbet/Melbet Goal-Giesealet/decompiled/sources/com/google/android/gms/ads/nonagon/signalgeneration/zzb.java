package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzdru;
import com.google.android.gms.internal.ads.zzfti;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzftn;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    private final PackageInfo zze;

    zzb(Context context, long j, PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static String zzc(String str) {
        return str == null ? "" : com.google.android.gms.ads.internal.util.zzs.zzl(str, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
    }

    private final boolean zze() {
        return this.zzb.zzj().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzic)).intValue();
    }

    private static final void zzf(Bundle bundle, zzdru zzdruVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzid)).booleanValue()) {
            bundle.putLong(zzdruVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private static final void zzg(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(String str, zzbj zzbjVar) {
        String jSONObject;
        String str2;
        if (TextUtils.isEmpty(str) || zze()) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("params", zzbjVar.zza);
            jSONObject3.put("signal_dictionary", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzbjVar.zzf));
            jSONObject2.put("sr", jSONObject3);
            str2 = zzbjVar.zzc;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DiskCachingManager.createStringToWrite");
        }
        if (TextUtils.isEmpty(str2)) {
            jSONObject = "";
            if (TextUtils.isEmpty(jSONObject)) {
                this.zzb.zza(str, jSONObject);
                return;
            }
            return;
        }
        jSONObject2.put("rs", Base64.encodeToString(zzc(str2).getBytes(StandardCharsets.UTF_8), 10));
        jSONObject2.put("ts_ms", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        jSONObject = jSONObject2.toString();
        if (TextUtils.isEmpty(jSONObject)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:20|21|22|(1:24)(7:31|32|33|(1:35)|37|(1:42)(2:39|(1:41))|29)|25|26|28|29|18) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010a, code lost:
    
        if (r12.zzb() > r10) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbj zzb(zzbyi zzbyiVar, final zzau zzauVar, Bundle bundle) {
        zzbj zzbjVar;
        zzbj zzbjVar2;
        long j;
        zzf(bundle, zzdru.SIGNAL_ON_DISK_VALIDATION_START);
        zzbj zzbjVar3 = null;
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx()) {
            this.zzb.zzi();
            zzg(bundle, 7);
        } else {
            PackageInfo packageInfo = this.zze;
            if (packageInfo != null) {
                zzd zzdVar = this.zzb;
                Context context = this.zza;
                String zze = zzdVar.zze();
                int zzf = zzdVar.zzf();
                String zzg = zzdVar.zzg();
                int zzh = zzdVar.zzh();
                if (TextUtils.equals(context.getApplicationInfo().packageName, zze) && zzf == packageInfo.versionCode && TextUtils.equals(Build.MODEL, zzg) && zzh == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : zzdVar.zzj().entrySet()) {
                        try {
                            j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                        } catch (IOException | JSONException unused) {
                            zzbjVar2 = zzbjVar3;
                        }
                        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzib)).longValue()) {
                            zzbjVar2 = zzbjVar3;
                        } else {
                            zzfti zzi = zzftm.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdG)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            zzbjVar2 = zzbjVar3;
                            zzfti zzi2 = zzftn.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdH)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            if (zzi.zzb() != -1) {
                            }
                            if (zzi2.zzb() != -1) {
                                if (zzi2.zzb() <= j) {
                                }
                            }
                            zzbjVar3 = zzbjVar2;
                        }
                        zzdVar.zzb((String) entry.getKey());
                        zzbjVar3 = zzbjVar2;
                    }
                    zzbjVar = zzbjVar3;
                } else {
                    zzbjVar = null;
                    zzdVar.zzi();
                    zzdVar.zzd(context.getApplicationInfo().packageName, packageInfo.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                zzf(bundle, zzdru.SIGNAL_ON_DISK_VALIDATION_END);
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzc > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhY)).longValue()) {
                    zzg(bundle, 2);
                    return zzbjVar;
                }
                zzf(bundle, zzdru.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = zzbyiVar.zza;
                String str2 = zzbyiVar.zzb;
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyiVar.zzd;
                String bundle2 = zzmVar.zzn.toString();
                String bundle3 = zzmVar.zzc.toString();
                String str3 = zzmVar.zzi;
                String str4 = zzmVar.zzp;
                String valueOf = String.valueOf(zzmVar.zzo);
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                int length3 = String.valueOf(bundle2).length();
                int length4 = String.valueOf(bundle3).length();
                StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(str2);
                sb.append(bundle2);
                sb.append(bundle3);
                sb.append(str3);
                sb.append(str4);
                sb.append(valueOf);
                final String zzg2 = com.google.android.gms.ads.internal.util.client.zzf.zzg(sb.toString());
                if (TextUtils.isEmpty(zzg2)) {
                    zzg(bundle, 3);
                    return zzbjVar;
                }
                zzf(bundle, zzdru.SIGNAL_ON_DISK_CACHE_KEY_END);
                zzf(bundle, zzdru.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String zzb = this.zzb.zzb(zzg2);
                zzf(bundle, zzdru.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!zze()) {
                    final zzbyi zzbyiVar2 = new zzbyi(str, str2, zzbyiVar.zzc, zzmVar, 2, zzg2);
                    this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzb.this.zzd(zzg2, zzauVar, zzbyiVar2);
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzia)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(zzb)) {
                    zzg(bundle, 4);
                    return zzbjVar;
                }
                zzf(bundle, zzdru.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(zzb);
                    String string = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string)) {
                        zzg(bundle, 8);
                        return zzbjVar;
                    }
                    String string2 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string2)) {
                        zzg(bundle, 9);
                        return zzbjVar;
                    }
                    String zzc = zzc(new String(Base64.decode(string2, 10), StandardCharsets.UTF_8));
                    zzf(bundle, zzdru.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        zzbj zzbjVar4 = new zzbj(new JsonReader(new StringReader(string)), zzbjVar);
                        zzbjVar4.zzc = zzc;
                        zzbjVar4.zze = bundle;
                        bundle.putBoolean("sod_h", true);
                        return zzbjVar4;
                    } catch (IOException e) {
                        zzg(bundle, 6);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e2) {
                    zzg(bundle, 5);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.zzb.zzi();
            zzg(bundle, 10);
        }
        return null;
    }

    final /* synthetic */ void zzd(String str, zzau zzauVar, zzbyi zzbyiVar) {
        if (this.zzb.zzc(str) || zze()) {
            return;
        }
        zzauVar.zze(ObjectWrapper.wrap(this.zza), zzbyiVar, null);
    }
}
