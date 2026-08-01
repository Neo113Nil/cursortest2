package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcfq extends zzcfh implements zzcdm {
    public static final /* synthetic */ int zzd = 0;
    private zzcdn zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcez zzi;
    private long zzj;
    private long zzk;

    public zzcfq(zzcdw zzcdwVar, zzcdv zzcdvVar) {
        super(zzcdwVar);
        zzcgi zzcgiVar = new zzcgi(zzcdwVar.getContext(), zzcdvVar, (zzcdw) this.zzc.get(), null);
        zzcbn.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcgiVar;
        zzcgiVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzcbg.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
            @Override // java.lang.Runnable
            public final void run() {
                zzcfq.this.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcfh, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcdn zzcdnVar = this.zze;
        if (zzcdnVar != null) {
            zzcdnVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzD(int i, int i2) {
    }

    public final zzcdn zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcdn zzcdnVar = this.zze;
        this.zze = null;
        return zzcdnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcfh, com.google.android.gms.internal.ads.zzcfq] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcfq] */
    /* JADX WARN: Type inference failed for: r3v31 */
    final /* synthetic */ void zzb() {
        String str;
        zzcfq zzcfqVar;
        zzcfq zzcfqVar2;
        ?? longValue;
        long intValue;
        zzcfq zzcfqVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzc = zzc(this.zzf);
        String str3 = "error";
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzx)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzw)).intValue();
            zzcfqVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzcfqVar = this;
        }
        synchronized (this) {
            try {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
                long j4 = this.zzj;
                if (currentTimeMillis - j4 <= longValue) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzz = this.zze.zzz();
                            if (zzz > 0) {
                                long zzv = this.zze.zzv();
                                if (zzv != this.zzk) {
                                    try {
                                        j2 = intValue;
                                        str2 = zzc;
                                        try {
                                            zzo(this.zzf, zzc, zzv, zzz, zzv > 0, zzcfqVar != 0 ? this.zze.zzA() : -1L, zzcfqVar != 0 ? this.zze.zzx() : -1L, zzcfqVar != 0 ? this.zze.zzB() : -1L, zzcdn.zzs(), zzcdn.zzu());
                                            zzcfqVar = this;
                                            j = zzv;
                                            try {
                                                zzcfqVar.zzk = j;
                                                j3 = zzz;
                                                zzcfqVar = zzcfqVar;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzcfqVar = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzcfqVar = this;
                                        str = zzc;
                                    }
                                } else {
                                    j = zzv;
                                    j2 = intValue;
                                    str2 = zzc;
                                    zzcfqVar = this;
                                    j3 = zzz;
                                }
                                if (j >= j3) {
                                    zzcfqVar.zzj(zzcfqVar.zzf, str2, j3);
                                    zzcfqVar2 = zzcfqVar;
                                } else {
                                    long zzw = zzcfqVar.zze.zzw();
                                    zzcfqVar3 = zzcfqVar;
                                    if (zzw >= j2) {
                                        zzcfqVar3 = zzcfqVar;
                                        if (j > 0) {
                                            zzcfqVar2 = zzcfqVar;
                                        }
                                    }
                                }
                            } else {
                                zzcfqVar3 = this;
                            }
                            zzcfqVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzy)).longValue());
                            return;
                        }
                        zzcfqVar2 = this;
                        com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcfqVar2.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = longValue;
                        str = j4;
                    }
                } else {
                    str = zzc;
                    zzcfqVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) longValue) + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc;
                zzcfqVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                zzcbn.zzj("Failed to preload url " + zzcfqVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcfqVar.zzg(zzcfqVar.zzf, str, str4, zzd(str4, e));
                zzcfqVar2 = zzcfqVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcfqVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzi(final boolean z, final long j) {
        final zzcdw zzcdwVar = (zzcdw) this.zzc.get();
        if (zzcdwVar != null) {
            zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcfq.zzd;
                    zzcdw.this.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzk(String str, Exception exc) {
        zzcbn.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzl(String str, Exception exc) {
        zzcbn.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcfh] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcfh
    public final boolean zzu(String str, String[] strArr) {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str3;
        long j5;
        long j6;
        long j7;
        zzcfq zzcfqVar = this;
        String str4 = str;
        zzcfqVar.zzf = str4;
        String str5 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcfqVar.zze.zzF(uriArr, zzcfqVar.zzb);
            zzcdw zzcdwVar = (zzcdw) zzcfqVar.zzc.get();
            if (zzcdwVar != null) {
                zzcdwVar.zzt(zzc, zzcfqVar);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzx)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue();
            long j8 = -1;
            long j9 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (zzcfqVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcfqVar.zzh) {
                            break;
                        }
                        if (!zzcfqVar.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzz = zzcfqVar.zze.zzz();
                        if (zzz > 0) {
                            long zzv = zzcfqVar.zze.zzv();
                            if (zzv != j8) {
                                try {
                                    j = j9;
                                    j7 = zzz;
                                    j2 = longValue2;
                                    j4 = longValue;
                                    str3 = zzc;
                                } catch (Throwable th) {
                                    th = th;
                                    r5 = this;
                                    r6 = str;
                                    str2 = zzc;
                                }
                                try {
                                    zzo(str, zzc, zzv, j7, zzv > 0, booleanValue ? zzcfqVar.zze.zzA() : -1L, booleanValue ? zzcfqVar.zze.zzx() : -1L, booleanValue ? zzcfqVar.zze.zzB() : -1L, zzcdn.zzs(), zzcdn.zzu());
                                    j6 = zzv;
                                    j5 = zzz;
                                    r6 = j7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r5 = this;
                                    r6 = str;
                                    str2 = str3;
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        String str6 = str5;
                                        zzcbn.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                        com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        r5.zzg(r6, str2, str6, zzd(str6, e));
                                        return false;
                                    }
                                }
                            } else {
                                j = j9;
                                j2 = longValue2;
                                j4 = longValue;
                                str3 = zzc;
                                j5 = zzz;
                                j6 = j8;
                                r6 = j9;
                            }
                            r5 = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzj(str, str3, j5);
                            } else {
                                try {
                                    zzcfq zzcfqVar2 = this;
                                    r6 = str;
                                    str2 = str3;
                                    if (zzcfqVar2.zze.zzw() < j || zzv <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzcfqVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            j = j9;
                            j2 = longValue2;
                            r6 = str4;
                            str2 = zzc;
                            r5 = zzcfqVar;
                            j3 = longValue;
                            r1 = j8;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str5 = r1;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = str4;
                        str2 = zzc;
                        r5 = zzcfqVar;
                    }
                }
                longValue = j3;
                zzcfqVar = r5;
                str4 = r6;
                zzc = str2;
                j9 = j;
                longValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = str4;
            str2 = zzc;
            r5 = zzcfqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzv() {
        zzcbn.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final boolean zzw(String str, String[] strArr, zzcez zzcezVar) {
        this.zzf = str;
        this.zzi = zzcezVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcdw zzcdwVar = (zzcdw) this.zzc.get();
            if (zzcdwVar != null) {
                zzcdwVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            zzcbn.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e));
            return false;
        }
    }
}
