package com.squareup.cash.work.tinygraph;

import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.brand.checkout.OpenTabCheckoutRouting;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LocalErrorResponse;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabCheckoutScreen;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes7.dex */
public abstract class BaseRepositoryKt {
    public static final FlowExtensionsKt$combine$$inlined$combine$1 events(Flow flow, Function1 function1, KClass kClass) {
        flow.getClass();
        kClass.getClass();
        return new FlowExtensionsKt$combine$$inlined$combine$1(16, new FlowExtensionsKt$combine$$inlined$combine$1(17, flow, kClass), function1);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCardSpendingInsightsHome.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Screen toCheckoutScreen$default(CreateCartResponse createCartResponse, BrandSpot brandSpot, AttributionKey attributionKey, boolean z, BrandSpotSyncTokens brandSpotSyncTokens, OpenTabCheckoutRouting openTabCheckoutRouting) {
        LocalCart localCart;
        boolean z2;
        boolean z3;
        boolean z4;
        List list;
        int ordinal;
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        openTabCheckoutRouting.getClass();
        zzho zzhoVar = createCartResponse.response;
        LocalTippingConfiguration localTippingConfiguration = createCartResponse.tipping_configuration;
        List list2 = createCartResponse.available_order_workflows;
        if (zzhoVar != null) {
            CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
            if (createCartResponse$Response$Cart != null) {
                localCart = createCartResponse$Response$Cart.value;
                LocalFulfillment localFulfillment = createCartResponse.fulfillment;
                Fulfillment fulfillment = localFulfillment == null ? FulfillmentKt.toFulfillment(localFulfillment) : null;
                z2 = (fulfillment == null ? fulfillment.f911type : null) != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE;
                boolean z5 = !z2 && list2.contains(OrderWorkflow.ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE);
                z3 = !z2 && list2.contains(OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE);
                if (z2 && OpenTabStateKt.getHasOpenTabRounds(localCart)) {
                    ordinal = openTabCheckoutRouting.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z3 = true;
                    }
                    if (z3) {
                        z4 = true;
                        if (openTabCheckoutRouting != OpenTabCheckoutRouting.OPEN_TAB_WHEN_AVAILABLE && z5) {
                            return new LocalBrandLocationOpenTabCheckoutScreen(brandSpot, attributionKey, z, fulfillment, null, brandSpotSyncTokens);
                        }
                        OrderWorkflow orderWorkflow = z4 ? OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE : null;
                        boolean z6 = !(localTippingConfiguration != null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false);
                        String str = localTippingConfiguration != null ? localTippingConfiguration.title : null;
                        list = localTippingConfiguration != null ? localTippingConfiguration.suggestions : null;
                        if (list == null) {
                            list = EmptyList.INSTANCE;
                        }
                        List list3 = list;
                        String str2 = localTippingConfiguration != null ? localTippingConfiguration.subtitle : null;
                        LocalCashEarningsConfiguration localCashEarningsConfiguration = createCartResponse.local_cash_earnings_configuration;
                        return new LocalBrandLocationCheckoutScreen(brandSpot, attributionKey, z, fulfillment, (LocalErrorResponse) null, orderWorkflow, z6, str, list3, str2, localCashEarningsConfiguration != null ? localCashEarningsConfiguration.fine_print_markdown : null, z2 ? LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD, brandSpotSyncTokens);
                    }
                }
                z4 = false;
                if (openTabCheckoutRouting != OpenTabCheckoutRouting.OPEN_TAB_WHEN_AVAILABLE) {
                }
                if (z4) {
                }
                boolean z62 = !(localTippingConfiguration != null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false);
                if (localTippingConfiguration != null) {
                }
                if (localTippingConfiguration != null) {
                }
                if (list == null) {
                }
                List list32 = list;
                if (localTippingConfiguration != null) {
                }
                LocalCashEarningsConfiguration localCashEarningsConfiguration2 = createCartResponse.local_cash_earnings_configuration;
                return new LocalBrandLocationCheckoutScreen(brandSpot, attributionKey, z, fulfillment, (LocalErrorResponse) null, orderWorkflow, z62, str, list32, str2, localCashEarningsConfiguration2 != null ? localCashEarningsConfiguration2.fine_print_markdown : null, z2 ? LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD, brandSpotSyncTokens);
            }
        }
        localCart = null;
        LocalFulfillment localFulfillment2 = createCartResponse.fulfillment;
        if (localFulfillment2 == null) {
        }
        if ((fulfillment == null ? fulfillment.f911type : null) != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE) {
        }
        if (z2) {
        }
        if (z2) {
        }
        if (z2) {
            ordinal = openTabCheckoutRouting.ordinal();
            if (ordinal != 0) {
            }
            if (z3) {
            }
        }
        z4 = false;
        if (openTabCheckoutRouting != OpenTabCheckoutRouting.OPEN_TAB_WHEN_AVAILABLE) {
        }
        if (z4) {
        }
        boolean z622 = !(localTippingConfiguration != null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false);
        if (localTippingConfiguration != null) {
        }
        if (localTippingConfiguration != null) {
        }
        if (list == null) {
        }
        List list322 = list;
        if (localTippingConfiguration != null) {
        }
        LocalCashEarningsConfiguration localCashEarningsConfiguration22 = createCartResponse.local_cash_earnings_configuration;
        return new LocalBrandLocationCheckoutScreen(brandSpot, attributionKey, z, fulfillment, (LocalErrorResponse) null, orderWorkflow, z622, str, list322, str2, localCashEarningsConfiguration22 != null ? localCashEarningsConfiguration22.fine_print_markdown : null, z2 ? LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD, brandSpotSyncTokens);
    }

    public static final SafeFlow toFlow(Function1 function1) {
        return new SafeFlow(new WorkerWorkflow$render$1(function1, null, 6));
    }
}
