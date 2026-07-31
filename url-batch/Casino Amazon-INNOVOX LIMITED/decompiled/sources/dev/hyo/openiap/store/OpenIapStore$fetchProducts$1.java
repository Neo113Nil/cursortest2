package dev.hyo.openiap.store;

import android.util.Log;
import com.facebook.imagepipeline.common.RotationOptions;
import dev.hyo.openiap.FetchProductsResult;
import dev.hyo.openiap.FetchProductsResultAll;
import dev.hyo.openiap.FetchProductsResultProducts;
import dev.hyo.openiap.FetchProductsResultSubscriptions;
import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.Product;
import dev.hyo.openiap.ProductAndroid;
import dev.hyo.openiap.ProductOrSubscription;
import dev.hyo.openiap.ProductRequest;
import dev.hyo.openiap.ProductSubscription;
import dev.hyo.openiap.ProductSubscriptionAndroid;
import dev.hyo.openiap.utils.ProductExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/FetchProductsResult;", "request", "Ldev/hyo/openiap/ProductRequest;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$fetchProducts$1", f = "OpenIapStore.kt", i = {0}, l = {RotationOptions.ROTATE_270}, m = "invokeSuspend", n = {"request"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapStore$fetchProducts$1 extends SuspendLambda implements Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$fetchProducts$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$fetchProducts$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapStore$fetchProducts$1 openIapStore$fetchProducts$1 = new OpenIapStore$fetchProducts$1(this.this$0, continuation);
        openIapStore$fetchProducts$1.L$0 = obj;
        return openIapStore$fetchProducts$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProductRequest productRequest, Continuation<? super FetchProductsResult> continuation) {
        return ((OpenIapStore$fetchProducts$1) create(productRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapProtocol openIapProtocol;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        MutableStateFlow mutableStateFlow9;
        ProductSubscription value;
        Product value2;
        MutableStateFlow mutableStateFlow10;
        MutableStateFlow mutableStateFlow11;
        MutableStateFlow mutableStateFlow12;
        MutableStateFlow mutableStateFlow13;
        MutableStateFlow mutableStateFlow14;
        MutableStateFlow mutableStateFlow15;
        MutableStateFlow mutableStateFlow16;
        MutableStateFlow mutableStateFlow17;
        MutableStateFlow mutableStateFlow18;
        ProductRequest productRequest = (ProductRequest) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Log.i("OpenIapStore", "fetchProducts called with SKUs: " + productRequest.getSkus() + ", type: " + productRequest.getType());
                    this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$fetchProducts$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$0;
                            invokeSuspend$lambda$0 = OpenIapStore$fetchProducts$1.invokeSuspend$lambda$0((LoadingStates) obj2);
                            return invokeSuspend$lambda$0;
                        }
                    });
                    Log.i("OpenIapStore", "Calling module.fetchProducts");
                    openIapProtocol = this.this$0.module;
                    Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts = openIapProtocol.getFetchProducts();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(productRequest);
                    this.label = 1;
                    obj = fetchProducts.invoke(productRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FetchProductsResult fetchProductsResult = (FetchProductsResult) obj;
                Log.i("OpenIapStore", "module.fetchProducts returned: " + fetchProductsResult);
                if (fetchProductsResult instanceof FetchProductsResultProducts) {
                    List<Product> value3 = ((FetchProductsResultProducts) fetchProductsResult).getValue();
                    if (value3 == null) {
                        value3 = CollectionsKt.emptyList();
                    }
                    mutableStateFlow16 = this.this$0._products;
                    Iterable iterable = (Iterable) mutableStateFlow16.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Product) it.next()).getId());
                    }
                    Set set = CollectionsKt.toSet(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : value3) {
                        if (!set.contains(((Product) obj2).getId())) {
                            arrayList2.add(obj2);
                        }
                    }
                    mutableStateFlow17 = this.this$0._products;
                    mutableStateFlow18 = this.this$0._products;
                    mutableStateFlow17.setValue(CollectionsKt.plus((Collection) mutableStateFlow18.getValue(), (Iterable) arrayList2));
                } else if (fetchProductsResult instanceof FetchProductsResultSubscriptions) {
                    List<ProductSubscription> value4 = ((FetchProductsResultSubscriptions) fetchProductsResult).getValue();
                    if (value4 == null) {
                        value4 = CollectionsKt.emptyList();
                    }
                    mutableStateFlow10 = this.this$0._subscriptions;
                    Iterable iterable2 = (Iterable) mutableStateFlow10.getValue();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((ProductSubscription) it2.next()).getId());
                    }
                    Set set2 = CollectionsKt.toSet(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : value4) {
                        if (!set2.contains(((ProductSubscription) obj3).getId())) {
                            arrayList4.add(obj3);
                        }
                    }
                    mutableStateFlow11 = this.this$0._subscriptions;
                    mutableStateFlow12 = this.this$0._subscriptions;
                    mutableStateFlow11.setValue(CollectionsKt.plus((Collection) mutableStateFlow12.getValue(), (Iterable) arrayList4));
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : value4) {
                        if (obj4 instanceof ProductSubscriptionAndroid) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = arrayList5;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(ProductExtensionsKt.toProduct((ProductSubscriptionAndroid) it3.next()));
                    }
                    ArrayList arrayList8 = arrayList7;
                    mutableStateFlow13 = this.this$0._products;
                    Iterable iterable3 = (Iterable) mutableStateFlow13.getValue();
                    ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
                    Iterator it4 = iterable3.iterator();
                    while (it4.hasNext()) {
                        arrayList9.add(((Product) it4.next()).getId());
                    }
                    Set set3 = CollectionsKt.toSet(arrayList9);
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj5 : arrayList8) {
                        if (!set3.contains(((Product) obj5).getId())) {
                            arrayList10.add(obj5);
                        }
                    }
                    mutableStateFlow14 = this.this$0._products;
                    mutableStateFlow15 = this.this$0._products;
                    mutableStateFlow14.setValue(CollectionsKt.plus((Collection) mutableStateFlow15.getValue(), (Iterable) arrayList10));
                } else {
                    if (!(fetchProductsResult instanceof FetchProductsResultAll)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<ProductOrSubscription> value5 = ((FetchProductsResultAll) fetchProductsResult).getValue();
                    if (value5 == null) {
                        value5 = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList11 = new ArrayList();
                    Iterator<T> it5 = value5.iterator();
                    while (true) {
                        ProductAndroid productAndroid = null;
                        if (!it5.hasNext()) {
                            break;
                        }
                        ProductOrSubscription productOrSubscription = (ProductOrSubscription) it5.next();
                        ProductOrSubscription.ProductItem productItem = productOrSubscription instanceof ProductOrSubscription.ProductItem ? (ProductOrSubscription.ProductItem) productOrSubscription : null;
                        if (productItem != null && (value2 = productItem.getValue()) != null && (value2 instanceof ProductAndroid)) {
                            productAndroid = (ProductAndroid) value2;
                        }
                        if (productAndroid != null) {
                            arrayList11.add(productAndroid);
                        }
                    }
                    ArrayList arrayList12 = arrayList11;
                    ArrayList arrayList13 = new ArrayList();
                    for (ProductOrSubscription productOrSubscription2 : value5) {
                        ProductOrSubscription.ProductSubscriptionItem productSubscriptionItem = productOrSubscription2 instanceof ProductOrSubscription.ProductSubscriptionItem ? (ProductOrSubscription.ProductSubscriptionItem) productOrSubscription2 : null;
                        ProductSubscriptionAndroid productSubscriptionAndroid = (productSubscriptionItem == null || (value = productSubscriptionItem.getValue()) == null || !(value instanceof ProductSubscriptionAndroid)) ? null : (ProductSubscriptionAndroid) value;
                        if (productSubscriptionAndroid != null) {
                            arrayList13.add(productSubscriptionAndroid);
                        }
                    }
                    ArrayList arrayList14 = arrayList13;
                    mutableStateFlow = this.this$0._products;
                    Iterable iterable4 = (Iterable) mutableStateFlow.getValue();
                    ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
                    Iterator it6 = iterable4.iterator();
                    while (it6.hasNext()) {
                        arrayList15.add(((Product) it6.next()).getId());
                    }
                    Set set4 = CollectionsKt.toSet(arrayList15);
                    ArrayList arrayList16 = new ArrayList();
                    for (Object obj6 : arrayList12) {
                        if (!set4.contains(((ProductAndroid) obj6).getId())) {
                            arrayList16.add(obj6);
                        }
                    }
                    mutableStateFlow2 = this.this$0._products;
                    mutableStateFlow3 = this.this$0._products;
                    mutableStateFlow2.setValue(CollectionsKt.plus((Collection) mutableStateFlow3.getValue(), (Iterable) arrayList16));
                    mutableStateFlow4 = this.this$0._subscriptions;
                    Iterable iterable5 = (Iterable) mutableStateFlow4.getValue();
                    ArrayList arrayList17 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable5, 10));
                    Iterator it7 = iterable5.iterator();
                    while (it7.hasNext()) {
                        arrayList17.add(((ProductSubscription) it7.next()).getId());
                    }
                    Set set5 = CollectionsKt.toSet(arrayList17);
                    ArrayList arrayList18 = new ArrayList();
                    for (Object obj7 : arrayList14) {
                        if (!set5.contains(((ProductSubscriptionAndroid) obj7).getId())) {
                            arrayList18.add(obj7);
                        }
                    }
                    mutableStateFlow5 = this.this$0._subscriptions;
                    mutableStateFlow6 = this.this$0._subscriptions;
                    mutableStateFlow5.setValue(CollectionsKt.plus((Collection) mutableStateFlow6.getValue(), (Iterable) arrayList18));
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj8 : arrayList14) {
                        if (obj8 instanceof ProductSubscriptionAndroid) {
                            arrayList19.add(obj8);
                        }
                    }
                    ArrayList arrayList20 = arrayList19;
                    ArrayList arrayList21 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList20, 10));
                    Iterator it8 = arrayList20.iterator();
                    while (it8.hasNext()) {
                        arrayList21.add(ProductExtensionsKt.toProduct((ProductSubscriptionAndroid) it8.next()));
                    }
                    ArrayList arrayList22 = arrayList21;
                    mutableStateFlow7 = this.this$0._products;
                    Iterable iterable6 = (Iterable) mutableStateFlow7.getValue();
                    ArrayList arrayList23 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable6, 10));
                    Iterator it9 = iterable6.iterator();
                    while (it9.hasNext()) {
                        arrayList23.add(((Product) it9.next()).getId());
                    }
                    Set set6 = CollectionsKt.toSet(arrayList23);
                    ArrayList arrayList24 = new ArrayList();
                    for (Object obj9 : arrayList22) {
                        if (!set6.contains(((Product) obj9).getId())) {
                            arrayList24.add(obj9);
                        }
                    }
                    mutableStateFlow8 = this.this$0._products;
                    mutableStateFlow9 = this.this$0._products;
                    mutableStateFlow8.setValue(CollectionsKt.plus((Collection) mutableStateFlow9.getValue(), (Iterable) arrayList24));
                }
                return fetchProductsResult;
            } catch (Exception e) {
                this.this$0.setError(e.getMessage());
                throw e;
            }
        } finally {
            this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$fetchProducts$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj10) {
                    Unit invokeSuspend$lambda$19;
                    invokeSuspend$lambda$19 = OpenIapStore$fetchProducts$1.invokeSuspend$lambda$19((LoadingStates) obj10);
                    return invokeSuspend$lambda$19;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(LoadingStates loadingStates) {
        loadingStates.setFetchProducts(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$19(LoadingStates loadingStates) {
        loadingStates.setFetchProducts(false);
        return Unit.INSTANCE;
    }
}
