package com.margelo.nitro.iap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import dev.hyo.openiap.ActiveSubscription;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/margelo/nitro/iap/NitroActiveSubscription;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$getActiveSubscriptions$1", f = "HybridRnIap.kt", i = {}, l = {613, 623}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$getActiveSubscriptions$1 extends SuspendLambda implements Function1<Continuation<? super NitroActiveSubscription[]>, Object> {
    final /* synthetic */ String[] $subscriptionIds;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$getActiveSubscriptions$1(HybridRnIap hybridRnIap, String[] strArr, Continuation<? super HybridRnIap$getActiveSubscriptions$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
        this.$subscriptionIds = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$getActiveSubscriptions$1(this.this$0, this.$subscriptionIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super NitroActiveSubscription[]> continuation) {
        return ((HybridRnIap$getActiveSubscriptions$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r2 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0035, code lost:
    
        if (r2 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ensureConnection;
        Object obj2;
        OpenIapModule openIap;
        Object invoke;
        Variant_NullType_String wrapVariant;
        Variant_NullType_Boolean wrapVariant2;
        Variant_NullType_String wrapVariant3;
        Variant_NullType_String wrapVariant4;
        Variant_NullType_String wrapVariant5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                ensureConnection = this.this$0.ensureConnection(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    invoke = obj;
                    List<ActiveSubscription> list = (List) invoke;
                    HybridRnIap hybridRnIap = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (ActiveSubscription activeSubscription : list) {
                        String productId = activeSubscription.getProductId();
                        boolean isActive = activeSubscription.isActive();
                        String transactionId = activeSubscription.getTransactionId();
                        wrapVariant = hybridRnIap.wrapVariant(activeSubscription.getPurchaseToken());
                        double transactionDate = activeSubscription.getTransactionDate();
                        wrapVariant2 = hybridRnIap.wrapVariant(activeSubscription.getAutoRenewingAndroid());
                        wrapVariant3 = hybridRnIap.wrapVariant(activeSubscription.getBasePlanIdAndroid());
                        wrapVariant4 = hybridRnIap.wrapVariant(activeSubscription.getCurrentPlanId());
                        wrapVariant5 = hybridRnIap.wrapVariant(activeSubscription.getPurchaseTokenAndroid());
                        arrayList.add(new NitroActiveSubscription(productId, isActive, transactionId, wrapVariant, transactionDate, null, null, null, null, null, wrapVariant2, wrapVariant3, wrapVariant4, wrapVariant5));
                    }
                    ArrayList arrayList2 = arrayList;
                    RnIapLog rnIapLog = RnIapLog.INSTANCE;
                    ArrayList<NitroActiveSubscription> arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    for (NitroActiveSubscription nitroActiveSubscription : arrayList3) {
                        arrayList4.add(MapsKt.mapOf(TuplesKt.to("productId", nitroActiveSubscription.getProductId()), TuplesKt.to("isActive", Boxing.boxBoolean(nitroActiveSubscription.isActive()))));
                    }
                    rnIapLog.result("getActiveSubscriptions", arrayList4);
                    return (NitroActiveSubscription[]) arrayList2.toArray(new NitroActiveSubscription[0]);
                }
                ResultKt.throwOnFailure(obj);
            }
            RnIapLog rnIapLog2 = RnIapLog.INSTANCE;
            String[] strArr = this.$subscriptionIds;
            if (strArr == null || (obj2 = ArraysKt.toList(strArr)) == null) {
                obj2 = "all";
            }
            rnIapLog2.payload("getActiveSubscriptions", MapsKt.mapOf(TuplesKt.to("subscriptionIds", obj2)));
            RnIapLog.INSTANCE.payload("getActiveSubscriptions.native", MapsKt.mapOf(TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, "subs")));
            openIap = this.this$0.getOpenIap();
            Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getActiveSubscriptions = openIap.getGetActiveSubscriptions();
            String[] strArr2 = this.$subscriptionIds;
            List<String> list2 = strArr2 != null ? ArraysKt.toList(strArr2) : null;
            this.label = 2;
            invoke = getActiveSubscriptions.invoke(list2, this);
        } catch (Exception e) {
            RnIapLog.INSTANCE.failure("getActiveSubscriptions", e);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.ServiceUnavailable.INSTANCE, null, e.getMessage(), "Failed to get active subscriptions: " + e.getMessage(), 2, null));
        }
    }
}
