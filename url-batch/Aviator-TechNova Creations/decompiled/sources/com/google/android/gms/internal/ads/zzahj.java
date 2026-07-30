package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzahj implements zzaeu {
    private zzaex zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzahh zzo;
    private zzahn zzp;
    private final zzer zza = new zzer(4);
    private final zzer zzb = new zzer(9);
    private final zzer zzc = new zzer(11);
    private final zzer zzd = new zzer();
    private final zzahk zze = new zzahk();
    private int zzg = 1;

    static {
        int i = zzahi.zza;
    }

    private final zzer zzh(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zzd;
        if (this.zzl > zzerVar.zzj()) {
            int zzj = zzerVar.zzj();
            zzerVar.zzb(new byte[Math.max(zzj + zzj, this.zzl)], 0);
        } else {
            zzerVar.zzh(0);
        }
        zzerVar.zzf(this.zzl);
        zzaevVar.zzc(zzerVar.zzi(), 0, this.zzl);
        return zzerVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 3, false);
        zzerVar.zzh(0);
        if (zzerVar.zzx() != 4607062) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 2, false);
        zzerVar.zzh(0);
        if ((zzerVar.zzt() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        int zzB = zzerVar.zzB();
        zzaevVar.zzl();
        zzaelVar.zzj(zzB, false);
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        return zzerVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean zzf;
        boolean z;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                zzer zzerVar = this.zzb;
                if (!zzaevVar.zzb(zzerVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzerVar.zzh(0);
                zzerVar.zzk(4);
                int zzs = zzerVar.zzs();
                int i3 = zzs & 4;
                int i4 = zzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new zzahh(this.zzf.zzu(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzahn(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzerVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzaevVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                zzer zzerVar2 = this.zzc;
                if (!zzaevVar.zzb(zzerVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzerVar2.zzh(0);
                this.zzk = zzerVar2.zzs();
                this.zzl = zzerVar2.zzx();
                this.zzm = zzerVar2.zzx();
                this.zzm = ((zzerVar2.zzs() << 24) | this.zzm) * 1000;
                zzerVar2.zzk(3);
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
                    zzi();
                    zzf = this.zzo.zzf(zzh(zzaevVar), j);
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
                        zzi();
                        zzf = this.zzp.zzf(zzh(zzaevVar), j);
                        z = true;
                    }
                    zzaevVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                } else {
                    if (i2 == 18 && !this.zzn) {
                        zzahk zzahkVar = this.zze;
                        zzf = zzahkVar.zzf(zzh(zzaevVar), j);
                        long zzc = zzahkVar.zzc();
                        if (zzc != -9223372036854775807L) {
                            this.zzf.zzw(new zzafq(zzahkVar.zze(), zzahkVar.zzd(), zzc));
                            this.zzn = true;
                        }
                        z = true;
                    }
                    zzaevVar.zzf(this.zzl);
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
