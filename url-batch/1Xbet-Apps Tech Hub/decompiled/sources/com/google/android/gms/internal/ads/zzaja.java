package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaja {
    private final zzajb zza = new zzajb();
    private final zzfj zzb = new zzfj(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzaja() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzajb zzajbVar = this.zza;
            if (i5 >= zzajbVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzajbVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzfj zza() {
        return this.zzb;
    }

    public final zzajb zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzD(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfj zzfjVar = this.zzb;
        if (zzfjVar.zzI().length == 65025) {
            return;
        }
        zzfjVar.zzE(Arrays.copyOf(zzfjVar.zzI(), Math.max(65025, zzfjVar.zzd())), this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzacf zzacfVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzD(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzacfVar, -1L) || !this.zza.zzb(zzacfVar, true)) {
                    break;
                }
                zzajb zzajbVar = this.zza;
                int i2 = zzajbVar.zzd;
                if ((zzajbVar.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzaci.zze(zzacfVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzfj zzfjVar = this.zzb;
                zzfjVar.zzA(zzfjVar.zzd() + zzf);
                zzfj zzfjVar2 = this.zzb;
                if (!zzaci.zzd(zzacfVar, zzfjVar2.zzI(), zzfjVar2.zzd(), zzf)) {
                    return false;
                }
                zzfj zzfjVar3 = this.zzb;
                zzfjVar3.zzF(zzfjVar3.zzd() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
