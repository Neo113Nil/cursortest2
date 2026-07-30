package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgwb extends zzguf {
    final /* synthetic */ zzgwc zza;

    zzgwb(zzgwc zzgwcVar) {
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgwc zzgwcVar = this.zza;
        zzgrc.zzm(i, zzgwcVar.zzw(), FirebaseAnalytics.Param.INDEX);
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzgwcVar.zzv()[i2]), Objects.requireNonNull(zzgwcVar.zzv()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }
}
