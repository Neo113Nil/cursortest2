package com.margelo.nitro.iap;

import com.margelo.nitro.core.NullType;
import com.margelo.nitro.iap.Variant_NullType_String;
import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/Variant_NullType_String;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$createAlternativeBillingTokenAndroid$1", f = "HybridRnIap.kt", i = {}, l = {1639}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$createAlternativeBillingTokenAndroid$1 extends SuspendLambda implements Function1<Continuation<? super Variant_NullType_String>, Object> {
    final /* synthetic */ Variant_NullType_String $sku;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$createAlternativeBillingTokenAndroid$1(HybridRnIap hybridRnIap, Variant_NullType_String variant_NullType_String, Continuation<? super HybridRnIap$createAlternativeBillingTokenAndroid$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
        this.$sku = variant_NullType_String;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$createAlternativeBillingTokenAndroid$1(this.this$0, this.$sku, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Variant_NullType_String> continuation) {
        return ((HybridRnIap$createAlternativeBillingTokenAndroid$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapError parseOpenIapError;
        String unwrapString;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                unwrapString = this.this$0.unwrapString(this.$sku);
                RnIapLog.INSTANCE.payload("createAlternativeBillingTokenAndroid", MapsKt.mapOf(TuplesKt.to("sku", unwrapString)));
                this.label = 1;
                obj = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1(this.this$0, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            RnIapLog.INSTANCE.result("createAlternativeBillingTokenAndroid", str);
            return str != null ? new Variant_NullType_String.Second(str) : new Variant_NullType_String.First(NullType.NULL);
        } catch (Throwable th) {
            RnIapLog.INSTANCE.failure("createAlternativeBillingTokenAndroid", th);
            parseOpenIapError = this.this$0.parseOpenIapError(th);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, parseOpenIapError, null, th.getMessage(), null, 10, null));
        }
    }
}
