package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaky implements zzall {
    private final zzakx zza;
    private final zzfj zzb = new zzfj(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaky(zzakx zzakxVar) {
        this.zza = zzakxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzall
    public final void zza(zzfj zzfjVar, int i) {
        int i2 = i & 1;
        int zzc = i2 != 0 ? zzfjVar.zzc() + zzfjVar.zzl() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzfjVar.zzG(zzc);
            this.zzd = 0;
        }
        while (zzfjVar.zza() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzl = zzfjVar.zzl();
                    zzfjVar.zzG(zzfjVar.zzc() - 1);
                    if (zzl == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfjVar.zza(), 3 - this.zzd);
                zzfjVar.zzC(this.zzb.zzI(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzG(0);
                    this.zzb.zzF(3);
                    this.zzb.zzH(1);
                    zzfj zzfjVar2 = this.zzb;
                    int zzl2 = zzfjVar2.zzl();
                    boolean z = (zzl2 & 128) != 0;
                    int zzl3 = zzfjVar2.zzl();
                    this.zze = z;
                    this.zzc = (zzl3 | ((zzl2 & 15) << 8)) + 3;
                    int zzb = this.zzb.zzb();
                    int i5 = this.zzc;
                    if (zzb < i5) {
                        int zzb2 = this.zzb.zzb();
                        this.zzb.zzA(Math.min(4098, Math.max(i5, zzb2 + zzb2)));
                    }
                }
            } else {
                int min2 = Math.min(zzfjVar.zza(), this.zzc - i3);
                zzfjVar.zzC(this.zzb.zzI(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzF(i7);
                    } else {
                        if (zzfs.zzd(this.zzb.zzI(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzF(this.zzc - 4);
                    }
                    this.zzb.zzG(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzall
    public final void zzb(zzfq zzfqVar, zzach zzachVar, zzalk zzalkVar) {
        this.zza.zzb(zzfqVar, zzachVar, zzalkVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzall
    public final void zzc() {
        this.zzf = true;
    }
}
