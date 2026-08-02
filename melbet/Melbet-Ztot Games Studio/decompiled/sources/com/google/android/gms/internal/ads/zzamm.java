package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzamm implements zzamf {
    private final zzani zza;
    private long zze;
    private String zzg;
    private zzadp zzh;
    private zzaml zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamx zzb = new zzamx(7, 128);
    private final zzamx zzc = new zzamx(8, 128);
    private final zzamx zzd = new zzamx(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzek zzm = new zzek();

    public zzamm(zzani zzaniVar, boolean z, boolean z2) {
        this.zza = zzaniVar;
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
    /* JADX WARN: Removed duplicated region for block: B:18:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzek zzekVar) {
        int i;
        int i2;
        zzdi.zzb(this.zzh);
        int i3 = zzet.zza;
        int zzd = zzekVar.zzd();
        int zze = zzekVar.zze();
        byte[] zzM = zzekVar.zzM();
        this.zze += zzekVar.zzb();
        this.zzh.zzq(zzekVar, zzekVar.zzb());
        while (true) {
            int zza = zzfh.zza(zzM, zzd, zze, this.zzf);
            if (zza == zze) {
                zzf(zzM, zzd, zze);
                return;
            }
            int i4 = zza + 3;
            int i5 = zzM[i4] & Ascii.US;
            int i6 = zza - zzd;
            if (i6 > 0) {
                zzf(zzM, zzd, zza);
            }
            int i7 = zze - zza;
            long j = this.zze - i7;
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = zze;
                    i2 = i4;
                    zzamx zzamxVar = this.zzb;
                    if (zzamxVar.zze()) {
                        this.zzi.zzc(zzfh.zze(zzamxVar.zza, 4, zzamxVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzamx zzamxVar2 = this.zzc;
                        if (zzamxVar2.zze()) {
                            this.zzi.zzb(zzfh.zzd(zzamxVar2.zza, 4, zzamxVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzamx zzamxVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzamxVar3.zza, zzamxVar3.zzb));
                    zzamx zzamxVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzamxVar4.zza, zzamxVar4.zzb));
                    zzamx zzamxVar5 = this.zzb;
                    zzfg zze2 = zzfh.zze(zzamxVar5.zza, 4, zzamxVar5.zzb);
                    zzamx zzamxVar6 = this.zzc;
                    zzff zzd2 = zzfh.zzd(zzamxVar6.zza, 4, zzamxVar6.zzb);
                    i2 = i4;
                    String zza2 = zzdk.zza(zze2.zza, zze2.zzb, zze2.zzc);
                    zzadp zzadpVar = this.zzh;
                    zzad zzadVar = new zzad();
                    i = zze;
                    zzadVar.zzK(this.zzg);
                    zzadVar.zzX("video/avc");
                    zzadVar.zzz(zza2);
                    zzadVar.zzac(zze2.zze);
                    zzadVar.zzI(zze2.zzf);
                    zzm zzmVar = new zzm();
                    zzmVar.zzc(zze2.zzj);
                    zzmVar.zzb(zze2.zzk);
                    zzmVar.zzd(zze2.zzl);
                    zzmVar.zzf(zze2.zzh + 8);
                    zzmVar.zza(zze2.zzi + 8);
                    zzadVar.zzA(zzmVar.zzg());
                    zzadVar.zzT(zze2.zzg);
                    zzadVar.zzL(arrayList);
                    zzadpVar.zzl(zzadVar.zzad());
                    this.zzj = true;
                    this.zzi.zzc(zze2);
                    this.zzi.zzb(zzd2);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
                if (this.zzd.zzd(i8)) {
                    zzamx zzamxVar7 = this.zzd;
                    this.zzm.zzI(this.zzd.zza, zzfh.zzb(zzamxVar7.zza, zzamxVar7.zzb));
                    this.zzm.zzK(4);
                    this.zza.zza(j2, this.zzm);
                }
                if (this.zzi.zzf(j, i7, this.zzj)) {
                    this.zzl = false;
                }
                long j3 = this.zzk;
                if (this.zzj) {
                    this.zzb.zzc(i5);
                    this.zzc.zzc(i5);
                }
                this.zzd.zzc(i5);
                this.zzi.zze(j, i5, j3, this.zzl);
                zzd = i2;
                zze = i;
            }
            i = zze;
            i2 = i4;
            if (this.zzd.zzd(i8)) {
            }
            if (this.zzi.zzf(j, i7, this.zzj)) {
            }
            long j32 = this.zzk;
            if (this.zzj) {
            }
            this.zzd.zzc(i5);
            this.zzi.zze(j, i5, j32, this.zzl);
            zzd = i2;
            zze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzg = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzaml(zzw, false, false);
        this.zza.zzb(zzacnVar, zzansVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
        zzdi.zzb(this.zzh);
        int i = zzet.zza;
        if (z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzk = j;
        int i2 = i & 2;
        this.zzl = (i2 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfh.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaml zzamlVar = this.zzi;
        if (zzamlVar != null) {
            zzamlVar.zzd();
        }
    }
}
