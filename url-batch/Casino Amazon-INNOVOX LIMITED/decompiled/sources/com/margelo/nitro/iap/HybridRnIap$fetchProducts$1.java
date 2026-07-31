package com.margelo.nitro.iap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import dev.hyo.openiap.FetchProductsResult;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.ProductCommon;
import dev.hyo.openiap.ProductQueryType;
import dev.hyo.openiap.ProductRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/margelo/nitro/iap/NitroProduct;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$fetchProducts$1", f = "HybridRnIap.kt", i = {1, 1, 2}, l = {338, 353, 373}, m = "invokeSuspend", n = {"skusList", "byId", "skusList"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes2.dex */
final class HybridRnIap$fetchProducts$1 extends SuspendLambda implements Function1<Continuation<? super NitroProduct[]>, Object> {
    final /* synthetic */ String[] $skus;
    final /* synthetic */ String $type;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* compiled from: HybridRnIap.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductQueryType.values().length];
            try {
                iArr[ProductQueryType.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$fetchProducts$1(String[] strArr, String str, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$fetchProducts$1> continuation) {
        super(1, continuation);
        this.$skus = strArr;
        this.$type = str;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$fetchProducts$1(this.$skus, this.$type, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super NitroProduct[]> continuation) {
        return ((HybridRnIap$fetchProducts$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x008f, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0221 A[LOOP:0: B:8:0x021b->B:10:0x0221, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0270 A[LOOP:1: B:13:0x026a->B:15:0x0270, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02b4 A[LOOP:3: B:30:0x02ae->B:32:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e7 A[LOOP:4: B:35:0x02e1->B:37:0x02e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032e A[LOOP:5: B:40:0x0328->B:42:0x032e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a A[LOOP:6: B:51:0x0134->B:53:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e A[LOOP:7: B:56:0x0178->B:58:0x017e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0118 -> B:40:0x0119). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ensureConnection;
        ProductQueryType parseProductQueryType;
        List list;
        int i;
        boolean z;
        OpenIapModule openIap;
        Object invoke;
        HybridRnIap hybridRnIap;
        Iterator it;
        Map map;
        HybridRnIap hybridRnIap2;
        List list2;
        ?? r16;
        ArrayList arrayList;
        OpenIapModule openIap2;
        List productsOrEmpty;
        Iterator it2;
        NitroProduct convertToNitroProduct;
        Map map2;
        List productsOrEmpty2;
        Iterator it3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 0;
        int i4 = 2;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RnIapLog.INSTANCE.payload("fetchProducts", MapsKt.mapOf(TuplesKt.to("skus", ArraysKt.toList(this.$skus)), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.$type)));
            if (this.$skus.length != 0) {
                this.label = 1;
                ensureConnection = this.this$0.ensureConnection(this);
            } else {
                throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.EmptySkuList.INSTANCE, null, null, null, 14, null));
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hybridRnIap = (HybridRnIap) this.L$1;
                List list3 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = list3;
                i = 0;
                z = true;
                invoke = obj;
                productsOrEmpty2 = hybridRnIap.productsOrEmpty((FetchProductsResult) invoke);
                RnIapLog rnIapLog = RnIapLog.INSTANCE;
                List<ProductCommon> list4 = productsOrEmpty2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                for (ProductCommon productCommon : list4) {
                    Pair[] pairArr = new Pair[2];
                    pairArr[i] = TuplesKt.to("id", productCommon.getId());
                    pairArr[z ? 1 : 0] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, productCommon.getType().getRawValue());
                    arrayList2.add(MapsKt.mapOf(pairArr));
                }
                rnIapLog.result("fetchProducts.native", arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
                for (Object obj2 : list4) {
                    linkedHashMap.put(((ProductCommon) obj2).getId(), obj2);
                }
                ArrayList arrayList3 = new ArrayList();
                it3 = list.iterator();
                while (it3.hasNext()) {
                    ProductCommon productCommon2 = (ProductCommon) linkedHashMap.get((String) it3.next());
                    if (productCommon2 != null) {
                        arrayList3.add(productCommon2);
                    }
                }
                arrayList = arrayList3;
                r16 = z;
                ArrayList<ProductCommon> arrayList4 = arrayList;
                HybridRnIap hybridRnIap3 = this.this$0;
                for (ProductCommon productCommon3 : arrayList4) {
                    map2 = hybridRnIap3.productTypeBySku;
                    map2.put(productCommon3.getId(), productCommon3.getType().getRawValue());
                }
                RnIapLog rnIapLog2 = RnIapLog.INSTANCE;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (ProductCommon productCommon4 : arrayList4) {
                    Pair[] pairArr2 = new Pair[2];
                    pairArr2[i] = TuplesKt.to("id", productCommon4.getId());
                    pairArr2[r16] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, productCommon4.getType().getRawValue());
                    arrayList5.add(MapsKt.mapOf(pairArr2));
                }
                rnIapLog2.result("fetchProducts", arrayList5);
                HybridRnIap hybridRnIap4 = this.this$0;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    convertToNitroProduct = hybridRnIap4.convertToNitroProduct((ProductCommon) it2.next());
                    arrayList6.add(convertToNitroProduct);
                }
                return arrayList6.toArray(new NitroProduct[i]);
            }
            hybridRnIap2 = (HybridRnIap) this.L$4;
            it = (Iterator) this.L$3;
            HybridRnIap hybridRnIap5 = (HybridRnIap) this.L$2;
            map = (Map) this.L$1;
            list2 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object invoke2 = obj;
            int i5 = 0;
            ?? r162 = 1;
            productsOrEmpty = hybridRnIap2.productsOrEmpty((FetchProductsResult) invoke2);
            RnIapLog rnIapLog3 = RnIapLog.INSTANCE;
            List<ProductCommon> list5 = productsOrEmpty;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            for (ProductCommon productCommon5 : list5) {
                Iterator it4 = it;
                Pair[] pairArr3 = new Pair[2];
                pairArr3[i5] = TuplesKt.to("id", productCommon5.getId());
                pairArr3[r162] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, productCommon5.getType().getRawValue());
                arrayList7.add(MapsKt.mapOf(pairArr3));
                list5 = list5;
                it = it4;
            }
            Iterator it5 = it;
            rnIapLog3.result("fetchProducts.native", arrayList7);
            for (ProductCommon productCommon6 : list5) {
                map.putIfAbsent(productCommon6.getId(), productCommon6);
            }
            hybridRnIap2 = hybridRnIap5;
            z2 = r162;
            i3 = i5;
            it = it5;
            i4 = 2;
            if (it.hasNext()) {
                ProductQueryType productQueryType = (ProductQueryType) it.next();
                boolean z3 = z2;
                RnIapLog rnIapLog4 = RnIapLog.INSTANCE;
                i5 = i3;
                Pair[] pairArr4 = new Pair[i4];
                pairArr4[i5] = TuplesKt.to("skus", list2);
                pairArr4[z3 ? 1 : 0] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, productQueryType.getRawValue());
                rnIapLog4.payload("fetchProducts.native", MapsKt.mapOf(pairArr4));
                openIap2 = hybridRnIap2.getOpenIap();
                Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts = openIap2.getFetchProducts();
                ProductRequest productRequest = new ProductRequest(list2, productQueryType);
                this.L$0 = list2;
                this.L$1 = map;
                this.L$2 = hybridRnIap2;
                this.L$3 = it;
                this.L$4 = hybridRnIap2;
                this.label = i4;
                invoke2 = fetchProducts.invoke(productRequest, this);
                if (invoke2 != coroutine_suspended) {
                    hybridRnIap5 = hybridRnIap2;
                    r162 = z3;
                    productsOrEmpty = hybridRnIap2.productsOrEmpty((FetchProductsResult) invoke2);
                    RnIapLog rnIapLog32 = RnIapLog.INSTANCE;
                    List<ProductCommon> list52 = productsOrEmpty;
                    ArrayList arrayList72 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52, 10));
                    while (r11.hasNext()) {
                    }
                    Iterator it52 = it;
                    rnIapLog32.result("fetchProducts.native", arrayList72);
                    while (r2.hasNext()) {
                    }
                    hybridRnIap2 = hybridRnIap5;
                    z2 = r162;
                    i3 = i5;
                    it = it52;
                    i4 = 2;
                    if (it.hasNext()) {
                        i = i3;
                        r16 = z2;
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            ProductCommon productCommon7 = (ProductCommon) map.get((String) it6.next());
                            if (productCommon7 != null) {
                                arrayList8.add(productCommon7);
                            }
                        }
                        arrayList = arrayList8;
                        ArrayList<ProductCommon> arrayList42 = arrayList;
                        HybridRnIap hybridRnIap32 = this.this$0;
                        while (r4.hasNext()) {
                        }
                        RnIapLog rnIapLog22 = RnIapLog.INSTANCE;
                        ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList42, 10));
                        while (r6.hasNext()) {
                        }
                        rnIapLog22.result("fetchProducts", arrayList52);
                        HybridRnIap hybridRnIap42 = this.this$0;
                        ArrayList arrayList62 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList42, 10));
                        it2 = arrayList42.iterator();
                        while (it2.hasNext()) {
                        }
                        return arrayList62.toArray(new NitroProduct[i]);
                    }
                }
                return coroutine_suspended;
            }
        }
        parseProductQueryType = this.this$0.parseProductQueryType(this.$type);
        list = ArraysKt.toList(this.$skus);
        if (WhenMappings.$EnumSwitchMapping$0[parseProductQueryType.ordinal()] == 1) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List listOf = CollectionsKt.listOf((Object[]) new ProductQueryType[]{ProductQueryType.InApp, ProductQueryType.Subs});
            HybridRnIap hybridRnIap6 = this.this$0;
            it = listOf.iterator();
            map = linkedHashMap2;
            hybridRnIap2 = hybridRnIap6;
            list2 = list;
            if (it.hasNext()) {
            }
        } else {
            i = 0;
            z = true;
            RnIapLog.INSTANCE.payload("fetchProducts.native", MapsKt.mapOf(TuplesKt.to("skus", list), TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, parseProductQueryType.getRawValue())));
            HybridRnIap hybridRnIap7 = this.this$0;
            openIap = hybridRnIap7.getOpenIap();
            Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts2 = openIap.getFetchProducts();
            ProductRequest productRequest2 = new ProductRequest(list, parseProductQueryType);
            this.L$0 = list;
            this.L$1 = hybridRnIap7;
            this.label = 3;
            invoke = fetchProducts2.invoke(productRequest2, this);
            if (invoke != coroutine_suspended) {
                hybridRnIap = hybridRnIap7;
                productsOrEmpty2 = hybridRnIap.productsOrEmpty((FetchProductsResult) invoke);
                RnIapLog rnIapLog5 = RnIapLog.INSTANCE;
                List<ProductCommon> list42 = productsOrEmpty2;
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
                while (r6.hasNext()) {
                }
                rnIapLog5.result("fetchProducts.native", arrayList22);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list42, 10)), 16));
                while (r1.hasNext()) {
                }
                ArrayList arrayList32 = new ArrayList();
                it3 = list.iterator();
                while (it3.hasNext()) {
                }
                arrayList = arrayList32;
                r16 = z;
                ArrayList<ProductCommon> arrayList422 = arrayList;
                HybridRnIap hybridRnIap322 = this.this$0;
                while (r4.hasNext()) {
                }
                RnIapLog rnIapLog222 = RnIapLog.INSTANCE;
                ArrayList arrayList522 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList422, 10));
                while (r6.hasNext()) {
                }
                rnIapLog222.result("fetchProducts", arrayList522);
                HybridRnIap hybridRnIap422 = this.this$0;
                ArrayList arrayList622 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList422, 10));
                it2 = arrayList422.iterator();
                while (it2.hasNext()) {
                }
                return arrayList622.toArray(new NitroProduct[i]);
            }
            return coroutine_suspended;
        }
    }
}
