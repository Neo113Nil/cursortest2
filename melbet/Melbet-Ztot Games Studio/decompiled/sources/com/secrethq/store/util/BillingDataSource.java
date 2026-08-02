package com.secrethq.store.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.secrethq.utils.PTServicesBridge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BillingDataSource.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001nB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020#2\b\u0010E\u001a\u0004\u0018\u000109J\u0018\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u000109\u0018\u0001082\u0006\u0010D\u001a\u00020#J\u0006\u0010G\u001a\u00020CJ\u0010\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020#H\u0002J\u0016\u0010J\u001a\u00020.2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002000\"H\u0002J\u0010\u0010L\u001a\u00020.2\u0006\u0010I\u001a\u00020#H\u0002J<\u0010M\u001a\u00020C2\u0006\u0010(\u001a\u00020)2\u0006\u0010I\u001a\u00020#2\b\b\u0002\u00104\u001a\u00020.2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010302J,\u0010N\u001a\u00020C2\b\u0010(\u001a\u0004\u0018\u00010)2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010302J\u0006\u0010O\u001a\u00020CJ\b\u0010P\u001a\u00020CH\u0016J\u0010\u0010Q\u001a\u00020C2\u0006\u0010R\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u00020C2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020C2\u0006\u0010U\u001a\u00020VH\u0016J\u001e\u0010X\u001a\u00020C2\u0006\u0010R\u001a\u00020S2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002090ZH\u0016J \u0010[\u001a\u00020C2\u0006\u0010R\u001a\u00020S2\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010ZH\u0016J\u001e\u0010]\u001a\u00020C2\u0006\u0010R\u001a\u00020S2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002000ZH\u0016J\u0016\u0010^\u001a\u00020C2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002090\"H\u0002J#\u0010_\u001a\u00020C2\u0006\u0010`\u001a\u0002002\b\b\u0002\u0010a\u001a\u00020.H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010bJ#\u0010c\u001a\u00020C2\u0006\u0010`\u001a\u0002002\b\b\u0002\u0010a\u001a\u00020.H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010bJ\u0016\u0010d\u001a\u00020C2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002090ZH\u0002J\u0018\u0010e\u001a\u00020C2\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\"H\u0002J\u0018\u0010f\u001a\u00020C2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\"H\u0002J!\u0010g\u001a\u0004\u0018\u0001032\f\u0010\\\u001a\b\u0012\u0004\u0012\u0002000\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020CH\u0002J\u0006\u0010j\u001a\u00020CJ\b\u0010k\u001a\u00020CH\u0002J\u0006\u0010l\u001a\u00020CJ,\u0010m\u001a\u00020C2\b\u0010(\u001a\u0004\u0018\u00010)2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010302R\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000eR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00101\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010302X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010302X\u0082.¢\u0006\u0002\n\u0000R%\u00106\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001090807¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u0002000=X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010>\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010302X\u0082.¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lcom/secrethq/store/util/BillingDataSource;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/ProductDetailsResponseListener;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "applicationContext", "Landroid/content/Context;", "externalScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE", "", "getBILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE", "()I", "BILLING_RESPONSE_RESULT_DEVELOPER_ERROR", "getBILLING_RESPONSE_RESULT_DEVELOPER_ERROR", "BILLING_RESPONSE_RESULT_ERROR", "getBILLING_RESPONSE_RESULT_ERROR", "BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED", "getBILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED", "BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED", "getBILLING_RESPONSE_RESULT_ITEM_NOT_OWNED", "BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE", "getBILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE", "BILLING_RESPONSE_RESULT_NO_RESTORE", "getBILLING_RESPONSE_RESULT_NO_RESTORE", "BILLING_RESPONSE_RESULT_OK", "getBILLING_RESPONSE_RESULT_OK", "BILLING_RESPONSE_RESULT_RESTORE_COMPLETED", "getBILLING_RESPONSE_RESULT_RESTORE_COMPLETED", "BILLING_RESPONSE_RESULT_USER_CANCELED", "getBILLING_RESPONSE_RESULT_USER_CANCELED", "LIST_OF_CONSUMABLE_PRODUCTS", "", "", "LIST_OF_NONCONSUMABLE_PRODUCTS", "LIST_OF_ONE_TIME_PRODUCTS", "LIST_OF_SUBSCRIPTION_PRODUCTS", "activeSKU", "activity", "Landroid/app/Activity;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "billingFlowInProcess", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "cachedPurchasesList", "Lcom/android/billingclient/api/Purchase;", "callback", "Lkotlin/Function2;", "Ljava/lang/Void;", "isConsumable", "pendingCallback", "productDetailsMap", "", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/billingclient/api/ProductDetails;", "getProductDetailsMap", "()Ljava/util/Map;", "purchaseConsumptionInProcess", "", "restoreCallback", "acknowledgePurchase", "purchaseToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrUpdateProductDetails", "", "productId", "details", "getProductDetails", "initialize", "isConsumableIAP", "sku", "isUnchangedPurchaseList", "purchasesList", "isValidIAP", "launchBillingFlow", "loadProductDetails", "loadProductIds", "onBillingServiceDisconnected", "onBillingSetupFinished", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onProductDetailsResponse", "productDetailsList", "", "onPurchasesUpdated", "purchases", "onQueryPurchasesResponse", "postProductDetails", "processConsumablePurchase", "purchase", "wasPending", "(Lcom/android/billingclient/api/Purchase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNonConsumablePurchase", "processProductDetails", "processPurchaseList", "processPurchases", "processRestoredPurchasesList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryOneTimeProductDetails", "queryOneTimeProductPurchases", "querySubscriptionProductDetails", "querySubscriptionPurchases", "restorePreviousIAPs", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BillingDataSource implements DefaultLifecycleObserver, PurchasesUpdatedListener, BillingClientStateListener, ProductDetailsResponseListener, PurchasesResponseListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile BillingDataSource INSTANCE = null;
    private static final int MAX_RETRY_ATTEMPT = 3;
    private static final String TAG = "BB2-BillingDataSource";
    private final int BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE;
    private final int BILLING_RESPONSE_RESULT_DEVELOPER_ERROR;
    private final int BILLING_RESPONSE_RESULT_ERROR;
    private final int BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED;
    private final int BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED;
    private final int BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE;
    private final int BILLING_RESPONSE_RESULT_NO_RESTORE;
    private final int BILLING_RESPONSE_RESULT_OK;
    private final int BILLING_RESPONSE_RESULT_RESTORE_COMPLETED;
    private final int BILLING_RESPONSE_RESULT_USER_CANCELED;
    private List<String> LIST_OF_CONSUMABLE_PRODUCTS;
    private List<String> LIST_OF_NONCONSUMABLE_PRODUCTS;
    private List<String> LIST_OF_ONE_TIME_PRODUCTS;
    private List<String> LIST_OF_SUBSCRIPTION_PRODUCTS;
    private String activeSKU;
    private Activity activity;
    private final Context applicationContext;
    private BillingClient billingClient;
    private final MutableStateFlow<Boolean> billingFlowInProcess;
    private List<? extends Purchase> cachedPurchasesList;
    private Function2<? super Integer, ? super String, Void> callback;
    private final CoroutineScope externalScope;
    private boolean isConsumable;
    private Function2<? super Integer, ? super String, Void> pendingCallback;
    private final Map<String, MutableLiveData<ProductDetails>> productDetailsMap;
    private final Set<Purchase> purchaseConsumptionInProcess;
    private Function2<? super Integer, ? super String, Void> restoreCallback;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public BillingDataSource(Context applicationContext, CoroutineScope externalScope) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        this.applicationContext = applicationContext;
        this.externalScope = externalScope;
        this.productDetailsMap = new LinkedHashMap();
        this.purchaseConsumptionInProcess = new HashSet();
        this.billingFlowInProcess = StateFlowKt.MutableStateFlow(false);
        this.BILLING_RESPONSE_RESULT_USER_CANCELED = 1;
        this.BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE = 3;
        this.BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE = 4;
        this.BILLING_RESPONSE_RESULT_DEVELOPER_ERROR = 5;
        this.BILLING_RESPONSE_RESULT_ERROR = 6;
        this.BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED = 7;
        this.BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED = 8;
        this.BILLING_RESPONSE_RESULT_NO_RESTORE = 9;
        this.BILLING_RESPONSE_RESULT_RESTORE_COMPLETED = 10;
        this.LIST_OF_CONSUMABLE_PRODUCTS = CollectionsKt.emptyList();
        this.LIST_OF_NONCONSUMABLE_PRODUCTS = CollectionsKt.emptyList();
        this.LIST_OF_ONE_TIME_PRODUCTS = CollectionsKt.emptyList();
        this.LIST_OF_SUBSCRIPTION_PRODUCTS = CollectionsKt.emptyList();
    }

    public /* synthetic */ BillingDataSource(Context context, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault())) : coroutineScope);
    }

    public final Map<String, MutableLiveData<ProductDetails>> getProductDetailsMap() {
        return this.productDetailsMap;
    }

    public final int getBILLING_RESPONSE_RESULT_OK() {
        return this.BILLING_RESPONSE_RESULT_OK;
    }

    public final int getBILLING_RESPONSE_RESULT_USER_CANCELED() {
        return this.BILLING_RESPONSE_RESULT_USER_CANCELED;
    }

    public final int getBILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE() {
        return this.BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE;
    }

    public final int getBILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE() {
        return this.BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE;
    }

    public final int getBILLING_RESPONSE_RESULT_DEVELOPER_ERROR() {
        return this.BILLING_RESPONSE_RESULT_DEVELOPER_ERROR;
    }

    public final int getBILLING_RESPONSE_RESULT_ERROR() {
        return this.BILLING_RESPONSE_RESULT_ERROR;
    }

    public final int getBILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED() {
        return this.BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED;
    }

    public final int getBILLING_RESPONSE_RESULT_ITEM_NOT_OWNED() {
        return this.BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED;
    }

    public final int getBILLING_RESPONSE_RESULT_NO_RESTORE() {
        return this.BILLING_RESPONSE_RESULT_NO_RESTORE;
    }

    public final int getBILLING_RESPONSE_RESULT_RESTORE_COMPLETED() {
        return this.BILLING_RESPONSE_RESULT_RESTORE_COMPLETED;
    }

    public final void loadProductIds() {
        ArrayList<String> inAppIds = PTServicesBridge.getInAppIds("consumable");
        Intrinsics.checkNotNullExpressionValue(inAppIds, "getInAppIds(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inAppIds) {
            String str = (String) obj;
            if (str != null && str.length() > 0) {
                arrayList.add(obj);
            }
        }
        this.LIST_OF_CONSUMABLE_PRODUCTS = arrayList;
        ArrayList<String> inAppIds2 = PTServicesBridge.getInAppIds("nonconsumable");
        Intrinsics.checkNotNullExpressionValue(inAppIds2, "getInAppIds(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : inAppIds2) {
            String str2 = (String) obj2;
            if (str2 != null && str2.length() > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        this.LIST_OF_NONCONSUMABLE_PRODUCTS = arrayList3;
        this.LIST_OF_ONE_TIME_PRODUCTS = CollectionsKt.toList(CollectionsKt.toSet(CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{this.LIST_OF_CONSUMABLE_PRODUCTS, arrayList3}))));
        ArrayList<String> inAppIds3 = PTServicesBridge.getInAppIds("subscription");
        Intrinsics.checkNotNullExpressionValue(inAppIds3, "getInAppIds(...)");
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : inAppIds3) {
            String str3 = (String) obj3;
            if (str3 != null && str3.length() > 0) {
                arrayList4.add(obj3);
            }
        }
        this.LIST_OF_SUBSCRIPTION_PRODUCTS = arrayList4;
    }

    public final void addOrUpdateProductDetails(String productId, ProductDetails details) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Log.d(TAG, "addOrUpdateProductDetails: " + productId + " = " + details);
        if (!this.productDetailsMap.containsKey(productId)) {
            this.productDetailsMap.put(productId, new MutableLiveData<>(details));
            return;
        }
        MutableLiveData<ProductDetails> mutableLiveData = this.productDetailsMap.get(productId);
        if (mutableLiveData != null) {
            mutableLiveData.postValue(details);
        }
    }

    public final MutableLiveData<ProductDetails> getProductDetails(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return this.productDetailsMap.get(productId);
    }

    public final void initialize() {
        Log.d(TAG, "initialize");
        BillingClient build = BillingClient.newBuilder(this.applicationContext).setListener(this).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.billingClient = build;
        BillingClient billingClient = null;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            build = null;
        }
        if (build.isReady()) {
            return;
        }
        Log.d(TAG, "BillingClient: Start connection...");
        BillingClient billingClient2 = this.billingClient;
        if (billingClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
        } else {
            billingClient = billingClient2;
        }
        billingClient.startConnection(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Log.d(TAG, "ON_CREATE");
        initialize();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Log.d(TAG, "ON_DESTROY");
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        if (billingClient.isReady()) {
            Log.d(TAG, "BillingClient can only be used once -- closing connection");
            BillingClient billingClient3 = this.billingClient;
            if (billingClient3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            } else {
                billingClient2 = billingClient3;
            }
            billingClient2.endConnection();
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        Log.d(TAG, "onBillingSetupFinished: " + responseCode + " " + debugMessage);
        if (responseCode == 0) {
            if (this.LIST_OF_SUBSCRIPTION_PRODUCTS.size() > 0) {
                querySubscriptionProductDetails();
                querySubscriptionPurchases();
            }
            if (this.LIST_OF_ONE_TIME_PRODUCTS.size() > 0) {
                queryOneTimeProductDetails();
                queryOneTimeProductPurchases();
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        Log.d(TAG, "onBillingServiceDisconnected");
    }

    private final void querySubscriptionProductDetails() {
        Log.d(TAG, "querySubscriptionProductDetails");
        QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.LIST_OF_SUBSCRIPTION_PRODUCTS.iterator();
        while (it.hasNext()) {
            QueryProductDetailsParams.Product build = QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType("subs").build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            arrayList.add(build);
        }
        QueryProductDetailsParams.Builder productList = newBuilder.setProductList(arrayList);
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        Log.d(TAG, "about to queryProductDetailsAsync with " + arrayList + " and bc " + billingClient);
        BillingClient billingClient3 = this.billingClient;
        if (billingClient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
        } else {
            billingClient2 = billingClient3;
        }
        billingClient2.queryProductDetailsAsync(productList.build(), this);
    }

    private final void queryOneTimeProductDetails() {
        Log.d(TAG, "queryOneTimeProductDetails");
        QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        List<String> list = this.LIST_OF_ONE_TIME_PRODUCTS;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType("inapp").build());
        }
        newBuilder.setProductList(arrayList);
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        billingClient.queryProductDetailsAsync(newBuilder.build(), this);
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> productDetailsList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        Log.d(TAG, "onProductDetailsResponse: " + productDetailsList);
        int m356constructorimpl = BillingResponse.m356constructorimpl(billingResult.getResponseCode());
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        if (BillingResponse.m362isOkimpl(m356constructorimpl)) {
            processProductDetails(productDetailsList);
            return;
        }
        if (BillingResponse.m364isTerribleFailureimpl(m356constructorimpl)) {
            Log.w(TAG, "onProductDetailsResponse - Unexpected error: " + m356constructorimpl + " " + debugMessage);
            return;
        }
        Log.e(TAG, "onProductDetailsResponse: " + m356constructorimpl + " " + debugMessage);
    }

    private final void processProductDetails(List<ProductDetails> productDetailsList) {
        Log.d(TAG, "processProductDetails: " + productDetailsList);
        if (productDetailsList.isEmpty()) {
            Log.e(TAG, "processProductDetails: Expected " + this.LIST_OF_SUBSCRIPTION_PRODUCTS.size() + " subscriptions, maybe " + this.LIST_OF_ONE_TIME_PRODUCTS.size() + " one-time purchasables, Found null ProductDetails. Check to see if the products you requested are correctly published in the Google Play Console.");
            postProductDetails(CollectionsKt.emptyList());
            return;
        }
        postProductDetails(productDetailsList);
    }

    private final void postProductDetails(List<ProductDetails> productDetailsList) {
        for (ProductDetails productDetails : productDetailsList) {
            String productId = productDetails.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
            addOrUpdateProductDetails(productId, productDetails);
        }
    }

    public final void querySubscriptionPurchases() {
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        if (!billingClient.isReady()) {
            Log.e(TAG, "querySubscriptionPurchases: BillingClient is not ready");
            BillingClient billingClient3 = this.billingClient;
            if (billingClient3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                billingClient3 = null;
            }
            billingClient3.startConnection(this);
        }
        BillingClient billingClient4 = this.billingClient;
        if (billingClient4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
        } else {
            billingClient2 = billingClient4;
        }
        billingClient2.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), this);
    }

    public final void queryOneTimeProductPurchases() {
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        if (!billingClient.isReady()) {
            Log.e(TAG, "queryOneTimeProductPurchases: BillingClient is not ready");
            BillingClient billingClient3 = this.billingClient;
            if (billingClient3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                billingClient3 = null;
            }
            billingClient3.startConnection(this);
        }
        BillingClient billingClient4 = this.billingClient;
        if (billingClient4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
        } else {
            billingClient2 = billingClient4;
        }
        billingClient2.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), this);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        processPurchases(purchasesList);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        Log.d(TAG, "onPurchasesUpdated: " + responseCode + " " + debugMessage);
        if (responseCode != 0) {
            if (responseCode == 1) {
                Log.i(TAG, "onPurchasesUpdated: User cancelled the purchase");
                Function2<? super Integer, ? super String, Void> function2 = this.callback;
                if (function2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    function2 = null;
                }
                function2.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_USER_CANCELED), "User has cancelled the purchase.");
            } else if (responseCode == 5) {
                Log.e(TAG, "onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The product ID must match and the APK you are using must be signed with release keys.");
                Function2<? super Integer, ? super String, Void> function22 = this.callback;
                if (function22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    function22 = null;
                }
                function22.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_DEVELOPER_ERROR), "Developer error, check your configuration");
            } else if (responseCode == 7) {
                Log.i(TAG, "onPurchasesUpdated: The user already owns this item");
                if (!this.isConsumable) {
                    Function2<? super Integer, ? super String, Void> function23 = this.callback;
                    if (function23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callback");
                        function23 = null;
                    }
                    function23.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_OK), "Already owned. Restore");
                } else if (purchases != null) {
                    processPurchases(purchases);
                }
            }
        } else if (purchases == null) {
            Log.d(TAG, "onPurchasesUpdated: null purchase list");
            processPurchases(null);
        } else {
            processPurchases(purchases);
        }
        BuildersKt__Builders_commonKt.launch$default(this.externalScope, null, null, new BillingDataSource$onPurchasesUpdated$1(this, null), 3, null);
    }

    private final void processPurchases(List<? extends Purchase> purchasesList) {
        Log.d(TAG, "processPurchases: " + (purchasesList != null ? Integer.valueOf(purchasesList.size()) : null) + " purchase(s)");
        if (purchasesList != null) {
            if (!isUnchangedPurchaseList(purchasesList)) {
                BuildersKt__Builders_commonKt.launch$default(this.externalScope, null, null, new BillingDataSource$processPurchases$1$1(this, purchasesList, null), 3, null);
            } else {
                Log.d(TAG, "processPurchases: Purchase list has not changed");
            }
        }
    }

    private final boolean isUnchangedPurchaseList(List<? extends Purchase> purchasesList) {
        boolean areEqual = Intrinsics.areEqual(purchasesList, this.cachedPurchasesList);
        if (!areEqual) {
            this.cachedPurchasesList = purchasesList;
        }
        return areEqual;
    }

    public static /* synthetic */ void launchBillingFlow$default(BillingDataSource billingDataSource, Activity activity, String str, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        billingDataSource.launchBillingFlow(activity, str, z, function2);
    }

    public final void launchBillingFlow(Activity activity, String sku, boolean isConsumable, Function2<? super Integer, ? super String, Void> callback) {
        BillingFlowParams build;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        if (!billingClient.isReady()) {
            Log.e(TAG, "launchBillingFlow: BillingClient is not ready");
            callback.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_ERROR), "BillingClient is not ready. Try again later, log in to Google Play Store, enable IAPs, or update device to support Billing API v3.");
            return;
        }
        this.callback = callback;
        this.activity = activity;
        this.activeSKU = sku;
        this.isConsumable = isConsumable;
        MutableLiveData<ProductDetails> productDetails = getProductDetails(sku);
        if (productDetails == null) {
            Log.e(TAG, "launchBillingFlow: unknown product " + sku);
            callback.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_ERROR), "Unknown product " + sku);
            return;
        }
        ProductDetails value = productDetails.getValue();
        if (value == null || (build = BillingFlowParams.newBuilder().setProductDetailsParamsList(CollectionsKt.listOf(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(value).build())).build()) == null) {
            Log.e(TAG, "launchBillingFlow: Failed to create BillingFlowParams due to null ProductDetails on " + sku);
            callback.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_ERROR), "launchBillingFlow: Failed to create BillingFlowParams due to null ProductDetails on " + sku);
            return;
        }
        BillingClient billingClient2 = this.billingClient;
        if (billingClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient2 = null;
        }
        BillingResult launchBillingFlow = billingClient2.launchBillingFlow(activity, build);
        Intrinsics.checkNotNullExpressionValue(launchBillingFlow, "launchBillingFlow(...)");
        int responseCode = launchBillingFlow.getResponseCode();
        String debugMessage = launchBillingFlow.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        Log.d(TAG, "launchBillingFlow: BillingResponse " + responseCode + " " + debugMessage);
        if (responseCode == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.externalScope, null, null, new BillingDataSource$launchBillingFlow$1(this, null), 3, null);
            return;
        }
        Log.e(TAG, "Billing failed: + " + debugMessage);
        callback.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_ERROR), "Failed to launch Checkout: " + debugMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x012d -> B:11:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0166 -> B:14:0x0158). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acknowledgePurchase(String str, Continuation<? super Boolean> continuation) {
        BillingDataSource$acknowledgePurchase$1 billingDataSource$acknowledgePurchase$1;
        BillingDataSource billingDataSource;
        int i;
        String str2;
        AcknowledgePurchaseParams build;
        BillingDataSource billingDataSource2;
        int i2;
        BillingDataSource billingDataSource3;
        String str3;
        AcknowledgePurchaseParams acknowledgePurchaseParams;
        int m366unboximpl;
        if (continuation instanceof BillingDataSource$acknowledgePurchase$1) {
            billingDataSource$acknowledgePurchase$1 = (BillingDataSource$acknowledgePurchase$1) continuation;
            if ((billingDataSource$acknowledgePurchase$1.label & Integer.MIN_VALUE) != 0) {
                billingDataSource$acknowledgePurchase$1.label -= Integer.MIN_VALUE;
                billingDataSource = this;
                Object obj = billingDataSource$acknowledgePurchase$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingDataSource$acknowledgePurchase$1.label;
                String str4 = TAG;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    str2 = str;
                    build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str2).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    billingDataSource2 = billingDataSource;
                    i2 = 1;
                    if (i2 >= 4) {
                    }
                } else if (i == 1) {
                    int i3 = billingDataSource$acknowledgePurchase$1.I$0;
                    AcknowledgePurchaseParams acknowledgePurchaseParams2 = (AcknowledgePurchaseParams) billingDataSource$acknowledgePurchase$1.L$2;
                    String str5 = (String) billingDataSource$acknowledgePurchase$1.L$1;
                    BillingDataSource billingDataSource4 = (BillingDataSource) billingDataSource$acknowledgePurchase$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    billingDataSource3 = billingDataSource4;
                    str3 = str5;
                    acknowledgePurchaseParams = acknowledgePurchaseParams2;
                    i2 = i3;
                    m366unboximpl = ((BillingResponse) obj).m366unboximpl();
                    if (BillingResponse.m362isOkimpl(m366unboximpl)) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m366unboximpl = billingDataSource$acknowledgePurchase$1.I$1;
                    i2 = billingDataSource$acknowledgePurchase$1.I$0;
                    acknowledgePurchaseParams = (AcknowledgePurchaseParams) billingDataSource$acknowledgePurchase$1.L$2;
                    str3 = (String) billingDataSource$acknowledgePurchase$1.L$1;
                    billingDataSource3 = (BillingDataSource) billingDataSource$acknowledgePurchase$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    String str6 = TAG;
                    if (i2 < 3) {
                        Log.w(str6, "Retrying(" + i2 + ") to acknowledge for token " + str3 + " - code: " + m366unboximpl + ", message: " + m366unboximpl);
                    }
                    str2 = str3;
                    i2++;
                    str4 = str6;
                    build = acknowledgePurchaseParams;
                    billingDataSource2 = billingDataSource3;
                    if (i2 >= 4) {
                        billingDataSource$acknowledgePurchase$1.L$0 = billingDataSource2;
                        billingDataSource$acknowledgePurchase$1.L$1 = str2;
                        billingDataSource$acknowledgePurchase$1.L$2 = build;
                        billingDataSource$acknowledgePurchase$1.I$0 = i2;
                        billingDataSource$acknowledgePurchase$1.label = 1;
                        BillingDataSource$acknowledgePurchase$1 billingDataSource$acknowledgePurchase$12 = billingDataSource$acknowledgePurchase$1;
                        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(billingDataSource$acknowledgePurchase$12));
                        final SafeContinuation safeContinuation2 = safeContinuation;
                        BillingClient billingClient = billingDataSource2.billingClient;
                        if (billingClient == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                            billingClient = null;
                        }
                        billingClient.acknowledgePurchase(build, new AcknowledgePurchaseResponseListener() { // from class: com.secrethq.store.util.BillingDataSource$acknowledgePurchase$response$1$1
                            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                                Continuation<BillingResponse> continuation2 = safeContinuation2;
                                Result.Companion companion = Result.INSTANCE;
                                continuation2.resumeWith(Result.m379constructorimpl(BillingResponse.m355boximpl(BillingResponse.m356constructorimpl(billingResult.getResponseCode()))));
                            }
                        });
                        Object orThrow = safeContinuation.getOrThrow();
                        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(billingDataSource$acknowledgePurchase$12);
                        }
                        if (orThrow == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str2;
                        billingDataSource3 = billingDataSource2;
                        acknowledgePurchaseParams = build;
                        obj = orThrow;
                        m366unboximpl = ((BillingResponse) obj).m366unboximpl();
                        if (BillingResponse.m362isOkimpl(m366unboximpl)) {
                            Log.i(str4, "Acknowledge success - token: " + str3);
                            return Boxing.boxBoolean(true);
                        }
                        if (BillingResponse.m359getCanFailGracefullyimpl(m366unboximpl)) {
                            Log.i(str4, "Token " + str3 + " is already owned.");
                            return Boxing.boxBoolean(true);
                        }
                        if (BillingResponse.m363isRecoverableErrorimpl(m366unboximpl)) {
                            str6 = str4;
                            long pow = ((long) Math.pow(2.0d, i2)) * 500;
                            billingDataSource$acknowledgePurchase$1.L$0 = billingDataSource3;
                            billingDataSource$acknowledgePurchase$1.L$1 = str3;
                            billingDataSource$acknowledgePurchase$1.L$2 = acknowledgePurchaseParams;
                            billingDataSource$acknowledgePurchase$1.I$0 = i2;
                            billingDataSource$acknowledgePurchase$1.I$1 = m366unboximpl;
                            billingDataSource$acknowledgePurchase$1.label = 2;
                            if (DelayKt.delay(pow, billingDataSource$acknowledgePurchase$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (i2 < 3) {
                            }
                            str2 = str3;
                            i2++;
                            str4 = str6;
                            build = acknowledgePurchaseParams;
                            billingDataSource2 = billingDataSource3;
                            if (i2 >= 4) {
                                str6 = str4;
                                Log.w(str6, "Failed to acknowledge purchase after retries. Will process again in future.");
                                return Boxing.boxBoolean(false);
                            }
                        } else {
                            str6 = str4;
                            if (BillingResponse.m361isNonrecoverableErrorimpl(m366unboximpl) || BillingResponse.m364isTerribleFailureimpl(m366unboximpl)) {
                                Log.e(str6, "Failed to acknowledge for token " + str3 + " - code: " + m366unboximpl + ", message: " + m366unboximpl);
                                Log.w(str6, "Failed to acknowledge purchase after retries. Will process again in future.");
                                return Boxing.boxBoolean(false);
                            }
                            str2 = str3;
                            i2++;
                            str4 = str6;
                            build = acknowledgePurchaseParams;
                            billingDataSource2 = billingDataSource3;
                            if (i2 >= 4) {
                            }
                        }
                    }
                }
            }
        }
        billingDataSource = this;
        billingDataSource$acknowledgePurchase$1 = new BillingDataSource$acknowledgePurchase$1(billingDataSource, continuation);
        Object obj2 = billingDataSource$acknowledgePurchase$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingDataSource$acknowledgePurchase$1.label;
        String str42 = TAG;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processRestoredPurchasesList(List<? extends Purchase> list, Continuation<? super Void> continuation) {
        return CoroutineScopeKt.coroutineScope(new BillingDataSource$processRestoredPurchasesList$2(list, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidIAP(String sku) {
        return this.LIST_OF_SUBSCRIPTION_PRODUCTS.contains(sku) || this.LIST_OF_ONE_TIME_PRODUCTS.contains(sku);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConsumableIAP(String sku) {
        return this.LIST_OF_CONSUMABLE_PRODUCTS.contains(sku);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processPurchaseList(List<? extends Purchase> purchases) {
        Function2<? super Integer, ? super String, Void> function2 = null;
        if (purchases != null) {
            for (Purchase purchase : purchases) {
                if (purchase.getPurchaseState() == 1) {
                    if (!purchase.isAcknowledged() && !this.isConsumable) {
                        BuildersKt__Builders_commonKt.launch$default(this.externalScope, null, null, new BillingDataSource$processPurchaseList$1(this, purchase, null), 3, null);
                    } else if (!purchase.isAcknowledged() && this.isConsumable) {
                        BuildersKt__Builders_commonKt.launch$default(this.externalScope, null, null, new BillingDataSource$processPurchaseList$2(this, purchase, null), 3, null);
                    }
                }
            }
            return;
        }
        Log.d(TAG, "Empty purchase list.");
        Function2<? super Integer, ? super String, Void> function22 = this.callback;
        if (function22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
        } else {
            function2 = function22;
        }
        function2.invoke(Integer.valueOf(this.BILLING_RESPONSE_RESULT_ERROR), "Empty purchase list.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0079 -> B:10:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNonConsumablePurchase(Purchase purchase, boolean z, Continuation<? super Unit> continuation) {
        BillingDataSource$processNonConsumablePurchase$1 billingDataSource$processNonConsumablePurchase$1;
        int i;
        BillingDataSource billingDataSource;
        boolean z2;
        Iterator<String> it;
        if (continuation instanceof BillingDataSource$processNonConsumablePurchase$1) {
            billingDataSource$processNonConsumablePurchase$1 = (BillingDataSource$processNonConsumablePurchase$1) continuation;
            if ((billingDataSource$processNonConsumablePurchase$1.label & Integer.MIN_VALUE) != 0) {
                billingDataSource$processNonConsumablePurchase$1.label -= Integer.MIN_VALUE;
                Object obj = billingDataSource$processNonConsumablePurchase$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingDataSource$processNonConsumablePurchase$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    billingDataSource = this;
                    z2 = z;
                    it = purchase.getProducts().iterator();
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = billingDataSource$processNonConsumablePurchase$1.Z$0;
                    it = (Iterator) billingDataSource$processNonConsumablePurchase$1.L$2;
                    Purchase purchase2 = (Purchase) billingDataSource$processNonConsumablePurchase$1.L$1;
                    billingDataSource = (BillingDataSource) billingDataSource$processNonConsumablePurchase$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    BillingDataSource$processNonConsumablePurchase$1 billingDataSource$processNonConsumablePurchase$12 = billingDataSource$processNonConsumablePurchase$1;
                    boolean z4 = z3;
                    purchase = purchase2;
                    BillingDataSource$processNonConsumablePurchase$1 billingDataSource$processNonConsumablePurchase$13 = billingDataSource$processNonConsumablePurchase$12;
                    Function2<? super Integer, ? super String, Void> function2 = null;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z4) {
                            Function2<? super Integer, ? super String, Void> function22 = billingDataSource.pendingCallback;
                            if (function22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pendingCallback");
                            } else {
                                function2 = function22;
                            }
                            function2.invoke(Boxing.boxInt(billingDataSource.BILLING_RESPONSE_RESULT_OK), "Purchase successful.");
                        } else {
                            Function2<? super Integer, ? super String, Void> function23 = billingDataSource.callback;
                            if (function23 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("callback");
                            } else {
                                function2 = function23;
                            }
                            function2.invoke(Boxing.boxInt(billingDataSource.BILLING_RESPONSE_RESULT_OK), "Purchase successful.");
                        }
                        z2 = z4;
                        billingDataSource$processNonConsumablePurchase$1 = billingDataSource$processNonConsumablePurchase$13;
                        if (!it.hasNext()) {
                            it.next();
                            String purchaseToken = purchase.getPurchaseToken();
                            Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                            billingDataSource$processNonConsumablePurchase$1.L$0 = billingDataSource;
                            billingDataSource$processNonConsumablePurchase$1.L$1 = purchase;
                            billingDataSource$processNonConsumablePurchase$1.L$2 = it;
                            billingDataSource$processNonConsumablePurchase$1.Z$0 = z2;
                            billingDataSource$processNonConsumablePurchase$1.label = 1;
                            Object acknowledgePurchase = billingDataSource.acknowledgePurchase(purchaseToken, billingDataSource$processNonConsumablePurchase$1);
                            if (acknowledgePurchase == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            billingDataSource$processNonConsumablePurchase$12 = billingDataSource$processNonConsumablePurchase$1;
                            z4 = z2;
                            obj = acknowledgePurchase;
                            BillingDataSource$processNonConsumablePurchase$1 billingDataSource$processNonConsumablePurchase$132 = billingDataSource$processNonConsumablePurchase$12;
                            Function2<? super Integer, ? super String, Void> function24 = null;
                            if (!((Boolean) obj).booleanValue()) {
                                Log.e(TAG, "Error acknowledging purchase: " + purchase.getProducts());
                                if (z4) {
                                    Function2<? super Integer, ? super String, Void> function25 = billingDataSource.pendingCallback;
                                    if (function25 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("pendingCallback");
                                    } else {
                                        function24 = function25;
                                    }
                                    function24.invoke(Boxing.boxInt(billingDataSource.BILLING_RESPONSE_RESULT_ERROR), "Error acknowledging purchase: " + purchase.getProducts());
                                } else {
                                    Function2<? super Integer, ? super String, Void> function26 = billingDataSource.callback;
                                    if (function26 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("callback");
                                    } else {
                                        function24 = function26;
                                    }
                                    function24.invoke(Boxing.boxInt(billingDataSource.BILLING_RESPONSE_RESULT_ERROR), "Error acknowledging purchase: " + purchase.getProducts());
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        billingDataSource$processNonConsumablePurchase$1 = new BillingDataSource$processNonConsumablePurchase$1(this, continuation);
        Object obj2 = billingDataSource$processNonConsumablePurchase$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingDataSource$processNonConsumablePurchase$1.label;
        if (i != 0) {
        }
    }

    static /* synthetic */ Object processNonConsumablePurchase$default(BillingDataSource billingDataSource, Purchase purchase, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return billingDataSource.processNonConsumablePurchase(purchase, z, continuation);
    }

    static /* synthetic */ Object processConsumablePurchase$default(BillingDataSource billingDataSource, Purchase purchase, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return billingDataSource.processConsumablePurchase(purchase, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processConsumablePurchase(final Purchase purchase, final boolean z, Continuation<? super Unit> continuation) {
        BillingClient billingClient = null;
        Function2<? super Integer, ? super String, Void> function2 = null;
        Function2<? super Integer, ? super String, Void> function22 = null;
        if (!this.purchaseConsumptionInProcess.contains(purchase)) {
            this.purchaseConsumptionInProcess.add(purchase);
            BillingClient billingClient2 = this.billingClient;
            if (billingClient2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            } else {
                billingClient = billingClient2;
            }
            billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: com.secrethq.store.util.BillingDataSource$$ExternalSyntheticLambda1
                @Override // com.android.billingclient.api.ConsumeResponseListener
                public final void onConsumeResponse(BillingResult billingResult, String str) {
                    BillingDataSource.processConsumablePurchase$lambda$12(BillingDataSource.this, purchase, z, billingResult, str);
                }
            });
            return Unit.INSTANCE;
        }
        if (z) {
            Function2<? super Integer, ? super String, Void> function23 = this.pendingCallback;
            if (function23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pendingCallback");
            } else {
                function2 = function23;
            }
            function2.invoke(Boxing.boxInt(this.BILLING_RESPONSE_RESULT_ERROR), "Already consuming the product.");
            return Unit.INSTANCE;
        }
        Function2<? super Integer, ? super String, Void> function24 = this.callback;
        if (function24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
        } else {
            function22 = function24;
        }
        function22.invoke(Boxing.boxInt(this.BILLING_RESPONSE_RESULT_ERROR), "Already consuming the product.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processConsumablePurchase$lambda$12(BillingDataSource this$0, Purchase purchase, boolean z, BillingResult billingResult, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(purchase, "$purchase");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
        this$0.purchaseConsumptionInProcess.remove(purchase);
        Function2<? super Integer, ? super String, Void> function2 = null;
        if (billingResult.getResponseCode() == 0) {
            Log.d(TAG, "Consumption successful");
            BuildersKt__Builders_commonKt.launch$default(this$0.externalScope, null, null, new BillingDataSource$processConsumablePurchase$2$1(z, this$0, null), 3, null);
            return;
        }
        Log.e(TAG, "Error while consuming: " + billingResult.getDebugMessage());
        if (z) {
            Function2<? super Integer, ? super String, Void> function22 = this$0.pendingCallback;
            if (function22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pendingCallback");
            } else {
                function2 = function22;
            }
            function2.invoke(Integer.valueOf(this$0.BILLING_RESPONSE_RESULT_ERROR), "Purchase was not successful.");
            return;
        }
        Function2<? super Integer, ? super String, Void> function23 = this$0.callback;
        if (function23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
        } else {
            function2 = function23;
        }
        function2.invoke(Integer.valueOf(this$0.BILLING_RESPONSE_RESULT_ERROR), "Purchase was not successful.");
    }

    public final void loadProductDetails(Activity activity, Function2<? super Integer, ? super String, Void> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.activity = activity;
        loadProductIds();
        if (this.LIST_OF_SUBSCRIPTION_PRODUCTS.size() > 0) {
            querySubscriptionProductDetails();
            querySubscriptionPurchases();
        }
        if (this.LIST_OF_ONE_TIME_PRODUCTS.size() > 0) {
            queryOneTimeProductDetails();
            queryOneTimeProductPurchases();
        }
        callback.invoke(0, "test");
    }

    public final void restorePreviousIAPs(Activity activity, Function2<? super Integer, ? super String, Void> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.activity = activity;
        this.restoreCallback = callback;
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.secrethq.store.util.BillingDataSource$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingDataSource.restorePreviousIAPs$lambda$13(BillingDataSource.this, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restorePreviousIAPs$lambda$13(BillingDataSource this$0, BillingResult billingResult, List purchasesList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        Function2<? super Integer, ? super String, Void> function2 = null;
        if (billingResult.getResponseCode() == 0) {
            if (!purchasesList.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(this$0.externalScope, null, null, new BillingDataSource$restorePreviousIAPs$1$1(this$0, purchasesList, null), 3, null);
                return;
            }
            Log.d(TAG, "Nothing to restore.");
            Function2<? super Integer, ? super String, Void> function22 = this$0.restoreCallback;
            if (function22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("restoreCallback");
            } else {
                function2 = function22;
            }
            function2.invoke(Integer.valueOf(this$0.BILLING_RESPONSE_RESULT_NO_RESTORE), "No purchase history found. Skipping Restore");
            return;
        }
        Function2<? super Integer, ? super String, Void> function23 = this$0.restoreCallback;
        if (function23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("restoreCallback");
        } else {
            function2 = function23;
        }
        function2.invoke(Integer.valueOf(this$0.BILLING_RESPONSE_RESULT_ERROR), "Could not restore purchases at this time, try again later");
    }

    /* compiled from: BillingDataSource.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/secrethq/store/util/BillingDataSource$Companion;", "", "()V", "INSTANCE", "Lcom/secrethq/store/util/BillingDataSource;", "MAX_RETRY_ATTEMPT", "", "TAG", "", "getInstance", "applicationContext", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BillingDataSource getInstance(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            BillingDataSource billingDataSource = BillingDataSource.INSTANCE;
            if (billingDataSource == null) {
                synchronized (this) {
                    billingDataSource = BillingDataSource.INSTANCE;
                    if (billingDataSource == null) {
                        billingDataSource = new BillingDataSource(applicationContext, null, 2, 0 == true ? 1 : 0);
                        Companion companion = BillingDataSource.INSTANCE;
                        BillingDataSource.INSTANCE = billingDataSource;
                    }
                }
            }
            return billingDataSource;
        }
    }
}
