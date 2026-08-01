package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxi extends zzgxk {
    private zzgxi() {
        super(null);
    }

    /* synthetic */ zzgxi(zzgxh zzgxhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    final List zza(Object obj, long j) {
        zzgwv zzgwvVar = (zzgwv) zzgzq.zzh(obj, j);
        if (zzgwvVar.zzc()) {
            return zzgwvVar;
        }
        int size = zzgwvVar.size();
        zzgwv zzd = zzgwvVar.zzd(size == 0 ? 10 : size + size);
        zzgzq.zzv(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    final void zzb(Object obj, long j) {
        ((zzgwv) zzgzq.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    final void zzc(Object obj, Object obj2, long j) {
        zzgwv zzgwvVar = (zzgwv) zzgzq.zzh(obj, j);
        zzgwv zzgwvVar2 = (zzgwv) zzgzq.zzh(obj2, j);
        int size = zzgwvVar.size();
        int size2 = zzgwvVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgwvVar.zzc()) {
                zzgwvVar = zzgwvVar.zzd(size2 + size);
            }
            zzgwvVar.addAll(zzgwvVar2);
        }
        if (size > 0) {
            zzgwvVar2 = zzgwvVar;
        }
        zzgzq.zzv(obj, j, zzgwvVar2);
    }
}
