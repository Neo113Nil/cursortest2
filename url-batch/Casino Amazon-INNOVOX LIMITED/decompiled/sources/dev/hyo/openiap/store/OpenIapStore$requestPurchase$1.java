package dev.hyo.openiap.store;

import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.RequestPurchaseAndroidProps;
import dev.hyo.openiap.RequestPurchaseProps;
import dev.hyo.openiap.RequestPurchaseResult;
import dev.hyo.openiap.RequestSubscriptionAndroidProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/RequestPurchaseResult;", "props", "Ldev/hyo/openiap/RequestPurchaseProps;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$requestPurchase$1", f = "OpenIapStore.kt", i = {0, 0}, l = {378}, m = "invokeSuspend", n = {"props", "skuForStatus"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class OpenIapStore$requestPurchase$1 extends SuspendLambda implements Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$requestPurchase$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$requestPurchase$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapStore$requestPurchase$1 openIapStore$requestPurchase$1 = new OpenIapStore$requestPurchase$1(this.this$0, continuation);
        openIapStore$requestPurchase$1.L$0 = obj;
        return openIapStore$requestPurchase$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RequestPurchaseProps requestPurchaseProps, Continuation<? super RequestPurchaseResult> continuation) {
        return ((OpenIapStore$requestPurchase$1) create(requestPurchaseProps, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #0 {all -> 0x00a6, blocks: (B:32:0x0072, B:34:0x0082), top: B:31:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> skus;
        String str;
        String str2;
        Throwable th;
        OpenIapProtocol openIapProtocol;
        Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> requestPurchase;
        List<String> skus2;
        RequestPurchaseProps requestPurchaseProps = (RequestPurchaseProps) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RequestPurchaseProps.Request request = requestPurchaseProps.getRequest();
            if (request instanceof RequestPurchaseProps.Request.Purchase) {
                RequestPurchaseAndroidProps android2 = ((RequestPurchaseProps.Request.Purchase) request).getValue().getAndroid();
                try {
                    if (android2 != null && (skus2 = android2.getSkus()) != null) {
                        str = (String) CollectionsKt.firstOrNull((List) skus2);
                        if (str != null) {
                            this.this$0.addPurchasing(str);
                            this.this$0.pendingRequestProductId = str;
                        }
                        openIapProtocol = this.this$0.module;
                        requestPurchase = openIapProtocol.getMutationHandlers().getRequestPurchase();
                        if (requestPurchase != null) {
                            str2 = str;
                            throw OpenIapError.FeatureNotSupported.INSTANCE;
                        }
                        this.L$0 = SpillingKt.nullOutSpilledVariable(requestPurchaseProps);
                        this.L$1 = str;
                        this.label = 1;
                        Object invoke = requestPurchase.invoke(requestPurchaseProps, this);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        obj = invoke;
                    }
                    openIapProtocol = this.this$0.module;
                    requestPurchase = openIapProtocol.getMutationHandlers().getRequestPurchase();
                    if (requestPurchase != null) {
                    }
                } catch (Throwable th2) {
                    str2 = str;
                    th = th2;
                    if (str2 != null) {
                        this.this$0.removePurchasing(str2);
                    }
                    throw th;
                }
                str = null;
                if (str != null) {
                }
            } else if (request instanceof RequestPurchaseProps.Request.Subscription) {
                RequestSubscriptionAndroidProps android3 = ((RequestPurchaseProps.Request.Subscription) request).getValue().getAndroid();
                if (android3 != null && (skus = android3.getSkus()) != null) {
                    str = (String) CollectionsKt.firstOrNull((List) skus);
                    if (str != null) {
                    }
                    openIapProtocol = this.this$0.module;
                    requestPurchase = openIapProtocol.getMutationHandlers().getRequestPurchase();
                    if (requestPurchase != null) {
                    }
                }
                str = null;
                if (str != null) {
                }
                openIapProtocol = this.this$0.module;
                requestPurchase = openIapProtocol.getMutationHandlers().getRequestPurchase();
                if (requestPurchase != null) {
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                if (str2 != null) {
                }
                throw th;
            }
        }
        RequestPurchaseResult requestPurchaseResult = (RequestPurchaseResult) obj;
        if (requestPurchaseResult != null) {
            if (str2 != null) {
                this.this$0.removePurchasing(str2);
            }
            return requestPurchaseResult;
        }
        throw OpenIapError.FeatureNotSupported.INSTANCE;
    }
}
