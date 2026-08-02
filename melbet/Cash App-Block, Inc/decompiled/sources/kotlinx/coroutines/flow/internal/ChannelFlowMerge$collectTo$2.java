package kotlinx.coroutines.flow.internal;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.emoji2.text.MetadataListReader;
import androidx.glance.appwidget.IgnoreResultKt;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.BrowserCheckoutContinueWithCashAppPay;
import com.squareup.cash.cdf.browser.BrowserCheckoutDismissCashAppPayOfferPrompt;
import com.squareup.cash.cdf.cashapppay.CashAppPayAuthStart;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureCancel;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureReceiveError;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureRemoveScreenshot;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureSubmit;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureViewScreenshot;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatSelectExitAction;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactSubmitContact;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewDismiss;
import com.squareup.cash.cdf.disputeshistory.DisputesHistoryTapOpenReceipt;
import com.squareup.cash.cdf.disputeshistory.DisputesHistoryViewReachEnd;
import com.squareup.cash.cdf.mintstatus.MintStatusRowActionTapped;
import com.squareup.cash.cdf.mintstatus.MintStatusRowTapped;
import com.squareup.cash.cdf.mintstatus.MintStatusRowViewed;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardCardTabPillTap;
import com.squareup.cash.cdf.shoppingautofilldetails.AutofillDetailsOrigin;
import com.squareup.cash.cdf.shoppingautofilldetails.ShoppingAutofillDetailsViewOpen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.DeepLinkParserKt;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableTesBasedTaxesEntryPoint;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.screens.ArcadeAutofillSettingsScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewEvent;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.shopping.backend.api.ShippingAddressRepository$ShippingAddressResult;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$IncentivePromptSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.settings.presenters.ShoppingSettingsAutofillPresenter;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewEvent;
import com.squareup.cash.shopping.viewmodels.CashFillStatus;
import com.squareup.cash.shopping.viewmodels.FillrStatus;
import com.squareup.cash.shopping.viewmodels.InjectJavascriptViewModel$InjectJsViewModel;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastState;
import com.squareup.cash.shopping.viewmodels.RestrictedProduct;
import com.squareup.cash.shopping.viewmodels.ShoppingJavascriptViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputeTrackerResult;
import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.support.backend.real.RealScreenshotService$uploadAndSendScreenshotBundle$1;
import com.squareup.cash.support.chat.backend.api.ChatSurveyResponse;
import com.squareup.cash.support.chat.presenters.ChatExitPromptSheetState;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewEvents;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter;
import com.squareup.cash.support.presenters.SupportDisputeTrackerPresenter$models$1$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.AnalyticsUitlKt;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.PhoneVerificationEvents;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewEvent;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewEvent;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.presenters.TapToPayInitiatorNotesPresenter$models$1$1;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewEvent;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.tax.screens.TaxWebBridgeDialog;
import com.squareup.cash.tax.viewmodels.TaxWebAppBridgeEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewEvent;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.presenters.WalletHomePresenter$models$2$1;
import com.squareup.cash.wallet.presenters.WalletHomePresenter$models$3$1;
import com.squareup.cash.wallet.screens.CardLockHalfSheetScreen;
import com.squareup.cash.wallet.screens.PresentationTimelineScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.data.api.ShiftDataState;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.ShiftLoaderContext;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.screens.ShiftNoteResult$Cancelled;
import com.squareup.cash.work.screens.ShiftNoteScreen;
import com.squareup.cash.work.screens.TakeBreakBottomSheetScreen;
import com.squareup.cash.work.screens.TakeBreakResult$Cancelled;
import com.squareup.cash.work.viewmodels.ShiftNoteViewEvent;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewEvent;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.cashvoice.verification.app.v1.ConfirmPhoneSupportAttemptFlowParameters;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ChannelFlowMerge$collectTo$2 implements FlowCollector {
    public final /* synthetic */ Object $collector;
    public final /* synthetic */ Object $job;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $scope;
    public final /* synthetic */ Object $semaphore;

    public /* synthetic */ ChannelFlowMerge$collectTo$2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.$semaphore = obj2;
        this.$scope = obj3;
        this.$collector = obj4;
        this.$job = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.Result$Failure] */
    private final Object emit$com$squareup$cash$tax$presenters$TaxWebAppPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        ArrayList arrayList;
        URI failure;
        String host;
        TaxWebAppPresenter taxWebAppPresenter = (TaxWebAppPresenter) this.$semaphore;
        BetterNavigator.ScreenNavigator screenNavigator = taxWebAppPresenter.navigator;
        BlockersScreens.TaxWebViewScreen taxWebViewScreen = taxWebAppPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$job;
        TaxWebAppViewEvent taxWebAppViewEvent = (TaxWebAppViewEvent) obj;
        boolean z = true;
        ?? r6 = 1;
        ?? r5 = 0;
        if (Intrinsics.areEqual(taxWebAppViewEvent, TaxWebAppViewEvent.FinishTaxFlow.INSTANCE)) {
            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) taxWebAppPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnableTesBasedTaxesEntryPoint.INSTANCE)).enabled()) {
                JobKt.launch$default(coroutineScope, null, null, new ExoPlayerVideoView.AnonymousClass2(taxWebAppPresenter, r5 == true ? 1 : 0, r6 == true ? 1 : 0), 3);
            }
            Screen back = taxWebAppPresenter.blockersDataNavigator.getBack(taxWebViewScreen, taxWebViewScreen.blockersData);
            if (back == null) {
                back = taxWebViewScreen.blockersData.exitScreen;
            }
            screenNavigator.goTo(back);
        } else if (taxWebAppViewEvent instanceof TaxWebAppViewEvent.WebAppBridgeEvent) {
            TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent presenterHandledTaxWebAppBridgeEvent = ((TaxWebAppViewEvent.WebAppBridgeEvent) taxWebAppViewEvent).bridgeEvent;
            ArrayList arrayList2 = new ArrayList();
            if (presenterHandledTaxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenExternalUrl) {
                String str = ((TaxWebAppBridgeEvent.OpenExternalUrl) presenterHandledTaxWebAppBridgeEvent).url;
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new URI(str);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                URI uri = failure instanceof Result.Failure ? null : failure;
                if (uri != null && (host = uri.getHost()) != null) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = host.toLowerCase(locale);
                    lowerCase.getClass();
                    ?? removePrefix = StringsKt.removePrefix("www.", lowerCase);
                    Set<String> set = TaxWebAppPresenter.X_DOMAINS;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str2 : set) {
                            if (!removePrefix.equals(str2)) {
                                if (StringsKt__StringsJVMKt.endsWith(removePrefix, "." + str2, false)) {
                                }
                            }
                            arrayList = arrayList2;
                            screenNavigator.goTo(new BlockersScreens.WebViewBlockerScreen(BlockersData.copy$default(taxWebViewScreen.blockersData, null, null, null, null, null, null, taxWebViewScreen, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535), str, null, EmptyList.INSTANCE, MapsKt__MapsKt.mapOf(new Pair("webview_scraping", "DISABLED"), new Pair("x_web_compatibility", "true")), false, null, null));
                            presenterHandledTaxWebAppBridgeEvent = presenterHandledTaxWebAppBridgeEvent;
                        }
                    }
                }
                arrayList = arrayList2;
                taxWebAppPresenter.launcher.launchUrlInInternalBrowser(str);
            } else {
                arrayList = arrayList2;
                if (presenterHandledTaxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenTaxMenuSheet) {
                    screenNavigator.goTo(new TaxMenuSheet(((TaxWebAppBridgeEvent.OpenTaxMenuSheet) presenterHandledTaxWebAppBridgeEvent).taxMenuItems));
                } else if (presenterHandledTaxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenTaxDialog) {
                    screenNavigator.goTo(new TaxWebBridgeDialog(((TaxWebAppBridgeEvent.OpenTaxDialog) presenterHandledTaxWebAppBridgeEvent).taxDialogModel));
                } else if (presenterHandledTaxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenTaxesFlowLoadingScreen) {
                    String str3 = ((TaxWebAppBridgeEvent.OpenTaxesFlowLoadingScreen) presenterHandledTaxWebAppBridgeEvent).deepLinkUrl;
                    if (str3 == null) {
                        str3 = "";
                    }
                    screenNavigator.goTo(new TaxAuthorizationScreen(new TaxLocation.DeepLink(str3), taxWebViewScreen));
                } else {
                    if (!(presenterHandledTaxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenNativeDeepLink)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    TaxWebAppBridgeEvent.OpenNativeDeepLink openNativeDeepLink = (TaxWebAppBridgeEvent.OpenNativeDeepLink) presenterHandledTaxWebAppBridgeEvent;
                    String str4 = openNativeDeepLink.deepLinkUrl;
                    boolean z2 = openNativeDeepLink.doNotRoute;
                    String str5 = openNativeDeepLink.currentWebViewState.currentUrl;
                    RealDeepLinkParser realDeepLinkParser = taxWebAppPresenter.deepLinkParser;
                    if (!DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, str4) || DeepLinkParserKt.tryParse(realDeepLinkParser, str4) == null) {
                        z = false;
                    } else if (!z2) {
                        z = taxWebAppPresenter.routerFactory.create$1(screenNavigator).route(new RoutingParams(BlockersScreens.TaxWebViewScreen.copy$default(taxWebViewScreen, str5), null, BlockersScreens.TaxWebViewScreen.copy$default(taxWebViewScreen, str5), null, null, null, HttpStatusCode.BAD_GATEWAY_502), str4);
                    }
                    arrayList.add(new TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult(openNativeDeepLink.eventId, z));
                }
            }
            if (presenterHandledTaxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenNativeDeepLink) {
                ((MutableState) this.$scope).setValue(new TaxWebAppViewModel.TransitoryWebModel(((TaxWebAppBridgeEvent.OpenNativeDeepLink) presenterHandledTaxWebAppBridgeEvent).currentWebViewState.currentUrl, arrayList));
            }
        } else {
            if (!(taxWebAppViewEvent instanceof TaxWebAppViewEvent.OpenTooltipEvent)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new TaxWebAppBridge.AnonymousClass4(taxWebAppPresenter, taxWebAppViewEvent, (MutableState) this.$collector, null, 10), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$wallet$presenters$WalletHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$collector;
        WalletHomePresenter walletHomePresenter = (WalletHomePresenter) this.$semaphore;
        BetterNavigator.ScreenNavigator screenNavigator = walletHomePresenter.navigator;
        Analytics analytics = walletHomePresenter.analytics;
        CoroutineScope coroutineScope = (CoroutineScope) this.$job;
        WalletHomeViewEvent walletHomeViewEvent = (WalletHomeViewEvent) obj;
        if (Intrinsics.areEqual(walletHomeViewEvent, WalletHomeViewEvent.Close.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            int i = 3;
            Continuation continuation2 = null;
            if (walletHomeViewEvent instanceof WalletHomeViewEvent.ToggleCardDataVisibility) {
                JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation2, 0), 3);
            } else if (Intrinsics.areEqual(walletHomeViewEvent, WalletHomeViewEvent.CopyCard.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new CardAppletWorker$setup$1$2$1(walletHomePresenter, (MutableState) this.$scope, parcelableSnapshotMutableIntState, null, 7), 3);
            } else {
                int i2 = 2;
                if (walletHomeViewEvent instanceof WalletHomeViewEvent.PageChanged) {
                    parcelableSnapshotMutableIntState.setIntValue(((WalletHomeViewEvent.PageChanged) walletHomeViewEvent).page);
                    JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation2, i2), 3);
                } else {
                    int i3 = 1;
                    if (walletHomeViewEvent instanceof WalletHomeViewEvent.NewTagPeekConsumed) {
                        JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$2$1(walletHomePresenter, continuation2, i3), 3);
                    } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.OpenUrl) {
                        walletHomePresenter.router.route(new RoutingParams(new WalletHomeScreen(7, (Integer) null, (String) null), null, null, null, null, null, 510), ((WalletHomeViewEvent.OpenUrl) walletHomeViewEvent).url);
                    } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.NullStateCarouselEvent) {
                        JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation2, i), 3);
                    } else if (!(walletHomeViewEvent instanceof WalletHomeViewEvent.TabToolbarEvent)) {
                        if (walletHomeViewEvent instanceof WalletHomeViewEvent.PrepurchaseHeaderButtonClick) {
                            analytics.track(new PrepurchaseCardCardTabPillTap(), null);
                            walletHomePresenter.router.route(new RoutingParams(new WalletHomeScreen(7, (Integer) null, (String) null), null, null, null, null, null, 510), ((WalletHomeViewEvent.PrepurchaseHeaderButtonClick) walletHomeViewEvent).url);
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.PrepurchaseToggleTapped) {
                            JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$2$1(walletHomePresenter, continuation2, i2), 3);
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.VerticalScroll) {
                            JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$2$1(walletHomePresenter, continuation2, i), 3);
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.OpenLockHalfSheet) {
                            WalletHomeViewEvent.OpenLockHalfSheet openLockHalfSheet = (WalletHomeViewEvent.OpenLockHalfSheet) walletHomeViewEvent;
                            screenNavigator.goTo(new CardLockHalfSheetScreen(openLockHalfSheet.title, openLockHalfSheet.description));
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.PresentationStatusClicked) {
                            WalletHomeViewEvent.PresentationStatusClicked presentationStatusClicked = (WalletHomeViewEvent.PresentationStatusClicked) walletHomeViewEvent;
                            analytics.track(new MintStatusRowTapped(presentationStatusClicked.themeToken, presentationStatusClicked.deviceId, presentationStatusClicked.statusTitle, presentationStatusClicked.statusSubtitle), null);
                            screenNavigator.goTo(new PresentationTimelineScreen(presentationStatusClicked.timeline));
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.PresentationStatusActionClicked) {
                            WalletHomeViewEvent.PresentationStatusActionClicked presentationStatusActionClicked = (WalletHomeViewEvent.PresentationStatusActionClicked) walletHomeViewEvent;
                            String str = presentationStatusActionClicked.url;
                            analytics.track(new MintStatusRowActionTapped(presentationStatusActionClicked.themeToken, presentationStatusActionClicked.deviceId, presentationStatusActionClicked.buttonLabel, str), null);
                            walletHomePresenter.router.route(new RoutingParams(new WalletHomeScreen(7, (Integer) null, (String) null), null, null, null, null, null, 510), str);
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.PresentationStatusViewed) {
                            CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel = ((WalletHomeViewEvent.PresentationStatusViewed) walletHomeViewEvent).status;
                            analytics.track(new MintStatusRowViewed(deliveryStatusRowModel.themeToken, deliveryStatusRowModel.deviceId, deliveryStatusRowModel.title, deliveryStatusRowModel.subtitle), null);
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.NextUpCardClicked) {
                            JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation2, 4), 3);
                        } else if (walletHomeViewEvent instanceof WalletHomeViewEvent.NextUpCardViewed) {
                            JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation2, 5), 3);
                        } else {
                            if (!(walletHomeViewEvent instanceof WalletHomeViewEvent.NextUpCardDismissed)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            JobKt.launch$default(coroutineScope, null, null, new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation2, i3), 3);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f1, code lost:
    
        if (r14.emit(r15, r3) != r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$work$data$real$RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2(Object obj, Continuation continuation) {
        RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1 realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1;
        int i;
        FlowCollector flowCollector;
        int i2;
        ShiftDataState shiftDataState;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$semaphore;
        ShiftLoaderContext shiftLoaderContext = (ShiftLoaderContext) this.$collector;
        RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) this.$scope;
        if (continuation instanceof RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1) {
            realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1 = (RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1) continuation;
            int i3 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.$job;
                    RealShiftDataLoader.Command command = (RealShiftDataLoader.Command) obj;
                    Object obj3 = ref$ObjectRef.element;
                    ShiftDataState.Ready ready = obj3 instanceof ShiftDataState.Ready ? (ShiftDataState.Ready) obj3 : null;
                    if (Intrinsics.areEqual(command, RealShiftDataLoader.Command.Initialization.INSTANCE)) {
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4 = flowCollector2;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0 = 0;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = 1;
                        obj2 = realShiftDataLoader.loadInitialShiftData(shiftLoaderContext, realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            flowCollector = flowCollector2;
                            i2 = 0;
                            shiftDataState = (ShiftDataState) obj2;
                        }
                    } else if (Intrinsics.areEqual(command, RealShiftDataLoader.Command.LoadNextSchedules.INSTANCE)) {
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4 = flowCollector2;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0 = 0;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = 2;
                        obj2 = RealShiftDataLoader.access$loadNextSchedules(realShiftDataLoader, shiftLoaderContext, ready, realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            flowCollector = flowCollector2;
                            i2 = 0;
                            shiftDataState = (ShiftDataState) obj2;
                        }
                    } else if (Intrinsics.areEqual(command, RealShiftDataLoader.Command.LoadPreviousTimecards.INSTANCE)) {
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4 = flowCollector2;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0 = 0;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = 3;
                        obj2 = RealShiftDataLoader.access$loadPreviousTimecards(realShiftDataLoader, shiftLoaderContext, ready, realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            flowCollector = flowCollector2;
                            i2 = 0;
                            shiftDataState = (ShiftDataState) obj2;
                        }
                    } else {
                        if (!Intrinsics.areEqual(command, RealShiftDataLoader.Command.Retry.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4 = flowCollector2;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0 = 0;
                        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = 4;
                        obj2 = RealShiftDataLoader.access$retryFailedLoads(realShiftDataLoader, shiftLoaderContext, ready, realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            flowCollector = flowCollector2;
                            i2 = 0;
                            shiftDataState = (ShiftDataState) obj2;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    i2 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0;
                    flowCollector = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    shiftDataState = (ShiftDataState) obj2;
                } else if (i == 2) {
                    i2 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0;
                    flowCollector = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    shiftDataState = (ShiftDataState) obj2;
                } else if (i == 3) {
                    i2 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0;
                    flowCollector = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    shiftDataState = (ShiftDataState) obj2;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0;
                    flowCollector = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    shiftDataState = (ShiftDataState) obj2;
                }
                ref$ObjectRef.element = shiftDataState;
                realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4 = null;
                realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0 = i2;
                realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = 5;
            }
        }
        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1 = new RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        ref$ObjectRef.element = shiftDataState;
        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.L$4 = null;
        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.I$0 = i2;
        realShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2$1.label = 5;
    }

    private final Object emit$com$squareup$cash$work$presenters$shift$ShiftNotePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        ShiftNoteViewEvent shiftNoteViewEvent = (ShiftNoteViewEvent) obj;
        MerchantIdentifier merchantIdentifier = (MerchantIdentifier) ((State) this.$scope).getValue();
        if (merchantIdentifier != null && (str = merchantIdentifier.token) != null) {
            PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.$job;
            ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = new ShiftNotePresenter$models$1$1(0, (MutableState) this.$collector);
            CoroutineScope coroutineScope = (CoroutineScope) this.$semaphore;
            ShiftNoteScreen shiftNoteScreen = (ShiftNoteScreen) pdfPreviewPresenter.args;
            if (Intrinsics.areEqual(shiftNoteViewEvent, ShiftNoteViewEvent.BackClicked.INSTANCE)) {
                AskedQuestion askedQuestion = shiftNoteScreen.askedQuestion;
                BetterNavigator.ScreenNavigator screenNavigator = pdfPreviewPresenter.navigator;
                if (askedQuestion != null) {
                    screenNavigator.giveAnswer(askedQuestion, ShiftNoteResult$Cancelled.INSTANCE);
                } else {
                    screenNavigator.goTo(Back.INSTANCE);
                }
            } else if (shiftNoteViewEvent instanceof ShiftNoteViewEvent.AddNoteClicked) {
                String str2 = ((ShiftNoteViewEvent.AddNoteClicked) shiftNoteViewEvent).note;
                String str3 = shiftNoteScreen.timecardToken;
                if (str3 != null) {
                    JobKt.launch$default(coroutineScope, null, null, new WorkflowLayout$start$1(pdfPreviewPresenter, str3, str2, str, shiftNotePresenter$models$1$1, null, 20), 3);
                }
            } else {
                if (!Intrinsics.areEqual(shiftNoteViewEvent, ShiftNoteViewEvent.DeleteNoteClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str4 = shiftNoteScreen.timecardToken;
                if (str4 != null) {
                    JobKt.launch$default(coroutineScope, null, null, new TakeUntil$collectSafely$2(pdfPreviewPresenter, str4, str, shiftNotePresenter$models$1$1, null, 23), 3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0b0b  */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r14v5, types: [android.net.Uri] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1 realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1;
        int i;
        AutofillDetailsOrigin autofillDetailsOrigin;
        GlobalAddress globalAddress;
        FullName fullName;
        FullName fullName2;
        FullName fullName3;
        GlobalAddress globalAddress2;
        String str;
        Object obj2;
        int i2 = this.$r8$classId;
        Back back = Back.INSTANCE;
        Object obj3 = this.$semaphore;
        Object obj4 = this.$job;
        Object obj5 = this.$scope;
        Object obj6 = this.$collector;
        Continuation continuation2 = null;
        switch (i2) {
            case 0:
                return emit((Flow) obj, continuation);
            case 1:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                ContactMethodDetailsViewEvent contactMethodDetailsViewEvent = (ContactMethodDetailsViewEvent) obj;
                if (contactMethodDetailsViewEvent instanceof ContactMethodDetailsViewEvent.GoBack) {
                    ((BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter).goTo(back);
                } else {
                    if (!(contactMethodDetailsViewEvent instanceof ContactMethodDetailsViewEvent.NotificationToggled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ContactMethodDetailsViewEvent.NotificationToggled notificationToggled = (ContactMethodDetailsViewEvent.NotificationToggled) contactMethodDetailsViewEvent;
                    boolean z = notificationToggled.checkedValue;
                    WorkHomePresenter.access$replace(workHomePresenter, (List) obj5, notificationToggled.alias, z);
                    zzaky.trackToggleAlias((Analytics) workHomePresenter.shiftSection2Presenter, z, ((ProfileScreens.ContactMethodDetailsScreen) workHomePresenter.payPresenter).aliasType, false);
                    JobKt.launch$default(coroutineScope, null, null, new RealQrCodesPresenter$models$1$1((MutableState) obj6, workHomePresenter, contactMethodDetailsViewEvent, (List) obj5, (Continuation) null), 3);
                }
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) obj5;
                HCaptcha hCaptcha = (HCaptcha) obj3;
                AndroidFileProvider androidFileProvider = (AndroidFileProvider) hCaptcha.onSuccessListeners;
                RealFileDownloader realFileDownloader = (RealFileDownloader) hCaptcha.exception;
                if (continuation instanceof RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1) {
                    realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1 = (RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1) continuation;
                    int i3 = realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector = (FlowCollector) obj4;
                            FileDownloader$Category fileDownloader$Category = FileDownloader$Category.SHARE_SHEET;
                            if (realFileDownloader.ready(fileDownloader$Category, str2)) {
                                Uri localUri = realFileDownloader.localUri(fileDownloader$Category, str2);
                                localUri.getClass();
                                continuation2 = androidFileProvider.contentUriForFileUri(localUri);
                            } else if (realFileDownloader.download(fileDownloader$Category, str2, (String) obj6, false) == FileDownloader$DownloadStatus.SUCCESS) {
                                Uri localUri2 = realFileDownloader.localUri(fileDownloader$Category, str2);
                                localUri2.getClass();
                                continuation2 = androidFileProvider.contentUriForFileUri(localUri2);
                            }
                            realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(continuation2, realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1 = new RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj72 = realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 3:
                RealShoppingJavascriptPresenter realShoppingJavascriptPresenter = (RealShoppingJavascriptPresenter) obj4;
                ShoppingWebViewEvent shoppingWebViewEvent = (ShoppingWebViewEvent) obj;
                if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.UrlUpdated) {
                    List list = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    realShoppingJavascriptPresenter.sendPerformanceToCDF((String) ((MutableState) obj3).getValue(), (FillrStatus) ((MutableState) obj5).getValue(), (CashFillStatus) ((MutableState) obj6).getValue());
                    realShoppingJavascriptPresenter.currentUrl$delegate.setValue(((ShoppingWebViewEvent.UrlUpdated) shoppingWebViewEvent).url);
                }
                return Unit.INSTANCE;
            case 4:
                RealShoppingJavascriptPresenter realShoppingJavascriptPresenter2 = (RealShoppingJavascriptPresenter) obj3;
                JobKt.launch$default((CoroutineScope) obj4, realShoppingJavascriptPresenter2.ioDispatcher, null, new PoolsListPresenter$models$2$2((ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents) obj, realShoppingJavascriptPresenter2, (MutableState) obj5, (MutableState) obj6, (Continuation) null), 2);
                return Unit.INSTANCE;
            case 5:
                ShoppingWebViewEvent.PayKitShopViewEvent payKitShopViewEvent = (ShoppingWebViewEvent.PayKitShopViewEvent) obj;
                MutableState mutableState = (MutableState) obj6;
                RealShoppingJavascriptPresenter realShoppingJavascriptPresenter3 = (RealShoppingJavascriptPresenter) obj3;
                ShoppingWebScreen shoppingWebScreen = realShoppingJavascriptPresenter3.args;
                BetterNavigator.ScreenNavigator screenNavigator = realShoppingJavascriptPresenter3.navigator;
                RealBugReportSenderFactory realBugReportSenderFactory = realShoppingJavascriptPresenter3.shoppingWebAnalytics;
                Analytics analytics = realShoppingJavascriptPresenter3.analytics;
                RestrictedProduct restrictedProduct = (RestrictedProduct) obj4;
                if (restrictedProduct != null) {
                    String str3 = restrictedProduct.productName;
                    analytics.track(realBugReportSenderFactory.trackBrowserViewOpenRestrictedItemWarning(str3), null);
                    ShoppingScreenContext screenContext = shoppingWebScreen.getScreenContext();
                    if (str3 == null) {
                        str3 = "gift card";
                    }
                    screenNavigator.goTo(new ShoppingScreen$RestrictedItemWarningSheetScreen(screenContext, str3));
                } else {
                    List list2 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    IgnoreResultKt ignoreResultKt = ((ShoppingJavascriptViewModel) mutableState.getValue()).injectJavascriptViewModel;
                    InjectJavascriptViewModel$InjectJsViewModel injectJavascriptViewModel$InjectJsViewModel = ignoreResultKt instanceof InjectJavascriptViewModel$InjectJsViewModel ? (InjectJavascriptViewModel$InjectJsViewModel) ignoreResultKt : null;
                    Integer num = injectJavascriptViewModel$InjectJsViewModel != null ? new Integer(injectJavascriptViewModel$InjectJsViewModel.version) : null;
                    if (payKitShopViewEvent instanceof ShoppingWebViewEvent.PayKitShopViewEvent.PromptToAuthorize) {
                        mutableState.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState.getValue(), null, PaykitInfoToastState.PAYKIT_LOADED, 1));
                        analytics.track(realBugReportSenderFactory.trackBrowserCheckoutLoad(), null);
                        Float access$getCapDiscountAmount = MetadataListReader.access$getCapDiscountAmount(shoppingWebScreen);
                        if (access$getCapDiscountAmount != null) {
                            float floatValue = access$getCapDiscountAmount.floatValue();
                            if (floatValue > RecyclerView.DECELERATION_RATE) {
                                String str4 = ((ShoppingWebViewEvent.PayKitShopViewEvent.PromptToAuthorize) payKitShopViewEvent).url;
                                ShoppingScreenContext screenContext2 = shoppingWebScreen.getScreenContext();
                                ShoppingScreenContext.DiscoverBnplCarousel discoverBnplCarousel = screenContext2 instanceof ShoppingScreenContext.DiscoverBnplCarousel ? (ShoppingScreenContext.DiscoverBnplCarousel) screenContext2 : null;
                                screenNavigator.goTo(new CashAppPayIncentiveScreen$IncentivePromptSheetScreen(shoppingWebScreen.getScreenContext(), str4, floatValue, discoverBnplCarousel != null ? discoverBnplCarousel.merchantToken : null, realShoppingJavascriptPresenter3.flowToken));
                            }
                        }
                    } else if (payKitShopViewEvent instanceof ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest) {
                        mutableState.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState.getValue(), null, PaykitInfoToastState.PAYKIT_LOADED, 1));
                        String str5 = ((ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest) payKitShopViewEvent).url;
                        str5.getClass();
                        analytics.track(new CashAppPayAuthStart((String) realBugReportSenderFactory.tempStorage, str5, (BrowserOrigin) realBugReportSenderFactory.sessionManager), null);
                        JobKt.launch$default((CoroutineScope) obj5, realShoppingJavascriptPresenter3.ioDispatcher, null, new TaxWebAppPresenter$models$1$1(realShoppingJavascriptPresenter3, payKitShopViewEvent, num, (MutableState) obj6, (Continuation) null), 2);
                    } else if (Intrinsics.areEqual(payKitShopViewEvent, ShoppingWebViewEvent.PayKitShopViewEvent.CashAppPayContinuePressed.INSTANCE)) {
                        ShoppingScreenContext screenContext3 = ((ShoppingWebScreen) realBugReportSenderFactory.bugReportService).getScreenContext();
                        ShoppingScreenContext.DiscoverBnplCarousel discoverBnplCarousel2 = screenContext3 instanceof ShoppingScreenContext.DiscoverBnplCarousel ? (ShoppingScreenContext.DiscoverBnplCarousel) screenContext3 : null;
                        analytics.track(new BrowserCheckoutContinueWithCashAppPay(discoverBnplCarousel2 != null ? discoverBnplCarousel2.merchantToken : null, (String) realBugReportSenderFactory.tempStorage, (BrowserOrigin) realBugReportSenderFactory.sessionManager), null);
                        mutableState.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState.getValue(), new InjectJavascriptViewModel$InjectJsViewModel("\n        window.CashApp.pay._native.dispatchEvent(\n          new CustomEvent('CONTINUE_WITH_CASH_APP_PAY_BUTTON_PRESSED')\n        )\n      ", num != null ? 1 + num.intValue() : 1), null, 2));
                    } else if (Intrinsics.areEqual(payKitShopViewEvent, ShoppingWebViewEvent.PayKitShopViewEvent.CashAppPayPromptDismissed.INSTANCE)) {
                        ShoppingScreenContext screenContext4 = ((ShoppingWebScreen) realBugReportSenderFactory.bugReportService).getScreenContext();
                        ShoppingScreenContext.DiscoverBnplCarousel discoverBnplCarousel3 = screenContext4 instanceof ShoppingScreenContext.DiscoverBnplCarousel ? (ShoppingScreenContext.DiscoverBnplCarousel) screenContext4 : null;
                        analytics.track(new BrowserCheckoutDismissCashAppPayOfferPrompt(discoverBnplCarousel3 != null ? discoverBnplCarousel3.merchantToken : null, (String) realBugReportSenderFactory.tempStorage, (BrowserOrigin) realBugReportSenderFactory.sessionManager), null);
                    } else {
                        if (!Intrinsics.areEqual(payKitShopViewEvent, ShoppingWebViewEvent.PayKitShopViewEvent.PaykitToastClosePressed.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        mutableState.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState.getValue(), null, PaykitInfoToastState.PAYKIT_TIMEOUT_INFO_SHOWN, 1));
                    }
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) obj5;
                ShoppingSettingsAutofillPresenter shoppingSettingsAutofillPresenter = (ShoppingSettingsAutofillPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator2 = shoppingSettingsAutofillPresenter.navigator;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                ShoppingSettingsAutofillViewEvent shoppingSettingsAutofillViewEvent = (ShoppingSettingsAutofillViewEvent) obj;
                if (Intrinsics.areEqual(shoppingSettingsAutofillViewEvent, ShoppingSettingsAutofillViewEvent.GoBack.INSTANCE)) {
                    screenNavigator2.goTo(back);
                } else if (Intrinsics.areEqual(shoppingSettingsAutofillViewEvent, ShoppingSettingsAutofillViewEvent.AutofillToggleClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope2, shoppingSettingsAutofillPresenter.ioContext, null, new ShoppingWebBridge$loadUrl$1(shoppingSettingsAutofillPresenter, mutableState2, null, 12), 2);
                } else {
                    ShoppingSettingsAutofillViewEvent.AddAddressClicked addAddressClicked = ShoppingSettingsAutofillViewEvent.AddAddressClicked.INSTANCE;
                    boolean areEqual = Intrinsics.areEqual(shoppingSettingsAutofillViewEvent, addAddressClicked);
                    ShoppingSettingsAutofillViewEvent.EditAddressClicked editAddressClicked = ShoppingSettingsAutofillViewEvent.EditAddressClicked.INSTANCE;
                    if (!areEqual && !Intrinsics.areEqual(shoppingSettingsAutofillViewEvent, editAddressClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ShippingAddressRepository$ShippingAddressResult shippingAddressRepository$ShippingAddressResult = (ShippingAddressRepository$ShippingAddressResult) ((State) obj6).getValue();
                    ShippingAddressRepository$ShippingAddressResult.Success success = shippingAddressRepository$ShippingAddressResult instanceof ShippingAddressRepository$ShippingAddressResult.Success ? (ShippingAddressRepository$ShippingAddressResult.Success) shippingAddressRepository$ShippingAddressResult : null;
                    ShippingAddress shippingAddress = success != null ? success.shippingAddress : null;
                    Analytics analytics2 = shoppingSettingsAutofillPresenter.analytics;
                    Boolean bool = (Boolean) mutableState2.getValue();
                    bool.getClass();
                    if (Intrinsics.areEqual(shoppingSettingsAutofillViewEvent, addAddressClicked)) {
                        autofillDetailsOrigin = AutofillDetailsOrigin.AddAutofillInfo;
                    } else {
                        if (!Intrinsics.areEqual(shoppingSettingsAutofillViewEvent, editAddressClicked)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) shoppingSettingsAutofillViewEvent, "Unexpected event: ");
                            return null;
                        }
                        autofillDetailsOrigin = AutofillDetailsOrigin.EditAutofillInfo;
                    }
                    analytics2.track(new ShoppingAutofillDetailsViewOpen(bool, autofillDetailsOrigin, Boolean.valueOf((shippingAddress == null || (fullName3 = shippingAddress.full_name) == null || fullName3.given_name == null || fullName3.family_name == null) ? false : true), Boolean.valueOf((shippingAddress != null ? shippingAddress.email : null) != null), Boolean.valueOf((shippingAddress != null ? shippingAddress.phone : null) != null), Boolean.valueOf((shippingAddress == null || (globalAddress2 = shippingAddress.global_address) == null || globalAddress2.address_line_1 == null || globalAddress2.locality == null) ? false : true)), null);
                    screenNavigator2.goTo(new ArcadeAutofillSettingsScreen(shippingAddress != null ? shippingAddress.id : null, (shippingAddress == null || (fullName2 = shippingAddress.full_name) == null) ? null : fullName2.given_name, (shippingAddress == null || (fullName = shippingAddress.full_name) == null) ? null : fullName.family_name, shippingAddress != null ? shippingAddress.email : null, shippingAddress != null ? shippingAddress.phone : null, (shippingAddress == null || (globalAddress = shippingAddress.global_address) == null) ? new GlobalAddress(null, null, null, null, null, null, null, null, 4194303) : globalAddress));
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState3 = (MutableState) obj6;
                MutableState mutableState4 = (MutableState) obj5;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                Analytics analytics3 = (Analytics) poolsListPresenter.analytics;
                SupportChatScreens.SupportChatSheets.ChatExitPromptSheet chatExitPromptSheet = (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet) poolsListPresenter.args;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                ChatExitPromptSheetViewEvents chatExitPromptSheetViewEvents = (ChatExitPromptSheetViewEvents) obj;
                if (Intrinsics.areEqual(chatExitPromptSheetViewEvents, ChatExitPromptSheetViewEvents.EndConversation.INSTANCE)) {
                    analytics3.track(new CustomerSupportChatSelectExitAction(CustomerSupportChatSelectExitAction.Action.END, chatExitPromptSheet.flowToken), null);
                    mutableState4.setValue(ChatExitPromptSheetState.Loading.INSTANCE);
                    JobKt.launch$default(coroutineScope3, null, null, new TaxWebAppPresenter$models$1$1(poolsListPresenter, new ShiftNotePresenter$models$1$1(9, mutableState3), new ShiftNotePresenter$models$1$1(8, mutableState4), (Continuation) null), 3);
                } else if (Intrinsics.areEqual(chatExitPromptSheetViewEvents, ChatExitPromptSheetViewEvents.SaveAndContinue.INSTANCE)) {
                    analytics3.track(new CustomerSupportChatSelectExitAction(CustomerSupportChatSelectExitAction.Action.CONTINUE, chatExitPromptSheet.flowToken), null);
                    screenNavigator3.giveAnswer(chatExitPromptSheet.question, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue.INSTANCE);
                } else if (Intrinsics.areEqual(chatExitPromptSheetViewEvents, ChatExitPromptSheetViewEvents.Close.INSTANCE)) {
                    screenNavigator3.goTo(back);
                } else {
                    if (!(chatExitPromptSheetViewEvents instanceof ChatExitPromptSheetViewEvents.SurveyEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ChatSurveyViewEvent chatSurveyViewEvent = ((ChatExitPromptSheetViewEvents.SurveyEvent) chatExitPromptSheetViewEvents).event;
                    ChatExitPromptSheetState chatExitPromptSheetState = (ChatExitPromptSheetState) mutableState4.getValue();
                    ChatSurveyViewModel chatSurveyViewModel = (ChatSurveyViewModel) mutableState3.getValue();
                    if (chatSurveyViewEvent instanceof ChatSurveyViewEvent.ChangeRating) {
                        if (chatSurveyViewModel instanceof ChatSurveyViewModel.Loaded) {
                            mutableState3.setValue(ChatSurveyViewModel.Loaded.copy$default((ChatSurveyViewModel.Loaded) chatSurveyViewModel, Integer.valueOf(((ChatSurveyViewEvent.ChangeRating) chatSurveyViewEvent).rating)));
                        }
                    } else if (chatSurveyViewEvent instanceof ChatSurveyViewEvent.Submit) {
                        if ((chatExitPromptSheetState instanceof ChatExitPromptSheetState.ShowSurvey) && (chatSurveyViewModel instanceof ChatSurveyViewModel.Loaded)) {
                            String str6 = ((ChatExitPromptSheetState.ShowSurvey) chatExitPromptSheetState).surveyToken;
                            Integer num2 = ((ChatSurveyViewModel.Loaded) chatSurveyViewModel).selectedOption;
                            ChatSurveyResponse chatSurveyResponse = new ChatSurveyResponse(str6, Boolean.valueOf(((ChatSurveyViewEvent.Submit) chatSurveyViewEvent).issueResolved), num2 != null ? num2.intValue() : 0, 20);
                            GridLayout.Alignment.logAnswerChanges(analytics3, new ChatSurveyResponse(str6, null, 0, 30), chatSurveyResponse);
                            mutableState3.setValue(ChatSurveyViewModel.Complete.INSTANCE);
                            JobKt.launch$default(coroutineScope3, null, null, new ProfileCropView.AnonymousClass3(poolsListPresenter, chatSurveyResponse, null, 28), 3);
                        }
                    } else {
                        if (!Intrinsics.areEqual(chatSurveyViewEvent, ChatSurveyViewEvent.Close.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (!(chatSurveyViewModel instanceof ChatSurveyViewModel.Complete) && (chatExitPromptSheetState instanceof ChatExitPromptSheetState.ShowSurvey)) {
                            analytics3.track(new CustomerSupportReviewDismiss(((ChatExitPromptSheetState.ShowSurvey) chatExitPromptSheetState).surveyToken), null);
                        }
                        screenNavigator3.giveAnswer(chatExitPromptSheet.question, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) workHomePresenter2.youPresenter;
                SupportScreens.ContactScreens.ContactSupportEmailInputScreen contactSupportEmailInputScreen = (SupportScreens.ContactScreens.ContactSupportEmailInputScreen) workHomePresenter2.payPresenter;
                MutableState mutableState5 = (MutableState) obj5;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj4;
                ContactSupportEmailInputViewEvent contactSupportEmailInputViewEvent = (ContactSupportEmailInputViewEvent) obj;
                boolean areEqual2 = Intrinsics.areEqual(contactSupportEmailInputViewEvent, ContactSupportEmailInputViewEvent.EditEmail.INSTANCE);
                ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Editing editing = ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Editing.INSTANCE;
                if (areEqual2) {
                    mutableState5.setValue(new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit(editing));
                } else if (contactSupportEmailInputViewEvent instanceof ContactSupportEmailInputViewEvent.UpdateEmailText) {
                    ((MutableState) obj6).setValue(((ContactSupportEmailInputViewEvent.UpdateEmailText) contactSupportEmailInputViewEvent).email);
                } else if (contactSupportEmailInputViewEvent instanceof ContactSupportEmailInputViewEvent.ConfirmEmail) {
                    Analytics analytics4 = (Analytics) workHomePresenter2.shiftsAnalytics;
                    SupportScreens.ContactScreens.Data data = contactSupportEmailInputScreen.data;
                    data.getClass();
                    analytics4.track(new CustomerSupportContactSubmitContact(zzpd.toChannel(data.contactOption), data.flowToken), null);
                    if (((ContactSupportEmailInputViewModel$Loaded.ViewMode) mutableState5.getValue()) instanceof ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit) {
                        mutableState5.setValue(new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit(ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Verifying.INSTANCE));
                        JobKt.launch$default(coroutineScope4, null, null, new TaxWebAppPresenter$models$1$1(workHomePresenter2, contactSupportEmailInputViewEvent, (MutableState) obj6, mutableState5, (Continuation) null, 14), 3);
                    } else {
                        screenNavigator4.goTo(new SupportScreens.ContactScreens.ContactSupportMessageScreen(SupportScreens.ContactScreens.Data.copy$default(contactSupportEmailInputScreen.data, new RedactedString(((ContactSupportEmailInputViewEvent.ConfirmEmail) contactSupportEmailInputViewEvent).email), null, 447)));
                    }
                } else if (Intrinsics.areEqual(contactSupportEmailInputViewEvent, ContactSupportEmailInputViewEvent.ExitFlow.INSTANCE)) {
                    screenNavigator4.goTo(contactSupportEmailInputScreen.data.exitScreen);
                } else {
                    if (!Intrinsics.areEqual(contactSupportEmailInputViewEvent, ContactSupportEmailInputViewEvent.DismissModal.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState5.setValue(new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit(editing));
                }
                return Unit.INSTANCE;
            case 9:
                MutableState mutableState6 = (MutableState) obj6;
                MutableState mutableState7 = (MutableState) obj5;
                PhoneVerificationPresenter phoneVerificationPresenter = (PhoneVerificationPresenter) obj3;
                SupportScreens.PhoneVerificationScreen phoneVerificationScreen = phoneVerificationPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator5 = phoneVerificationPresenter.navigator;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj4;
                PhoneVerificationEvents phoneVerificationEvents = (PhoneVerificationEvents) obj;
                if (Intrinsics.areEqual(phoneVerificationEvents, PhoneVerificationEvents.Close.INSTANCE)) {
                    screenNavigator5.goTo(back);
                } else if (Intrinsics.areEqual(phoneVerificationEvents, PhoneVerificationEvents.Retry.INSTANCE)) {
                    mutableState7.setValue(PhoneVerificationViewModel.Loading.INSTANCE);
                    int intValue = ((Number) mutableState6.getValue()).intValue();
                    mutableState6.setValue(Integer.valueOf(intValue + 1));
                    Okio.boxInt(intValue);
                } else if (Intrinsics.areEqual(phoneVerificationEvents, PhoneVerificationEvents.Verify.INSTANCE)) {
                    String buildInitiationData = ViewBindings.buildInitiationData(Flow$Type.CONFIRM_PHONE_SUPPORT_ATTEMPT_FLOW, new ConfirmPhoneSupportAttemptFlowParameters(phoneVerificationScreen.phoneVerificationId, ByteString.EMPTY));
                    RealRouter realRouter = phoneVerificationPresenter.router;
                    ClientRoute.Flow flow = new ClientRoute.Flow(buildInitiationData);
                    RoutingParams routingParams = new RoutingParams(phoneVerificationPresenter.args, BlockersData.AnalyticsData.Source.SUPPORT_PHONE_VERIFICATION.getAnalyticsName(), null, null, null, null, 508);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(flow, routingParams);
                } else if (Intrinsics.areEqual(phoneVerificationEvents, PhoneVerificationEvents.Reject.INSTANCE)) {
                    JobKt.launch$default(coroutineScope5, null, null, new ArticlePresenter$models$1$1(phoneVerificationPresenter, mutableState7, continuation2, 14), 3);
                } else {
                    if (!(phoneVerificationEvents instanceof PhoneVerificationEvents.LearnMore)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.goTo(new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken(((PhoneVerificationEvents.LearnMore) phoneVerificationEvents).articleToken), new SupportScreens.FlowScreens.Data(phoneVerificationScreen.flowToken, null, null, phoneVerificationScreen, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE), false, 28));
                }
                return Unit.INSTANCE;
            case 10:
                MutableState mutableState8 = (MutableState) obj5;
                State state = (State) obj3;
                MutableState mutableState9 = (MutableState) obj6;
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj4;
                RealScreenshotManager realScreenshotManager = (RealScreenshotManager) pdfPreviewPresenter.launcher;
                Analytics analytics5 = (Analytics) pdfPreviewPresenter.pdfFile$delegate;
                BetterNavigator.ScreenNavigator screenNavigator6 = pdfPreviewPresenter.navigator;
                HCaptcha hCaptcha2 = (HCaptcha) pdfPreviewPresenter.fileProvider;
                SupportScreens.ScreenshotScreen.ScreenshotReviewScreen screenshotReviewScreen = (SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) pdfPreviewPresenter.args;
                ScreenshotReviewViewEvent screenshotReviewViewEvent = (ScreenshotReviewViewEvent) obj;
                boolean areEqual3 = Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.TakeMoreScreenshots.INSTANCE);
                Back back2 = Back.INSTANCE;
                if (areEqual3) {
                    screenNavigator6.goTo(back2);
                    realScreenshotManager.showScreenshotControls(screenshotReviewScreen.screenshotArgs);
                } else {
                    Continuation continuation3 = null;
                    if (Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.SendScreenshots.INSTANCE)) {
                        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = screenshotReviewScreen.screenshotArgs;
                        analytics5.track(new CustomerSupportCaptureSubmit(screenshotArgs.flowToken, screenshotArgs.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs.trigger), new Integer(((ScreenshotManager$ScreenshotState) state.getValue()).screenshotFilePaths.size())), null);
                        int ordinal = screenshotReviewScreen.screenshotArgs.trigger.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                String str7 = screenshotReviewScreen.screenshotArgs.screenshotRequestId;
                                if (str7 != null) {
                                    List list3 = ((ScreenshotManager$ScreenshotState) state.getValue()).screenshotFilePaths;
                                    list3.getClass();
                                    StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) hCaptcha2.internalConfig;
                                    if ((standaloneCoroutine == null || !standaloneCoroutine.isActive()) && !list3.isEmpty()) {
                                        StandaloneCoroutine launch$default = JobKt.launch$default((CoroutineScope) hCaptcha2.onFailureListeners, (CoroutineContext) hCaptcha2.onOpenListeners, null, new RealScreenshotService$uploadAndSendScreenshotBundle$1(hCaptcha2, list3, str7, continuation3, 0), 2);
                                        hCaptcha2.internalConfig = launch$default;
                                        launch$default.invokeOnCompletion(new RealSandboxer$$ExternalSyntheticLambda0(hCaptcha2, 22));
                                    }
                                } else {
                                    CustomerSupportCaptureReceiveError.ErrorType errorType = CustomerSupportCaptureReceiveError.ErrorType.SUBMIT_REQUEST_FAILURE;
                                    SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs2 = screenshotReviewScreen.screenshotArgs;
                                    analytics5.track(new CustomerSupportCaptureReceiveError(errorType, screenshotArgs2.flowToken, screenshotArgs2.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs2.trigger)), null);
                                }
                            } else if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        String str8 = screenshotReviewScreen.screenshotArgs.flowToken;
                        if (str8 != null) {
                            List list4 = ((ScreenshotManager$ScreenshotState) state.getValue()).screenshotFilePaths;
                            list4.getClass();
                            StandaloneCoroutine standaloneCoroutine2 = (StandaloneCoroutine) hCaptcha2.internalConfig;
                            if ((standaloneCoroutine2 == null || !standaloneCoroutine2.isActive()) && !list4.isEmpty()) {
                                StandaloneCoroutine launch$default2 = JobKt.launch$default((CoroutineScope) hCaptcha2.onFailureListeners, (CoroutineContext) hCaptcha2.onOpenListeners, null, new RealScreenshotService$uploadAndSendScreenshotBundle$1(hCaptcha2, list4, str8, continuation3, 1), 2);
                                hCaptcha2.internalConfig = launch$default2;
                                launch$default2.invokeOnCompletion(new RealSandboxer$$ExternalSyntheticLambda0(hCaptcha2, 22));
                            }
                        } else {
                            CustomerSupportCaptureReceiveError.ErrorType errorType2 = CustomerSupportCaptureReceiveError.ErrorType.SUBMIT_REQUEST_FAILURE;
                            SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs3 = screenshotReviewScreen.screenshotArgs;
                            analytics5.track(new CustomerSupportCaptureReceiveError(errorType2, screenshotArgs3.flowToken, screenshotArgs3.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs3.trigger)), null);
                        }
                    } else if (Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.Close.INSTANCE)) {
                        if (FlowKt.asStateFlow((StateFlowImpl) hCaptcha2.captchaVerifier).$$delegate_0.getValue() instanceof ScreenshotService$ServiceState.Succeeded) {
                            PdfPreviewPresenter.access$trackComplete(pdfPreviewPresenter);
                            screenNavigator6.goTo(back2);
                        } else {
                            mutableState8.setValue(new ScreenshotReviewViewModel.Loaded(((ScreenshotReviewViewModel) mutableState8.getValue()).getScreenshotList(), true));
                        }
                    } else if (Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.AbortTakingScreenshots.INSTANCE)) {
                        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs4 = screenshotReviewScreen.screenshotArgs;
                        analytics5.track(new CustomerSupportCaptureCancel(screenshotArgs4.flowToken, screenshotArgs4.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs4.trigger)), null);
                        realScreenshotManager.runWithIoCoroutineScope(new PageTagSlotKt$$ExternalSyntheticLambda0(realScreenshotManager, 1));
                        screenNavigator6.goTo(back2);
                    } else if (Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.Back.INSTANCE)) {
                        if (((String) mutableState9.getValue()) != null) {
                            mutableState9.setValue(null);
                        } else if ((FlowKt.asStateFlow((StateFlowImpl) hCaptcha2.captchaVerifier).$$delegate_0.getValue() instanceof ScreenshotService$ServiceState.Uploading) || (FlowKt.asStateFlow((StateFlowImpl) hCaptcha2.captchaVerifier).$$delegate_0.getValue() instanceof ScreenshotService$ServiceState.Sending)) {
                            StandaloneCoroutine standaloneCoroutine3 = (StandaloneCoroutine) hCaptcha2.internalConfig;
                            if (standaloneCoroutine3 != null) {
                                standaloneCoroutine3.cancel(null);
                            }
                        } else if (FlowKt.asStateFlow((StateFlowImpl) hCaptcha2.captchaVerifier).$$delegate_0.getValue() instanceof ScreenshotService$ServiceState.Succeeded) {
                            PdfPreviewPresenter.access$trackComplete(pdfPreviewPresenter);
                            screenNavigator6.goTo(back2);
                        } else if (FlowKt.asStateFlow((StateFlowImpl) hCaptcha2.captchaVerifier).$$delegate_0.getValue() instanceof ScreenshotService$ServiceState.Failed) {
                            StandaloneCoroutine standaloneCoroutine4 = (StandaloneCoroutine) hCaptcha2.internalConfig;
                            if (standaloneCoroutine4 != null) {
                                standaloneCoroutine4.cancel(null);
                            }
                            StateFlowImpl stateFlowImpl = (StateFlowImpl) hCaptcha2.captchaVerifier;
                            ScreenshotService$ServiceState.StandBy standBy = ScreenshotService$ServiceState.StandBy.INSTANCE;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, standBy);
                        } else {
                            mutableState8.setValue(new ScreenshotReviewViewModel.Loaded(((ScreenshotReviewViewModel) mutableState8.getValue()).getScreenshotList(), true));
                        }
                    } else if (Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.AbortSendingScreenshots.INSTANCE)) {
                        StandaloneCoroutine standaloneCoroutine5 = (StandaloneCoroutine) hCaptcha2.internalConfig;
                        if (standaloneCoroutine5 != null) {
                            standaloneCoroutine5.cancel(null);
                        }
                    } else if (Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.Done.INSTANCE)) {
                        PdfPreviewPresenter.access$trackComplete(pdfPreviewPresenter);
                        int ordinal2 = screenshotReviewScreen.screenshotArgs.trigger.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                screenNavigator6.goTo(back2);
                            } else if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        screenNavigator6.goTo(RealSupportNavigator.startSupportChat$default((RealSupportNavigator) pdfPreviewPresenter.fileSaver, screenshotReviewScreen.screenshotArgs.flowToken, null, back2, SupportNavigator$Source.SCREEN_SHOT, null, null, 50));
                    } else if (screenshotReviewViewEvent instanceof ScreenshotReviewViewEvent.ErrorDisplayed) {
                        StandaloneCoroutine standaloneCoroutine6 = (StandaloneCoroutine) hCaptcha2.internalConfig;
                        if (standaloneCoroutine6 != null) {
                            standaloneCoroutine6.cancel(null);
                        }
                        StateFlowImpl stateFlowImpl2 = (StateFlowImpl) hCaptcha2.captchaVerifier;
                        ScreenshotService$ServiceState.StandBy standBy2 = ScreenshotService$ServiceState.StandBy.INSTANCE;
                        stateFlowImpl2.getClass();
                        stateFlowImpl2.updateState(null, standBy2);
                    } else if (screenshotReviewViewEvent instanceof ScreenshotReviewViewEvent.ViewScreenshot) {
                        mutableState9.setValue(((ScreenshotReviewViewEvent.ViewScreenshot) screenshotReviewViewEvent).screenshotUri);
                        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs5 = screenshotReviewScreen.screenshotArgs;
                        analytics5.track(new CustomerSupportCaptureViewScreenshot(screenshotArgs5.flowToken, screenshotArgs5.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs5.trigger)), null);
                    } else if (screenshotReviewViewEvent instanceof ScreenshotReviewViewEvent.RemoveScreenshot) {
                        String str9 = ((ScreenshotReviewViewEvent.RemoveScreenshot) screenshotReviewViewEvent).screenshotUri;
                        str9.getClass();
                        realScreenshotManager.runWithIoCoroutineScope(new TaxWebAppBridge$$ExternalSyntheticLambda0(5, str9, realScreenshotManager));
                        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs6 = screenshotReviewScreen.screenshotArgs;
                        analytics5.track(new CustomerSupportCaptureRemoveScreenshot(screenshotArgs6.flowToken, screenshotArgs6.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs6.trigger)), null);
                    } else {
                        if (!Intrinsics.areEqual(screenshotReviewViewEvent, ScreenshotReviewViewEvent.DismissViewScreenshot.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        mutableState9.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState10 = (MutableState) obj5;
                MutableState mutableState11 = (MutableState) obj6;
                WorkHomePresenter workHomePresenter3 = (WorkHomePresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) workHomePresenter3.youPresenter;
                SupportScreens.FlowScreens.SupportDisputeTrackerScreen supportDisputeTrackerScreen = (SupportScreens.FlowScreens.SupportDisputeTrackerScreen) workHomePresenter3.payPresenter;
                Analytics analytics6 = (Analytics) workHomePresenter3.shiftSection2Presenter;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj4;
                SupportDisputeTrackerViewEvent supportDisputeTrackerViewEvent = (SupportDisputeTrackerViewEvent) obj;
                if (supportDisputeTrackerViewEvent instanceof SupportDisputeTrackerViewEvent.TransactionClicked) {
                    DisputeRow disputeRow = ((SupportDisputeTrackerViewEvent.TransactionClicked) supportDisputeTrackerViewEvent).transaction;
                    String str10 = disputeRow.transactionToken;
                    supportDisputeTrackerScreen.getClass();
                    str10.getClass();
                    analytics6.track(new DisputesHistoryTapOpenReceipt(supportDisputeTrackerScreen.data.flowToken, str10), null);
                    screenNavigator7.goTo(new HistoryScreens.PaymentReceipt(disputeRow.transactionToken, null, null, ActivityScope.SUPPORT_TRANSACTION, null, 52));
                } else if (supportDisputeTrackerViewEvent instanceof SupportDisputeTrackerViewEvent.GoBack) {
                    screenNavigator7.goTo(back);
                } else {
                    if (!(supportDisputeTrackerViewEvent instanceof SupportDisputeTrackerViewEvent.ScrollToBottom)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str11 = ((RealDisputesTrackerService) workHomePresenter3.shiftsAnalytics).nextPageOffset;
                    if (str11 == null || str11.length() == 0) {
                        DisputesTrackerService$DisputeTrackerResult disputesTrackerService$DisputeTrackerResult = (DisputesTrackerService$DisputeTrackerResult) mutableState10.getValue();
                        DisputesTrackerService$DisputeTrackerResult.Success success2 = disputesTrackerService$DisputeTrackerResult instanceof DisputesTrackerService$DisputeTrackerResult.Success ? (DisputesTrackerService$DisputeTrackerResult.Success) disputesTrackerService$DisputeTrackerResult : null;
                        ArrayList buildDisputes = success2 != null ? workHomePresenter3.buildDisputes(success2) : null;
                        supportDisputeTrackerScreen.getClass();
                        analytics6.track(new DisputesHistoryViewReachEnd(buildDisputes != null ? CollectionsKt.joinToString$default(buildDisputes, ",", null, null, 0, null, new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(8), 30) : null, supportDisputeTrackerScreen.data.flowToken), null);
                    } else if (!((Boolean) mutableState11.getValue()).booleanValue()) {
                        mutableState11.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope6, null, null, new SupportDisputeTrackerPresenter$models$1$1(workHomePresenter3, mutableState10, mutableState11, null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState12 = (MutableState) obj5;
                WorkHomePresenter workHomePresenter4 = (WorkHomePresenter) obj3;
                CoroutineScope coroutineScope7 = (CoroutineScope) obj4;
                TapToPayInitiatorNotesViewEvent tapToPayInitiatorNotesViewEvent = (TapToPayInitiatorNotesViewEvent) obj;
                if (tapToPayInitiatorNotesViewEvent instanceof TapToPayInitiatorNotesViewEvent.Back) {
                    ((BetterNavigator.ScreenNavigator) workHomePresenter4.youPresenter).goTo(back);
                } else if (tapToPayInitiatorNotesViewEvent instanceof TapToPayInitiatorNotesViewEvent.Next) {
                    if (((String) mutableState12.getValue()).length() <= 0) {
                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                        return null;
                    }
                    JobKt.launch$default(coroutineScope7, null, null, new TapToPayInitiatorNotesPresenter$models$1$1(workHomePresenter4, (TapToPayPaymentData) obj6, null, 1), 3);
                    JobKt.launch$default(coroutineScope7, null, null, new TaxWebAppBridge.AnonymousClass3(workHomePresenter4, mutableState12, (Continuation) null, 3), 3);
                } else {
                    if (!(tapToPayInitiatorNotesViewEvent instanceof TapToPayInitiatorNotesViewEvent.TextInput)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState12.setValue(((TapToPayInitiatorNotesViewEvent.TextInput) tapToPayInitiatorNotesViewEvent).input);
                }
                return Unit.INSTANCE;
            case 13:
                return emit$com$squareup$cash$tax$presenters$TaxWebAppPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 14:
                MutableState mutableState13 = (MutableState) obj6;
                MutableState mutableState14 = (MutableState) obj5;
                InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator8 = instrumentDetailsPresenter.navigator;
                BalanceBasedAutoReloadConfirmationViewEvent balanceBasedAutoReloadConfirmationViewEvent = (BalanceBasedAutoReloadConfirmationViewEvent) obj;
                if (Intrinsics.areEqual(balanceBasedAutoReloadConfirmationViewEvent, BalanceBasedAutoReloadConfirmationViewEvent.Close.INSTANCE)) {
                    BlockersData blockersData = ((BalanceBasedAutoReloadConfirmationScreen) instrumentDetailsPresenter.ioDispatcher).blockersData;
                    screenNavigator8.goTo(new RecurringReloadsDismissDialogScreen(blockersData.exitScreen, blockersData, RecurringReloadOptionScreen.ReloadType.BALANCE_BASED));
                } else if (Intrinsics.areEqual(balanceBasedAutoReloadConfirmationViewEvent, BalanceBasedAutoReloadConfirmationViewEvent.ConfirmClicked.INSTANCE)) {
                    ((MutableState) obj3).setValue(Boolean.TRUE);
                } else if (Intrinsics.areEqual(balanceBasedAutoReloadConfirmationViewEvent, BalanceBasedAutoReloadConfirmationViewEvent.IncrementAmountClicked.INSTANCE)) {
                    instrumentDetailsPresenter.openRecurringReloadConfiguration((Money) mutableState14.getValue(), null, true);
                } else if (Intrinsics.areEqual(balanceBasedAutoReloadConfirmationViewEvent, BalanceBasedAutoReloadConfirmationViewEvent.MinimumBalanceClicked.INSTANCE)) {
                    instrumentDetailsPresenter.openRecurringReloadConfiguration(null, (Money) mutableState13.getValue(), false);
                } else if (Intrinsics.areEqual(balanceBasedAutoReloadConfirmationViewEvent, BalanceBasedAutoReloadConfirmationViewEvent.InstrumentCellTapped.INSTANCE)) {
                    screenNavigator8.goTo(RecurringReloadsChangeInstrumentScreen.INSTANCE);
                } else {
                    if (!(balanceBasedAutoReloadConfirmationViewEvent instanceof BalanceBasedAutoReloadConfirmationViewEvent.EnterTransitionComplete)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BalanceBasedAutoReloadConfirmationScreen.ConfirmationData confirmationData = ((BalanceBasedAutoReloadConfirmationScreen) instrumentDetailsPresenter.ioDispatcher).confirmationData;
                    if (confirmationData.incrementAmountConfig.autoOpen) {
                        instrumentDetailsPresenter.openRecurringReloadConfiguration((Money) mutableState14.getValue(), null, true);
                    } else if (confirmationData.minimumBalanceConfig.autoOpen) {
                        instrumentDetailsPresenter.openRecurringReloadConfiguration(null, (Money) mutableState13.getValue(), false);
                    }
                }
                return Unit.INSTANCE;
            case 15:
                return emit$com$squareup$cash$wallet$presenters$WalletHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 16:
                return emit$com$squareup$cash$work$data$real$RealShiftDataLoader$state_delegate$lambda$0$0$$inlined$map$1$2(obj, continuation);
            case 17:
                return emit$com$squareup$cash$work$presenters$shift$ShiftNotePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                TakeBreakBottomSheetViewEvent takeBreakBottomSheetViewEvent = (TakeBreakBottomSheetViewEvent) obj;
                MerchantIdentifier merchantIdentifier = (MerchantIdentifier) ((State) obj6).getValue();
                if (merchantIdentifier != null && (str = merchantIdentifier.token) != null) {
                    PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) obj4;
                    AskedQuestion askedQuestion = (AskedQuestion) obj3;
                    CoroutineScope coroutineScope8 = (CoroutineScope) obj5;
                    if (Intrinsics.areEqual(takeBreakBottomSheetViewEvent, TakeBreakBottomSheetViewEvent.Dismiss.INSTANCE)) {
                        BetterNavigator.ScreenNavigator screenNavigator9 = pdfPreviewPresenter2.navigator;
                        if (askedQuestion != null) {
                            screenNavigator9.giveAnswer(askedQuestion, TakeBreakResult$Cancelled.INSTANCE);
                        } else {
                            screenNavigator9.goTo(back);
                        }
                    } else {
                        if (!(takeBreakBottomSheetViewEvent instanceof TakeBreakBottomSheetViewEvent.BreakSelected)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        TakeBreakBottomSheetViewEvent.BreakSelected breakSelected = (TakeBreakBottomSheetViewEvent.BreakSelected) takeBreakBottomSheetViewEvent;
                        Iterator it = ((TakeBreakBottomSheetScreen) pdfPreviewPresenter2.args).breaks.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (Intrinsics.areEqual(((TakeBreakBottomSheetScreen.BreakInfo) obj2).token, breakSelected.token)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        JobKt.launch$default(coroutineScope8, null, null, new WorkflowLayout$start$1(pdfPreviewPresenter2, str, breakSelected, (TakeBreakBottomSheetScreen.BreakInfo) obj2, askedQuestion, null, 21), 3);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ChannelFlowMerge$collectTo$2(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, State state, int i) {
        this.$r8$classId = i;
        this.$job = obj;
        this.$semaphore = obj2;
        this.$scope = obj3;
        this.$collector = state;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Flow flow, Continuation continuation) {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        int i;
        SemaphoreImpl semaphoreImpl = (SemaphoreImpl) this.$semaphore;
        if (continuation instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) continuation;
            int i2 = channelFlowMerge$collectTo$2$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                channelFlowMerge$collectTo$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = channelFlowMerge$collectTo$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelFlowMerge$collectTo$2$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = (Job) this.$job;
                    if (job != null && !job.isActive()) {
                        throw job.getCancellationException();
                    }
                    channelFlowMerge$collectTo$2$emit$1.L$0 = flow;
                    channelFlowMerge$collectTo$2$emit$1.label = 1;
                    if (semaphoreImpl.acquire(channelFlowMerge$collectTo$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flow = channelFlowMerge$collectTo$2$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.launch$default((ProducerScope) this.$scope, null, null, new Logger$log$1(flow, (SendingCollector) this.$collector, semaphoreImpl, (Continuation) null, 26), 3);
                return Unit.INSTANCE;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        Object obj2 = channelFlowMerge$collectTo$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelFlowMerge$collectTo$2$emit$1.label;
        if (i != 0) {
        }
        JobKt.launch$default((ProducerScope) this.$scope, null, null, new Logger$log$1(flow, (SendingCollector) this.$collector, semaphoreImpl, (Continuation) null, 26), 3);
        return Unit.INSTANCE;
    }
}
