package com.margelo.nitro.iap;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$showAlternativeBillingDialogAndroid$1", f = "HybridRnIap.kt", i = {}, l = {1618}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$showAlternativeBillingDialogAndroid$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$showAlternativeBillingDialogAndroid$1(HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$showAlternativeBillingDialogAndroid$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$showAlternativeBillingDialogAndroid$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((HybridRnIap$showAlternativeBillingDialogAndroid$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapError parseOpenIapError;
        ReactApplicationContext context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RnIapLog.INSTANCE.payload("showAlternativeBillingDialogAndroid", null);
                context = this.this$0.getContext();
                Activity currentActivity = context.getCurrentActivity();
                if (currentActivity == null) {
                    throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.DeveloperError.INSTANCE, null, "Activity not available", null, 10, null));
                }
                this.label = 1;
                obj = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$showAlternativeBillingDialogAndroid$1$userAccepted$1(this.this$0, currentActivity, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            RnIapLog.INSTANCE.result("showAlternativeBillingDialogAndroid", Boxing.boxBoolean(booleanValue));
            return Boxing.boxBoolean(booleanValue);
        } catch (Throwable th) {
            RnIapLog.INSTANCE.failure("showAlternativeBillingDialogAndroid", th);
            parseOpenIapError = this.this$0.parseOpenIapError(th);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, parseOpenIapError, null, th.getMessage(), null, 10, null));
        }
    }
}
