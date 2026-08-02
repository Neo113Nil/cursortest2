package com.squareup.workflow1.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.fillr.n;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.pushnotification.PushNotificationDeclineComplete;
import com.squareup.cash.cdf.pushnotification.PushNotificationDeclineReceiveError;
import com.squareup.cash.cdf.shifts.ShiftsClockInComplete;
import com.squareup.cash.cdf.shifts.ShiftsClockInFail;
import com.squareup.cash.cdf.shifts.ShiftsNoteSaveComplete;
import com.squareup.cash.cdf.shifts.ShiftsTakeBreakComplete;
import com.squareup.cash.cdf.shifts.ShiftsTakeBreakFail;
import com.squareup.cash.clientroutes.RealDeepLinkParser$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationResult;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter$models$2$1$2;
import com.squareup.cash.transfers.presenters.RecurringReloadConfigurationPresenter;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.ui.gcm.NotificationActionService;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$$ExternalSyntheticLambda20;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda18;
import com.squareup.cash.wallet.views.CardTransitionKt$cardTransition$4$1$1$WhenMappings;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.screens.ClockInResult$Success;
import com.squareup.cash.work.screens.ShiftNoteResult$Saved;
import com.squareup.cash.work.screens.ShiftNoteScreen;
import com.squareup.cash.work.screens.TakeBreakBottomSheetScreen;
import com.squareup.cash.work.screens.TakeBreakResult$Success;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CancelPaymentRequest;
import com.squareup.protos.franklin.app.CancelPaymentResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onUserCancel$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.hcaptcha.DefaultHCaptchaService;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class WorkflowLayout$start$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $environment;
    public Object $lifecycle;
    public final /* synthetic */ int $r8$classId;
    public Object $renderings;
    public Object $repeatOnLifecycle;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowLayout$start$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$lifecycle = obj;
        this.$repeatOnLifecycle = obj2;
        this.$renderings = obj3;
        this.this$0 = obj4;
        this.$environment = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r6 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$util$android$RealIntentFactory$authenticatedUrls$decodedUrlWithToken$1$2(Object obj) {
        Object obj2;
        Ref$ObjectRef ref$ObjectRef;
        RealUrlAuthenticator realUrlAuthenticator = ((RealIntentFactory) this.$renderings).urlAuthenticator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = (String) this.this$0;
            this.label = 1;
            obj = realUrlAuthenticator.authenticate(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.$repeatOnLifecycle;
                obj2 = this.$lifecycle;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef.element = obj;
                return obj2;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.$environment;
        this.$lifecycle = obj;
        this.$repeatOnLifecycle = ref$ObjectRef2;
        this.label = 2;
        Object obj3 = realUrlAuthenticator.token(this);
        if (obj3 != coroutineSingletons) {
            Object obj4 = obj;
            obj = obj3;
            obj2 = obj4;
            ref$ObjectRef = ref$ObjectRef2;
            ref$ObjectRef.element = obj;
            return obj2;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #1 {all -> 0x007c, blocks: (B:75:0x0043, B:77:0x0049, B:79:0x004f, B:7:0x0081, B:9:0x008d, B:10:0x0093, B:13:0x009e, B:14:0x00be, B:23:0x00e0, B:24:0x00e6, B:26:0x00ee, B:28:0x00f4, B:30:0x00fa, B:32:0x0100, B:33:0x0106, B:35:0x011f, B:38:0x012c, B:40:0x0132, B:41:0x0138, B:43:0x0140, B:44:0x0144, B:46:0x014a, B:48:0x0151, B:50:0x0157, B:51:0x015d, B:53:0x0165, B:54:0x0169, B:56:0x016f, B:57:0x0173, B:60:0x018e, B:62:0x019c, B:63:0x01a0, B:66:0x01b8, B:84:0x0067, B:86:0x0074, B:81:0x005f), top: B:74:0x0043, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:75:0x0043, B:77:0x0049, B:79:0x004f, B:7:0x0081, B:9:0x008d, B:10:0x0093, B:13:0x009e, B:14:0x00be, B:23:0x00e0, B:24:0x00e6, B:26:0x00ee, B:28:0x00f4, B:30:0x00fa, B:32:0x0100, B:33:0x0106, B:35:0x011f, B:38:0x012c, B:40:0x0132, B:41:0x0138, B:43:0x0140, B:44:0x0144, B:46:0x014a, B:48:0x0151, B:50:0x0157, B:51:0x015d, B:53:0x0165, B:54:0x0169, B:56:0x016f, B:57:0x0173, B:60:0x018e, B:62:0x019c, B:63:0x01a0, B:66:0x01b8, B:84:0x0067, B:86:0x0074, B:81:0x005f), top: B:74:0x0043, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$stripe$android$financialconnections$FinancialConnectionsSheetViewModel$handleOnNewIntent$1(Object obj) {
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
        MutexImpl mutexImpl;
        Intent intent;
        String uri;
        Uri parse;
        Object value;
        Object value2;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        Uri.Builder buildUpon;
        Uri.Builder buildUpon2;
        Uri.Builder clearQuery;
        Uri build;
        Object value3;
        FinancialConnectionsSheetState financialConnectionsSheetState2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.this$0;
            MutexImpl mutexImpl2 = financialConnectionsSheetViewModel.mutex;
            Intent intent2 = (Intent) this.$environment;
            this.$lifecycle = mutexImpl2;
            this.$repeatOnLifecycle = intent2;
            this.$renderings = financialConnectionsSheetViewModel;
            this.label = 1;
            if (mutexImpl2.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutexImpl = mutexImpl2;
            intent = intent2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = (FinancialConnectionsSheetViewModel) this.$renderings;
            intent = (Intent) this.$repeatOnLifecycle;
            mutexImpl = (MutexImpl) this.$lifecycle;
            SafeTrace.throwOnFailure(obj);
            financialConnectionsSheetViewModel = financialConnectionsSheetViewModel2;
        }
        if (intent != null) {
            try {
                Uri data = intent.getData();
                if (data != null && (uri = data.toString()) != null) {
                    InitializerViewModelFactory initializerViewModelFactory = FinancialConnectionsSheetViewModel.Factory;
                    financialConnectionsSheetViewModel.getClass();
                    Uri.parse(uri).buildUpon().clearQuery();
                    try {
                        Result.Companion companion = Result.Companion;
                        parse = Uri.parse(uri);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(new Result.Failure(th));
                        if (m4120exceptionOrNullimpl != null) {
                            financialConnectionsSheetViewModel.logger.error("Could not parse web flow url", m4120exceptionOrNullimpl);
                        }
                    }
                    FinancialConnectionsSheetState financialConnectionsSheetState3 = (FinancialConnectionsSheetState) financialConnectionsSheetViewModel.stateFlow.$$delegate_0.getValue();
                    int i2 = 0;
                    if (Intrinsics.areEqual(parse == null ? parse.getHost() : null, "native-redirect")) {
                        if (Intrinsics.areEqual(parse != null ? parse.getHost() : null, "link-accounts")) {
                            Uri.Builder buildUpon3 = parse.buildUpon();
                            if (Intrinsics.areEqual((buildUpon3 == null || (clearQuery = buildUpon3.clearQuery()) == null || (build = clearQuery.build()) == null) ? null : build.getPath(), "/" + financialConnectionsSheetViewModel.applicationId + "/authentication_return")) {
                                financialConnectionsSheetViewModel.setState(new RealDeepLinkParser$$ExternalSyntheticLambda0(parse, 2));
                            }
                        }
                        String valueOf = String.valueOf((parse == null || (buildUpon2 = parse.buildUpon()) == null) ? null : buildUpon2.clearQuery());
                        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = financialConnectionsSheetState3.manifest;
                        if (valueOf.equals(financialConnectionsSessionManifest != null ? financialConnectionsSessionManifest.successUrl : null)) {
                            FinancialConnectionsSheetViewModel.access$onFlowSuccess(financialConnectionsSheetViewModel, financialConnectionsSheetState3, parse);
                        } else {
                            String valueOf2 = String.valueOf((parse == null || (buildUpon = parse.buildUpon()) == null) ? null : buildUpon.clearQuery());
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = financialConnectionsSheetState3.manifest;
                            if (valueOf2.equals(financialConnectionsSessionManifest2 != null ? financialConnectionsSessionManifest2.cancelUrl : null)) {
                                InitializerViewModelFactory initializerViewModelFactory2 = FinancialConnectionsSheetViewModel.Factory;
                                StateFlowImpl stateFlowImpl = financialConnectionsSheetViewModel._stateFlow;
                                do {
                                    value2 = stateFlowImpl.getValue();
                                    financialConnectionsSheetState = (FinancialConnectionsSheetState) value2;
                                    financialConnectionsSheetState.getClass();
                                } while (!stateFlowImpl.compareAndSet(value2, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23)));
                                JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetViewModel), null, null, new FinancialConnectionsSheetViewModel$onUserCancel$1(financialConnectionsSheetViewModel, financialConnectionsSheetState3, continuation, i2), 3);
                            } else {
                                InitializerViewModelFactory initializerViewModelFactory3 = FinancialConnectionsSheetViewModel.Factory;
                                StateFlowImpl stateFlowImpl2 = financialConnectionsSheetViewModel._stateFlow;
                                do {
                                    value = stateFlowImpl2.getValue();
                                } while (!stateFlowImpl2.compareAndSet(value, FinancialConnectionsSheetState.copy$default((FinancialConnectionsSheetState) value, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23)));
                                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(new Exception("Error processing FinancialConnectionsSheet intent")), 6);
                            }
                        }
                    } else {
                        String uri2 = parse.toString();
                        uri2.getClass();
                        String replaceFirst = StringsKt__StringsJVMKt.replaceFirst(uri2, "stripe-auth://native-redirect/" + financialConnectionsSheetViewModel.applicationId + "/", "", false);
                        StateFlowImpl stateFlowImpl3 = financialConnectionsSheetViewModel._stateFlow;
                        do {
                            value3 = stateFlowImpl3.getValue();
                            financialConnectionsSheetState2 = (FinancialConnectionsSheetState) value3;
                            financialConnectionsSheetState2.getClass();
                        } while (!stateFlowImpl3.compareAndSet(value3, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState2, false, null, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl(replaceFirst), 5)));
                    }
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                mutexImpl.unlock(null);
                throw th2;
            }
        }
        parse = null;
        FinancialConnectionsSheetState financialConnectionsSheetState32 = (FinancialConnectionsSheetState) financialConnectionsSheetViewModel.stateFlow.$$delegate_0.getValue();
        int i22 = 0;
        if (Intrinsics.areEqual(parse == null ? parse.getHost() : null, "native-redirect")) {
        }
        mutexImpl.unlock(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(1:(1:(3:5|6|7)(2:9|10))(1:11))(3:61|(1:63)|64)|12|13|14|15|16|17|18|(1:20)|21|(1:54)(1:25)|(1:53)|(1:30)|31|32|33|34|35|36|37|(1:39)|40|(1:42)(1:46)|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d9, code lost:
    
        if (r0.enqueue(r7, r23) != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01db, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0117, code lost:
    
        r4 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r4 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005d, code lost:
    
        if (r5 == r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$stripe$android$financialconnections$analytics$FinancialConnectionsAnalyticsTrackerImpl$track$1(Object obj) {
        n nVar;
        String str;
        Map map;
        Object access$commonParams;
        ApplicationInfo applicationInfo;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = (FinancialConnectionsAnalyticsTrackerImpl) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            nVar = financialConnectionsAnalyticsTrackerImpl.requestFactory;
            FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = (FinancialConnectionsAnalyticsEvent) this.$environment;
            str = financialConnectionsAnalyticsEvent.eventName;
            map = financialConnectionsAnalyticsEvent.params;
            if (map == null) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            this.$lifecycle = nVar;
            this.$repeatOnLifecycle = str;
            this.$renderings = map;
            this.label = 1;
            access$commonParams = FinancialConnectionsAnalyticsTrackerImpl.access$commonParams(financialConnectionsAnalyticsTrackerImpl, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            map = (Map) this.$renderings;
            String str2 = (String) this.$repeatOnLifecycle;
            nVar = (n) this.$lifecycle;
            SafeTrace.throwOnFailure(obj);
            str = str2;
            access$commonParams = obj;
        }
        LinkedHashMap plus = MapsKt__MapsKt.plus(map, (Map) access$commonParams);
        nVar.getClass();
        str.getClass();
        AnalyticsRequestV2.Companion companion = AnalyticsRequestV2.Companion;
        String str3 = (String) nVar.a;
        String str4 = (String) nVar.b;
        Pair pair = new Pair("os_version", Integer.valueOf(Build.VERSION.SDK_INT));
        Pair pair2 = new Pair("sdk_platform", "android");
        Pair pair3 = new Pair("sdk_version", "23.9.1");
        Pair pair4 = new Pair("device_type", Boxes$$ExternalSyntheticOutline1.m$1(Build.MANUFACTURER, "_", Build.BRAND, "_", Build.MODEL));
        Context context = (Context) nVar.d;
        context.getClass();
        Result.Companion companion2 = Result.Companion;
        Context context2 = context;
        Object failure = context.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        PackageInfo packageInfo = (PackageInfo) failure;
        CharSequence loadLabel = (packageInfo != null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(context2.getPackageManager());
        if (loadLabel != null || StringsKt.isBlank(loadLabel)) {
            loadLabel = null;
        }
        if (loadLabel == null) {
            loadLabel = context2.getPackageName();
            loadLabel.getClass();
        }
        Pair pair5 = new Pair("app_name", loadLabel);
        Pair pair6 = pair5;
        Object failure2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        PackageInfo packageInfo2 = (PackageInfo) failure2;
        LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair6, new Pair("app_version", packageInfo2 != null ? Integer.valueOf(packageInfo2.versionCode) : null), new Pair("device_id", Settings.Secure.getString(context2.getContentResolver(), "android_id")), new Pair("plugin_type", (String) nVar.c), new Pair("react_native_is_new_architecture", null), new Pair("react_native_version", null), new Pair("platform_info", Thread$State$EnumUnboxingLocalUtility.m("package_name", context2.getPackageName()))));
        companion.getClass();
        str3.getClass();
        str4.getClass();
        LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, MapsKt__MapsJVMKt.mapOf(new Pair("uses_work_manager", Boolean.FALSE)));
        Duration.Companion companion3 = Duration.Companion;
        AnalyticsRequestV2 analyticsRequestV2 = new AnalyticsRequestV2(str, str3, str4, Duration.m4175toDoubleimpl(DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS), DurationUnit.SECONDS), JsonUtilsKt.toJsonElement(plus3));
        DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor = financialConnectionsAnalyticsTrackerImpl.requestExecutor;
        this.$lifecycle = null;
        this.$repeatOnLifecycle = null;
        this.$renderings = null;
        this.label = 2;
    }

    private final Object invokeSuspend$com$stripe$android$financialconnections$domain$SaveAccountToLink$new$2(Object obj) {
        Set set = (Set) this.$lifecycle;
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
        SaveAccountToLink saveAccountToLink = (SaveAccountToLink) this.$repeatOnLifecycle;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = saveAccountToLink.repository;
        String str = saveAccountToLink.configuration.financialConnectionsSessionClientSecret;
        Locale locale = saveAccountToLink.locale;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String languageTag = locale.toLanguageTag();
        String str2 = (String) this.$renderings;
        String str3 = (String) this.this$0;
        String str4 = (String) this.$environment;
        this.$lifecycle = null;
        this.label = 1;
        Object postSaveAccountsToLink = financialConnectionsManifestRepositoryImpl.postSaveAccountsToLink(str, str2, str3, languageTag, str4, null, set, this);
        return postSaveAccountsToLink == coroutineSingletons ? coroutineSingletons : postSaveAccountsToLink;
    }

    private final Object invokeSuspend$com$stripe$android$financialconnections$presentation$FinancialConnectionsViewModel$execute$1(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Async async;
        Function2 function2 = (Function2) this.$renderings;
        StateFlowImpl stateFlowImpl = ((FinancialConnectionsViewModel) this.$repeatOnLifecycle)._stateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                KProperty1 kProperty1 = (KProperty1) this.this$0;
                do {
                    value3 = stateFlowImpl.getValue();
                } while (!stateFlowImpl.compareAndSet(value3, function2.invoke(value3, new Async.Loading((kProperty1 == null || (async = (Async) kProperty1.get(value3)) == null) ? null : async.invoke()))));
                Function1 function1 = (Function1) this.$environment;
                Result.Companion companion = Result.Companion;
                this.$lifecycle = null;
                this.label = 1;
                obj = function1.invoke(this);
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
            Result.Companion companion2 = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl == null) {
            do {
                value2 = stateFlowImpl.getValue();
            } while (!stateFlowImpl.compareAndSet(value2, function2.invoke(value2, new Async.Success(obj))));
        } else {
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.compareAndSet(value, function2.invoke(value, new Async.Fail(m4120exceptionOrNullimpl))));
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$stripe$android$hcaptcha$DefaultHCaptchaService$performPassiveHCaptcha$result$1$1(Object obj) {
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
        final DefaultHCaptchaService defaultHCaptchaService = (DefaultHCaptchaService) this.$lifecycle;
        final FragmentActivity fragmentActivity = (FragmentActivity) this.$repeatOnLifecycle;
        final String str = (String) this.$renderings;
        final String str2 = (String) this.this$0;
        Integer num = (Integer) this.$environment;
        final int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        this.label = 1;
        final StateFlowImpl stateFlowImpl = defaultHCaptchaService.cachedResult;
        Object first = FlowKt.first(new Flow() { // from class: com.stripe.android.hcaptcha.DefaultHCaptchaService$transformCachedResult$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = stateFlowImpl.collect(new CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$3(flowCollector, defaultHCaptchaService, fragmentActivity, str, str2, intValue), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            }
        }, this);
        return first == coroutineSingletons ? coroutineSingletons : first;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$environment;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new WorkflowLayout$start$1((Lifecycle) this.$lifecycle, (Lifecycle.State) this.$repeatOnLifecycle, (ReadonlyStateFlow) this.$renderings, (WorkflowLayout) obj3, (ViewEnvironment) obj2, continuation, 0);
            case 1:
                return new WorkflowLayout$start$1((MutableState) this.$renderings, (PhoneVerificationPresenter) obj3, (MutableState) obj2, continuation, 1);
            case 2:
                WorkflowLayout$start$1 workflowLayout$start$1 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (WorkHomePresenter) this.$renderings, (MutableState) obj3, (MutableState) obj2, 2);
                workflowLayout$start$1.$lifecycle = obj;
                return workflowLayout$start$1;
            case 3:
                return new WorkflowLayout$start$1((Function0) this.$lifecycle, (MutableState) this.$repeatOnLifecycle, (MutableState) this.$renderings, (MutableState) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                WorkflowLayout$start$1 workflowLayout$start$12 = new WorkflowLayout$start$1((RealObservabilityManager) this.$renderings, (Map) obj3, (HeroCardViewKt$Render$1$4$1.AnonymousClass2) obj2, continuation, 4);
                workflowLayout$start$12.$repeatOnLifecycle = obj;
                return workflowLayout$start$12;
            case 5:
                WorkflowLayout$start$1 workflowLayout$start$13 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (WorkHomePresenter) this.$renderings, (MutableState) obj3, (TapToPayPaymentData) obj2, 5);
                workflowLayout$start$13.$lifecycle = obj;
                return workflowLayout$start$13;
            case 6:
                WorkflowLayout$start$1 workflowLayout$start$14 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (TaxWebAppPresenter) this.$renderings, (MutableState) obj3, (MutableState) obj2, 6);
                workflowLayout$start$14.$lifecycle = obj;
                return workflowLayout$start$14;
            case 7:
                WorkflowLayout$start$1 workflowLayout$start$15 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (LinkedAccountsPresenter) this.$renderings, (State) obj3, (MutableState) obj2, 7);
                workflowLayout$start$15.$lifecycle = obj;
                return workflowLayout$start$15;
            case 8:
                return new WorkflowLayout$start$1((MutableState) this.$lifecycle, (MutableState) this.$repeatOnLifecycle, (LinkedAccountsPresenter) this.$renderings, (State) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                WorkflowLayout$start$1 workflowLayout$start$16 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (RecurringReloadConfigurationPresenter) this.$renderings, (String) obj3, (MutableState) obj2, 9);
                workflowLayout$start$16.$lifecycle = obj;
                return workflowLayout$start$16;
            case 10:
                WorkflowLayout$start$1 workflowLayout$start$17 = new WorkflowLayout$start$1((String) this.$repeatOnLifecycle, (String) this.$renderings, (String) obj3, (String) obj2, continuation, 10);
                workflowLayout$start$17.$lifecycle = obj;
                return workflowLayout$start$17;
            case 11:
                return new WorkflowLayout$start$1((String) this.$lifecycle, (NotificationActionService) this.$repeatOnLifecycle, (String) this.$renderings, (Intent) obj3, (Intent) obj2, continuation, 11);
            case 12:
                WorkflowLayout$start$1 workflowLayout$start$18 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (WalletHomePresenter) this.$renderings, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, 12);
                workflowLayout$start$18.$lifecycle = obj;
                return workflowLayout$start$18;
            case 13:
                WorkflowLayout$start$1 workflowLayout$start$19 = new WorkflowLayout$start$1((CardRegistry) this.$repeatOnLifecycle, (String) this.$renderings, (MutableState) obj3, (MutableState) obj2, continuation, 13);
                workflowLayout$start$19.$lifecycle = obj;
                return workflowLayout$start$19;
            case 14:
                WorkflowLayout$start$1 workflowLayout$start$110 = new WorkflowLayout$start$1((PointerInputScope) this.$repeatOnLifecycle, (MutableState) this.$renderings, (MutableState) obj3, (Animatable) obj2, continuation, 14);
                workflowLayout$start$110.$lifecycle = obj;
                return workflowLayout$start$110;
            case 15:
                return new WorkflowLayout$start$1((MutableState) this.$lifecycle, (MutableState) this.$repeatOnLifecycle, (CardNuxState) this.$renderings, (ActivityManager) obj3, (CardRegistry) obj2, continuation, 15);
            case 16:
                WorkflowLayout$start$1 workflowLayout$start$111 = new WorkflowLayout$start$1((PointerInputScope) this.$repeatOnLifecycle, (MutableState) this.$renderings, (MutableState) obj3, (MutableSharedFlow) obj2, continuation, 16);
                workflowLayout$start$111.$lifecycle = obj;
                return workflowLayout$start$111;
            case 17:
                WorkflowLayout$start$1 workflowLayout$start$112 = new WorkflowLayout$start$1((Ref$ObjectRef) this.$repeatOnLifecycle, (ShiftListViewKt$$ExternalSyntheticLambda10) this.$renderings, (CardScene) obj3, (FiniteAnimationSpec) obj2, continuation, 17);
                workflowLayout$start$112.$lifecycle = obj;
                return workflowLayout$start$112;
            case 18:
                WorkflowLayout$start$1 workflowLayout$start$113 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (TaxAuthorizationPresenter) this.$renderings, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, 18);
                workflowLayout$start$113.$lifecycle = obj;
                return workflowLayout$start$113;
            case 19:
                return new WorkflowLayout$start$1((PoolsListPresenter) this.$lifecycle, (ClockInBottomSheetViewEvent.ClockInClicked) this.$repeatOnLifecycle, (ShiftNotePresenter$models$1$1) this.$renderings, (AskedQuestion) obj3, (ShiftNotePresenter$models$1$1) obj2, continuation, 19);
            case 20:
                return new WorkflowLayout$start$1((PdfPreviewPresenter) this.$lifecycle, (String) this.$repeatOnLifecycle, (String) this.$renderings, (String) obj3, (ShiftNotePresenter$models$1$1) obj2, continuation, 20);
            case 21:
                return new WorkflowLayout$start$1((PdfPreviewPresenter) this.$lifecycle, (String) this.$repeatOnLifecycle, (TakeBreakBottomSheetViewEvent.BreakSelected) this.$renderings, (TakeBreakBottomSheetScreen.BreakInfo) obj3, (AskedQuestion) obj2, continuation, 21);
            case 22:
                WorkflowLayout$start$1 workflowLayout$start$114 = new WorkflowLayout$start$1((Flow) this.$repeatOnLifecycle, continuation, (WorkHomePresenter) this.$renderings, (MutableState) obj3, (MutableState) obj2, 22);
                workflowLayout$start$114.$lifecycle = obj;
                return workflowLayout$start$114;
            case 23:
                return new WorkflowLayout$start$1((RealIntentFactory) this.$renderings, (String) obj3, (Ref$ObjectRef) obj2, continuation, 23);
            case 24:
                return new WorkflowLayout$start$1((FinancialConnectionsSheetViewModel) obj3, (Intent) obj2, continuation, 24);
            case 25:
                return new WorkflowLayout$start$1((FinancialConnectionsAnalyticsTrackerImpl) obj3, (FinancialConnectionsAnalyticsEvent) obj2, continuation, 25);
            case 26:
                WorkflowLayout$start$1 workflowLayout$start$115 = new WorkflowLayout$start$1((SaveAccountToLink) this.$repeatOnLifecycle, (String) this.$renderings, (String) obj3, (String) obj2, continuation, 26);
                workflowLayout$start$115.$lifecycle = obj;
                return workflowLayout$start$115;
            case 27:
                WorkflowLayout$start$1 workflowLayout$start$116 = new WorkflowLayout$start$1((FinancialConnectionsViewModel) this.$repeatOnLifecycle, (Function2) this.$renderings, (KProperty1) obj3, (Function1) obj2, continuation, 27);
                workflowLayout$start$116.$lifecycle = obj;
                return workflowLayout$start$116;
            case 28:
                return new WorkflowLayout$start$1((DefaultHCaptchaService) this.$lifecycle, (FragmentActivity) this.$repeatOnLifecycle, (String) this.$renderings, (String) obj3, (Integer) obj2, continuation, 28);
            default:
                return new WorkflowLayout$start$1((Stripe3ds2TransactionActivity) this.$lifecycle, (ActivityResultLauncher) this.$repeatOnLifecycle, (HeroCardViewKt$$ExternalSyntheticLambda0) this.$renderings, (ActivityResultLauncher) obj3, (ViewModelLazy) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 13:
                ((WorkflowLayout$start$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((WorkflowLayout$start$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x04bd, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(androidx.compose.animation.core.AnimatableKt.Animatable(androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, 0.01f), new java.lang.Float(1.0f), (androidx.compose.animation.core.FiniteAnimationSpec) r14, null, r4, r31, 4) == r9) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0498, code lost:
    
        if (r13.prepareTransition(r0, r31) == r9) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x047f, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r1, r31) == r9) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r0 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        if (r2 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x09d6, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(400, r31) == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x09c4, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(600, r31) == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x09b0, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r31) == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0993, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(100, r31) == r0) goto L437;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6  */
    /* JADX WARN: Type inference failed for: r1v114, types: [com.squareup.cash.work.analytics.ShiftsAnalytics] */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v120, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v55, types: [com.squareup.cash.work.presenters.shift.RealClockInRepository] */
    /* JADX WARN: Type inference failed for: r4v48, types: [kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Object phoneVerificationAttempt;
        PhoneVerificationPresenter phoneVerificationPresenter;
        SpanTracking spanTracking;
        Map map;
        Object invoke;
        Object cancelPayment;
        ShiftsAnalytics shiftsAnalytics;
        String str;
        String str2;
        String str3;
        ShiftsAnalytics shiftsAnalytics2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ClockInBottomSheetScreen clockInBottomSheetScreen;
        Object obj2;
        String str9;
        ShiftsAnalytics shiftsAnalytics3;
        TakeBreakBottomSheetScreen takeBreakBottomSheetScreen;
        String str10;
        String str11;
        String str12;
        long j;
        ?? r2;
        PdfPreviewPresenter pdfPreviewPresenter;
        Object start3ds2Flow;
        Object startChallenge;
        int i = this.$r8$classId;
        int i2 = 15;
        String str13 = "Unknown error";
        Back back = Back.INSTANCE;
        int i3 = 2;
        Object obj3 = this.this$0;
        Object obj4 = this.$environment;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Lifecycle lifecycle = (Lifecycle) this.$lifecycle;
                    Lifecycle.State state = (Lifecycle.State) this.$repeatOnLifecycle;
                    WorkerWorkflow$render$1 workerWorkflow$render$1 = new WorkerWorkflow$render$1((ReadonlyStateFlow) this.$renderings, (WorkflowLayout) obj3, (ViewEnvironment) obj4, (Continuation) null, 19);
                    this.label = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, workerWorkflow$render$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Number) ((MutableState) this.$renderings).getValue()).intValue() > 0) {
                        mutableState = (MutableState) obj4;
                        PhoneVerificationPresenter phoneVerificationPresenter2 = (PhoneVerificationPresenter) obj3;
                        zzr zzrVar = phoneVerificationPresenter2.phoneVerificationService;
                        String str14 = phoneVerificationPresenter2.args.phoneVerificationId;
                        this.$lifecycle = mutableState;
                        this.$repeatOnLifecycle = phoneVerificationPresenter2;
                        this.label = 1;
                        phoneVerificationAttempt = zzrVar.getPhoneVerificationAttempt(str14, this);
                        if (phoneVerificationAttempt == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        phoneVerificationPresenter = phoneVerificationPresenter2;
                    }
                    return Unit.INSTANCE;
                }
                if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                phoneVerificationPresenter = (PhoneVerificationPresenter) this.$repeatOnLifecycle;
                mutableState = (MutableState) this.$lifecycle;
                SafeTrace.throwOnFailure(obj);
                phoneVerificationAttempt = obj;
                mutableState.setValue(PhoneVerificationPresenter.access$toViewModel(phoneVerificationPresenter, (PhoneVerificationService$PhoneVerificationResult) phoneVerificationAttempt));
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$repeatOnLifecycle;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (WorkHomePresenter) this.$renderings, (MutableState) obj3, (MutableState) obj4, 11);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i7 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i7 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) obj3).setValue(Boolean.TRUE);
                    this.label = 3;
                    break;
                } else if (i7 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) obj4).setValue(Boolean.TRUE);
                    this.label = 4;
                    break;
                } else {
                    if (i7 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ((Function0) this.$lifecycle).invoke();
                    return Unit.INSTANCE;
                }
                ((MutableState) this.$repeatOnLifecycle).setValue(Boolean.FALSE);
                ((MutableState) this.$renderings).setValue(Boolean.TRUE);
                this.label = 2;
                break;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$repeatOnLifecycle;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) this.$renderings, null, "encrypt_pan_data", (Map) obj3, null, 8);
                    try {
                        map = null;
                        this.$repeatOnLifecycle = null;
                        this.$lifecycle = startTrackingSpan$default;
                        this.label = 1;
                        invoke = ((HeroCardViewKt$Render$1$4$1.AnonymousClass2) obj4).invoke(coroutineScope2, this);
                        if (invoke == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        spanTracking = startTrackingSpan$default;
                    } catch (Throwable th) {
                        th = th;
                        spanTracking = startTrackingSpan$default;
                        SpanTracking.spanEnded$default(spanTracking, null, 3);
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    spanTracking = (SpanTracking) this.$lifecycle;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        map = null;
                    } catch (Throwable th2) {
                        th = th2;
                        SpanTracking.spanEnded$default(spanTracking, null, 3);
                        throw th;
                    }
                }
                SpanTracking.spanEnded$default(spanTracking, map, 3);
                return invoke;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$repeatOnLifecycle;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$22 = new ChannelFlowMerge$collectTo$2(coroutineScope3, (WorkHomePresenter) this.$renderings, (MutableState) obj3, (TapToPayPaymentData) obj4, 12);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow2.collect(channelFlowMerge$collectTo$22, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$repeatOnLifecycle;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$23 = new ChannelFlowMerge$collectTo$2(coroutineScope4, (TaxWebAppPresenter) this.$renderings, (MutableState) obj3, (MutableState) obj4, 13);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow3.collect(channelFlowMerge$collectTo$23, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$repeatOnLifecycle;
                    LinkedAccountsPresenter$models$2$1$2 linkedAccountsPresenter$models$2$1$2 = new LinkedAccountsPresenter$models$2$1$2(coroutineScope5, (LinkedAccountsPresenter) this.$renderings, (State) obj3, (MutableState) obj4);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow4.collect(linkedAccountsPresenter$models$2$1$2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow debounce = FlowKt.debounce(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.$lifecycle, (MutableState) this.$repeatOnLifecycle, 9)), 150L);
                    LinkedAccountsPresenter$models$2$1$2 linkedAccountsPresenter$models$2$1$22 = new LinkedAccountsPresenter$models$2$1$2((LinkedAccountsPresenter) this.$renderings, (State) obj3, (MutableState) obj4);
                    this.label = 1;
                    if (debounce.collect(linkedAccountsPresenter$models$2$1$22, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$repeatOnLifecycle;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(coroutineScope6, (RecurringReloadConfigurationPresenter) this.$renderings, (String) obj3, (MutableState) obj4, 14);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow5.collect(anonymousClass1, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.$lifecycle;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.$lifecycle = null;
                this.label = 1;
                Object format2 = activityDataBridge.format((String) this.$repeatOnLifecycle, (String) this.$renderings, (String) obj3, (String) obj4, this);
                return format2 == coroutineSingletons11 ? coroutineSingletons11 : format2;
            case 11:
                Intent intent = (Intent) obj3;
                String str15 = (String) this.$renderings;
                String str16 = (String) this.$lifecycle;
                NotificationActionService notificationActionService = (NotificationActionService) this.$repeatOnLifecycle;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                int i16 = 5;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CancelPaymentRequest cancelPaymentRequest = new CancelPaymentRequest((RequestContext) null, str16, i16);
                    AppService appService = notificationActionService.appService;
                    if (appService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appService");
                        throw null;
                    }
                    ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    this.label = 1;
                    cancelPayment = appService.cancelPayment(clientScenario, generateToken, null, cancelPaymentRequest, this);
                    if (cancelPayment == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cancelPayment = obj;
                }
                ApiResult apiResult = (ApiResult) cancelPayment;
                if (apiResult instanceof ApiResult.Success) {
                    CancelPaymentResponse.Status status = ((CancelPaymentResponse) ((ApiResult.Success) apiResult).response).status;
                    if (status == null) {
                        status = ProtoDefaults.CANCEL_PAYMENT_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        notificationActionService.getAnalytics().track(new PushNotificationDeclineComplete(str16), null);
                        AndroidNotificationManager androidNotificationManager = notificationActionService.notificationManager;
                        if (androidNotificationManager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
                            throw null;
                        }
                        androidNotificationManager.notificationManager.cancel(str16, 1);
                    } else {
                        if (ordinal != 2) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        Analytics analytics = notificationActionService.getAnalytics();
                        PushNotificationDeclineReceiveError.LogicError logicError = PushNotificationDeclineReceiveError.LogicError.CONCURRENT_MODIFICATION;
                        analytics.track(new PushNotificationDeclineReceiveError(str16, null, null, 25), null);
                        notificationActionService.showError(str15, R.string.notif_request_decline_failed, R.string.notif_failed_general, intent, null, str16);
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    notificationActionService.getAnalytics().track(new PushNotificationDeclineReceiveError(str16, String.valueOf(failure instanceof ApiResult.Failure.NetworkFailure), (failure instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) failure : null) != null ? String.valueOf(((ApiResult.Failure.HttpFailure) failure).code) : null, 5), null);
                    notificationActionService.showError(str15, R.string.notif_request_decline_failed, R.string.notif_failed_connection, intent, (Intent) obj4, str16);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$repeatOnLifecycle;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$24 = new ChannelFlowMerge$collectTo$2(coroutineScope7, (WalletHomePresenter) this.$renderings, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj4, 15);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow6.collect(channelFlowMerge$collectTo$24, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState2 = (MutableState) obj3;
                String str17 = (String) this.$renderings;
                CardRegistry cardRegistry = (CardRegistry) this.$repeatOnLifecycle;
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                try {
                } catch (Throwable th3) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                    CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) mutableState2.getValue();
                    int i19 = cardRegistry$CardTransition$TransitionType == null ? -1 : CardTransitionKt$cardTransition$4$1$1$WhenMappings.$EnumSwitchMapping$0[cardRegistry$CardTransition$TransitionType.ordinal()];
                    if (i19 != -1) {
                        if (i19 == 1) {
                            cardRegistry.sourceOffsets.remove(str17);
                        } else if (i19 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        } else {
                            cardRegistry.targetOffsets.remove(str17);
                        }
                    }
                    throw th3;
                }
                if (i18 != 0) {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope8, null, null, new TakeUntil$collectSafely$2(mutableState2, (MutableState) obj4, cardRegistry, (String) this.$renderings, null, 6), 3);
                this.$lifecycle = null;
                this.label = 1;
                JobKt.awaitCancellation(this);
                return coroutineSingletons14;
            case 14:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.$repeatOnLifecycle;
                    OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(m, coroutineScope9, (MutableState) this.$renderings, (MutableState) obj3, (Animatable) obj4, 29);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, overlayKt$$ExternalSyntheticLambda3, this, 7) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.$lifecycle, (MutableState) this.$repeatOnLifecycle, i2)), 24);
                    TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2((CardNuxState) this.$renderings, (ActivityManager) obj3, (CardRegistry) obj4, (Continuation) null, 13);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, takeUntil$collectSafely$2, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputScope pointerInputScope2 = (PointerInputScope) this.$repeatOnLifecycle;
                    MutableState mutableState3 = (MutableState) this.$renderings;
                    MutableState mutableState4 = (MutableState) obj3;
                    OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(coroutineScope10, pointerInputScope2, mutableState3, mutableState4);
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj4;
                    CardSchemePresenter$$ExternalSyntheticLambda20 cardSchemePresenter$$ExternalSyntheticLambda20 = new CardSchemePresenter$$ExternalSyntheticLambda20(coroutineScope10, mutableSharedFlow, i3);
                    CashMapViewKt$$ExternalSyntheticLambda15 cashMapViewKt$$ExternalSyntheticLambda15 = new CashMapViewKt$$ExternalSyntheticLambda15(coroutineScope10, pointerInputScope2, mutableSharedFlow, mutableState3, mutableState4, 27);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope2, openSourceKt$$ExternalSyntheticLambda9, cardSchemePresenter$$ExternalSyntheticLambda20, cashMapViewKt$$ExternalSyntheticLambda15, this, 4) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda10 = (ShiftListViewKt$$ExternalSyntheticLambda10) this.$renderings;
                CardScene cardScene = (CardScene) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$repeatOnLifecycle;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) this.$lifecycle;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (ref$ObjectRef.element != null) {
                        if (((Boolean) shiftListViewKt$$ExternalSyntheticLambda10.invoke()).booleanValue()) {
                            HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new PageTagSlotKt$$ExternalSyntheticLambda0(shiftListViewKt$$ExternalSyntheticLambda10, i2)), 13);
                            this.$lifecycle = heroCardDetails;
                            this.label = 1;
                            break;
                        }
                    } else {
                        ref$ObjectRef.element = heroCardDetails;
                        return Unit.INSTANCE;
                    }
                } else if (i23 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i23 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    CardTransitionKt$$ExternalSyntheticLambda18 cardTransitionKt$$ExternalSyntheticLambda18 = new CardTransitionKt$$ExternalSyntheticLambda18(cardScene, 1);
                    this.$lifecycle = heroCardDetails;
                    this.label = 3;
                    break;
                } else {
                    if (i23 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cardScene.completeTransition();
                    ref$ObjectRef.element = heroCardDetails;
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.areEqual(ref$ObjectRef.element, heroCardDetails)) {
                    CardModelView.ViewModel cardViewModelInternal = RevolvingInteractiveCardsKt.toCardViewModelInternal(heroCardDetails);
                    this.$lifecycle = heroCardDetails;
                    this.label = 2;
                    int i24 = CardScene.$r8$clinit;
                    break;
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$repeatOnLifecycle;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass12 = new BufferCountKt$bufferSkip$1.AnonymousClass1(coroutineScope11, (TaxAuthorizationPresenter) this.$renderings, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj4, 20);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass12, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = (ShiftNotePresenter$models$1$1) this.$renderings;
                ClockInBottomSheetViewEvent.ClockInClicked clockInClicked = (ClockInBottomSheetViewEvent.ClockInClicked) this.$repeatOnLifecycle;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$lifecycle;
                ShiftsAnalytics shiftsAnalytics4 = (ShiftsAnalytics) poolsListPresenter.localeAssetProvider;
                ClockInBottomSheetScreen clockInBottomSheetScreen2 = (ClockInBottomSheetScreen) poolsListPresenter.sessionManager;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                try {
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInRepository realClockInRepository = (RealClockInRepository) poolsListPresenter.repository;
                        try {
                            String str18 = clockInBottomSheetScreen2.employeeToken;
                            str = clockInClicked.selectedJobIdentifier.token;
                            str2 = clockInClicked.selectedLocationIdentifier.token;
                            boolean z = clockInClicked.shouldSendShiftToken;
                            if (z) {
                                str3 = str18;
                                str4 = clockInBottomSheetScreen2.shiftToken;
                                shiftsAnalytics2 = shiftsAnalytics4;
                            } else {
                                str3 = str18;
                                shiftsAnalytics2 = shiftsAnalytics4;
                                str4 = null;
                            }
                            str5 = z ? clockInBottomSheetScreen2.shiftPublishedVersionToken : null;
                            str6 = clockInBottomSheetScreen2.merchantToken;
                            ShiftsAnalytics shiftsAnalytics5 = shiftsAnalytics2;
                            try {
                                this.label = 1;
                                str7 = "";
                                str8 = str3;
                                clockInBottomSheetScreen = clockInBottomSheetScreen2;
                                obj2 = obj3;
                                shiftsAnalytics = shiftsAnalytics5;
                            } catch (Exception e) {
                                e = e;
                                shiftsAnalytics = shiftsAnalytics5;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            shiftsAnalytics = shiftsAnalytics4;
                        }
                        try {
                            if (realClockInRepository.startTimecard(str8, str, str2, str4, str5, str6, this) == coroutineSingletons20) {
                                return coroutineSingletons20;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            Timber.Forest.w("Failed to clock in", new Object[0], e);
                            String message = e.getMessage();
                            String str19 = message == null ? "Unknown error" : message;
                            String str20 = clockInClicked.selectedJobIdentifier.token;
                            String str21 = clockInClicked.selectedLocationIdentifier.token;
                            str20.getClass();
                            str21.getClass();
                            shiftsAnalytics.analytics.track(new ShiftsClockInFail(shiftsAnalytics.getPersonToken(), shiftsAnalytics.getMerchantToken(), str20, str21, str19), null);
                            shiftNotePresenter$models$1$1.invoke(Boolean.FALSE);
                            ((ShiftNotePresenter$models$1$1) obj4).invoke(new ToastState(((AndroidStringManager) poolsListPresenter.stringManager).get(R.string.work_shift_error_generic), new Long(System.currentTimeMillis())));
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        shiftsAnalytics = shiftsAnalytics4;
                        str7 = "";
                        obj2 = obj3;
                        clockInBottomSheetScreen = clockInBottomSheetScreen2;
                    }
                    JobIdentifier jobIdentifier = clockInClicked.selectedJobIdentifier;
                    LocationIdentifier locationIdentifier = clockInClicked.selectedLocationIdentifier;
                    String str22 = jobIdentifier.token;
                    String str23 = locationIdentifier.token;
                    boolean z2 = clockInClicked.shouldSendShiftToken;
                    String str24 = (!z2 || (str9 = clockInBottomSheetScreen.shiftToken) == null) ? str7 : str9;
                    str22.getClass();
                    str23.getClass();
                    shiftsAnalytics.analytics.track(new ShiftsClockInComplete(shiftsAnalytics.getPersonToken(), shiftsAnalytics.getMerchantToken(), str22, str23, str24, Boolean.valueOf(z2)), null);
                    PoolsListPresenter.access$saveLastClockedInInfo(poolsListPresenter, clockInClicked.selectedJobIdentifier, locationIdentifier);
                    shiftNotePresenter$models$1$1.invoke(Boolean.FALSE);
                    AskedQuestion askedQuestion = (AskedQuestion) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                    if (askedQuestion != null) {
                        screenNavigator.giveAnswer(askedQuestion, ClockInResult$Success.INSTANCE);
                    } else {
                        screenNavigator.goTo(back);
                    }
                } catch (Exception e4) {
                    e = e4;
                    shiftsAnalytics = shiftsAnalytics4;
                }
                return Unit.INSTANCE;
            case 20:
                PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) this.$lifecycle;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                try {
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInRepository realClockInRepository2 = (RealClockInRepository) pdfPreviewPresenter2.launcher;
                        String str25 = (String) this.$repeatOnLifecycle;
                        String str26 = (String) this.$renderings;
                        if (StringsKt.isBlank(str26)) {
                            str26 = null;
                        }
                        this.label = 1;
                        if (realClockInRepository2.updateNote(str25, str26, (String) obj3, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ShiftsAnalytics shiftsAnalytics6 = (ShiftsAnalytics) pdfPreviewPresenter2.fileProvider;
                    shiftsAnalytics6.analytics.track(new ShiftsNoteSaveComplete(shiftsAnalytics6.getPersonToken(), shiftsAnalytics6.getMerchantToken()), null);
                    AskedQuestion askedQuestion2 = ((ShiftNoteScreen) pdfPreviewPresenter2.args).askedQuestion;
                    BetterNavigator.ScreenNavigator screenNavigator2 = pdfPreviewPresenter2.navigator;
                    if (askedQuestion2 != null) {
                        screenNavigator2.giveAnswer(askedQuestion2, ShiftNoteResult$Saved.INSTANCE);
                    } else {
                        screenNavigator2.goTo(back);
                    }
                } catch (Exception e5) {
                    Timber.Forest.w("Failed to update note", new Object[0], e5);
                    ((ShiftNotePresenter$models$1$1) obj4).invoke(new ToastState(((AndroidStringManager) pdfPreviewPresenter2.stringManager).get(R.string.work_shift_error_generic), new Long(System.currentTimeMillis())));
                }
                return Unit.INSTANCE;
            case 21:
                TakeBreakBottomSheetViewEvent.BreakSelected breakSelected = (TakeBreakBottomSheetViewEvent.BreakSelected) this.$renderings;
                PdfPreviewPresenter pdfPreviewPresenter3 = (PdfPreviewPresenter) this.$lifecycle;
                ?? r1 = (ShiftsAnalytics) pdfPreviewPresenter3.fileSaver;
                TakeBreakBottomSheetScreen takeBreakBottomSheetScreen2 = (TakeBreakBottomSheetScreen) pdfPreviewPresenter3.args;
                ?? r4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                try {
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ?? r3 = (RealClockInRepository) pdfPreviewPresenter3.launcher;
                        try {
                            str11 = takeBreakBottomSheetScreen2.timecardToken;
                            String str27 = (String) this.$repeatOnLifecycle;
                            str12 = breakSelected.token;
                            j = breakSelected.versionNumber;
                            this.label = 1;
                            takeBreakBottomSheetScreen = takeBreakBottomSheetScreen2;
                            r2 = str27;
                            pdfPreviewPresenter = pdfPreviewPresenter3;
                            shiftsAnalytics3 = r1;
                            str10 = "Unknown error";
                            str13 = r4;
                        } catch (Exception e6) {
                            e = e6;
                            takeBreakBottomSheetScreen = takeBreakBottomSheetScreen2;
                            shiftsAnalytics3 = r1;
                            str10 = str13;
                            Timber.Forest.w("Failed to start break", new Object[0], e);
                            String message2 = e.getMessage();
                            String str28 = message2 != null ? str10 : message2;
                            String str29 = takeBreakBottomSheetScreen.timecardToken;
                            String str30 = breakSelected.token;
                            str29.getClass();
                            str30.getClass();
                            shiftsAnalytics3.analytics.track(new ShiftsTakeBreakFail(shiftsAnalytics3.getPersonToken(), shiftsAnalytics3.getMerchantToken(), str29, str30, str28), null);
                            return Unit.INSTANCE;
                        }
                        try {
                            Object startBreak = r3.startBreak(str11, r2, str12, j, this);
                            takeBreakBottomSheetScreen2 = r2;
                            if (startBreak == str13) {
                                return str13;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            Timber.Forest.w("Failed to start break", new Object[0], e);
                            String message22 = e.getMessage();
                            if (message22 != null) {
                            }
                            String str292 = takeBreakBottomSheetScreen.timecardToken;
                            String str302 = breakSelected.token;
                            str292.getClass();
                            str302.getClass();
                            shiftsAnalytics3.analytics.track(new ShiftsTakeBreakFail(shiftsAnalytics3.getPersonToken(), shiftsAnalytics3.getMerchantToken(), str292, str302, str28), null);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        pdfPreviewPresenter = pdfPreviewPresenter3;
                        shiftsAnalytics3 = r1;
                        takeBreakBottomSheetScreen = takeBreakBottomSheetScreen2;
                        takeBreakBottomSheetScreen2 = takeBreakBottomSheetScreen2;
                    }
                    String str31 = takeBreakBottomSheetScreen.timecardToken;
                    r1 = breakSelected.token;
                    TakeBreakBottomSheetScreen.BreakInfo breakInfo = (TakeBreakBottomSheetScreen.BreakInfo) obj3;
                    String str32 = breakInfo != null ? breakInfo.name : null;
                    String str33 = str32 == null ? "" : str32;
                    int i29 = breakInfo != null ? breakInfo.expectedDurationSeconds : 0;
                    str31.getClass();
                    r1.getClass();
                    shiftsAnalytics3.analytics.track(new ShiftsTakeBreakComplete(Integer.valueOf(i29), shiftsAnalytics3.getPersonToken(), shiftsAnalytics3.getMerchantToken(), str31, r1, str33), null);
                    AskedQuestion askedQuestion3 = (AskedQuestion) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator3 = pdfPreviewPresenter.navigator;
                    if (askedQuestion3 != null) {
                        screenNavigator3.giveAnswer(askedQuestion3, TakeBreakResult$Success.INSTANCE);
                    } else {
                        screenNavigator3.goTo(back);
                    }
                } catch (Exception e8) {
                    e = e8;
                    shiftsAnalytics3 = r1;
                    takeBreakBottomSheetScreen = takeBreakBottomSheetScreen2;
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.$lifecycle;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$repeatOnLifecycle;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass13 = new BufferCountKt$bufferSkip$1.AnonymousClass1(coroutineScope12, (WorkHomePresenter) this.$renderings, (MutableState) obj3, (MutableState) obj4, 21);
                    this.$lifecycle = null;
                    this.label = 1;
                    if (flow8.collect(anonymousClass13, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                return invokeSuspend$com$squareup$util$android$RealIntentFactory$authenticatedUrls$decodedUrlWithToken$1$2(obj);
            case 24:
                return invokeSuspend$com$stripe$android$financialconnections$FinancialConnectionsSheetViewModel$handleOnNewIntent$1(obj);
            case 25:
                return invokeSuspend$com$stripe$android$financialconnections$analytics$FinancialConnectionsAnalyticsTrackerImpl$track$1(obj);
            case 26:
                return invokeSuspend$com$stripe$android$financialconnections$domain$SaveAccountToLink$new$2(obj);
            case 27:
                return invokeSuspend$com$stripe$android$financialconnections$presentation$FinancialConnectionsViewModel$execute$1(obj);
            case 28:
                return invokeSuspend$com$stripe$android$hcaptcha$DefaultHCaptchaService$performPassiveHCaptcha$result$1$1(obj);
            default:
                ViewModelLazy viewModelLazy = (ViewModelLazy) obj4;
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.$lifecycle;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!stripe3ds2TransactionActivity.isFinishing()) {
                        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) viewModelLazy.getValue();
                        this.label = 1;
                        start3ds2Flow = stripe3ds2TransactionViewModel.start3ds2Flow(this);
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i31 != 1) {
                    if (i31 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    startChallenge = obj;
                    InitChallengeResult initChallengeResult = (InitChallengeResult) startChallenge;
                    if (initChallengeResult instanceof InitChallengeResult.Start) {
                        ((ActivityResultLauncher) this.$repeatOnLifecycle).launch(((InitChallengeResult.Start) initChallengeResult).challengeViewArgs);
                    } else {
                        if (!(initChallengeResult instanceof InitChallengeResult.End)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((HeroCardViewKt$$ExternalSyntheticLambda0) this.$renderings).invoke(((InitChallengeResult.End) initChallengeResult).challengeResult);
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                start3ds2Flow = obj;
                NextStep nextStep = (NextStep) start3ds2Flow;
                if (!(nextStep instanceof NextStep.StartChallenge)) {
                    if (nextStep instanceof NextStep.StartFallback) {
                        ((ActivityResultLauncher) obj3).launch(((NextStep.StartFallback) nextStep).args);
                    } else {
                        if (!(nextStep instanceof NextStep.Complete)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated = ((NextStep.Complete) nextStep).result;
                        int i32 = Stripe3ds2TransactionActivity.$r8$clinit;
                        stripe3ds2TransactionActivity.finishWithResult(paymentFlowResult$Unvalidated);
                    }
                    return Unit.INSTANCE;
                }
                int i33 = Stripe3ds2TransactionActivity.$r8$clinit;
                Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel2 = (Stripe3ds2TransactionViewModel) viewModelLazy.getValue();
                InitChallengeArgs initChallengeArgs = ((NextStep.StartChallenge) nextStep).args;
                this.label = 2;
                startChallenge = stripe3ds2TransactionViewModel2.initChallengeRepository.startChallenge(initChallengeArgs, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowLayout$start$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$repeatOnLifecycle = obj;
        this.$renderings = obj2;
        this.this$0 = obj3;
        this.$environment = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowLayout$start$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$renderings = obj;
        this.this$0 = obj2;
        this.$environment = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowLayout$start$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$environment = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowLayout$start$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$repeatOnLifecycle = flow;
        this.$renderings = moleculePresenter;
        this.this$0 = obj;
        this.$environment = obj2;
    }
}
