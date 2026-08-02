package com.squareup.cash.tax.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.gridlayout.widget.GridLayout;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.viewbinding.ViewBindings;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.google.android.gms.maps.zzai;
import com.google.firebase.messaging.RemoteMessage;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.cashapppay.CashAppPayAuthGetResponse;
import com.squareup.cash.cdf.customersupport.Channel;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessComplete;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenNode;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessSelectTransaction;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactSubmitContactError;
import com.squareup.cash.cdf.customersupport.CustomerSupportFullTransactionPickerSelectTransaction;
import com.squareup.cash.cdf.customersupport.FullTransactionPickerOrigin;
import com.squareup.cash.cdf.taptopay.FlowType;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationRequestComplete;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationRequestFailure;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkFailure;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.shopping.backend.api.SheetDetails;
import com.squareup.cash.shopping.backend.real.RealShopHubRepository;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.presenters.ShoppingInfoSheetPresenter;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.viewmodels.InjectJavascriptViewModel$InjectJsViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingJavascriptViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.api.SupportEmailValidationService$EmailValidationResult;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.RealSupportEmailValidationService;
import com.squareup.cash.support.backend.real.RealSupportStatus;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.api.ChatSurvey;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.real.ChatSavedInputPreference;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.support.chat.presenters.ChatExitPromptSheetState;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.RealContactSupportNavigator;
import com.squareup.cash.support.presenters.RealSupportLinkNavigator;
import com.squareup.cash.support.presenters.SupportActivityItemPresenter;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.supportarticles.app.v1.AppSupportArticleService;
import com.squareup.cash.supportarticles.app.v1.ListSupportArticlesRequest;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentAcceptance;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$models$4$3$1;
import com.squareup.cash.taptopay.screens.TapToPayErrorReason;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewModel;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkAuthenticationParamsSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkInitializationSpan;
import com.squareup.cash.threedsdataonly.backend.api.Transaction$AuthenticationRequestParameters;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.cash.treehouse.activity.SerializableRenderedActivityItem;
import com.squareup.cash.ui.gcm.DebugPushPayloadStore;
import com.squareup.cash.ui.gcm.PushMessagingService;
import com.squareup.cash.upsell.presenters.NullStateCarouselPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter$Companion$WhenMappings;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationResponse;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.taply.plasma.flows.v1.LockPaymentTokenDeviceFlowParameters;
import com.squareup.protos.cash.taply.plasma.flows.v1.UnlockPaymentTokenDeviceFlowParameters;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ApproveCashAppPayRequest;
import com.squareup.protos.franklin.app.ApproveCashAppPayResponse;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.SelectActivityResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import org.json.JSONObject;
import papa.SafeTrace;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class TaxWebAppPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $taxViewModel$delegate;
    public Object $url;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(VariantSandboxedComponent variantSandboxedComponent, CoroutineScope coroutineScope, Continuation continuation, RemoteMessage remoteMessage, PushMessagingService pushMessagingService) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.$taxViewModel$delegate = variantSandboxedComponent;
        this.this$0 = remoteMessage;
        this.$url = pushMessagingService;
        this.L$0 = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r9.emit(r1, r16) == r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r0 == r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r9.emit(r1, r16) == r11) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$transactionpicker$blocker$presenters$UnifiedActivityPickerBlockerPresenter$handleEvent$1(Object obj) {
        Object trackBlockerSubmissionAnalytics$default;
        ApiResult apiResult;
        ActivityItem activityItem = (ActivityItem) this.$url;
        UnifiedActivityPickerBlockerPresenter unifiedActivityPickerBlockerPresenter = (UnifiedActivityPickerBlockerPresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = unifiedActivityPickerBlockerPresenter.navigator;
        AndroidStringManager androidStringManager = unifiedActivityPickerBlockerPresenter.stringManager;
        Analytics analytics = unifiedActivityPickerBlockerPresenter.analytics;
        SharedFlowImpl sharedFlowImpl = unifiedActivityPickerBlockerPresenter.submittingStateSharedFlow;
        BlockersScreens.ActivityPickerScreen activityPickerScreen = unifiedActivityPickerBlockerPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        Object[] objArr = 0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (Intrinsics.areEqual((ActivityItemViewEvent) this.$taxViewModel$delegate, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                UnifiedActivityPickerBlockerPresenter.SubmitState submitState = UnifiedActivityPickerBlockerPresenter.SubmitState.SUBMITTING;
                this.label = 1;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                apiResult = (ApiResult) this.L$0;
                SafeTrace.throwOnFailure(obj);
                if (apiResult instanceof ApiResult.Success) {
                    BlockersData blockersData = activityPickerScreen.blockersData;
                    ResponseContext responseContext = ((SelectActivityResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(unifiedActivityPickerBlockerPresenter.blockersNavigator.getNext(activityPickerScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(new FailureMessageBlockerScreen(activityPickerScreen.blockersData, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, str, 4));
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            trackBlockerSubmissionAnalytics$default = obj;
            apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
            UnifiedActivityPickerBlockerPresenter.SubmitState submitState2 = UnifiedActivityPickerBlockerPresenter.SubmitState.IDLE;
            this.L$0 = apiResult;
            this.label = 3;
        }
        analytics.track(new CustomerSupportFullTransactionPickerSelectTransaction(activityPickerScreen.blockersData.flowToken, ActivityItemKt.getItemId(activityItem), FullTransactionPickerOrigin.BLOCKER), null);
        BlockersData blockersData2 = activityPickerScreen.blockersData;
        RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(unifiedActivityPickerBlockerPresenter, activityItem, objArr == true ? 1 : 0, 21);
        this.label = 2;
        trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, this, null, anonymousClass1);
    }

    private final Object invokeSuspend$com$squareup$cash$transfers$presenters$BalanceBasedAutoReloadConfirmationPresenter$models$3$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) this.this$0;
            Money money = (Money) ((MutableState) this.L$0).getValue();
            Money money2 = (Money) ((MutableState) this.$taxViewModel$delegate).getValue();
            this.label = 1;
            obj = InstrumentDetailsPresenter.access$submitBlocker(instrumentDetailsPresenter, money, money2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            ((MutableState) this.$url).setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$treehouse$activity$HostActivityDataBridge$applyDynamicFormatting$3(Object obj) {
        ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        SerializableActivityItem serializableActivityItem = (SerializableActivityItem) this.$taxViewModel$delegate;
        SerializableRenderedActivityItem serializableRenderedActivityItem = (SerializableRenderedActivityItem) this.this$0;
        String str = (String) this.$url;
        this.L$0 = null;
        this.label = 1;
        Object applyDynamicFormatting = activityDataBridge.applyDynamicFormatting(serializableActivityItem, serializableRenderedActivityItem, str, this);
        return applyDynamicFormatting == coroutineSingletons ? coroutineSingletons : applyDynamicFormatting;
    }

    private final Object invokeSuspend$com$squareup$cash$ui$gcm$PushMessagingService$onMessageReceivedSuspend$$inlined$onSingleSandbox$1$1$1(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.$taxViewModel$delegate;
                AtomicBoolean atomicBoolean = DebugPushPayloadStore.enabled;
                String jSONObject = new JSONObject(((RemoteMessage) this.this$0).getData()).toString();
                jSONObject.getClass();
                if (DebugPushPayloadStore.enabled.get()) {
                    DebugPushPayloadStore.lastPayload = jSONObject;
                }
                if (!PushMessagingService.access$tryHandleBrazePush((PushMessagingService) this.$url, (RemoteMessage) this.this$0, variantSandboxedComponent) && (str = (String) ((RemoteMessage) this.this$0).getData().get("data")) != null) {
                    zzai actor = ((VariantSandboxedComponent.Impl) variantSandboxedComponent).actor();
                    this.label = 1;
                    if (actor.onMessageReceived(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            JobKt.cancel((CoroutineScope) this.L$0, (CancellationException) null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            JobKt.cancel((CoroutineScope) this.L$0, (CancellationException) null);
            throw th;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$upsell$presenters$NullStateCarouselPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$taxViewModel$delegate;
            TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope, (NullStateCarouselPresenter) this.this$0, (State) this.$url, 25);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(taxWebAppBridge$openTakePhoto$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$presenters$CardLockPresenter$models$1$1$result$1(Object obj) {
        GetFlowRequest getFlowRequest;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RequestContext requestContext = null;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        AppService appService = (AppService) ((CardLockPresenter) this.L$0).franklinAppService;
        String str = (String) this.$url;
        Flow$Type flow$Type = (Flow$Type) this.$taxViewModel$delegate;
        BlockersData blockersData = (BlockersData) this.this$0;
        str.getClass();
        flow$Type.getClass();
        if (str.equals("card")) {
            getFlowRequest = new GetFlowRequest(requestContext, new GetFlowRequest.Input.FlowType(flow$Type), 5);
        } else {
            getFlowRequest = new GetFlowRequest(blockersData.requestContext, new GetFlowRequest.Input.InitiationData(ViewBindings.buildInitiationData(flow$Type, CardLockPresenter$Companion$WhenMappings.$EnumSwitchMapping$0[flow$Type.ordinal()] == 1 ? new LockPaymentTokenDeviceFlowParameters(str, ByteString.EMPTY) : new UnlockPaymentTokenDeviceFlowParameters(str, null, ByteString.EMPTY))), 4);
        }
        GetFlowRequest getFlowRequest2 = getFlowRequest;
        this.label = 1;
        Object flow = appService.getFlow("/2.0/cash/get-flow", null, null, getFlowRequest2, this);
        return flow == coroutineSingletons ? coroutineSingletons : flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new TaxWebAppPresenter$models$1$1(0, (MutableState) this.$taxViewModel$delegate, (TaxWebAppPresenter) this.this$0, (String) this.$url, continuation);
            case 1:
                return new TaxWebAppPresenter$models$1$1((RealShoppingJavascriptPresenter) this.$taxViewModel$delegate, (ShoppingWebViewEvent.PayKitShopViewEvent) this.this$0, (Integer) this.$url, (MutableState) this.L$0, continuation);
            case 2:
                return new TaxWebAppPresenter$models$1$1((ShoppingInfoSheetPresenter) this.$url, (MutableState) this.$taxViewModel$delegate, continuation);
            case 3:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$1 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 3);
                taxWebAppPresenter$models$1$1.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$1;
            case 4:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$12 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 4);
                taxWebAppPresenter$models$1$12.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$12;
            case 5:
                return new TaxWebAppPresenter$models$1$1((RealArticlesService) this.L$0, (String) this.$url, (String) this.$taxViewModel$delegate, (ArrayList) this.this$0, continuation, 5);
            case 6:
                return new TaxWebAppPresenter$models$1$1((RealPendingMessagesStore) this.L$0, (String) this.$url, (PendingMessage) this.$taxViewModel$delegate, (String) this.this$0, continuation, 6);
            case 7:
                return new TaxWebAppPresenter$models$1$1((PoolsListPresenter) this.L$0, (ShiftNotePresenter$models$1$1) this.$taxViewModel$delegate, (ShiftNotePresenter$models$1$1) this.this$0, continuation);
            case 8:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$13 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 8);
                taxWebAppPresenter$models$1$13.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$13;
            case 9:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$14 = new TaxWebAppPresenter$models$1$1((String) this.$url, continuation, (ChatPresenter) this.this$0, (MutableState) this.L$0);
                taxWebAppPresenter$models$1$14.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$14;
            case 10:
                return new TaxWebAppPresenter$models$1$1(10, (MutableState) this.$taxViewModel$delegate, (ChatPresenter) this.this$0, (ChatViewEvent) this.$url, continuation);
            case 11:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$15 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 11);
                taxWebAppPresenter$models$1$15.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$15;
            case 12:
                return new TaxWebAppPresenter$models$1$1((Retrofit.Builder) this.$taxViewModel$delegate, (Screen) this.this$0, continuation);
            case 13:
                return new TaxWebAppPresenter$models$1$1((ArticlePresenter) this.this$0, (ArticleViewEvent) this.$url, (MutableState) this.L$0, (MutableState) this.$taxViewModel$delegate, continuation, 13);
            case 14:
                return new TaxWebAppPresenter$models$1$1((WorkHomePresenter) this.this$0, (ContactSupportEmailInputViewEvent) this.$url, (MutableState) this.L$0, (MutableState) this.$taxViewModel$delegate, continuation, 14);
            case 15:
                return new TaxWebAppPresenter$models$1$1((ActivityItemViewEvent) this.$taxViewModel$delegate, (SupportActivityItemPresenter) this.this$0, (ActivityItem) this.$url, continuation, 15);
            case 16:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$16 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 16);
                taxWebAppPresenter$models$1$16.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$16;
            case 17:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$17 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 17);
                taxWebAppPresenter$models$1$17.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$17;
            case 18:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$18 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 18);
                taxWebAppPresenter$models$1$18.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$18;
            case 19:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$19 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 19);
                taxWebAppPresenter$models$1$19.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$19;
            case 20:
                return new TaxWebAppPresenter$models$1$1((LocalEditorialPresenter) this.$url, (MutableState) this.L$0, (MutableState) this.$taxViewModel$delegate, continuation);
            case 21:
                return new TaxWebAppPresenter$models$1$1((ThreeDsPresenter) this.this$0, (Job) this.$url, (MutableState) this.L$0, continuation);
            case 22:
                return new TaxWebAppPresenter$models$1$1((ActivityItemViewEvent) this.$taxViewModel$delegate, (UnifiedActivityPickerBlockerPresenter) this.this$0, (ActivityItem) this.$url, continuation, 22);
            case 23:
                return new TaxWebAppPresenter$models$1$1((InstrumentDetailsPresenter) this.this$0, (MutableState) this.L$0, (MutableState) this.$taxViewModel$delegate, (MutableState) this.$url, continuation);
            case 24:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$110 = new TaxWebAppPresenter$models$1$1((Flow) this.$taxViewModel$delegate, continuation, (PoolsListPresenter) this.this$0, (CoroutineScope) this.$url, 24);
                taxWebAppPresenter$models$1$110.L$0 = obj;
                return taxWebAppPresenter$models$1$110;
            case 25:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$111 = new TaxWebAppPresenter$models$1$1((SerializableActivityItem) this.$taxViewModel$delegate, (SerializableRenderedActivityItem) this.this$0, (String) this.$url, continuation, 25);
                taxWebAppPresenter$models$1$111.L$0 = obj;
                return taxWebAppPresenter$models$1$111;
            case 26:
                return new TaxWebAppPresenter$models$1$1((VariantSandboxedComponent) this.$taxViewModel$delegate, (CoroutineScope) this.L$0, continuation, (RemoteMessage) this.this$0, (PushMessagingService) this.$url);
            case 27:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$112 = new TaxWebAppPresenter$models$1$1((Flow) this.$taxViewModel$delegate, continuation, (NullStateCarouselPresenter) this.this$0, (State) this.$url, 27);
                taxWebAppPresenter$models$1$112.L$0 = obj;
                return taxWebAppPresenter$models$1$112;
            case 28:
                return new TaxWebAppPresenter$models$1$1((CardLockPresenter) this.L$0, (String) this.$url, (Flow$Type) this.$taxViewModel$delegate, (BlockersData) this.this$0, continuation, 28);
            default:
                TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$113 = new TaxWebAppPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$url, (MutableState) this.L$0, 29);
                taxWebAppPresenter$models$1$113.$taxViewModel$delegate = obj;
                return taxWebAppPresenter$models$1$113;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((TaxWebAppPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0291, code lost:
    
        if (com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper.submitViewEvent$default(r12, r1, r2, r31, 1) == r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c4, code lost:
    
        if (com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper.submitViewEvent$default(r12, r0, r1, r31, 1) == r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0277, code lost:
    
        if (r0 == r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x08d5, code lost:
    
        if (r7 == r6) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x08c1, code lost:
    
        if (r4 == r6) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b79, code lost:
    
        if (r5 != null) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01aa, code lost:
    
        if (r2.join(r31) == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0196, code lost:
    
        if (r0 != r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0148, code lost:
    
        if (r0 == r12) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$authenticatedUrl;
        MutableState mutableState;
        Integer num;
        ShoppingWebViewEvent.PayKitShopViewEvent payKitShopViewEvent;
        Object approveCashAppPay;
        String str;
        String str2;
        ShoppingInfoSheetPresenter.State state;
        Object loadInfoSheet;
        MutableState mutableState2;
        Object endChatConvo;
        String str3;
        Object survey;
        String str4;
        Object loaded;
        Object delete;
        Object access$validateFile;
        MutableState mutableState3;
        String str5;
        Object first;
        Analytics analytics;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Object validateEmail;
        CustomerSupportContactSubmitContactError.ErrorType errorType;
        Screen screen;
        Screen screen2;
        Object createPayment;
        Object obj2;
        Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters;
        Object threeDsAuthentication;
        ApiResult apiResult;
        String localizedMessage;
        Object access$performSdkOperations;
        Object withTimeout;
        int i = 7;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) this.$taxViewModel$delegate;
                    TaxWebAppPresenter taxWebAppPresenter = (TaxWebAppPresenter) this.this$0;
                    String str12 = (String) this.$url;
                    this.L$0 = mutableState4;
                    this.label = 1;
                    access$authenticatedUrl = TaxWebAppPresenter.access$authenticatedUrl(taxWebAppPresenter, str12, this);
                    if (access$authenticatedUrl == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableState = mutableState4;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$authenticatedUrl = obj;
                }
                Set set = TaxWebAppPresenter.X_DOMAINS;
                mutableState.setValue((TaxWebAppViewModel) access$authenticatedUrl);
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState5 = (MutableState) this.L$0;
                Integer num2 = (Integer) this.$url;
                ShoppingWebViewEvent.PayKitShopViewEvent payKitShopViewEvent2 = (ShoppingWebViewEvent.PayKitShopViewEvent) this.this$0;
                RealShoppingJavascriptPresenter realShoppingJavascriptPresenter = (RealShoppingJavascriptPresenter) this.$taxViewModel$delegate;
                ShoppingWebScreen shoppingWebScreen = realShoppingJavascriptPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator = realShoppingJavascriptPresenter.navigator;
                RealBugReportSenderFactory realBugReportSenderFactory = realShoppingJavascriptPresenter.shoppingWebAnalytics;
                Analytics analytics2 = realShoppingJavascriptPresenter.analytics;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = realShoppingJavascriptPresenter.franklinAppService;
                    num = num2;
                    payKitShopViewEvent = payKitShopViewEvent2;
                    ApproveCashAppPayRequest approveCashAppPayRequest = new ApproveCashAppPayRequest(null, ((ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest) payKitShopViewEvent2).url, realShoppingJavascriptPresenter.flowToken, ByteString.EMPTY);
                    this.label = 1;
                    approveCashAppPay = appService.approveCashAppPay(approveCashAppPayRequest, this);
                    if (approveCashAppPay == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    num = num2;
                    payKitShopViewEvent = payKitShopViewEvent2;
                    approveCashAppPay = obj;
                }
                ApiResult apiResult2 = (ApiResult) approveCashAppPay;
                if (apiResult2 instanceof ApiResult.Success) {
                    ApproveCashAppPayResponse approveCashAppPayResponse = (ApproveCashAppPayResponse) ((ApiResult.Success) apiResult2).response;
                    List list = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    ResponseContext responseContext = approveCashAppPayResponse.response_context;
                    mutableState5.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState5.getValue(), new InjectJavascriptViewModel$InjectJsViewModel(zzfl.authResponse$presenters("200", responseContext != null ? responseContext.dialog_title : null, responseContext != null ? responseContext.dialog_message : null), num != null ? num.intValue() + 1 : 1), null, 2));
                    ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest authorizeCustomerRequest = (ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest) payKitShopViewEvent;
                    String str13 = authorizeCustomerRequest.url;
                    String str14 = responseContext != null ? responseContext.dialog_title : null;
                    String str15 = responseContext != null ? responseContext.dialog_message : null;
                    str13.getClass();
                    analytics2.track(new CashAppPayAuthGetResponse((String) realBugReportSenderFactory.tempStorage, str13, 200, str14, str15, (BrowserOrigin) realBugReportSenderFactory.sessionManager), null);
                    if ((responseContext != null ? responseContext.dialog_title : null) == null) {
                        if (responseContext == null) {
                            str2 = null;
                            break;
                        } else {
                            str2 = responseContext.dialog_message;
                            break;
                        }
                    }
                    screenNavigator.goTo(new CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog(shoppingWebScreen.getScreenContext(), authorizeCustomerRequest.url, responseContext != null ? responseContext.dialog_title : null, responseContext != null ? responseContext.dialog_message : null));
                }
                if (apiResult2 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult2;
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(realShoppingJavascriptPresenter.stringManager, failure, null);
                    String str16 = errorMessaging.message;
                    ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest authorizeCustomerRequest2 = (ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest) payKitShopViewEvent;
                    String str17 = authorizeCustomerRequest2.url;
                    boolean z = failure instanceof ApiResult.Failure.HttpFailure;
                    ApiResult.Failure.HttpFailure httpFailure = z ? (ApiResult.Failure.HttpFailure) failure : null;
                    Integer num3 = httpFailure != null ? new Integer(httpFailure.code) : null;
                    String str18 = errorMessaging.message;
                    str17.getClass();
                    analytics2.track(new CashAppPayAuthGetResponse((String) realBugReportSenderFactory.tempStorage, str17, num3, null, str18, (BrowserOrigin) realBugReportSenderFactory.sessionManager), null);
                    List list2 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    ApiResult.Failure.HttpFailure httpFailure2 = z ? (ApiResult.Failure.HttpFailure) failure : null;
                    if (httpFailure2 == null || (str = String.valueOf(httpFailure2.code)) == null) {
                        str = "STATUS_CODE_UNKNOWN";
                    }
                    mutableState5.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState5.getValue(), new InjectJavascriptViewModel$InjectJsViewModel(zzfl.authResponse$presenters(str, "", str16), num != null ? 1 + num.intValue() : 1), null, 2));
                    screenNavigator.goTo(new CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog(shoppingWebScreen.getScreenContext(), authorizeCustomerRequest2.url, null, str16));
                }
                return Unit.INSTANCE;
            case 2:
                ShoppingInfoSheetPresenter shoppingInfoSheetPresenter = (ShoppingInfoSheetPresenter) this.$url;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingInfoSheetScreen shoppingInfoSheetScreen = shoppingInfoSheetPresenter.args;
                    if (shoppingInfoSheetScreen instanceof ShoppingInfoSheetScreen.AfterPayInfoSheetScreen) {
                        ShoppingInfoSheetPresenter.access$trackBrowserInfoSheetOpen(shoppingInfoSheetPresenter, InfoContext.AfterPay);
                        MutableState mutableState6 = (MutableState) this.$taxViewModel$delegate;
                        state = (ShoppingInfoSheetPresenter.State) mutableState6.getValue();
                        RealShopHubRepository realShopHubRepository = shoppingInfoSheetPresenter.shopHubRepository;
                        this.L$0 = mutableState6;
                        this.this$0 = state;
                        this.label = 1;
                        loadInfoSheet = realShopHubRepository.loadInfoSheet(this);
                        if (loadInfoSheet == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        mutableState2 = mutableState6;
                        state.getClass();
                        mutableState2.setValue(new ShoppingInfoSheetPresenter.State((SheetDetails) loadInfoSheet));
                    } else {
                        if (!(shoppingInfoSheetScreen instanceof ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ShoppingInfoSheetPresenter.access$trackBrowserInfoSheetOpen(shoppingInfoSheetPresenter, InfoContext.CashAppPay);
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ShoppingInfoSheetPresenter.State state2 = (ShoppingInfoSheetPresenter.State) this.this$0;
                    mutableState2 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    state = state2;
                    loadInfoSheet = obj;
                    state.getClass();
                    mutableState2.setValue(new ShoppingInfoSheetPresenter.State((SheetDetails) loadInfoSheet));
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope, (InviteErrorPresenter) this.$url, (MutableState) this.L$0, 5);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow.collect(taxWebAppBridge$openTakePhoto$1$1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$12 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope2, (PdfPreviewPresenter) this.$url, (MutableState) this.L$0, 6);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow2.collect(taxWebAppBridge$openTakePhoto$1$12, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppSupportArticleService appSupportArticleService = ((RealArticlesService) this.L$0).service;
                String str19 = (String) this.$url;
                ListSupportArticlesRequest listSupportArticlesRequest = new ListSupportArticlesRequest((String) this.$taxViewModel$delegate, (ArrayList) this.this$0, ByteString.EMPTY);
                this.label = 1;
                Object listSupportArticles = appSupportArticleService.listSupportArticles(str19, listSupportArticlesRequest, this);
                return listSupportArticles == coroutineSingletons6 ? coroutineSingletons6 : listSupportArticles;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPendingMessagesStore realPendingMessagesStore = (RealPendingMessagesStore) this.L$0;
                    String str20 = (String) this.$url;
                    PendingMessage pendingMessage = (PendingMessage) this.$taxViewModel$delegate;
                    String str21 = (String) this.this$0;
                    this.label = 1;
                    if (RealPendingMessagesStore.access$dispatchFileUpload(realPendingMessagesStore, str20, pendingMessage, str21, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.L$0;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
                SupportChatScreens.SupportChatSheets.ChatExitPromptSheet chatExitPromptSheet = (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet) poolsListPresenter.args;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation endConversation = SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealChatManager realChatManager = (RealChatManager) poolsListPresenter.sessionManager;
                    String str22 = chatExitPromptSheet.flowToken;
                    this.label = 1;
                    endChatConvo = realChatManager.endChatConvo(str22, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) this.$url;
                        SafeTrace.throwOnFailure(obj);
                        survey = obj;
                        ChatSurvey chatSurvey = (ChatSurvey) survey;
                        GridLayout.Alignment.logAnswerStart((Analytics) poolsListPresenter.analytics, str3, chatSurvey);
                        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = (ShiftNotePresenter$models$1$1) this.$taxViewModel$delegate;
                        if (chatSurvey.equals(ChatSurvey.Completed.INSTANCE)) {
                            loaded = ChatSurveyViewModel.Complete.INSTANCE;
                        } else {
                            if (!(chatSurvey instanceof ChatSurvey.Pending)) {
                                if (chatSurvey.equals(ChatSurvey.Unavailable.INSTANCE)) {
                                    screenNavigator2.giveAnswer(chatExitPromptSheet.question, endConversation);
                                    return Unit.INSTANCE;
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChatSurvey.Pending pending = (ChatSurvey.Pending) chatSurvey;
                            ChatSurvey.Pending.SatisfactionQuestion satisfactionQuestion = pending.satisfactionQuestion;
                            if (satisfactionQuestion == null || (str4 = satisfactionQuestion.title) == null) {
                                str4 = androidStringManager.get(R.string.support_standardized_chat_survey_satisfaction_title);
                            }
                            String str23 = pending.resolutionQuestion.title;
                            if (str23 == null) {
                                str23 = androidStringManager.get(R.string.support_standardized_chat_survey_resolution_title);
                            }
                            loaded = new ChatSurveyViewModel.Loaded(str4, str23, null, ((Boolean) ((Lazy) poolsListPresenter.moneyFormatter).getValue()).booleanValue());
                        }
                        shiftNotePresenter$models$1$1.invoke(loaded);
                        ((ShiftNotePresenter$models$1$1) this.this$0).invoke(new ChatExitPromptSheetState.ShowSurvey(str3));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    endChatConvo = obj;
                }
                str3 = (String) endChatConvo;
                if (str3 == null) {
                    screenNavigator2.giveAnswer(chatExitPromptSheet.question, endConversation);
                    return Unit.INSTANCE;
                }
                RealChatSurveyService realChatSurveyService = (RealChatSurveyService) poolsListPresenter.repository;
                this.$url = str3;
                this.label = 2;
                survey = realChatSurveyService.getSurvey(str3, this);
                break;
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$13 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope3, (TaxReturnsPresenter) this.$url, (MutableState) this.L$0, i);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow3.collect(taxWebAppBridge$openTakePhoto$1$13, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportConversationPersistence supportConversationPersistence = ((ChatPresenter) this.this$0).conversationPersistence;
                    String str24 = (String) ((MutableState) this.L$0).getValue();
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    KeyValue keyValue = supportConversationPersistence.savedInputKeyValue;
                    if (str24 == null || StringsKt.isBlank(str24)) {
                        delete = keyValue.delete(this);
                        if (delete != coroutineSingletons10) {
                            delete = Unit.INSTANCE;
                        }
                    } else {
                        delete = keyValue.set(new ChatSavedInputPreference(str24), this);
                        if (delete != coroutineSingletons10) {
                            delete = Unit.INSTANCE;
                        }
                    }
                    if (delete == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState7 = (MutableState) this.$taxViewModel$delegate;
                    ChatPresenter chatPresenter = (ChatPresenter) this.this$0;
                    String str25 = ((ChatViewEvent.AttachImage) ((ChatViewEvent) this.$url)).fileUri;
                    this.L$0 = mutableState7;
                    this.label = 1;
                    access$validateFile = ChatPresenter.access$validateFile(chatPresenter, str25, this);
                    if (access$validateFile == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                    mutableState3 = mutableState7;
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState3 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$validateFile = obj;
                }
                String str26 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                mutableState3.setValue((MessageBody.FileBody) access$validateFile);
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$14 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope4, (PdfPreviewPresenter) this.$url, (MutableState) this.L$0, 9);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow4.collect(taxWebAppBridge$openTakePhoto$1$14, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                Retrofit.Builder builder = (Retrofit.Builder) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics3 = (Analytics) builder.baseUrl;
                    str5 = ((SupportScreens.FlowScreens) ((Screen) this.this$0)).getData().flowToken;
                    Flow flow5 = ((RealSupportStatus) builder.callAdapterFactories).hasUnreadMessages;
                    this.L$0 = analytics3;
                    this.$url = str5;
                    this.label = 1;
                    first = FlowKt.first(flow5, this);
                    if (first == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                    analytics = analytics3;
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str27 = (String) this.$url;
                    analytics = (Analytics) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str5 = str27;
                    first = obj;
                }
                analytics.track(new CustomerSupportAccessComplete(str5, (Boolean) first), null);
                return Unit.INSTANCE;
            case 13:
                ArticleViewEvent articleViewEvent = (ArticleViewEvent) this.$url;
                ArticlePresenter articlePresenter = (ArticlePresenter) this.this$0;
                Analytics analytics4 = articlePresenter.analytics;
                SupportScreens.FlowScreens.ArticleScreen articleScreen = articlePresenter.args;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 != 0) {
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ArticleViewEvent.ClickLink clickLink = (ArticleViewEvent.ClickLink) articleViewEvent;
                articlePresenter.viewedArticlesStore.add(new RecentlyViewedNode(clickLink.getLink().token));
                ArticlesService$ArticleResult articlesService$ArticleResult = (ArticlesService$ArticleResult) ((MutableState) this.L$0).getValue();
                ArticlesService$ArticleResult.Success success = articlesService$ArticleResult instanceof ArticlesService$ArticleResult.Success ? (ArticlesService$ArticleResult.Success) articlesService$ArticleResult : null;
                Article article = success != null ? success.article : null;
                if (article == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot click article link without valid article.");
                    return null;
                }
                Link link = article.callToAction;
                List list3 = article.links;
                if (articleViewEvent instanceof ArticleViewEvent.ClickSupportLink) {
                    Link link2 = ((ArticleViewEvent.ClickSupportLink) articleViewEvent).link;
                    Link.Target target = link2.target;
                    Link.Target.ClientScenario clientScenario = target instanceof Link.Target.ClientScenario ? (Link.Target.ClientScenario) target : null;
                    String str28 = clientScenario != null ? clientScenario.stringRepresentation : null;
                    Link.Target.External external = target instanceof Link.Target.External ? (Link.Target.External) target : null;
                    if (external == null || (str11 = external.url) == null) {
                        Link.Target.ClientRoute clientRoute = target instanceof Link.Target.ClientRoute ? (Link.Target.ClientRoute) target : null;
                        str9 = clientRoute != null ? clientRoute.url : null;
                    } else {
                        str9 = str11;
                    }
                    String str29 = articleScreen.data.flowToken;
                    String str30 = link2.token;
                    CustomerSupportAccessOpenNode.SelectedType selectedType = CustomerSupportAccessOpenNode.SelectedType.NODE_TREE;
                    int size = list3.size();
                    int indexOf = list3.indexOf(link2);
                    int size2 = list3.size() + (link != null ? 1 : 0);
                    CustomerSupportAccessOpenNode.Trigger trigger = CustomerSupportAccessOpenNode.Trigger.NODE;
                    SupportScreens.FlowScreens.Data data = articleScreen.data;
                    String str31 = data.paymentToken;
                    String str32 = articlePresenter.viewToken;
                    String str33 = data.searchText;
                    if (str33 != null) {
                        String lowerCase = str33.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        str10 = lowerCase;
                    } else {
                        str10 = null;
                    }
                    analytics4.track(new CustomerSupportAccessOpenNode(str28, str9, str29, str30, selectedType, Integer.valueOf(size), Integer.valueOf(indexOf), Integer.valueOf(size2), trigger, str31, str10, str32), null);
                } else if (articleViewEvent instanceof ArticleViewEvent.ClickCallToAction) {
                    Link link3 = ((ArticleViewEvent.ClickCallToAction) articleViewEvent).link;
                    Link.Target target2 = link3.target;
                    Link.Target.ClientScenario clientScenario2 = target2 instanceof Link.Target.ClientScenario ? (Link.Target.ClientScenario) target2 : null;
                    String str34 = clientScenario2 != null ? clientScenario2.stringRepresentation : null;
                    Link.Target.External external2 = target2 instanceof Link.Target.External ? (Link.Target.External) target2 : null;
                    if (external2 == null || (str8 = external2.url) == null) {
                        Link.Target.ClientRoute clientRoute2 = target2 instanceof Link.Target.ClientRoute ? (Link.Target.ClientRoute) target2 : null;
                        str6 = clientRoute2 != null ? clientRoute2.url : null;
                    } else {
                        str6 = str8;
                    }
                    String str35 = articleScreen.data.flowToken;
                    String str36 = link3.token;
                    CustomerSupportAccessOpenNode.SelectedType selectedType2 = CustomerSupportAccessOpenNode.SelectedType.CALL_TO_ACTION;
                    int size3 = list3.size() + (link != null ? 1 : 0);
                    CustomerSupportAccessOpenNode.Trigger trigger2 = CustomerSupportAccessOpenNode.Trigger.NODE;
                    SupportScreens.FlowScreens.Data data2 = articleScreen.data;
                    String str37 = data2.paymentToken;
                    String str38 = articlePresenter.viewToken;
                    String str39 = data2.searchText;
                    if (str39 != null) {
                        String lowerCase2 = str39.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        str7 = lowerCase2;
                    } else {
                        str7 = null;
                    }
                    analytics4.track(new CustomerSupportAccessOpenNode(str34, str6, str35, str36, selectedType2, (Integer) 1, (Integer) 0, Integer.valueOf(size3), trigger2, str37, str7, str38), null);
                }
                RealSupportLinkNavigator realSupportLinkNavigator = articlePresenter.linkNavigator;
                BetterNavigator.ScreenNavigator screenNavigator3 = articlePresenter.navigator;
                SupportScreens.FlowScreens.ArticleScreen articleScreen2 = articlePresenter.args;
                Link.Target target3 = clickLink.getLink().target;
                SupportTransaction supportTransaction = (SupportTransaction) ((MutableState) this.$taxViewModel$delegate).getValue();
                BlockersData.AnalyticsData.Source source = BlockersData.AnalyticsData.Source.SUPPORT_ARTICLE;
                this.label = 1;
                if (realSupportLinkNavigator.navigateWith(screenNavigator3, articleScreen2, target3, supportTransaction, source) == coroutineSingletons14) {
                    return coroutineSingletons14;
                }
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState8 = (MutableState) this.$taxViewModel$delegate;
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.this$0;
                SupportScreens.ContactScreens.ContactSupportEmailInputScreen contactSupportEmailInputScreen = (SupportScreens.ContactScreens.ContactSupportEmailInputScreen) workHomePresenter.payPresenter;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSupportEmailValidationService realSupportEmailValidationService = (RealSupportEmailValidationService) workHomePresenter.shiftSection2Presenter;
                    String str40 = (String) ((MutableState) this.L$0).getValue();
                    this.label = 1;
                    validateEmail = realSupportEmailValidationService.validateEmail(str40, this);
                    if (validateEmail == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    validateEmail = obj;
                }
                SupportEmailValidationService$EmailValidationResult supportEmailValidationService$EmailValidationResult = (SupportEmailValidationService$EmailValidationResult) validateEmail;
                if (!(supportEmailValidationService$EmailValidationResult instanceof SupportEmailValidationService$EmailValidationResult.Failure)) {
                    if (!Intrinsics.areEqual(supportEmailValidationService$EmailValidationResult, SupportEmailValidationService$EmailValidationResult.Success.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState8.setValue(new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit(ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Editing.INSTANCE));
                    ((BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter).goTo(new SupportScreens.ContactScreens.ContactSupportMessageScreen(SupportScreens.ContactScreens.Data.copy$default(contactSupportEmailInputScreen.data, new RedactedString(((ContactSupportEmailInputViewEvent.ConfirmEmail) ((ContactSupportEmailInputViewEvent) this.$url)).email), null, 447)));
                    return Unit.INSTANCE;
                }
                Analytics analytics5 = (Analytics) workHomePresenter.shiftsAnalytics;
                SupportScreens.ContactScreens.Data data3 = contactSupportEmailInputScreen.data;
                SupportEmailValidationService$EmailValidationResult.Failure failure2 = (SupportEmailValidationService$EmailValidationResult.Failure) supportEmailValidationService$EmailValidationResult;
                SupportEmailValidationService$EmailValidationResult.Failure.ErrorType errorType2 = failure2.errorType;
                data3.getClass();
                Channel channel = zzpd.toChannel(data3.contactOption);
                String str41 = data3.flowToken;
                int ordinal = errorType2.ordinal();
                if (ordinal == 0) {
                    errorType = CustomerSupportContactSubmitContactError.ErrorType.VALIDATION;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    errorType = CustomerSupportContactSubmitContactError.ErrorType.NETWORK;
                }
                analytics5.track(new CustomerSupportContactSubmitContactError(channel, str41, errorType), null);
                mutableState8.setValue(new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit(new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Failure(failure2.errorTitle, failure2.errorBody)));
                return Unit.INSTANCE;
            case 15:
                ActivityItem activityItem = (ActivityItem) this.$url;
                SupportActivityItemPresenter supportActivityItemPresenter = (SupportActivityItemPresenter) this.this$0;
                Analytics analytics6 = supportActivityItemPresenter.analytics;
                Navigator navigator = supportActivityItemPresenter.navigator;
                SupportScreens.FlowScreens.Data data4 = supportActivityItemPresenter.flowData;
                ActivityItem activityItem2 = supportActivityItemPresenter.item;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual((ActivityItemViewEvent) this.$taxViewModel$delegate, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                        screen = supportActivityItemPresenter.presentationContext.screen;
                        boolean z2 = screen instanceof SupportScreens.FlowScreens.SupportHomeScreen;
                        SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId byTransactionId = SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId.INSTANCE;
                        if (z2) {
                            analytics6.track(new CustomerSupportAccessSelectTransaction(data4.flowToken, ActivityItemKt.getItemId(activityItem)), null);
                            navigator.goTo(new SupportScreens.FlowScreens.ArticleScreen(byTransactionId, SupportScreens.FlowScreens.Data.copy$default(supportActivityItemPresenter.flowData, null, ActivityItemKt.getItemId(activityItem2), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE), false, 28));
                        } else if (screen instanceof SupportScreens.FlowScreens.SupportActivityPickerFullScreen) {
                            SupportScreens.FlowScreens.SupportActivityPickerFullScreen supportActivityPickerFullScreen = (SupportScreens.FlowScreens.SupportActivityPickerFullScreen) screen;
                            int ordinal2 = supportActivityPickerFullScreen.origin.ordinal();
                            if (ordinal2 == 0) {
                                navigator.goTo(new SupportScreens.FlowScreens.ArticleScreen(byTransactionId, SupportScreens.FlowScreens.Data.copy$default(supportActivityItemPresenter.flowData, null, ActivityItemKt.getItemId(activityItem2), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE), false, 28));
                            } else if (ordinal2 == 1) {
                                AskedQuestion askedQuestion = supportActivityPickerFullScreen.selectTransactionQuestion;
                                if (askedQuestion != null) {
                                    navigator.giveAnswer(askedQuestion, new SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success(ActivityItemKt.getItemId(activityItem2)));
                                }
                            } else if (ordinal2 == 2) {
                                Article.ContactOption contactOption = data4.contactOption;
                                if (contactOption == null) {
                                    return Unit.INSTANCE;
                                }
                                RealContactSupportNavigator realContactSupportNavigator = supportActivityItemPresenter.contactSupportNavigator;
                                Navigator navigator2 = supportActivityItemPresenter.navigator;
                                String str42 = data4.rootNodeToken;
                                if (str42 == null) {
                                    str42 = "";
                                }
                                String str43 = data4.flowToken;
                                Boolean bool = data4.includeIssueDescription;
                                String itemId = ActivityItemKt.getItemId(activityItem2);
                                this.L$0 = supportActivityPickerFullScreen;
                                this.label = 1;
                                if (realContactSupportNavigator.goToScreenForOption(navigator2, contactOption, false, str42, str43, bool, itemId, this) == coroutineSingletons16) {
                                    return coroutineSingletons16;
                                }
                                screen2 = screen;
                            }
                            analytics6.track(new CustomerSupportFullTransactionPickerSelectTransaction(data4.flowToken, ActivityItemKt.getItemId(activityItem), ((SupportScreens.FlowScreens.SupportActivityPickerFullScreen) screen).origin), null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                screen2 = (SupportScreens.FlowScreens.SupportActivityPickerFullScreen) this.L$0;
                SafeTrace.throwOnFailure(obj);
                screen = screen2;
                analytics6.track(new CustomerSupportFullTransactionPickerSelectTransaction(data4.flowToken, ActivityItemKt.getItemId(activityItem), ((SupportScreens.FlowScreens.SupportActivityPickerFullScreen) screen).origin), null);
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(i, coroutineScope5, (InstrumentDetailsPresenter) this.$url, (MutableState) this.L$0);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass1, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass12 = new BufferCountKt$bufferSkip$1.AnonymousClass1(8, coroutineScope6, (SupportPhoneStatusPresenter) this.$url, (MutableState) this.L$0);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass12, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.this$0;
                    TapToPayPaymentPresenter$models$4$3$1 tapToPayPaymentPresenter$models$4$3$1 = new TapToPayPaymentPresenter$models$4$3$1(coroutineScope7, (CardLockPresenter) this.$url, (MutableState) this.L$0);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow8.collect(tapToPayPaymentPresenter$models$4$3$1, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.this$0;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$15 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope8, (LocalEditorialPresenter) this.$url, (MutableState) this.L$0, 14);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow9.collect(taxWebAppBridge$openTakePhoto$1$15, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState9 = (MutableState) this.L$0;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$url;
                RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) localEditorialPresenter.service;
                TapToPayPaymentRequestScreen tapToPayPaymentRequestScreen = (TapToPayPaymentRequestScreen) localEditorialPresenter.clock;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!tapToPayPaymentRequestScreen.isDemoMode) {
                        RealTapToPayRepository realTapToPayRepository = (RealTapToPayRepository) localEditorialPresenter.installedStore;
                        byte[] bArr = tapToPayPaymentRequestScreen.authorizationData;
                        Money money = tapToPayPaymentRequestScreen.amount;
                        String str44 = tapToPayPaymentRequestScreen.initiatorNotes;
                        String str45 = tapToPayPaymentRequestScreen.idempotencyToken;
                        this.label = 1;
                        createPayment = realTapToPayRepository.createPayment(bArr, money, str44, str45, this);
                        break;
                    } else {
                        mutableState9.setValue(TapToPayPaymentRequestViewModel.DemoMode.INSTANCE);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            obj2 = (TapToPayPaymentAcceptance.PaymentAccepted) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            ((MutableState) this.$taxViewModel$delegate).setValue(((TapToPayPaymentAcceptance.PaymentAccepted) obj2).receiptClientRouteUrl);
                            mutableState9.setValue(new TapToPayPaymentRequestViewModel.Accepted(((MoneyFormatter) localEditorialPresenter.responseContextHandler).format(tapToPayPaymentRequestScreen.amount)));
                            return Unit.INSTANCE;
                        }
                        if (i22 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(new TapToPayErrorScreen(TapToPayErrorReason.TTP_PAYMENT_FAILURE));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    createPayment = obj;
                }
                obj2 = (TapToPayPaymentAcceptance) createPayment;
                if (obj2 instanceof TapToPayPaymentAcceptance.PaymentAccepted) {
                    String str46 = tapToPayPaymentRequestScreen.idempotencyToken;
                    FlowType flowType = FlowType.ONBOARDING;
                    ScreenID screenID = ScreenID.PaymentCompleteScreen;
                    this.this$0 = (TapToPayPaymentAcceptance.PaymentAccepted) obj2;
                    this.label = 2;
                    break;
                } else {
                    if (!(obj2 instanceof TapToPayPaymentAcceptance.PaymentFailed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str47 = tapToPayPaymentRequestScreen.idempotencyToken;
                    FlowType flowType2 = FlowType.ONBOARDING;
                    ScreenID screenID2 = ScreenID.PaymentFailedScreen;
                    this.this$0 = null;
                    this.label = 3;
                    break;
                }
                return coroutineSingletons21;
            case 21:
                MutableState mutableState10 = (MutableState) this.L$0;
                ThreeDsPresenter threeDsPresenter = (ThreeDsPresenter) this.this$0;
                RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = threeDsPresenter.spanTrackingService;
                Analytics analytics7 = threeDsPresenter.analytics;
                BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen = threeDsPresenter.args;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                try {
                } catch (TimeoutCancellationException unused) {
                    analytics7.track(new ThreeDsAuthenticationSdkFailure(threeDsAuthenticationScreen.blockersData.flowToken, "Triggered timeout after " + threeDsAuthenticationScreen.timeoutMs + "ms"), null);
                    realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$EndSdkInitializationSpan(((Boolean) mutableState10.getValue()).booleanValue(), false, ThreeDsSpanAction$EndSdkInitializationSpan.Source.BLOCKER));
                    realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$EndSdkAuthenticationParamsSpan.INSTANCE);
                    transaction$AuthenticationRequestParameters = null;
                }
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Long l = threeDsAuthenticationScreen.timeoutMs;
                    if (l == null) {
                        TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda10 = new TabToolbarsKt$$ExternalSyntheticLambda10(18, mutableState10);
                        this.label = 2;
                        access$performSdkOperations = ThreeDsPresenter.access$performSdkOperations(threeDsPresenter, tabToolbarsKt$$ExternalSyntheticLambda10, this);
                        break;
                    } else {
                        long longValue = l.longValue();
                        TaxWebAppBridge.AnonymousClass3 anonymousClass3 = new TaxWebAppBridge.AnonymousClass3(threeDsPresenter, mutableState10, continuation, 13);
                        this.label = 1;
                        withTimeout = JobKt.withTimeout(longValue, anonymousClass3, this);
                        if (withTimeout == coroutineSingletons22) {
                        }
                        transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) withTimeout;
                        this.label = 3;
                        threeDsAuthentication = threeDsPresenter.appService.threeDsAuthentication(threeDsAuthenticationScreen.blockersData.flowToken, new ThreeDsAuthenticationRequest(transaction$AuthenticationRequestParameters == null ? new ThreeDsAuthenticationRequest.SdkInfo(transaction$AuthenticationRequestParameters.deviceData, transaction$AuthenticationRequestParameters.sdkTransactionID, transaction$AuthenticationRequestParameters.sdkAppID, transaction$AuthenticationRequestParameters.sdkReferenceNumber, transaction$AuthenticationRequestParameters.sdkEphemeralPublicKey, ByteString.EMPTY) : null, new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY), this);
                    }
                    return coroutineSingletons22;
                }
                if (i23 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    withTimeout = obj;
                    transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) withTimeout;
                    this.label = 3;
                    threeDsAuthentication = threeDsPresenter.appService.threeDsAuthentication(threeDsAuthenticationScreen.blockersData.flowToken, new ThreeDsAuthenticationRequest(transaction$AuthenticationRequestParameters == null ? new ThreeDsAuthenticationRequest.SdkInfo(transaction$AuthenticationRequestParameters.deviceData, transaction$AuthenticationRequestParameters.sdkTransactionID, transaction$AuthenticationRequestParameters.sdkAppID, transaction$AuthenticationRequestParameters.sdkReferenceNumber, transaction$AuthenticationRequestParameters.sdkEphemeralPublicKey, ByteString.EMPTY) : null, new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY), this);
                } else if (i23 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    access$performSdkOperations = obj;
                    transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) access$performSdkOperations;
                    this.label = 3;
                    threeDsAuthentication = threeDsPresenter.appService.threeDsAuthentication(threeDsAuthenticationScreen.blockersData.flowToken, new ThreeDsAuthenticationRequest(transaction$AuthenticationRequestParameters == null ? new ThreeDsAuthenticationRequest.SdkInfo(transaction$AuthenticationRequestParameters.deviceData, transaction$AuthenticationRequestParameters.sdkTransactionID, transaction$AuthenticationRequestParameters.sdkAppID, transaction$AuthenticationRequestParameters.sdkReferenceNumber, transaction$AuthenticationRequestParameters.sdkEphemeralPublicKey, ByteString.EMPTY) : null, new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY), this);
                    break;
                } else {
                    if (i23 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        threeDsAuthentication = obj;
                        apiResult = (ApiResult) threeDsAuthentication;
                        Job job = (Job) this.$url;
                        if (job != null) {
                            this.$taxViewModel$delegate = apiResult;
                            this.label = 4;
                            break;
                        }
                        BetterNavigator.ScreenNavigator screenNavigator4 = threeDsPresenter.navigator;
                        if (!(apiResult instanceof ApiResult.Success)) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i23 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    apiResult = (ApiResult) this.$taxViewModel$delegate;
                    SafeTrace.throwOnFailure(obj);
                    BetterNavigator.ScreenNavigator screenNavigator42 = threeDsPresenter.navigator;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        analytics7.track(new ThreeDsAuthenticationRequestComplete(threeDsAuthenticationScreen.blockersData.flowToken), null);
                        BlockersDataNavigator blockersDataNavigator = threeDsPresenter.blockersDataNavigator;
                        BlockersData blockersData = threeDsAuthenticationScreen.blockersData;
                        ResponseContext responseContext2 = ((ThreeDsAuthenticationResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext2.getClass();
                        screenNavigator42.goTo(blockersDataNavigator.getNext(threeDsAuthenticationScreen, blockersData.updateFromResponseContext(responseContext2, false)));
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str48 = threeDsAuthenticationScreen.blockersData.flowToken;
                        ApiResult.Failure failure3 = (ApiResult.Failure) apiResult;
                        if (failure3 instanceof ApiResult.Failure.HttpFailure) {
                            localizedMessage = Boxes$$ExternalSyntheticOutline1.m(((ApiResult.Failure.HttpFailure) apiResult).code, " HTTP failure");
                        } else {
                            if (!(failure3 instanceof ApiResult.Failure.NetworkFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            localizedMessage = ((ApiResult.Failure.NetworkFailure) apiResult).error.getLocalizedMessage();
                        }
                        analytics7.track(new ThreeDsAuthenticationRequestFailure(str48, localizedMessage), null);
                        screenNavigator42.goTo(TickerKt.toMessageScreen$default(failure3, threeDsAuthenticationScreen, threeDsPresenter.stringManager));
                    }
                    return Unit.INSTANCE;
                }
                analytics7.track(new ThreeDsAuthenticationSdkFailure(threeDsAuthenticationScreen.blockersData.flowToken, "Triggered timeout after " + threeDsAuthenticationScreen.timeoutMs + "ms"), null);
                realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$EndSdkInitializationSpan(((Boolean) mutableState10.getValue()).booleanValue(), false, ThreeDsSpanAction$EndSdkInitializationSpan.Source.BLOCKER));
                realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$EndSdkAuthenticationParamsSpan.INSTANCE);
                transaction$AuthenticationRequestParameters = null;
                this.label = 3;
                threeDsAuthentication = threeDsPresenter.appService.threeDsAuthentication(threeDsAuthenticationScreen.blockersData.flowToken, new ThreeDsAuthenticationRequest(transaction$AuthenticationRequestParameters == null ? new ThreeDsAuthenticationRequest.SdkInfo(transaction$AuthenticationRequestParameters.deviceData, transaction$AuthenticationRequestParameters.sdkTransactionID, transaction$AuthenticationRequestParameters.sdkAppID, transaction$AuthenticationRequestParameters.sdkReferenceNumber, transaction$AuthenticationRequestParameters.sdkEphemeralPublicKey, ByteString.EMPTY) : null, new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY), this);
            case 22:
                return invokeSuspend$com$squareup$cash$transactionpicker$blocker$presenters$UnifiedActivityPickerBlockerPresenter$handleEvent$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$transfers$presenters$BalanceBasedAutoReloadConfirmationPresenter$models$3$1(obj);
            case 24:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$taxViewModel$delegate;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$16 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope9, (PoolsListPresenter) this.this$0, (CoroutineScope) this.$url, 21);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(taxWebAppBridge$openTakePhoto$1$16, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$treehouse$activity$HostActivityDataBridge$applyDynamicFormatting$3(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$ui$gcm$PushMessagingService$onMessageReceivedSuspend$$inlined$onSingleSandbox$1$1$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$upsell$presenters$NullStateCarouselPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$wallet$presenters$CardLockPresenter$models$1$1$result$1(obj);
            default:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$taxViewModel$delegate;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.this$0;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass13 = new BufferCountKt$bufferSkip$1.AnonymousClass1(17, coroutineScope10, (CardSchemePresenter) this.$url, (MutableState) this.L$0);
                    this.$taxViewModel$delegate = null;
                    this.label = 1;
                    if (flow11.collect(anonymousClass13, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxWebAppPresenter$models$1$1(MoleculePresenter moleculePresenter, Object obj, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$url = obj;
        this.L$0 = mutableState;
        this.$taxViewModel$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 20;
        this.$url = localEditorialPresenter;
        this.L$0 = mutableState;
        this.$taxViewModel$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxWebAppPresenter$models$1$1(int i, MutableState mutableState, MoleculePresenter moleculePresenter, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$url = obj;
        this.$taxViewModel$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(PoolsListPresenter poolsListPresenter, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$12, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.L$0 = poolsListPresenter;
        this.$taxViewModel$delegate = shiftNotePresenter$models$1$1;
        this.this$0 = shiftNotePresenter$models$1$12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(RealShoppingJavascriptPresenter realShoppingJavascriptPresenter, ShoppingWebViewEvent.PayKitShopViewEvent payKitShopViewEvent, Integer num, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$taxViewModel$delegate = realShoppingJavascriptPresenter;
        this.this$0 = payKitShopViewEvent;
        this.$url = num;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(ShoppingInfoSheetPresenter shoppingInfoSheetPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$url = shoppingInfoSheetPresenter;
        this.$taxViewModel$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(ThreeDsPresenter threeDsPresenter, Job job, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 21;
        this.this$0 = threeDsPresenter;
        this.$url = job;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(InstrumentDetailsPresenter instrumentDetailsPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 23;
        this.this$0 = instrumentDetailsPresenter;
        this.L$0 = mutableState;
        this.$taxViewModel$delegate = mutableState2;
        this.$url = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxWebAppPresenter$models$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$taxViewModel$delegate = obj;
        this.this$0 = obj2;
        this.$url = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxWebAppPresenter$models$1$1(Object obj, String str, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$url = str;
        this.$taxViewModel$delegate = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(String str, Continuation continuation, ChatPresenter chatPresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.$url = str;
        this.this$0 = chatPresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxWebAppPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$url = moleculePresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxWebAppPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$taxViewModel$delegate = flow;
        this.this$0 = moleculePresenter;
        this.$url = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$models$1$1(Retrofit.Builder builder, Screen screen, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.$taxViewModel$delegate = builder;
        this.this$0 = screen;
    }
}
