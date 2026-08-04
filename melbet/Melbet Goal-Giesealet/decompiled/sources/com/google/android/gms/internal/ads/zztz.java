package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zztz implements zzwh {
    private final zzgjz zza;
    private long zzb;

    public zztz(List list, List list2) {
        int i = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        zzghc.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgjwVar.zzf(new zzty((zzwh) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgjwVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                return;
            }
            ((zzty) zzgjzVar.get(i)).zzg(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                break;
            }
            zzty zztyVar = (zzty) zzgjzVar.get(i);
            long zzi = zztyVar.zzi();
            if ((zztyVar.zza().contains(1) || zztyVar.zza().contains(2) || zztyVar.zza().contains(4)) && zzi != Long.MIN_VALUE) {
                j = Math.min(j, zzi);
            }
            if (zzi != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzi);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.zzb;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                break;
            }
            long zzl = ((zzty) zzgjzVar.get(i)).zzl();
            if (zzl != Long.MIN_VALUE) {
                j = Math.min(j, zzl);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzl = zzl();
            if (zzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                zzgjz zzgjzVar = this.zza;
                if (i >= zzgjzVar.size()) {
                    break;
                }
                long zzl2 = ((zzty) zzgjzVar.get(i)).zzl();
                boolean z3 = zzl2 != Long.MIN_VALUE && zzl2 <= zzklVar.zza;
                if (zzl2 == zzl || z3) {
                    z |= ((zzty) zzgjzVar.get(i)).zzm(zzklVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                return false;
            }
            if (((zzty) zzgjzVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}
