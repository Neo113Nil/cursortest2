package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakh implements zzajy {
    private final zzakz zza;
    private long zze;
    private String zzg;
    private zzadk zzh;
    private zzakg zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzakn zzb = new zzakn(7, 128);
    private final zzakn zzc = new zzakn(8, 128);
    private final zzakn zzd = new zzakn(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfj zzm = new zzfj();

    public zzakh(zzakz zzakzVar, boolean z, boolean z2) {
        this.zza = zzakzVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) {
        int i;
        int i2;
        zzef.zzb(this.zzh);
        int i3 = zzfs.zza;
        int zzc = zzfjVar.zzc();
        int zzd = zzfjVar.zzd();
        byte[] zzI = zzfjVar.zzI();
        this.zze += zzfjVar.zza();
        this.zzh.zzr(zzfjVar, zzfjVar.zza());
        while (true) {
            int zza = zzgg.zza(zzI, zzc, zzd, this.zzf);
            if (zza == zzd) {
                zzf(zzI, zzc, zzd);
                return;
            }
            int i4 = zza + 3;
            int i5 = zzI[i4] & Ascii.US;
            int i6 = zza - zzc;
            if (i6 > 0) {
                zzf(zzI, zzc, zza);
            }
            int i7 = zzd - zza;
            long j = this.zze - i7;
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = zzd;
                    i2 = i4;
                    zzakn zzaknVar = this.zzb;
                    if (zzaknVar.zze()) {
                        this.zzi.zzc(zzgg.zze(zzaknVar.zza, 4, zzaknVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzakn zzaknVar2 = this.zzc;
                        if (zzaknVar2.zze()) {
                            this.zzi.zzb(zzgg.zzd(zzaknVar2.zza, 4, zzaknVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzakn zzaknVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzaknVar3.zza, zzaknVar3.zzb));
                    zzakn zzaknVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzaknVar4.zza, zzaknVar4.zzb));
                    zzakn zzaknVar5 = this.zzb;
                    zzgf zze = zzgg.zze(zzaknVar5.zza, 4, zzaknVar5.zzb);
                    zzakn zzaknVar6 = this.zzc;
                    zzge zzd2 = zzgg.zzd(zzaknVar6.zza, 4, zzaknVar6.zzb);
                    i2 = i4;
                    String zza2 = zzeh.zza(zze.zza, zze.zzb, zze.zzc);
                    zzadk zzadkVar = this.zzh;
                    zzak zzakVar = new zzak();
                    i = zzd;
                    zzakVar.zzJ(this.zzg);
                    zzakVar.zzU("video/avc");
                    zzakVar.zzz(zza2);
                    zzakVar.zzab(zze.zze);
                    zzakVar.zzH(zze.zzf);
                    zzr zzrVar = new zzr();
                    zzrVar.zzc(zze.zzj);
                    zzrVar.zzb(zze.zzk);
                    zzrVar.zzd(zze.zzl);
                    zzrVar.zzf(zze.zzh + 8);
                    zzrVar.zza(zze.zzi + 8);
                    zzakVar.zzA(zzrVar.zzg());
                    zzakVar.zzR(zze.zzg);
                    zzakVar.zzK(arrayList);
                    zzadkVar.zzl(zzakVar.zzac());
                    this.zzj = true;
                    this.zzi.zzc(zze);
                    this.zzi.zzb(zzd2);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
                if (this.zzd.zzd(i8)) {
                    zzakn zzaknVar7 = this.zzd;
                    this.zzm.zzE(this.zzd.zza, zzgg.zzb(zzaknVar7.zza, zzaknVar7.zzb));
                    this.zzm.zzG(4);
                    this.zza.zza(j2, this.zzm);
                }
                if (this.zzi.zzf(j, i7, this.zzj, this.zzl)) {
                    this.zzl = false;
                }
                long j3 = this.zzk;
                if (this.zzj) {
                    this.zzb.zzc(i5);
                    this.zzc.zzc(i5);
                }
                this.zzd.zzc(i5);
                this.zzi.zze(j, i5, j3);
                zzc = i2;
                zzd = i;
            }
            i = zzd;
            i2 = i4;
            if (this.zzd.zzd(i8)) {
            }
            if (this.zzi.zzf(j, i7, this.zzj, this.zzl)) {
            }
            long j32 = this.zzk;
            if (this.zzj) {
            }
            this.zzd.zzc(i5);
            this.zzi.zze(j, i5, j32);
            zzc = i2;
            zzd = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzg = zzalkVar.zzb();
        this.zzh = zzachVar.zzw(zzalkVar.zza(), 2);
        this.zzi = new zzakg(this.zzh, false, false);
        this.zza.zzb(zzachVar, zzalkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
        zzef.zzb(this.zzh);
        int i = zzfs.zza;
        if (z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzgg.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzakg zzakgVar = this.zzi;
        if (zzakgVar != null) {
            zzakgVar.zzd();
        }
    }
}
