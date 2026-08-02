package com.squareup.util.coroutines;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.appwidget.AppWidgetId;
import androidx.lifecycle.LiveDataScopeImpl;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavBackStackEntry;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.paging.PageFetcher$flow$1;
import androidx.paging.PagingData;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.redwood.treehouse.SequentialStateFlow$collect$2;
import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.maps.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$copyDatabase$3;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3;
import com.squareup.cash.card.onboarding.ListIndices;
import com.squareup.cash.cdf.balancebasedaddcash.BalanceBasedAddCashEditAmountExpand;
import com.squareup.cash.cdf.balancebasedaddcash.BalanceBasedAddCashEditAmountSave;
import com.squareup.cash.cdf.balancebasedaddcash.EditAmountMethod;
import com.squareup.cash.cdf.balancebasedaddcash.EditAmountOption;
import com.squareup.cash.cdf.cashcard.CashCardNextUpClick;
import com.squareup.cash.cdf.cashcard.CashCardNextUpDismiss;
import com.squareup.cash.cdf.cashcard.CashCardNextUpView;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneCallAgain;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneDismissStatus;
import com.squareup.cash.cdf.minttag.DeviceType;
import com.squareup.cash.cdf.minttag.LifecycleState;
import com.squareup.cash.cdf.minttag.MintTagStateViewed;
import com.squareup.cash.cdf.notificationssettings.ConfirmationSheetOrigin;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetCopyCashtagLink;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetMore;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetSaveToPhotos;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetSms;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addSmsTarget$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$download$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetViewEvent;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult;
import com.squareup.cash.sharesheet.ShareableAssetsManager$DownloadedImage;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$Companion$FillType;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.viewmodels.FooterButtonStyle;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewEvent;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewEvent;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$models$2$1;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$models$4$3$1;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewEvent$Close;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transactionpicker.presenters.RealTransactionLoader$getTransactions$$inlined$map$1$2$1;
import com.squareup.cash.transactionpicker.presenters.RealTransactionLoader$getTransactions$$inlined$map$2$2$1;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.presenters.RecurringReloadConfigurationPresenter;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationResult;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.backend.api.WalletAnalyticsHelper$Flow;
import com.squareup.cash.wallet.backend.real.RealWalletAnalyticsHelper;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$2$1;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.wallet.presenters.RealNextUpCandidateDismisser;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.NextUpDismissMethod;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$DataState;
import com.squareup.cash.work.viewmodels.PayHistoryListViewEvent;
import com.squareup.cash.work.webview.screens.WorkWebKey;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewEvent;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionPreload;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardModule$CardElementAction$Type$DoClientRoute;
import com.squareup.protos.cash.postcard.CardModule$CardElementAction$Type$DoClientScenario;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowEndResult;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.android.Toaster$Length;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.workflow1.TimerWorker$run$1;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.lite.repository.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.utils.HostedAuthUrlBuilder;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.StripeTransaction;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import net.idrnd.misnap.iad.Payload;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class BufferCountKt$bufferSkip$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $this_bufferSkip;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCountKt$bufferSkip$1(LazyListState lazyListState, int i, MutableState mutableState, MutableState mutableState2, ListIndices listIndices, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.L$1 = lazyListState;
        this.label = i;
        this.L$4 = mutableState;
        this.L$0 = mutableState2;
        this.$this_bufferSkip = listIndices;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$1 = new BufferCountKt$bufferSkip$1((SupportHomePresenter$models$lambda$5$$inlined$map$1) this.$this_bufferSkip, continuation);
                bufferCountKt$bufferSkip$1.L$0 = obj;
                return bufferCountKt$bufferSkip$1;
            case 1:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$12 = new BufferCountKt$bufferSkip$1((CashQrWidgetReceiver) this.L$1, (Context) this.L$4, this.label, (Bundle) this.$this_bufferSkip, continuation, 1);
                bufferCountKt$bufferSkip$12.L$0 = obj;
                return bufferCountKt$bufferSkip$12;
            case 2:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$13 = new BufferCountKt$bufferSkip$1((CashQrWidgetReceiver) this.L$1, (Context) this.L$4, this.label, (String) this.$this_bufferSkip, continuation, 2);
                bufferCountKt$bufferSkip$13.L$0 = obj;
                return bufferCountKt$bufferSkip$13;
            case 3:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$14 = new BufferCountKt$bufferSkip$1((ProducerScope) this.L$4, (PasscodeConfirmTypeTransformer) this.$this_bufferSkip, continuation, 3);
                bufferCountKt$bufferSkip$14.L$0 = obj;
                return bufferCountKt$bufferSkip$14;
            case 4:
                return new BufferCountKt$bufferSkip$1((LazyListState) this.L$1, this.label, (MutableState) this.L$4, (MutableState) this.L$0, (ListIndices) this.$this_bufferSkip, continuation);
            case 5:
                return new BufferCountKt$bufferSkip$1((Animatable) this.L$1, (ArrayList) this.L$4, this.label, (SpringSpec) this.L$0, (float[]) this.$this_bufferSkip, continuation, 5);
            case 6:
                return new BufferCountKt$bufferSkip$1((OffersTabHomeResponse) this.L$0, (RealOffersTabRepository) this.$this_bufferSkip, continuation);
            case 7:
                return new BufferCountKt$bufferSkip$1((PagerState) this.L$1, (Function1) this.L$4, this.label, (MutableState) this.L$0, (MutableState) this.$this_bufferSkip, continuation, 7);
            case 8:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$15 = new BufferCountKt$bufferSkip$1((List) this.L$1, continuation, (ProfileNotificationsPresenter) this.L$4);
                bufferCountKt$bufferSkip$15.L$0 = obj;
                return bufferCountKt$bufferSkip$15;
            case 9:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$16 = new BufferCountKt$bufferSkip$1((PartnerAuthViewModel) this.L$4, (SharedPartnerAuthState) this.$this_bufferSkip, continuation, 9);
                bufferCountKt$bufferSkip$16.L$0 = obj;
                return bufferCountKt$bufferSkip$16;
            case 10:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$17 = new BufferCountKt$bufferSkip$1((FinancialConnectionsLiteViewModel) this.L$4, (String) this.$this_bufferSkip, continuation, 10);
                bufferCountKt$bufferSkip$17.L$0 = obj;
                return bufferCountKt$bufferSkip$17;
            case 11:
                return new BufferCountKt$bufferSkip$1((StripeTransaction) this.L$1, (Stripe3ds2Fingerprint) this.L$4, this.label, (Stripe3ds2TransactionViewModel) this.L$0, (ApiRequest.Options) this.$this_bufferSkip, continuation, 11);
            case 12:
                return new BufferCountKt$bufferSkip$1((Stripe3ds2AuthResult.Ares) this.L$1, (StripeTransaction) this.L$4, this.label, (Stripe3ds2TransactionViewModel) this.L$0, (String) this.$this_bufferSkip, continuation, 12);
            default:
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$18 = new BufferCountKt$bufferSkip$1((ChallengeActivityViewModel) this.L$4, (ChallengeResponseData.Image) this.$this_bufferSkip, this.label, continuation);
                bufferCountKt$bufferSkip$18.L$0 = obj;
                return bufferCountKt$bufferSkip$18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((BufferCountKt$bufferSkip$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((BufferCountKt$bufferSkip$1) create((PasscodeViewEvent.VerifyPasscode) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((BufferCountKt$bufferSkip$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((BufferCountKt$bufferSkip$1) create((LiveDataScopeImpl) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026e, code lost:
    
        if (r1.emit(r3, r25) == r0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0325, code lost:
    
        if (r1 == r5) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        if (r0 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06d7, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r13)._channel.send(r0, r25) != r9) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0684, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r13)._channel.send(com.squareup.cash.blockers.viewmodels.PasscodeViewModel.VerifyPasscodeModel.PasscodeVerificationFailed.INSTANCE, r25) == r9) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0658, code lost:
    
        if (r0 == r9) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x062e, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r13)._channel.send(com.squareup.cash.blockers.viewmodels.PasscodeViewModel.VerifyPasscodeModel.VerifyingPasscode.INSTANCE, r25) == r9) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if (r3 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018d, code lost:
    
        if (r1 == r0) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x086b A[Catch: all -> 0x082a, TRY_LEAVE, TryCatch #2 {all -> 0x082a, blocks: (B:422:0x0825, B:425:0x0865, B:427:0x086b, B:440:0x0835, B:442:0x085f, B:444:0x0847), top: B:416:0x0814 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v21, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v46, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Iterator it;
        int i2;
        Object obj2;
        BlockersScreens.PasscodeScreen passcodeScreen;
        BlockersDataNavigator blockersDataNavigator;
        BetterNavigator.ScreenNavigator screenNavigator;
        Object trackBlockerSubmissionAnalytics$default;
        ConfirmPasscodeResponse confirmPasscodeResponse;
        ConfirmPasscodeResponse confirmPasscodeResponse2;
        int i3;
        ?? r1;
        RealOffersTabRepository realOffersTabRepository;
        Iterator it2;
        int i4;
        List list;
        Object obj3;
        int i5;
        List list2;
        Iterator it3;
        Object obj4;
        List list3;
        boolean z;
        Iterator it4;
        Object obj5;
        List list4;
        Object value;
        Object invoke$default;
        PartnerAuthViewModel partnerAuthViewModel;
        Object invoke;
        Object failure;
        Object m3758synchronize0E7RQCE;
        FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel;
        Object value2;
        Object withContext;
        Object obj6;
        String str;
        Object withContext2;
        Object obj7;
        int i6 = 5;
        int i7 = 0;
        int i8 = 2;
        int i9 = 1;
        ?? r12 = 0;
        r12 = 0;
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        arrayDeque = new ArrayDeque();
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        SupportHomePresenter$models$lambda$5$$inlined$map$1 supportHomePresenter$models$lambda$5$$inlined$map$1 = (SupportHomePresenter$models$lambda$5$$inlined$map$1) this.$this_bufferSkip;
                        i = 0;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, ref$IntRef, arrayDeque, flowCollector);
                        this.L$0 = flowCollector;
                        this.L$1 = arrayDeque;
                        this.label = 1;
                        if (supportHomePresenter$models$lambda$5$$inlined$map$1.collect(anonymousClass1, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i11 = this.I$0;
                            it = (Iterator) this.L$4;
                            arrayDeque = (ArrayDeque) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            i2 = i11;
                            while (it.hasNext()) {
                                List list5 = CollectionsKt.toList((List) it.next());
                                this.L$0 = flowCollector;
                                this.L$1 = arrayDeque;
                                this.L$4 = it;
                                this.I$0 = i2;
                                this.label = 2;
                                if (flowCollector.emit(list5, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            arrayDeque.clear();
                            return Unit.INSTANCE;
                        }
                        arrayDeque = (ArrayDeque) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        i = 0;
                    }
                    it = arrayDeque.iterator();
                    i2 = i;
                    while (it.hasNext()) {
                    }
                    arrayDeque.clear();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    arrayDeque.clear();
                    throw th;
                }
            case 1:
                CashQrWidgetReceiver cashQrWidgetReceiver = (CashQrWidgetReceiver) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.I$0;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default((CoroutineScope) this.L$0, null, null, new PageFetcher$flow$1((Context) this.L$4, cashQrWidgetReceiver, null, 11), 3);
                    CashQrWidget cashQrWidget = cashQrWidgetReceiver.glanceAppWidget;
                    Context context = (Context) this.L$4;
                    int i13 = this.label;
                    Bundle bundle = (Bundle) this.$this_bufferSkip;
                    this.I$0 = 1;
                    if (cashQrWidget.sizeMode == null) {
                        obj2 = cashQrWidget.sessionManager.runWithLock(new NetworkFetcher$doFetch$fetchResult$1(context, new AppWidgetId(i13), cashQrWidget, bundle, new CachedPagingDataKt$cachedIn$2(bundle, (Continuation) r12, i8), (Continuation) null, 4), this);
                        if (obj2 != coroutineSingletons2) {
                            obj2 = Unit.INSTANCE;
                        }
                        if (obj2 != coroutineSingletons2) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CashQrWidgetReceiver cashQrWidgetReceiver2 = (CashQrWidgetReceiver) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.I$0;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default((CoroutineScope) this.L$0, null, null, new PageFetcher$flow$1((Context) this.L$4, cashQrWidgetReceiver2, null, 11), 3);
                    CashQrWidget cashQrWidget2 = cashQrWidgetReceiver2.glanceAppWidget;
                    Context context2 = (Context) this.L$4;
                    int i15 = this.label;
                    String str2 = (String) this.$this_bufferSkip;
                    this.I$0 = 1;
                    cashQrWidget2.getClass();
                    Object runWithLock = cashQrWidget2.sessionManager.runWithLock(new NetworkFetcher$doFetch$fetchResult$1(context2, new AppWidgetId(i15), cashQrWidget2, (Object) null, new CachedPagingDataKt$cachedIn$2(str2, (Continuation) r12, 3), (Continuation) null, 4), this);
                    if (runWithLock != coroutineSingletons3) {
                        runWithLock = Unit.INSTANCE;
                    }
                    if (runWithLock != coroutineSingletons3) {
                        runWithLock = Unit.INSTANCE;
                    }
                    if (runWithLock == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                ProducerScope producerScope = (ProducerScope) this.L$4;
                PasscodeConfirmTypeTransformer passcodeConfirmTypeTransformer = (PasscodeConfirmTypeTransformer) this.$this_bufferSkip;
                AndroidBiometricsStore androidBiometricsStore = passcodeConfirmTypeTransformer.biometricsStore;
                BlockersDataNavigator blockersDataNavigator2 = passcodeConfirmTypeTransformer.blockersNavigator;
                AndroidStringManager androidStringManager = passcodeConfirmTypeTransformer.stringManager;
                BetterNavigator.ScreenNavigator screenNavigator2 = passcodeConfirmTypeTransformer.navigator;
                BlockersScreens.PasscodeScreen passcodeScreen2 = passcodeConfirmTypeTransformer.args;
                PasscodeViewEvent.VerifyPasscode verifyPasscode = (PasscodeViewEvent.VerifyPasscode) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = verifyPasscode;
                        this.label = 1;
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        Analytics analytics = passcodeConfirmTypeTransformer.analytics;
                        BlockersData blockersData = passcodeScreen2.blockersData;
                        MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(15);
                        passcodeScreen = passcodeScreen2;
                        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(passcodeConfirmTypeTransformer, verifyPasscode, r12, 21);
                        this.L$0 = verifyPasscode;
                        this.label = 2;
                        blockersDataNavigator = blockersDataNavigator2;
                        screenNavigator = screenNavigator2;
                        trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, this, moveBitcoinViewKt$$ExternalSyntheticLambda3, pagingDataPresenter$collectFrom$2);
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        blockersDataNavigator = blockersDataNavigator2;
                        screenNavigator = screenNavigator2;
                        passcodeScreen = passcodeScreen2;
                        trackBlockerSubmissionAnalytics$default = obj;
                        ApiResult apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
                        if (apiResult instanceof ApiResult.Failure) {
                            screenNavigator.goTo(new FailureMessageBlockerScreen(passcodeScreen.blockersData, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, r12, 4));
                            this.L$0 = null;
                            this.label = 3;
                            break;
                        } else {
                            if (!(apiResult instanceof ApiResult.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            boolean z2 = verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint;
                            confirmPasscodeResponse = (ConfirmPasscodeResponse) ((ApiResult.Success) apiResult).response;
                            ConfirmPasscodeResponse.Status status = confirmPasscodeResponse.status;
                            if (status == null) {
                                status = ProtoDefaults.CONFIRM_PASSCODE_STATUS;
                            }
                            switch (status.ordinal()) {
                                case 0:
                                    return Unit.INSTANCE;
                                case 1:
                                    passcodeConfirmTypeTransformer.appLockState.sendEvent(RealAppLockState.AppLockEvent.AppUnlocked.INSTANCE);
                                    String str3 = passcodeScreen.verificationInstrumentToken;
                                    if (str3 != null && !z2) {
                                        String str4 = confirmPasscodeResponse.passcode_token;
                                        this.L$0 = null;
                                        this.L$1 = confirmPasscodeResponse;
                                        this.I$0 = z2 ? 1 : 0;
                                        this.label = 4;
                                        if (androidBiometricsStore.write(str3, str4, this) != coroutineSingletons4) {
                                            confirmPasscodeResponse2 = confirmPasscodeResponse;
                                            confirmPasscodeResponse = confirmPasscodeResponse2;
                                        }
                                        return coroutineSingletons4;
                                    }
                                    BlockersData blockersData2 = passcodeScreen.blockersData;
                                    ResponseContext responseContext = confirmPasscodeResponse.response_context;
                                    responseContext.getClass();
                                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                                    screenNavigator.goTo(blockersDataNavigator.getNext(passcodeScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                                    return Unit.INSTANCE;
                                case 2:
                                case 4:
                                case 5:
                                case 6:
                                    BlockersData blockersData3 = passcodeScreen.blockersData;
                                    ResponseContext responseContext2 = confirmPasscodeResponse.response_context;
                                    responseContext2.getClass();
                                    Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                                    screenNavigator.goTo(blockersDataNavigator.getNext(passcodeScreen, blockersData3.updateFromResponseContext(responseContext2, false)));
                                    return Unit.INSTANCE;
                                case 3:
                                    String str5 = passcodeScreen.verificationInstrumentToken;
                                    r1 = z2;
                                    if (str5 != null) {
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.I$0 = z2 ? 1 : 0;
                                        this.label = 5;
                                        if (androidBiometricsStore.write(str5, null, this) != coroutineSingletons4) {
                                            i3 = z2 ? 1 : 0;
                                            r1 = i3;
                                        }
                                        return coroutineSingletons4;
                                    }
                                    PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode invalidPasscode = new PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode(r1 == 0);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.I$0 = r1;
                                    this.label = 6;
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        }
                    case 3:
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 4:
                        confirmPasscodeResponse2 = (ConfirmPasscodeResponse) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        blockersDataNavigator = blockersDataNavigator2;
                        screenNavigator = screenNavigator2;
                        passcodeScreen = passcodeScreen2;
                        confirmPasscodeResponse = confirmPasscodeResponse2;
                        BlockersData blockersData22 = passcodeScreen.blockersData;
                        ResponseContext responseContext3 = confirmPasscodeResponse.response_context;
                        responseContext3.getClass();
                        Parcelable.Creator<BlockersData> creator3 = BlockersData.CREATOR;
                        screenNavigator.goTo(blockersDataNavigator.getNext(passcodeScreen, blockersData22.updateFromResponseContext(responseContext3, false)));
                        return Unit.INSTANCE;
                    case 5:
                        i3 = this.I$0;
                        SafeTrace.throwOnFailure(obj);
                        r1 = i3;
                        PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode invalidPasscode2 = new PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode(r1 == 0);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = r1;
                        this.label = 6;
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 4:
                LazyListState lazyListState = (LazyListState) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.I$0;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new MoneyTabUIKt$MoneyTabLoaded$1$1$$ExternalSyntheticLambda0(lazyListState, this.label, i9)));
                    MutableState mutableState = (MutableState) this.L$4;
                    CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 = new CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3((MutableState) this.L$0, lazyListState, (ListIndices) this.$this_bufferSkip);
                    this.I$0 = 1;
                    Object collect = distinctUntilChanged.collect(new FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3, mutableState, 4), this);
                    if (collect != coroutineSingletons5) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i17 = this.label;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.I$0;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = (Animatable) this.L$1;
                    Object obj8 = ((ArrayList) this.L$4).get(i17);
                    SpringSpec springSpec = (SpringSpec) this.L$0;
                    Float f = new Float(((float[]) this.$this_bufferSkip)[i17]);
                    this.I$0 = 1;
                    if (Animatable.animateTo$default(animatable, obj8, springSpec, f, null, this, 8) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list6 = ((OffersTabHomeResponse) this.L$0).collections_preload;
                    realOffersTabRepository = (RealOffersTabRepository) this.$this_bufferSkip;
                    it2 = list6.iterator();
                    i4 = 0;
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = this.I$0;
                    it2 = (Iterator) this.L$4;
                    RealOffersTabRepository realOffersTabRepository2 = (RealOffersTabRepository) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    realOffersTabRepository = realOffersTabRepository2;
                }
                while (it2.hasNext()) {
                    OffersTabCollectionPreload offersTabCollectionPreload = (OffersTabCollectionPreload) it2.next();
                    String str6 = offersTabCollectionPreload.collection_token;
                    str6.getClass();
                    OffersTabCollectionResponse offersTabCollectionResponse = offersTabCollectionPreload.collection_response;
                    offersTabCollectionResponse.getClass();
                    this.L$1 = realOffersTabRepository;
                    this.L$4 = it2;
                    this.I$0 = i4;
                    this.label = 1;
                    Object withContext3 = JobKt.withContext(realOffersTabRepository.ioDispatcher, new RealKeyStoreProvider$setEntry$2(17, offersTabCollectionResponse, realOffersTabRepository, str6, (Continuation) null), this);
                    if (withContext3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        withContext3 = Unit.INSTANCE;
                    }
                    if (withContext3 == obj9) {
                        return obj9;
                    }
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.I$0;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new PagerState$$ExternalSyntheticLambda1((PagerState) this.L$1, 8));
                    final Function1 function1 = (Function1) this.L$4;
                    final int i21 = this.label;
                    final MutableState mutableState2 = (MutableState) this.L$0;
                    final MutableState mutableState3 = (MutableState) this.$this_bufferSkip;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.payments.views.personalization.BackgroundCarouselKt$BackgroundCarousel$1$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj10, Continuation continuation) {
                            int intValue = ((Number) obj10).intValue();
                            mutableState2.setValue(Boolean.TRUE);
                            MutableState mutableState4 = mutableState3;
                            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                                function1.invoke(new Integer(intValue));
                            } else {
                                mutableState4.setValue(Boolean.valueOf(intValue == i21));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.I$0 = 1;
                    if (snapshotFlow.collect(flowCollector2, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                ProfileNotificationsPresenter profileNotificationsPresenter = (ProfileNotificationsPresenter) this.L$4;
                KeyValue keyValue = profileNotificationsPresenter.hasSeenNotificationScreen;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.I$0;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    list = (List) this.L$1;
                    this.L$0 = null;
                    this.$this_bufferSkip = list;
                    this.label = 0;
                    this.I$0 = 1;
                    obj3 = keyValue.get(this);
                    if (obj3 != coroutineSingletons8) {
                        i5 = 0;
                    }
                    return coroutineSingletons8;
                }
                if (i22 != 1) {
                    if (i22 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) this.$this_bufferSkip;
                    SafeTrace.throwOnFailure(obj);
                    List list7 = list2;
                    it3 = list7.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = null;
                        } else {
                            obj4 = it3.next();
                            if (((ContactMethodType) obj4).aliasType == AliasItem.PHONE) {
                            }
                        }
                    }
                    ContactMethodType contactMethodType = (ContactMethodType) obj4;
                    list3 = contactMethodType == null ? contactMethodType.aliases : null;
                    if (list3 != null) {
                        List list8 = list3;
                        if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                            Iterator it5 = list8.iterator();
                            while (it5.hasNext()) {
                                if (((Alias) it5.next()).isChecked) {
                                }
                            }
                        }
                        z = true;
                        it4 = list7.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj5 = it4.next();
                                if (((ContactMethodType) obj5).aliasType == AliasItem.EMAIL) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        ContactMethodType contactMethodType2 = (ContactMethodType) obj5;
                        list4 = contactMethodType2 != null ? contactMethodType2.aliases : null;
                        if (list4 != null) {
                            List list9 = list4;
                            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                Iterator it6 = list9.iterator();
                                while (it6.hasNext()) {
                                    if (((Alias) it6.next()).isChecked) {
                                    }
                                }
                            }
                            i7 = 1;
                        }
                        if (!z || i7 != 0) {
                            BetterNavigator.ScreenNavigator screenNavigator3 = profileNotificationsPresenter.navigator;
                            if (list3 != null || !z) {
                                list3 = null;
                            }
                            if (list3 == null) {
                                list3 = EmptyList.INSTANCE;
                            }
                            RedactedParcelableList redactList = DBUtil.redactList(list3);
                            if (list4 != null && i7 != 0) {
                                r12 = list4;
                            }
                            if (r12 == 0) {
                                r12 = EmptyList.INSTANCE;
                            }
                            screenNavigator3.goTo(new ProfileScreens.EnableAliasSheetScreen(redactList, DBUtil.redactList(r12), ConfirmationSheetOrigin.INITIAL_PROMPT, null, 99));
                        }
                        return Unit.INSTANCE;
                    }
                    z = false;
                    it4 = list7.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                        }
                    }
                    ContactMethodType contactMethodType22 = (ContactMethodType) obj5;
                    if (contactMethodType22 != null) {
                    }
                    if (list4 != null) {
                    }
                    if (!z) {
                    }
                    BetterNavigator.ScreenNavigator screenNavigator32 = profileNotificationsPresenter.navigator;
                    if (list3 != null) {
                    }
                    list3 = null;
                    if (list3 == null) {
                    }
                    RedactedParcelableList redactList2 = DBUtil.redactList(list3);
                    if (list4 != null) {
                        r12 = list4;
                    }
                    if (r12 == 0) {
                    }
                    screenNavigator32.goTo(new ProfileScreens.EnableAliasSheetScreen(redactList2, DBUtil.redactList(r12), ConfirmationSheetOrigin.INITIAL_PROMPT, null, 99));
                    return Unit.INSTANCE;
                }
                int i23 = this.label;
                List list10 = (List) this.$this_bufferSkip;
                SafeTrace.throwOnFailure(obj);
                i5 = i23;
                list = list10;
                obj3 = obj;
                if (!((Boolean) obj3).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    this.L$0 = null;
                    this.$this_bufferSkip = list;
                    this.label = i5;
                    this.I$0 = 2;
                    if (keyValue.set(bool, this) != coroutineSingletons8) {
                        list2 = list;
                        List list72 = list2;
                        it3 = list72.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                            }
                        }
                        ContactMethodType contactMethodType3 = (ContactMethodType) obj4;
                        if (contactMethodType3 == null) {
                        }
                        if (list3 != null) {
                        }
                        z = false;
                        it4 = list72.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                            }
                        }
                        ContactMethodType contactMethodType222 = (ContactMethodType) obj5;
                        if (contactMethodType222 != null) {
                        }
                        if (list4 != null) {
                        }
                        if (!z) {
                        }
                        BetterNavigator.ScreenNavigator screenNavigator322 = profileNotificationsPresenter.navigator;
                        if (list3 != null) {
                        }
                        list3 = null;
                        if (list3 == null) {
                        }
                        RedactedParcelableList redactList22 = DBUtil.redactList(list3);
                        if (list4 != null) {
                        }
                        if (r12 == 0) {
                        }
                        screenNavigator322.goTo(new ProfileScreens.EnableAliasSheetScreen(redactList22, DBUtil.redactList(r12), ConfirmationSheetOrigin.INITIAL_PROMPT, null, 99));
                    }
                    return coroutineSingletons8;
                }
                return Unit.INSTANCE;
            case 9:
                PartnerAuthViewModel partnerAuthViewModel2 = (PartnerAuthViewModel) this.L$4;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                try {
                } catch (Throwable unused) {
                    Result.Companion companion = Result.Companion;
                }
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    partnerAuthViewModel2.getClass();
                    StateFlowImpl stateFlowImpl = partnerAuthViewModel2._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default((SharedPartnerAuthState) value, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.CANCELLING)), 23)));
                    Result.Companion companion2 = Result.Companion;
                    GetOrFetchSync getOrFetchSync = partnerAuthViewModel2.getOrFetchSync;
                    GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession ifMissingActiveAuthSession = GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = partnerAuthViewModel2;
                    this.I$0 = 0;
                    this.label = 1;
                    invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, ifMissingActiveAuthSession, this, 2);
                    if (invoke$default == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                    partnerAuthViewModel = partnerAuthViewModel2;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        Result.Companion companion3 = Result.Companion;
                        if (((SharedPartnerAuthState) this.$this_bufferSkip).inModal) {
                            partnerAuthViewModel2.navigationManager.tryNavigateBack();
                        } else {
                            NavigationManagerImpl.tryNavigateTo$default(partnerAuthViewModel2.navigationManager, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, partnerAuthViewModel2.initialState.pane), new PopUpToBehavior.Current(), 4);
                        }
                        return Unit.INSTANCE;
                    }
                    i7 = this.I$0;
                    PartnerAuthViewModel partnerAuthViewModel3 = (PartnerAuthViewModel) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    partnerAuthViewModel = partnerAuthViewModel3;
                    invoke$default = obj;
                }
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = ((SynchronizeSessionResponse) invoke$default).manifest.activeAuthSession;
                if (financialConnectionsAuthorizationSession == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel.cancelAuthorizationSession;
                String str7 = financialConnectionsAuthorizationSession.id;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i7;
                this.label = 2;
                invoke = cancelAuthorizationSession.invoke(str7, this);
                break;
            case 10:
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel2 = (FinancialConnectionsLiteViewModel) this.L$4;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                try {
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    failure = new Result.Failure(th2);
                }
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str8 = (String) this.$this_bufferSkip;
                    Result.Companion companion5 = Result.Companion;
                    ToolbarTuckTargets toolbarTuckTargets = financialConnectionsLiteViewModel2.repository;
                    FinancialConnectionsSheetConfiguration configuration = financialConnectionsLiteViewModel2.args.getConfiguration();
                    this.L$0 = null;
                    this.L$1 = financialConnectionsLiteViewModel2;
                    this.I$0 = 0;
                    this.label = 1;
                    m3758synchronize0E7RQCE = toolbarTuckTargets.m3758synchronize0E7RQCE(configuration, str8, this);
                    if (m3758synchronize0E7RQCE == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                    financialConnectionsLiteViewModel = financialConnectionsLiteViewModel2;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        failure = Unit.INSTANCE;
                        Result.Companion companion6 = Result.Companion;
                        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            financialConnectionsLiteViewModel2.handleError("Failed to synchronize session", m4120exceptionOrNullimpl);
                        }
                        return Unit.INSTANCE;
                    }
                    i7 = this.I$0;
                    financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m3758synchronize0E7RQCE = ((Result) obj).value;
                }
                SafeTrace.throwOnFailure(m3758synchronize0E7RQCE);
                com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse synchronizeSessionResponse = (com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse) m3758synchronize0E7RQCE;
                FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = financialConnectionsLiteViewModel.args;
                String str9 = synchronizeSessionResponse.manifest.hostedAuthUrl;
                ElementsSessionContext elementsSessionContext = financialConnectionsSheetActivityArgs.getElementsSessionContext();
                String create = HostedAuthUrlBuilder.create(financialConnectionsSheetActivityArgs, str9, elementsSessionContext != null ? elementsSessionContext.prefillDetails : null);
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                String str10 = financialConnectionsSessionManifest.successUrl;
                if (str10 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str11 = financialConnectionsSessionManifest.cancelUrl;
                if (str11 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (create == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                FinancialConnectionsLiteViewModel.State state = new FinancialConnectionsLiteViewModel.State(str10, str11, create);
                StateFlowImpl stateFlowImpl2 = financialConnectionsLiteViewModel._state;
                do {
                    value2 = stateFlowImpl2.getValue();
                } while (!stateFlowImpl2.compareAndSet(value2, state));
                SharedFlowImpl sharedFlowImpl = financialConnectionsLiteViewModel._viewEffects;
                FinancialConnectionsLiteViewModel.ViewEffect.OpenAuthFlowWithUrl openAuthFlowWithUrl = new FinancialConnectionsLiteViewModel.ViewEffect.OpenAuthFlowWithUrl(state.hostedAuthUrl);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i7;
                this.label = 2;
                break;
            case 11:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.I$0;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StripeTransaction stripeTransaction = (StripeTransaction) this.L$1;
                    this.I$0 = 1;
                    zzai zzaiVar = (zzai) stripeTransaction.areqParamsFactory;
                    String str12 = (String) stripeTransaction.directoryServerId;
                    PublicKey publicKey = (PublicKey) stripeTransaction.directoryServerPublicKey;
                    String str13 = (String) stripeTransaction.directoryServerKeyId;
                    SdkTransactionId sdkTransactionId = (SdkTransactionId) stripeTransaction.sdkTransactionId;
                    PublicKey publicKey2 = ((KeyPair) stripeTransaction.sdkKeyPair).getPublic();
                    publicKey2.getClass();
                    withContext = JobKt.withContext((CoroutineContext) zzaiVar.zze, new RealBugReportSender$submitBugReport$2(sdkTransactionId, zzaiVar, publicKey2, str13, str12, publicKey, null), this);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj6 = ((Result) obj).value;
                        return new Result(obj6);
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) withContext;
                Stripe3ds2AuthParams stripe3ds2AuthParams = new Stripe3ds2AuthParams(this.label, ((Stripe3ds2Fingerprint) this.L$4).source, authenticationRequestParameters.sdkAppId, authenticationRequestParameters.sdkReferenceNumber, authenticationRequestParameters.sdkTransactionId.value, authenticationRequestParameters.deviceData, authenticationRequestParameters.sdkEphemeralPublicKey, authenticationRequestParameters.messageVersion, null);
                StripeApiRepository stripeApiRepository = ((Stripe3ds2TransactionViewModel) this.L$0).stripeRepository;
                ApiRequest.Options options = (ApiRequest.Options) this.$this_bufferSkip;
                this.I$0 = 2;
                Object m4050start3ds2Auth0E7RQCE = stripeApiRepository.m4050start3ds2Auth0E7RQCE(stripe3ds2AuthParams, options, this);
                if (m4050start3ds2Auth0E7RQCE != coroutineSingletons11) {
                    obj6 = m4050start3ds2Auth0E7RQCE;
                    return new Result(obj6);
                }
                return coroutineSingletons11;
            case 12:
                Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.I$0;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = StripePaymentController.CHALLENGE_DELAY;
                    this.I$0 = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Stripe3ds2AuthResult.Ares ares = (Stripe3ds2AuthResult.Ares) this.L$1;
                ChallengeParameters challengeParameters = new ChallengeParameters(ares.threeDSServerTransId, ares.acsTransId, null, ares.acsSignedContent, null);
                StripeTransaction stripeTransaction2 = (StripeTransaction) this.L$4;
                int i28 = this.label;
                String clientSecret = stripe3ds2TransactionViewModel.args.stripeIntent.getClientSecret();
                if (clientSecret == null) {
                    clientSecret = "";
                }
                String str14 = (String) this.$this_bufferSkip;
                ApiRequest.Options options2 = stripe3ds2TransactionViewModel.threeDS2RequestOptions;
                IntentData intentData = new IntentData(clientSecret, str14, options2.apiKey, options2.stripeAccount);
                stripeTransaction2.getClass();
                return new NextStep.StartChallenge(new InitChallengeArgs("3DS_LOA_SDK_STIN_020200_00960", (KeyPair) stripeTransaction2.sdkKeyPair, challengeParameters, i28 < 5 ? 5 : i28, intentData));
            default:
                LiveDataScopeImpl liveDataScopeImpl = (LiveDataScopeImpl) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.I$0;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextSetter textSetter = ((ChallengeActivityViewModel) this.L$4).imageRepository;
                    ChallengeResponseData.Image image = (ChallengeResponseData.Image) this.$this_bufferSkip;
                    if (image != null) {
                        int i30 = this.label;
                        String str15 = image.highUrl;
                        String str16 = image.extraHighUrl;
                        String str17 = image.mediumUrl;
                        str = i30 <= 160 ? str17 : i30 >= 320 ? str16 : str15;
                        if (str == null || StringsKt.isBlank(str)) {
                            str = null;
                        }
                        if (str == null) {
                            Iterator it7 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str16, str15, str17}).iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj7 = it7.next();
                                    String str18 = (String) obj7;
                                    if (str18 == null || StringsKt.isBlank(str18)) {
                                    }
                                } else {
                                    obj7 = null;
                                }
                            }
                            str = (String) obj7;
                        }
                    } else {
                        str = null;
                    }
                    this.L$0 = null;
                    this.L$1 = liveDataScopeImpl;
                    this.I$0 = 1;
                    withContext2 = JobKt.withContext((CoroutineContext) textSetter.textView, new FlowKt__LimitKt$transformWhile$1(str, textSetter, (Continuation) r12, i6), this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    liveDataScopeImpl = (LiveDataScopeImpl) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 2;
                Object withContext4 = JobKt.withContext(liveDataScopeImpl.coroutineContext, new PageFetcher$flow$1(liveDataScopeImpl, withContext2, (Continuation) null), this);
                if (withContext4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    withContext4 = Unit.INSTANCE;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCountKt$bufferSkip$1(SupportHomePresenter$models$lambda$5$$inlined$map$1 supportHomePresenter$models$lambda$5$$inlined$map$1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$this_bufferSkip = supportHomePresenter$models$lambda$5$$inlined$map$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BufferCountKt$bufferSkip$1(CashQrWidgetReceiver cashQrWidgetReceiver, Context context, int i, Object obj, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.L$1 = cashQrWidgetReceiver;
        this.L$4 = context;
        this.label = i;
        this.$this_bufferSkip = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCountKt$bufferSkip$1(OffersTabHomeResponse offersTabHomeResponse, RealOffersTabRepository realOffersTabRepository, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.L$0 = offersTabHomeResponse;
        this.$this_bufferSkip = realOffersTabRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCountKt$bufferSkip$1(ChallengeActivityViewModel challengeActivityViewModel, ChallengeResponseData.Image image, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.L$4 = challengeActivityViewModel;
        this.$this_bufferSkip = image;
        this.label = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BufferCountKt$bufferSkip$1(Object obj, Object obj2, int i, Object obj3, Object obj4, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.L$1 = obj;
        this.L$4 = obj2;
        this.label = i;
        this.L$0 = obj3;
        this.$this_bufferSkip = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BufferCountKt$bufferSkip$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$4 = obj;
        this.$this_bufferSkip = obj2;
    }

    /* renamed from: com.squareup.util.coroutines.BufferCountKt$bufferSkip$1$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final class AnonymousClass1 implements FlowCollector {
        public final Object $$this$flow;
        public final Object $buffers;
        public final Object $index;
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass1(FlowCollector flowCollector, CoroutineContext coroutineContext) {
            this.$r8$classId = 24;
            this.$index = coroutineContext;
            this.$buffers = ThreadContextKt.threadContextElements(coroutineContext);
            this.$$this$flow = new SequentialStateFlow$collect$2(flowCollector, null, 1);
        }

        private final Object emit$com$squareup$cash$transfers$presenters$RecurringReloadConfigurationPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            Triple triple;
            Object obj2;
            Integer num;
            RecurringSchedule.Frequency frequency;
            Pair pair;
            Object obj3;
            long j;
            Long l;
            Object obj4;
            Object obj5;
            Object selectScheduledAmountKeypad;
            RecurringReloadConfigurationViewModel selectScheduledAmountKeypad2;
            RecurringReloadConfigurationViewModel.SelectDay selectDay;
            Object selectFrequency;
            String str = (String) this.$buffers;
            RecurringReloadConfigurationPresenter recurringReloadConfigurationPresenter = (RecurringReloadConfigurationPresenter) this.$index;
            RecurringReloadConfigurationScreen recurringReloadConfigurationScreen = recurringReloadConfigurationPresenter.args;
            BetterNavigator.ScreenNavigator screenNavigator = recurringReloadConfigurationPresenter.navigator;
            Analytics analytics = recurringReloadConfigurationPresenter.analytics;
            MutableState mutableState = (MutableState) this.$$this$flow;
            RecurringReloadConfigurationViewEvent recurringReloadConfigurationViewEvent = (RecurringReloadConfigurationViewEvent) obj;
            boolean z = recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.Close;
            Back back = Back.INSTANCE;
            if (z) {
                screenNavigator.goTo(back);
            } else {
                if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.Back) {
                    List list = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                    Object obj6 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                    if (obj6 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmount) {
                        RecurringReloadConfigurationViewModel.SelectReloadAmount selectReloadAmount = (RecurringReloadConfigurationViewModel.SelectReloadAmount) obj6;
                        selectFrequency = new RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker(selectReloadAmount.getMinBalance(), selectReloadAmount.getReloadAmount(), true);
                    } else {
                        if ((obj6 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) || (obj6 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad)) {
                            screenNavigator.goTo(back);
                        } else if (obj6 instanceof RecurringReloadConfigurationViewModel.SelectFrequency) {
                            screenNavigator.goTo(back);
                        } else if (obj6 instanceof RecurringReloadConfigurationViewModel.SelectDay) {
                            RecurringSchedule.Frequency frequency2 = ((RecurringReloadConfigurationViewModel.SelectDay) obj6).frequency;
                            selectFrequency = new RecurringReloadConfigurationViewModel.SelectFrequency(frequency2, frequency2 != null);
                        } else if (obj6 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                            RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) obj6;
                            RecurringSchedule.Frequency frequency3 = selectScheduledAmountAtmPicker.frequency;
                            if (frequency3 == RecurringSchedule.Frequency.EVERY_DAY) {
                                obj6 = new RecurringReloadConfigurationViewModel.SelectFrequency(frequency3, true);
                            } else {
                                Integer num2 = selectScheduledAmountAtmPicker.dayOfPeriod;
                                selectDay = new RecurringReloadConfigurationViewModel.SelectDay(frequency3, num2, num2 != null);
                                obj6 = selectDay;
                            }
                        } else {
                            if (!(obj6 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad selectScheduledAmountKeypad3 = (RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) obj6;
                            RecurringSchedule.Frequency frequency4 = selectScheduledAmountKeypad3.frequency;
                            if (frequency4 == RecurringSchedule.Frequency.EVERY_DAY) {
                                obj6 = new RecurringReloadConfigurationViewModel.SelectFrequency(frequency4, true);
                            } else {
                                Integer num3 = selectScheduledAmountKeypad3.dayOfPeriod;
                                selectDay = new RecurringReloadConfigurationViewModel.SelectDay(frequency4, num3, num3 != null);
                                obj6 = selectDay;
                            }
                        }
                        mutableState.setValue(obj6);
                    }
                    obj6 = selectFrequency;
                    mutableState.setValue(obj6);
                } else {
                    r13 = null;
                    r13 = null;
                    Money money = null;
                    if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.Expanded) {
                        if (str != null) {
                            List list2 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                            RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                            if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) {
                                analytics.track(new BalanceBasedAddCashEditAmountExpand(EditAmountOption.MIN_BALANCE, str), null);
                            } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                                analytics.track(new BalanceBasedAddCashEditAmountExpand(EditAmountOption.INCREMENT, str), null);
                            } else if (!(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) && !(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) && !(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectFrequency) && !(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectDay) && !(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) && !(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        List list3 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel2 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        if (recurringReloadConfigurationViewModel2 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) {
                            RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker selectMinBalanceAtmPicker = (RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) recurringReloadConfigurationViewModel2;
                            selectScheduledAmountKeypad2 = new RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad(selectMinBalanceAtmPicker.minBalance, selectMinBalanceAtmPicker.existingReloadAmount, selectMinBalanceAtmPicker.enableContinue);
                        } else {
                            if (recurringReloadConfigurationViewModel2 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                                RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker selectReloadAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) recurringReloadConfigurationViewModel2;
                                Money money2 = selectReloadAmountAtmPicker.minBalance;
                                recurringReloadConfigurationViewModel2 = new RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad(money2, selectReloadAmountAtmPicker.reloadAmount, selectReloadAmountAtmPicker.enableContinue, "", "", "", RecurringReloadConfigurationPresenter.access$maxReloadAmountCents(recurringReloadConfigurationPresenter, money2));
                            } else if (recurringReloadConfigurationViewModel2 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                                RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker2 = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) recurringReloadConfigurationViewModel2;
                                RecurringSchedule.Frequency frequency5 = selectScheduledAmountAtmPicker2.frequency;
                                Integer num4 = selectScheduledAmountAtmPicker2.dayOfPeriod;
                                Money money3 = selectScheduledAmountAtmPicker2.selectedAmount;
                                if (money3 == null) {
                                    money3 = new Money(new Long(0L), CurrencyCode.USD, 4);
                                }
                                selectScheduledAmountKeypad2 = new RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad(frequency5, num4, money3, selectScheduledAmountAtmPicker2.enableContinue);
                            }
                            mutableState.setValue(recurringReloadConfigurationViewModel2);
                        }
                        recurringReloadConfigurationViewModel2 = selectScheduledAmountKeypad2;
                        mutableState.setValue(recurringReloadConfigurationViewModel2);
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.Peeking) {
                        List list4 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel3 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        if (recurringReloadConfigurationViewModel3 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) {
                            recurringReloadConfigurationViewModel3 = new RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker(null, ((RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) recurringReloadConfigurationViewModel3).existingReloadAmount, false);
                        } else if (recurringReloadConfigurationViewModel3 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) {
                            recurringReloadConfigurationViewModel3 = new RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker(((RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) recurringReloadConfigurationViewModel3).minBalance, null, false, "", "", EmptyList.INSTANCE);
                        } else if (recurringReloadConfigurationViewModel3 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) {
                            RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad selectScheduledAmountKeypad4 = (RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) recurringReloadConfigurationViewModel3;
                            recurringReloadConfigurationViewModel3 = new RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker(selectScheduledAmountKeypad4.frequency, selectScheduledAmountKeypad4.dayOfPeriod, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                        }
                        mutableState.setValue(recurringReloadConfigurationViewModel3);
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.AmountPickerItemSelected) {
                        RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem = ((RecurringReloadConfigurationViewEvent.AmountPickerItemSelected) recurringReloadConfigurationViewEvent).item;
                        if (amountPickerItem instanceof RecurringReloadConfigurationViewModel.AmountPickerItem.Amount) {
                            Money money4 = ((RecurringReloadConfigurationViewModel.AmountPickerItem.Amount) amountPickerItem).amount;
                            List list5 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                            obj5 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                            if (obj5 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) {
                                obj5 = RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker.copy$default((RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) obj5, money4, null, null, null, 58);
                            } else if (obj5 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                                obj5 = RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker.copy$default((RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) obj5, money4, null, null, null, 57);
                            } else if (obj5 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                                obj5 = RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker.copy$default((RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) obj5, money4, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
                            }
                        } else {
                            if (!(amountPickerItem instanceof RecurringReloadConfigurationViewModel.AmountPickerItem.Custom)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (str != null) {
                                List list6 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel4 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                                if (recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) {
                                    analytics.track(new BalanceBasedAddCashEditAmountExpand(EditAmountOption.MIN_BALANCE, str), null);
                                } else if (recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                                    analytics.track(new BalanceBasedAddCashEditAmountExpand(EditAmountOption.INCREMENT, str), null);
                                } else if (!(recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) && !(recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) && !(recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectFrequency) && !(recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectDay) && !(recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) && !(recurringReloadConfigurationViewModel4 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                            }
                            List list7 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                            obj5 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                            if (obj5 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) {
                                selectScheduledAmountKeypad = new RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad(null, ((RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) obj5).existingReloadAmount, false);
                            } else if (obj5 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                                Money money5 = ((RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) obj5).minBalance;
                                obj5 = new RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad(money5, null, false, "", "", "", RecurringReloadConfigurationPresenter.access$maxReloadAmountCents(recurringReloadConfigurationPresenter, money5));
                            } else if (obj5 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                                RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker3 = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) obj5;
                                selectScheduledAmountKeypad = new RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad(selectScheduledAmountAtmPicker3.frequency, selectScheduledAmountAtmPicker3.dayOfPeriod, new Money(new Long(0L), CurrencyCode.USD, 4), false);
                            }
                            obj5 = selectScheduledAmountKeypad;
                        }
                        mutableState.setValue(obj5);
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.MinBalanceChanged) {
                        List list8 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel5 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad selectMinBalanceKeypad = recurringReloadConfigurationViewModel5 instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad ? (RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) recurringReloadConfigurationViewModel5 : null;
                        if (selectMinBalanceKeypad != null) {
                            Money money6 = ((RecurringReloadConfigurationViewEvent.MinBalanceChanged) recurringReloadConfigurationViewEvent).amount;
                            Long l2 = money6.amount;
                            obj4 = RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad.copy$default(selectMinBalanceKeypad, money6, (l2 != null ? l2.longValue() : 0L) >= ((Number) CollectionsKt.first(RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS)).longValue(), null, null, null, 58);
                        } else {
                            obj4 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        }
                        mutableState.setValue(obj4);
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.MinBalanceContinue) {
                        List list9 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel6 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        if (recurringReloadConfigurationViewModel6 instanceof RecurringReloadConfigurationViewModel.SelectMinBalance) {
                            RecurringReloadConfigurationViewModel.SelectMinBalance selectMinBalance = (RecurringReloadConfigurationViewModel.SelectMinBalance) recurringReloadConfigurationViewModel6;
                            Money minBalance = selectMinBalance.getMinBalance();
                            Money existingReloadAmount = selectMinBalance.getExistingReloadAmount();
                            if (minBalance != null) {
                                if (str != null) {
                                    boolean z2 = ((RecurringReloadConfigurationViewModel) mutableState.getValue()) instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad;
                                    EditAmountOption editAmountOption = EditAmountOption.MIN_BALANCE;
                                    EditAmountMethod editAmountMethod = z2 ? EditAmountMethod.KEYPAD : EditAmountMethod.ATM;
                                    Long l3 = minBalance.amount;
                                    j = 0;
                                    analytics.track(new BalanceBasedAddCashEditAmountSave(editAmountOption, editAmountMethod, new Integer(l3 != null ? (int) l3.longValue() : 0), str), null);
                                } else {
                                    j = 0;
                                }
                                RecurringReloadConfigurationScreen.Mode mode = recurringReloadConfigurationScreen.mode;
                                RecurringReloadConfigurationScreen.Mode.BalanceBased balanceBased = mode instanceof RecurringReloadConfigurationScreen.Mode.BalanceBased ? (RecurringReloadConfigurationScreen.Mode.BalanceBased) mode : null;
                                if (minBalance.equals(balanceBased != null ? balanceBased.existingMinBalance : null)) {
                                    CurrencyCode currencyCode = minBalance.currency_code;
                                    if (currencyCode == null) {
                                        currencyCode = CurrencyCode.USD;
                                    }
                                    ListBuilder generatePresets = RecurringReloadConfigurationPresenter.generatePresets(minBalance, new Money(new Long(2000L), currencyCode, 4));
                                    if (existingReloadAmount != null && generatePresets.contains(existingReloadAmount)) {
                                        money = existingReloadAmount;
                                    }
                                }
                                mutableState.setValue(new RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker(minBalance, money, ((money == null || (l = money.amount) == null) ? j : l.longValue()) > j, "", "", EmptyList.INSTANCE));
                            }
                        }
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.ReloadAmountChanged) {
                        List list10 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel7 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad selectReloadAmountKeypad = recurringReloadConfigurationViewModel7 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad ? (RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) recurringReloadConfigurationViewModel7 : null;
                        if (selectReloadAmountKeypad != null) {
                            Money money7 = ((RecurringReloadConfigurationViewEvent.ReloadAmountChanged) recurringReloadConfigurationViewEvent).amount;
                            Long l4 = money7.amount;
                            long longValue = l4 != null ? l4.longValue() : 0L;
                            Long l5 = selectReloadAmountKeypad.minBalance.amount;
                            obj3 = RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad.copy$default(selectReloadAmountKeypad, money7, longValue >= (l5 != null ? l5.longValue() : 0L), null, null, null, 121);
                        } else {
                            obj3 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        }
                        mutableState.setValue(obj3);
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.ReloadAmountSubmit) {
                        List list11 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel8 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        if (recurringReloadConfigurationViewModel8 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                            RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker selectReloadAmountAtmPicker2 = (RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) recurringReloadConfigurationViewModel8;
                            pair = new Pair(selectReloadAmountAtmPicker2.minBalance, selectReloadAmountAtmPicker2.reloadAmount);
                        } else if (recurringReloadConfigurationViewModel8 instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) {
                            RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad selectReloadAmountKeypad2 = (RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) recurringReloadConfigurationViewModel8;
                            pair = new Pair(selectReloadAmountKeypad2.minBalance, selectReloadAmountKeypad2.reloadAmount);
                        }
                        Money money8 = (Money) pair.first;
                        Money money9 = (Money) pair.second;
                        if (money9 != null) {
                            if (str != null) {
                                boolean z3 = ((RecurringReloadConfigurationViewModel) mutableState.getValue()) instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad;
                                EditAmountOption editAmountOption2 = EditAmountOption.INCREMENT;
                                EditAmountMethod editAmountMethod2 = z3 ? EditAmountMethod.KEYPAD : EditAmountMethod.ATM;
                                Long l6 = money9.amount;
                                analytics.track(new BalanceBasedAddCashEditAmountSave(editAmountOption2, editAmountMethod2, new Integer(l6 != null ? (int) l6.longValue() : 0), str), null);
                            }
                            screenNavigator.giveAnswer(recurringReloadConfigurationScreen.question, new RecurringReloadConfigurationResult.BalanceBasedReloadResult(money8, money9));
                        }
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.FrequencySelected) {
                        List list12 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel9 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectFrequency selectFrequency2 = recurringReloadConfigurationViewModel9 instanceof RecurringReloadConfigurationViewModel.SelectFrequency ? (RecurringReloadConfigurationViewModel.SelectFrequency) recurringReloadConfigurationViewModel9 : null;
                        mutableState.setValue(selectFrequency2 != null ? RecurringReloadConfigurationViewModel.SelectFrequency.copy$default(selectFrequency2, ((RecurringReloadConfigurationViewEvent.FrequencySelected) recurringReloadConfigurationViewEvent).frequency, null, null, 12) : (RecurringReloadConfigurationViewModel) mutableState.getValue());
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.FrequencyContinue) {
                        List list13 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel10 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectFrequency selectFrequency3 = recurringReloadConfigurationViewModel10 instanceof RecurringReloadConfigurationViewModel.SelectFrequency ? (RecurringReloadConfigurationViewModel.SelectFrequency) recurringReloadConfigurationViewModel10 : null;
                        if (selectFrequency3 != null && (frequency = selectFrequency3.selectedFrequency) != null) {
                            mutableState.setValue(frequency == RecurringSchedule.Frequency.EVERY_DAY ? new RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker(frequency, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) : new RecurringReloadConfigurationViewModel.SelectDay(frequency, new Integer(1), true));
                        }
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.DaySelected) {
                        List list14 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel11 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectDay selectDay2 = recurringReloadConfigurationViewModel11 instanceof RecurringReloadConfigurationViewModel.SelectDay ? (RecurringReloadConfigurationViewModel.SelectDay) recurringReloadConfigurationViewModel11 : null;
                        mutableState.setValue(selectDay2 != null ? RecurringReloadConfigurationViewModel.SelectDay.copy$default(selectDay2, null, new Integer(((RecurringReloadConfigurationViewEvent.DaySelected) recurringReloadConfigurationViewEvent).index), null, null, null, 107) : (RecurringReloadConfigurationViewModel) mutableState.getValue());
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.DayContinue) {
                        List list15 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel12 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectDay selectDay3 = recurringReloadConfigurationViewModel12 instanceof RecurringReloadConfigurationViewModel.SelectDay ? (RecurringReloadConfigurationViewModel.SelectDay) recurringReloadConfigurationViewModel12 : null;
                        if (selectDay3 != null && (num = selectDay3.selectedIndex) != null) {
                            mutableState.setValue(new RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker(selectDay3.frequency, new Integer(num.intValue()), null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                        }
                    } else if (recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.ScheduledAmountChanged) {
                        List list16 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel13 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad selectScheduledAmountKeypad5 = recurringReloadConfigurationViewModel13 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad ? (RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) recurringReloadConfigurationViewModel13 : null;
                        if (selectScheduledAmountKeypad5 != null) {
                            Money money10 = ((RecurringReloadConfigurationViewEvent.ScheduledAmountChanged) recurringReloadConfigurationViewEvent).amount;
                            Long l7 = money10.amount;
                            obj2 = RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad.copy$default(selectScheduledAmountKeypad5, null, money10, (l7 != null ? l7.longValue() : 0L) >= 100, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
                        } else {
                            obj2 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        }
                        mutableState.setValue(obj2);
                    } else {
                        if (!(recurringReloadConfigurationViewEvent instanceof RecurringReloadConfigurationViewEvent.ScheduledAmountSubmit)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        List list17 = RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS;
                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel14 = (RecurringReloadConfigurationViewModel) mutableState.getValue();
                        if (recurringReloadConfigurationViewModel14 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                            RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker4 = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) recurringReloadConfigurationViewModel14;
                            triple = new Triple(selectScheduledAmountAtmPicker4.frequency, selectScheduledAmountAtmPicker4.dayOfPeriod, selectScheduledAmountAtmPicker4.selectedAmount);
                        } else if (recurringReloadConfigurationViewModel14 instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) {
                            RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad selectScheduledAmountKeypad6 = (RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) recurringReloadConfigurationViewModel14;
                            RecurringSchedule.Frequency frequency6 = selectScheduledAmountKeypad6.frequency;
                            Integer num5 = selectScheduledAmountKeypad6.dayOfPeriod;
                            Money money11 = selectScheduledAmountKeypad6.amount;
                            Long l8 = money11.amount;
                            triple = new Triple(frequency6, num5, (l8 != null ? l8.longValue() : 0L) > 0 ? money11 : null);
                        }
                        RecurringSchedule.Frequency frequency7 = (RecurringSchedule.Frequency) triple.first;
                        Integer num6 = (Integer) triple.second;
                        Money money12 = (Money) triple.third;
                        if (frequency7 != null && money12 != null) {
                            screenNavigator.giveAnswer(recurringReloadConfigurationScreen.question, new RecurringReloadConfigurationResult.ScheduledReloadResult(frequency7, num6, money12));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$work$presenters$pay$PayHistoryListPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$$this$flow;
            MutableState mutableState = (MutableState) this.$buffers;
            PayHistoryListViewEvent payHistoryListViewEvent = (PayHistoryListViewEvent) obj;
            if (Intrinsics.areEqual(payHistoryListViewEvent, PayHistoryListViewEvent.BackPressed.INSTANCE)) {
                ((TaxAuthorizationPresenter) this.$index).navigator.goTo(Back.INSTANCE);
            } else if (Intrinsics.areEqual(payHistoryListViewEvent, PayHistoryListViewEvent.RetryClicked.INSTANCE)) {
                mutableState.setValue(PayHistoryListPresenter$DataState.Loading.INSTANCE);
                int intValue = parcelableSnapshotMutableIntState.getIntValue();
                parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                Okio.boxInt(intValue);
            } else if (!(payHistoryListViewEvent instanceof PayHistoryListViewEvent.StubClicked)) {
                if (!Intrinsics.areEqual(payHistoryListViewEvent, PayHistoryListViewEvent.LoadMore.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PayHistoryListPresenter$DataState payHistoryListPresenter$DataState = (PayHistoryListPresenter$DataState) mutableState.getValue();
                PayHistoryListPresenter$DataState.Loaded loaded = payHistoryListPresenter$DataState instanceof PayHistoryListPresenter$DataState.Loaded ? (PayHistoryListPresenter$DataState.Loaded) payHistoryListPresenter$DataState : null;
                if (loaded != null && loaded.nextOffset != null && !loaded.isLoadingMore) {
                    mutableState.setValue(PayHistoryListPresenter$DataState.Loaded.copy$default(loaded, true));
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$work$webview$presenters$WorkWebPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            List<String> pathSegments;
            MutableState mutableState = (MutableState) this.$$this$flow;
            MutableState mutableState2 = (MutableState) this.$buffers;
            WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.$index;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) workHomePresenter.titleBarPresenter;
            WorkWebScreen workWebScreen = (WorkWebScreen) workHomePresenter.shiftsAnalytics;
            WorkWebViewEvent workWebViewEvent = (WorkWebViewEvent) obj;
            boolean areEqual = Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.Close.INSTANCE);
            Back back = Back.INSTANCE;
            if (areEqual || Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.ExitWebView.INSTANCE)) {
                screenNavigator.goTo(back);
            } else if (workWebViewEvent instanceof WorkWebViewEvent.PageError) {
                AndroidStringManager androidStringManager = (AndroidStringManager) workHomePresenter.shiftSection2Presenter;
                boolean z = ((WorkWebViewEvent.PageError) workWebViewEvent).canRetry;
                mutableState2.setValue(new WorkWebViewModel.ShowError(androidStringManager.get(z ? R.string.work_webview_error_retryable : R.string.work_webview_error_not_retryable), z));
            } else {
                boolean areEqual2 = Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.RetryLoad.INSTANCE);
                WorkWebViewModel.OtkInitializing otkInitializing = WorkWebViewModel.OtkInitializing.INSTANCE;
                if (areEqual2) {
                    if (workWebScreen.useOtk) {
                        mutableState2.setValue(otkInitializing);
                        mutableState.setValue(Boolean.TRUE);
                    } else {
                        mutableState2.setValue(new WorkWebViewModel.LoadUrl(workWebScreen.url));
                    }
                } else if (workWebViewEvent instanceof WorkWebViewEvent.PageStarted) {
                    if (workWebScreen.useOtk) {
                        try {
                            Uri parse = Uri.parse(((WorkWebViewEvent.PageStarted) workWebViewEvent).url);
                            if (parse != null && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 1) {
                                if (StringsKt__StringsJVMKt.equals(pathSegments.get(0), "login", true)) {
                                    mutableState2.setValue(otkInitializing);
                                    mutableState.setValue(Boolean.TRUE);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else if (!Intrinsics.areEqual(workWebViewEvent, WorkWebViewEvent.PageFinished.INSTANCE)) {
                    if (!(workWebViewEvent instanceof WorkWebViewEvent.WebResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Payload payload = (Payload) workHomePresenter.youPresenter;
                    final WorkWebKey workWebKey = workWebScreen.key;
                    final String str = workWebScreen.url;
                    final Uri uri = ((WorkWebViewEvent.WebResult) workWebViewEvent).actionUri;
                    Object obj2 = new Object(workWebKey, str, uri) { // from class: com.squareup.cash.work.webview.presenters.webresult.WebResultHandler$WebViewResult
                        public final Uri actionUri;
                        public final WorkWebKey key;
                        public final String originalWebViewUrl;

                        {
                            workWebKey.getClass();
                            str.getClass();
                            this.key = workWebKey;
                            this.originalWebViewUrl = str;
                            this.actionUri = uri;
                        }

                        public final boolean equals(Object obj3) {
                            if (this == obj3) {
                                return true;
                            }
                            if (!(obj3 instanceof WebResultHandler$WebViewResult)) {
                                return false;
                            }
                            WebResultHandler$WebViewResult webResultHandler$WebViewResult = (WebResultHandler$WebViewResult) obj3;
                            return this.key == webResultHandler$WebViewResult.key && Intrinsics.areEqual(this.originalWebViewUrl, webResultHandler$WebViewResult.originalWebViewUrl) && this.actionUri.equals(webResultHandler$WebViewResult.actionUri);
                        }

                        public final int hashCode() {
                            return this.actionUri.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.originalWebViewUrl);
                        }

                        public final String toString() {
                            return "WebViewResult(key=" + this.key + ", originalWebViewUrl=" + this.originalWebViewUrl + ", actionUri=" + this.actionUri + ")";
                        }
                    };
                    if (!((SharedFlowImpl) payload.a).tryEmit(obj2)) {
                        Timber.Forest.w("Failed to emit web result: " + obj2, new Object[0]);
                    }
                    screenNavigator.goTo(back);
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$stripe$android$financialconnections$navigation$bottomsheet$SheetContentHostKt$SheetContentHost$1$1$2(Object obj, Continuation continuation) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$index;
            if (booleanValue) {
                ((Function1) ((MutableState) this.$buffers).getValue()).invoke(navBackStackEntry);
            } else {
                ((Function1) ((MutableState) this.$$this$flow).getValue()).invoke(navBackStackEntry);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:117:0x01d6, code lost:
        
            if (r7 != null) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:232:0x043f, code lost:
        
            if (r0.emit(r2, r3) != r4) goto L220;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x03f1  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x0464  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:252:0x0470  */
        /* JADX WARN: Removed duplicated region for block: B:388:0x0928  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x0934  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x098d  */
        /* JADX WARN: Removed duplicated region for block: B:416:0x0999  */
        /* JADX WARN: Removed duplicated region for block: B:431:0x0a02  */
        /* JADX WARN: Removed duplicated region for block: B:437:0x0a0e  */
        /* JADX WARN: Removed duplicated region for block: B:449:0x0a68  */
        /* JADX WARN: Removed duplicated region for block: B:455:0x0a74  */
        /* JADX WARN: Removed duplicated region for block: B:475:0x0adb  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x0b22  */
        /* JADX WARN: Removed duplicated region for block: B:495:0x0af7  */
        /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r10v46 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:446:0x0b55 -> B:437:0x0b5b). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            BufferCountKt$bufferSkip$1$1$emit$1 bufferCountKt$bufferSkip$1$1$emit$1;
            int i;
            FlowCollector flowCollector;
            Iterator it;
            int i2;
            Iterator it2;
            int i3;
            RealShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1 realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1;
            int i4;
            Object access$assetFailedToLoad;
            RealShareTargetsManager$addSmsTarget$$inlined$map$1$2$1 realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1;
            int i5;
            RealShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1 realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1;
            int i6;
            RealShareableAssetsManager$download$$inlined$map$1$2$1 realShareableAssetsManager$download$$inlined$map$1$2$1;
            int i7;
            String str;
            SupCreateCardFlowEndResult supCreateCardFlowEndResult;
            IssuedCard issuedCard;
            List list;
            RealTransactionLoader$getTransactions$$inlined$map$1$2$1 realTransactionLoader$getTransactions$$inlined$map$1$2$1;
            int i8;
            RealTransactionLoader$getTransactions$$inlined$map$2$2$1 realTransactionLoader$getTransactions$$inlined$map$2$2$1;
            int i9;
            FlowCollector flowCollector2;
            Object value;
            CashCardNextUpDismiss.DismissMethod dismissMethod;
            CardModule.CardElementAction cardElementAction;
            String actionType;
            zzkk zzkkVar;
            ClientScenario clientScenario;
            zzkk zzkkVar2;
            DeviceType deviceType;
            DeviceType deviceType2;
            FlowExtensionsKt$zipWithNext$1$1$emit$1 flowExtensionsKt$zipWithNext$1$1$emit$1;
            int i10;
            Object obj2;
            Object obj3 = obj;
            int i11 = 0;
            r5 = false;
            boolean z = false;
            int i12 = 3;
            int i13 = 2;
            int i14 = 1;
            String str2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    ArrayDeque arrayDeque = (ArrayDeque) this.$buffers;
                    if (continuation instanceof BufferCountKt$bufferSkip$1$1$emit$1) {
                        bufferCountKt$bufferSkip$1$1$emit$1 = (BufferCountKt$bufferSkip$1$1$emit$1) continuation;
                        int i15 = bufferCountKt$bufferSkip$1$1$emit$1.label;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            bufferCountKt$bufferSkip$1$1$emit$1.label = i15 - PKIFailureInfo.systemUnavail;
                            Object obj4 = bufferCountKt$bufferSkip$1$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = bufferCountKt$bufferSkip$1$1$emit$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                Ref$IntRef ref$IntRef = (Ref$IntRef) this.$index;
                                int i16 = ref$IntRef.element;
                                ref$IntRef.element = i16 + 1;
                                if (i16 % 1 == 0) {
                                    arrayDeque.addLast(new ArrayList());
                                }
                                Iterator it3 = arrayDeque.iterator();
                                flowCollector = (FlowCollector) this.$$this$flow;
                                it = it3;
                                i2 = 0;
                                it2 = it;
                                i3 = 0;
                                while (it2.hasNext()) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i17 = bufferCountKt$bufferSkip$1$1$emit$1.I$2;
                            int i18 = bufferCountKt$bufferSkip$1$1$emit$1.I$1;
                            int i19 = bufferCountKt$bufferSkip$1$1$emit$1.I$0;
                            it2 = bufferCountKt$bufferSkip$1$1$emit$1.L$4;
                            Iterator it4 = bufferCountKt$bufferSkip$1$1$emit$1.L$2;
                            flowCollector = bufferCountKt$bufferSkip$1$1$emit$1.L$1;
                            Object obj5 = bufferCountKt$bufferSkip$1$1$emit$1.L$0;
                            SafeTrace.throwOnFailure(obj4);
                            Iterator it5 = it4;
                            i13 = i19;
                            it = it5;
                            i3 = i17;
                            i2 = i18;
                            obj3 = obj5;
                            while (it2.hasNext()) {
                                List list2 = (List) it2.next();
                                list2.add(obj3);
                                if (list2.size() >= i13) {
                                    it.remove();
                                    List list3 = CollectionsKt.toList(list2);
                                    bufferCountKt$bufferSkip$1$1$emit$1.L$0 = obj3;
                                    bufferCountKt$bufferSkip$1$1$emit$1.L$1 = flowCollector;
                                    bufferCountKt$bufferSkip$1$1$emit$1.L$2 = it;
                                    bufferCountKt$bufferSkip$1$1$emit$1.L$4 = it2;
                                    bufferCountKt$bufferSkip$1$1$emit$1.I$0 = i13;
                                    bufferCountKt$bufferSkip$1$1$emit$1.I$1 = i2;
                                    bufferCountKt$bufferSkip$1$1$emit$1.I$2 = i3;
                                    bufferCountKt$bufferSkip$1$1$emit$1.label = 1;
                                    if (flowCollector.emit(list3, bufferCountKt$bufferSkip$1$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    int i20 = i13;
                                    it4 = it;
                                    i19 = i20;
                                    obj5 = obj3;
                                    i18 = i2;
                                    i17 = i3;
                                    Iterator it52 = it4;
                                    i13 = i19;
                                    it = it52;
                                    i3 = i17;
                                    i2 = i18;
                                    obj3 = obj5;
                                    while (it2.hasNext()) {
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    bufferCountKt$bufferSkip$1$1$emit$1 = new BufferCountKt$bufferSkip$1$1$emit$1(this, continuation);
                    Object obj42 = bufferCountKt$bufferSkip$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bufferCountKt$bufferSkip$1$1$emit$1.label;
                    if (i != 0) {
                    }
                case 1:
                    ShareTarget.SaveToPhotos saveToPhotos = (ShareTarget.SaveToPhotos) this.$index;
                    if (continuation instanceof RealShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1) {
                        realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1 = (RealShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1) continuation;
                        int i21 = realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.label;
                        if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                            realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                            Object obj6 = realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                FlowCollector flowCollector3 = (FlowCollector) this.$$this$flow;
                                ShareableAssetsManager$DownloadedImage shareableAssetsManager$DownloadedImage = (ShareableAssetsManager$DownloadedImage) obj3;
                                if (shareableAssetsManager$DownloadedImage instanceof ShareableAssetsManager$DownloadedImage.Success) {
                                    ShareTarget.SaveToPhotos.Content content = new ShareTarget.SaveToPhotos.Content(((ShareableAssetsManager$DownloadedImage.Success) shareableAssetsManager$DownloadedImage).url);
                                    String str3 = saveToPhotos.title;
                                    str3.getClass();
                                    access$assetFailedToLoad = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.SaveToPhotos(str3, content));
                                } else {
                                    if (!(shareableAssetsManager$DownloadedImage instanceof ShareableAssetsManager$DownloadedImage.Failure)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    access$assetFailedToLoad = StuckPlayerDetector.access$assetFailedToLoad((StuckPlayerDetector) this.$buffers, saveToPhotos, (ShareableAssetsManager$DownloadedImage.Failure) shareableAssetsManager$DownloadedImage);
                                }
                                realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.label = 1;
                                if (flowCollector3.emit(access$assetFailedToLoad, realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj6);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1 = new RealShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1(this, continuation);
                    Object obj62 = realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = realShareTargetsManager$addSaveToPhotosTarget$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (continuation instanceof RealShareTargetsManager$addSmsTarget$$inlined$map$1$2$1) {
                        realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1 = (RealShareTargetsManager$addSmsTarget$$inlined$map$1$2$1) continuation;
                        int i22 = realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.label;
                        if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                            realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                FlowCollector flowCollector4 = (FlowCollector) this.$$this$flow;
                                RealShareTargetsManager$TargetPreparationState.Ready ready = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.Sms(((AndroidStringManager) ((StuckPlayerDetector) this.$index).clock).get(R.string.share_sms), new ShareTarget.Sms.Content((String) obj3), (String) this.$buffers));
                                realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(ready, realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj7);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1 = new RealShareTargetsManager$addSmsTarget$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realShareTargetsManager$addSmsTarget$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    ShareTarget shareTarget = (ShareTarget) this.$index;
                    if (continuation instanceof RealShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1) {
                        realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1 = (RealShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1) continuation;
                        int i23 = realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.label;
                        if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                            realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                            Object obj8 = realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                FlowCollector flowCollector5 = (FlowCollector) this.$$this$flow;
                                CurrencyCode currencyCode = (CurrencyCode) obj3;
                                if (shareTarget instanceof ShareTarget.CopyToClipboard) {
                                    AndroidStringManager androidStringManager = (AndroidStringManager) ((StuckPlayerDetector) this.$buffers).clock;
                                    Object[] objArr = {Moneys.symbol(currencyCode)};
                                    Resources resources = androidStringManager.resources;
                                    resources.getClass();
                                    String format2 = new MessageFormat(resources.getString(R.string.cash_tag_copied)).format(objArr);
                                    format2.getClass();
                                    str2 = format2;
                                }
                                ShareTargetsManager$ShareResult.Success success = new ShareTargetsManager$ShareResult.Success(shareTarget.getTitle(), str2);
                                realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.label = 1;
                                if (flowCollector5.emit(success, realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1 = new RealShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realShareTargetsManager$shareTo$lambda$2$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    if (continuation instanceof RealShareableAssetsManager$download$$inlined$map$1$2$1) {
                        realShareableAssetsManager$download$$inlined$map$1$2$1 = (RealShareableAssetsManager$download$$inlined$map$1$2$1) continuation;
                        int i24 = realShareableAssetsManager$download$$inlined$map$1$2$1.label;
                        if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                            realShareableAssetsManager$download$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realShareableAssetsManager$download$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realShareableAssetsManager$download$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                FlowCollector flowCollector6 = (FlowCollector) this.$$this$flow;
                                Uri uri = (Uri) obj3;
                                Object success2 = uri != null ? new ShareableAssetsManager$DownloadedImage.Success(uri) : new ShareableAssetsManager$DownloadedImage.Failure((String) this.$buffers, ((AndroidStringManager) ((HCaptcha) this.$index).onFailureListeners).get(R.string.error_image_loading_failed));
                                realShareableAssetsManager$download$$inlined$map$1$2$1.label = 1;
                                if (flowCollector6.emit(success2, realShareableAssetsManager$download$$inlined$map$1$2$1) == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj9);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShareableAssetsManager$download$$inlined$map$1$2$1 = new RealShareableAssetsManager$download$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = realShareableAssetsManager$download$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realShareableAssetsManager$download$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    Back back = Back.INSTANCE;
                    ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.$buffers;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                    Analytics analytics = (Analytics) shareSheetPresenter.analytics;
                    CoroutineScope coroutineScope = (CoroutineScope) this.$index;
                    ShareSheetViewEvent shareSheetViewEvent = (ShareSheetViewEvent) obj3;
                    if (shareSheetViewEvent instanceof ShareSheetViewEvent.Share) {
                        Object obj10 = ((ShareSheetViewEvent.Share) shareSheetViewEvent).sharingOption.target;
                        Continuation continuation2 = null;
                        ShareTarget shareTarget2 = obj10 instanceof ShareTarget ? (ShareTarget) obj10 : null;
                        ShareTarget.Id id = shareTarget2 != null ? shareTarget2.getId() : null;
                        int i25 = id == null ? -1 : ShareSheetPresenter.WhenMappings.$EnumSwitchMapping$0[id.ordinal()];
                        if (i25 == 1) {
                            analytics.track(new PersonalProfileShareSheetSms(), null);
                        } else if (i25 == 2) {
                            analytics.track(new PersonalProfileShareSheetCopyCashtagLink(), null);
                        } else if (i25 == 3) {
                            analytics.track(new PersonalProfileShareSheetSaveToPhotos(), null);
                        } else if (i25 == 4) {
                            analytics.track(new PersonalProfileShareSheetMore(), null);
                        }
                        JobKt.launch$default(coroutineScope, null, null, new BasicShieetKt$BasicShieet$4$1(shareSheetPresenter, shareSheetViewEvent, (MutableState) this.$$this$flow, continuation2, 13), 3);
                    } else if (Intrinsics.areEqual(shareSheetViewEvent, ShareSheetViewEvent.ShareSuccess.INSTANCE)) {
                        screenNavigator.goTo(back);
                    } else {
                        if (!Intrinsics.areEqual(shareSheetViewEvent, ShareSheetViewEvent.Dismiss.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(back);
                    }
                    return Unit.INSTANCE;
                case 6:
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    MutableState mutableState = (MutableState) this.$buffers;
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), booleanValue, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870910));
                    ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.$index;
                    ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                    if (shoppingWebScreen instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
                        str = ((ShoppingWebScreen.SingleUsePaymentShoppingScreen) shoppingWebScreen).checkoutFlowEndResultData;
                    } else if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                        IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
                        iabMetadata.getClass();
                        str = ((IabMetadata.SUPMetadata) iabMetadata).checkoutFlowEndResultData;
                    } else {
                        str = null;
                    }
                    if (booleanValue) {
                        ShoppingWebPresenter.CartError access$getCartError = ShoppingWebPresenter.access$getCartError(shoppingWebPresenter, (FillrCartInformationExtraction$FillrCartInformation) ((MutableState) this.$$this$flow).getValue(), ((ShoppingWebPresenter.State) mutableState.getValue()).merchantConfig, ((ShoppingWebPresenter.State) mutableState.getValue()).restrictedItemState);
                        PillStage pillStage = access$getCartError == null ? PillStage.SUPPillStage.SetUpPlan.INSTANCE : PillStage.Error.INSTANCE;
                        mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, WebNavigationFooterViewModel.copy$default(((ShoppingWebPresenter.State) mutableState.getValue()).footerViewModel, false, false, new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(pillStage), 11), null, null, null, null, null, null, null, null, false, null, null, access$getCartError, null, false, null, 534773751));
                        if (!((ShoppingWebPresenter.State) mutableState.getValue()).trackedBrowserCheckoutLoad && (pillStage instanceof PillStage.SUPPillStage.SetUpPlan)) {
                            shoppingWebPresenter.analytics.track(shoppingWebPresenter.shoppingWebAnalytics.trackBrowserCheckoutLoad(), null);
                            mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 528482303));
                        }
                    }
                    if (str != null) {
                        ByteString.Companion companion = ByteString.Companion;
                        ByteString decodeBase64 = ByteString.Companion.decodeBase64(str);
                        if (decodeBase64 != null && (issuedCard = (supCreateCardFlowEndResult = (SupCreateCardFlowEndResult) SupCreateCardFlowEndResult.ADAPTER.decode(decodeBase64)).sup_card) != null) {
                            String str4 = issuedCard.expiration;
                            if (!((ShoppingWebPresenter.State) mutableState.getValue()).cardState.cancelled || !Intrinsics.areEqual(((ShoppingWebPresenter.State) mutableState.getValue()).cardState.fullNumber, issuedCard.pan)) {
                                String substring = str4 != null ? str4.substring(2) : null;
                                String substring2 = str4 != null ? str4.substring(0, 2) : null;
                                ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState.getValue();
                                ShoppingWebPresenter.CardState cardState = ((ShoppingWebPresenter.State) mutableState.getValue()).cardState;
                                String str5 = issuedCard.pan;
                                String str6 = issuedCard.last_four;
                                String str7 = issuedCard.security_code;
                                Boolean bool = issuedCard.enabled;
                                bool.getClass();
                                boolean booleanValue2 = bool.booleanValue();
                                String str8 = issuedCard.cardholder_name;
                                cardState.getClass();
                                mutableState.setValue(ShoppingWebPresenter.State.copy$default(state, false, new ShoppingWebPresenter.CardState(str5, str6, substring, substring2, str7, booleanValue2, str8, false, true), null, WebNavigationFooterViewModel.copy$default(((ShoppingWebPresenter.State) mutableState.getValue()).footerViewModel, false, false, new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(PillStage.SUPPillStage.PlanDetails.INSTANCE), 11), null, null, supCreateCardFlowEndResult, null, null, null, null, null, false, null, null, null, null, false, null, 536870773));
                                shoppingWebPresenter.performAutofill(new AutofillWebInfo(((ShoppingWebPresenter.State) mutableState.getValue()).cardState.fullNumber, ((ShoppingWebPresenter.State) mutableState.getValue()).cardState.expiryMonth, ((ShoppingWebPresenter.State) mutableState.getValue()).cardState.expiryYear, ((ShoppingWebPresenter.State) mutableState.getValue()).cardState.cvv, null, null, ((ShoppingWebPresenter.State) mutableState.getValue()).cardState.nameOnCard, null, null, null, null, null, null, null, null, 32688), ShoppingWebPresenter$Companion$FillType.CARD);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 7:
                    InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) this.$buffers;
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.$index;
                    SupportIncidentDetailsViewEvent supportIncidentDetailsViewEvent = (SupportIncidentDetailsViewEvent) obj3;
                    if (supportIncidentDetailsViewEvent instanceof SupportIncidentDetailsViewEvent.Close) {
                        instrumentDetailsPresenter.navigator.goTo(Back.INSTANCE);
                    } else if (supportIncidentDetailsViewEvent instanceof SupportIncidentDetailsViewEvent.UpdateIncidentSubscription) {
                        JobKt.launch$default(coroutineScope2, null, null, new ArticlePresenter$models$1$1(20, (MutableState) this.$$this$flow, instrumentDetailsPresenter, supportIncidentDetailsViewEvent, (Continuation) null), 3);
                    } else {
                        if (!(supportIncidentDetailsViewEvent instanceof SupportIncidentDetailsViewEvent.OpenUrl)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((IntentLauncher) instrumentDetailsPresenter.ioDispatcher).launchUrlInInternalBrowser(((SupportIncidentDetailsViewEvent.OpenUrl) supportIncidentDetailsViewEvent).url);
                    }
                    return Unit.INSTANCE;
                case 8:
                    Back back2 = Back.INSTANCE;
                    SupportPhoneStatusPresenter supportPhoneStatusPresenter = (SupportPhoneStatusPresenter) this.$buffers;
                    BetterNavigator.ScreenNavigator screenNavigator2 = supportPhoneStatusPresenter.navigator;
                    SupportScreens.SupportPhoneStatusScreen supportPhoneStatusScreen = supportPhoneStatusPresenter.args;
                    Analytics analytics2 = supportPhoneStatusPresenter.analytics;
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.$index;
                    SupportPhoneStatusViewEvent supportPhoneStatusViewEvent = (SupportPhoneStatusViewEvent) obj3;
                    if (supportPhoneStatusViewEvent instanceof SupportPhoneStatusViewEvent.Close) {
                        analytics2.track(new CustomerSupportPhoneDismissStatus(supportPhoneStatusScreen.flowToken), null);
                        screenNavigator2.goTo(back2);
                    } else if (supportPhoneStatusViewEvent instanceof SupportPhoneStatusViewEvent.RequestCall) {
                        analytics2.track(new CustomerSupportPhoneCallAgain(supportPhoneStatusScreen.flowToken), null);
                        supportPhoneStatusPresenter.router.route(SupportPhoneStatusPresenter.phoneSupportRoute, new RoutingParams(supportPhoneStatusPresenter.args, BlockersData.AnalyticsData.Source.SUPPORT_PHONE_STATUS.getAnalyticsName(), null, null, null, null, 508));
                        screenNavigator2.goTo(back2);
                    } else {
                        if (!(supportPhoneStatusViewEvent instanceof SupportPhoneStatusViewEvent.Cancel)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope3, null, null, new ShoppingWebBridge$loadUrl$1(supportPhoneStatusPresenter, (MutableState) this.$$this$flow, null, 25), 3);
                    }
                    return Unit.INSTANCE;
                case 9:
                    CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$buffers;
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.$index;
                    if (!Intrinsics.areEqual((TapToPayPaymentViewEvent$Close) obj3, TapToPayPaymentViewEvent$Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope4, null, null, new TapToPayPaymentPresenter$models$2$1(cardLockPresenter, (TapToPayPaymentData) this.$$this$flow, str2, i14), 3);
                    cardLockPresenter.navigator.goTo(Back.INSTANCE);
                    return Unit.INSTANCE;
                case 10:
                    boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                    MutableState mutableState2 = (MutableState) this.$$this$flow;
                    CardLockPresenter cardLockPresenter2 = (CardLockPresenter) this.$index;
                    if (booleanValue3) {
                        Timber.Forest.i("NFC TAG Connected", new Object[0]);
                        ((zzai) cardLockPresenter2.args).notifyCardDetected();
                        mutableState2.setValue(new TapToPayPaymentPresenter$State.ProcessingCardData((RealTagCommunication) this.$buffers));
                    } else {
                        Timber.Forest.e("NFC TAG Connection Failed", new Object[0]);
                        ((zzai) cardLockPresenter2.args).notifyCardError();
                        TapToPayPaymentPresenter$State.FailureReason failureReason = TapToPayPaymentPresenter$State.FailureReason.NFC_TAG_CONNECTION_ERROR;
                        zzai zzaiVar = (zzai) cardLockPresenter2.args;
                        SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) zzaiVar.zab, null, "get_packaged_logs", null, null, 12);
                        try {
                            Lazy lazy = (Lazy) ((AssetPublicSuffixList) zzaiVar.zad).path;
                            synchronized (lazy.value) {
                                list = CollectionsKt.toList((ArrayDeque) lazy.initializer);
                            }
                            String joinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63);
                            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                            mutableState2.setValue(new TapToPayPaymentPresenter$State.RetryableFailure(failureReason, null, joinToString$default, 2));
                        } catch (Throwable th) {
                            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    byte[] bArr = (byte[]) obj3;
                    Timber.Forest.i("Communicating Command APDU", new Object[0]);
                    RealTagCommunication realTagCommunication = ((TapToPayPaymentPresenter$State.ProcessingCardData) ((TapToPayPaymentPresenter$State) this.$index)).tag;
                    bArr.getClass();
                    Object collect = FlowKt.flowOn(new FinishSetupTileBadgeCounter(21, new SafeFlow(new ArticlePresenter$models$1$1(realTagCommunication, bArr, null)), new RealBugReportSender$copyDatabase$3(i12, str2, 6)), realTagCommunication.ioContext).collect(new TapToPayPaymentPresenter$models$4$3$1((CardLockPresenter) this.$buffers, (MutableState) this.$$this$flow), continuation);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
                case 12:
                    if (continuation instanceof RealTransactionLoader$getTransactions$$inlined$map$1$2$1) {
                        realTransactionLoader$getTransactions$$inlined$map$1$2$1 = (RealTransactionLoader$getTransactions$$inlined$map$1$2$1) continuation;
                        int i26 = realTransactionLoader$getTransactions$$inlined$map$1$2$1.label;
                        if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                            realTransactionLoader$getTransactions$$inlined$map$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                            Object obj11 = realTransactionLoader$getTransactions$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realTransactionLoader$getTransactions$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                FlowCollector flowCollector7 = (FlowCollector) this.$$this$flow;
                                PagingData pagingData = (PagingData) obj3;
                                TaxWebAppBridge.AnonymousClass4 anonymousClass4 = new TaxWebAppBridge.AnonymousClass4((MarkwonConfiguration) this.$index, (ZiplineHistoryDataJavaScripter) this.$buffers, (Continuation) str2, 15);
                                pagingData.getClass();
                                PagingData pagingData2 = new PagingData(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(pagingData.flow, anonymousClass4, i14), pagingData.uiReceiver, pagingData.hintReceiver, PagingData.AnonymousClass1.INSTANCE);
                                realTransactionLoader$getTransactions$$inlined$map$1$2$1.label = 1;
                                if (flowCollector7.emit(pagingData2, realTransactionLoader$getTransactions$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj11);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realTransactionLoader$getTransactions$$inlined$map$1$2$1 = new RealTransactionLoader$getTransactions$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = realTransactionLoader$getTransactions$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realTransactionLoader$getTransactions$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    if (continuation instanceof RealTransactionLoader$getTransactions$$inlined$map$2$2$1) {
                        realTransactionLoader$getTransactions$$inlined$map$2$2$1 = (RealTransactionLoader$getTransactions$$inlined$map$2$2$1) continuation;
                        int i27 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.label;
                        if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                            realTransactionLoader$getTransactions$$inlined$map$2$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                FlowCollector flowCollector8 = (FlowCollector) this.$$this$flow;
                                CoroutineContext coroutineContext = (CoroutineContext) ((MarkwonConfiguration) this.$index).syntaxHighlight;
                                WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1((PagingData) obj3, (Query) this.$buffers, str2, 8);
                                realTransactionLoader$getTransactions$$inlined$map$2$2$1.L$4 = flowCollector8;
                                realTransactionLoader$getTransactions$$inlined$map$2$2$1.I$0 = 0;
                                realTransactionLoader$getTransactions$$inlined$map$2$2$1.label = 1;
                                Object withContext = JobKt.withContext(coroutineContext, workflowNode$tick$1$1, realTransactionLoader$getTransactions$$inlined$map$2$2$1);
                                if (withContext != coroutineSingletons8) {
                                    obj12 = withContext;
                                    flowCollector2 = flowCollector8;
                                }
                                return coroutineSingletons8;
                            }
                            if (i9 != 1) {
                                if (i9 == 2) {
                                    SafeTrace.throwOnFailure(obj12);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i11 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.I$0;
                            flowCollector2 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.L$4;
                            SafeTrace.throwOnFailure(obj12);
                            realTransactionLoader$getTransactions$$inlined$map$2$2$1.L$4 = null;
                            realTransactionLoader$getTransactions$$inlined$map$2$2$1.I$0 = i11;
                            realTransactionLoader$getTransactions$$inlined$map$2$2$1.label = 2;
                            break;
                        }
                    }
                    realTransactionLoader$getTransactions$$inlined$map$2$2$1 = new RealTransactionLoader$getTransactions$$inlined$map$2$2$1(this, continuation);
                    Object obj122 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realTransactionLoader$getTransactions$$inlined$map$2$2$1.label;
                    if (i9 != 0) {
                    }
                    realTransactionLoader$getTransactions$$inlined$map$2$2$1.L$4 = null;
                    realTransactionLoader$getTransactions$$inlined$map$2$2$1.I$0 = i11;
                    realTransactionLoader$getTransactions$$inlined$map$2$2$1.label = 2;
                case 14:
                    return emit$com$squareup$cash$transfers$presenters$RecurringReloadConfigurationPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 15:
                    TransferManager.TransferAction transferAction = (TransferManager.TransferAction) obj3;
                    n nVar = (n) this.$index;
                    FlowStarter flowStarter = (FlowStarter) nVar.c;
                    Screen screen = (Screen) this.$buffers;
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) this.$$this$flow;
                    if (transferAction instanceof TransferManager.TransferAction.HandleBlocker) {
                        screenNavigator3.goTo(((BlockersDataNavigator) nVar.b).getNext(screen, ((TransferManager.TransferAction.HandleBlocker) transferAction).blockersData));
                    } else if (transferAction instanceof TransferManager.TransferAction.HandleError) {
                        screenNavigator3.goTo(((RealFlowStarter) flowStarter).startOfflineErrorTransfersFlow(((TransferManager.TransferAction.HandleError) transferAction).errorResult, screen));
                    } else if (transferAction instanceof TransferManager.TransferAction.SendTransfer) {
                        BlockersData blockersData = ((TransferManager.TransferAction.SendTransfer) transferAction).blockersData;
                        TransferData transferData = blockersData.transferData;
                        transferData.getClass();
                        if (transferData.grandfathered || Intrinsics.areEqual(transferData.showConfirmationDialog, Boolean.TRUE)) {
                            screenNavigator3.goTo(new ConfirmCashOutScreen(blockersData));
                        } else {
                            screenNavigator3.goTo(new BlockersScreens.BalanceTransferLoading(blockersData));
                        }
                    } else {
                        if (!(transferAction instanceof TransferManager.TransferAction.HandleResult)) {
                            a$$ExternalSyntheticBUOutline0.m$1(Boxes$$ExternalSyntheticOutline1.m((Class) transferAction.getClass(), "Unexpected action "));
                            return null;
                        }
                        ResponseContext responseContext = ((TransferManager.TransferAction.HandleResult) transferAction).result.responseContext;
                        Transfer transfer = responseContext.transfer;
                        transfer.getClass();
                        if (transfer.state != Transfer.State.COMPLETE) {
                            StatusResult statusResult = responseContext.status_result;
                            statusResult.getClass();
                            screenNavigator3.goTo(FlowStarter.startStatusResultFlow$default(flowStarter, statusResult, EmptyList.INSTANCE, screen, null, null, 56));
                        }
                    }
                    return Unit.INSTANCE;
                case 16:
                    BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj3;
                    WalletHomeScreen walletHomeScreen = (WalletHomeScreen) this.$$this$flow;
                    CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.$buffers;
                    Function1 function1 = (Function1) this.$index;
                    if (Intrinsics.areEqual(blockersAction, BlockersHelper.BlockersAction.DisableControl.INSTANCE)) {
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                    } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                        cardSchemePresenter.toaster.makeToast(((BlockersHelper.BlockersAction.ShowError) blockersAction).message, Toaster$Length.SHORT);
                    } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                        Screen screen2 = ((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen;
                        if (Intrinsics.areEqual(screen2, walletHomeScreen)) {
                            cardSchemePresenter.copyId$delegate.setValue(walletHomeScreen.copyId);
                            if (function1 != null) {
                                function1.invoke(Boolean.FALSE);
                            }
                        } else {
                            cardSchemePresenter.navigator.goTo(screen2);
                        }
                    } else if (function1 != null) {
                        BlockersHelper.BlockersAction.ToggleSpinner toggleSpinner = blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner ? (BlockersHelper.BlockersAction.ToggleSpinner) blockersAction : null;
                        if (toggleSpinner != null && toggleSpinner.show) {
                            z = true;
                        }
                        function1.invoke(Boolean.valueOf(z));
                    }
                    return Unit.INSTANCE;
                case 17:
                    MutableState mutableState3 = (MutableState) this.$$this$flow;
                    CardSchemePresenter cardSchemePresenter2 = (CardSchemePresenter) this.$buffers;
                    Analytics analytics3 = cardSchemePresenter2.analytics;
                    RealWalletAnalyticsHelper realWalletAnalyticsHelper = cardSchemePresenter2.analyticsHelper;
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.$index;
                    PresenterEvents presenterEvents = (PresenterEvents) obj3;
                    if (presenterEvents instanceof PresenterEvents.NextUpCardClicked) {
                        CardSchemePresenter.NextUpEventMetadata nextUpEventMetadata = (CardSchemePresenter.NextUpEventMetadata) ((Map) mutableState3.getValue()).get(((PresenterEvents.NextUpCardClicked) presenterEvents).actionId);
                        if (nextUpEventMetadata != null && (cardElementAction = nextUpEventMetadata.enabledAction) != null) {
                            WalletAnalyticsHelper$Flow[] walletAnalyticsHelper$FlowArr = WalletAnalyticsHelper$Flow.$VALUES;
                            String flowToken = realWalletAnalyticsHelper.getFlowToken();
                            String str9 = nextUpEventMetadata.candidateId;
                            Integer valueOf = Integer.valueOf(nextUpEventMetadata.candidateRank);
                            String str10 = nextUpEventMetadata.title;
                            CardModule.CardElementAction cardElementAction2 = nextUpEventMetadata.configuredAction;
                            String actionType2 = CardSchemePresenter.getActionType(cardElementAction2);
                            if (cardElementAction2 != null && (zzkkVar2 = cardElementAction2.f1331type) != null) {
                                CardModule$CardElementAction$Type$DoClientRoute cardModule$CardElementAction$Type$DoClientRoute = zzkkVar2 instanceof CardModule$CardElementAction$Type$DoClientRoute ? (CardModule$CardElementAction$Type$DoClientRoute) zzkkVar2 : null;
                                CardModule.CardElementAction.DoClientRoute doClientRoute = cardModule$CardElementAction$Type$DoClientRoute != null ? cardModule$CardElementAction$Type$DoClientRoute.value : null;
                                if (doClientRoute != null) {
                                    actionType = doClientRoute.url;
                                    break;
                                }
                            }
                            if (cardElementAction2 != null && (zzkkVar = cardElementAction2.f1331type) != null) {
                                CardModule$CardElementAction$Type$DoClientScenario cardModule$CardElementAction$Type$DoClientScenario = zzkkVar instanceof CardModule$CardElementAction$Type$DoClientScenario ? (CardModule$CardElementAction$Type$DoClientScenario) zzkkVar : null;
                                CardModule.CardElementAction.DoClientScenario doClientScenario = cardModule$CardElementAction$Type$DoClientScenario != null ? cardModule$CardElementAction$Type$DoClientScenario.value : null;
                                if (doClientScenario != null && (clientScenario = doClientScenario.client_scenario) != null) {
                                    actionType = clientScenario.name();
                                    analytics3.track(new CashCardNextUpClick(valueOf, str9, flowToken, str10, actionType2, actionType), null);
                                    JobKt.launch$default(coroutineScope5, null, null, new CardSchemePresenter$models$2$1(cardSchemePresenter2, cardElementAction, str2, i11), 3);
                                }
                            }
                            actionType = CardSchemePresenter.getActionType(cardElementAction2);
                            analytics3.track(new CashCardNextUpClick(valueOf, str9, flowToken, str10, actionType2, actionType), null);
                            JobKt.launch$default(coroutineScope5, null, null, new CardSchemePresenter$models$2$1(cardSchemePresenter2, cardElementAction, str2, i11), 3);
                        }
                    } else if (presenterEvents instanceof PresenterEvents.NextUpCardViewed) {
                        CardSchemePresenter.NextUpEventMetadata nextUpEventMetadata2 = (CardSchemePresenter.NextUpEventMetadata) ((Map) mutableState3.getValue()).get(((PresenterEvents.NextUpCardViewed) presenterEvents).actionId);
                        if (nextUpEventMetadata2 != null) {
                            WalletAnalyticsHelper$Flow[] walletAnalyticsHelper$FlowArr2 = WalletAnalyticsHelper$Flow.$VALUES;
                            CashCardNextUpView cashCardNextUpView = new CashCardNextUpView(Integer.valueOf(nextUpEventMetadata2.candidateRank), nextUpEventMetadata2.candidateId, realWalletAnalyticsHelper.getFlowToken(), nextUpEventMetadata2.title, CardSchemePresenter.getActionType(nextUpEventMetadata2.configuredAction));
                            HashSet hashSet = realWalletAnalyticsHelper.trackedImpressionEvents;
                            if (!hashSet.contains(cashCardNextUpView)) {
                                hashSet.add(cashCardNextUpView);
                                realWalletAnalyticsHelper.analytics.track(cashCardNextUpView, null);
                            }
                        }
                    } else if (presenterEvents instanceof PresenterEvents.NextUpCardDismissed) {
                        PresenterEvents.NextUpCardDismissed nextUpCardDismissed = (PresenterEvents.NextUpCardDismissed) presenterEvents;
                        CardSchemePresenter.NextUpEventMetadata nextUpEventMetadata3 = (CardSchemePresenter.NextUpEventMetadata) ((Map) mutableState3.getValue()).get(nextUpCardDismissed.actionId);
                        if (nextUpEventMetadata3 != null) {
                            NextUpDismissMethod nextUpDismissMethod = nextUpCardDismissed.method;
                            WalletAnalyticsHelper$Flow[] walletAnalyticsHelper$FlowArr3 = WalletAnalyticsHelper$Flow.$VALUES;
                            String flowToken2 = realWalletAnalyticsHelper.getFlowToken();
                            String str11 = nextUpEventMetadata3.candidateId;
                            Integer valueOf2 = Integer.valueOf(nextUpEventMetadata3.candidateRank);
                            String str12 = nextUpEventMetadata3.title;
                            String actionType3 = CardSchemePresenter.getActionType(nextUpEventMetadata3.configuredAction);
                            int ordinal = nextUpDismissMethod.ordinal();
                            if (ordinal == 0) {
                                dismissMethod = CashCardNextUpDismiss.DismissMethod.SWIPE;
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                dismissMethod = CashCardNextUpDismiss.DismissMethod.ACCESSIBILITY_ACTION;
                            }
                            analytics3.track(new CashCardNextUpDismiss(str11, flowToken2, valueOf2, str12, actionType3, dismissMethod), null);
                        }
                        RealNextUpCandidateDismisser realNextUpCandidateDismisser = cardSchemePresenter2.nextUpCandidateDismisser;
                        String str13 = nextUpCardDismissed.id;
                        StateFlowImpl stateFlowImpl = realNextUpCandidateDismisser.mutableDismissedItemIds;
                        do {
                            value = stateFlowImpl.getValue();
                        } while (!stateFlowImpl.compareAndSet(value, SetsKt___SetsKt.plus((Set) value, str13)));
                        JobKt.launch$default(realNextUpCandidateDismisser.scope, realNextUpCandidateDismisser.ioContext, null, new TimerWorker$run$1(realNextUpCandidateDismisser, str13, str2, i13), 2);
                    }
                    return Unit.INSTANCE;
                case 18:
                    Triple triple = (Triple) obj3;
                    RealDeviceLockAnimationBus realDeviceLockAnimationBus = ((CardSchemePresenter) this.$$this$flow).deviceLockAnimationBus;
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$buffers;
                    Map map = (Map) triple.first;
                    Boolean bool2 = (Boolean) triple.second;
                    Set<String> set2 = (Set) triple.third;
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.$index;
                    Map map2 = (Map) ref$ObjectRef2.element;
                    if (!set2.isEmpty() && map2 != null) {
                        for (String str14 : set2) {
                            if (Intrinsics.areEqual(str14, "card")) {
                                Object obj13 = ref$ObjectRef.element;
                                if (obj13 != null && !obj13.equals(bool2)) {
                                    realDeviceLockAnimationBus.onToggleCompleted(str14);
                                }
                            } else if (map2.containsKey(str14) && !Intrinsics.areEqual(map2.get(str14), map.get(str14))) {
                                realDeviceLockAnimationBus.onToggleCompleted(str14);
                            }
                        }
                    }
                    ref$ObjectRef2.element = map;
                    ref$ObjectRef.element = bool2;
                    return Unit.INSTANCE;
                case 19:
                    PresenterEvents.PageChanged pageChanged = (PresenterEvents.PageChanged) obj3;
                    ((ParcelableSnapshotMutableIntState) this.$buffers).setIntValue(pageChanged.page);
                    CashAppTag cashAppTag = (CashAppTag) CollectionsKt.getOrNull(pageChanged.page - 1, (List) ((MutableState) this.$$this$flow).getValue());
                    if (cashAppTag != null) {
                        Analytics analytics4 = ((CardSchemePresenter) this.$index).analytics;
                        TagFormFactor tagFormFactor = cashAppTag.formFactor;
                        if (tagFormFactor != null) {
                            int ordinal2 = tagFormFactor.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        if (ordinal2 != 3) {
                                            if (ordinal2 != 4) {
                                                if (ordinal2 != 5) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                    deviceType2 = DeviceType.MINI_CARD;
                                    deviceType = deviceType2;
                                }
                                deviceType2 = DeviceType.HEART;
                                deviceType = deviceType2;
                            }
                            deviceType2 = DeviceType.WAND;
                            deviceType = deviceType2;
                        } else {
                            deviceType = null;
                        }
                        String str15 = cashAppTag.deviceId;
                        LifecycleState lifecycleState = CashAppTagKt.isActive(cashAppTag) ? LifecycleState.ACTIVE : LifecycleState.INACTIVE;
                        Boolean bool3 = cashAppTag.isLocked;
                        analytics4.track(new MintTagStateViewed(deviceType, str15, lifecycleState, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), Boolean.valueOf(cashAppTag.isSponsorLocked)), null);
                    }
                    return Unit.INSTANCE;
                case 20:
                    return emit$com$squareup$cash$work$presenters$pay$PayHistoryListPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 21:
                    return emit$com$squareup$cash$work$webview$presenters$WorkWebPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 22:
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.$index;
                    if (continuation instanceof FlowExtensionsKt$zipWithNext$1$1$emit$1) {
                        flowExtensionsKt$zipWithNext$1$1$emit$1 = (FlowExtensionsKt$zipWithNext$1$1$emit$1) continuation;
                        int i28 = flowExtensionsKt$zipWithNext$1$1$emit$1.label;
                        if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                            flowExtensionsKt$zipWithNext$1$1$emit$1.label = i28 - PKIFailureInfo.systemUnavail;
                            Object obj14 = flowExtensionsKt$zipWithNext$1$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = flowExtensionsKt$zipWithNext$1$1$emit$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                Object obj15 = ref$ObjectRef3.element;
                                if (obj15 != UNDEFINED.INSTANCE) {
                                    FlowCollector flowCollector9 = (FlowCollector) this.$$this$flow;
                                    Object invoke = ((Function2) this.$buffers).invoke(obj15, obj3);
                                    flowExtensionsKt$zipWithNext$1$1$emit$1.L$0 = obj3;
                                    flowExtensionsKt$zipWithNext$1$1$emit$1.label = 1;
                                    if (flowCollector9.emit(invoke, flowExtensionsKt$zipWithNext$1$1$emit$1) == coroutineSingletons9) {
                                        return coroutineSingletons9;
                                    }
                                }
                                obj2 = obj3;
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj2 = flowExtensionsKt$zipWithNext$1$1$emit$1.L$0;
                                SafeTrace.throwOnFailure(obj14);
                            }
                            ref$ObjectRef3.element = obj2;
                            return Unit.INSTANCE;
                        }
                    }
                    flowExtensionsKt$zipWithNext$1$1$emit$1 = new FlowExtensionsKt$zipWithNext$1$1$emit$1(this, continuation);
                    Object obj142 = flowExtensionsKt$zipWithNext$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = flowExtensionsKt$zipWithNext$1$1$emit$1.label;
                    if (i10 != 0) {
                    }
                    ref$ObjectRef3.element = obj2;
                    return Unit.INSTANCE;
                case 23:
                    return emit$com$stripe$android$financialconnections$navigation$bottomsheet$SheetContentHostKt$SheetContentHost$1$1$2(obj, continuation);
                default:
                    Object withContextUndispatched = CombineKt.withContextUndispatched((CoroutineContext) this.$index, obj3, this.$buffers, (SequentialStateFlow$collect$2) this.$$this$flow, continuation);
                    return withContextUndispatched == CoroutineSingletons.COROUTINE_SUSPENDED ? withContextUndispatched : Unit.INSTANCE;
            }
        }

        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector, Function2 function2) {
            this.$r8$classId = 22;
            this.$index = ref$ObjectRef;
            this.$$this$flow = flowCollector;
            this.$buffers = function2;
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, Object obj, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.$index = moleculePresenter;
            this.$buffers = obj;
            this.$$this$flow = mutableState;
        }

        public AnonymousClass1(CoroutineScope coroutineScope, CardLockPresenter cardLockPresenter, TapToPayPaymentData tapToPayPaymentData, MutableState mutableState, MutableState mutableState2) {
            this.$r8$classId = 9;
            this.$buffers = cardLockPresenter;
            this.$$this$flow = tapToPayPaymentData;
            this.$index = coroutineScope;
        }

        public /* synthetic */ AnonymousClass1(FlowCollector flowCollector, Object obj, Object obj2, int i) {
            this.$r8$classId = i;
            this.$$this$flow = flowCollector;
            this.$index = obj;
            this.$buffers = obj2;
        }

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2, Object obj3) {
            this.$r8$classId = i;
            this.$buffers = obj2;
            this.$$this$flow = obj3;
            this.$index = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCountKt$bufferSkip$1(List list, Continuation continuation, ProfileNotificationsPresenter profileNotificationsPresenter) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.L$1 = list;
        this.L$4 = profileNotificationsPresenter;
    }
}
