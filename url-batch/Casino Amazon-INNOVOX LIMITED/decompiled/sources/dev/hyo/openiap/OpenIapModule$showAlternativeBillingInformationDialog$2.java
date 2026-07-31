package dev.hyo.openiap;

import android.app.Activity;
import com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import dev.hyo.openiap.OpenIapError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$showAlternativeBillingInformationDialog$2", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", "showDialogMethod", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$showAlternativeBillingInformationDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Activity $activity;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$showAlternativeBillingInformationDialog$2(OpenIapModule openIapModule, Activity activity, Continuation<? super OpenIapModule$showAlternativeBillingInformationDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$showAlternativeBillingInformationDialog$2(this.this$0, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$showAlternativeBillingInformationDialog$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            billingClient = this.this$0.billingClient;
            if (billingClient == null) {
                throw OpenIapError.NotPrepared.INSTANCE;
            }
            if (!billingClient.isReady()) {
                throw OpenIapError.NotPrepared.INSTANCE;
            }
            OpenIapLog.INSTANCE.d("Showing alternative billing information dialog...", "OpenIapModule");
            Method method = billingClient.getClass().getMethod("showAlternativeBillingOnlyInformationDialog", Activity.class, AlternativeBillingOnlyInformationDialogListener.class);
            Activity activity = this.$activity;
            this.L$0 = billingClient;
            this.L$1 = method;
            this.L$2 = activity;
            this.I$0 = 0;
            this.label = 1;
            OpenIapModule$showAlternativeBillingInformationDialog$2 openIapModule$showAlternativeBillingInformationDialog$2 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$showAlternativeBillingInformationDialog$2), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            Class<?> cls = Class.forName("com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener");
            method.invoke(billingClient, activity, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$showAlternativeBillingInformationDialog$2$dialogResult$1$dialogListener$1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    if (Intrinsics.areEqual(method2.getName(), "onAlternativeBillingOnlyInformationDialogResponse")) {
                        Object obj3 = objArr != null ? objArr[0] : null;
                        BillingResult billingResult = obj3 instanceof BillingResult ? (BillingResult) obj3 : null;
                        OpenIapLog.INSTANCE.d("Dialog result: " + (billingResult != null ? Integer.valueOf(billingResult.getResponseCode()) : null) + " - " + (billingResult != null ? billingResult.getDebugMessage() : null), "OpenIapModule");
                        if (cancellableContinuationImpl2.isActive() && billingResult != null) {
                            CancellableContinuation<BillingResult> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m3984constructorimpl(billingResult));
                        }
                    }
                    return null;
                }
            }));
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(openIapModule$showAlternativeBillingInformationDialog$2);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BillingResult billingResult = (BillingResult) obj;
        int responseCode = billingResult.getResponseCode();
        if (responseCode == 0) {
            z = true;
        } else if (responseCode == 1) {
            OpenIapLog.INSTANCE.d("User canceled information dialog", "OpenIapModule");
        } else {
            OpenIapLog.e$default(OpenIapLog.INSTANCE, "Information dialog failed: " + billingResult.getDebugMessage(), null, "OpenIapModule", 2, null);
        }
        return Boxing.boxBoolean(z);
    }
}
