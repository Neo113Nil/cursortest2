package dev.hyo.openiap;

import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
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
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$checkAlternativeBillingAvailability$2", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", "checkAvailabilityMethod", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$checkAlternativeBillingAvailability$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$checkAlternativeBillingAvailability$2(OpenIapModule openIapModule, Continuation<? super OpenIapModule$checkAlternativeBillingAvailability$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$checkAlternativeBillingAvailability$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$checkAlternativeBillingAvailability$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
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
        billingClient = this.this$0.billingClient;
        if (billingClient == null) {
            throw OpenIapError.NotPrepared.INSTANCE;
        }
        if (!billingClient.isReady()) {
            throw OpenIapError.NotPrepared.INSTANCE;
        }
        OpenIapLog.INSTANCE.d("Checking alternative billing availability...", "OpenIapModule");
        Method method = billingClient.getClass().getMethod("isAlternativeBillingOnlyAvailableAsync", AlternativeBillingOnlyAvailabilityListener.class);
        this.L$0 = billingClient;
        this.L$1 = method;
        this.I$0 = 0;
        this.label = 1;
        OpenIapModule$checkAlternativeBillingAvailability$2 openIapModule$checkAlternativeBillingAvailability$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$checkAlternativeBillingAvailability$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Class<?> cls = Class.forName("com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener");
        method.invoke(billingClient, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$checkAlternativeBillingAvailability$2$1$availabilityListener$1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                if (Intrinsics.areEqual(method2.getName(), "onAlternativeBillingOnlyAvailabilityResponse")) {
                    Object obj3 = objArr != null ? objArr[0] : null;
                    BillingResult billingResult = obj3 instanceof BillingResult ? (BillingResult) obj3 : null;
                    OpenIapLog.INSTANCE.d("Availability check result: " + (billingResult != null ? Integer.valueOf(billingResult.getResponseCode()) : null) + " - " + (billingResult != null ? billingResult.getDebugMessage() : null), "OpenIapModule");
                    if (billingResult != null && billingResult.getResponseCode() == 0) {
                        OpenIapLog.INSTANCE.d("✓ Alternative billing is available", "OpenIapModule");
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m3984constructorimpl(true));
                        }
                    } else {
                        OpenIapLog.e$default(OpenIapLog.INSTANCE, "✗ Alternative billing not available: " + (billingResult != null ? billingResult.getDebugMessage() : null), null, "OpenIapModule", 2, null);
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl2;
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuation2.resumeWith(Result.m3984constructorimpl(false));
                        }
                    }
                }
                return null;
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(openIapModule$checkAlternativeBillingAvailability$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
