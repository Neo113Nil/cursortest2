package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzftc extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzftd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzftc(zzftd zzftdVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzftc(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzftc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            this.zza = 1;
            if (this.zzb.zzk(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
