package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakj implements zzajy {
    private final zzakz zza;
    private String zzb;
    private zzadk zzc;
    private zzaki zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzakn zzg = new zzakn(32, 128);
    private final zzakn zzh = new zzakn(33, 128);
    private final zzakn zzi = new zzakn(34, 128);
    private final zzakn zzj = new zzakn(39, 128);
    private final zzakn zzk = new zzakn(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfj zzn = new zzfj();

    public zzakj(zzakz zzakzVar) {
        this.zza = zzakzVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) {
        int i;
        byte[] bArr;
        int i2;
        long j;
        int i3;
        zzef.zzb(this.zzc);
        int i4 = zzfs.zza;
        while (zzfjVar.zza() > 0) {
            int zzc = zzfjVar.zzc();
            int zzd = zzfjVar.zzd();
            byte[] zzI = zzfjVar.zzI();
            this.zzl += zzfjVar.zza();
            this.zzc.zzr(zzfjVar, zzfjVar.zza());
            while (zzc < zzd) {
                int zza = zzgg.zza(zzI, zzc, zzd, this.zzf);
                if (zza == zzd) {
                    zzf(zzI, zzc, zzd);
                    return;
                }
                int i5 = zza + 3;
                int i6 = zzI[i5] & 126;
                int i7 = zza - zzc;
                if (i7 > 0) {
                    zzf(zzI, zzc, zza);
                }
                int i8 = zzd - zza;
                long j2 = this.zzl - i8;
                int i9 = i7 < 0 ? -i7 : 0;
                long j3 = this.zzm;
                this.zzd.zzb(j2, i8, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i9);
                    this.zzh.zzd(i9);
                    this.zzi.zzd(i9);
                    zzakn zzaknVar = this.zzg;
                    if (zzaknVar.zze()) {
                        zzakn zzaknVar2 = this.zzh;
                        if (zzaknVar2.zze()) {
                            zzakn zzaknVar3 = this.zzi;
                            if (zzaknVar3.zze()) {
                                zzadk zzadkVar = this.zzc;
                                i2 = i5;
                                String str = this.zzb;
                                int i10 = zzaknVar.zzb;
                                i = zzd;
                                bArr = zzI;
                                byte[] bArr2 = new byte[zzaknVar2.zzb + i10 + zzaknVar3.zzb];
                                i3 = i8;
                                System.arraycopy(zzaknVar.zza, 0, bArr2, 0, i10);
                                j = j2;
                                System.arraycopy(zzaknVar2.zza, 0, bArr2, zzaknVar.zzb, zzaknVar2.zzb);
                                System.arraycopy(zzaknVar3.zza, 0, bArr2, zzaknVar.zzb + zzaknVar2.zzb, zzaknVar3.zzb);
                                zzgd zzc2 = zzgg.zzc(zzaknVar2.zza, 5, zzaknVar2.zzb);
                                String zzb = zzeh.zzb(zzc2.zza, zzc2.zzb, zzc2.zzc, zzc2.zzd, zzc2.zzg, zzc2.zzh);
                                zzak zzakVar = new zzak();
                                zzakVar.zzJ(str);
                                zzakVar.zzU("video/hevc");
                                zzakVar.zzz(zzb);
                                zzakVar.zzab(zzc2.zzi);
                                zzakVar.zzH(zzc2.zzj);
                                zzr zzrVar = new zzr();
                                zzrVar.zzc(zzc2.zzl);
                                zzrVar.zzb(zzc2.zzm);
                                zzrVar.zzd(zzc2.zzn);
                                zzrVar.zzf(zzc2.zze + 8);
                                zzrVar.zza(zzc2.zzf + 8);
                                zzakVar.zzA(zzrVar.zzg());
                                zzakVar.zzR(zzc2.zzk);
                                zzakVar.zzK(Collections.singletonList(bArr2));
                                zzadkVar.zzl(zzakVar.zzac());
                                this.zze = true;
                                if (this.zzj.zzd(i9)) {
                                    zzakn zzaknVar4 = this.zzj;
                                    this.zzn.zzE(this.zzj.zza, zzgg.zzb(zzaknVar4.zza, zzaknVar4.zzb));
                                    this.zzn.zzH(5);
                                    this.zza.zza(j3, this.zzn);
                                }
                                if (this.zzk.zzd(i9)) {
                                    zzakn zzaknVar5 = this.zzk;
                                    this.zzn.zzE(this.zzk.zza, zzgg.zzb(zzaknVar5.zza, zzaknVar5.zzb));
                                    this.zzn.zzH(5);
                                    this.zza.zza(j3, this.zzn);
                                }
                                int i11 = i6 >> 1;
                                this.zzd.zze(j, i3, i11, this.zzm, this.zze);
                                if (!this.zze) {
                                    this.zzg.zzc(i11);
                                    this.zzh.zzc(i11);
                                    this.zzi.zzc(i11);
                                }
                                this.zzj.zzc(i11);
                                this.zzk.zzc(i11);
                                zzc = i2;
                                zzd = i;
                                zzI = bArr;
                            }
                        }
                    }
                }
                i = zzd;
                bArr = zzI;
                i2 = i5;
                j = j2;
                i3 = i8;
                if (this.zzj.zzd(i9)) {
                }
                if (this.zzk.zzd(i9)) {
                }
                int i112 = i6 >> 1;
                this.zzd.zze(j, i3, i112, this.zzm, this.zze);
                if (!this.zze) {
                }
                this.zzj.zzc(i112);
                this.zzk.zzc(i112);
                zzc = i2;
                zzd = i;
                zzI = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzb = zzalkVar.zzb();
        this.zzc = zzachVar.zzw(zzalkVar.zza(), 2);
        this.zzd = new zzaki(this.zzc);
        this.zza.zzb(zzachVar, zzalkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
        zzef.zzb(this.zzc);
        int i = zzfs.zza;
        if (z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgg.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaki zzakiVar = this.zzd;
        if (zzakiVar != null) {
            zzakiVar.zzd();
        }
    }
}
