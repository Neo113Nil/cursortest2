package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzje extends zzja {
    static final zzja zza = new zzje(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzje(Object[] objArr, int i8) {
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzij.zza(i8, this.zzc, "index");
        Object obj = this.zzb[i8];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zziw
    final int zza(Object[] objArr, int i8) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final Object[] zze() {
        return this.zzb;
    }
}
