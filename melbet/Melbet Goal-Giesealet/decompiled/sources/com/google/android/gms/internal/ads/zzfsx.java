package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfsx extends ContinuationImpl {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzftd zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsx(zzftd zzftdVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzh(this);
    }
}
