package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgwq extends zzgup {
    final transient Object zza;

    zzgwq(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgup, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgux(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append("[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    /* renamed from: zza */
    public final zzgwt iterator() {
        return new zzgux(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    public final zzguf zze() {
        return zzguf.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
