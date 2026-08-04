package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfsj extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsj(String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfsj zzfsjVar = new zzfsj(this.zzb, continuation);
        zzfsjVar.zza = obj;
        return zzfsjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsj) create((zzfrz) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzfsb zza = zzfsa.zza((zzfrx) ((zzfrz) this.zza).zzcc());
        zza.zzd(zza.zzb(), this.zzb);
        return zza.zza();
    }
}
