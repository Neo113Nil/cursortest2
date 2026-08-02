package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzahk {
    private final zzek zza = new zzek(8);
    private int zzb;

    private final long zzb(zzacl zzaclVar) throws IOException {
        int i;
        zzaby zzabyVar = (zzaby) zzaclVar;
        int i2 = 0;
        zzabyVar.zzm(this.zza.zzM(), 0, 1, false);
        int i3 = this.zza.zzM()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzabyVar.zzm(this.zza.zzM(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.zza.zzM()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzacl zzaclVar) throws IOException {
        long zzd = zzaclVar.zzd();
        long j = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j = zzd;
        }
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(this.zza.zzM(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzabyVar.zzm(this.zza.zzM(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzM()[0] & 255);
        }
        long zzb = zzb(zzaclVar);
        long j2 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j3 = j2 + zzb;
            if (zzd == -1 || j3 < zzd) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzaclVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzaclVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i3 = (int) zzb2;
                            zzabyVar.zzl(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
