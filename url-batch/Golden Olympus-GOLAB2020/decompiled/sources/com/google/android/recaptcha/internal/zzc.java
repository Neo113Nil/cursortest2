package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class zzc extends d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zze zzeVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzc = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        return zze == AbstractC1241b.f() ? zze : Result.a(zze);
    }
}
