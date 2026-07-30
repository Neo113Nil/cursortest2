package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzix extends zziu {
    public zzix() {
        super(4);
    }

    public final zzix zza(Object... objArr) {
        zzjd.zzb(objArr, 15);
        int i8 = this.zzb;
        int i9 = i8 + 15;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (length < i9) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int highestOneBit = Integer.highestOneBit(i8 + 14);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr2, i10);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr2.clone();
            this.zzc = false;
        }
        System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
        this.zzb += 15;
        return this;
    }

    public final zzja zzb() {
        this.zzc = true;
        return zzja.zzg(this.zza, this.zzb);
    }
}
