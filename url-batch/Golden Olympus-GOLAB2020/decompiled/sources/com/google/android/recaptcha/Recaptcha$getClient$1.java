package com.google.android.recaptcha;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m11getClientBWLJW6A = this.zzb.m11getClientBWLJW6A(null, null, 0L, this);
        return m11getClientBWLJW6A == AbstractC1241b.f() ? m11getClientBWLJW6A : Result.a(m11getClientBWLJW6A);
    }
}
