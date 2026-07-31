package com.margelo.nitro.iap;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.margelo.nitro.iap.Variant_NullType_NitroAvailablePurchasesAndroidOptions;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.ProductQueryType;
import dev.hyo.openiap.PurchaseOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/margelo/nitro/iap/NitroPurchase;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$getAvailablePurchases$1", f = "HybridRnIap.kt", i = {0}, l = {566, 598, TypedValues.Motion.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {"androidOptions"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class HybridRnIap$getAvailablePurchases$1 extends SuspendLambda implements Function1<Continuation<? super NitroPurchase[]>, Object> {
    final /* synthetic */ NitroAvailablePurchasesOptions $options;
    Object L$0;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$getAvailablePurchases$1(NitroAvailablePurchasesOptions nitroAvailablePurchasesOptions, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$getAvailablePurchases$1> continuation) {
        super(1, continuation);
        this.$options = nitroAvailablePurchasesOptions;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$getAvailablePurchases$1(this.$options, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super NitroPurchase[]> continuation) {
        return ((HybridRnIap$getAvailablePurchases$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0146, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017b, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
    
        if (r2.equals("subs") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
    
        if (r2.equals("in-app") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005f, code lost:
    
        if (r9 == r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x019b A[LOOP:0: B:9:0x0195->B:11:0x019b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01df A[LOOP:1: B:14:0x01d9->B:16:0x01df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NitroAvailablePurchasesAndroidOptions value;
        Object ensureConnection;
        Boolean unwrapBool;
        String str;
        OpenIapModule openIap;
        Object invoke;
        ProductQueryType parseProductQueryType;
        OpenIapModule openIap2;
        Object availableItems;
        NitroAvailablePurchasesAndroidType type;
        String name;
        NitroAvailablePurchasesAndroidType type2;
        List list;
        Iterator it;
        NitroPurchase convertToNitroPurchase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NitroAvailablePurchasesOptions nitroAvailablePurchasesOptions = this.$options;
            Variant_NullType_NitroAvailablePurchasesAndroidOptions android2 = nitroAvailablePurchasesOptions != null ? nitroAvailablePurchasesOptions.getAndroid() : null;
            Variant_NullType_NitroAvailablePurchasesAndroidOptions.Second second = android2 instanceof Variant_NullType_NitroAvailablePurchasesAndroidOptions.Second ? (Variant_NullType_NitroAvailablePurchasesAndroidOptions.Second) android2 : null;
            value = second != null ? second.getValue() : null;
            this.L$0 = value;
            this.label = 1;
            ensureConnection = this.this$0.ensureConnection(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    availableItems = obj;
                    list = (List) availableItems;
                    RnIapLog rnIapLog = RnIapLog.INSTANCE;
                    List<dev.hyo.openiap.Purchase> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    while (r9.hasNext()) {
                    }
                    rnIapLog.result("getAvailablePurchases", arrayList);
                    HybridRnIap hybridRnIap = this.this$0;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    return arrayList2.toArray(new NitroPurchase[0]);
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                invoke = obj;
                list = (List) invoke;
                RnIapLog rnIapLog2 = RnIapLog.INSTANCE;
                List<dev.hyo.openiap.Purchase> list22 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                for (dev.hyo.openiap.Purchase purchase : list22) {
                    arrayList3.add(MapsKt.mapOf(TuplesKt.to("id", purchase.getId()), TuplesKt.to("sku", purchase.getProductId())));
                }
                rnIapLog2.result("getAvailablePurchases", arrayList3);
                HybridRnIap hybridRnIap2 = this.this$0;
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                it = list22.iterator();
                while (it.hasNext()) {
                    convertToNitroPurchase = hybridRnIap2.convertToNitroPurchase((dev.hyo.openiap.Purchase) it.next());
                    arrayList22.add(convertToNitroPurchase);
                }
                return arrayList22.toArray(new NitroPurchase[0]);
            }
            value = (NitroAvailablePurchasesAndroidOptions) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        unwrapBool = this.this$0.unwrapBool(value != null ? value.getIncludeSuspended() : null);
        boolean booleanValue = unwrapBool != null ? unwrapBool.booleanValue() : false;
        RnIapLog rnIapLog3 = RnIapLog.INSTANCE;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, (value == null || (type2 = value.getType()) == null) ? null : type2.name());
        pairArr[1] = TuplesKt.to("includeSuspended", Boxing.boxBoolean(booleanValue));
        rnIapLog3.payload("getAvailablePurchases", MapsKt.mapOf(pairArr));
        if (value == null || (type = value.getType()) == null || (name = type.name()) == null) {
            str = null;
        } else {
            str = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1185881735) {
                if (hashCode != 3541555) {
                    if (hashCode == 100343516 && str.equals("inapp")) {
                        RnIapLog.INSTANCE.warn("getAvailablePurchases received legacy type 'inapp'; forwarding as 'in-app'");
                        str = "in-app";
                        PurchaseOptions purchaseOptions = new PurchaseOptions(null, Boxing.boxBoolean(booleanValue), null, 5, null);
                        if (str == null) {
                            parseProductQueryType = this.this$0.parseProductQueryType(str);
                            RnIapLog.INSTANCE.payload("getAvailablePurchases.native", MapsKt.mapOf(TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, parseProductQueryType.getRawValue()), TuplesKt.to("includeSuspended", Boxing.boxBoolean(booleanValue))));
                            openIap2 = this.this$0.getOpenIap();
                            this.L$0 = null;
                            this.label = 2;
                            availableItems = openIap2.getAvailableItems(parseProductQueryType, this);
                        } else {
                            RnIapLog.INSTANCE.payload("getAvailablePurchases.native", MapsKt.mapOf(TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, "all"), TuplesKt.to("includeSuspended", Boxing.boxBoolean(booleanValue))));
                            openIap = this.this$0.getOpenIap();
                            Function2<PurchaseOptions, Continuation<? super List<? extends dev.hyo.openiap.Purchase>>, Object> getAvailablePurchases = openIap.getGetAvailablePurchases();
                            this.L$0 = null;
                            this.label = 3;
                            invoke = getAvailablePurchases.invoke(purchaseOptions, this);
                        }
                        return coroutine_suspended;
                    }
                }
            }
            RnIapLog rnIapLog22 = RnIapLog.INSTANCE;
            List<dev.hyo.openiap.Purchase> list222 = list;
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list222, 10));
            while (r9.hasNext()) {
            }
            rnIapLog22.result("getAvailablePurchases", arrayList32);
            HybridRnIap hybridRnIap22 = this.this$0;
            ArrayList arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list222, 10));
            it = list222.iterator();
            while (it.hasNext()) {
            }
            return arrayList222.toArray(new NitroPurchase[0]);
        }
        str = null;
        PurchaseOptions purchaseOptions2 = new PurchaseOptions(null, Boxing.boxBoolean(booleanValue), null, 5, null);
        if (str == null) {
        }
        return coroutine_suspended;
    }
}
