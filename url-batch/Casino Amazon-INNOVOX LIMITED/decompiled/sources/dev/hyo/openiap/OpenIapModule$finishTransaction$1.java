package dev.hyo.openiap;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "", "purchase", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$finishTransaction$1", f = "OpenIapModule.kt", i = {0, 0}, l = {1095}, m = "invokeSuspend", n = {"purchase", "isConsumable"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class OpenIapModule$finishTransaction$1 extends SuspendLambda implements Function3<Purchase, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$finishTransaction$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$finishTransaction$1> continuation) {
        super(3, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Purchase purchase, Boolean bool, Continuation<? super Unit> continuation) {
        OpenIapModule$finishTransaction$1 openIapModule$finishTransaction$1 = new OpenIapModule$finishTransaction$1(this.this$0, continuation);
        openIapModule$finishTransaction$1.L$0 = purchase;
        openIapModule$finishTransaction$1.L$1 = bool;
        return openIapModule$finishTransaction$1.invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$finishTransaction$1$1", f = "OpenIapModule.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {1817, 1828}, m = "invokeSuspend", n = {"client", "token", OutcomeEventsTable.COLUMN_NAME_PARAMS, "$i$f$suspendCancellableCoroutine", "client", "token", OutcomeEventsTable.COLUMN_NAME_PARAMS, "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    /* renamed from: dev.hyo.openiap.OpenIapModule$finishTransaction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Boolean $isConsumable;
        final /* synthetic */ Purchase $purchase;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OpenIapModule openIapModule, Purchase purchase, Boolean bool, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = openIapModule;
            this.$purchase = purchase;
            this.$isConsumable = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$purchase, this.$isConsumable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
        
            if (r8 == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
        
            if (r8 == r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BillingClient billingClient;
            BillingResult billingResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    throw OpenIapError.NotPrepared.INSTANCE;
                }
                if (!billingClient.isReady()) {
                    throw OpenIapError.NotPrepared.INSTANCE;
                }
                String purchaseToken = this.$purchase.getPurchaseToken();
                if (purchaseToken == null) {
                    purchaseToken = "";
                }
                if (StringsKt.isBlank(purchaseToken)) {
                    throw OpenIapError.PurchaseFailed.INSTANCE;
                }
                if (Intrinsics.areEqual(this.$isConsumable, Boxing.boxBoolean(true))) {
                    ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(purchaseToken).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    this.L$0 = billingClient;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(purchaseToken);
                    this.L$2 = build;
                    this.I$0 = 0;
                    this.label = 1;
                    AnonymousClass1 anonymousClass1 = this;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass1), 1);
                    cancellableContinuationImpl.initCancellability();
                    final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    billingClient.consumeAsync(build, new ConsumeResponseListener() { // from class: dev.hyo.openiap.OpenIapModule$finishTransaction$1$1$result$1$1
                        @Override // com.android.billingclient.api.ConsumeResponseListener
                        public final void onConsumeResponse(BillingResult outcome, String str) {
                            Intrinsics.checkNotNullParameter(outcome, "outcome");
                            Intrinsics.checkNotNullParameter(str, "<unused var>");
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<BillingResult> cancellableContinuation = cancellableContinuationImpl2;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m3984constructorimpl(outcome));
                            }
                        }
                    });
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
                    }
                } else {
                    AcknowledgePurchaseParams build2 = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchaseToken).build();
                    Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                    this.L$0 = billingClient;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(purchaseToken);
                    this.L$2 = build2;
                    this.I$0 = 0;
                    this.label = 2;
                    AnonymousClass1 anonymousClass12 = this;
                    CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass12), 1);
                    cancellableContinuationImpl3.initCancellability();
                    final CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl3;
                    billingClient.acknowledgePurchase(build2, new AcknowledgePurchaseResponseListener() { // from class: dev.hyo.openiap.OpenIapModule$finishTransaction$1$1$result$2$1
                        @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                        public final void onAcknowledgePurchaseResponse(BillingResult outcome) {
                            Intrinsics.checkNotNullParameter(outcome, "outcome");
                            if (cancellableContinuationImpl4.isActive()) {
                                CancellableContinuation<BillingResult> cancellableContinuation = cancellableContinuationImpl4;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m3984constructorimpl(outcome));
                            }
                        }
                    });
                    obj = cancellableContinuationImpl3.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(anonymousClass12);
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                billingResult = (BillingResult) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                billingResult = (BillingResult) obj;
            }
            if (billingResult.getResponseCode() != 0) {
                throw OpenIapError.PurchaseFailed.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Purchase purchase = (Purchase) this.L$0;
        Boolean bool = (Boolean) this.L$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = SpillingKt.nullOutSpilledVariable(purchase);
            this.L$1 = SpillingKt.nullOutSpilledVariable(bool);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.this$0, purchase, bool, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
