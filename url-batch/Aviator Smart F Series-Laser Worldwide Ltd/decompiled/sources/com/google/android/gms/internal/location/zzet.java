package com.google.android.gms.internal.location;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzet extends zzes {
    static final zzes zza = new zzet(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzet(Object[] objArr, int i8) {
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzem.zzc(i8, this.zzc, "index");
        Object obj = this.zzb[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzep
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzep
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzep
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzep
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzes, com.google.android.gms.internal.location.zzep
    final int zzg(Object[] objArr, int i8) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
