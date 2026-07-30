package com.google.android.gms.internal.fitness;

import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzfl extends zzfm {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfm zzc;

    zzfl(zzfm zzfmVar, int i8, int i9) {
        this.zzc = zzfmVar;
        this.zza = i8;
        this.zzb = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzff.zza(i8, this.zzb, "index");
        return this.zzc.get(i8 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fitness.zzfm, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj
    @CheckForNull
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fitness.zzfm
    /* renamed from: zzf */
    public final zzfm subList(int i8, int i9) {
        zzff.zzc(i8, i9, this.zzb);
        zzfm zzfmVar = this.zzc;
        int i10 = this.zza;
        return zzfmVar.subList(i8 + i10, i9 + i10);
    }
}
