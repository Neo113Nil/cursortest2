package com.squareup.cash.work.data.real;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandCardDetailsKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalAddBrandsScreen;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import app.cash.local.screens.app.LocalNeighborhoodsMapScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalOrdersScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalPosLocalCashRedemptionScreen;
import app.cash.local.viewmodels.BrandFollowViewEvent$Toggled;
import app.cash.local.viewmodels.internal.HasOrderTokenEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.cdf.localclient.LocalClientBrandCardTap;
import com.squareup.cash.cdf.localclient.LocalClientTabCheckIn;
import com.squareup.cash.cdf.localclient.LocalClientTabViewBrandCollectionApplet;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.protos.cash.local.client.app.v1.card.BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard$TypeDetails$BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewResponse;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.TimerWorker$run$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPayDataLoader$loadPayData$2 extends SuspendLambda implements Function2 {
    public boolean $hasPayrollFeatures;
    public final /* synthetic */ Object $merchantToken;
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object $requestMetadata;
    public final /* synthetic */ Object $teamMemberId;
    public /* synthetic */ Object L$0;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$loadPayData$2(Flow flow, Continuation continuation, TabContentPresenter tabContentPresenter, boolean z, Map map, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, State state2, MutableState mutableState4, MutableState mutableState5) {
        super(2, continuation);
        this.L$2 = flow;
        this.L$3 = tabContentPresenter;
        this.$hasPayrollFeatures = z;
        this.L$4 = map;
        this.L$6 = mutableState;
        this.L$7 = mutableState2;
        this.L$8 = mutableState3;
        this.this$0 = state;
        this.$requestMetadata = state2;
        this.$teamMemberId = mutableState4;
        this.$merchantToken = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$merchantToken;
        Object obj3 = this.$teamMemberId;
        Object obj4 = this.$requestMetadata;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                RealPayDataLoader$loadPayData$2 realPayDataLoader$loadPayData$2 = new RealPayDataLoader$loadPayData$2(this.$hasPayrollFeatures, (RealPayDataLoader) obj5, (RealPayDataLoader.RequestMetadata) obj4, (String) obj3, (String) obj2, continuation);
                realPayDataLoader$loadPayData$2.L$0 = obj;
                return realPayDataLoader$loadPayData$2;
            case 1:
                RealPayDataLoader$loadPayData$2 realPayDataLoader$loadPayData$22 = new RealPayDataLoader$loadPayData$2((Flow) this.L$2, continuation, (TabContentPresenter) this.L$3, this.$hasPayrollFeatures, (Map) this.L$4, (MutableState) this.L$6, (MutableState) this.L$7, (MutableState) this.L$8, (State) obj5, (State) obj4, (MutableState) obj3, (MutableState) obj2);
                realPayDataLoader$loadPayData$22.L$0 = obj;
                return realPayDataLoader$loadPayData$22;
            default:
                RealPayDataLoader$loadPayData$2 realPayDataLoader$loadPayData$23 = new RealPayDataLoader$loadPayData$2((ActivityTabPresenter) this.L$4, (ContactHeaderViewModel) this.L$6, (InlineAppMessageViewModel) this.L$7, (InlineAppMessageV2ViewModel) this.L$8, (CardAppMessageViewModel) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
                realPayDataLoader$loadPayData$23.L$0 = obj;
                return realPayDataLoader$loadPayData$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealPayDataLoader$loadPayData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealPayDataLoader$loadPayData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealPayDataLoader$loadPayData$2) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlinx.coroutines.Deferred] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object awaitInternal;
        DeferredCoroutine deferredCoroutine;
        DeferredCoroutine deferredCoroutine2;
        Object await;
        Deferred deferred;
        GetShiftsOverviewResponse getShiftsOverviewResponse;
        Object await2;
        GetShiftsOverviewResponse getShiftsOverviewResponse2;
        Deferred deferred2;
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse;
        Object await3;
        List list;
        boolean z;
        Object access$buildFeedEntries;
        LoadingState loadingState;
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$merchantToken;
        Object obj4 = this.$teamMemberId;
        Object obj5 = this.$requestMetadata;
        Continuation continuation = null;
        switch (i) {
            case 0:
                String str = (String) obj4;
                RealPayDataLoader realPayDataLoader = (RealPayDataLoader) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                int i3 = 2;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeferredCoroutine async$default2 = JobKt.async$default(coroutineScope, null, null, new TimerWorker$run$1(realPayDataLoader, (RealPayDataLoader.RequestMetadata) obj5, continuation, 16), 3);
                    DeferredCoroutine async$default3 = JobKt.async$default(coroutineScope, null, null, new RealPayDataLoader$loadPayData$2$payStubsDeferred$1(realPayDataLoader, str, continuation, i3), 3);
                    DeferredCoroutine async$default4 = JobKt.async$default(coroutineScope, null, null, new RealPayDataLoader$loadPayData$2$payStubsDeferred$1(realPayDataLoader, (String) obj3, continuation, 0), 3);
                    async$default = JobKt.async$default(coroutineScope, null, null, new RealPayDataLoader$loadPayData$2$payStubsDeferred$1(realPayDataLoader, str, continuation, 1), 3);
                    this.L$0 = null;
                    this.L$2 = async$default3;
                    this.L$3 = async$default4;
                    this.L$4 = async$default;
                    this.label = 1;
                    awaitInternal = async$default2.awaitInternal(this);
                    if (awaitInternal != coroutineSingletons) {
                        deferredCoroutine = async$default4;
                        deferredCoroutine2 = async$default3;
                    }
                } else if (i2 == 1) {
                    async$default = (Deferred) this.L$4;
                    ?? r1 = (Deferred) this.L$3;
                    deferredCoroutine2 = (DeferredCoroutine) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    deferredCoroutine = r1;
                    awaitInternal = obj;
                } else if (i2 == 2) {
                    getShiftsOverviewResponse = (GetShiftsOverviewResponse) this.L$6;
                    deferred = (Deferred) this.L$4;
                    ?? r2 = (Deferred) this.L$3;
                    SafeTrace.throwOnFailure(obj);
                    deferredCoroutine = r2;
                    await = obj;
                    GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse2 = (GetEmployeePayrollOverviewResponse) await;
                    this.L$0 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = deferred;
                    this.L$6 = getShiftsOverviewResponse;
                    this.L$7 = getEmployeePayrollOverviewResponse2;
                    this.label = 3;
                    await2 = deferredCoroutine.await(this);
                    if (await2 != coroutineSingletons) {
                        getShiftsOverviewResponse2 = getShiftsOverviewResponse;
                        deferred2 = deferred;
                        getEmployeePayrollOverviewResponse = getEmployeePayrollOverviewResponse2;
                        List list2 = (List) await2;
                        this.L$0 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$6 = getShiftsOverviewResponse2;
                        this.L$7 = getEmployeePayrollOverviewResponse;
                        this.L$8 = list2;
                        this.label = 4;
                        await3 = deferred2.await(this);
                        if (await3 != coroutineSingletons) {
                        }
                    }
                } else if (i2 == 3) {
                    GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse3 = (GetEmployeePayrollOverviewResponse) this.L$7;
                    GetShiftsOverviewResponse getShiftsOverviewResponse3 = (GetShiftsOverviewResponse) this.L$6;
                    Deferred deferred3 = (Deferred) this.L$4;
                    SafeTrace.throwOnFailure(obj);
                    getEmployeePayrollOverviewResponse = getEmployeePayrollOverviewResponse3;
                    deferred2 = deferred3;
                    getShiftsOverviewResponse2 = getShiftsOverviewResponse3;
                    await2 = obj;
                    List list22 = (List) await2;
                    this.L$0 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$6 = getShiftsOverviewResponse2;
                    this.L$7 = getEmployeePayrollOverviewResponse;
                    this.L$8 = list22;
                    this.label = 4;
                    await3 = deferred2.await(this);
                    if (await3 != coroutineSingletons) {
                        list = list22;
                    }
                    break;
                } else if (i2 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    List list3 = (List) this.L$8;
                    getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) this.L$7;
                    getShiftsOverviewResponse2 = (GetShiftsOverviewResponse) this.L$6;
                    SafeTrace.throwOnFailure(obj);
                    list = list3;
                    await3 = obj;
                    break;
                }
                GetShiftsOverviewResponse getShiftsOverviewResponse4 = (GetShiftsOverviewResponse) awaitInternal;
                if (getShiftsOverviewResponse4 != null) {
                    this.L$0 = null;
                    this.L$2 = null;
                    this.L$3 = deferredCoroutine;
                    this.L$4 = async$default;
                    this.L$6 = getShiftsOverviewResponse4;
                    this.label = 2;
                    await = deferredCoroutine2.await(this);
                    if (await != coroutineSingletons) {
                        deferred = async$default;
                        getShiftsOverviewResponse = getShiftsOverviewResponse4;
                        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse22 = (GetEmployeePayrollOverviewResponse) await;
                        this.L$0 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = deferred;
                        this.L$6 = getShiftsOverviewResponse;
                        this.L$7 = getEmployeePayrollOverviewResponse22;
                        this.label = 3;
                        await2 = deferredCoroutine.await(this);
                        if (await2 != coroutineSingletons) {
                        }
                    }
                }
                break;
            case 1:
                final CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$2;
                    final TabContentPresenter tabContentPresenter = (TabContentPresenter) this.L$3;
                    final boolean z2 = this.$hasPayrollFeatures;
                    final Map map = (Map) this.L$4;
                    final MutableState mutableState = (MutableState) this.L$6;
                    final MutableState mutableState2 = (MutableState) this.L$7;
                    final MutableState mutableState3 = (MutableState) this.L$8;
                    final State state = (State) obj2;
                    final State state2 = (State) obj5;
                    final MutableState mutableState4 = (MutableState) obj4;
                    final MutableState mutableState5 = (MutableState) obj3;
                    FlowCollector flowCollector = new FlowCollector() { // from class: app.cash.local.presenters.wallet.TabContentPresenter$models$$inlined$CollectEffect$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj6, Continuation continuation2) {
                            Object obj7;
                            String str2;
                            Integer intOrNull;
                            String str3;
                            LocalMiniCard localMiniCard;
                            LocalPOSCheckIn.Color color;
                            LocalPOSCheckIn.MiniCard miniCard;
                            LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails;
                            BrandCardDetails brandCardDetails;
                            TabContentPresenter tabContentPresenter2 = tabContentPresenter;
                            ArrayList arrayList = tabContentPresenter2.brandCollectionSections;
                            RealLocalLauncher realLocalLauncher = tabContentPresenter2.launcher;
                            Analytics analytics = tabContentPresenter2.analytics;
                            BetterNavigator.ScreenNavigator screenNavigator = tabContentPresenter2.navigator;
                            LocalHomeViewEvent localHomeViewEvent = (LocalHomeViewEvent) obj6;
                            if (localHomeViewEvent instanceof LocalHomeViewEvent.MapButtonClicked) {
                                screenNavigator.goTo(LocalNeighborhoodsMapScreen.INSTANCE);
                            } else if (localHomeViewEvent instanceof LocalHomeViewEvent.TabToolbarEvent) {
                                JobKt.launch$default(coroutineScope2, null, null, new ZiplineLoader$ModuleJob$run$3(tabContentPresenter2, localHomeViewEvent, null, 19), 3);
                            } else if (localHomeViewEvent instanceof LocalHomeViewEvent.WalletCardClicked) {
                                LocalHomeViewEvent.WalletCardClicked walletCardClicked = (LocalHomeViewEvent.WalletCardClicked) localHomeViewEvent;
                                BrandSpot brandSpot = walletCardClicked.brandSpot;
                                String str4 = brandSpot.brandToken;
                                LocalClientBrandCardTap.BrandCardElement brandCardElement = LocalClientBrandCardTap.BrandCardElement.Card;
                                LocalCard localCard = (LocalCard) ((Map) mutableState.getValue()).get(brandSpot);
                                analytics.track(new LocalClientBrandCardTap(str4, (localCard == null || (localCard$TypeDetails$BrandCardDetails = localCard.type_details) == null || (brandCardDetails = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails)) == null) ? null : brandCardDetails.attribution_key), null);
                                screenNavigator.goTo(new LocalBrandProfileScreen(walletCardClicked.brandSpot, (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                            } else if (localHomeViewEvent instanceof LocalHomeViewEvent.AddMenuClicked) {
                                screenNavigator.goTo(LocalAddBrandsScreen.INSTANCE);
                            } else {
                                int i5 = 0;
                                if (localHomeViewEvent instanceof LocalHomeViewEvent.ActiveOrderClicked) {
                                    for (LocalOrder localOrder : (List) mutableState2.getValue()) {
                                        if (Intrinsics.areEqual(localOrder.token, ((LocalHomeViewEvent.ActiveOrderClicked) localHomeViewEvent).token)) {
                                            screenNavigator.goTo(new LocalOrderStatusScreen((LocalOrderStatusScreen.Type) new LocalOrderStatusScreen.Type.Preloaded(localOrder), false, 6));
                                        }
                                    }
                                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                if (localHomeViewEvent instanceof LocalHomeViewEvent.AllActiveOrdersClicked) {
                                    screenNavigator.goTo(LocalOrdersScreen.INSTANCE);
                                } else if ((localHomeViewEvent instanceof LocalHomeViewEvent.PastOrderClicked) || (localHomeViewEvent instanceof LocalHomeViewEvent.ReorderClicked)) {
                                    MutableState mutableState6 = mutableState3;
                                    Iterator it = ((List) mutableState6.getValue()).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj7 = null;
                                            break;
                                        }
                                        obj7 = it.next();
                                        LocalActionOrdering.PastOrder pastOrder = ((GetSuggestedReordersResponse.Reorder) obj7).order;
                                        if (Intrinsics.areEqual(pastOrder != null ? pastOrder.order_token : null, ((HasOrderTokenEvent) localHomeViewEvent).mo1296getToken_iIA0Uw())) {
                                            break;
                                        }
                                    }
                                    GetSuggestedReordersResponse.Reorder reorder = (GetSuggestedReordersResponse.Reorder) obj7;
                                    if (reorder != null || ((intOrNull = StringsKt.toIntOrNull(((HasOrderTokenEvent) localHomeViewEvent).mo1296getToken_iIA0Uw())) != null && (reorder = (GetSuggestedReordersResponse.Reorder) CollectionsKt.getOrNull(intOrNull.intValue(), (List) mutableState6.getValue())) != null)) {
                                        LocalActionOrdering.PastOrder pastOrder2 = reorder.order;
                                        String str5 = reorder.brand_token;
                                        if (str5 != null && (str2 = reorder.location_token) != null) {
                                            BrandSpot brandSpot2 = new BrandSpot(str5, str2);
                                            AttributionKey attributionKey = new AttributionKey(null);
                                            pastOrder2.getClass();
                                            Iterator it2 = ((List) mutableState6.getValue()).iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    i5 = -1;
                                                    break;
                                                }
                                                LocalActionOrdering.PastOrder pastOrder3 = ((GetSuggestedReordersResponse.Reorder) it2.next()).order;
                                                pastOrder3.getClass();
                                                if (Intrinsics.areEqual(pastOrder3.order_token, pastOrder2.order_token)) {
                                                    break;
                                                }
                                                i5++;
                                            }
                                            screenNavigator.goTo(new LocalBrandLocationCartScreen(brandSpot2, attributionKey, false, pastOrder2, new Long(i5), null, 32));
                                        }
                                    }
                                } else if (localHomeViewEvent instanceof LocalHomeViewEvent.MarketingMessageClicked) {
                                    screenNavigator.goTo(new LocalMarketingMessageScreen(((LocalHomeViewEvent.MarketingMessageClicked) localHomeViewEvent).marketingMessage));
                                } else if (localHomeViewEvent instanceof LocalHomeViewEvent.LocalCashClicked) {
                                    if (((LocalCashBalance) state.getValue()) != null) {
                                        screenNavigator.goTo(new LocalCashBalanceScreen(3));
                                    }
                                } else if (localHomeViewEvent instanceof LocalHomeViewEvent.AllMarketingMessagesOnClick) {
                                    screenNavigator.goTo(new LocalMarketingMessagesScreen(null));
                                } else if (localHomeViewEvent instanceof LocalHomeViewEvent.CheckInClicked) {
                                    analytics.track(new LocalClientTabCheckIn(), null);
                                    State state3 = state2;
                                    LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) state3.getValue();
                                    if (localPOSCheckIn == null || !LocalsKt.getCheckedIn(localPOSCheckIn)) {
                                        screenNavigator.goTo(LocalPosCheckInScreen.INSTANCE);
                                    } else if (z2) {
                                        LocalPOSCheckIn localPOSCheckIn2 = (LocalPOSCheckIn) state3.getValue();
                                        localPOSCheckIn2.getClass();
                                        LocalPOSCheckIn.Location location = localPOSCheckIn2.location;
                                        String str6 = localPOSCheckIn2.check_in_token;
                                        String str7 = location != null ? location.location_token : null;
                                        String str8 = location != null ? location.brand_name : null;
                                        if (location == null || (miniCard = location.mini_card) == null) {
                                            localMiniCard = null;
                                        } else {
                                            LocalPOSCheckIn.Image image = miniCard.icon;
                                            LocalImage localImage = image != null ? new LocalImage(image.light_url, image.dark_url, (Long) null, (Long) null, (LocalColor) null, 60) : null;
                                            LocalPOSCheckIn.Color color2 = miniCard.background_color;
                                            localMiniCard = new LocalMiniCard(color2 != null ? new LocalColor(color2.light_color, color2.dark_color) : null, null, localImage, null, ByteString.EMPTY);
                                        }
                                        screenNavigator.goTo(new LocalPosLocalCashRedemptionScreen(new POSLocalCashRedemption(null, str7, str8, localMiniCard, (location == null || (color = location.foreground_color) == null) ? null : new LocalColor(color.light_color, color.dark_color), location != null ? location.cashtag : null, EmptyList.INSTANCE, str6, ByteString.EMPTY)));
                                    }
                                } else if (localHomeViewEvent instanceof BrandCollectionEvent) {
                                    BrandCollectionEvent brandCollectionEvent = (BrandCollectionEvent) localHomeViewEvent;
                                    if (brandCollectionEvent instanceof BrandCollectionEvent.LocationRowClicked) {
                                        realLocalLauncher.openWeb(screenNavigator, ((BrandCollectionEvent.LocationRowClicked) localHomeViewEvent).clientRoute);
                                    } else {
                                        if (brandCollectionEvent instanceof BrandCollectionEvent.SearchInputChanged) {
                                            Path$$ExternalSyntheticBUOutline0.m$1(localHomeViewEvent, "Unexpected event ");
                                            return null;
                                        }
                                        if (brandCollectionEvent instanceof BrandCollectionEvent.PrimaryCtaClicked) {
                                            realLocalLauncher.openWeb(screenNavigator, ((BrandCollectionEvent.PrimaryCtaClicked) localHomeViewEvent).clientRoute);
                                        } else {
                                            if (!(brandCollectionEvent instanceof BrandCollectionEvent.BrandFollowToggled)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            BrandCollectionBrandFollowPresenter brandCollectionBrandFollowPresenter = (BrandCollectionBrandFollowPresenter) map.get(((BrandCollectionEvent.BrandFollowToggled) localHomeViewEvent).brandSpot);
                                            if (brandCollectionBrandFollowPresenter != null) {
                                                StateFlowKt.emitOrThrow(brandCollectionBrandFollowPresenter.events, BrandFollowViewEvent$Toggled.INSTANCE);
                                            }
                                        }
                                    }
                                } else if (localHomeViewEvent instanceof LocalHomeViewEvent.BrandCollectionAppletViewed) {
                                    MutableState mutableState7 = mutableState4;
                                    if (!((Boolean) mutableState7.getValue()).booleanValue() && !arrayList.isEmpty()) {
                                        mutableState7.setValue(Boolean.TRUE);
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            CollectionsKt__MutableCollectionsKt.addAll(((BrandCollection) it3.next()).locations, arrayList2);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            String str9 = ((BrandCollection.Location) it4.next()).location_token;
                                            if (str9 != null) {
                                                arrayList3.add(str9);
                                            }
                                        }
                                        analytics.track(new LocalClientTabViewBrandCollectionApplet(CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, null, 62)), null);
                                    }
                                } else if (localHomeViewEvent instanceof LocalHomeViewEvent.Refresh) {
                                    MutableState mutableState8 = mutableState5;
                                    mutableState8.setValue(new RefreshState(((RefreshState) mutableState8.getValue()).key + 1, 30));
                                } else {
                                    if (!(localHomeViewEvent instanceof LocalHomeViewEvent.OnboardingCtaClicked)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = tabContentPresenter2.enrollmentIncentive;
                                    if (enrollmentIncentive != null && (str3 = enrollmentIncentive.accept_cta_client_route) != null) {
                                        realLocalLauncher.openWeb(screenNavigator, str3);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                MutableState mutableState6 = (MutableState) obj5;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LoadingState loadingState2 = ((Activities) mutableState6.getValue()).loadingState;
                    z = ((Activities) mutableState6.getValue()).hasMore;
                    this.L$0 = null;
                    this.L$2 = produceStateScope;
                    this.L$3 = loadingState2;
                    this.$hasPayrollFeatures = z;
                    this.label = 1;
                    access$buildFeedEntries = ActivityTabPresenter.access$buildFeedEntries((ActivityTabPresenter) this.L$4, (Activities) mutableState6.getValue(), (ContactHeaderViewModel) this.L$6, (List) ((MutableState) obj4).getValue(), (InvitationConfig) ((MutableState) obj3).getValue(), (InlineAppMessageViewModel) this.L$7, (InlineAppMessageV2ViewModel) this.L$8, (CardAppMessageViewModel) obj2, this);
                    if (access$buildFeedEntries == coroutineSingletons3) {
                        break;
                    } else {
                        loadingState = loadingState2;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    boolean z3 = this.$hasPayrollFeatures;
                    loadingState = (LoadingState) this.L$3;
                    produceStateScope = (ProduceStateScope) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    z = z3;
                    access$buildFeedEntries = obj;
                }
                produceStateScope.setValue(new ActivityTabPresenter.IntermediateFeedState(loadingState, z, (List) access$buildFeedEntries));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$loadPayData$2(ActivityTabPresenter activityTabPresenter, ContactHeaderViewModel contactHeaderViewModel, InlineAppMessageViewModel inlineAppMessageViewModel, InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel, CardAppMessageViewModel cardAppMessageViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.L$4 = activityTabPresenter;
        this.L$6 = contactHeaderViewModel;
        this.L$7 = inlineAppMessageViewModel;
        this.L$8 = inlineAppMessageV2ViewModel;
        this.this$0 = cardAppMessageViewModel;
        this.$requestMetadata = mutableState;
        this.$teamMemberId = mutableState2;
        this.$merchantToken = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$loadPayData$2(boolean z, RealPayDataLoader realPayDataLoader, RealPayDataLoader.RequestMetadata requestMetadata, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$hasPayrollFeatures = z;
        this.this$0 = realPayDataLoader;
        this.$requestMetadata = requestMetadata;
        this.$teamMemberId = str;
        this.$merchantToken = str2;
    }
}
