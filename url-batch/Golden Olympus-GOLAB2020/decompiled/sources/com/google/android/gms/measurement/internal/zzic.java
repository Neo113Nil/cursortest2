package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zzic extends e {
    final /* synthetic */ zzif zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzic(zzif zzifVar, int i4) {
        super(20);
        this.zza = zzifVar;
    }

    @Override // androidx.collection.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        zzif zzifVar = this.zza;
        return zzifVar.zzu.zzf().zzx(null, zzgi.zzbn) ? zzif.zze(zzifVar, str) : zzif.zzd(zzifVar, str);
    }
}
