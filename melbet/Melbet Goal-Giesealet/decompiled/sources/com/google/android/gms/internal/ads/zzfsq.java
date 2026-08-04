package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfsq extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfrv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsq(zzfrv zzfrvVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfrvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfsq zzfsqVar = new zzfsq(this.zzb, continuation);
        zzfsqVar.zza = obj;
        return zzfsqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsq) create((zzfrz) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzfsb zza = zzfsa.zza((zzfrx) ((zzfrz) this.zza).zzcc());
        zzhll zzb = zza.zzb();
        zzfrv zzfrvVar = this.zzb;
        String zza2 = zzfrvVar.zza();
        Intrinsics.checkNotNullExpressionValue(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzfrvVar);
        return zza.zza();
    }
}
