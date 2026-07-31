package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class zzcy extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzdc zzdcVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzf = this.zzb.zzf(null, 0L, this);
        return zzf == AbstractC1241b.f() ? zzf : Result.a(zzf);
    }
}
