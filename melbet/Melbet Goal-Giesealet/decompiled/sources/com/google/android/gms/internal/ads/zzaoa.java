package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaoa implements zzacu {
    private zzacx zza;
    private zzaeb zzb;
    private zzanx zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = zzanz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zzaod.zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza = zzacxVar;
        this.zzb = zzacxVar.zzu(0, 1);
        zzacxVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        if (r2 == 32) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        int i;
        this.zzb.getClass();
        String str = zzeo.zza;
        int i2 = this.zzc;
        int i3 = 4;
        if (i2 == 0) {
            zzghc.zzh(zzacvVar.zzn() == 0);
            int i4 = this.zzf;
            if (i4 != -1) {
                zzacvVar.zzf(i4);
                this.zzc = 4;
            } else {
                if (!zzaod.zza(zzacvVar)) {
                    throw zzas.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            int i5 = zzaod.zza;
            zzef zzefVar = new zzef(8);
            zzaoc zza = zzaoc.zza(zzacvVar, zzefVar);
            if (zza.zza != 1685272116) {
                zzacvVar.zzl();
            } else {
                zzacvVar.zzk(8);
                zzefVar.zzh(0);
                zzacvVar.zzi(zzefVar.zzi(), 0, 8);
                j = zzefVar.zzE();
                zzacvVar.zzf(((int) zza.zzb) + 8);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzaob zzb = zzaod.zzb(zzacvVar);
            int i6 = zzb.zza;
            if (i6 == 17) {
                this.zze = new zzanw(this.zza, this.zzb, zzb);
            } else if (i6 == 6) {
                this.zze = new zzany(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i6 == 7) {
                this.zze = new zzany(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
            } else {
                int i7 = zzb.zze;
                if (i6 != 1) {
                    if (i6 != 3) {
                    }
                    i = 0;
                    if (i != 0) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 29);
                        sb.append("Unsupported WAV format type: ");
                        sb.append(i6);
                        throw zzas.zzc(sb.toString());
                    }
                    this.zze = new zzany(this.zza, this.zzb, zzb, "audio/raw", i);
                }
                i3 = zzeo.zzz(i7, ByteOrder.LITTLE_ENDIAN);
                i = i3;
                if (i != 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzghc.zzh(this.zzg != -1);
            long zzn = this.zzg - zzacvVar.zzn();
            zzanx zzanxVar = this.zze;
            zzanxVar.getClass();
            return zzanxVar.zzc(zzacvVar, zzn) ? -1 : 0;
        }
        Pair zzc = zzaod.zzc(zzacvVar);
        this.zzf = ((Long) zzc.first).intValue();
        long longValue = ((Long) zzc.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzf + longValue;
        this.zzg = j3;
        long zzo = zzacvVar.zzo();
        if (zzo != -1 && j3 > zzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(zzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(zzo);
            zzds.zzc("WavExtractor", sb2.toString());
            this.zzg = zzo;
            j3 = zzo;
        }
        zzanx zzanxVar2 = this.zze;
        zzanxVar2.getClass();
        zzanxVar2.zzb(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzanx zzanxVar = this.zze;
        if (zzanxVar != null) {
            zzanxVar.zza(j2);
        }
    }
}
