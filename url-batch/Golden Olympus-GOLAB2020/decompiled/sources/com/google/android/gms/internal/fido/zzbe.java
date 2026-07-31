package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzbe extends zzaz {
    final /* synthetic */ zzbf zza;

    zzbe(zzbf zzbfVar) {
        this.zza = zzbfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        zzbu zzbuVar;
        zzaz zzazVar;
        zzbuVar = this.zza.zza.zze;
        Object obj = zzbuVar.zzd.get(i4);
        zzazVar = this.zza.zza.zzf;
        return new AbstractMap.SimpleImmutableEntry(obj, zzazVar.get(i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
