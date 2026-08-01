package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaek implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzaej
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzaek.zza;
            return new zzace[]{new zzaek(0)};
        }
    };
    private final byte[] zzb;
    private final zzfj zzc;
    private final zzacm zzd;
    private zzach zze;
    private zzadk zzf;
    private int zzg;
    private zzcb zzh;
    private zzacr zzi;
    private int zzj;
    private int zzk;
    private zzaei zzl;
    private int zzm;
    private long zzn;

    public zzaek() {
        this(0);
    }

    private final long zza(zzfj zzfjVar, boolean z) {
        boolean z2;
        this.zzi.getClass();
        int zzc = zzfjVar.zzc();
        while (zzc <= zzfjVar.zzd() - 16) {
            zzfjVar.zzG(zzc);
            if (zzacn.zzc(zzfjVar, this.zzi, this.zzk, this.zzd)) {
                zzfjVar.zzG(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (!z) {
            zzfjVar.zzG(zzc);
            return -1L;
        }
        while (zzc <= zzfjVar.zzd() - this.zzj) {
            zzfjVar.zzG(zzc);
            try {
                z2 = zzacn.zzc(zzfjVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzfjVar.zzc() <= zzfjVar.zzd() && z2) {
                zzfjVar.zzG(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        zzfjVar.zzG(zzfjVar.zzd());
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn * 1000000;
        zzacr zzacrVar = this.zzi;
        int i = zzfs.zza;
        this.zzf.zzt(j / zzacrVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zze = zzachVar;
        this.zzf = zzachVar.zzw(0, 1);
        zzachVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        zzaco.zza(zzacfVar, false);
        zzfj zzfjVar = new zzfj(4);
        ((zzabu) zzacfVar).zzm(zzfjVar.zzI(), 0, 4, false);
        return zzfjVar.zzt() == 1716281667;
    }

    public zzaek(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfj(new byte[32768], 0);
        this.zzd = new zzacm();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaei zzaeiVar = this.zzl;
            if (zzaeiVar != null) {
                zzaeiVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzD(0);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        boolean zzn;
        zzade zzaddVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzacfVar.zzj();
            long zze = zzacfVar.zze();
            zzcb zza2 = zzaco.zza(zzacfVar, true);
            ((zzabu) zzacfVar).zzo((int) (zzacfVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzabu) zzacfVar).zzm(this.zzb, 0, 42, false);
            zzacfVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzfj zzfjVar = new zzfj(4);
            ((zzabu) zzacfVar).zzn(zzfjVar.zzI(), 0, 4, false);
            if (zzfjVar.zzt() != 1716281667) {
                throw zzcf.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzacr zzacrVar = this.zzi;
            do {
                zzacfVar.zzj();
                zzfi zzfiVar = new zzfi(new byte[4], 4);
                zzabu zzabuVar = (zzabu) zzacfVar;
                zzabuVar.zzm(zzfiVar.zza, 0, 4, false);
                zzn = zzfiVar.zzn();
                int zzd = zzfiVar.zzd(7);
                int zzd2 = zzfiVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzabuVar.zzn(bArr, 0, 38, false);
                    zzacrVar = new zzacr(bArr, 4);
                } else {
                    if (zzacrVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzd == 3) {
                        zzfj zzfjVar2 = new zzfj(zzd2);
                        zzabuVar.zzn(zzfjVar2.zzI(), 0, zzd2, false);
                        zzacrVar = zzacrVar.zzf(zzaco.zzb(zzfjVar2));
                    } else if (zzd == 4) {
                        zzfj zzfjVar3 = new zzfj(zzd2);
                        zzabuVar.zzn(zzfjVar3.zzI(), 0, zzd2, false);
                        zzfjVar3.zzH(4);
                        zzacrVar = zzacrVar.zzg(Arrays.asList(zzadq.zzc(zzfjVar3, false, false).zzb));
                    } else if (zzd == 6) {
                        zzfj zzfjVar4 = new zzfj(zzd2);
                        zzabuVar.zzn(zzfjVar4.zzI(), 0, zzd2, false);
                        zzfjVar4.zzH(4);
                        zzacrVar = zzacrVar.zze(zzfwu.zzm(zzafg.zzb(zzfjVar4)));
                    } else {
                        zzabuVar.zzo(zzd2, false);
                    }
                }
                int i2 = zzfs.zza;
                this.zzi = zzacrVar;
            } while (!zzn);
            zzacrVar.getClass();
            this.zzj = Math.max(zzacrVar.zzc, 6);
            this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzacfVar.zzj();
            zzfj zzfjVar5 = new zzfj(2);
            ((zzabu) zzacfVar).zzm(zzfjVar5.zzI(), 0, 2, false);
            int zzp = zzfjVar5.zzp();
            if ((zzp >> 2) != 16382) {
                zzacfVar.zzj();
                throw zzcf.zza("First frame does not start with sync code.", null);
            }
            zzacfVar.zzj();
            this.zzk = zzp;
            zzach zzachVar = this.zze;
            int i3 = zzfs.zza;
            long zzf = zzacfVar.zzf();
            long zzd3 = zzacfVar.zzd();
            zzacr zzacrVar2 = this.zzi;
            zzacrVar2.getClass();
            if (zzacrVar2.zzk != null) {
                zzaddVar = new zzacp(zzacrVar2, zzf);
            } else if (zzd3 == -1 || zzacrVar2.zzj <= 0) {
                zzaddVar = new zzadd(zzacrVar2.zza(), 0L);
            } else {
                zzaei zzaeiVar = new zzaei(zzacrVar2, this.zzk, zzf, zzd3);
                this.zzl = zzaeiVar;
                zzaddVar = zzaeiVar.zzb();
            }
            zzachVar.zzO(zzaddVar);
            this.zzg = 5;
            return 0;
        }
        this.zzf.getClass();
        zzacr zzacrVar3 = this.zzi;
        zzacrVar3.getClass();
        zzaei zzaeiVar2 = this.zzl;
        if (zzaeiVar2 != null && zzaeiVar2.zze()) {
            return zzaeiVar2.zza(zzacfVar, zzadbVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzacn.zzb(zzacfVar, zzacrVar3);
            return 0;
        }
        zzfj zzfjVar6 = this.zzc;
        int zzd4 = zzfjVar6.zzd();
        if (zzd4 < 32768) {
            int zza3 = zzacfVar.zza(zzfjVar6.zzI(), zzd4, 32768 - zzd4);
            z = zza3 == -1;
            if (!z) {
                this.zzc.zzF(zzd4 + zza3);
            } else if (this.zzc.zza() == 0) {
                zzf();
                return -1;
            }
        } else {
            z = false;
        }
        zzfj zzfjVar7 = this.zzc;
        int zzc = zzfjVar7.zzc();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzfjVar7.zzH(Math.min(i5 - i4, zzfjVar7.zza()));
        }
        long zza4 = zza(this.zzc, z);
        zzfj zzfjVar8 = this.zzc;
        int zzc2 = zzfjVar8.zzc() - zzc;
        zzfjVar8.zzG(zzc);
        zzadi.zzb(this.zzf, this.zzc, zzc2);
        this.zzm += zzc2;
        if (zza4 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = zza4;
        }
        zzfj zzfjVar9 = this.zzc;
        if (zzfjVar9.zza() >= 16) {
            return 0;
        }
        int zza5 = zzfjVar9.zza();
        System.arraycopy(zzfjVar9.zzI(), zzfjVar9.zzc(), zzfjVar9.zzI(), 0, zza5);
        this.zzc.zzG(0);
        this.zzc.zzF(zza5);
        return 0;
    }
}
