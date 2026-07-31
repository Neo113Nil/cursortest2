package com.margelo.nitro.iap;

import android.app.Activity;
import dev.hyo.openiap.OpenIapModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1", f = "HybridRnIap.kt", i = {}, l = {1620}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1(HybridRnIap hybridRnIap, Activity activity, Continuation<? super HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1> continuation) {
        super(2, continuation);
        this.this$0 = hybridRnIap;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1(this.this$0, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapModule openIap;
        OpenIapModule openIap2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        openIap = this.this$0.getOpenIap();
        openIap.setActivity(this.$activity);
        openIap2 = this.this$0.getOpenIap();
        this.label = 1;
        Object showAlternativeBillingInformationDialog = openIap2.showAlternativeBillingInformationDialog(this.$activity, this);
        return showAlternativeBillingInformationDialog == coroutine_suspended ? coroutine_suspended : showAlternativeBillingInformationDialog;
    }
}
