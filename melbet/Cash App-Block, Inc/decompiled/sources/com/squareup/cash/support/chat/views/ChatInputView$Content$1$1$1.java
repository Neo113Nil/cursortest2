package com.squareup.cash.support.chat.views;

import androidx.emoji2.text.EmojiExclusions;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.browser.BrowserViewOpenCashAppPayOfferPrompt;
import com.squareup.cash.cdf.cash.CashDepositViewPendingConfirmation;
import com.squareup.cash.cdf.cash.CashWithdrawViewPendingConfirmation;
import com.squareup.cash.cdf.cashcard.CashCardTabView;
import com.squareup.cash.cdf.crypto.CryptoLearnStart;
import com.squareup.cash.cdf.crypto.LearnContentType;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatViewExitPrompt;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactViewEnterContact;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactViewEnterMessage;
import com.squareup.cash.cdf.notificationssettings.ContactMethodType;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewConfirmSheet;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewContactMethod;
import com.squareup.cash.cdf.promotions.PromotionsViewPromotionsHome;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationStart;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SyncState$Progress;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealShopHubRepository;
import com.squareup.cash.shopping.db.ShopInfoDetailsQueries$forId$2;
import com.squareup.cash.shopping.presenters.CashAppPayIncentiveSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$IncentivePromptSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentError;
import com.squareup.cash.taptopay.screens.TapToPayInitiatorNotesScreen;
import com.squareup.cash.tax.presenters.RealTaxDesktopTooltipPreference;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartBlockerSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartIssuerLogoSpan;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.discover.HostDiscoverDataBridge;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ChatInputView$Content$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatInputView$Content$1$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = 2;
        switch (this.$r8$classId) {
            case 0:
                return new ChatInputView$Content$1$1$1((ChatInputView) this.this$0, continuation, 0);
            case 1:
                return new ChatInputView$Content$1$1$1((WorkHomePresenter) this.this$0, continuation, 1);
            case 2:
                return new ChatInputView$Content$1$1$1((PdfPreviewPresenter) this.this$0, continuation, i);
            case 3:
                return new ChatInputView$Content$1$1$1((CardLockPresenter) this.this$0, continuation, 3);
            case 4:
                return new ChatInputView$Content$1$1$1((SavingsScreenPresenter) this.this$0, continuation, 4);
            case 5:
                return new ChatInputView$Content$1$1$1((String) this.this$0, continuation, 5);
            case 6:
                return new ChatInputView$Content$1$1$1((TimeToLiveSyncState) this.this$0, continuation, 6);
            case 7:
                return new ChatInputView$Content$1$1$1((RealRecentSearchManager) this.this$0, continuation, 7);
            case 8:
                return new ChatInputView$Content$1$1$1((RealShopHubRepository) this.this$0, continuation, 8);
            case 9:
                return new ChatInputView$Content$1$1$1((CashAppPayIncentiveSheetPresenter) this.this$0, continuation, 9);
            case 10:
                return new ChatInputView$Content$1$1$1((ShoppingWebPresenter) this.this$0, continuation, 10);
            case 11:
                return new ChatInputView$Content$1$1$1((RealStablecoinNullStateCarouselPresenter) this.this$0, continuation, 11);
            case 12:
                return new ChatInputView$Content$1$1$1((HttpUrl) this.this$0, continuation, 12);
            case 13:
                return new ChatInputView$Content$1$1$1((TaxReturnsPresenter) this.this$0, continuation, 13);
            case 14:
                return new ChatInputView$Content$1$1$1((PoolsListPresenter) this.this$0, continuation, 14);
            case 15:
                return new ChatInputView$Content$1$1$1((TaxReturnsPresenter) this.this$0, continuation, 15);
            case 16:
                return new ChatInputView$Content$1$1$1((WorkHomePresenter) this.this$0, continuation, 16);
            case 17:
                return new ChatInputView$Content$1$1$1((WorkHomePresenter) this.this$0, continuation, 17);
            case 18:
                return new ChatInputView$Content$1$1$1((SupportHomePresenter) this.this$0, continuation, 18);
            case 19:
                return new ChatInputView$Content$1$1$1((ErrorPresenter) this.this$0, continuation, 19);
            case 20:
                return new ChatInputView$Content$1$1$1((CardLockPresenter) this.this$0, continuation, 20);
            case 21:
                return new ChatInputView$Content$1$1$1((RealTaxDesktopTooltipPreference) this.this$0, continuation, 21);
            case 22:
                ChatInputView$Content$1$1$1 chatInputView$Content$1$1$1 = new ChatInputView$Content$1$1$1(i, continuation);
                chatInputView$Content$1$1$1.this$0 = (Result) obj;
                return chatInputView$Content$1$1$1;
            case 23:
                return new ChatInputView$Content$1$1$1((ThreeDsPresenter) this.this$0, continuation, 23);
            case 24:
                return new ChatInputView$Content$1$1$1((LinkedAccountsPresenter) this.this$0, continuation, 24);
            case 25:
                return new ChatInputView$Content$1$1$1((ShareSheetPresenter) this.this$0, continuation, 25);
            case 26:
                return new ChatInputView$Content$1$1$1((ErrorPresenter) this.this$0, continuation, 26);
            case 27:
                return new ChatInputView$Content$1$1$1((CashTreehouseLayout) this.this$0, continuation, 27);
            case 28:
                return new ChatInputView$Content$1$1$1((HostDiscoverDataBridge) this.this$0, continuation, 28);
            default:
                return new ChatInputView$Content$1$1$1((CardSchemePresenter) this.this$0, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((ChatInputView$Content$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object networkFailure;
        Response execute;
        Response response;
        ResponseBody responseBody;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ChatInputView chatInputView = (ChatInputView) this.this$0;
                chatInputView.onTextChanged.invoke(chatInputView.textFieldState.getValue$foundation().text);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.this$0;
                Analytics analytics = (Analytics) workHomePresenter.shiftSection2Presenter;
                UiAlias.Type type2 = ((ProfileScreens.ContactMethodDetailsScreen) workHomePresenter.payPresenter).aliasType;
                type2.getClass();
                int ordinal = type2.ordinal();
                analytics.track(new NotificationsSettingsViewContactMethod(ordinal != 0 ? ordinal != 1 ? null : ContactMethodType.EMAIL : ContactMethodType.PHONE), null);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.this$0;
                Analytics analytics2 = (Analytics) pdfPreviewPresenter.launcher;
                String access$getSessionToken = PdfPreviewPresenter.access$getSessionToken(pdfPreviewPresenter);
                ProfileScreens.EnableAliasSheetScreen enableAliasSheetScreen = (ProfileScreens.EnableAliasSheetScreen) pdfPreviewPresenter.fileSaver;
                analytics2.track(new NotificationsSettingsViewConfirmSheet(access$getSessionToken, zzaky.getChannelListSettingsPage(enableAliasSheetScreen.notificationSettingsName), enableAliasSheetScreen.aliasType, enableAliasSheetScreen.origin), null);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((CardLockPresenter) this.this$0).analytics).track(new PromotionsViewPromotionsHome(), null);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) this.this$0;
                savingsScreenPresenter.navigator.goTo(new FailureMessageScreen(null, savingsScreenPresenter.stringManager.get(R.string.invalid_v2_folders_error_message), null, new GeneralSavingsScreen((SavingsScreen.ScreenType) savingsScreenPresenter.screenType), null, 21));
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = ((TimeToLiveSyncState) this.this$0).progress;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.compareAndSet(value, SyncState$Progress.IN_FLIGHT));
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StoryQueries storyQueries = ((RealRecentSearchManager) this.this$0).recentSearchesQueries;
                storyQueries.getClass();
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = ((RealShopHubRepository) this.this$0).cashDatabase.shopInfoDetailsQueries;
                gpsConfigQueries.getClass();
                ShopInfoDetailsQueries$forId$2 shopInfoDetailsQueries$forId$2 = ShopInfoDetailsQueries$forId$2.INSTANCE;
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CashAppPayIncentiveSheetPresenter cashAppPayIncentiveSheetPresenter = (CashAppPayIncentiveSheetPresenter) this.this$0;
                Analytics analytics3 = cashAppPayIncentiveSheetPresenter.analytics;
                CashAppPayIncentiveScreen$IncentivePromptSheetScreen cashAppPayIncentiveScreen$IncentivePromptSheetScreen = cashAppPayIncentiveSheetPresenter.args;
                String str = cashAppPayIncentiveScreen$IncentivePromptSheetScreen.merchantToken;
                String str2 = cashAppPayIncentiveScreen$IncentivePromptSheetScreen.flowToken;
                ShoppingScreenContext shoppingScreenContext = cashAppPayIncentiveScreen$IncentivePromptSheetScreen.screenContext;
                analytics3.track(new BrowserViewOpenCashAppPayOfferPrompt(str, str2, shoppingScreenContext != null ? EmojiExclusions.toOrigin(shoppingScreenContext) : null), null);
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.this$0;
                if (!shoppingWebPresenter.afterpayInfoSheetViewed.get()) {
                    shoppingWebPresenter.navigator.goTo(new ShoppingInfoSheetScreen.AfterPayInfoSheetScreen(((ShoppingWebScreen.AfterPayShoppingScreen) shoppingWebPresenter.args).screenContext));
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealStablecoinNullStateCarouselPresenter) this.this$0).analytics.track(new CryptoLearnStart(LearnContentType.STABLECOIN_CAROUSEL, null, null, null), null);
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    execute = new RealCall(new OkHttpClient(), new Request((HttpUrl) this.this$0, null, null, 14), false).execute();
                    response = execute.isSuccessful ? execute : null;
                } catch (IOException e) {
                    Timber.Forest.w("Failed to fetch support article CSS.", new Object[0], e);
                    networkFailure = new ApiResult.Failure.NetworkFailure(e);
                }
                if (response != null && (responseBody = response.body) != null && (r1 = responseBody.string()) != null) {
                    break;
                } else {
                    networkFailure = new ApiResult.Failure.HttpFailure(execute.code, null, null);
                    break;
                }
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) this.this$0;
                ((Analytics) taxReturnsPresenter.args).track(new CustomerSupportChatViewExitPrompt(((SupportChatScreens.SupportChatDialogs.ChatExitPrompt) taxReturnsPresenter.router).flowToken), null);
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
                ((Analytics) poolsListPresenter.analytics).track(new CustomerSupportChatViewExitPrompt(((SupportChatScreens.SupportChatSheets.ChatExitPromptSheet) poolsListPresenter.args).flowToken), null);
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter2 = (TaxReturnsPresenter) this.this$0;
                ((AndroidAccessibilityManager) taxReturnsPresenter2.taxesDocumentsTaxReturnsDataProvider).announceForAccessibility(((AndroidStringManager) taxReturnsPresenter2.args).get(R.string.support_chat_a11y_image_detail_enter_announcement));
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) this.this$0;
                Analytics analytics4 = (Analytics) workHomePresenter2.shiftsAnalytics;
                SupportScreens.ContactScreens.Data data = ((SupportScreens.ContactScreens.ContactSupportEmailInputScreen) workHomePresenter2.payPresenter).data;
                data.getClass();
                analytics4.track(new CustomerSupportContactViewEnterContact(zzpd.toChannel(data.contactOption), data.flowToken), null);
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                WorkHomePresenter workHomePresenter3 = (WorkHomePresenter) this.this$0;
                Analytics analytics5 = (Analytics) workHomePresenter3.shiftSection2Presenter;
                SupportScreens.ContactScreens.Data data2 = ((SupportScreens.ContactScreens.ContactSupportMessageScreen) workHomePresenter3.payPresenter).data;
                data2.getClass();
                analytics5.track(new CustomerSupportContactViewEnterMessage(zzpd.toChannel(data2.contactOption), data2.flowToken), null);
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((SupportHomePresenter) this.this$0).conversationService.loadNewMessages();
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ErrorPresenter) this.this$0).navigator.goTo(TapToPayInitiatorNotesScreen.INSTANCE);
                break;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.this$0;
                ((RealTapToPayErrorReporter) cardLockPresenter.flowStarter).errorReporter.report(new TapToPayPaymentError("Session data was null, exiting payment flow"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                cardLockPresenter.navigator.goTo(Back.INSTANCE);
                break;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 22:
                Result result = (Result) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ThreeDsPresenter threeDsPresenter = (ThreeDsPresenter) this.this$0;
                RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = threeDsPresenter.spanTrackingService;
                boolean z = threeDsPresenter.issuerMode;
                realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$StartBlockerSpan(z));
                if (z) {
                    realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$StartIssuerLogoSpan.INSTANCE);
                }
                threeDsPresenter.analytics.track(new ThreeDsAuthenticationStart(threeDsPresenter.args.blockersData.flowToken), null);
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealClientSyncer) ((LinkedAccountsPresenter) this.this$0).clientSyncer).sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.this$0;
                Analytics analytics6 = (Analytics) shareSheetPresenter.analytics;
                int ordinal2 = ((TransferType) shareSheetPresenter.modelUpdates).ordinal();
                if (ordinal2 == 0) {
                    analytics6.track(new CashDepositViewPendingConfirmation(), null);
                } else if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    analytics6.track(new CashWithdrawViewPendingConfirmation(), null);
                }
                break;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ErrorPresenter errorPresenter = (ErrorPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator = errorPresenter.navigator;
                Screen screen = ((TransfersRouterScreen) errorPresenter.args).exitScreen;
                if (screen instanceof WithdrawScreen) {
                    WithdrawScreen withdrawScreen = (WithdrawScreen) screen;
                    BlockersData blockersData = withdrawScreen.blockersData;
                    BlockersData.Flow.INSTANCE.getClass();
                    screen = WithdrawScreen.copy$default(withdrawScreen, BlockersData.copy$default(blockersData, null, BlockersData.Flow.Companion.generateToken(), null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -3, 65535), null, null, null, 14);
                } else if (screen instanceof AddMoneyScreen) {
                    AddMoneyScreen addMoneyScreen = (AddMoneyScreen) screen;
                    BlockersData blockersData2 = addMoneyScreen.blockersData;
                    BlockersData.Flow.INSTANCE.getClass();
                    screen = AddMoneyScreen.copy$default(addMoneyScreen, BlockersData.copy$default(blockersData2, null, BlockersData.Flow.Companion.generateToken(), null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -3, 65535), null, null, 62);
                }
                screenNavigator.goTo(new MoneyTabScreen(null));
                screenNavigator.goTo(screen);
                break;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) this.this$0;
                cashTreehouseLayout.loadingScrim.setLoading(cashTreehouseLayout.treehouseLoading || cashTreehouseLayout.contentLoading);
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((HostDiscoverDataBridge) this.this$0).treehouseApp.start();
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardSchemePresenter) this.this$0).analytics.track(new CashCardTabView(), null);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatInputView$Content$1$1$1(int i, Continuation continuation) {
        super(i, continuation);
        this.$r8$classId = 22;
    }
}
