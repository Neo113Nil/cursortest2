package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class zzdw extends d {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdw(zzec zzecVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzc = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzm = this.zzc.zzm(0L, this);
        return zzm;
    }
}
