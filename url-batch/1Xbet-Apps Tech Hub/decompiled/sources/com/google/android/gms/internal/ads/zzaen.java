package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaen implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzaem
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzaen.zza;
            return new zzace[]{new zzaen()};
        }
    };
    private zzach zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzael zzp;
    private zzaer zzq;
    private final zzfj zzb = new zzfj(4);
    private final zzfj zzc = new zzfj(9);
    private final zzfj zzd = new zzfj(11);
    private final zzfj zze = new zzfj();
    private final zzaeo zzf = new zzaeo();
    private int zzh = 1;

    private final zzfj zza(zzacf zzacfVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzfj zzfjVar = this.zze;
            int zzb = zzfjVar.zzb();
            zzfjVar.zzE(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzG(0);
        }
        this.zze.zzF(this.zzm);
        ((zzabu) zzacfVar).zzn(this.zze.zzI(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzO(new zzadd(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        boolean zzf;
        boolean z;
        zzef.zzb(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzabu) zzacfVar).zzo(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    long j = this.zzi ? this.zzj + this.zzn : this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                    int i3 = this.zzl;
                    if (i3 != 8) {
                        i2 = i3;
                    } else if (this.zzp != null) {
                        zzf();
                        zzf = this.zzp.zzf(zza(zzacfVar), j);
                        z = true;
                        if (!this.zzi && zzf) {
                            this.zzi = true;
                            this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (!z) {
                            return 0;
                        }
                    }
                    if (i2 == 9) {
                        if (this.zzq != null) {
                            zzf();
                            zzf = this.zzq.zzf(zza(zzacfVar), j);
                            z = true;
                        }
                        ((zzabu) zzacfVar).zzo(this.zzm, false);
                        zzf = false;
                        z = false;
                    } else {
                        if (i2 == 18 && !this.zzo) {
                            zzf = this.zzf.zzf(zza(zzacfVar), j);
                            zzaeo zzaeoVar = this.zzf;
                            long zzc = zzaeoVar.zzc();
                            if (zzc != -9223372036854775807L) {
                                this.zzg.zzO(new zzacx(zzaeoVar.zzd(), zzaeoVar.zze(), zzc));
                                this.zzo = true;
                            }
                            z = true;
                        }
                        ((zzabu) zzacfVar).zzo(this.zzm, false);
                        zzf = false;
                        z = false;
                    }
                    if (!this.zzi) {
                        this.zzi = true;
                        this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                    }
                    this.zzk = 4;
                    this.zzh = 2;
                    if (!z) {
                    }
                } else {
                    if (!zzacfVar.zzn(this.zzd.zzI(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzd.zzG(0);
                    this.zzl = this.zzd.zzl();
                    this.zzm = this.zzd.zzn();
                    this.zzn = this.zzd.zzn();
                    this.zzn = ((this.zzd.zzl() << 24) | this.zzn) * 1000;
                    this.zzd.zzH(3);
                    this.zzh = 4;
                }
            } else {
                if (!zzacfVar.zzn(this.zzc.zzI(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzG(0);
                this.zzc.zzH(4);
                int zzl = this.zzc.zzl();
                int i4 = zzl & 4;
                int i5 = zzl & 1;
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzael(this.zzg.zzw(8, 1));
                }
                if (i5 != 0 && this.zzq == null) {
                    this.zzq = new zzaer(this.zzg.zzw(9, 2));
                }
                this.zzg.zzD();
                this.zzk = this.zzc.zzf() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzg = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        zzabu zzabuVar = (zzabu) zzacfVar;
        zzabuVar.zzm(this.zzb.zzI(), 0, 3, false);
        this.zzb.zzG(0);
        if (this.zzb.zzn() != 4607062) {
            return false;
        }
        zzabuVar.zzm(this.zzb.zzI(), 0, 2, false);
        this.zzb.zzG(0);
        if ((this.zzb.zzp() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzabuVar.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        int zzf = this.zzb.zzf();
        zzacfVar.zzj();
        zzabuVar.zzl(zzf, false);
        zzabuVar.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        return this.zzb.zzf() == 0;
    }
}
