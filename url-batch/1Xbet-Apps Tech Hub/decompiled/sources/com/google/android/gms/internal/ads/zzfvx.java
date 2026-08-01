package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfvx extends AbstractSet {
    final /* synthetic */ zzfwd zza;

    zzfvx(zzfwd zzfwdVar) {
        this.zza = zzfwdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzq;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzq = this.zza.zzq(entry.getKey());
            if (zzq != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzftt.zza(objArr[zzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfwd zzfwdVar = this.zza;
        Map zzj = zzfwdVar.zzj();
        return zzj != null ? zzj.entrySet().iterator() : new zzfvv(zzfwdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzp;
        int i;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfwd zzfwdVar = this.zza;
        if (zzfwdVar.zzo()) {
            return false;
        }
        zzp = zzfwdVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfwd zzfwdVar2 = this.zza;
        Object zzh = zzfwd.zzh(zzfwdVar2);
        int[] iArr = zzfwdVar2.zza;
        iArr.getClass();
        zzfwd zzfwdVar3 = this.zza;
        Object[] objArr = zzfwdVar3.zzb;
        objArr.getClass();
        Object[] objArr2 = zzfwdVar3.zzc;
        objArr2.getClass();
        int zzb = zzfwe.zzb(key, value, zzp, zzh, iArr, objArr, objArr2);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzn(zzb, zzp);
        zzfwd zzfwdVar4 = this.zza;
        i = zzfwdVar4.zzg;
        zzfwdVar4.zzg = i - 1;
        this.zza.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
