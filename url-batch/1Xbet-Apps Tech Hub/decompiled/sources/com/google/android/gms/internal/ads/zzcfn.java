package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcfn extends zzcfh implements zzhs {
    private String zzd;
    private final zzcdv zze;
    private boolean zzf;
    private final zzcfm zzg;
    private final zzces zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcfn(zzcdw zzcdwVar, zzcdv zzcdvVar) {
        super(zzcdwVar);
        this.zze = zzcdvVar;
        this.zzg = new zzcfm();
        this.zzh = new zzces();
        this.zzk = new Object();
        this.zzl = (String) zzftu.zzd(zzcdwVar != null ? zzcdwVar.zzbm() : null).zzb("");
        this.zzm = zzcdwVar != null ? zzcdwVar.zzf() : 0;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzcbg.zze(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzs = zzcdn.zzs();
        int zzu = zzcdn.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zza(zzgq zzgqVar, zzgv zzgvVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzb(zzgq zzgqVar, zzgv zzgvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzc(zzgq zzgqVar, zzgv zzgvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd(zzgq zzgqVar, zzgv zzgvVar, boolean z) {
        if (zzgqVar instanceof zzhd) {
            this.zzg.zzb((zzhd) zzgqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:? -> B:51:0x0142). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(String str) {
        String str2;
        String str3;
        this.zzd = str;
        String str4 = "error";
        String zzm = zzm(str);
        int i = 0;
        try {
            zzgy zzgyVar = new zzgy();
            zzgyVar.zzf(this.zzb);
            zzgyVar.zzc(this.zze.zzd);
            zzgyVar.zzd(this.zze.zzf);
            zzgyVar.zzb(true);
            zzgyVar.zze(this);
            zzgq zza = zzgyVar.zza();
            if (this.zze.zzj) {
                zza = new zzceq(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzgv(Uri.parse(str)));
            zzcdw zzcdwVar = (zzcdw) this.zzc.get();
            if (zzcdwVar != null) {
                zzcdwVar.zzt(zzm, this);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzx)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int zza2 = zza.zza(bArr, i, Math.min(this.zzi.remaining(), i2));
                if (zza2 == -1) {
                    break;
                }
                synchronized (this.zzk) {
                    try {
                        if (this.zzf) {
                            str2 = str4;
                        } else {
                            str2 = str4;
                            try {
                                this.zzi.put(bArr, 0, zza2);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzi.remaining() <= 0) {
                                zzv();
                                break;
                            }
                            str3 = 1;
                            try {
                                if (this.zzf) {
                                    throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
                                }
                                long currentTimeMillis2 = zzB.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzv();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                str4 = str2;
                                i = 0;
                                i2 = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                zzcbn.zzj("Failed to preload url " + str + " Exception: " + str5);
                                zzg(str, zzm, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            zzcbn.zzj("Failed to preload url " + str + " Exception: " + str52);
                            zzg(str, zzm, str3, str52);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
    }
}
