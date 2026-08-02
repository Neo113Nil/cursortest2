package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzfwu extends AbstractSet {
    final /* synthetic */ zzfxa zza;

    zzfwu(zzfxa zzfxaVar) {
        this.zza = zzfxaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfur.zza(zzfxa.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfxa zzfxaVar = this.zza;
        Map zzl = zzfxaVar.zzl();
        return zzl != null ? zzl.entrySet().iterator() : new zzfws(zzfxaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzv;
        Object requireNonNull;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfxa zzfxaVar = this.zza;
        if (zzfxaVar.zzr()) {
            return false;
        }
        zzv = zzfxaVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfxa zzfxaVar2 = this.zza;
        requireNonNull = Objects.requireNonNull(zzfxaVar2.zze);
        zzA = zzfxaVar2.zzA();
        zzB = zzfxaVar2.zzB();
        zzC = zzfxaVar2.zzC();
        int zzb = zzfxb.zzb(key, value, zzv, requireNonNull, zzA, zzB, zzC);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzq(zzb, zzv);
        zzfxa zzfxaVar3 = this.zza;
        i = zzfxaVar3.zzg;
        zzfxaVar3.zzg = i - 1;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
