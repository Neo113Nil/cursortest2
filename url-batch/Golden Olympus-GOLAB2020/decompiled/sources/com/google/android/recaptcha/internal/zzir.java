package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class zzir extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzir(zzja zzjaVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == AbstractC1241b.f() ? zzh : Result.a(zzh);
    }
}
