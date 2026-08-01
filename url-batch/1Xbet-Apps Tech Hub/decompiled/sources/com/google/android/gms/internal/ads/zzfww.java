package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfww {
    Object[] zza;
    int zzb;
    zzfwv zzc;

    public zzfww() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfwo.zze(length, i2));
        }
    }

    public final zzfww zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfvr.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfww zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfwx zzc() {
        zzfwv zzfwvVar = this.zzc;
        if (zzfwvVar != null) {
            throw zzfwvVar.zza();
        }
        zzfyj zzj = zzfyj.zzj(this.zzb, this.zza, this);
        zzfwv zzfwvVar2 = this.zzc;
        if (zzfwvVar2 == null) {
            return zzj;
        }
        throw zzfwvVar2.zza();
    }

    zzfww(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
