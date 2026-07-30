package com.google.android.gms.internal.maps;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzbs extends zzbi {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzbs(Object[] objArr, int i8, int i9) {
        this.zza = objArr;
        this.zzb = i8;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzba.zza(i8, this.zzc, "index");
        Object obj = this.zza[i8 + i8 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
