package com.margelo.nitro.iap;

import com.margelo.nitro.core.NullType;
import com.margelo.nitro.iap.Variant_NullType_NitroProduct;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/Variant_NullType_NitroProduct;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$getPromotedProductIOS$1", f = "HybridRnIap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$getPromotedProductIOS$1 extends SuspendLambda implements Function1<Continuation<? super Variant_NullType_NitroProduct>, Object> {
    int label;

    HybridRnIap$getPromotedProductIOS$1(Continuation<? super HybridRnIap$getPromotedProductIOS$1> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$getPromotedProductIOS$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Variant_NullType_NitroProduct> continuation) {
        return ((HybridRnIap$getPromotedProductIOS$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Variant_NullType_NitroProduct.First(NullType.NULL);
    }
}
