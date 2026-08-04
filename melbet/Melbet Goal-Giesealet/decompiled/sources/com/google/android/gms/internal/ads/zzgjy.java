package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgjy extends zzgjz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgjz zzc;

    zzgjy(zzgjz zzgjzVar, int i, int i2) {
        Objects.requireNonNull(zzgjzVar);
        this.zzc = zzgjzVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzghc.zzm(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz
    /* renamed from: zzh */
    public final zzgjz subList(int i, int i2) {
        zzghc.zzo(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
