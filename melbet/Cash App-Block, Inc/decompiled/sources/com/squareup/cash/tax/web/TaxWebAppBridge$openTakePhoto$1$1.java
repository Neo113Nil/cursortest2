package com.squareup.cash.tax.web;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.core.app.ActivityCompat;
import androidx.emoji2.text.EmojiExclusions;
import androidx.gridlayout.widget.GridLayout;
import app.cash.api.ApiResult;
import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.screen.Screen;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfm;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetEvent$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.banking.navigation.api.BankingOutboundNavigator$BalanceBasedAddCashIntent;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.balancebasedaddcash.BalanceBasedAddCashSettingsEdit;
import com.squareup.cash.cdf.browser.BrowserCheckoutSingleUsePaymentContinue;
import com.squareup.cash.cdf.cash.CashDepositCanceled;
import com.squareup.cash.cdf.cash.CashDepositDismissPendingConfirmation;
import com.squareup.cash.cdf.cash.CashWithdrawCancel;
import com.squareup.cash.cdf.cash.CashWithdrawDismissPendingConfirmation;
import com.squareup.cash.cdf.cashcard.CashCardNullStateSelect;
import com.squareup.cash.cdf.cashcard.CashCardNullStateView;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewDismiss;
import com.squareup.cash.cdf.personalprofile.PersonalProfileTapShoppingAutofillAddress;
import com.squareup.cash.cdf.shophub.Origin;
import com.squareup.cash.cdf.shophub.ShopHubSearchSelectItem;
import com.squareup.cash.cdf.shophub.ShopHubSearchViewItem;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.db2.profile.BalanceData;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
import com.squareup.cash.out.sync_entity.MinFeeStep;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.presenters.BrandsSearchPresenter;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingScreen$BrandsSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$ProductSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsAutofillScreen;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewEvent;
import com.squareup.cash.shopping.sup.backend.SUPWebSession;
import com.squareup.cash.shopping.sup.backend.SingleWebSessionInMemoryManager;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentAnalyticsParam;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCheckoutViewEvent;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCheckoutViewModel;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewEvent;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewEvent;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.UtilsKt;
import com.squareup.cash.support.chat.backend.api.ChatSurveyResponse;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$10$1;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewEvent;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.taptopay.viewmodels.TapToPayOnboardingCompleteViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewEvent;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository$_model$1$1$emit$1;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.tax.viewmodels.TaxAuthorizationViewEvent;
import com.squareup.cash.transfers.backend.api.RecurringSchedule;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsPreference;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1;
import com.squareup.cash.transfers.backend.real.WithdrawManagerError;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.presenters.InstrumentNotLinkedPresenter$models$1$1;
import com.squareup.cash.transfers.presenters.RecurringReloadOptionPresenter$models$1$2;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewEvent;
import com.squareup.cash.transfers.viewmodels.PendingTransfersConfirmationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewEvent;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetData;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1;
import com.squareup.cash.ui.widget.AmountSelector;
import com.squareup.cash.ui.widget.AmountSelector$events$$inlined$map$1$2$1;
import com.squareup.cash.upsell.presenters.NullStateCarouselPresenter;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewEvent;
import com.squareup.cash.upsell.viewmodels.NullStateViewEvent$SwipeViewEvent;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter$models$1$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewEvent;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.protos.cash.composer.app.ButtonElement;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowParameters;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.android.Intents;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class TaxWebAppBridge$openTakePhoto$1$1 implements FlowCollector {
    public final /* synthetic */ Object $permissionsRequestArray;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ TaxWebAppBridge$openTakePhoto$1$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$permissionsRequestArray = obj2;
        this.this$0 = obj;
    }

    private final Object emit$com$squareup$cash$transfers$presenters$PendingTransfersConfirmationDialogPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.$permissionsRequestArray;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        PendingTransfersConfirmationViewEvent pendingTransfersConfirmationViewEvent = (PendingTransfersConfirmationViewEvent) obj;
        Continuation continuation2 = null;
        if (Intrinsics.areEqual(pendingTransfersConfirmationViewEvent, PendingTransfersConfirmationViewEvent.PositiveButtonClick.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new ExoPlayerVideoView.AnonymousClass2(shareSheetPresenter, continuation2, 6), 3);
        } else {
            if (!Intrinsics.areEqual(pendingTransfersConfirmationViewEvent, PendingTransfersConfirmationViewEvent.NegativeButtonClick.INSTANCE) && !Intrinsics.areEqual(pendingTransfersConfirmationViewEvent, PendingTransfersConfirmationViewEvent.OnBack.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Analytics analytics = (Analytics) shareSheetPresenter.analytics;
            int ordinal = ((TransferType) shareSheetPresenter.modelUpdates).ordinal();
            if (ordinal == 0) {
                analytics.track(new CashDepositDismissPendingConfirmation(), null);
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                analytics.track(new CashWithdrawDismissPendingConfirmation(), null);
            }
            ((BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator).goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$transfers$presenters$RecurringReloadOptionPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$permissionsRequestArray;
        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
        UnleashContext unleashContext = (UnleashContext) poolsListPresenter.flowToken;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
        RecurringReloadOptionScreen recurringReloadOptionScreen = (RecurringReloadOptionScreen) poolsListPresenter.localeAssetProvider;
        RecurringReloadOptionViewEvent recurringReloadOptionViewEvent = (RecurringReloadOptionViewEvent) obj;
        boolean areEqual = Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.BackClick.INSTANCE);
        Back back = Back.INSTANCE;
        if (areEqual) {
            screenNavigator.goTo(back);
        } else {
            int i = 1;
            Continuation continuation2 = null;
            if (Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.ToggleClick.INSTANCE)) {
                int ordinal = recurringReloadOptionScreen.f1216type.ordinal();
                if (ordinal == 0) {
                    ((Analytics) poolsListPresenter.analytics).track(new BalanceBasedAddCashSettingsEdit(BalanceBasedAddCashSettingsEdit.SettingsOption.DISABLE), null);
                    JobKt.launch$default(coroutineScope, null, null, new ExoPlayerVideoView.AnonymousClass2(poolsListPresenter, continuation2, 7), 3);
                    screenNavigator.goTo(back);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RealBlockersHelper realBlockersHelper = (RealBlockersHelper) poolsListPresenter.args;
                    BlockersData.Flow flow = BlockersData.Flow.PROFILE_BLOCKERS;
                    ClientScenario clientScenario = ClientScenario.DISABLE_SCHEDULED_RELOAD;
                    Screen screen = recurringReloadOptionScreen.parentScreen;
                    Screen recurringDepositsScreen = screen == null ? new RecurringDepositsScreen(null) : screen;
                    if (screen == null) {
                        screen = new RecurringDepositsScreen(null);
                    }
                    BlockersHelper.launchClientScenario$default(realBlockersHelper, flow, clientScenario, recurringDepositsScreen, screen, null, null, true, null, null, false, 3808);
                }
            } else if (Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.MinimumBalanceClick.INSTANCE)) {
                unleashContext.goToBalanceBasedAddCashScreen(recurringReloadOptionScreen, BankingOutboundNavigator$BalanceBasedAddCashIntent.EDIT_MINIMUM_BALANCE);
            } else if (Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.IncrementAmountClick.INSTANCE)) {
                unleashContext.goToBalanceBasedAddCashScreen(recurringReloadOptionScreen, BankingOutboundNavigator$BalanceBasedAddCashIntent.EDIT_INCREMENT_AMOUNT);
            } else if (Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.FrequencyClick.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new RecurringReloadOptionPresenter$models$1$2(poolsListPresenter, continuation2, 0), 3);
            } else if (Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.FrequencyDayClick.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new RecurringReloadOptionPresenter$models$1$2(poolsListPresenter, continuation2, i), 3);
            } else if (Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.AmountClick.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new RecurringReloadOptionPresenter$models$1$2(poolsListPresenter, continuation2, 2), 3);
            } else {
                if (!Intrinsics.areEqual(recurringReloadOptionViewEvent, RecurringReloadOptionViewEvent.FromClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(RecurringReloadsChangeInstrumentScreen.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$ui$widget$AmountSelector$events$$inlined$map$1$2(Object obj, Continuation continuation) {
        AmountSelector$events$$inlined$map$1$2$1 amountSelector$events$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AmountSelector$events$$inlined$map$1$2$1) {
            amountSelector$events$$inlined$map$1$2$1 = (AmountSelector$events$$inlined$map$1$2$1) continuation;
            int i2 = amountSelector$events$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                amountSelector$events$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = amountSelector$events$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = amountSelector$events$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    int intValue = ((Number) obj).intValue();
                    AmountSelectorWidgetModel amountSelectorWidgetModel = ((AmountSelector) this.$permissionsRequestArray).model;
                    if (amountSelectorWidgetModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("model");
                        throw null;
                    }
                    AmountSelectorWidgetEvent$ItemSelected amountSelectorWidgetEvent$ItemSelected = new AmountSelectorWidgetEvent$ItemSelected((AmountSelectorWidgetModel.Item) amountSelectorWidgetModel.items.get(intValue));
                    amountSelector$events$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(amountSelectorWidgetEvent$ItemSelected, amountSelector$events$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        amountSelector$events$$inlined$map$1$2$1 = new AmountSelector$events$$inlined$map$1$2$1(this, continuation);
        Object obj22 = amountSelector$events$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = amountSelector$events$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$upsell$presenters$NullStateCarouselPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        State state = (State) this.$permissionsRequestArray;
        NullStateCarouselPresenter nullStateCarouselPresenter = (NullStateCarouselPresenter) this.this$0;
        String str = nullStateCarouselPresenter.token;
        Analytics analytics = nullStateCarouselPresenter.analytics;
        NullStateCarouselViewEvent nullStateCarouselViewEvent = (NullStateCarouselViewEvent) obj;
        if (nullStateCarouselViewEvent instanceof NullStateCarouselViewEvent.PageSwipe) {
            CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) state.getValue();
            cardTabNullStateSwipeConfig.getClass();
            List list = cardTabNullStateSwipeConfig.swipe_pages;
            int i = ((NullStateCarouselViewEvent.PageSwipe) nullStateCarouselViewEvent).newPage;
            analytics.track(new CashCardNullStateView(new Integer(i), str, ((CardTabNullStateSwipeConfig.SwipePage) list.get(i)).analytics_key), null);
        } else {
            if (!(nullStateCarouselViewEvent instanceof NullStateCarouselViewEvent.ButtonClick)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig2 = (CardTabNullStateSwipeConfig) state.getValue();
            cardTabNullStateSwipeConfig2.getClass();
            ButtonElement buttonElement = cardTabNullStateSwipeConfig2.button;
            buttonElement.getClass();
            analytics.track(new CashCardNullStateSelect(new Integer(((NullStateCarouselViewEvent.ButtonClick) nullStateCarouselViewEvent).currentPage), str, buttonElement.analytics_key), null);
            nullStateCarouselPresenter.router.route(new RoutingParams(new WalletHomeScreen(7, (Integer) null, (String) null), BlockersData.AnalyticsData.Source.CARD_TAB.getAnalyticsName(), null, null, null, null, 508), buttonElement.url);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$wallet$presenters$CardAppletTilePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CardAppletTilePresenter cardAppletTilePresenter = (CardAppletTilePresenter) this.$permissionsRequestArray;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CardAppletTileViewEvent cardAppletTileViewEvent = (CardAppletTileViewEvent) obj;
        Continuation continuation2 = null;
        if (cardAppletTileViewEvent instanceof CardAppletTileViewEvent.CardAppletOnClickTile) {
            JobKt.launch$default(coroutineScope, null, null, new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation2, 0), 3);
        } else if (cardAppletTileViewEvent instanceof CardAppletTileViewEvent.CardAppletOnClickPromotedTile) {
            JobKt.launch$default(coroutineScope, null, null, new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation2, 1), 3);
        } else {
            if (!(cardAppletTileViewEvent instanceof CardAppletTileViewEvent.CardAppletOnClickUninstalledRow)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation2, 2), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$wallet$presenters$CardSchemePresenter$models$11$1$1(Object obj, Continuation continuation) {
        Integer num;
        String str = (String) obj;
        int i = 0;
        if (Intrinsics.areEqual(str, "card")) {
            num = new Integer(0);
        } else {
            Iterator it = ((List) ((MutableState) this.this$0).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(((CashAppTag) it.next()).deviceId, str)) {
                    break;
                }
                i++;
            }
            num = i >= 0 ? new Integer(i + 1) : null;
        }
        if (num != null) {
            ((ParcelableSnapshotMutableIntState) this.$permissionsRequestArray).setIntValue(num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x04e4, code lost:
    
        if (r4.emit(r0, r2) != r1) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04d1, code lost:
    
        if (r0 == r1) goto L245;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v46 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductSearchViewModel copy$default;
        String str;
        Integer num;
        TabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1 tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i;
        FlowCollector flowCollector;
        int intValue;
        RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1 realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1;
        int i2;
        ScheduledReloadsPreference disabledPreference$default;
        RecurringSchedule recurringSchedule;
        RecurringSchedule.Frequency frequency;
        ScheduledTransactionPreference scheduledTransactionPreference;
        RealTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1 realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1;
        int i3;
        Event cashDepositCanceled;
        CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1 cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1;
        int i4;
        int i5 = this.$r8$classId;
        int i6 = 8;
        boolean z = false;
        r8 = 0;
        int i7 = 0;
        r8 = 0;
        int i8 = 0;
        z = false;
        Back back = Back.INSTANCE;
        int i9 = 1;
        Object obj2 = this.this$0;
        Object obj3 = this.$permissionsRequestArray;
        TransfersWithdrawManager.FeeData feeData = null;
        r14 = null;
        r14 = null;
        com.squareup.cash.transfers.backend.api.RecurringSchedule recurringSchedule2 = null;
        switch (i5) {
            case 0:
                TaxWebAppBridge taxWebAppBridge = (TaxWebAppBridge) obj2;
                if (((Boolean) obj).booleanValue()) {
                    String str2 = Path.DIRECTORY_SEPARATOR;
                    Path path = Path.Companion.get(UtilsKt.tempFileName("CASH"), false);
                    taxWebAppBridge.currentTakePhotoPath = path;
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", taxWebAppBridge.fileProvider.contentUriForFileUri(((RealStorage) taxWebAppBridge.storage).getFileUri(path, TaxWebAppBridge$openTakePhotoIntent$intent$1$fileUri$1.INSTANCE)));
                    intent.addFlags(1);
                    intent.addFlags(2);
                    if (!Intents.maybeStartActivityForResult(taxWebAppBridge.activity, intent, 8)) {
                        ValueCallback valueCallback = taxWebAppBridge.webviewUploadCallback;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(null);
                        }
                        taxWebAppBridge.webviewUploadCallback = null;
                    }
                } else {
                    ActivityCompat.requestPermissions(taxWebAppBridge.permissionManager.activity, (String[]) obj3, 2);
                }
                return Unit.INSTANCE;
            case 1:
                BrandsSearchPresenter brandsSearchPresenter = (BrandsSearchPresenter) obj2;
                ShoppingScreen$BrandsSearchScreen shoppingScreen$BrandsSearchScreen = brandsSearchPresenter.args;
                Analytics analytics = brandsSearchPresenter.analytics;
                RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = brandsSearchPresenter.analyticsHelper;
                MutableState mutableState = (MutableState) obj3;
                BrandsSearchViewEvent brandsSearchViewEvent = (BrandsSearchViewEvent) obj;
                if (brandsSearchViewEvent instanceof BrandsSearchViewEvent.SearchTextChange) {
                    mutableState.setValue(BrandsSearchPresenter.State.copy$default((BrandsSearchPresenter.State) mutableState.getValue(), null, ((BrandsSearchViewEvent.SearchTextChange) brandsSearchViewEvent).searchText, false, 0, 21));
                } else if (Intrinsics.areEqual(brandsSearchViewEvent, BrandsSearchViewEvent.RetrySearchClick.INSTANCE)) {
                    mutableState.setValue(BrandsSearchPresenter.State.copy$default((BrandsSearchPresenter.State) mutableState.getValue(), null, null, true, ((BrandsSearchPresenter.State) mutableState.getValue()).retryCount + 1, 7));
                } else if (brandsSearchViewEvent instanceof SearchResultsViewEvent.ItemClick) {
                    SearchResultsViewEvent.ItemClick itemClick = (SearchResultsViewEvent.ItemClick) brandsSearchViewEvent;
                    DirectoryListItem.ItemViewModel itemViewModel = itemClick.item;
                    if (itemViewModel != null) {
                        zzfm.save(brandsSearchPresenter.recentSearchManager, itemViewModel, brandsSearchPresenter.clock);
                    }
                    DirectoryAnalyticsData directoryAnalyticsData = itemClick.data;
                    BrandsSearchViewModel brandsSearchViewModel = ((BrandsSearchPresenter.State) mutableState.getValue()).viewModel;
                    DirectoryAnalyticsData.ItemAnalyticsData itemAnalyticsData = directoryAnalyticsData.item;
                    String str3 = itemAnalyticsData.entityToken;
                    String str4 = itemAnalyticsData.entityAttributes;
                    Integer num2 = itemAnalyticsData.indexCol;
                    Integer num3 = itemAnalyticsData.indexRow;
                    Integer num4 = itemAnalyticsData.numberOfItems;
                    String str5 = directoryAnalyticsData.remoteSuggestionType;
                    String flowToken = realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH);
                    Integer num5 = directoryAnalyticsData.section.index;
                    ShopHubAnalyticsHelper$Flow shopHubAnalyticsHelper$Flow = ShopHubAnalyticsHelper$Flow.SHOP;
                    String flowToken2 = realShopHubAnalyticsHelper.getFlowToken(shopHubAnalyticsHelper$Flow);
                    ShoppingScreenContext shoppingScreenContext = shoppingScreen$BrandsSearchScreen.screenContext;
                    String flowToken3 = shoppingScreenContext != null ? EmojiExclusions.getFlowToken(shoppingScreenContext) : null;
                    Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
                    DirectoryAnalyticsData.ItemAnalyticsData itemAnalyticsData2 = directoryAnalyticsData.item;
                    analytics.track(new ShopHubSearchSelectItem(flowToken2, flowToken, str3, str4, "All Stores", num5, num3, num2, num4, str5, flowToken3, itemAnalyticsData2.queryToken, itemAnalyticsData2.merchantTags), null);
                    brandsSearchPresenter.router.route(new RoutingParams(brandsSearchPresenter.args, null, null, null, new AnalyticsParams.ShopHubAnalyticsParams(realShopHubAnalyticsHelper.getFlowToken(shopHubAnalyticsHelper$Flow), null, null, null, null, null, null), null, 478), itemClick.actionUrl);
                } else if (brandsSearchViewEvent instanceof SearchResultsViewEvent.ViewItem) {
                    DirectoryAnalyticsData directoryAnalyticsData2 = ((SearchResultsViewEvent.ViewItem) brandsSearchViewEvent).data;
                    DirectoryAnalyticsData.ItemAnalyticsData itemAnalyticsData3 = directoryAnalyticsData2.item;
                    BrandsSearchViewModel brandsSearchViewModel2 = ((BrandsSearchPresenter.State) mutableState.getValue()).viewModel;
                    String str6 = itemAnalyticsData3.entityToken;
                    String str7 = itemAnalyticsData3.entityAttributes;
                    Integer num6 = itemAnalyticsData3.indexCol;
                    Integer num7 = itemAnalyticsData3.indexRow;
                    Integer num8 = itemAnalyticsData3.numberOfItems;
                    String str8 = directoryAnalyticsData2.remoteSuggestionType;
                    String flowToken4 = realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH);
                    Integer num9 = directoryAnalyticsData2.section.index;
                    String flowToken5 = realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP);
                    ShoppingScreenContext shoppingScreenContext2 = shoppingScreen$BrandsSearchScreen.screenContext;
                    String flowToken6 = shoppingScreenContext2 != null ? EmojiExclusions.getFlowToken(shoppingScreenContext2) : null;
                    Origin origin2 = Origin.SHOP_HUB_PRODUCTS_SEARCH;
                    analytics.track(new ShopHubSearchViewItem(flowToken5, flowToken4, str6, str7, "All Stores", num9, num7, num6, num8, str8, flowToken6, itemAnalyticsData3.queryToken, itemAnalyticsData3.merchantTags), null);
                } else if (Intrinsics.areEqual(brandsSearchViewEvent, BrandsSearchViewEvent.NavigateUpClick.INSTANCE)) {
                    brandsSearchPresenter.navigator.goTo(back);
                } else if (!(brandsSearchViewEvent instanceof SearchResultsViewEvent.FooterItemClick) && !(brandsSearchViewEvent instanceof SearchResultsViewEvent.HeaderItemClick) && !(brandsSearchViewEvent instanceof SearchResultsViewEvent.TextRowClick) && !(brandsSearchViewEvent instanceof SearchResultsViewEvent.ViewQuery) && !(brandsSearchViewEvent instanceof SearchResultsViewEvent.MissingMetadataEvent) && !(brandsSearchViewEvent instanceof SearchResultsViewEvent.ViewSection)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 2:
                ProductSearchPresenter productSearchPresenter = (ProductSearchPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = productSearchPresenter.navigator;
                Analytics analytics2 = productSearchPresenter.analytics;
                ShoppingScreen$ProductSearchScreen shoppingScreen$ProductSearchScreen = productSearchPresenter.args;
                RealShopHubAnalyticsHelper realShopHubAnalyticsHelper2 = productSearchPresenter.analyticsHelper;
                MutableState mutableState2 = (MutableState) obj3;
                ProductSearchViewEvent productSearchViewEvent = (ProductSearchViewEvent) obj;
                if (productSearchViewEvent instanceof ProductSearchViewEvent.SearchTextChange) {
                    mutableState2.setValue(ProductSearchPresenter.State.copy$default((ProductSearchPresenter.State) mutableState2.getValue(), null, null, false, false, false, false, 0, ((ProductSearchViewEvent.SearchTextChange) productSearchViewEvent).searchText, new SearchResults(6, r14, r14, EmptyList.INSTANCE), EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE));
                } else if (Intrinsics.areEqual(productSearchViewEvent, ProductSearchViewEvent.RetrySearchClick.INSTANCE)) {
                    mutableState2.setValue(ProductSearchPresenter.State.copy$default((ProductSearchPresenter.State) mutableState2.getValue(), null, null, false, false, false, true, ((ProductSearchPresenter.State) mutableState2.getValue()).retryCount + 1, null, null, 1663));
                } else if (!Intrinsics.areEqual(productSearchViewEvent, ProductSearchViewEvent.FilterClick.INSTANCE)) {
                    if (productSearchViewEvent instanceof SearchResultsViewEvent.HeaderItemClick) {
                        String str9 = ((SearchResultsViewEvent.HeaderItemClick) productSearchViewEvent).actionUrl;
                        List list = ((ProductSearchPresenter.State) mutableState2.getValue()).filters;
                        if (!ProductSearchPresenter.access$tryRoute(productSearchPresenter, str9)) {
                            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Invalid header actionUrl: ", str9), new Object[0]);
                        }
                    } else if (productSearchViewEvent instanceof SearchResultsViewEvent.FooterItemClick) {
                        String str10 = ((SearchResultsViewEvent.FooterItemClick) productSearchViewEvent).actionUrl;
                        List list2 = ((ProductSearchPresenter.State) mutableState2.getValue()).filters;
                        if (!ProductSearchPresenter.access$tryRoute(productSearchPresenter, str10)) {
                            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Invalid footer actionUrl: ", str10), new Object[0]);
                        }
                    } else if (productSearchViewEvent instanceof SearchResultsViewEvent.ItemClick) {
                        SearchResultsViewEvent.ItemClick itemClick2 = (SearchResultsViewEvent.ItemClick) productSearchViewEvent;
                        String str11 = itemClick2.actionUrl;
                        DirectoryListItem.ItemViewModel itemViewModel2 = itemClick2.item;
                        if (itemViewModel2 != null) {
                            zzfm.save(productSearchPresenter.recentSearchManager, itemViewModel2, productSearchPresenter.clock);
                        }
                        DirectoryAnalyticsData directoryAnalyticsData3 = itemClick2.data;
                        String str12 = ((ProductSearchPresenter.State) mutableState2.getValue()).searchText;
                        DirectoryAnalyticsData.ItemAnalyticsData itemAnalyticsData4 = directoryAnalyticsData3.item;
                        String str13 = itemAnalyticsData4.entityToken;
                        String str14 = itemAnalyticsData4.entityAttributes;
                        Integer num10 = itemAnalyticsData4.indexCol;
                        Integer num11 = itemAnalyticsData4.indexRow;
                        Integer num12 = itemAnalyticsData4.numberOfItems;
                        String str15 = directoryAnalyticsData3.remoteSuggestionType;
                        String flowToken7 = realShopHubAnalyticsHelper2.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH);
                        Integer num13 = directoryAnalyticsData3.section.index;
                        ShopHubAnalyticsHelper$Flow shopHubAnalyticsHelper$Flow2 = ShopHubAnalyticsHelper$Flow.SHOP;
                        String flowToken8 = realShopHubAnalyticsHelper2.getFlowToken(shopHubAnalyticsHelper$Flow2);
                        ShoppingScreenContext shoppingScreenContext3 = shoppingScreen$ProductSearchScreen.screenContext;
                        String flowToken9 = shoppingScreenContext3 != null ? EmojiExclusions.getFlowToken(shoppingScreenContext3) : null;
                        Origin origin3 = Origin.SHOP_HUB_PRODUCTS_SEARCH;
                        DirectoryAnalyticsData.ItemAnalyticsData itemAnalyticsData5 = directoryAnalyticsData3.item;
                        analytics2.track(new ShopHubSearchSelectItem(flowToken8, flowToken7, str13, str14, "All Products", num13, num11, num10, num12, str15, flowToken9, itemAnalyticsData5.queryToken, itemAnalyticsData5.merchantTags), null);
                        List list3 = ((ProductSearchPresenter.State) mutableState2.getValue()).filters;
                        if (!ProductSearchPresenter.access$tryRoute(productSearchPresenter, str11)) {
                            screenNavigator.goTo(new ShoppingWebScreen.AfterPayShoppingScreen(str11, new ShoppingScreenContext.ProductSearch(shoppingScreen$ProductSearchScreen.screenContext, realShopHubAnalyticsHelper2.getFlowToken(shopHubAnalyticsHelper$Flow2)), null));
                        }
                    } else if (productSearchViewEvent instanceof ProductSearchViewEvent.RestoreState) {
                        ProductSearchPresenter.State state = (ProductSearchPresenter.State) mutableState2.getValue();
                        ProductSearchViewEvent.RestoreState restoreState = (ProductSearchViewEvent.RestoreState) productSearchViewEvent;
                        boolean z2 = restoreState.showFilters;
                        List list4 = restoreState.hasAppliedFilters ? ((ProductSearchPresenter.State) mutableState2.getValue()).filters : EmptyList.INSTANCE;
                        boolean z3 = restoreState.hasSearchResults;
                        ProductSearchViewModel productSearchViewModel = ((ProductSearchPresenter.State) mutableState2.getValue()).viewModel;
                        if (productSearchViewModel instanceof ProductSearchViewModel.Loading) {
                            copy$default = ProductSearchViewModel.Loading.copy$default((ProductSearchViewModel.Loading) productSearchViewModel, z2);
                        } else {
                            if (!(productSearchViewModel instanceof ProductSearchViewModel.Loaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            copy$default = ProductSearchViewModel.Loaded.copy$default((ProductSearchViewModel.Loaded) productSearchViewModel, z2);
                        }
                        mutableState2.setValue(ProductSearchPresenter.State.copy$default(state, copy$default, list4, true, z3, false, false, 0, null, null, 1996));
                    } else if (productSearchViewEvent instanceof SearchResultsViewEvent.ViewItem) {
                        DirectoryAnalyticsData directoryAnalyticsData4 = ((SearchResultsViewEvent.ViewItem) productSearchViewEvent).data;
                        DirectoryAnalyticsData.ItemAnalyticsData itemAnalyticsData6 = directoryAnalyticsData4.item;
                        String str16 = ((ProductSearchPresenter.State) mutableState2.getValue()).searchText;
                        String str17 = itemAnalyticsData6.entityToken;
                        String str18 = itemAnalyticsData6.entityAttributes;
                        Integer num14 = itemAnalyticsData6.indexCol;
                        Integer num15 = itemAnalyticsData6.indexRow;
                        Integer num16 = itemAnalyticsData6.numberOfItems;
                        String str19 = directoryAnalyticsData4.remoteSuggestionType;
                        String flowToken10 = realShopHubAnalyticsHelper2.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH);
                        Integer num17 = directoryAnalyticsData4.section.index;
                        String flowToken11 = realShopHubAnalyticsHelper2.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP);
                        ShoppingScreenContext shoppingScreenContext4 = shoppingScreen$ProductSearchScreen.screenContext;
                        String flowToken12 = shoppingScreenContext4 != null ? EmojiExclusions.getFlowToken(shoppingScreenContext4) : null;
                        Origin origin4 = Origin.SHOP_HUB_PRODUCTS_SEARCH;
                        analytics2.track(new ShopHubSearchViewItem(flowToken11, flowToken10, str17, str18, "All Products", num17, num15, num14, num16, str19, flowToken12, itemAnalyticsData6.queryToken, itemAnalyticsData6.merchantTags), null);
                        Integer num18 = itemAnalyticsData6.numberOfItems;
                        if (num18 != null) {
                            int intValue2 = num18.intValue();
                            Integer num19 = itemAnalyticsData6.absoluteIndex;
                            if (num19 != null && num19.intValue() + 4 >= intValue2) {
                                mutableState2.setValue(ProductSearchPresenter.State.copy$default((ProductSearchPresenter.State) mutableState2.getValue(), null, null, false, false, true, false, 0, null, null, 1983));
                            }
                        }
                    } else if (Intrinsics.areEqual(productSearchViewEvent, ProductSearchViewEvent.NavigateUpClick.INSTANCE)) {
                        screenNavigator.goTo(back);
                    } else if (!(productSearchViewEvent instanceof SearchResultsViewEvent.ViewQuery) && !(productSearchViewEvent instanceof SearchResultsViewEvent.TextRowClick) && !(productSearchViewEvent instanceof SearchResultsViewEvent.MissingMetadataEvent) && !(productSearchViewEvent instanceof SearchResultsViewEvent.ViewSection)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                ShoppingWebViewEvent.NavigationStateUpdated navigationStateUpdated = (ShoppingWebViewEvent.NavigationStateUpdated) obj;
                ShoppingWebScreen shoppingWebScreen = ((RealShoppingJavascriptPresenter) obj2).args;
                if ((shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen) && navigationStateUpdated.isPageFinished && (str = ((ShoppingWebScreen.IncentiveShoppingScreen) shoppingWebScreen).checkoutUrl) != null) {
                    MutableState mutableState3 = (MutableState) obj3;
                    String str20 = navigationStateUpdated.url;
                    if (str20 != null && StringsKt.contains((CharSequence) str20, (CharSequence) str, true)) {
                        z = true;
                    }
                    mutableState3.setValue(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            case 4:
                JobKt.launch$default((CoroutineScope) obj2, null, null, new ProfileCropView.AnonymousClass3((ShoppingWebViewEvent.WebMonitoringJsonEvents) obj, (RealShoppingJavascriptPresenter) obj3, r14, 21), 3);
                return Unit.INSTANCE;
            case 5:
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator;
                ShoppingSettingsViewEvent shoppingSettingsViewEvent = (ShoppingSettingsViewEvent) obj;
                if (Intrinsics.areEqual(shoppingSettingsViewEvent, ShoppingSettingsViewEvent.GoBack.INSTANCE)) {
                    screenNavigator2.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(shoppingSettingsViewEvent, ShoppingSettingsViewEvent.AutofillClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Analytics analytics3 = (Analytics) inviteErrorPresenter.analytics;
                    Boolean bool = (Boolean) ((MutableState) obj3).getValue();
                    bool.getClass();
                    analytics3.track(new PersonalProfileTapShoppingAutofillAddress(bool), null);
                    screenNavigator2.goTo(ShoppingSettingsAutofillScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            case 6:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator3 = pdfPreviewPresenter.navigator;
                MutableState mutableState4 = (MutableState) obj3;
                SingleUsePaymentCheckoutViewEvent singleUsePaymentCheckoutViewEvent = (SingleUsePaymentCheckoutViewEvent) obj;
                if (singleUsePaymentCheckoutViewEvent instanceof SingleUsePaymentCheckoutViewEvent.ActionButtonPressed) {
                    CheckoutScreenType checkoutScreenType = ((SingleUsePaymentCheckoutViewModel) mutableState4.getValue()).sheetType;
                    if (checkoutScreenType instanceof CheckoutScreenType.ReviewPlan) {
                        Screen screen = ((SingleUsePaymentCheckoutViewModel) mutableState4.getValue()).exitScreen;
                        screen.getClass();
                        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = (ShoppingWebScreen.ShoppingWebScreenV2) screen;
                        IabMetadata iabMetadata = shoppingWebScreenV2.metadata;
                        iabMetadata.getClass();
                        String str21 = ((IabMetadata.SUPMetadata) iabMetadata).supToken;
                        SUPWebSession sUPWebSession = new SUPWebSession(shoppingWebScreenV2.url, shoppingWebScreenV2.entityInformation, shoppingWebScreenV2.userAgent, str21);
                        String m = Recorder$$ExternalSyntheticOutline2.m("SUP_CREATE_CARD?params=", URLEncoder.encode(new SupCreateCardFlowParameters(((SingleUsePaymentCheckoutViewModel) mutableState4.getValue()).cartDetails, str21, ((RealOffersAnalyticsHelper) pdfPreviewPresenter.stringManager).getFlowToken(OffersAnalyticsHelper$Flow.SHOP), ByteString.EMPTY).encodeByteString().base64(), "utf-8"));
                        ((SingleWebSessionInMemoryManager) pdfPreviewPresenter.fileProvider).session = sUPWebSession;
                        ((WebViewProvider) pdfPreviewPresenter.fileSaver).setShouldSaveWebInstance(true);
                        SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = ((SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen) pdfPreviewPresenter.args).analyticsParam;
                        if (singleUsePaymentAnalyticsParam != null) {
                            Analytics analytics4 = (Analytics) pdfPreviewPresenter.pdfFile$delegate;
                            BrowserCheckoutSingleUsePaymentContinue browserCheckoutSingleUsePaymentContinue = new BrowserCheckoutSingleUsePaymentContinue(singleUsePaymentAnalyticsParam.origin, singleUsePaymentAnalyticsParam.infoContext, m, singleUsePaymentAnalyticsParam.flowToken, singleUsePaymentAnalyticsParam.entryUrl, singleUsePaymentAnalyticsParam.entityToken);
                            m = m;
                            analytics4.track(browserCheckoutSingleUsePaymentContinue, null);
                        }
                        screenNavigator3.goTo(FlowStarter.startPlasmaFlowWithParams$default((FlowStarter) pdfPreviewPresenter.launcher, m, shoppingWebScreenV2, null, null, shoppingWebScreenV2, null, false, null, 492));
                    } else if (checkoutScreenType instanceof CheckoutScreenType.OneTimeCardContext) {
                        CheckoutScreenType checkoutScreenType2 = ((SingleUsePaymentCheckoutViewModel) mutableState4.getValue()).sheetType;
                        checkoutScreenType2.getClass();
                        CheckoutScreenType.OneTimeCardContext oneTimeCardContext = (CheckoutScreenType.OneTimeCardContext) checkoutScreenType2;
                        mutableState4.setValue(SingleUsePaymentCheckoutViewModel.copy$default((SingleUsePaymentCheckoutViewModel) mutableState4.getValue(), new CheckoutScreenType.ReviewPlan(oneTimeCardContext.availableLimit, oneTimeCardContext.merchantName)));
                    } else {
                        if (!Intrinsics.areEqual(checkoutScreenType, CheckoutScreenType.NonEmptyCartWarning.INSTANCE) && !(checkoutScreenType instanceof CheckoutScreenType.CreditLimitExceededWarning) && !(checkoutScreenType instanceof CheckoutScreenType.MinimumSpendRestrictedWarning) && !(checkoutScreenType instanceof CheckoutScreenType.ConnectionFailedWarning) && !(checkoutScreenType instanceof CheckoutScreenType.SpendingLimitReached) && !(checkoutScreenType instanceof CheckoutScreenType.LoanLimitReached) && !(checkoutScreenType instanceof CheckoutScreenType.LoanLimitReachedError) && !(checkoutScreenType instanceof CheckoutScreenType.SpendingLimitReachedError)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator3.goTo(back);
                    }
                } else {
                    if (!Intrinsics.areEqual(singleUsePaymentCheckoutViewEvent, SingleUsePaymentCheckoutViewEvent.ExplanationTextPressed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CheckoutScreenType checkoutScreenType3 = ((SingleUsePaymentCheckoutViewModel) mutableState4.getValue()).sheetType;
                    checkoutScreenType3.getClass();
                    CheckoutScreenType.ReviewPlan reviewPlan = (CheckoutScreenType.ReviewPlan) checkoutScreenType3;
                    mutableState4.setValue(SingleUsePaymentCheckoutViewModel.copy$default((SingleUsePaymentCheckoutViewModel) mutableState4.getValue(), new CheckoutScreenType.OneTimeCardContext(reviewPlan.availableLimit, reviewPlan.merchantName)));
                }
                return Unit.INSTANCE;
            case 7:
                ChatImageDetailViewEvent chatImageDetailViewEvent = (ChatImageDetailViewEvent) obj;
                if (chatImageDetailViewEvent instanceof ChatImageDetailViewEvent.CloseImageDetail) {
                    ((BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator).goTo(back);
                } else {
                    if (!(chatImageDetailViewEvent instanceof ChatImageDetailViewEvent.TapImageDetail)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj3).setValue(Boolean.valueOf(!((Boolean) r13.getValue()).booleanValue()));
                }
                return Unit.INSTANCE;
            case 8:
                JobKt.launch$default((CoroutineScope) obj2, null, null, new ChatPresenter$models$10$1((ChatPresenter) obj3, r14, z ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 9:
                PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) obj2;
                Analytics analytics5 = (Analytics) pdfPreviewPresenter2.launcher;
                SupportChatScreens.FlowScreen.ChatSurveyScreen chatSurveyScreen = (SupportChatScreens.FlowScreen.ChatSurveyScreen) pdfPreviewPresenter2.fileSaver;
                MutableState mutableState5 = (MutableState) obj3;
                ChatSurveyViewEvent chatSurveyViewEvent = (ChatSurveyViewEvent) obj;
                if (chatSurveyViewEvent instanceof ChatSurveyViewEvent.ChangeRating) {
                    if (((ChatSurveyViewModel) mutableState5.getValue()) instanceof ChatSurveyViewModel.Loaded) {
                        ChatSurveyViewModel chatSurveyViewModel = (ChatSurveyViewModel) mutableState5.getValue();
                        chatSurveyViewModel.getClass();
                        mutableState5.setValue(ChatSurveyViewModel.Loaded.copy$default((ChatSurveyViewModel.Loaded) chatSurveyViewModel, new Integer(((ChatSurveyViewEvent.ChangeRating) chatSurveyViewEvent).rating)));
                    }
                } else if (Intrinsics.areEqual(chatSurveyViewEvent, ChatSurveyViewEvent.Close.INSTANCE)) {
                    if (!(((ChatSurveyViewModel) mutableState5.getValue()) instanceof ChatSurveyViewModel.Complete)) {
                        String str22 = chatSurveyScreen.surveyToken;
                        str22.getClass();
                        analytics5.track(new CustomerSupportReviewDismiss(str22), null);
                    }
                    pdfPreviewPresenter2.navigator.goTo(back);
                } else {
                    if (!(chatSurveyViewEvent instanceof ChatSurveyViewEvent.Submit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ChatSurveyResponse chatSurveyResponse = new ChatSurveyResponse(chatSurveyScreen.surveyToken, null, 0, 30);
                    String str23 = chatSurveyScreen.surveyToken;
                    ChatSurveyViewModel chatSurveyViewModel2 = (ChatSurveyViewModel) mutableState5.getValue();
                    chatSurveyViewModel2.getClass();
                    Integer num20 = ((ChatSurveyViewModel.Loaded) chatSurveyViewModel2).selectedOption;
                    int intValue3 = num20 != null ? num20.intValue() : 0;
                    boolean z4 = ((ChatSurveyViewEvent.Submit) chatSurveyViewEvent).issueResolved;
                    GridLayout.Alignment.logAnswerChanges(analytics5, chatSurveyResponse, new ChatSurveyResponse(str23, Boolean.valueOf(z4), intValue3, 20));
                    RealChatSurveyService realChatSurveyService = (RealChatSurveyService) pdfPreviewPresenter2.args;
                    String str24 = chatSurveyScreen.surveyToken;
                    ChatSurveyViewModel chatSurveyViewModel3 = (ChatSurveyViewModel) mutableState5.getValue();
                    r14 = chatSurveyViewModel3 instanceof ChatSurveyViewModel.Loaded ? (ChatSurveyViewModel.Loaded) chatSurveyViewModel3 : 0;
                    if (r14 != 0 && (num = r14.selectedOption) != null) {
                        i8 = num.intValue();
                    }
                    StateFlowKt.sendOrThrow$default(realChatSurveyService.surveyResponses, new ChatSurveyResponse(str24, Boolean.valueOf(z4), i8, 20));
                    mutableState5.setValue(ChatSurveyViewModel.Complete.INSTANCE);
                }
                return Unit.INSTANCE;
            case 10:
                Object access$processSearch = SupportSearchPresenter.access$processSearch((SupportSearchPresenter) obj2, (String) obj, (MutableState) obj3, continuation);
                return access$processSearch == CoroutineSingletons.COROUTINE_SUSPENDED ? access$processSearch : Unit.INSTANCE;
            case 11:
                if (((Boolean) obj).booleanValue() && !((SupportDisputeTrackerViewModel.Loaded) obj2).showListLoadingSpinner) {
                    ((Function1) obj3).invoke(SupportDisputeTrackerViewEvent.ScrollToBottom.INSTANCE);
                }
                return Unit.INSTANCE;
            case 12:
                if (continuation instanceof TabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1 = (TabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i10 = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj4 = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            flowCollector = (FlowCollector) obj2;
                            intValue = ((Number) obj).intValue();
                            if (intValue > 0) {
                                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.L$4 = flowCollector;
                                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.I$0 = 0;
                                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.I$1 = intValue;
                                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                                Object updateBadgingInfo = ((RealBadger2) ((Badger2) ((TabToolbarPresenter) obj3).badger2)).updateBadgingInfo(CollectionsKt__CollectionsJVMKt.listOf(new Badger2.BadgingInfo("DEFAULT", 1L, true, CollectionsKt__CollectionsJVMKt.listOf("PROFILE"), ItemType.PROFILE_PENDING_REFERRAL)), tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1);
                                if (updateBadgingInfo != coroutineSingletons) {
                                    updateBadgingInfo = Unit.INSTANCE;
                                    break;
                                }
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj4);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            intValue = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.I$1;
                            i7 = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.I$0;
                            flowCollector = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj4);
                        }
                        Long l = new Long(intValue);
                        tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.L$4 = null;
                        tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.I$0 = i7;
                        tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1 = new TabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj42 = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                Long l2 = new Long(intValue);
                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.L$4 = null;
                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.I$0 = i7;
                tabToolbarPresenter$models$lambda$2$$inlined$map$1$2$1.label = 2;
                break;
            case 13:
                ErrorPresenter errorPresenter = (ErrorPresenter) obj3;
                RealTapToPaySessionManager realTapToPaySessionManager = (RealTapToPaySessionManager) errorPresenter.args;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                TapToPayOnboardingCompleteViewEvent tapToPayOnboardingCompleteViewEvent = (TapToPayOnboardingCompleteViewEvent) obj;
                if (Intrinsics.areEqual(tapToPayOnboardingCompleteViewEvent, TapToPayOnboardingCompleteViewEvent.Close.INSTANCE)) {
                    errorPresenter.navigator.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(tapToPayOnboardingCompleteViewEvent, TapToPayOnboardingCompleteViewEvent.TryDemoMode.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    TapToPayPaymentData tapToPayPaymentData = realTapToPaySessionManager.ttpSessionData;
                    realTapToPaySessionManager.ttpSessionData = null;
                    if (tapToPayPaymentData == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    Money money = tapToPayPaymentData.amount;
                    String str25 = tapToPayPaymentData.cashtag;
                    String str26 = tapToPayPaymentData.idempotencyToken;
                    Screen screen2 = tapToPayPaymentData.exitScreen;
                    String str27 = tapToPayPaymentData.photoUrl;
                    Character ch = tapToPayPaymentData.monogram;
                    String str28 = tapToPayPaymentData.customerToken;
                    money.getClass();
                    str26.getClass();
                    screen2.getClass();
                    realTapToPaySessionManager.ttpSessionData = new TapToPayPaymentData(money, str25, str26, screen2, str27, ch, str28, true);
                    JobKt.launch$default(coroutineScope, null, null, new ChatInputView$Content$1$1$1(errorPresenter, r14, 19), 3);
                }
                return Unit.INSTANCE;
            case 14:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                TapToPayPaymentRequestViewEvent tapToPayPaymentRequestViewEvent = (TapToPayPaymentRequestViewEvent) obj;
                if (Intrinsics.areEqual(tapToPayPaymentRequestViewEvent, TapToPayPaymentRequestViewEvent.SendReceipt.INSTANCE)) {
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) localEditorialPresenter.launcher;
                    String str29 = (String) ((MutableState) obj3).getValue();
                    str29.getClass();
                    ClientRoute parse = realClientRouteParser.parse(str29);
                    parse.getClass();
                    RealRouter.route$default((RealRouter) localEditorialPresenter.stringManager, parse);
                } else if (Intrinsics.areEqual(tapToPayPaymentRequestViewEvent, TapToPayPaymentRequestViewEvent.Close.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 15:
                return emit((Boolean) obj, continuation);
            case 16:
                TaxAuthorizationPresenter taxAuthorizationPresenter = (TaxAuthorizationPresenter) obj3;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                TaxAuthorizationViewEvent taxAuthorizationViewEvent = (TaxAuthorizationViewEvent) obj;
                if (Intrinsics.areEqual(taxAuthorizationViewEvent, TaxAuthorizationViewEvent.StartTaxAuthorizationFlow.INSTANCE)) {
                    JobKt.launch$default(coroutineScope2, null, null, new ShoppingWebBridge.AnonymousClass1(taxAuthorizationPresenter, (Continuation) r14, 29), 3);
                } else {
                    if (!Intrinsics.areEqual(taxAuthorizationViewEvent, TaxAuthorizationViewEvent.HandleError.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    taxAuthorizationPresenter.navigator.goTo(((TaxAuthorizationScreen) taxAuthorizationPresenter.args).exitScreen);
                }
                return Unit.INSTANCE;
            case 17:
                RealScheduledReloadsManager realScheduledReloadsManager = (RealScheduledReloadsManager) obj3;
                if (continuation instanceof RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1) {
                    realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1 = (RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1) continuation;
                    int i11 = realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj5 = realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            FlowCollector flowCollector2 = (FlowCollector) obj2;
                            ScheduledReloadData scheduledReloadData = ((BalanceData) obj).scheduled_reload_data;
                            Boolean bool2 = (scheduledReloadData == null || (scheduledTransactionPreference = scheduledReloadData.scheduled_reload_preference) == null) ? null : scheduledTransactionPreference.enabled;
                            if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                                ScheduledTransactionPreference scheduledTransactionPreference2 = scheduledReloadData.scheduled_reload_preference;
                                Long l3 = scheduledReloadData.next_reload_at;
                                String str30 = scheduledReloadData.funding_source;
                                Money money2 = scheduledTransactionPreference2 != null ? scheduledTransactionPreference2.amount : null;
                                if (scheduledTransactionPreference2 != null && (recurringSchedule = scheduledTransactionPreference2.recurring_schedule) != null) {
                                    RecurringSchedule.Frequency frequency2 = recurringSchedule.frequency;
                                    int i12 = frequency2 == null ? -1 : RealScheduledReloadsManager.WhenMappings.$EnumSwitchMapping$1[frequency2.ordinal()];
                                    if (i12 == 1) {
                                        frequency = RecurringSchedule.Frequency.EVERY_DAY;
                                    } else if (i12 == 2) {
                                        frequency = RecurringSchedule.Frequency.EVERY_WEEK;
                                    } else if (i12 == 3) {
                                        frequency = RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
                                    } else if (i12 == 4) {
                                        frequency = RecurringSchedule.Frequency.EVERY_MONTH;
                                    }
                                    recurringSchedule2 = new com.squareup.cash.transfers.backend.api.RecurringSchedule(frequency, recurringSchedule.days_of_period, recurringSchedule.timezone, recurringSchedule.time_of_day);
                                }
                                disabledPreference$default = new ScheduledReloadsPreference(realScheduledReloadsManager.stringManager.get(R.string.recurring_transfer_preference), realScheduledReloadsManager.buildEnabledSubtitle(l3, str30), new ScheduledReloadsPreference.State.Enabled(money2, str30, l3, recurringSchedule2), ScheduledReloadsPreference.Source.PROFILE);
                            } else if (Intrinsics.areEqual(bool2, Boolean.FALSE)) {
                                disabledPreference$default = RealScheduledReloadsManager.disabledPreference$default(realScheduledReloadsManager, null, ScheduledReloadsPreference.Source.PROFILE, 3);
                            } else {
                                if (bool2 != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                disabledPreference$default = RealScheduledReloadsManager.disabledPreference$default(realScheduledReloadsManager, null, ScheduledReloadsPreference.Source.PROFILE, 3);
                            }
                            realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.label = 1;
                            if (flowCollector2.emit(disabledPreference$default, realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1 = new RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1(this, continuation);
                Object obj52 = realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realScheduledReloadsManager$fromProfile$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 18:
                if (continuation instanceof RealTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1) {
                    realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1 = (RealTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1) continuation;
                    int i13 = realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj6 = realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            FlowCollector flowCollector3 = (FlowCollector) obj2;
                            CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
                            RealTransfersWithdrawManager realTransfersWithdrawManager = (RealTransfersWithdrawManager) obj3;
                            if (cashOutFeeData == null) {
                                realTransfersWithdrawManager.errorReporter.report(WithdrawManagerError.NullCashOutFeeData.INSTANCE, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                            } else {
                                List<MinFeeStep> list5 = cashOutFeeData.min_fee_steps;
                                if (list5.isEmpty()) {
                                    realTransfersWithdrawManager.throwInvalidFeeData("min_fee_steps must not be empty");
                                    throw null;
                                }
                                Long l4 = ((MinFeeStep) CollectionsKt.first(list5)).lower_bound_amount_usd_cents;
                                if (l4 == null || l4.longValue() != 0) {
                                    realTransfersWithdrawManager.throwInvalidFeeData("First tier must have lower_bound_amount_cents = 0");
                                    throw null;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (MinFeeStep minFeeStep : list5) {
                                    ArrayList arrayList = new ArrayList();
                                    Long l5 = minFeeStep.lower_bound_amount_usd_cents;
                                    if (l5 == null || l5.longValue() < 0) {
                                        arrayList.add("lower_bound_amount_cents must be non-null and non-negative");
                                    }
                                    Long l6 = minFeeStep.step_fee_bps;
                                    if (l6 == null || l6.longValue() < 0) {
                                        arrayList.add("fee_bps must be non-null and non-negative");
                                    }
                                    Long l7 = minFeeStep.step_minimum_fee_cents;
                                    if (l7 == null || l7.longValue() < 0) {
                                        arrayList.add("minimum_fee_cents must be non-null and non-negative");
                                    }
                                    Long l8 = minFeeStep.step_maximum_fee_cents;
                                    if (l8 == null || l8.longValue() < 0) {
                                        arrayList.add("maximum_fee_cents must be non-null and non-negative");
                                    }
                                    if (!arrayList.isEmpty()) {
                                        realTransfersWithdrawManager.throwInvalidFeeData(CollectionsKt.joinToString$default(arrayList, "; ", null, null, 0, null, null, 62));
                                        throw null;
                                    }
                                    l5.getClass();
                                    long longValue = l5.longValue();
                                    l6.getClass();
                                    long longValue2 = l6.longValue();
                                    l7.getClass();
                                    long longValue3 = l7.longValue();
                                    l8.getClass();
                                    linkedHashMap.put(l5, new TransfersWithdrawManager.FeeData.FeeStepTier(longValue, longValue2, longValue3, l8.longValue()));
                                }
                                TreeMap treeMap = new TreeMap(linkedHashMap);
                                if (treeMap.isEmpty()) {
                                    a$$ExternalSyntheticBUOutline0.m$3("tiers must not be empty");
                                    return null;
                                }
                                feeData = new TransfersWithdrawManager.FeeData(treeMap);
                            }
                            realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.label = 1;
                            if (flowCollector3.emit(feeData, realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj6);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1 = new RealTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1(this, continuation);
                Object obj62 = realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realTransfersWithdrawManager$feeDataFromSyncValue$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 19:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                InstrumentNotLinkedScreen instrumentNotLinkedScreen = (InstrumentNotLinkedScreen) shareSheetPresenter.profileManager;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj2;
                InstrumentNotLinkedViewEvent instrumentNotLinkedViewEvent = (InstrumentNotLinkedViewEvent) obj;
                if (Intrinsics.areEqual(instrumentNotLinkedViewEvent, InstrumentNotLinkedViewEvent.BackClick.INSTANCE)) {
                    screenNavigator4.goTo(instrumentNotLinkedScreen.backScreen);
                } else if (Intrinsics.areEqual(instrumentNotLinkedViewEvent, InstrumentNotLinkedViewEvent.CloseClick.INSTANCE)) {
                    Analytics analytics6 = (Analytics) shareSheetPresenter.analytics;
                    int ordinal = instrumentNotLinkedScreen.transferType.ordinal();
                    if (ordinal == 0) {
                        cashDepositCanceled = new CashDepositCanceled();
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        cashDepositCanceled = new CashWithdrawCancel(instrumentNotLinkedScreen.blockersData.flowToken);
                    }
                    analytics6.track(cashDepositCanceled, null);
                    screenNavigator4.goTo(back);
                } else {
                    if (!(instrumentNotLinkedViewEvent instanceof InstrumentNotLinkedViewEvent.ContinueClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope3, null, null, new InstrumentNotLinkedPresenter$models$1$1(shareSheetPresenter, r14, i9), 3);
                }
                return Unit.INSTANCE;
            case 20:
                return emit$com$squareup$cash$transfers$presenters$PendingTransfersConfirmationDialogPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 21:
                return emit$com$squareup$cash$transfers$presenters$RecurringReloadOptionPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                InviteErrorPresenter inviteErrorPresenter2 = (InviteErrorPresenter) obj3;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj2;
                RecurringReloadsChangeInstrumentViewEvent recurringReloadsChangeInstrumentViewEvent = (RecurringReloadsChangeInstrumentViewEvent) obj;
                if (Intrinsics.areEqual(recurringReloadsChangeInstrumentViewEvent, RecurringReloadsChangeInstrumentViewEvent.GoToLinkedBanksClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope4, null, null, new ExoPlayerVideoView.AnonymousClass2(inviteErrorPresenter2, r14, i6), 3);
                } else {
                    if (!Intrinsics.areEqual(recurringReloadsChangeInstrumentViewEvent, RecurringReloadsChangeInstrumentViewEvent.CloseClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) inviteErrorPresenter2.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 23:
                return emit((FullCashtag) obj, continuation);
            case 24:
                return emit$com$squareup$cash$ui$widget$AmountSelector$events$$inlined$map$1$2(obj, continuation);
            case 25:
                return emit$com$squareup$cash$upsell$presenters$NullStateCarouselPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 26:
                int intValue4 = ((Number) obj).intValue();
                ((UiGroupViewModel) ((NullStateViewModel$SwipeViewModel$Content) obj3).pages.get(intValue4)).getClass();
                ((Function1) obj2).invoke(new NullStateViewEvent$SwipeViewEvent.SwipeToPage(intValue4));
                return Unit.INSTANCE;
            case 27:
                return emit$com$squareup$cash$wallet$presenters$CardAppletTilePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$wallet$presenters$CardSchemePresenter$models$11$1$1(obj, continuation);
            default:
                CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj3;
                if (continuation instanceof CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1) {
                    cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1 = (CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i14 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                        cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.label = i14 - PKIFailureInfo.systemUnavail;
                        Object obj7 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector4 = (FlowCollector) obj2;
                            Map map = (Map) obj;
                            List list6 = unifiedCardHomeNUX.rotating_card_theme_tokens;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list6.iterator();
                            while (it.hasNext()) {
                                CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) map.get((String) it.next());
                                CardTheme cardTheme = cardThemeDefinition != null ? cardThemeDefinition.card_theme : null;
                                if (cardTheme != null) {
                                    arrayList2.add(cardTheme);
                                }
                            }
                            List list7 = arrayList2.isEmpty() ? null : arrayList2;
                            Lazy lazy = LazyKt.lazy(new CardModelView$1$3$4$2(26, unifiedCardHomeNUX, map));
                            if (list7 == null) {
                                list7 = (List) lazy.getValue();
                            }
                            cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                            if (flowCollector4.emit(list7, cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1 = new CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                Object obj72 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$2$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TaxWebAppBridge$openTakePhoto$1$1(CoroutineScope coroutineScope, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$permissionsRequestArray = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (r0.emit(r12, r1) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        if (r0.emit(r12, r1) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r0.emit(r3, r1) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        if (r0.emit(r3, r1) == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Boolean bool, Continuation continuation) {
        RealTaxesAppletTileRepository$_model$1$1$emit$1 realTaxesAppletTileRepository$_model$1$1$emit$1;
        int i;
        boolean z;
        ApiResult apiResult;
        FlowCollector flowCollector = (FlowCollector) this.$permissionsRequestArray;
        if (continuation instanceof RealTaxesAppletTileRepository$_model$1$1$emit$1) {
            realTaxesAppletTileRepository$_model$1$1$emit$1 = (RealTaxesAppletTileRepository$_model$1$1$emit$1) continuation;
            int i2 = realTaxesAppletTileRepository$_model$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTaxesAppletTileRepository$_model$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTaxesAppletTileRepository$_model$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTaxesAppletTileRepository$_model$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean areEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
                    RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider = ((RealTaxesAppletTileRepository) this.this$0).taxEntryTileUserDataProvider;
                    realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0 = areEqual;
                    realTaxesAppletTileRepository$_model$1$1$emit$1.label = 1;
                    obj = realTaxEntryTileUserDataProvider.getEntryTileUserData2AndRefreshBadging(realTaxesAppletTileRepository$_model$1$1$emit$1);
                    if (obj != coroutineSingletons) {
                        z = areEqual;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4 || i == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0;
                    apiResult = realTaxesAppletTileRepository$_model$1$1$emit$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    if (apiResult instanceof ApiResult.Failure) {
                        if (z) {
                            RealTaxesAppletTileRepository.TaxesModel.Installed installed = new RealTaxesAppletTileRepository.TaxesModel.Installed(null);
                            realTaxesAppletTileRepository$_model$1$1$emit$1.L$1 = apiResult;
                            realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0 = z;
                            realTaxesAppletTileRepository$_model$1$1$emit$1.label = 4;
                        } else {
                            RealTaxesAppletTileRepository.TaxesModel.Uninstalled uninstalled = new RealTaxesAppletTileRepository.TaxesModel.Uninstalled(null);
                            realTaxesAppletTileRepository$_model$1$1$emit$1.L$1 = apiResult;
                            realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0 = z;
                            realTaxesAppletTileRepository$_model$1$1$emit$1.label = 5;
                        }
                    }
                    return Unit.INSTANCE;
                }
                z = realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    UserData2Response userData2Response = (UserData2Response) ((ApiResult.Success) apiResult).response;
                    if (z) {
                        RealTaxesAppletTileRepository.TaxesModel.Installed installed2 = new RealTaxesAppletTileRepository.TaxesModel.Installed(userData2Response);
                        realTaxesAppletTileRepository$_model$1$1$emit$1.L$1 = apiResult;
                        realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0 = z;
                        realTaxesAppletTileRepository$_model$1$1$emit$1.label = 2;
                    } else {
                        RealTaxesAppletTileRepository.TaxesModel.Uninstalled uninstalled2 = new RealTaxesAppletTileRepository.TaxesModel.Uninstalled(userData2Response);
                        realTaxesAppletTileRepository$_model$1$1$emit$1.L$1 = apiResult;
                        realTaxesAppletTileRepository$_model$1$1$emit$1.Z$0 = z;
                        realTaxesAppletTileRepository$_model$1$1$emit$1.label = 3;
                    }
                    return Unit.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure) {
                }
                return Unit.INSTANCE;
            }
        }
        realTaxesAppletTileRepository$_model$1$1$emit$1 = new RealTaxesAppletTileRepository$_model$1$1$emit$1(this, continuation);
        Object obj2 = realTaxesAppletTileRepository$_model$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTaxesAppletTileRepository$_model$1$1$emit$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        if (apiResult instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r10)._channel.send(r0, r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(FullCashtag fullCashtag, Continuation continuation) {
        CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1 cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1;
        int i;
        String str;
        Bitmap bitmap;
        VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.this$0;
        if (continuation instanceof CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1) {
            cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1 = (CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1) continuation;
            int i2 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String cashtagWithCurrencySymbol = fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null;
                    String str2 = fullCashtag != null ? fullCashtag.cashtag_qr_image_url : null;
                    if (str2 != null) {
                        CoroutineContext coroutineContext = (CoroutineContext) ((VariantSandboxedComponent.Impl) variantSandboxedComponent).variantAppComponentIoDispatcherProvider.lambda.invoke();
                        WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1(variantSandboxedComponent, str2, continuation2, 12);
                        cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.L$1 = cashtagWithCurrencySymbol;
                        cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label = 1;
                        Object withContext = JobKt.withContext(coroutineContext, workflowNode$tick$1$1, cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1);
                        if (withContext != coroutineSingletons) {
                            String str3 = cashtagWithCurrencySymbol;
                            obj = withContext;
                            str = str3;
                        }
                        return coroutineSingletons;
                    }
                    str = cashtagWithCurrencySymbol;
                    bitmap = null;
                    ProducerScope producerScope = (ProducerScope) this.$permissionsRequestArray;
                    CashQrWidgetData cashQrWidgetData = new CashQrWidgetData(str, bitmap);
                    cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.L$1 = null;
                    cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                bitmap = (Bitmap) obj;
                ProducerScope producerScope2 = (ProducerScope) this.$permissionsRequestArray;
                CashQrWidgetData cashQrWidgetData2 = new CashQrWidgetData(str, bitmap);
                cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.L$1 = null;
                cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label = 2;
            }
        }
        cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1 = new CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1(this, continuation);
        Object obj2 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        ProducerScope producerScope22 = (ProducerScope) this.$permissionsRequestArray;
        CashQrWidgetData cashQrWidgetData22 = new CashQrWidgetData(str, bitmap);
        cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.L$1 = null;
        cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1.label = 2;
    }
}
