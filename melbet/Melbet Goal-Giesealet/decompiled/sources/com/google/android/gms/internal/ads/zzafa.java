package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzafa implements zzacu {
    private final byte[] zza;
    private final zzef zzb;
    private final zzadb zzc;
    private zzacx zzd;
    private zzaeb zze;
    private int zzf;
    private zzao zzg;
    private zzadh zzh;
    private int zzi;
    private int zzj;
    private zzaey zzk;
    private int zzl;
    private long zzm;

    static {
        int i = zzaez.zza;
    }

    public zzafa() {
        throw null;
    }

    public zzafa(int i) {
        this.zza = new byte[42];
        this.zzb = new zzef(new byte[32768], 0);
        this.zzc = new zzadb();
        this.zzf = 0;
    }

    private final long zza(zzef zzefVar, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzg = zzefVar.zzg();
        while (zzg <= zzefVar.zze() - 16) {
            zzefVar.zzh(zzg);
            zzadh zzadhVar = this.zzh;
            int i = this.zzj;
            zzadb zzadbVar = this.zzc;
            if (zzadc.zza(zzefVar, zzadhVar, i, zzadbVar)) {
                zzefVar.zzh(zzg);
                return zzadbVar.zza;
            }
            zzg++;
        }
        if (!z) {
            zzefVar.zzh(zzg);
            return -1L;
        }
        while (zzg <= zzefVar.zze() - this.zzi) {
            zzefVar.zzh(zzg);
            try {
                z2 = zzadc.zza(zzefVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzefVar.zzg() <= zzefVar.zze() && z2) {
                zzefVar.zzh(zzg);
                return this.zzc.zza;
            }
            zzg++;
        }
        zzefVar.zzh(zzefVar.zze());
        return -1L;
    }

    private final void zzb() {
        long j = this.zzm * 1000000;
        zzadh zzadhVar = this.zzh;
        String str = zzeo.zza;
        this.zze.zzx(j / zzadhVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzade.zza(zzacvVar, false);
        zzef zzefVar = new zzef(4);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 4, false);
        return zzefVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzd = zzacxVar;
        this.zze = zzacxVar.zzu(0, 1);
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaey zzaeyVar = this.zzk;
            if (zzaeyVar != null) {
                zzaeyVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean zzb;
        zzadh zzadhVar;
        zzadv zzaduVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzacvVar.zzl();
            long zzm = zzacvVar.zzm();
            zzao zza = zzade.zza(zzacvVar, true);
            zzacvVar.zzf((int) (zzacvVar.zzm() - zzm));
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzacvVar.zzi(this.zza, 0, 42);
            zzacvVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzef zzefVar = new zzef(4);
            zzacvVar.zzc(zzefVar.zzi(), 0, 4);
            if (zzefVar.zzz() != 1716281667) {
                throw zzas.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzadd zzaddVar = new zzadd(this.zzh);
            do {
                zzb = zzade.zzb(zzacvVar, zzaddVar);
                zzadhVar = zzaddVar.zza;
                String str = zzeo.zza;
                this.zzh = zzadhVar;
            } while (!zzb);
            zzadhVar.getClass();
            this.zzi = Math.max(zzadhVar.zzc, 6);
            zzu zzc = this.zzh.zzc(this.zza, this.zzg);
            zzaeb zzaebVar = this.zze;
            zzs zza2 = zzc.zza();
            zza2.zzl("audio/flac");
            zzaebVar.zzu(zza2.zzM());
            zzaeb zzaebVar2 = this.zze;
            this.zzh.zza();
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzacvVar.zzl();
            zzef zzefVar2 = new zzef(2);
            zzacvVar.zzi(zzefVar2.zzi(), 0, 2);
            int zzt = zzefVar2.zzt();
            if ((zzt >> 2) != 16382) {
                zzacvVar.zzl();
                throw zzas.zzb("First frame does not start with sync code.", null);
            }
            zzacvVar.zzl();
            this.zzj = zzt;
            zzacx zzacxVar = this.zzd;
            String str2 = zzeo.zza;
            long zzn = zzacvVar.zzn();
            long zzo = zzacvVar.zzo();
            zzadh zzadhVar2 = this.zzh;
            zzadhVar2.getClass();
            zzadg zzadgVar = zzadhVar2.zzk;
            if (zzadgVar != null && zzadgVar.zza.length > 0) {
                zzaduVar = new zzadf(zzadhVar2, zzn);
            } else if (zzo == -1 || zzadhVar2.zzj <= 0) {
                zzaduVar = new zzadu(zzadhVar2.zza(), 0L);
            } else {
                zzaey zzaeyVar = new zzaey(zzadhVar2, this.zzj, zzn, zzo);
                this.zzk = zzaeyVar;
                zzaduVar = zzaeyVar.zza();
            }
            zzacxVar.zzw(zzaduVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadh zzadhVar3 = this.zzh;
        zzadhVar3.getClass();
        zzaey zzaeyVar2 = this.zzk;
        if (zzaeyVar2 != null && zzaeyVar2.zzc()) {
            return zzaeyVar2.zzd(zzacvVar, zzadsVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzadc.zzb(zzacvVar, zzadhVar3);
            return 0;
        }
        zzef zzefVar3 = this.zzb;
        int zze = zzefVar3.zze();
        if (zze < 32768) {
            int zza3 = zzacvVar.zza(zzefVar3.zzi(), zze, 32768 - zze);
            z = zza3 == -1;
            if (!z) {
                zzefVar3.zzf(zze + zza3);
            } else if (zzefVar3.zzd() == 0) {
                zzb();
                return -1;
            }
        } else {
            z = false;
        }
        int zzg = zzefVar3.zzg();
        int i2 = this.zzl;
        int i3 = this.zzi;
        if (i2 < i3) {
            zzefVar3.zzk(Math.min(i3 - i2, zzefVar3.zzd()));
        }
        long zza4 = zza(zzefVar3, z);
        int zzg2 = zzefVar3.zzg() - zzg;
        zzefVar3.zzh(zzg);
        this.zze.zzz(zzefVar3, zzg2);
        this.zzl += zzg2;
        if (zza4 != -1) {
            zzb();
            this.zzl = 0;
            this.zzm = zza4;
        }
        int length = zzefVar3.zzi().length - zzefVar3.zze();
        if (zzefVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int zzd = zzefVar3.zzd();
        System.arraycopy(zzefVar3.zzi(), zzefVar3.zzg(), zzefVar3.zzi(), 0, zzd);
        zzefVar3.zzh(0);
        zzefVar3.zzf(zzd);
        return 0;
    }
}
