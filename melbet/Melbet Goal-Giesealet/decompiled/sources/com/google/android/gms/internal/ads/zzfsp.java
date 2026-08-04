package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfsp extends ContinuationImpl {
    Object zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzftd zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsp(zzftd zzftdVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        zzv = this.zzd.zzv(this);
        return zzv;
    }
}
