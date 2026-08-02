package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzamo implements zzamf {
    private final zzani zza;
    private String zzb;
    private zzadp zzc;
    private zzamn zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamx zzg = new zzamx(32, 128);
    private final zzamx zzh = new zzamx(33, 128);
    private final zzamx zzi = new zzamx(34, 128);
    private final zzamx zzj = new zzamx(39, 128);
    private final zzamx zzk = new zzamx(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzek zzn = new zzek();

    public zzamo(zzani zzaniVar) {
        this.zza = zzaniVar;
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
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzek zzekVar) {
        int i;
        byte[] bArr;
        int i2;
        long j;
        int i3;
        zzdi.zzb(this.zzc);
        int i4 = zzet.zza;
        while (zzekVar.zzb() > 0) {
            int zzd = zzekVar.zzd();
            int zze = zzekVar.zze();
            byte[] zzM = zzekVar.zzM();
            this.zzl += zzekVar.zzb();
            this.zzc.zzq(zzekVar, zzekVar.zzb());
            while (zzd < zze) {
                int zza = zzfh.zza(zzM, zzd, zze, this.zzf);
                if (zza == zze) {
                    zzf(zzM, zzd, zze);
                    return;
                }
                int i5 = zza + 3;
                int i6 = zzM[i5] & 126;
                int i7 = zza - zzd;
                if (i7 > 0) {
                    zzf(zzM, zzd, zza);
                }
                int i8 = zze - zza;
                long j2 = this.zzl - i8;
                int i9 = i7 < 0 ? -i7 : 0;
                long j3 = this.zzm;
                this.zzd.zzb(j2, i8, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i9);
                    this.zzh.zzd(i9);
                    this.zzi.zzd(i9);
                    zzamx zzamxVar = this.zzg;
                    if (zzamxVar.zze()) {
                        zzamx zzamxVar2 = this.zzh;
                        if (zzamxVar2.zze()) {
                            zzamx zzamxVar3 = this.zzi;
                            if (zzamxVar3.zze()) {
                                zzadp zzadpVar = this.zzc;
                                i2 = i5;
                                String str = this.zzb;
                                int i10 = zzamxVar.zzb;
                                i = zze;
                                bArr = zzM;
                                byte[] bArr2 = new byte[zzamxVar2.zzb + i10 + zzamxVar3.zzb];
                                i3 = i8;
                                System.arraycopy(zzamxVar.zza, 0, bArr2, 0, i10);
                                j = j2;
                                System.arraycopy(zzamxVar2.zza, 0, bArr2, zzamxVar.zzb, zzamxVar2.zzb);
                                System.arraycopy(zzamxVar3.zza, 0, bArr2, zzamxVar.zzb + zzamxVar2.zzb, zzamxVar3.zzb);
                                zzfe zzc = zzfh.zzc(zzamxVar2.zza, 5, zzamxVar2.zzb);
                                String zzb = zzdk.zzb(zzc.zza, zzc.zzb, zzc.zzc, zzc.zzd, zzc.zzg, zzc.zzh);
                                zzad zzadVar = new zzad();
                                zzadVar.zzK(str);
                                zzadVar.zzX("video/hevc");
                                zzadVar.zzz(zzb);
                                zzadVar.zzac(zzc.zzi);
                                zzadVar.zzI(zzc.zzj);
                                zzm zzmVar = new zzm();
                                zzmVar.zzc(zzc.zzl);
                                zzmVar.zzb(zzc.zzm);
                                zzmVar.zzd(zzc.zzn);
                                zzmVar.zzf(zzc.zze + 8);
                                zzmVar.zza(zzc.zzf + 8);
                                zzadVar.zzA(zzmVar.zzg());
                                zzadVar.zzT(zzc.zzk);
                                zzadVar.zzL(Collections.singletonList(bArr2));
                                zzadpVar.zzl(zzadVar.zzad());
                                this.zze = true;
                                if (this.zzj.zzd(i9)) {
                                    zzamx zzamxVar4 = this.zzj;
                                    this.zzn.zzI(this.zzj.zza, zzfh.zzb(zzamxVar4.zza, zzamxVar4.zzb));
                                    this.zzn.zzL(5);
                                    this.zza.zza(j3, this.zzn);
                                }
                                if (this.zzk.zzd(i9)) {
                                    zzamx zzamxVar5 = this.zzk;
                                    this.zzn.zzI(this.zzk.zza, zzfh.zzb(zzamxVar5.zza, zzamxVar5.zzb));
                                    this.zzn.zzL(5);
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
                                zzd = i2;
                                zze = i;
                                zzM = bArr;
                            }
                        }
                    }
                }
                i = zze;
                bArr = zzM;
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
                zzd = i2;
                zze = i;
                zzM = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzb = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzamn(zzw);
        this.zza.zzb(zzacnVar, zzansVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
        zzdi.zzb(this.zzc);
        int i = zzet.zza;
        if (z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfh.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzamn zzamnVar = this.zzd;
        if (zzamnVar != null) {
            zzamnVar.zzd();
        }
    }
}
