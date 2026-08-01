package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfkg {
    public static void zza(ListenableFuture listenableFuture, zzfkh zzfkhVar, zzfjw zzfjwVar) {
        zzg(listenableFuture, zzfkhVar, zzfjwVar, false);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfkh zzfkhVar, zzfjw zzfjwVar) {
        zzg(listenableFuture, zzfkhVar, zzfjwVar, true);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfkh zzfkhVar, zzfjw zzfjwVar) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            zzgbb.zzr(zzgas.zzu(listenableFuture), new zzfkf(zzfkhVar, zzfjwVar), zzcca.zzf);
        }
    }

    public static void zzd(ListenableFuture listenableFuture, zzfjw zzfjwVar) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            zzgbb.zzr(zzgas.zzu(listenableFuture), new zzfkd(zzfjwVar), zzcca.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziD), str);
    }

    public static int zzf(zzfeq zzfeqVar) {
        int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfeqVar) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    private static void zzg(ListenableFuture listenableFuture, zzfkh zzfkhVar, zzfjw zzfjwVar, boolean z) {
        if (((Boolean) zzbeo.zzc.zze()).booleanValue()) {
            zzgbb.zzr(zzgas.zzu(listenableFuture), new zzfke(zzfkhVar, zzfjwVar, z), zzcca.zzf);
        }
    }
}
