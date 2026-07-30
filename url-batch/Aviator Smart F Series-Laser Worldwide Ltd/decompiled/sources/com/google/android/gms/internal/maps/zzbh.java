package com.google.android.gms.internal.maps;

import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzbh extends zzbi {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbi zzc;

    zzbh(zzbi zzbiVar, int i8, int i9) {
        this.zzc = zzbiVar;
        this.zza = i8;
        this.zzb = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzba.zza(i8, this.zzb, "index");
        return this.zzc.get(i8 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbi, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    @CheckForNull
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzbi
    /* renamed from: zzf */
    public final zzbi subList(int i8, int i9) {
        zzba.zzc(i8, i9, this.zzb);
        int i10 = this.zza;
        return this.zzc.subList(i8 + i10, i9 + i10);
    }
}
