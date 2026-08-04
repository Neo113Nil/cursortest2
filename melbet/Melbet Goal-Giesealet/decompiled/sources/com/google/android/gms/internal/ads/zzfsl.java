package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfsl extends ContinuationImpl {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzftd zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsl(zzftd zzftdVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzt;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzt = this.zzc.zzt(this);
        return zzt;
    }
}
