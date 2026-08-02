package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzanz implements zzack {
    private zzacn zza;
    private zzadp zzb;
    private zzanx zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        int zzl;
        zzdi.zzb(this.zzb);
        int i = zzet.zza;
        int i2 = this.zzc;
        if (i2 == 0) {
            zzdi.zzf(zzaclVar.zzf() == 0);
            int i3 = this.zzf;
            if (i3 != -1) {
                ((zzaby) zzaclVar).zzo(i3, false);
                this.zzc = 4;
            } else {
                if (!zzaoc.zzc(zzaclVar)) {
                    throw zzbo.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzaby) zzaclVar).zzo((int) (zzaclVar.zze() - zzaclVar.zzf()), false);
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            zzek zzekVar = new zzek(8);
            zzaob zza = zzaob.zza(zzaclVar, zzekVar);
            if (zza.zza != 1685272116) {
                zzaclVar.zzj();
            } else {
                zzaby zzabyVar = (zzaby) zzaclVar;
                zzabyVar.zzl(8, false);
                zzekVar.zzK(0);
                zzabyVar.zzm(zzekVar.zzM(), 0, 8, false);
                j = zzekVar.zzr();
                zzabyVar.zzo(((int) zza.zzb) + 8, false);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzaoa zzb = zzaoc.zzb(zzaclVar);
            int i4 = zzb.zza;
            if (i4 == 17) {
                this.zze = new zzanw(this.zza, this.zzb, zzb);
            } else if (i4 == 6) {
                this.zze = new zzany(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i4 == 7) {
                this.zze = new zzany(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
            } else {
                int i5 = zzb.zze;
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i5 == 32) {
                            zzl = 4;
                            if (zzl == 0) {
                                throw zzbo.zzc("Unsupported WAV format type: " + i4);
                            }
                            this.zze = new zzany(this.zza, this.zzb, zzb, "audio/raw", zzl);
                        }
                    }
                    zzl = 0;
                    if (zzl == 0) {
                    }
                }
                zzl = zzet.zzl(i5);
                if (zzl == 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzdi.zzf(this.zzg != -1);
            long zzf = this.zzg - zzaclVar.zzf();
            zzanx zzanxVar = this.zze;
            zzanxVar.getClass();
            return zzanxVar.zzc(zzaclVar, zzf) ? -1 : 0;
        }
        Pair zza2 = zzaoc.zza(zzaclVar);
        this.zzf = ((Long) zza2.first).intValue();
        long longValue = ((Long) zza2.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzf + longValue;
        this.zzg = j3;
        long zzd = zzaclVar.zzd();
        if (zzd != -1 && j3 > zzd) {
            zzea.zzf("WavExtractor", "Data exceeds input length: " + j3 + ", " + zzd);
            this.zzg = zzd;
            j3 = zzd;
        }
        zzanx zzanxVar2 = this.zze;
        zzanxVar2.getClass();
        zzanxVar2.zza(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zza = zzacnVar;
        this.zzb = zzacnVar.zzw(0, 1);
        zzacnVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzanx zzanxVar = this.zze;
        if (zzanxVar != null) {
            zzanxVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        return zzaoc.zzc(zzaclVar);
    }
}
