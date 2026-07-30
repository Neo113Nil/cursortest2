package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaos implements zzaon {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaqf zzb;
    private zzaor zzg;
    private long zzh;
    private String zzi;
    private zzagh zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoq zze = new zzaoq(128);
    private long zzl = -9223372036854775807L;
    private final zzape zzf = new zzape(Opcodes.GETSTATIC, 128);
    private final zzer zzc = new zzer();

    zzaos(zzaqf zzaqfVar, String str) {
        this.zzb = zzaqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaor zzaorVar = this.zzg;
        if (zzaorVar != null) {
            zzaorVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzi = zzaqbVar.zzc();
        this.zzj = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzg = new zzaor(this.zzj);
        this.zzb.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
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
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i;
        zzape zzapeVar;
        int i2;
        int i3;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzh += zzerVar.zzd();
        this.zzj.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzd);
            if (zzi2 == zze) {
                break;
            }
            int i4 = zzi2 + 3;
            int i5 = zzerVar.zzi()[i4] & 255;
            int i6 = zzi2 - zzg;
            if (!this.zzk) {
                if (i6 > 0) {
                    this.zze.zzc(zzi, zzg, zzi2);
                }
                int i7 = i6 < 0 ? -i6 : 0;
                zzaoq zzaoqVar = this.zze;
                if (zzaoqVar.zzb(i5, i7)) {
                    zzagh zzaghVar = this.zzj;
                    int i8 = zzaoqVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzaoqVar.zzc, zzaoqVar.zza);
                    zzeq zzeqVar = new zzeq(copyOf, copyOf.length);
                    zzeqVar.zzo(i8);
                    zzeqVar.zzo(4);
                    zzeqVar.zzg();
                    zzeqVar.zzh(8);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                        zzeqVar.zzh(3);
                    }
                    int zzj = zzeqVar.zzj(4);
                    float f = 1.0f;
                    i = zze;
                    if (zzj == 15) {
                        int zzj2 = zzeqVar.zzj(8);
                        int zzj3 = zzeqVar.zzj(8);
                        if (zzj3 == 0) {
                            zzee.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzj2 / zzj3;
                        }
                    } else if (zzj < 7) {
                        f = zza[zzj];
                    } else {
                        zzee.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(2);
                        zzeqVar.zzh(1);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(11);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            i3 = 2;
                            if (zzeqVar.zzj(i3) != 0) {
                                zzee.zzc("H263Reader", "Unhandled video object layer shape");
                            }
                            zzeqVar.zzg();
                            int zzj4 = zzeqVar.zzj(16);
                            zzeqVar.zzg();
                            if (zzeqVar.zzi()) {
                                if (zzj4 == 0) {
                                    zzee.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i9 = zzj4 - 1;
                                    int i10 = 0;
                                    while (i9 > 0) {
                                        i9 >>= 1;
                                        i10++;
                                    }
                                    zzeqVar.zzh(i10);
                                }
                            }
                            zzeqVar.zzg();
                            int zzj5 = zzeqVar.zzj(13);
                            zzeqVar.zzg();
                            int zzj6 = zzeqVar.zzj(13);
                            zzeqVar.zzg();
                            zzeqVar.zzg();
                            zzt zztVar = new zzt();
                            zztVar.zza(str);
                            zztVar.zzl("video/mp2t");
                            zztVar.zzm("video/mp4v-es");
                            zztVar.zzt(zzj5);
                            zztVar.zzu(zzj6);
                            zztVar.zzz(f2);
                            zztVar.zzp(Collections.singletonList(copyOf));
                            zzaghVar.zzz(zztVar.zzM());
                            this.zzk = true;
                            this.zzg.zzc(zzi, zzg, zzi2);
                            zzapeVar = this.zzf;
                            if (i6 > 0) {
                                zzapeVar.zzd(zzi, zzg, zzi2);
                                i2 = 0;
                            } else {
                                i2 = -i6;
                            }
                            if (zzapeVar.zze(i2)) {
                                int zza2 = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                                zzer zzerVar2 = this.zzc;
                                String str2 = zzfj.zza;
                                zzerVar2.zzb(zzapeVar.zza, zza2);
                                this.zzb.zzb(this.zzl, zzerVar2);
                            }
                            if (i5 == 178) {
                                if (zzerVar.zzi()[zzi2 + 2] == 1) {
                                    zzapeVar.zzc(Opcodes.GETSTATIC);
                                }
                                i5 = 178;
                            }
                            int i11 = i - zzi2;
                            this.zzg.zzd(this.zzh - i11, i11, this.zzk);
                            this.zzg.zzb(i5, this.zzl);
                            zzg = i4;
                            zze = i;
                        }
                    }
                    i3 = 2;
                    if (zzeqVar.zzj(i3) != 0) {
                    }
                    zzeqVar.zzg();
                    int zzj42 = zzeqVar.zzj(16);
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                    }
                    zzeqVar.zzg();
                    int zzj52 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    int zzj62 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    zzeqVar.zzg();
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzl("video/mp2t");
                    zztVar2.zzm("video/mp4v-es");
                    zztVar2.zzt(zzj52);
                    zztVar2.zzu(zzj62);
                    zztVar2.zzz(f2);
                    zztVar2.zzp(Collections.singletonList(copyOf));
                    zzaghVar.zzz(zztVar2.zzM());
                    this.zzk = true;
                    this.zzg.zzc(zzi, zzg, zzi2);
                    zzapeVar = this.zzf;
                    if (i6 > 0) {
                    }
                    if (zzapeVar.zze(i2)) {
                    }
                    if (i5 == 178) {
                    }
                    int i112 = i - zzi2;
                    this.zzg.zzd(this.zzh - i112, i112, this.zzk);
                    this.zzg.zzb(i5, this.zzl);
                    zzg = i4;
                    zze = i;
                }
            }
            i = zze;
            this.zzg.zzc(zzi, zzg, zzi2);
            zzapeVar = this.zzf;
            if (i6 > 0) {
            }
            if (zzapeVar.zze(i2)) {
            }
            if (i5 == 178) {
            }
            int i1122 = i - zzi2;
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

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
        zzaor zzaorVar = this.zzg;
        zzaorVar.getClass();
        if (z) {
            zzaorVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
