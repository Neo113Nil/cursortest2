package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class zzdv extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdv(zzec zzecVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzb = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzl = this.zzb.zzl(null, this);
        return zzl;
    }
}
