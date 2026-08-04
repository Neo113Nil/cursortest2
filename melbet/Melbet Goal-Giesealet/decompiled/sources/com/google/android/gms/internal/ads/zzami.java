package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzami implements zzamd {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzanv zzb;
    private zzamh zzg;
    private long zzh;
    private String zzi;
    private zzaeb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzamg zze = new zzamg(128);
    private long zzl = -9223372036854775807L;
    private final zzamu zzf = new zzamu(178, 128);
    private final zzef zzc = new zzef();

    zzami(zzanv zzanvVar, String str) {
        this.zzb = zzanvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        zzfl.zzi(this.zzd);
        this.zze.zza();
        zzamh zzamhVar = this.zzg;
        if (zzamhVar != null) {
            zzamhVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzi = zzanrVar.zzc();
        this.zzj = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzg = new zzamh(this.zzj);
        this.zzb.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzef zzefVar) {
        int i;
        zzamu zzamuVar;
        int i2;
        int i3;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzefVar.zzg();
        int zze = zzefVar.zze();
        byte[] zzi = zzefVar.zzi();
        this.zzh += zzefVar.zzd();
        this.zzj.zzz(zzefVar, zzefVar.zzd());
        while (true) {
            int zzh = zzfl.zzh(zzi, zzg, zze, this.zzd);
            if (zzh == zze) {
                break;
            }
            int i4 = zzh + 3;
            int i5 = zzefVar.zzi()[i4] & 255;
            int i6 = zzh - zzg;
            if (!this.zzk) {
                if (i6 > 0) {
                    this.zze.zzc(zzi, zzg, zzh);
                }
                int i7 = i6 < 0 ? -i6 : 0;
                zzamg zzamgVar = this.zze;
                if (zzamgVar.zzb(i5, i7)) {
                    zzaeb zzaebVar = this.zzj;
                    int i8 = zzamgVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzamgVar.zzc, zzamgVar.zza);
                    zzee zzeeVar = new zzee(copyOf, copyOf.length);
                    zzeeVar.zzo(i8);
                    zzeeVar.zzo(4);
                    zzeeVar.zzg();
                    zzeeVar.zzh(8);
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(4);
                        zzeeVar.zzh(3);
                    }
                    int zzj = zzeeVar.zzj(4);
                    float f = 1.0f;
                    i = zze;
                    if (zzj == 15) {
                        int zzj2 = zzeeVar.zzj(8);
                        int zzj3 = zzeeVar.zzj(8);
                        if (zzj3 == 0) {
                            zzds.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzj2 / zzj3;
                        }
                    } else if (zzj < 7) {
                        f = zza[zzj];
                    } else {
                        zzds.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(2);
                        zzeeVar.zzh(1);
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            zzeeVar.zzh(3);
                            zzeeVar.zzh(11);
                            zzeeVar.zzg();
                            zzeeVar.zzh(15);
                            zzeeVar.zzg();
                            i3 = 2;
                            if (zzeeVar.zzj(i3) != 0) {
                                zzds.zzc("H263Reader", "Unhandled video object layer shape");
                            }
                            zzeeVar.zzg();
                            int zzj4 = zzeeVar.zzj(16);
                            zzeeVar.zzg();
                            if (zzeeVar.zzi()) {
                                if (zzj4 == 0) {
                                    zzds.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i9 = zzj4 - 1;
                                    int i10 = 0;
                                    while (i9 > 0) {
                                        i9 >>= 1;
                                        i10++;
                                    }
                                    zzeeVar.zzh(i10);
                                }
                            }
                            zzeeVar.zzg();
                            int zzj5 = zzeeVar.zzj(13);
                            zzeeVar.zzg();
                            int zzj6 = zzeeVar.zzj(13);
                            zzeeVar.zzg();
                            zzeeVar.zzg();
                            zzs zzsVar = new zzs();
                            zzsVar.zza(str);
                            zzsVar.zzl("video/mp2t");
                            zzsVar.zzm("video/mp4v-es");
                            zzsVar.zzt(zzj5);
                            zzsVar.zzu(zzj6);
                            zzsVar.zzz(f2);
                            zzsVar.zzp(Collections.singletonList(copyOf));
                            zzaebVar.zzu(zzsVar.zzM());
                            this.zzk = true;
                            this.zzg.zzc(zzi, zzg, zzh);
                            zzamuVar = this.zzf;
                            if (i6 > 0) {
                                zzamuVar.zzd(zzi, zzg, zzh);
                                i2 = 0;
                            } else {
                                i2 = -i6;
                            }
                            if (zzamuVar.zze(i2)) {
                                int zza2 = zzfl.zza(zzamuVar.zza, zzamuVar.zzb);
                                zzef zzefVar2 = this.zzc;
                                String str2 = zzeo.zza;
                                zzefVar2.zzb(zzamuVar.zza, zza2);
                                this.zzb.zzb(this.zzl, zzefVar2);
                            }
                            if (i5 == 178) {
                                if (zzefVar.zzi()[zzh + 2] == 1) {
                                    zzamuVar.zzc(178);
                                }
                                i5 = 178;
                            }
                            int i11 = i - zzh;
                            this.zzg.zzd(this.zzh - i11, i11, this.zzk);
                            this.zzg.zzb(i5, this.zzl);
                            zzg = i4;
                            zze = i;
                        }
                    }
                    i3 = 2;
                    if (zzeeVar.zzj(i3) != 0) {
                    }
                    zzeeVar.zzg();
                    int zzj42 = zzeeVar.zzj(16);
                    zzeeVar.zzg();
                    if (zzeeVar.zzi()) {
                    }
                    zzeeVar.zzg();
                    int zzj52 = zzeeVar.zzj(13);
                    zzeeVar.zzg();
                    int zzj62 = zzeeVar.zzj(13);
                    zzeeVar.zzg();
                    zzeeVar.zzg();
                    zzs zzsVar2 = new zzs();
                    zzsVar2.zza(str);
                    zzsVar2.zzl("video/mp2t");
                    zzsVar2.zzm("video/mp4v-es");
                    zzsVar2.zzt(zzj52);
                    zzsVar2.zzu(zzj62);
                    zzsVar2.zzz(f2);
                    zzsVar2.zzp(Collections.singletonList(copyOf));
                    zzaebVar.zzu(zzsVar2.zzM());
                    this.zzk = true;
                    this.zzg.zzc(zzi, zzg, zzh);
                    zzamuVar = this.zzf;
                    if (i6 > 0) {
                    }
                    if (zzamuVar.zze(i2)) {
                    }
                    if (i5 == 178) {
                    }
                    int i112 = i - zzh;
                    this.zzg.zzd(this.zzh - i112, i112, this.zzk);
                    this.zzg.zzb(i5, this.zzl);
                    zzg = i4;
                    zze = i;
                }
            }
            i = zze;
            this.zzg.zzc(zzi, zzg, zzh);
            zzamuVar = this.zzf;
            if (i6 > 0) {
            }
            if (zzamuVar.zze(i2)) {
            }
            if (i5 == 178) {
            }
            int i1122 = i - zzh;
            this.zzg.zzd(this.zzh - i1122, i1122, this.zzk);
            this.zzg.zzb(i5, this.zzl);
            zzg = i4;
            zze = i;
        }
        if (!this.zzk) {
            this.zze.zzc(zzi, zzg, zze);
        }
        this.zzg.zzc(zzi, zzg, zze);
        this.zzf.zzd(zzi, zzg, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        zzamh zzamhVar = this.zzg;
        zzamhVar.getClass();
        if (z) {
            zzamhVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
