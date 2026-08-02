package com.withpersona.sdk2.inquiry.logger;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.platform.UriHandler;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import app.cash.local.presenters.LocalEditorialPresenter;
import com.android.volley.Response;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.alertbannernotification.AlertBannerNotificationInteractView;
import com.squareup.cash.cdf.alertbannernotification.Screen;
import com.squareup.cash.cdf.alertbannernotification.State;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewNodes;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.taptopay.backend.api.EmvPaymentResult;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.JsonAdapter;
import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionHandler;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionStarter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import com.stripe.android.view.ActivityHost;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import papa.AppUpdateData;
import papa.SafeTrace;
import timber.log.Timber;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class Logger$_log$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $message;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $subsystem;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger$_log$2(Logger logger, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        LogLevel logLevel = LogLevel.Error;
        this.this$0 = logger;
        this.$subsystem = str;
        this.$message = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$message;
        Object obj3 = this.$subsystem;
        switch (i) {
            case 0:
                LogLevel logLevel = LogLevel.Error;
                return new Logger$_log$2((Logger) this.this$0, (String) obj3, (String) obj2, continuation);
            case 1:
                Logger$_log$2 logger$_log$2 = new Logger$_log$2((Article) obj3, continuation, (LocalEditorialPresenter) obj2, 1);
                logger$_log$2.this$0 = obj;
                return logger$_log$2;
            case 2:
                Logger$_log$2 logger$_log$22 = new Logger$_log$2((EmvPaymentResult) obj3, continuation, (MutableState) obj2, 2);
                logger$_log$22.this$0 = obj;
                return logger$_log$22;
            case 3:
                Logger$_log$2 logger$_log$23 = new Logger$_log$2((ThreeDsPresenter) obj3, (MutableState) obj2, continuation, 3);
                logger$_log$23.this$0 = obj;
                return logger$_log$23;
            case 4:
                return new Logger$_log$2((List) this.this$0, (WithdrawPresenter) obj3, (MutableState) obj2, continuation, 4);
            case 5:
                return new Logger$_log$2((AmountDisplayState) this.this$0, (AddMoneyViewModel.Keypad) obj3, (KeypadAmount) obj2, continuation, 5);
            case 6:
                return new Logger$_log$2((AmountDisplayState) this.this$0, (WithdrawViewModel.ManagedAccountAmountEntry) obj3, (KeypadAmount) obj2, continuation, 6);
            case 7:
                return new Logger$_log$2((AlertBannerViewModel) this.this$0, (RealAlertBannerPresenter) obj3, (MutableState) obj2, continuation, 7);
            case 8:
                Logger$_log$2 logger$_log$24 = new Logger$_log$2((ProduceStateScope) obj3, (MutableState) obj2, continuation, 8);
                logger$_log$24.this$0 = obj;
                return logger$_log$24;
            case 9:
                return new Logger$_log$2((CardScene) this.this$0, (Function1) obj3, (MutableState) obj2, continuation, 9);
            case 10:
                return new Logger$_log$2((CardSchemeViewModel.Module.HeroTag) this.this$0, (PlatformHapticFeedback) obj3, (MutableState) obj2, continuation, 10);
            case 11:
                return new Logger$_log$2((CardRegistry) this.this$0, (CardSchemeViewModel.Module.HeroTag) obj3, (DefaultPagerState) obj2, continuation, 11);
            case 12:
                return new Logger$_log$2((TextSetter) this.this$0, (String) obj3, (String) obj2, continuation, 12);
            case 13:
                return new Logger$_log$2((IntentConfirmationChallengeNextActionHandler) this.this$0, (ActivityHost) obj3, (StripeIntent) obj2, continuation, 13);
            case 14:
                return new Logger$_log$2((AccountPickerState$ViewEffect$OpenUrl) this.this$0, (UriHandler) obj3, (AccountPickerViewModel) obj2, continuation, 14);
            case 15:
                return new Logger$_log$2((ConsentState$ViewEffect$OpenUrl) this.this$0, (UriHandler) obj3, (ConsentViewModel) obj2, continuation, 15);
            case 16:
                return new Logger$_log$2((LinkAccountPickerState$ViewEffect$OpenUrl) this.this$0, (UriHandler) obj3, (LinkAccountPickerViewModel) obj2, continuation, 16);
            case 17:
                return new Logger$_log$2((NetworkingLinkSignupState$ViewEffect$OpenUrl) this.this$0, (UriHandler) obj3, (NetworkingLinkSignupViewModel) obj2, continuation, 17);
            case 18:
                return new Logger$_log$2((IDConsentContentState$ViewEffect$OpenUrl) this.this$0, (UriHandler) obj3, (IDConsentContentViewModel) obj2, continuation, 18);
            case 19:
                return new Logger$_log$2((NavBackStackEntry) this.this$0, (FinancialConnectionsSheetNativeViewModel) obj3, (MutableState) obj2, continuation, 19);
            case 20:
                return new Logger$_log$2((FinancialConnectionsSheetNativeViewModel) this.this$0, (FinancialConnectionsSessionManifest.Pane) obj3, (FinancialConnectionsSessionManifest.Pane) obj2, continuation, 20);
            case 21:
                Logger$_log$2 logger$_log$25 = new Logger$_log$2((String) obj3, (Lazy) obj2, continuation, 21);
                logger$_log$25.this$0 = obj;
                return logger$_log$25;
            case 22:
                Logger$_log$2 logger$_log$26 = new Logger$_log$2((DefaultErrorReporter) obj3, (Throwable) obj2, continuation, 22);
                logger$_log$26.this$0 = obj;
                return logger$_log$26;
            case 23:
                return new Logger$_log$2((NavHostController) this.this$0, (Function1) obj3, (MutableState) obj2, continuation, 23);
            case 24:
                return new Logger$_log$2((StatefulWorkflow.RenderContext) this.this$0, (DocumentWorkflow) obj2, (String) obj3, continuation);
            case 25:
                return new Logger$_log$2((StatefulWorkflow.RenderContext) this.this$0, (DocumentWorkflow) obj3, (DocumentWorkflow.State.UploadState.UploadFiles) obj2, continuation, 25);
            case 26:
                return new Logger$_log$2((Logger) this.this$0, (String) obj3, (LogLevel) obj2, continuation, 26);
            case 27:
                return new Logger$_log$2((DeviceFeatureRequestWorkflow) this.this$0, (StatefulWorkflow.RenderContext) obj3, (DeviceFeatureRequestWorkflow.Props) obj2, continuation, 27);
            default:
                Logger$_log$2 logger$_log$27 = new Logger$_log$2((Response) obj3, (UiStepBottomSheet$$ExternalSyntheticLambda4) obj2, continuation, 28);
                logger$_log$27.this$0 = obj;
                return logger$_log$27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((Logger$_log$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a8, code lost:
    
        if (r0.length() == 0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v84, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.squareup.cash.transfers.viewmodels.WithdrawViewModel$DepositPreferenceOption] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.squareup.cash.transfers.viewmodels.WithdrawViewModel$DepositPreferenceOption] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.squareup.cash.transfers.viewmodels.WithdrawViewModel$DepositPreferenceOption] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Screen screen;
        State state;
        Object value;
        AccountPickerState accountPickerState;
        Object value2;
        ConsentState consentState;
        Object value3;
        LinkAccountPickerState linkAccountPickerState;
        Object value4;
        NetworkingLinkSignupState networkingLinkSignupState;
        Object value5;
        IDConsentContentState iDConsentContentState;
        FinancialConnectionsSessionManifest.Pane pane;
        String string2;
        Object obj2;
        String failure;
        Object failure2;
        int i = this.$r8$classId;
        int i2 = 9;
        int i3 = 4;
        int i4 = 3;
        int i5 = 1;
        Continuation continuation = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = this.$message;
        Object obj6 = this.$subsystem;
        switch (i) {
            case 0:
                String str = (String) obj5;
                Logger logger = (Logger) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    File access$getLogFile = Logger.access$getLogFile(logger, (String) obj6);
                    File parentFile = access$getLogFile.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    LogLevel logLevel = LogLevel.Error;
                    String str2 = "Error," + logger.dateFormat.format(new Date()) + "," + str + "\n";
                    FileWriter fileWriter = new FileWriter(access$getLogFile, true);
                    try {
                        Writer append = fileWriter.append((CharSequence) str2);
                        fileWriter.close();
                        return append;
                    } finally {
                    }
                } catch (Exception unused) {
                    return Unit.INSTANCE;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Article article = (Article) obj6;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj5;
                Analytics analytics = (Analytics) localEditorialPresenter.installedStore;
                List list = article.links;
                String joinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(i2), 30);
                String str3 = ((SupportScreens.UnauthenticatedArticleScreen) localEditorialPresenter.clock).flowToken;
                JsonAdapter jsonAdapter = (JsonAdapter) ((kotlin.Lazy) localEditorialPresenter.screen).getValue();
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Link) it.next()).token);
                }
                analytics.track(new CustomerSupportAccessViewNodes(joinToString$default, str3, jsonAdapter.toJson(arrayList), article.token, null, null, Integer.valueOf(list.size()), CustomerSupportAccessViewNodes.Trigger.NODE, (String) localEditorialPresenter.responseContextHandler, null, null, 7728), null);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EmvPaymentResult emvPaymentResult = (EmvPaymentResult) obj6;
                MutableState mutableState = (MutableState) obj5;
                if (((TapToPayPaymentPresenter$State) mutableState.getValue()) instanceof TapToPayPaymentPresenter$State.ProcessingCardData) {
                    mutableState.setValue(new TapToPayPaymentPresenter$State.PaymentRequested(emvPaymentResult));
                } else {
                    TapToPayPaymentPresenter$State.FailureReason failureReason = TapToPayPaymentPresenter$State.FailureReason.UNEXPECTED_PAYMENT_RESULT;
                    TapToPayPaymentPresenter$State tapToPayPaymentPresenter$State = (TapToPayPaymentPresenter$State) mutableState.getValue();
                    mutableState.setValue(new TapToPayPaymentPresenter$State.RetryableFailure(failureReason, Recorder$$ExternalSyntheticOutline2.m("Unexpected paymentResult in state ", tapToPayPaymentPresenter$State != null ? Reflection.factory.getOrCreateKotlinClass(tapToPayPaymentPresenter$State.getClass()).getSimpleName() : null), null, 4));
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ThreeDsPresenter threeDsPresenter = (ThreeDsPresenter) obj6;
                JobKt.launch$default(coroutineScope, threeDsPresenter.ioDispatcher, null, new TaxWebAppPresenter$models$1$1(threeDsPresenter, threeDsPresenter.args.minimumDelayMs != null ? JobKt.launch$default(coroutineScope, null, null, new ExoPlayerVideoView.AnonymousClass2(threeDsPresenter, continuation, i4), 3) : null, (MutableState) obj5, (Continuation) null), 2);
                return Unit.INSTANCE;
            case 4:
                List list3 = (List) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj5;
                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption = (WithdrawViewModel.DepositPreferenceOption) mutableState2.getValue();
                DepositPreference depositPreference = depositPreferenceOption != null ? depositPreferenceOption.depositPreference : null;
                if (depositPreference != null) {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (((WithdrawViewModel.DepositPreferenceOption) next).depositPreference == depositPreference) {
                                obj3 = next;
                            }
                        }
                    }
                    ?? r8 = (WithdrawViewModel.DepositPreferenceOption) obj3;
                    continuation = r8;
                    if (r8 == 0) {
                        continuation = (WithdrawViewModel.DepositPreferenceOption) mutableState2.getValue();
                    }
                } else {
                    WithdrawScreen withdrawScreen = ((WithdrawPresenter) obj6).args;
                    if (withdrawScreen.depositPreference != null) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption2 = (WithdrawViewModel.DepositPreferenceOption) next2;
                                if (depositPreferenceOption2.enabled && depositPreferenceOption2.depositPreference == withdrawScreen.depositPreference) {
                                    obj4 = next2;
                                }
                            }
                        }
                        continuation = (WithdrawViewModel.DepositPreferenceOption) obj4;
                    }
                }
                mutableState2.setValue(continuation);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AmountDisplayState amountDisplayState = (AmountDisplayState) this.this$0;
                AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj6;
                CurrencyCode currencyCode = keypad.currentAmount.currency_code;
                currencyCode.getClass();
                amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14));
                Long l = keypad.maxAmount.amount;
                l.getClass();
                ((KeypadAmount) obj5).maxAmountCents = l.longValue();
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                WithdrawViewModel.ManagedAccountAmountEntry managedAccountAmountEntry = (WithdrawViewModel.ManagedAccountAmountEntry) obj6;
                ((AmountDisplayState) this.this$0).applyConfig(new AmountConfig.MoneyConfig(managedAccountAmountEntry.amountConfig.currency, null, false, 0, 14));
                ((KeypadAmount) obj5).setMaxAmount(new Double(managedAccountAmountEntry.amountConfig.maxAmount));
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState3 = (MutableState) obj5;
                RealAlertBannerPresenter realAlertBannerPresenter = (RealAlertBannerPresenter) obj6;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((AlertBannerViewModel) this.this$0) != null && ((AdversityBanner) mutableState3.getValue()) != null) {
                    Analytics analytics2 = (Analytics) realAlertBannerPresenter.analytics;
                    int ordinal = ((AlertBannerScreen) realAlertBannerPresenter.screen).ordinal();
                    if (ordinal == 0) {
                        screen = Screen.ACTIVITY_TAB;
                    } else if (ordinal == 1) {
                        screen = Screen.MONEY_TAB;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screen = Screen.PAYMENT_PAD;
                    }
                    AdversityBanner adversityBanner = (AdversityBanner) mutableState3.getValue();
                    adversityBanner.getClass();
                    AdversityBanner.Style style = adversityBanner.style;
                    style.getClass();
                    int ordinal2 = style.ordinal();
                    if (ordinal2 == 0) {
                        state = State.WARNING;
                    } else if (ordinal2 == 1) {
                        state = State.INFO;
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        state = State.SUCCESS;
                    }
                    analytics2.track(new AlertBannerNotificationInteractView(screen, state), null);
                }
                return Unit.INSTANCE;
            case 8:
                byte[] bArr = (byte[]) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ProduceStateScope) obj6).setValue(bArr);
                ((MutableState) obj5).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardScene cardScene = (CardScene) this.this$0;
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                ((MutableState) obj5).setValue(cardScene);
                ((Function1) obj6).invoke(cardScene);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) obj5;
                boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                CardSchemeViewModel.Module.HeroTag heroTag = (CardSchemeViewModel.Module.HeroTag) this.this$0;
                if (booleanValue != heroTag.isLocked) {
                    ((PlatformHapticFeedback) obj6).m769performHapticFeedbackCdsT49E(0);
                    mutableState4.setValue(Boolean.valueOf(heroTag.isLocked));
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardRegistry cardRegistry = (CardRegistry) this.this$0;
                if (cardRegistry != null) {
                    CardSchemeViewModel.Module.HeroTag heroTag2 = (CardSchemeViewModel.Module.HeroTag) obj6;
                    Integer num = new Integer(((ParcelableSnapshotMutableIntState) ((DefaultPagerState) obj5).scrollPosition.elementTypes).getIntValue());
                    Integer num2 = num.intValue() > 0 ? num : null;
                    cardRegistry.activeHeroTagStateOwned = true;
                    cardRegistry.activeHeroTag$delegate.setValue(heroTag2);
                    cardRegistry.activeHeroTagPage$delegate.setValue(num2);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TextSetter textSetter = (TextSetter) this.this$0;
                String m = Recorder$$ExternalSyntheticOutline2.m((String) textSetter.textSwitcher, "/proxy", (String) obj6);
                String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("tax_form_", (String) obj5, ".pdf");
                RealFileDownloader realFileDownloader = (RealFileDownloader) textSetter.textView;
                FileDownloader$Category fileDownloader$Category = FileDownloader$Category.SHIFTS;
                if (!realFileDownloader.ready(fileDownloader$Category, m2) && realFileDownloader.download(fileDownloader$Category, m2, m, true) != FileDownloader$DownloadStatus.SUCCESS) {
                    Timber.Forest.w("Failed to download tax form PDF", new Object[0]);
                    return null;
                }
                return realFileDownloader.localUri(fileDownloader$Category, m2);
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                IntentConfirmationChallengeNextActionHandler intentConfirmationChallengeNextActionHandler = (IntentConfirmationChallengeNextActionHandler) this.this$0;
                ((IntentConfirmationChallengeNextActionStarter) intentConfirmationChallengeNextActionHandler.intentConfirmationChallengeNextActionStarterFactory.invoke((ActivityHost) obj6)).start(new IntentConfirmationChallengeActivityContract.Args((String) intentConfirmationChallengeNextActionHandler.publishableKeyProvider.invoke(), intentConfirmationChallengeNextActionHandler.productUsageTokens, (StripeIntent) obj5));
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AccountPickerState$ViewEffect$OpenUrl accountPickerState$ViewEffect$OpenUrl = (AccountPickerState$ViewEffect$OpenUrl) this.this$0;
                if (!(accountPickerState$ViewEffect$OpenUrl instanceof AccountPickerState$ViewEffect$OpenUrl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((UriHandler) obj6).openUri(accountPickerState$ViewEffect$OpenUrl.url);
                StateFlowImpl stateFlowImpl = ((AccountPickerViewModel) obj5)._stateFlow;
                do {
                    value = stateFlowImpl.getValue();
                    accountPickerState = (AccountPickerState) value;
                    accountPickerState.getClass();
                } while (!stateFlowImpl.compareAndSet(value, AccountPickerState.copy$default(accountPickerState, null, null, null, null, null, 31)));
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ConsentState$ViewEffect$OpenUrl consentState$ViewEffect$OpenUrl = (ConsentState$ViewEffect$OpenUrl) this.this$0;
                if (!(consentState$ViewEffect$OpenUrl instanceof ConsentState$ViewEffect$OpenUrl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((UriHandler) obj6).openUri(consentState$ViewEffect$OpenUrl.url);
                StateFlowImpl stateFlowImpl2 = ((ConsentViewModel) obj5)._stateFlow;
                do {
                    value2 = stateFlowImpl2.getValue();
                    consentState = (ConsentState) value2;
                    consentState.getClass();
                } while (!stateFlowImpl2.compareAndSet(value2, ConsentState.copy$default(consentState, null, null, null, 7)));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LinkAccountPickerState$ViewEffect$OpenUrl linkAccountPickerState$ViewEffect$OpenUrl = (LinkAccountPickerState$ViewEffect$OpenUrl) this.this$0;
                if (!(linkAccountPickerState$ViewEffect$OpenUrl instanceof LinkAccountPickerState$ViewEffect$OpenUrl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((UriHandler) obj6).openUri(linkAccountPickerState$ViewEffect$OpenUrl.url);
                StateFlowImpl stateFlowImpl3 = ((LinkAccountPickerViewModel) obj5)._stateFlow;
                do {
                    value3 = stateFlowImpl3.getValue();
                    linkAccountPickerState = (LinkAccountPickerState) value3;
                    linkAccountPickerState.getClass();
                } while (!stateFlowImpl3.compareAndSet(value3, LinkAccountPickerState.copy$default(linkAccountPickerState, null, null, null, 3)));
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NetworkingLinkSignupState$ViewEffect$OpenUrl networkingLinkSignupState$ViewEffect$OpenUrl = (NetworkingLinkSignupState$ViewEffect$OpenUrl) this.this$0;
                if (!(networkingLinkSignupState$ViewEffect$OpenUrl instanceof NetworkingLinkSignupState$ViewEffect$OpenUrl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((UriHandler) obj6).openUri(networkingLinkSignupState$ViewEffect$OpenUrl.url);
                StateFlowImpl stateFlowImpl4 = ((NetworkingLinkSignupViewModel) obj5)._stateFlow;
                do {
                    value4 = stateFlowImpl4.getValue();
                    networkingLinkSignupState = (NetworkingLinkSignupState) value4;
                    networkingLinkSignupState.getClass();
                } while (!stateFlowImpl4.compareAndSet(value4, NetworkingLinkSignupState.copy$default(networkingLinkSignupState, null, null, null, null, null, null, 95)));
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                IDConsentContentState$ViewEffect$OpenUrl iDConsentContentState$ViewEffect$OpenUrl = (IDConsentContentState$ViewEffect$OpenUrl) this.this$0;
                if (iDConsentContentState$ViewEffect$OpenUrl == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((UriHandler) obj6).openUri(iDConsentContentState$ViewEffect$OpenUrl.url);
                StateFlowImpl stateFlowImpl5 = ((IDConsentContentViewModel) obj5)._stateFlow;
                do {
                    value5 = stateFlowImpl5.getValue();
                    iDConsentContentState = (IDConsentContentState) value5;
                    iDConsentContentState.getClass();
                } while (!stateFlowImpl5.compareAndSet(value5, IDConsentContentState.copy$default(iDConsentContentState, null, null, null, 3)));
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.this$0;
                Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
                Continuation continuation2 = null;
                if (arguments$navigation_common_release == null || (string2 = arguments$navigation_common_release.getString("referrer")) == null) {
                    pane = null;
                } else {
                    Iterator it4 = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (Intrinsics.areEqual(((FinancialConnectionsSessionManifest.Pane) obj2).getValue(), string2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    pane = (FinancialConnectionsSessionManifest.Pane) obj2;
                }
                FinancialConnectionsSessionManifest.Pane pane2 = DestinationMappersKt.getPane(navBackStackEntry.destination);
                FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) obj6;
                financialConnectionsSheetNativeViewModel.getClass();
                if (DestinationMappersKt.getDestination(pane2).logPaneLaunched) {
                    JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetNativeViewModel), null, null, new Logger$_log$2(financialConnectionsSheetNativeViewModel, pane2, pane, continuation2, 20), 3);
                }
                ((MutableState) obj5).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = ((FinancialConnectionsSheetNativeViewModel) this.this$0).eventTracker;
                FinancialConnectionsSessionManifest.Pane pane3 = (FinancialConnectionsSessionManifest.Pane) obj6;
                FinancialConnectionsSessionManifest.Pane pane4 = (FinancialConnectionsSessionManifest.Pane) obj5;
                Pair pair = new Pair("referrer_pane", pane4 != null ? pane4.getValue() : null);
                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(pair, new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane3)))), "pane.launched", true));
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str4 = (String) obj6;
                Lazy lazy = (Lazy) obj5;
                try {
                    Result.Companion companion = Result.Companion;
                    URLConnection openConnection = new URL(str4).openConnection();
                    openConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((StripeApiRepository$$ExternalSyntheticLambda5) lazy.initializer).invoke(httpURLConnection);
                    }
                    failure = httpURLConnection.getHeaderField("Location");
                    if (failure != null) {
                        break;
                    }
                    failure = str4;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                return Result.m4120exceptionOrNullimpl(failure) == null ? failure : str4;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) obj6;
                Throwable th2 = (Throwable) obj5;
                try {
                    Result.Companion companion3 = Result.Companion;
                    DefaultErrorReporter.access$send(defaultErrorReporter, defaultErrorReporter.createRequestBody$3ds2sdk_release(th2));
                    failure2 = Unit.INSTANCE;
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.Companion;
                    failure2 = new Result.Failure(th3);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl != null) {
                    defaultErrorReporter.logger.error("Failed to send error report.", m4120exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) obj6).invoke(new NavBackStackEntryUpdate(((NavHostController) this.this$0).getPreviousBackStackEntry(), (NavBackStackEntry) ((MutableState) obj5).getValue()));
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((StatefulWorkflow.RenderContext) this.this$0).$$delegate_0.getActionSink().send(Workflows.action$default((DocumentWorkflow) obj5, new StateBindingsKt$$ExternalSyntheticLambda0((String) obj6, 15)));
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((StatefulWorkflow.RenderContext) this.this$0).$$delegate_0.getActionSink().send(Workflows.action$default((DocumentWorkflow) obj6, new HCaptcha$$ExternalSyntheticLambda2((DocumentWorkflow.State.UploadState.UploadFiles) obj5, 12)));
                return Unit.INSTANCE;
            case 26:
                String str5 = (String) obj6;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    File access$getLogFile2 = Logger.access$getLogFile((Logger) this.this$0, str5);
                    if (!access$getLogFile2.exists()) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    SelfieWorkflow$$ExternalSyntheticLambda38 selfieWorkflow$$ExternalSyntheticLambda38 = new SelfieWorkflow$$ExternalSyntheticLambda38(16, (LogLevel) obj5, str5, sb);
                    Charset charset = Charsets.UTF_8;
                    charset.getClass();
                    AppUpdateData.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(access$getLogFile2), charset)), selfieWorkflow$$ExternalSyntheticLambda38);
                    return sb.toString();
                } catch (Exception unused2) {
                    return null;
                }
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = (DeviceFeatureRequestWorkflow) this.this$0;
                Context context = deviceFeatureRequestWorkflow.applicationContext;
                context.getClass();
                Object systemService = context.getSystemService("location");
                systemService.getClass();
                boolean isProviderEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
                BaseRenderContext baseRenderContext = ((StatefulWorkflow.RenderContext) obj6).$$delegate_0;
                if (isProviderEnabled) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3(deviceFeatureRequestWorkflow, (DeviceFeatureRequestWorkflow.Props) obj5, i3)));
                } else {
                    baseRenderContext.getActionSink().send(Workflows.action$default(deviceFeatureRequestWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(i2)));
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                SupervisorJobImpl SupervisorJob$default = JobKt.SupervisorJob$default();
                Response response = (Response) obj6;
                UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4 = (UiStepBottomSheet$$ExternalSyntheticLambda4) obj5;
                JobKt.launch$default(coroutineScope2, SupervisorJob$default, null, new InputSelectBottomSheetController$runAfterKeyboardShown$1$1(SupervisorJob$default, response, uiStepBottomSheet$$ExternalSyntheticLambda4, (Continuation) null), 2);
                JobKt.launch$default(coroutineScope2, SupervisorJob$default, null, new InputSelectBottomSheetController$runAfterKeyboardShown$1$1(response, SupervisorJob$default, uiStepBottomSheet$$ExternalSyntheticLambda4, (Continuation) null), 2);
                JobKt.launch$default(coroutineScope2, SupervisorJob$default, null, new RxConvertKt$asFlow$1(SupervisorJob$default, uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, i5), 2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger$_log$2(StatefulWorkflow.RenderContext renderContext, DocumentWorkflow documentWorkflow, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 24;
        this.this$0 = renderContext;
        this.$message = documentWorkflow;
        this.$subsystem = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$_log$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$subsystem = obj2;
        this.$message = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$_log$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$subsystem = obj;
        this.$message = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger$_log$2(Object obj, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$subsystem = obj;
        this.$message = obj2;
    }
}
