package dev.hyo.openiap;

import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
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
import kotlin.collections.ArraysKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$createAlternativeBillingReportingToken$2", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", "createTokenMethod", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$createAlternativeBillingReportingToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$createAlternativeBillingReportingToken$2(OpenIapModule openIapModule, Continuation<? super OpenIapModule$createAlternativeBillingReportingToken$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$createAlternativeBillingReportingToken$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OpenIapModule$createAlternativeBillingReportingToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OpenIapLog.INSTANCE.d("Creating alternative billing reporting token...", "OpenIapModule");
        Method method = billingClient.getClass().getMethod("createAlternativeBillingOnlyReportingDetailsAsync", AlternativeBillingOnlyReportingDetailsListener.class);
        this.L$0 = billingClient;
        this.L$1 = method;
        this.I$0 = 0;
        this.label = 1;
        OpenIapModule$createAlternativeBillingReportingToken$2 openIapModule$createAlternativeBillingReportingToken$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$createAlternativeBillingReportingToken$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Class<?> cls = Class.forName("com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener");
        method.invoke(billingClient, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$createAlternativeBillingReportingToken$2$1$tokenListener$1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                if (Intrinsics.areEqual(method2.getName(), "onAlternativeBillingOnlyTokenResponse")) {
                    Object obj3 = objArr != null ? objArr[0] : null;
                    BillingResult billingResult = obj3 instanceof BillingResult ? (BillingResult) obj3 : null;
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (billingResult == null || billingResult.getResponseCode() != 0 || orNull == null) {
                        BillingResult billingResult2 = billingResult;
                        OpenIapLog.e$default(OpenIapLog.INSTANCE, "Token creation failed: " + (billingResult2 != null ? billingResult2.getDebugMessage() : null), null, "OpenIapModule", 2, null);
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m3984constructorimpl(null));
                        }
                    } else {
                        try {
                            Object invoke = orNull.getClass().getMethod("getExternalTransactionToken", new Class[0]).invoke(orNull, new Object[0]);
                            String str = invoke instanceof String ? (String) invoke : null;
                            OpenIapLog.INSTANCE.d("✓ External transaction token created: " + str, "OpenIapModule");
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<String> cancellableContinuation2 = cancellableContinuationImpl2;
                                Result.Companion companion2 = Result.INSTANCE;
                                cancellableContinuation2.resumeWith(Result.m3984constructorimpl(str));
                            }
                        } catch (Exception e) {
                            OpenIapLog.INSTANCE.e("Failed to extract token: " + e.getMessage(), e, "OpenIapModule");
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<String> cancellableContinuation3 = cancellableContinuationImpl2;
                                Result.Companion companion3 = Result.INSTANCE;
                                cancellableContinuation3.resumeWith(Result.m3984constructorimpl(null));
                            }
                        }
                    }
                }
                return null;
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(openIapModule$createAlternativeBillingReportingToken$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
