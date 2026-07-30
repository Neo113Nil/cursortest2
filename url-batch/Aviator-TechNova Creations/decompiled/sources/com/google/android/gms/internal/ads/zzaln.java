package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaln {
    private final zzalo zza = new zzalo();
    private final zzer zzb = new zzer(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzaln() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzalo zzaloVar = this.zza;
            if (i5 >= zzaloVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzaloVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzalo zzc() {
        return this.zza;
    }

    public final zzer zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzer zzerVar = this.zzb;
        if (zzerVar.zzi().length == 65025) {
            return;
        }
        zzerVar.zzb(Arrays.copyOf(zzerVar.zzi(), Math.max(65025, zzerVar.zze())), zzerVar.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzaev zzaevVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                zzalo zzaloVar = this.zza;
                if (!zzaloVar.zzb(zzaevVar, -1L) || !zzaloVar.zzc(zzaevVar, true)) {
                    break;
                }
                int i2 = zzaloVar.zzd;
                if ((zzaloVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzaey.zzd(zzaevVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzer zzerVar = this.zzb;
                zzerVar.zzc(zzerVar.zze() + zzf);
                if (!zzaey.zzc(zzaevVar, zzerVar.zzi(), zzerVar.zze(), zzf)) {
                    return false;
                }
                zzerVar.zzf(zzerVar.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
