package com.google.android.gms.internal.maps;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzbp extends zzbi {
    final /* synthetic */ zzbq zza;

    zzbp(zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        int i9;
        Object[] objArr;
        Object[] objArr2;
        i9 = this.zza.zzc;
        zzba.zza(i8, i9, "index");
        objArr = this.zza.zzb;
        int i10 = i8 + i8;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i8;
        i8 = this.zza.zzc;
        return i8;
    }
}
