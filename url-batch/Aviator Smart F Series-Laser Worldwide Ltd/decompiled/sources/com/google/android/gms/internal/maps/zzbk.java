package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbk {
    Object[] zza;
    int zzb;
    zzbj zzc;

    public zzbk() {
        this(4);
    }

    private final void zzb(int i8) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int highestOneBit = Integer.highestOneBit(i9 - 1);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbk zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzbd.zza(key, value);
            Object[] objArr = this.zza;
            int i8 = this.zzb;
            int i9 = i8 + i8;
            objArr[i9] = key;
            objArr[i9 + 1] = value;
            this.zzb = i8 + 1;
        }
        return this;
    }

    zzbk(int i8) {
        this.zza = new Object[i8 + i8];
        this.zzb = 0;
    }
}
