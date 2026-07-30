package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzghi {
    private final Context zza;
    private final zzgoe zzb;
    private final zzgfe zzc;
    private final String zzd;

    zzghi(Context context, zzgoe zzgoeVar, zzgfe zzgfeVar, zzgbf zzgbfVar) {
        this.zza = context;
        this.zzb = zzgoeVar;
        this.zzc = zzgfeVar;
        this.zzd = zzgbfVar.zzb();
    }

    public final String zza(boolean z, long j) {
        String num;
        zzgoc zza = this.zzb.zza(55);
        try {
            try {
                zza.zza();
                zzaxp zza2 = zzaxq.zza();
                zza2.zzb(this.zzd);
                zza2.zza("0.825731049");
                zza2.zzd(this.zza.getPackageName());
                zza2.zzc(System.currentTimeMillis() / 1000);
                zza2.zzf((System.currentTimeMillis() - j) / 1000);
                try {
                    zza2.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                    zza2.zze(-1L);
                }
                zzgfe zzgfeVar = this.zzc;
                if (!zzgfeVar.zzc()) {
                    zzgfeVar.zza();
                }
                zzaxw zzf = zzgfeVar.zzf(((zzaxq) zza2.zzbu()).zzaN(), null);
                zzf.zzc(5);
                zzf.zzd(2);
                num = zzgca.zza(((zzaxx) zzf.zzbu()).zzaN(), true);
            } finally {
                zza.zzc();
            }
        } catch (UnsupportedEncodingException e) {
            zza.zzb(e);
            num = Integer.toString(7);
        } catch (Throwable th) {
            zza.zzb(th);
            throw th;
        }
        return num;
    }
}
