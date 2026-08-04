package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzafk implements zzacu {
    private zzacx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzago zzg;
    private zzacv zzh;
    private zzafn zzi;
    private zzaim zzj;
    private final zzef zza = new zzef(2);
    private long zzf = -1;

    private final int zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzefVar.zza(2);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 2, false);
        return zzefVar.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        if (zza(zzacvVar) != 65496) {
            return false;
        }
        int zza = zza(zzacvVar);
        this.zzd = zza;
        if (zza == 65504) {
            zzef zzefVar = this.zza;
            zzefVar.zza(2);
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
            zzaclVar.zzj(zzefVar.zzt() - 2, false);
            zza = zza(zzacvVar);
            this.zzd = zza;
        }
        return zza == 65505;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzb = zzacxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        int i;
        String zzM;
        zzafm zza;
        zzago zzagoVar;
        long j;
        int i2 = this.zzc;
        long j2 = -1;
        if (i2 == 0) {
            zzef zzefVar = this.zza;
            zzefVar.zza(2);
            zzacvVar.zzc(zzefVar.zzi(), 0, 2);
            int zzt = zzefVar.zzt();
            this.zzd = zzt;
            if (zzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzb();
                return 0;
            }
            if ((zzt >= 65488 && zzt <= 65497) || zzt == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            zzef zzefVar2 = this.zza;
            zzefVar2.zza(2);
            zzacvVar.zzc(zzefVar2.zzi(), 0, 2);
            this.zze = zzefVar2.zzt() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzacvVar != this.zzh) {
                    this.zzh = zzacvVar;
                    this.zzi = new zzafn(zzacvVar, this.zzf);
                }
                zzaim zzaimVar = this.zzj;
                zzaimVar.getClass();
                int zzg = zzaimVar.zzg(this.zzi, zzadsVar);
                if (zzg == 1) {
                    zzadsVar.zza += this.zzf;
                }
                return zzg;
            }
            long zzn = zzacvVar.zzn();
            long j3 = this.zzf;
            if (zzn != j3) {
                zzadsVar.zza = j3;
                return 1;
            }
            if (zzacvVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzacvVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzaim(zzajt.zza, 8);
                }
                zzafn zzafnVar = new zzafn(zzacvVar, this.zzf);
                this.zzi = zzafnVar;
                if (this.zzj.zzd(zzafnVar)) {
                    zzaim zzaimVar2 = this.zzj;
                    long j4 = this.zzf;
                    zzacx zzacxVar = this.zzb;
                    zzacxVar.getClass();
                    zzaimVar2.zzf(new zzafp(j4, zzacxVar));
                    zzago zzagoVar2 = this.zzg;
                    zzagoVar2.getClass();
                    zzacx zzacxVar2 = this.zzb;
                    zzacxVar2.getClass();
                    zzaeb zzu = zzacxVar2.zzu(1024, 4);
                    zzs zzsVar = new zzs();
                    zzsVar.zzl("image/jpeg");
                    zzsVar.zzk(new zzao(-9223372036854775807L, zzagoVar2));
                    zzu.zzu(zzsVar.zzM());
                    this.zzc = 5;
                } else {
                    zzb();
                }
            } else {
                zzb();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzef zzefVar3 = new zzef(this.zze);
            zzacvVar.zzc(zzefVar3.zzi(), 0, this.zze);
            if (this.zzg != null || !"http://ns.adobe.com/xap/1.0/".equals(zzefVar3.zzM((char) 0)) || (zzM = zzefVar3.zzM((char) 0)) == null) {
                i = 0;
                this.zzc = i;
                return i;
            }
            long zzo = zzacvVar.zzo();
            if (zzo != -1 && (zza = zzafq.zza(zzM)) != null) {
                List list = zza.zzb;
                if (list.size() >= 2) {
                    int size = list.size() - 1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    long j8 = -1;
                    boolean z = false;
                    while (size >= 0) {
                        zzafl zzaflVar = (zzafl) list.get(size);
                        long j9 = j2;
                        boolean equals = "video/mp4".equals(zzaflVar.zza) | z;
                        if (size == 0) {
                            zzo -= zzaflVar.zzc;
                            j = 0;
                        } else {
                            j = zzo - zzaflVar.zzb;
                        }
                        long j10 = j;
                        long j11 = zzo;
                        zzo = j10;
                        if (!equals || zzo == j11) {
                            z = equals;
                        } else {
                            j8 = j11 - zzo;
                            j7 = zzo;
                            z = false;
                        }
                        if (size == 0) {
                            j6 = j11;
                        }
                        if (size == 0) {
                            j5 = zzo;
                        }
                        size--;
                        j2 = j9;
                    }
                    long j12 = j2;
                    if (j7 != j12 && j8 != j12 && j5 != j12 && j6 != j12) {
                        zzagoVar = new zzago(j5, j6, zza.zza, j7, j8);
                        this.zzg = zzagoVar;
                        if (zzagoVar != null) {
                            this.zzf = zzagoVar.zzd;
                        }
                    }
                }
            }
            zzagoVar = null;
            this.zzg = zzagoVar;
            if (zzagoVar != null) {
            }
        } else {
            zzacvVar.zzf(this.zze);
        }
        i = 0;
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaim zzaimVar = this.zzj;
            zzaimVar.getClass();
            zzaimVar.zzh(j, j2);
        }
    }

    private final void zzb() {
        zzacx zzacxVar = this.zzb;
        zzacxVar.getClass();
        zzacxVar.zzv();
        this.zzb.zzw(new zzadu(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
