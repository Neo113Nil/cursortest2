package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaeq implements zzack {
    private zzacn zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaep zzo;
    private zzaeu zzp;
    private final zzek zza = new zzek(4);
    private final zzek zzb = new zzek(9);
    private final zzek zzc = new zzek(11);
    private final zzek zzd = new zzek();
    private final zzaer zze = new zzaer();
    private int zzg = 1;

    private final zzek zza(zzacl zzaclVar) throws IOException {
        if (this.zzl > this.zzd.zzc()) {
            zzek zzekVar = this.zzd;
            int zzc = zzekVar.zzc();
            zzekVar.zzI(new byte[Math.max(zzc + zzc, this.zzl)], 0);
        } else {
            this.zzd.zzK(0);
        }
        this.zzd.zzJ(this.zzl);
        ((zzaby) zzaclVar).zzn(this.zzd.zzM(), 0, this.zzl, false);
        return this.zzd;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzO(new zzadh(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        boolean zzf;
        boolean z;
        zzdi.zzb(this.zzf);
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzaby) zzaclVar).zzo(this.zzj, false);
                    this.zzj = 0;
                    this.zzg = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    long j = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                    int i3 = this.zzk;
                    if (i3 != 8) {
                        i2 = i3;
                    } else if (this.zzo != null) {
                        zzg();
                        zzf = this.zzo.zzf(zza(zzaclVar), j);
                        z = true;
                        if (!this.zzh && zzf) {
                            this.zzh = true;
                            this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                        }
                        this.zzj = 4;
                        this.zzg = 2;
                        if (!z) {
                            return 0;
                        }
                    }
                    if (i2 == 9) {
                        if (this.zzp != null) {
                            zzg();
                            zzf = this.zzp.zzf(zza(zzaclVar), j);
                            z = true;
                        }
                        ((zzaby) zzaclVar).zzo(this.zzl, false);
                        zzf = false;
                        z = false;
                    } else {
                        if (i2 == 18 && !this.zzn) {
                            zzf = this.zze.zzf(zza(zzaclVar), j);
                            zzaer zzaerVar = this.zze;
                            long zzc = zzaerVar.zzc();
                            if (zzc != -9223372036854775807L) {
                                this.zzf.zzO(new zzadb(zzaerVar.zzd(), zzaerVar.zze(), zzc));
                                this.zzn = true;
                            }
                            z = true;
                        }
                        ((zzaby) zzaclVar).zzo(this.zzl, false);
                        zzf = false;
                        z = false;
                    }
                    if (!this.zzh) {
                        this.zzh = true;
                        this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (!z) {
                    }
                } else {
                    if (!zzaclVar.zzn(this.zzc.zzM(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzc.zzK(0);
                    this.zzk = this.zzc.zzm();
                    this.zzl = this.zzc.zzo();
                    this.zzm = this.zzc.zzo();
                    this.zzm = ((this.zzc.zzm() << 24) | this.zzm) * 1000;
                    this.zzc.zzL(3);
                    this.zzg = 4;
                }
            } else {
                if (!zzaclVar.zzn(this.zzb.zzM(), 0, 9, true)) {
                    return -1;
                }
                this.zzb.zzK(0);
                this.zzb.zzL(4);
                int zzm = this.zzb.zzm();
                int i4 = zzm & 4;
                int i5 = zzm & 1;
                if (i4 != 0 && this.zzo == null) {
                    this.zzo = new zzaep(this.zzf.zzw(8, 1));
                }
                if (i5 != 0 && this.zzp == null) {
                    this.zzp = new zzaeu(this.zzf.zzw(9, 2));
                }
                this.zzf.zzD();
                this.zzj = this.zzb.zzg() - 5;
                this.zzg = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzf = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(this.zza.zzM(), 0, 3, false);
        this.zza.zzK(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzabyVar.zzm(this.zza.zzM(), 0, 2, false);
        this.zza.zzK(0);
        if ((this.zza.zzq() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzabyVar.zzm(this.zza.zzM(), 0, 4, false);
        this.zza.zzK(0);
        int zzg = this.zza.zzg();
        zzaclVar.zzj();
        zzabyVar.zzl(zzg, false);
        zzabyVar.zzm(this.zza.zzM(), 0, 4, false);
        this.zza.zzK(0);
        return this.zza.zzg() == 0;
    }
}
