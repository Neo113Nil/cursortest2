package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzajh {
    private final zzaji zza = new zzaji();
    private final zzek zzb = new zzek(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzajh() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzaji zzajiVar = this.zza;
            if (i5 >= zzajiVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzajiVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzek zza() {
        return this.zzb;
    }

    public final zzaji zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzH(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzek zzekVar = this.zzb;
        if (zzekVar.zzM().length == 65025) {
            return;
        }
        zzekVar.zzI(Arrays.copyOf(zzekVar.zzM(), Math.max(65025, zzekVar.zze())), this.zzb.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzacl zzaclVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzH(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzaclVar, -1L) || !this.zza.zzb(zzaclVar, true)) {
                    break;
                }
                zzaji zzajiVar = this.zza;
                int i2 = zzajiVar.zzd;
                if ((zzajiVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzaco.zze(zzaclVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzek zzekVar = this.zzb;
                zzekVar.zzE(zzekVar.zze() + zzf);
                zzek zzekVar2 = this.zzb;
                if (!zzaco.zzd(zzaclVar, zzekVar2.zzM(), zzekVar2.zze(), zzf)) {
                    return false;
                }
                zzek zzekVar3 = this.zzb;
                zzekVar3.zzJ(zzekVar3.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
