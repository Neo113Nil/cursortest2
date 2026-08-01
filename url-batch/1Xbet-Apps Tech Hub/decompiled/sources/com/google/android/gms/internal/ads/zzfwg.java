package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfwg extends zzfwj {
    zzfwg() {
        super(null);
    }

    static final zzfwj zzf(int i) {
        zzfwj zzfwjVar;
        zzfwj zzfwjVar2;
        zzfwj zzfwjVar3;
        if (i < 0) {
            zzfwjVar3 = zzfwj.zzb;
            return zzfwjVar3;
        }
        if (i > 0) {
            zzfwjVar2 = zzfwj.zzc;
            return zzfwjVar2;
        }
        zzfwjVar = zzfwj.zza;
        return zzfwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final zzfwj zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final zzfwj zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final zzfwj zzd(boolean z, boolean z2) {
        return zzf(zzfzh.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final zzfwj zze(boolean z, boolean z2) {
        return zzf(zzfzh.zza(false, false));
    }
}
