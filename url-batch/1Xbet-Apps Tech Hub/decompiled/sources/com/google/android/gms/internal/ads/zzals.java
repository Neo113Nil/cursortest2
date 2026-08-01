package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzals implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzalo
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzals.zza;
            return new zzace[]{new zzals()};
        }
    };
    private zzach zzb;
    private zzadk zzc;
    private zzalq zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r2 == 32) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        int i;
        zzef.zzb(this.zzc);
        int i2 = zzfs.zza;
        int i3 = this.zzd;
        int i4 = 4;
        if (i3 == 0) {
            zzef.zzf(zzacfVar.zzf() == 0);
            int i5 = this.zzg;
            if (i5 != -1) {
                ((zzabu) zzacfVar).zzo(i5, false);
                this.zzd = 4;
            } else {
                if (!zzalv.zzc(zzacfVar)) {
                    throw zzcf.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzabu) zzacfVar).zzo((int) (zzacfVar.zze() - zzacfVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long j = -1;
        if (i3 == 1) {
            zzfj zzfjVar = new zzfj(8);
            zzalu zza2 = zzalu.zza(zzacfVar, zzfjVar);
            if (zza2.zza != 1685272116) {
                zzacfVar.zzj();
            } else {
                zzabu zzabuVar = (zzabu) zzacfVar;
                zzabuVar.zzl(8, false);
                zzfjVar.zzG(0);
                zzabuVar.zzm(zzfjVar.zzI(), 0, 8, false);
                j = zzfjVar.zzq();
                zzabuVar.zzo(((int) zza2.zzb) + 8, false);
            }
            this.zze = j;
            this.zzd = 2;
            return 0;
        }
        if (i3 == 2) {
            zzalt zzb = zzalv.zzb(zzacfVar);
            int i6 = zzb.zza;
            if (i6 == 17) {
                this.zzf = new zzalp(this.zzb, this.zzc, zzb);
            } else if (i6 == 6) {
                this.zzf = new zzalr(this.zzb, this.zzc, zzb, "audio/g711-alaw", -1);
            } else if (i6 == 7) {
                this.zzf = new zzalr(this.zzb, this.zzc, zzb, "audio/g711-mlaw", -1);
            } else {
                int i7 = zzb.zze;
                if (i6 != 1) {
                    if (i6 != 3) {
                    }
                    i = 0;
                    if (i != 0) {
                        throw zzcf.zzc("Unsupported WAV format type: " + i6);
                    }
                    this.zzf = new zzalr(this.zzb, this.zzc, zzb, "audio/raw", i);
                }
                i4 = zzfs.zzk(i7);
                i = i4;
                if (i != 0) {
                }
            }
            this.zzd = 3;
            return 0;
        }
        if (i3 != 3) {
            zzef.zzf(this.zzh != -1);
            long zzf = this.zzh - zzacfVar.zzf();
            zzalq zzalqVar = this.zzf;
            zzalqVar.getClass();
            return zzalqVar.zzc(zzacfVar, zzf) ? -1 : 0;
        }
        Pair zza3 = zzalv.zza(zzacfVar);
        this.zzg = ((Long) zza3.first).intValue();
        long longValue = ((Long) zza3.second).longValue();
        long j2 = this.zze;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzg + longValue;
        this.zzh = j3;
        long zzd = zzacfVar.zzd();
        if (zzd != -1 && j3 > zzd) {
            zzez.zzf("WavExtractor", "Data exceeds input length: " + j3 + ", " + zzd);
            this.zzh = zzd;
            j3 = zzd;
        }
        zzalq zzalqVar2 = this.zzf;
        zzalqVar2.getClass();
        zzalqVar2.zza(this.zzg, j3);
        this.zzd = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzb = zzachVar;
        this.zzc = zzachVar.zzw(0, 1);
        zzachVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzalq zzalqVar = this.zzf;
        if (zzalqVar != null) {
            zzalqVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        return zzalv.zzc(zzacfVar);
    }
}
