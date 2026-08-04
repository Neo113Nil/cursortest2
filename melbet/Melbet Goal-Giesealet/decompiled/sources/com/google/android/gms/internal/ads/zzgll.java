package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgll extends zzgjz {
    final /* synthetic */ zzglm zza;

    zzgll(zzglm zzglmVar) {
        Objects.requireNonNull(zzglmVar);
        this.zza = zzglmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzglm zzglmVar = this.zza;
        zzghc.zzm(i, zzglmVar.zzw(), "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzglmVar.zzv()[i2]), Objects.requireNonNull(zzglmVar.zzv()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return true;
    }
}
