package dev.hyo.openiap;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "purchaseToken", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$acknowledgePurchaseAndroid$1", f = "OpenIapModule.kt", i = {0}, l = {1126}, m = "invokeSuspend", n = {"purchaseToken"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$acknowledgePurchaseAndroid$1 extends SuspendLambda implements Function2<String, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$acknowledgePurchaseAndroid$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$acknowledgePurchaseAndroid$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$acknowledgePurchaseAndroid$1 openIapModule$acknowledgePurchaseAndroid$1 = new OpenIapModule$acknowledgePurchaseAndroid$1(this.this$0, continuation);
        openIapModule$acknowledgePurchaseAndroid$1.L$0 = obj;
        return openIapModule$acknowledgePurchaseAndroid$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$acknowledgePurchaseAndroid$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$acknowledgePurchaseAndroid$1$1", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", OutcomeEventsTable.COLUMN_NAME_PARAMS, "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: dev.hyo.openiap.OpenIapModule$acknowledgePurchaseAndroid$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $purchaseToken;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OpenIapModule openIapModule, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = openIapModule;
            this.$purchaseToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$purchaseToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(this.$purchaseToken).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            this.L$0 = billingClient;
            this.L$1 = build;
            this.I$0 = 0;
            this.label = 1;
            AnonymousClass1 anonymousClass1 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass1), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            billingClient.acknowledgePurchase(build, new AcknowledgePurchaseResponseListener() { // from class: dev.hyo.openiap.OpenIapModule$acknowledgePurchaseAndroid$1$1$1$1
                @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                public final void onAcknowledgePurchaseResponse(BillingResult result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result.getResponseCode() != 0) {
                        OpenIapLog.INSTANCE.w("Failed to acknowledge purchase: " + result.getDebugMessage(), "OpenIapModule");
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m3984constructorimpl(false));
                            return;
                        }
                        return;
                    }
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m3984constructorimpl(true));
                    }
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
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
        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
        this.label = 1;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.this$0, str, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }
}
