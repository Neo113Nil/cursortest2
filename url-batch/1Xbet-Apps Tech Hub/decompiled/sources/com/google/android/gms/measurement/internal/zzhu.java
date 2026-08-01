package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes2.dex */
final class zzhu implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzhw zze;

    zzhu(zzhw zzhwVar, boolean z, Uri uri, String str, String str2) {
        this.zze = zzhwVar;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4 A[Catch: RuntimeException -> 0x0165, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0165, blocks: (B:3:0x0011, B:9:0x008a, B:11:0x0098, B:14:0x00a5, B:16:0x00ab, B:17:0x00c0, B:18:0x00cc, B:23:0x00d4, B:27:0x00fb, B:28:0x0119, B:30:0x0108, B:31:0x0120, B:33:0x0126, B:35:0x012c, B:37:0x0132, B:39:0x0138, B:41:0x0140, B:43:0x0148, B:45:0x014e, B:48:0x0155, B:50:0x002e, B:52:0x0034, B:54:0x003a, B:56:0x0040, B:58:0x0046, B:60:0x004e, B:62:0x0056, B:64:0x005e, B:65:0x006c, B:67:0x0080), top: B:2:0x0011 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle zzs;
        Bundle zzs2;
        zzhw zzhwVar = this.zze;
        boolean z = this.zza;
        Uri uri = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        zzhwVar.zza.zzg();
        try {
            zzlb zzv = zzhwVar.zza.zzt.zzv();
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid")) {
                    zzs = zzv.zzs(Uri.parse("https://google.com/search?".concat(String.valueOf(str2))));
                    if (zzs != null) {
                        zzs.putString("_cis", "referrer");
                    }
                    if (z && (zzs2 = zzhwVar.zza.zzt.zzv().zzs(uri)) != null) {
                        zzs2.putString("_cis", "intent");
                        if (!zzs2.containsKey("gclid") && zzs != null && zzs.containsKey("gclid")) {
                            zzs2.putString("_cer", String.format("gclid=%s", zzs.getString("gclid")));
                        }
                        zzhwVar.zza.zzG(str, "_cmp", zzs2);
                        zzhwVar.zza.zzb.zza(str, zzs2);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        zzhwVar.zza.zzt.zzay().zzc().zzb("Activity created with referrer", str2);
                        if (zzhwVar.zza.zzt.zzf().zzs(null, zzdu.zzY)) {
                            if (zzs != null) {
                                zzhwVar.zza.zzG(str, "_cmp", zzs);
                                zzhwVar.zza.zzb.zza(str, zzs);
                            } else {
                                zzhwVar.zza.zzt.zzay().zzc().zzb("Referrer does not contain valid parameters", str2);
                            }
                            zzhwVar.zza.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true);
                            return;
                        }
                        if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                            zzhwVar.zza.zzt.zzay().zzc().zza("Activity created with data 'referrer' without required params");
                            return;
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            zzhwVar.zza.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str2, true);
                            return;
                        }
                    }
                    return;
                }
                zzv.zzt.zzay().zzc().zza("Activity created with data 'referrer' without required params");
            }
            zzs = null;
            if (z) {
                zzs2.putString("_cis", "intent");
                if (!zzs2.containsKey("gclid")) {
                    zzs2.putString("_cer", String.format("gclid=%s", zzs.getString("gclid")));
                }
                zzhwVar.zza.zzG(str, "_cmp", zzs2);
                zzhwVar.zza.zzb.zza(str, zzs2);
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            zzhwVar.zza.zzt.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
