package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zztu implements zzwc {
    protected final zzwc[] zza;

    public zztu(zzwc[] zzwcVarArr) {
        this.zza = zzwcVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzwc zzwcVar : this.zza) {
            long zzb = zzwcVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzwc zzwcVar : this.zza) {
            long zzc = zzwcVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final void zzm(long j) {
        for (zzwc zzwcVar : this.zza) {
            zzwcVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final boolean zzo(zzla zzlaVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            long j = Long.MIN_VALUE;
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            zzwc[] zzwcVarArr = this.zza;
            int length = zzwcVarArr.length;
            int i = 0;
            z = false;
            while (i < length) {
                zzwc zzwcVar = zzwcVarArr[i];
                long zzc2 = zzwcVar.zzc();
                boolean z3 = zzc2 != j && zzc2 <= zzlaVar.zza;
                if (zzc2 == zzc || z3) {
                    z |= zzwcVar.zzo(zzlaVar);
                }
                i++;
                j = Long.MIN_VALUE;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final boolean zzp() {
        for (zzwc zzwcVar : this.zza) {
            if (zzwcVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
