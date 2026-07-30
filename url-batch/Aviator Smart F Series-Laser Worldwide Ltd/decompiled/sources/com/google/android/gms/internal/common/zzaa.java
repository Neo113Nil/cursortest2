package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* loaded from: classes3.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i8) {
    }

    @CanIgnoreReturnValue
    public final zzaa zza(Object obj) {
        obj.getClass();
        int i8 = this.zzb;
        int i9 = i8 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i9) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int highestOneBit = Integer.highestOneBit(i8);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i10);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        objArr2[i11] = obj;
        return this;
    }
}
