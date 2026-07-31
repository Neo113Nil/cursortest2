package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
final class zzeh extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeh(zzff zzffVar, boolean z4, int i4, String str, Object obj, Object obj2, Object obj3) {
        super(zzffVar, false);
        this.zza = str;
        this.zzb = obj;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzc.zzj;
        ((zzcv) Preconditions.checkNotNull(zzcvVar)).logHealthData(5, this.zza, ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
