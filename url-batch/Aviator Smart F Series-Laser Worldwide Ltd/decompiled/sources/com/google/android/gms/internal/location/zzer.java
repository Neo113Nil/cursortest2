package com.google.android.gms.internal.location;

import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzer extends zzes {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzes zzc;

    zzer(zzes zzesVar, int i8, int i9) {
        this.zzc = zzesVar;
        this.zza = i8;
        this.zzb = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzem.zzc(i8, this.zzb, "index");
        return this.zzc.get(i8 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzes, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.location.zzep
    @CheckForNull
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzep
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzep
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzep
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzes
    /* renamed from: zzh */
    public final zzes subList(int i8, int i9) {
        zzem.zze(i8, i9, this.zzb);
        int i10 = this.zza;
        return this.zzc.subList(i8 + i10, i9 + i10);
    }
}
