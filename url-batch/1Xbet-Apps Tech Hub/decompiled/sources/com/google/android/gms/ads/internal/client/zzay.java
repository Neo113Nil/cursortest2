package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbt;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzcbg zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzcbt zze;
    private final Random zzf;

    protected zzay() {
        zzcbg zzcbgVar = new zzcbg();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbih(), new zzbxv(), new zzbtm(), new zzbii());
        String zzd = zzcbg.zzd();
        zzcbt zzcbtVar = new zzcbt(0, 234310000, true, false, false);
        Random random = new Random();
        this.zzb = zzcbgVar;
        this.zzc = zzawVar;
        this.zzd = zzd;
        this.zze = zzcbtVar;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzcbg zzb() {
        return zza.zzb;
    }

    public static zzcbt zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
