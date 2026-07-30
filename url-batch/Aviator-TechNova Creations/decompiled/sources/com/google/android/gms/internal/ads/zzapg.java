package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzapg implements zzaqc {
    private final zzaon zza;
    private final zzeq zzb = new zzeq(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfg zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzapg(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i) {
        int min = Math.min(zzerVar.zzd(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzerVar.zzk(min);
        } else {
            zzerVar.zzm(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zze = zzfgVar;
        this.zza.zzb(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i) throws zzat {
        int i2;
        int i3;
        long j;
        long j2;
        this.zze.getClass();
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i7);
                        sb.append(" more bytes");
                        zzee.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzerVar.zze() == 0);
                } else {
                    zzee.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i8 = i;
        while (zzerVar.zzd() > 0) {
            int i9 = this.zzc;
            if (i9 == 0) {
                i2 = i5;
                zzerVar.zzk(zzerVar.zzd());
            } else if (i9 != 1) {
                if (i9 != i5) {
                    int zzd = zzerVar.zzd();
                    int i10 = this.zzj;
                    int i11 = i10 == i4 ? 0 : zzd - i10;
                    if (i11 > 0) {
                        zzd -= i11;
                        zzerVar.zzf(zzerVar.zzg() + zzd);
                    }
                    zzaon zzaonVar = this.zza;
                    zzaonVar.zzd(zzerVar);
                    int i12 = this.zzj;
                    if (i12 != i4) {
                        int i13 = i12 - zzd;
                        this.zzj = i13;
                        if (i13 == 0) {
                            zzaonVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int min = Math.min(10, this.zzi);
                    zzeq zzeqVar = this.zzb;
                    if (zzf(zzerVar, zzeqVar.zza, min) && zzf(zzerVar, null, this.zzi)) {
                        zzeqVar.zzf(0);
                        if (this.zzf) {
                            zzeqVar.zzh(4);
                            long zzj = zzeqVar.zzj(3);
                            zzeqVar.zzh(1);
                            int zzj2 = zzeqVar.zzj(15) << 15;
                            zzeqVar.zzh(1);
                            long zzj3 = zzeqVar.zzj(15);
                            zzeqVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j2 = zzj;
                            } else {
                                zzeqVar.zzh(4);
                                j2 = zzj;
                                zzeqVar.zzh(1);
                                int zzj4 = zzeqVar.zzj(15) << 15;
                                zzeqVar.zzh(1);
                                long zzj5 = zzeqVar.zzj(15);
                                zzeqVar.zzh(1);
                                this.zze.zze((zzeqVar.zzj(3) << 30) | zzj4 | zzj5);
                                this.zzh = true;
                            }
                            j = this.zze.zze(zzj3 | (j2 << 30) | zzj2);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i8 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(j, i8);
                        zze(3);
                        i4 = -1;
                        i5 = 2;
                    }
                }
                i2 = i5;
            } else {
                zzeq zzeqVar2 = this.zzb;
                if (zzf(zzerVar, zzeqVar2.zza, 9)) {
                    zzeqVar2.zzf(0);
                    int zzj6 = zzeqVar2.zzj(24);
                    if (zzj6 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzj6).length() + 30);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(zzj6);
                        zzee.zzc("PesReader", sb2.toString());
                        i4 = -1;
                        this.zzj = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        zzeqVar2.zzh(8);
                        int zzj7 = zzeqVar2.zzj(16);
                        zzeqVar2.zzh(5);
                        this.zzk = zzeqVar2.zzi();
                        i2 = 2;
                        zzeqVar2.zzh(2);
                        this.zzf = zzeqVar2.zzi();
                        this.zzg = zzeqVar2.zzi();
                        zzeqVar2.zzh(6);
                        int zzj8 = zzeqVar2.zzj(8);
                        this.zzi = zzj8;
                        if (zzj7 == 0) {
                            this.zzj = -1;
                            i4 = -1;
                        } else {
                            int i14 = (zzj7 - 3) - zzj8;
                            this.zzj = i14;
                            if (i14 < 0) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 36);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i14);
                                zzee.zzc("PesReader", sb3.toString());
                                i4 = -1;
                                this.zzj = -1;
                            } else {
                                i4 = -1;
                            }
                        }
                        i3 = 2;
                    }
                    zze(i3);
                } else {
                    i4 = -1;
                    i2 = 2;
                }
            }
            i5 = i2;
        }
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
