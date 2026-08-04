package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgkb {
    Object[] zza;
    int zzb;
    zzgka zzc;

    public zzgkb() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzgju.zze(length, i2));
        }
    }

    public final zzgkb zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzgiz.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzgkb zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgkc zzc() {
        zzgka zzgkaVar = this.zzc;
        if (zzgkaVar != null) {
            throw zzgkaVar.zza();
        }
        zzglp zzj = zzglp.zzj(this.zzb, this.zza, this);
        zzgka zzgkaVar2 = this.zzc;
        if (zzgkaVar2 == null) {
            return zzj;
        }
        throw zzgkaVar2.zza();
    }

    zzgkb(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
