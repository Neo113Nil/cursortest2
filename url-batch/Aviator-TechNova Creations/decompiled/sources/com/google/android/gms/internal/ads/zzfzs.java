package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfzs extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzs(zzfyu zzfyuVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, continuation);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzs) create((zzfyy) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzfza zza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zziev zzb = zza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String zza2 = zzfyuVar.zza();
        Intrinsics.checkNotNullExpressionValue(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzfyuVar);
        return zza.zza();
    }
}
