package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzafd implements zzacu {
    private zzacx zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafb zzo;
    private zzafh zzp;
    private final zzef zza = new zzef(4);
    private final zzef zzb = new zzef(9);
    private final zzef zzc = new zzef(11);
    private final zzef zzd = new zzef();
    private final zzafe zze = new zzafe();
    private int zzg = 1;

    static {
        int i = zzafc.zza;
    }

    private final zzef zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zzd;
        if (this.zzl > zzefVar.zzj()) {
            int zzj = zzefVar.zzj();
            zzefVar.zzb(new byte[Math.max(zzj + zzj, this.zzl)], 0);
        } else {
            zzefVar.zzh(0);
        }
        zzefVar.zzf(this.zzl);
        zzacvVar.zzc(zzefVar.zzi(), 0, this.zzl);
        return zzefVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzb() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzadu(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 3, false);
        zzefVar.zzh(0);
        if (zzefVar.zzx() != 4607062) {
            return false;
        }
        zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
        zzefVar.zzh(0);
        if ((zzefVar.zzt() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        zzefVar.zzh(0);
        int zzB = zzefVar.zzB();
        zzacvVar.zzl();
        zzaclVar.zzj(zzB, false);
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        zzefVar.zzh(0);
        return zzefVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean zzf;
        boolean z;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                zzef zzefVar = this.zzb;
                if (!zzacvVar.zzb(zzefVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzefVar.zzh(0);
                zzefVar.zzk(4);
                int zzs = zzefVar.zzs();
                int i3 = zzs & 4;
                int i4 = zzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new zzafb(this.zzf.zzu(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzafh(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzefVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzacvVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                zzef zzefVar2 = this.zzc;
                if (!zzacvVar.zzb(zzefVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzefVar2.zzh(0);
                this.zzk = zzefVar2.zzs();
                this.zzl = zzefVar2.zzx();
                this.zzm = zzefVar2.zzx();
                this.zzm = ((zzefVar2.zzs() << 24) | this.zzm) * 1000;
                zzefVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                long j = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                int i5 = this.zzk;
                if (i5 != 8) {
                    i2 = i5;
                } else if (this.zzo != null) {
                    zzb();
                    zzf = this.zzo.zzf(zza(zzacvVar), j);
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
                        zzb();
                        zzf = this.zzp.zzf(zza(zzacvVar), j);
                        z = true;
                    }
                    zzacvVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                } else {
                    if (i2 == 18 && !this.zzn) {
                        zzafe zzafeVar = this.zze;
                        zzf = zzafeVar.zzf(zza(zzacvVar), j);
                        long zzc = zzafeVar.zzc();
                        if (zzc != -9223372036854775807L) {
                            this.zzf.zzw(new zzadn(zzafeVar.zze(), zzafeVar.zzd(), zzc));
                            this.zzn = true;
                        }
                        z = true;
                    }
                    zzacvVar.zzf(this.zzl);
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
            }
        }
    }
}
