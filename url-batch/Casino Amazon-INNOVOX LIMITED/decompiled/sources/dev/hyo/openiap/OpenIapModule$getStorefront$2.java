package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.GetBillingConfigParams;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$getStorefront$2", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"$this$withContext", "client", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$getStorefront$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$getStorefront$2(OpenIapModule openIapModule, Continuation<? super OpenIapModule$getStorefront$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$getStorefront$2 openIapModule$getStorefront$2 = new OpenIapModule$getStorefront$2(this.this$0, continuation);
        openIapModule$getStorefront$2.L$0 = obj;
        return openIapModule$getStorefront$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OpenIapModule$getStorefront$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        Object m3984constructorimpl;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
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
            return "";
        }
        this.L$0 = coroutineScope;
        this.L$1 = billingClient;
        this.I$0 = 0;
        this.label = 1;
        OpenIapModule$getStorefront$2 openIapModule$getStorefront$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$getStorefront$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            billingClient.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new BillingConfigResponseListener() { // from class: dev.hyo.openiap.OpenIapModule$getStorefront$2$1$1$1
                @Override // com.android.billingclient.api.BillingConfigResponseListener
                public final void onBillingConfigResponse(BillingResult result, BillingConfig billingConfig) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    String str = "";
                    if (result.getResponseCode() == 0) {
                        String countryCode = billingConfig != null ? billingConfig.getCountryCode() : null;
                        if (countryCode != null) {
                            str = countryCode;
                        }
                    }
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m3984constructorimpl(str));
                    }
                }
            });
            m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
        if (m3987exceptionOrNullimpl != null) {
            OpenIapLog.INSTANCE.w("getStorefront failed: " + m3987exceptionOrNullimpl.getMessage(), "OpenIapModule");
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m3984constructorimpl(""));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(openIapModule$getStorefront$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
