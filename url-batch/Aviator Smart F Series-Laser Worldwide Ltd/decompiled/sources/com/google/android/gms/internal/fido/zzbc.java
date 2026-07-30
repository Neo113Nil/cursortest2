package com.google.android.gms.internal.fido;

/* loaded from: classes3.dex */
final class zzbc extends zzaz {
    static final zzaz zza = new zzbc(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzbc(Object[] objArr, int i8) {
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzas.zza(i8, this.zzc, "index");
        Object obj = this.zzb[i8];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, com.google.android.gms.internal.fido.zzaw
    final int zza(Object[] objArr, int i8) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    final Object[] zze() {
        return this.zzb;
    }
}
