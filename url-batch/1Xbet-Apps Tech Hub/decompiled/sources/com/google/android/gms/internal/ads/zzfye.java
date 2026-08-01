package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfye extends zzfwu {
    static final zzfwu zza = new zzfye(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzfye(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfty.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, com.google.android.gms.internal.ads.zzfwp
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final Object[] zzg() {
        return this.zzb;
    }
}
