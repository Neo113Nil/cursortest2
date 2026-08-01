package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfyr extends zzfwz {
    final transient Object zza;

    zzfyr(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfxc(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp
    public final zzfwu zzd() {
        return zzfwu.zzm(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp
    /* renamed from: zze */
    public final zzfyu iterator() {
        return new zzfxc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final boolean zzf() {
        throw null;
    }
}
