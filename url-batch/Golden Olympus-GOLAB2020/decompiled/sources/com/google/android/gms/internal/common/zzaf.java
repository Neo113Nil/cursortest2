package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes.dex */
final class zzaf extends zzah {
    private final transient zzah zza;

    zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i4) {
        return (this.zza.size() - 1) - i4;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzah zzahVar = this.zza;
        zzr.zzb(i4, zzahVar.size(), FirebaseAnalytics.Param.INDEX);
        return zzahVar.get(zzs(i4));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzs(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzs(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
        return subList(i4, i5);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* renamed from: zzi */
    public final zzah subList(int i4, int i5) {
        zzah zzahVar = this.zza;
        zzr.zzd(i4, i5, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i5, zzahVar.size() - i4).zzh();
    }
}
