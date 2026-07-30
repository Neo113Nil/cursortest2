package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaqk implements zzaeu {
    private zzaex zza;
    private zzagh zzb;
    private zzaqh zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = zzaqj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzaqn.zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
        this.zzb = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        if (r2 == 32) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i;
        this.zzb.getClass();
        String str = zzfj.zza;
        int i2 = this.zzc;
        int i3 = 4;
        if (i2 == 0) {
            zzgrc.zzi(zzaevVar.zzn() == 0);
            int i4 = this.zzf;
            if (i4 != -1) {
                zzaevVar.zzf(i4);
                this.zzc = 4;
            } else {
                if (!zzaqn.zza(zzaevVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            int i5 = zzaqn.zza;
            zzer zzerVar = new zzer(8);
            zzaqm zza = zzaqm.zza(zzaevVar, zzerVar);
            if (zza.zza != 1685272116) {
                zzaevVar.zzl();
            } else {
                zzaevVar.zzk(8);
                zzerVar.zzh(0);
                zzaevVar.zzi(zzerVar.zzi(), 0, 8);
                j = zzerVar.zzE();
                zzaevVar.zzf(((int) zza.zzb) + 8);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzaql zzb = zzaqn.zzb(zzaevVar);
            int i6 = zzb.zza;
            if (i6 == 17) {
                this.zze = new zzaqg(this.zza, this.zzb, zzb);
            } else if (i6 == 6) {
                this.zze = new zzaqi(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i6 == 7) {
                this.zze = new zzaqi(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
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
                        throw zzat.zzc(sb.toString());
                    }
                    this.zze = new zzaqi(this.zza, this.zzb, zzb, "audio/raw", i);
                }
                i3 = zzfj.zzz(i7, ByteOrder.LITTLE_ENDIAN);
                i = i3;
                if (i != 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzgrc.zzi(this.zzg != -1);
            long zzn = this.zzg - zzaevVar.zzn();
            zzaqh zzaqhVar = this.zze;
            zzaqhVar.getClass();
            return zzaqhVar.zzc(zzaevVar, zzn) ? -1 : 0;
        }
        Pair zzc = zzaqn.zzc(zzaevVar);
        this.zzf = ((Long) zzc.first).intValue();
        long longValue = ((Long) zzc.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzf + longValue;
        this.zzg = j3;
        long zzo = zzaevVar.zzo();
        if (zzo != -1 && j3 > zzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(zzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(zzo);
            zzee.zzc("WavExtractor", sb2.toString());
            this.zzg = zzo;
            j3 = zzo;
        }
        zzaqh zzaqhVar2 = this.zze;
        zzaqhVar2.getClass();
        zzaqhVar2.zzb(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzaqh zzaqhVar = this.zze;
        if (zzaqhVar != null) {
            zzaqhVar.zza(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
