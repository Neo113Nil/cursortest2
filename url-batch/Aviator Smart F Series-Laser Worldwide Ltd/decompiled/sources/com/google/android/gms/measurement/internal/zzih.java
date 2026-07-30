package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.measurement.zzqx;

/* loaded from: classes3.dex */
final class zzih implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzii zze;

    zzih(zzii zziiVar, boolean z7, Uri uri, String str, String str2) {
        this.zze = zziiVar;
        this.zza = z7;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[Catch: RuntimeException -> 0x007c, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x007c, blocks: (B:3:0x0011, B:9:0x00a6, B:11:0x00c4, B:14:0x00d1, B:16:0x00d7, B:17:0x00ec, B:18:0x00f8, B:23:0x0100, B:27:0x0128, B:28:0x0146, B:30:0x0135, B:31:0x014e, B:33:0x0154, B:35:0x015a, B:37:0x0160, B:39:0x0166, B:41:0x016e, B:43:0x0176, B:45:0x017c, B:48:0x0183, B:50:0x003f, B:52:0x0045, B:54:0x004b, B:56:0x0051, B:58:0x0057, B:60:0x005f, B:62:0x0067, B:65:0x0071, B:69:0x007f, B:70:0x008d, B:72:0x009d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6 A[Catch: RuntimeException -> 0x007c, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x007c, blocks: (B:3:0x0011, B:9:0x00a6, B:11:0x00c4, B:14:0x00d1, B:16:0x00d7, B:17:0x00ec, B:18:0x00f8, B:23:0x0100, B:27:0x0128, B:28:0x0146, B:30:0x0135, B:31:0x014e, B:33:0x0154, B:35:0x015a, B:37:0x0160, B:39:0x0166, B:41:0x016e, B:43:0x0176, B:45:0x017c, B:48:0x0183, B:50:0x003f, B:52:0x0045, B:54:0x004b, B:56:0x0051, B:58:0x0057, B:60:0x005f, B:62:0x0067, B:65:0x0071, B:69:0x007f, B:70:0x008d, B:72:0x009d), top: B:2:0x0011 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle zzs;
        zzii zziiVar = this.zze;
        boolean z7 = this.zza;
        Uri uri = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        zziiVar.zza.zzg();
        try {
            zzlo zzv = zziiVar.zza.zzt.zzv();
            zzqx.zzc();
            zzag zzf = zziiVar.zza.zzt.zzf();
            zzeg zzegVar = zzeh.zzav;
            boolean zzs2 = zzf.zzs(null, zzegVar);
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                    if (zzs2 && str2.contains("sfmc_id")) {
                        zzs2 = true;
                    }
                    zzv.zzt.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                }
                zzs = zzv.zzs(Uri.parse("https://google.com/search?".concat(str2)), zzs2);
                if (zzs != null) {
                    zzs.putString("_cis", "referrer");
                }
                if (z7) {
                    zzlo zzv2 = zziiVar.zza.zzt.zzv();
                    zzqx.zzc();
                    Bundle zzs3 = zzv2.zzs(uri, zziiVar.zza.zzt.zzf().zzs(null, zzegVar));
                    if (zzs3 != null) {
                        zzs3.putString("_cis", "intent");
                        if (!zzs3.containsKey("gclid") && zzs != null && zzs.containsKey("gclid")) {
                            zzs3.putString("_cer", String.format("gclid=%s", zzs.getString("gclid")));
                        }
                        zziiVar.zza.zzG(str, "_cmp", zzs3);
                        zziiVar.zza.zzb.zza(str, zzs3);
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    zziiVar.zza.zzt.zzaA().zzc().zzb("Activity created with referrer", str2);
                    if (zziiVar.zza.zzt.zzf().zzs(null, zzeh.zzaa)) {
                        if (zzs != null) {
                            zziiVar.zza.zzG(str, "_cmp", zzs);
                            zziiVar.zza.zzb.zza(str, zzs);
                        } else {
                            zziiVar.zza.zzt.zzaA().zzc().zzb("Referrer does not contain valid parameters", str2);
                        }
                        zziiVar.zza.zzW(TtmlNode.TEXT_EMPHASIS_AUTO, "_ldl", null, true);
                        return;
                    }
                    if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                        zziiVar.zza.zzt.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                        return;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        zziiVar.zza.zzW(TtmlNode.TEXT_EMPHASIS_AUTO, "_ldl", str2, true);
                        return;
                    }
                }
                return;
            }
            zzs = null;
            if (z7) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e8) {
            zziiVar.zza.zzt.zzaA().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e8);
        }
    }
}
