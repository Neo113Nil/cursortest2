package com.squareup.util.coroutines;

import android.app.ActivityManager;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.animation.core.InfiniteTransition$run$1$1$3;
import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.AskedQuestion;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser$parse$1;
import com.datadog.trace.core.util.GlobPattern;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.tasks.Task;
import com.squareup.cash.R;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageTapCardsTabOverdraftCoverageItem;
import com.squareup.cash.cdf.shifts.ShiftsNoteDeleteComplete;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$15$1;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.db.CardCustomization;
import com.squareup.cash.wallet.db.CardCustomizationQueries$select$2;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$6$1;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.OverdraftCoverageListItemViewEvent$OverdraftClicked;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardScreenId;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$3$1$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.AssignedJob;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import com.squareup.cash.work.data.api.DashboardScheduleState;
import com.squareup.cash.work.data.api.LoaderState;
import com.squareup.cash.work.data.real.RealAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealPayDataLoader$loadForIdentity$$inlined$filter$1$2$1;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.ShiftLoaderContext;
import com.squareup.cash.work.data.real.ShiftLoaderIdentity;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$DataState;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$FetchResult;
import com.squareup.cash.work.presenters.pay.PayHomePresenter;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.screens.ClockInOverlayScreen;
import com.squareup.cash.work.screens.DeclareCashTipBottomSheetScreen;
import com.squareup.cash.work.screens.DeclareCashTipResult$Success;
import com.squareup.cash.work.screens.ShiftDetailScreen;
import com.squareup.cash.work.screens.ShiftNotStartedDialogScreen;
import com.squareup.cash.work.screens.ShiftNoteResult$Deleted;
import com.squareup.cash.work.screens.ShiftNoteScreen;
import com.squareup.cash.work.screens.WorkPayHistoryListScreen;
import com.squareup.cash.work.screens.WorkTaxFormDownloaderScreen;
import com.squareup.cash.work.screens.WorkTaxFormsListScreen;
import com.squareup.cash.work.session.RealSelectedMerchantSetter;
import com.squareup.cash.work.tinygraph.BaseEntityOperation;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt$events$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.work.tinygraph.EntityOperationType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.MembershipWage;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository$getByIds$$inlined$getEntities$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository$getMemberships$$inlined$getEntities$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository$getAll$$inlined$getEntities$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1;
import com.squareup.cash.work.viewmodels.MerchantPickerViewEvent;
import com.squareup.cash.work.viewmodels.PayHomeViewEvent;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewEvent;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$ClockInClicked;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$ClockInUnscheduledClicked;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$DetailsClicked;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$DisabledClockInTapped;
import com.squareup.cash.work.viewmodels.TaxFormsListViewEvent;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent;
import com.squareup.cash.work.webview.screens.WorkWebKey;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardModule$HeroNullStateModule$Nux$UhchNux;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.compose.LifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.TakeUntil;
import com.squareup.workflow1.RenderingAndSnapshot;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TimerWorker$run$1;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowOutput;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$2;
import com.squareup.workflow1.internal.WorkflowNode;
import com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.WorkflowLayout;
import com.squareup.workflow1.ui.WorkflowViewStub;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2$1;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.selects.SelectBuilderImpl;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.overdraft.OverdraftStatus;
import timber.log.Timber;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class TakeUntil$collectSafely$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $collector;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public Object L$2;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeUntil$collectSafely$2(MutableState mutableState, FinancialConnectionsSheetActivity financialConnectionsSheetActivity, StripeBottomSheetState stripeBottomSheetState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 27;
        this.L$0 = mutableState;
        this.this$0 = financialConnectionsSheetActivity;
        this.$collector = stripeBottomSheetState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (r7.invoke(r14, r13) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bb -> B:6:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ce -> B:6:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$workflow1$RenderWorkflowKt$renderWorkflowIn$1(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object result;
        UnleashContext unleashContext = (UnleashContext) this.L$2;
        WorkflowNode workflowNode = (WorkflowNode) unleashContext.properties;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (JobKt.isActive(coroutineScope)) {
            }
        } else if (i == 1) {
            coroutineScope2 = (CoroutineScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
            WorkflowOutput workflowOutput = (WorkflowOutput) obj;
            if (JobKt.isActive(coroutineScope2)) {
            }
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            if (JobKt.isActive(coroutineScope)) {
                this.L$0 = coroutineScope;
                this.label = 1;
                ReceiveChannel receiveChannel = (ReceiveChannel) unleashContext.remoteAddress;
                SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(this);
                CancellableContinuationImpl cancellableContinuationImpl = selectBuilderImpl.cont;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(new Result.Failure(th));
                }
                if (!receiveChannel.isClosedForReceive()) {
                    selectBuilderImpl.invoke(receiveChannel.getOnReceiveCatching(), new WorkflowRunner$nextOutput$2$1(unleashContext, continuation, 0));
                }
                workflowNode.tick(selectBuilderImpl);
                if (cancellableContinuationImpl.isCompleted()) {
                    result = cancellableContinuationImpl.getResult();
                } else {
                    JobKt.launch$default(JobKt.CoroutineScope(selectBuilderImpl.context), null, CoroutineStart.UNDISPATCHED, new HazeSourceNode$launchPreDraw$1(selectBuilderImpl, continuation, 26), 1);
                    result = cancellableContinuationImpl.getResult();
                }
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (result != coroutineSingletons) {
                    Object obj2 = result;
                    coroutineScope2 = coroutineScope;
                    obj = obj2;
                    WorkflowOutput workflowOutput2 = (WorkflowOutput) obj;
                    if (JobKt.isActive(coroutineScope2)) {
                        return Unit.INSTANCE;
                    }
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) this.this$0;
                    StatefulWorkflow statefulWorkflow = (StatefulWorkflow) unleashContext.userId;
                    stateFlowImpl.updateState(null, new RenderingAndSnapshot(workflowNode.render(statefulWorkflow, unleashContext.sessionId), workflowNode.snapshot(statefulWorkflow)));
                    if (workflowOutput2 != null) {
                        InquiryViewModel.AnonymousClass1 anonymousClass1 = (InquiryViewModel.AnonymousClass1) this.$collector;
                        Object obj3 = workflowOutput2.value;
                        this.L$0 = coroutineScope2;
                        this.label = 2;
                    }
                    coroutineScope = coroutineScope2;
                    if (JobKt.isActive(coroutineScope)) {
                        return Unit.INSTANCE;
                    }
                }
                return coroutineSingletons;
            }
        }
    }

    private final Object invokeSuspend$com$stripe$android$financialconnections$domain$PostAuthSessionEvent$invoke$1(Object obj) {
        Object failure;
        TextSetter textSetter = (TextSetter) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                String str = (String) this.this$0;
                List list = (List) this.$collector;
                Result.Companion companion = Result.Companion;
                FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) textSetter.textView;
                Date date = new Date();
                String str2 = ((FinancialConnectionsSheetConfiguration) textSetter.scannerText).financialConnectionsSessionClientSecret;
                this.L$0 = null;
                this.label = 1;
                obj = financialConnectionsManifestRepositoryImpl.postAuthorizationSessionEvent(str2, date, str, list, this);
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
            failure = (FinancialConnectionsAuthorizationSession) obj;
            Result.Companion companion2 = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            ((Logger$Companion$NOOP_LOGGER$1) textSetter.textSwitcher).error("error posting auth session event", m4120exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$collector;
        switch (i) {
            case 0:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2((TakeUntil) this.this$0, (SafeCollector) obj2, continuation, 0);
                takeUntil$collectSafely$2.L$0 = obj;
                return takeUntil$collectSafely$2;
            case 1:
                return new TakeUntil$collectSafely$2((Flow) this.L$2, (CardSchemePresenter) this.L$0, (ParcelableSnapshotMutableIntState) this.this$0, (MutableState) obj2, continuation, 1);
            case 2:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$22 = new TakeUntil$collectSafely$2((Flow) this.L$2, continuation, (TaxReturnsPresenter) this.this$0, (State) obj2, 2);
                takeUntil$collectSafely$22.L$0 = obj;
                return takeUntil$collectSafely$22;
            case 3:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$23 = new TakeUntil$collectSafely$2((RealCardCustomizationRepository) this.this$0, (String) obj2, continuation, 3);
                takeUntil$collectSafely$23.L$0 = obj;
                return takeUntil$collectSafely$23;
            case 4:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$24 = new TakeUntil$collectSafely$2((Quat) this.this$0, (CardAppletTileKt$$ExternalSyntheticLambda1) obj2, continuation, 4);
                takeUntil$collectSafely$24.L$0 = obj;
                return takeUntil$collectSafely$24;
            case 5:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$25 = new TakeUntil$collectSafely$2((MutableState) this.L$2, (CardRegistry) this.this$0, (String) obj2, continuation, 5);
                takeUntil$collectSafely$25.L$0 = obj;
                return takeUntil$collectSafely$25;
            case 6:
                return new TakeUntil$collectSafely$2((MutableState) this.L$2, (MutableState) this.L$0, (CardRegistry) this.this$0, (String) obj2, continuation, 6);
            case 7:
                return new TakeUntil$collectSafely$2((MutableState) this.L$2, (MutableState) this.L$0, (SnapshotStateMap) this.this$0, (CardScreenId) obj2, continuation, 7);
            case 8:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$26 = new TakeUntil$collectSafely$2((CardScene) this.this$0, (State) obj2, continuation, 8);
                takeUntil$collectSafely$26.L$0 = obj;
                return takeUntil$collectSafely$26;
            case 9:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$27 = new TakeUntil$collectSafely$2((MutableState) this.L$2, (MutableState) this.this$0, (MutableState) obj2, continuation, 9);
                takeUntil$collectSafely$27.L$0 = obj;
                return takeUntil$collectSafely$27;
            case 10:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$28 = new TakeUntil$collectSafely$2((SnapshotStateList) this.L$2, (State) this.this$0, (MutableState) obj2, continuation, 10);
                takeUntil$collectSafely$28.L$0 = obj;
                return takeUntil$collectSafely$28;
            case 11:
                return new TakeUntil$collectSafely$2((MutableState) this.L$2, (SnapshotStateList) this.L$0, (State) this.this$0, (MutableState) obj2, continuation, 11);
            case 12:
                return new TakeUntil$collectSafely$2((Function0) this.L$2, (Function0) this.L$0, (Function0) this.this$0, (CardNuxState) obj2, continuation, 12);
            case 13:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$29 = new TakeUntil$collectSafely$2((CardNuxState) this.L$2, (ActivityManager) this.this$0, (CardRegistry) obj2, continuation, 13);
                takeUntil$collectSafely$29.L$0 = obj;
                return takeUntil$collectSafely$29;
            case 14:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$210 = new TakeUntil$collectSafely$2((RealDashboardScheduleProvider) this.L$2, (String) this.this$0, (String) obj2, continuation, 14);
                takeUntil$collectSafely$210.L$0 = obj;
                return takeUntil$collectSafely$210;
            case 15:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$211 = new TakeUntil$collectSafely$2((RealShiftDataLoader) obj2, continuation);
                takeUntil$collectSafely$211.L$0 = obj;
                return takeUntil$collectSafely$211;
            case 16:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$212 = new TakeUntil$collectSafely$2((Flow) this.L$2, continuation, (WorkHomePresenter) this.this$0, (MutableState) obj2, 16);
                takeUntil$collectSafely$212.L$0 = obj;
                return takeUntil$collectSafely$212;
            case 17:
                return new TakeUntil$collectSafely$2((PayHistoryListPresenter$DataState.Loaded) this.L$2, (TaxAuthorizationPresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 17);
            case 18:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$213 = new TakeUntil$collectSafely$2((Flow) this.L$2, continuation, (PayHomePresenter) this.this$0, (State) obj2, 18);
                takeUntil$collectSafely$213.L$0 = obj;
                return takeUntil$collectSafely$213;
            case 19:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$214 = new TakeUntil$collectSafely$2((Flow) this.L$2, continuation, (WorkHomePresenter) this.this$0, (ParcelableSnapshotMutableIntState) obj2, 19);
                takeUntil$collectSafely$214.L$0 = obj;
                return takeUntil$collectSafely$214;
            case 20:
                return new TakeUntil$collectSafely$2((ShareSheetPresenter) this.L$2, (Money) this.L$0, (AskedQuestion) this.this$0, (KClassImpl$Data$$Lambda$23) obj2, continuation, 20);
            case 21:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$215 = new TakeUntil$collectSafely$2((Flow) this.L$2, continuation, (HCaptcha) this.this$0, (State) obj2, 21);
                takeUntil$collectSafely$215.L$0 = obj;
                return takeUntil$collectSafely$215;
            case 22:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$216 = new TakeUntil$collectSafely$2((Flow) this.L$2, continuation, (CardLockPresenter) this.this$0, (State) obj2, 22);
                takeUntil$collectSafely$216.L$0 = obj;
                return takeUntil$collectSafely$216;
            case 23:
                return new TakeUntil$collectSafely$2((PdfPreviewPresenter) this.L$2, (String) this.L$0, (String) this.this$0, (ShiftNotePresenter$models$1$1) obj2, continuation, 23);
            case 24:
                return new TakeUntil$collectSafely$2((ImmutableList) this.L$2, (LazyListState) this.L$0, (LocalDate) this.this$0, (MutableState) obj2, continuation, 24);
            case 25:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$217 = new TakeUntil$collectSafely$2((StateFlow) this.L$2, (StateFlow) this.this$0, (StateFlowKt$combineState$2) obj2, continuation, 25);
                takeUntil$collectSafely$217.L$0 = obj;
                return takeUntil$collectSafely$217;
            case 26:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$218 = new TakeUntil$collectSafely$2((UnleashContext) this.L$2, (StateFlowImpl) this.this$0, (InquiryViewModel.AnonymousClass1) obj2, continuation, 26);
                takeUntil$collectSafely$218.L$0 = obj;
                return takeUntil$collectSafely$218;
            case 27:
                return new TakeUntil$collectSafely$2((MutableState) this.L$0, (FinancialConnectionsSheetActivity) this.this$0, (StripeBottomSheetState) obj2, continuation);
            case 28:
                TakeUntil$collectSafely$2 takeUntil$collectSafely$219 = new TakeUntil$collectSafely$2((TextSetter) this.L$2, (String) this.this$0, (List) obj2, continuation, 28);
                takeUntil$collectSafely$219.L$0 = obj;
                return takeUntil$collectSafely$219;
            default:
                return new TakeUntil$collectSafely$2((ModalBottomSheetState) this.L$2, (NavBackStackEntry) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((TakeUntil$collectSafely$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x04a3, code lost:
    
        if (r4.emit(r2, r25) != r5) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x047c, code lost:
    
        if (r4.emit(com.squareup.cash.work.data.api.DashboardScheduleState.Loading.INSTANCE, r25) == r5) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04c0, code lost:
    
        if (r4.emit(r2, r25) == r5) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0666, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r2, r25) == r5) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x083e, code lost:
    
        if (r0.emit(r2, r25) == r4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x082e, code lost:
    
        if (r2 == r4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x07d0, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r8, r25) == r4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x07bb, code lost:
    
        if (r0.emit((com.squareup.cash.graphics.backend.math.Quat) r8, r25) == r4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0792, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(200, r25) == r4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x091f, code lost:
    
        if (r6.emit(r0, r25) != r7) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
    
        if (r5.scrollToItem(r6, 0, r25) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        if (r5.animateScrollToItem(r6, 0, r25) == r0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08f4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StandaloneCoroutine standaloneCoroutine;
        CardCustomization cardCustomization;
        SlerpAnimator slerpAnimator;
        StandaloneCoroutine standaloneCoroutine2;
        Object access$fetchUpcomingSchedules;
        Object firstOrDefault;
        ShiftLoaderIdentity shiftLoaderIdentity;
        List list;
        Object access$getWeekStartDaySetting;
        ShiftLoaderIdentity shiftLoaderIdentity2;
        String str;
        Object access$fetchStubs;
        FinancialConnectionsSheetActivity financialConnectionsSheetActivity;
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 9;
        int i4 = 10;
        int i5 = 11;
        int i6 = 12;
        Back back = Back.INSTANCE;
        int i7 = 24;
        int i8 = 4;
        int i9 = 3;
        int i10 = 2;
        int i11 = 0;
        Object obj2 = this.$collector;
        int i12 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                TakeUntil takeUntil = (TakeUntil) this.this$0;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 != 0) {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    standaloneCoroutine = (StandaloneCoroutine) this.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (TakeUntil.StopException unused) {
                    } catch (Throwable th) {
                        th = th;
                        standaloneCoroutine.cancel(TakeUntil.STOP);
                        throw th;
                    }
                    standaloneCoroutine.cancel(TakeUntil.STOP);
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope, null, null, new TimerWorker$run$1(takeUntil, atomicBoolean, continuation, 22), 3);
                try {
                    Flow flow = takeUntil.source;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(i11, atomicBoolean, (SafeCollector) obj2);
                    this.L$0 = null;
                    this.L$2 = launch$default;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (TakeUntil.StopException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    standaloneCoroutine = launch$default;
                    standaloneCoroutine.cancel(TakeUntil.STOP);
                    throw th;
                }
                standaloneCoroutine = launch$default;
                standaloneCoroutine.cancel(TakeUntil.STOP);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$2;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass12 = new BufferCountKt$bufferSkip$1.AnonymousClass1(19, (CardSchemePresenter) this.L$0, (ParcelableSnapshotMutableIntState) this.this$0, (MutableState) obj2);
                    this.label = 1;
                    Object collect = flow2.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(anonymousClass12, 16), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$2;
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(coroutineScope2, (TaxReturnsPresenter) this.this$0, (State) obj2, i10);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass13, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj2;
                RealCardCustomizationRepository realCardCustomizationRepository = (RealCardCustomizationRepository) this.this$0;
                StoryQueries storyQueries = realCardCustomizationRepository.cardCustomizationQueries;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    storyQueries.getClass();
                    str2.getClass();
                    CardCustomizationQueries$select$2 cardCustomizationQueries$select$2 = CardCustomizationQueries$select$2.INSTANCE;
                    CardCustomization cardCustomization2 = (CardCustomization) new OffersSheetQueries$ForSheetKeyQuery(storyQueries, str2, new CardAppletTile$$ExternalSyntheticLambda0(8)).executeAsOneOrNull();
                    if (cardCustomization2 != null) {
                        byte[] bArr = cardCustomization2.customization_bitmap;
                        this.L$0 = flowCollector;
                        this.L$2 = cardCustomization2;
                        this.label = 1;
                        if (flowCollector.emit(bArr, this) != coroutineSingletons4) {
                            cardCustomization = cardCustomization2;
                        }
                        return coroutineSingletons4;
                    }
                    String str3 = realCardCustomizationRepository.endpoint;
                    HttpUrl.Builder builder = new HttpUrl.Builder();
                    builder.parse$okhttp(null, str3);
                    HttpUrl.Builder newBuilder = builder.build().newBuilder();
                    newBuilder.encodedPath(str2);
                    String str4 = newBuilder.build().url;
                    Request.Builder builder2 = new Request.Builder();
                    builder2.url(str4);
                    Request request = new Request(builder2);
                    OkHttpClient okHttpClient = (OkHttpClient) realCardCustomizationRepository.authenticatedOkHttpClient.invoke();
                    okHttpClient.getClass();
                    Response execute = new RealCall(okHttpClient, request, false).execute();
                    byte[] bytes = execute.code != 200 ? execute.body.bytes() : null;
                    storyQueries.getClass();
                    storyQueries.driver.execute(828789793, "INSERT OR REPLACE INTO cardCustomization (path, customization_bitmap) VALUES (?, ?)", new BottomSheet$$ExternalSyntheticLambda3(25, str2, bytes));
                    storyQueries.notifyQueries(828789793, new CardAppletTile$$ExternalSyntheticLambda0(i3));
                    this.L$0 = null;
                    this.L$2 = null;
                    this.label = 2;
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    cardCustomization = (CardCustomization) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                if (cardCustomization.customization_bitmap != null) {
                    return Unit.INSTANCE;
                }
                String str32 = realCardCustomizationRepository.endpoint;
                HttpUrl.Builder builder3 = new HttpUrl.Builder();
                builder3.parse$okhttp(null, str32);
                HttpUrl.Builder newBuilder2 = builder3.build().newBuilder();
                newBuilder2.encodedPath(str2);
                String str42 = newBuilder2.build().url;
                Request.Builder builder22 = new Request.Builder();
                builder22.url(str42);
                Request request2 = new Request(builder22);
                OkHttpClient okHttpClient2 = (OkHttpClient) realCardCustomizationRepository.authenticatedOkHttpClient.invoke();
                okHttpClient2.getClass();
                Response execute2 = new RealCall(okHttpClient2, request2, false).execute();
                if (execute2.code != 200) {
                }
                storyQueries.getClass();
                storyQueries.driver.execute(828789793, "INSERT OR REPLACE INTO cardCustomization (path, customization_bitmap) VALUES (?, ?)", new BottomSheet$$ExternalSyntheticLambda3(25, str2, bytes));
                storyQueries.notifyQueries(828789793, new CardAppletTile$$ExternalSyntheticLambda0(i3));
                this.L$0 = null;
                this.L$2 = null;
                this.label = 2;
            case 4:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    break;
                } else if (i17 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i17 == 2) {
                    SlerpAnimator slerpAnimator2 = (SlerpAnimator) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    slerpAnimator = slerpAnimator2;
                    CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$1 = new CardAppletWorker$setup$1$2$1(flowCollector2, slerpAnimator, continuation, 8);
                    this.L$0 = flowCollector2;
                    this.L$2 = null;
                    this.label = 3;
                    break;
                } else if (i17 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    Quat quat = Hero3DCardViewKt.FORWARD_RESTING;
                    float[] fArr = Hero3DCardViewKt.Z_AXIS;
                    SlerpAnimator slerpAnimator3 = new SlerpAnimator(quat, new Quat(3.1415927f, fArr).times(quat), new Quat(6.2831855f, fArr).times(quat));
                    slerpAnimator3.setCurrentFraction(RecyclerView.DECELERATION_RATE);
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(Updater.snapshotFlow(new PageTagSlotKt$$ExternalSyntheticLambda0((CardAppletTileKt$$ExternalSyntheticLambda1) obj2, 12)), new InfiniteTransition$run$1$1$3(i10, continuation, i12), i11);
                    this.L$0 = flowCollector2;
                    this.L$2 = null;
                    this.label = 4;
                    FlowKt.ensureActive(flowCollector2);
                    Object collect2 = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(new CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2(flowCollector2, slerpAnimator3, i11), this);
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                        break;
                    }
                } else if (i17 == 4) {
                    SafeTrace.throwOnFailure(obj);
                    Quat quat2 = Hero3DCardViewKt.FORWARD_RESTING;
                    this.L$0 = null;
                    this.L$2 = null;
                    this.label = 5;
                    break;
                } else {
                    if (i17 == 5) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                slerpAnimator = new SlerpAnimator((Quat) this.this$0, Hero3DCardViewKt.FORWARD_RESTING);
                slerpAnimator.setCurrentFraction(RecyclerView.DECELERATION_RATE);
                Object animatedValue = slerpAnimator.getAnimatedValue();
                animatedValue.getClass();
                this.L$0 = flowCollector2;
                this.L$2 = slerpAnimator;
                this.label = 2;
                break;
            case 5:
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i9, (MutableState) this.L$2));
                    HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2((Object) cardRegistry$CardTransition$TransitionType, this.this$0, obj2, (MutableState) this.L$2, (Continuation) null, 10);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, anonymousClass2, this) == coroutineSingletons6) {
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
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i10, (MutableState) this.L$2)), i7);
                    TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2((MutableState) this.L$0, (CardRegistry) this.this$0, (String) obj2, (Continuation) null, 5);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, takeUntil$collectSafely$2, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.distinctUntilChanged(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.L$2, (MutableState) this.L$0, i5))), i7);
                    DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling$2((SnapshotStateMap) this.this$0, (CardScreenId) obj2, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, defaultFlingBehavior$performFling$2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
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
                CardScene cardScene = (CardScene) this.this$0;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardState interactiveCardState = new InteractiveCardState();
                    StandaloneCoroutine launch$default2 = JobKt.launch$default(coroutineScope3, null, null, new TimerWorker$run$1(interactiveCardState, cardScene, continuation, i8), 3);
                    Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    boolean booleanValue = ((Boolean) ((State) obj2).getValue()).booleanValue();
                    this.L$0 = null;
                    this.L$2 = launch$default2;
                    this.label = 1;
                    if (JobKt.coroutineScope(new RoomDatabase$performClear$1(interactiveCardState, booleanValue, continuation, 20), this) != coroutineSingletons9) {
                        standaloneCoroutine2 = launch$default2;
                    }
                    return coroutineSingletons9;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cardScene.setChildrenLocal(EmptyList.INSTANCE);
                    return Unit.INSTANCE;
                }
                standaloneCoroutine2 = (StandaloneCoroutine) this.L$2;
                SafeTrace.throwOnFailure(obj);
                this.L$0 = null;
                this.L$2 = null;
                this.label = 2;
                break;
            case 9:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.L$2, (MutableState) this.this$0, 14)), 6);
                    ShoppingWebPresenter$models$15$1 shoppingWebPresenter$models$15$1 = new ShoppingWebPresenter$models$15$1(coroutineScope4, (MutableState) obj2, continuation, i10);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1, shoppingWebPresenter$models$15$1, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                InteractiveCardState interactiveCardState2 = (InteractiveCardState) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((SnapshotStateList) this.L$2).add(interactiveCardState2);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1((State) this.this$0, i4));
                    RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(interactiveCardState2, (MutableState) obj2, continuation, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow2, roomDatabase$performClear$1, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(16, (MutableState) this.L$2));
                    TakeUntil$collectSafely$2 takeUntil$collectSafely$22 = new TakeUntil$collectSafely$2((SnapshotStateList) this.L$0, (State) this.this$0, (MutableState) obj2, (Continuation) null, 10);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, takeUntil$collectSafely$22, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$13 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda9(i2, (Function0) this.L$2, (Function0) this.L$0, (Function0) this.this$0)), i7);
                    TimerWorker$run$1 timerWorker$run$1 = new TimerWorker$run$1((CardNuxState) obj2, continuation, 8);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$13, timerWorker$run$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                List list2 = (List) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (RevolvingInteractiveCardsKt.rotateCards((CardNuxState) this.L$2, list2, (ActivityManager) this.this$0, (CardRegistry) obj2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                try {
                } catch (Exception e) {
                    if (!(e instanceof CancellationException)) {
                        Timber.Forest.w("Failed to fetch dashboard schedules", new Object[0], e);
                        DashboardScheduleState.Error error = new DashboardScheduleState.Error(e);
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    } else {
                        throw e;
                    }
                }
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector3;
                    this.label = 1;
                    break;
                } else if (i27 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i27 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    access$fetchUpcomingSchedules = obj;
                    DashboardScheduleState.Loaded loaded = new DashboardScheduleState.Loaded((List) access$fetchUpcomingSchedules);
                    this.L$0 = flowCollector3;
                    this.label = 3;
                    break;
                } else {
                    if (i27 == 3) {
                        SafeTrace.throwOnFailure(obj);
                    } else {
                        if (i27 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = flowCollector3;
                this.label = 2;
                access$fetchUpcomingSchedules = RealDashboardScheduleProvider.access$fetchUpcomingSchedules((RealDashboardScheduleProvider) this.L$2, (String) this.this$0, (String) obj2, this);
                if (access$fetchUpcomingSchedules == coroutineSingletons15) {
                    return coroutineSingletons15;
                }
                DashboardScheduleState.Loaded loaded2 = new DashboardScheduleState.Loaded((List) access$fetchUpcomingSchedules);
                this.L$0 = flowCollector3;
                this.label = 3;
            case 15:
                RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) obj2;
                ShiftLoaderIdentity shiftLoaderIdentity3 = (ShiftLoaderIdentity) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest allByMerchantId$default = RealLocationRepository.getAllByMerchantId$default(realShiftDataLoader.locationRepository, shiftLoaderIdentity3.merchantIdentifier.entityId);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.L$0 = shiftLoaderIdentity3;
                    this.L$2 = shiftLoaderIdentity3;
                    this.label = 1;
                    firstOrDefault = realShiftDataLoader.firstOrDefault(allByMerchantId$default, emptyList, "locations", this);
                    if (firstOrDefault != coroutineSingletons16) {
                        shiftLoaderIdentity = shiftLoaderIdentity3;
                    }
                    return coroutineSingletons16;
                }
                if (i28 != 1) {
                    if (i28 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = (List) this.this$0;
                    shiftLoaderIdentity2 = (ShiftLoaderIdentity) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    list = list3;
                    access$getWeekStartDaySetting = obj;
                    return new ShiftLoaderContext(shiftLoaderIdentity2, list, (DayOfWeek) access$getWeekStartDaySetting);
                }
                ShiftLoaderIdentity shiftLoaderIdentity4 = (ShiftLoaderIdentity) this.L$2;
                SafeTrace.throwOnFailure(obj);
                shiftLoaderIdentity = shiftLoaderIdentity4;
                firstOrDefault = obj;
                list = (List) firstOrDefault;
                MerchantIdentifier merchantIdentifier = shiftLoaderIdentity3.merchantIdentifier;
                this.L$0 = null;
                this.L$2 = shiftLoaderIdentity;
                this.this$0 = list;
                this.label = 2;
                access$getWeekStartDaySetting = RealShiftDataLoader.access$getWeekStartDaySetting(realShiftDataLoader, merchantIdentifier, this);
                if (access$getWeekStartDaySetting != coroutineSingletons16) {
                    shiftLoaderIdentity2 = shiftLoaderIdentity;
                    return new ShiftLoaderContext(shiftLoaderIdentity2, list, (DayOfWeek) access$getWeekStartDaySetting);
                }
                return coroutineSingletons16;
            case 16:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$2;
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(coroutineScope5, (WorkHomePresenter) this.this$0, (MutableState) obj2, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass14, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                PayHistoryListPresenter$DataState.Loaded loaded3 = (PayHistoryListPresenter$DataState.Loaded) this.L$2;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (loaded3 != null && loaded3.isLoadingMore) {
                        MerchantIdentifier merchantIdentifier2 = (MerchantIdentifier) ((MutableState) this.this$0).getValue();
                        if (merchantIdentifier2 == null || (str = merchantIdentifier2.token) == null) {
                            return Unit.INSTANCE;
                        }
                        Integer num = loaded3.nextOffset;
                        if (num == null) {
                            return Unit.INSTANCE;
                        }
                        int intValue = num.intValue();
                        TaxAuthorizationPresenter taxAuthorizationPresenter = (TaxAuthorizationPresenter) this.L$0;
                        Integer num2 = new Integer(intValue);
                        this.label = 1;
                        access$fetchStubs = TaxAuthorizationPresenter.access$fetchStubs(taxAuthorizationPresenter, str, num2, this);
                        if (access$fetchStubs == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                access$fetchStubs = obj;
                PayHistoryListPresenter$FetchResult payHistoryListPresenter$FetchResult = (PayHistoryListPresenter$FetchResult) access$fetchStubs;
                ((MutableState) obj2).setValue(payHistoryListPresenter$FetchResult != null ? new PayHistoryListPresenter$DataState.Loaded(CollectionsKt.plus((Iterable) payHistoryListPresenter$FetchResult.stubs, (Collection) loaded3.stubs), payHistoryListPresenter$FetchResult.nextOffset, false) : PayHistoryListPresenter$DataState.Loaded.copy$default(loaded3, false));
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$2;
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(coroutineScope6, (PayHomePresenter) this.this$0, (State) obj2, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(anonymousClass15, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$2;
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1(coroutineScope7, (WorkHomePresenter) this.this$0, (ParcelableSnapshotMutableIntState) obj2, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass16, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.L$2;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                try {
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInRepository realClockInRepository = (RealClockInRepository) shareSheetPresenter.profileManager;
                        DeclareCashTipBottomSheetScreen declareCashTipBottomSheetScreen = (DeclareCashTipBottomSheetScreen) shareSheetPresenter.shareTargetsManager;
                        String str5 = declareCashTipBottomSheetScreen.timecardToken;
                        Money money = (Money) this.L$0;
                        String str6 = declareCashTipBottomSheetScreen.merchantToken;
                        this.label = 1;
                        if (realClockInRepository.stopTimecard(str5, money, str6, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    AskedQuestion askedQuestion = (AskedQuestion) this.this$0;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                    if (askedQuestion != null) {
                        screenNavigator.giveAnswer(askedQuestion, DeclareCashTipResult$Success.INSTANCE);
                    } else {
                        screenNavigator.goTo(back);
                    }
                } catch (Exception e2) {
                    Timber.Forest.w("Failed to clock out with declared tip", new Object[0], e2);
                    ((KClassImpl$Data$$Lambda$23) obj2).invoke();
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$2;
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1(coroutineScope8, (HCaptcha) this.this$0, (State) obj2, i5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass17, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$2;
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1(coroutineScope9, (CardLockPresenter) this.this$0, (State) obj2, i6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(anonymousClass18, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.L$2;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                try {
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInRepository realClockInRepository2 = (RealClockInRepository) pdfPreviewPresenter.launcher;
                        String str7 = (String) this.L$0;
                        String str8 = (String) this.this$0;
                        this.label = 1;
                        if (realClockInRepository2.updateNote(str7, null, str8, this) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i36 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ShiftsAnalytics shiftsAnalytics = (ShiftsAnalytics) pdfPreviewPresenter.fileProvider;
                    shiftsAnalytics.analytics.track(new ShiftsNoteDeleteComplete(shiftsAnalytics.getPersonToken(), shiftsAnalytics.getMerchantToken()), null);
                    AskedQuestion askedQuestion2 = ((ShiftNoteScreen) pdfPreviewPresenter.args).askedQuestion;
                    BetterNavigator.ScreenNavigator screenNavigator2 = pdfPreviewPresenter.navigator;
                    if (askedQuestion2 != null) {
                        screenNavigator2.giveAnswer(askedQuestion2, ShiftNoteResult$Deleted.INSTANCE);
                    } else {
                        screenNavigator2.goTo(back);
                    }
                } catch (Exception e3) {
                    Timber.Forest.w("Failed to delete note", new Object[0], e3);
                    ((ShiftNotePresenter$models$1$1) obj2).invoke(new ToastState(((AndroidStringManager) pdfPreviewPresenter.stringManager).get(R.string.work_shift_error_generic), new Long(System.currentTimeMillis())));
                }
                return Unit.INSTANCE;
            case 24:
                MutableState mutableState = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ImmutableList immutableList = (ImmutableList) this.L$2;
                    LocalDate localDate = (LocalDate) this.this$0;
                    Iterator it = immutableList.iterator();
                    int i38 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i38 = -1;
                        } else if (!((ShiftListDayViewModel) it.next()).date.equals(localDate)) {
                            i38++;
                        }
                    }
                    if (i38 >= 0) {
                        boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                        LazyListState lazyListState = (LazyListState) this.L$0;
                        if (!booleanValue2) {
                            this.label = 1;
                            WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                            break;
                        } else {
                            this.label = 2;
                            WorkLauncherImpl workLauncherImpl2 = LazyListState.Saver;
                            break;
                        }
                        return coroutineSingletons25;
                    }
                } else if (i37 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                } else {
                    if (i37 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowKt$combineUndispatched$1$1 stateFlowKt$combineUndispatched$1$1 = new StateFlowKt$combineUndispatched$1$1((StateFlow) this.L$2, (StateFlow) this.this$0, flowCollector4, (StateFlowKt$combineState$2) obj2, null);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(stateFlowKt$combineUndispatched$1$1, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                return invokeSuspend$com$squareup$workflow1$RenderWorkflowKt$renderWorkflowIn$1(obj);
            case 27:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) this.L$0;
                    int i41 = FinancialConnectionsSheetActivity.$r8$clinit;
                    GlobPattern globPattern = ((FinancialConnectionsSheetState) mutableState2.getValue()).viewEffect;
                    if (globPattern != null) {
                        FinancialConnectionsSheetActivity financialConnectionsSheetActivity2 = (FinancialConnectionsSheetActivity) this.this$0;
                        this.L$2 = financialConnectionsSheetActivity2;
                        this.label = 1;
                        if (FinancialConnectionsSheetActivity.access$handleViewEffect(financialConnectionsSheetActivity2, globPattern, (StripeBottomSheetState) obj2, this) == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                        financialConnectionsSheetActivity = financialConnectionsSheetActivity2;
                    }
                    return Unit.INSTANCE;
                }
                if (i40 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                financialConnectionsSheetActivity = (FinancialConnectionsSheetActivity) this.L$2;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = financialConnectionsSheetActivity.getViewModel()._stateFlow;
                do {
                    value = stateFlowImpl.getValue();
                    financialConnectionsSheetState = (FinancialConnectionsSheetState) value;
                    financialConnectionsSheetState.getClass();
                } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, false, null, null, null, 15)));
                return Unit.INSTANCE;
            case 28:
                return invokeSuspend$com$stripe$android$financialconnections$domain$PostAuthSessionEvent$invoke$1(obj);
            default:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = this.label;
                if (i42 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(FlowKt.distinctUntilChanged(Updater.snapshotFlow(new HCaptcha$$ExternalSyntheticLambda0((ModalBottomSheetState) this.L$2, 17))), 1);
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass19 = new BufferCountKt$bufferSkip$1.AnonymousClass1(23, (NavBackStackEntry) this.L$0, (MutableState) this.this$0, (MutableState) obj2);
                    this.label = 1;
                    if (drop.collect(anonymousClass19, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i42 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.util.coroutines.TakeUntil$collectSafely$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $collector;
        public final /* synthetic */ Object $gate;
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass1(FlowCollector flowCollector, RealSellerCardViewModelProducer realSellerCardViewModelProducer, Merchant merchant) {
            this.$r8$classId = 8;
            this.$gate = flowCollector;
            this.$collector = merchant;
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x01db, code lost:
        
            if (r14.emit(r15, r13) != r3) goto L120;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0209, code lost:
        
            if (r14.emit(r15, r13) == r3) goto L119;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x02cb  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0325  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0388  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0392  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x03ec  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x045a  */
        /* JADX WARN: Removed duplicated region for block: B:318:0x04b4  */
        /* JADX WARN: Removed duplicated region for block: B:324:0x04be  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:347:0x0518  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x0522  */
        /* JADX WARN: Removed duplicated region for block: B:468:0x075a  */
        /* JADX WARN: Removed duplicated region for block: B:474:0x0764  */
        /* JADX WARN: Removed duplicated region for block: B:502:0x07e3  */
        /* JADX WARN: Removed duplicated region for block: B:508:0x07ed  */
        /* JADX WARN: Removed duplicated region for block: B:522:0x0828  */
        /* JADX WARN: Removed duplicated region for block: B:528:0x0832  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x08a2  */
        /* JADX WARN: Removed duplicated region for block: B:553:0x08ae  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:606:0x095b  */
        /* JADX WARN: Removed duplicated region for block: B:615:0x0972  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v50 */
        /* JADX WARN: Type inference failed for: r10v51 */
        /* JADX WARN: Type inference failed for: r10v52 */
        /* JADX WARN: Type inference failed for: r10v7 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            OverdraftStatus.Eligible eligible;
            OverdraftStatus.Upsell upsell;
            OverdraftStatus.State_ state_;
            OverdraftStatus.State_ state_2;
            OverdraftStatus.Button button;
            RealCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1 realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1;
            int i;
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX;
            List list;
            Map map;
            CardThemeDefinition cardThemeDefinition;
            RealAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1 realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1;
            int i2;
            RealPayDataLoader$loadForIdentity$$inlined$filter$1$2$1 realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1;
            int i3;
            RealSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1 realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1;
            int i4;
            String str;
            String str2;
            CalendarEvent calendarEvent;
            BaseRepositoryKt$events$$inlined$mapNotNull$1$2$1 baseRepositoryKt$events$$inlined$mapNotNull$1$2$1;
            int i5;
            RealJobRepository$getByIds$$inlined$getEntities$1$2$1 realJobRepository$getByIds$$inlined$getEntities$1$2$1;
            int i6;
            RealLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1 realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1;
            int i7;
            RealLocationRepository$getByIds$$inlined$getEntities$1$2$1 realLocationRepository$getByIds$$inlined$getEntities$1$2$1;
            int i8;
            RealMembershipRepository$getMemberships$$inlined$getEntities$1$2$1 realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1;
            int i9;
            RealMerchantRepository$getAll$$inlined$getEntities$1$2$1 realMerchantRepository$getAll$$inlined$getEntities$1$2$1;
            int i10;
            RealSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1 realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1;
            int i11;
            LifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1 lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1;
            int i12;
            BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1;
            int i13;
            FlowCollector flowCollector;
            List list2;
            Throwable th;
            FlowCollector flowCollector2;
            Object lastOrNull;
            FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1 financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1;
            int i14;
            DocumentCameraWorker$run$$inlined$map$1$2$1 documentCameraWorker$run$$inlined$map$1$2$1;
            int i15;
            int i16 = this.$r8$classId;
            int i17 = 2;
            Back back = Back.INSTANCE;
            r4 = 0;
            r4 = 0;
            int i18 = 0;
            int i19 = 1;
            Object obj2 = this.$collector;
            Object obj3 = this.$gate;
            ?? r10 = 0;
            Pair pair = null;
            r10 = null;
            String str3 = null;
            r10 = 0;
            r10 = 0;
            r10 = 0;
            switch (i16) {
                case 0:
                    if (((AtomicBoolean) obj3).get()) {
                        throw TakeUntil.STOP;
                    }
                    Object emit = ((SafeCollector) obj2).emit(obj, continuation);
                    return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
                case 1:
                    CoroutineScope coroutineScope = (CoroutineScope) obj3;
                    if (((PresenterEvents) obj) instanceof PresenterEvents.PrepurchaseToggleTapped) {
                        JobKt.launch$default(coroutineScope, null, null, new CardSchemePresenter$models$6$1((CardSchemePresenter) obj2, r10, i17), 3);
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (!Intrinsics.areEqual((OverdraftCoverageListItemViewEvent$OverdraftClicked) obj, OverdraftCoverageListItemViewEvent$OverdraftClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj3;
                    OverdraftStatus overdraftStatus = (OverdraftStatus) ((State) obj2).getValue();
                    ((Analytics) taxReturnsPresenter.args).track(new OverdraftCoverageManageTapCardsTabOverdraftCoverageItem(), null);
                    String str4 = (overdraftStatus == null || (button = overdraftStatus.footer_button_override) == null) ? null : button.client_route_url;
                    int i20 = 7;
                    if (str4 == null) {
                        if (overdraftStatus != null && (state_2 = overdraftStatus.State) != null) {
                            OverdraftStatus.State_.Eligible eligible2 = state_2 instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_2 : null;
                            if (eligible2 != null) {
                                eligible = eligible2.value;
                                if (eligible == null) {
                                    if (overdraftStatus != null && (state_ = overdraftStatus.State) != null) {
                                        OverdraftStatus.State_.Upsell upsell2 = state_ instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_ : null;
                                        if (upsell2 != null) {
                                            upsell = upsell2.value;
                                            if (upsell == null) {
                                                ((BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator).goTo(new OverdraftCoverageSheetScreen(new WalletHomeScreen(i20, (Integer) r10, (String) r10)));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                    upsell = null;
                                    if (upsell == null) {
                                    }
                                }
                            }
                        }
                        eligible = null;
                        if (eligible == null) {
                        }
                    }
                    RealRouter realRouter = (RealRouter) taxReturnsPresenter.router;
                    if (str4 == null) {
                        OverdraftStatus.Button button2 = overdraftStatus.footer_button;
                        button2.getClass();
                        str4 = button2.client_route_url;
                        str4.getClass();
                    }
                    realRouter.route(new RoutingParams(new WalletHomeScreen(i20, (Integer) r10, (String) r10), null, null, null, null, null, 510), str4);
                    return Unit.INSTANCE;
                case 3:
                    CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj2;
                    if (continuation instanceof RealCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1) {
                        realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1 = (RealCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1) continuation;
                        int i21 = realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.label;
                        if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                            realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                            Object obj4 = realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                FlowCollector flowCollector3 = (FlowCollector) obj3;
                                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj;
                                CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = heroNullStateModule.nux;
                                if (cardModule$HeroNullStateModule$Nux$UhchNux != null && (unifiedCardHomeNUX = cardModule$HeroNullStateModule$Nux$UhchNux.value) != null && (list = unifiedCardHomeNUX.rotating_card_theme_tokens) != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        CardTheme cardTheme = (cardThemeDefinitions == null || (map = cardThemeDefinitions.card_theme_definitions) == null || (cardThemeDefinition = (CardThemeDefinition) map.get((String) it.next())) == null) ? null : cardThemeDefinition.card_theme;
                                        if (cardTheme != null) {
                                            arrayList.add(cardTheme);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        r10 = arrayList;
                                    }
                                }
                                Lazy lazy = LazyKt.lazy(new CardModelView$1$3$4$2(27, cardThemeDefinitions, heroNullStateModule));
                                List list3 = r10;
                                if (r10 == 0) {
                                    list3 = (List) lazy.getValue();
                                }
                                realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.label = 1;
                                if (flowCollector3.emit(list3, realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj4);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1 = new RealCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1(this, continuation);
                    Object obj42 = realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realCardAppletTileRepository$cardNuxThemes$lambda$1$$inlined$map$1$2$1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    return emit(((Boolean) obj).booleanValue(), continuation);
                case 5:
                    if (continuation instanceof RealAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1) {
                        realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1 = (RealAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1) continuation;
                        int i22 = realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.label;
                        if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                            realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                            Object obj5 = realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                FlowCollector flowCollector4 = (FlowCollector) obj3;
                                List<Job> list4 = (List) obj;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                for (Job job : list4) {
                                    arrayList2.add(new AssignedJob(job, (MembershipWage) ((LinkedHashMap) obj2).get(job.id)));
                                }
                                realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(arrayList2, realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                    realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1 = new RealAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realAssignedJobProvider$getAssignedJobs$lambda$0$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    if (continuation instanceof RealPayDataLoader$loadForIdentity$$inlined$filter$1$2$1) {
                        realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1 = (RealPayDataLoader$loadForIdentity$$inlined$filter$1$2$1) continuation;
                        int i23 = realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.label;
                        if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                            realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                            Object obj6 = realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                FlowCollector flowCollector5 = (FlowCollector) obj2;
                                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                                    realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector5.emit(obj, realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
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
                    realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1 = new RealPayDataLoader$loadForIdentity$$inlined$filter$1$2$1(this, continuation);
                    Object obj62 = realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = realPayDataLoader$loadForIdentity$$inlined$filter$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    MutableState mutableState = (MutableState) obj2;
                    WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj3;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) workHomePresenter.shiftsAnalytics;
                    MerchantPickerViewEvent merchantPickerViewEvent = (MerchantPickerViewEvent) obj;
                    if (merchantPickerViewEvent instanceof MerchantPickerViewEvent.SelectMerchant) {
                        mutableState.setValue(((MerchantPickerViewEvent.SelectMerchant) merchantPickerViewEvent).merchant);
                    } else if (Intrinsics.areEqual(merchantPickerViewEvent, MerchantPickerViewEvent.UpdateClicked.INSTANCE)) {
                        MerchantIdentifier merchantIdentifier = (MerchantIdentifier) mutableState.getValue();
                        if (merchantIdentifier != null) {
                            ((RealSelectedMerchantSetter) workHomePresenter.shiftSection2Presenter).selectMerchant(merchantIdentifier);
                        }
                        screenNavigator.goTo(back);
                    } else {
                        if (!Intrinsics.areEqual(merchantPickerViewEvent, MerchantPickerViewEvent.DismissClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(back);
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof RealSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1) {
                        realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1 = (RealSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1) continuation;
                        int i24 = realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.label;
                        if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                            realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                SellerCardViewModel sellerCardViewModel = Error.Code.Companion.toSellerCardViewModel((Merchant) obj2, Error.Code.Companion.asBrandDetailsMap((LoaderState) obj));
                                realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.label = 1;
                                if (((FlowCollector) obj3).emit(sellerCardViewModel, realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1) == coroutineSingletons5) {
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
                    realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1 = new RealSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = realSellerCardViewModelProducer$sellerCardViewModel$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    State state = (State) obj2;
                    PayHomePresenter payHomePresenter = (PayHomePresenter) obj3;
                    BetterNavigator.ScreenNavigator screenNavigator2 = payHomePresenter.navigator;
                    PayHomeViewEvent payHomeViewEvent = (PayHomeViewEvent) obj;
                    if (Intrinsics.areEqual(payHomeViewEvent, PayHomeViewEvent.BackPressed.INSTANCE)) {
                        screenNavigator2.goTo(back);
                    } else if (Intrinsics.areEqual(payHomeViewEvent, PayHomeViewEvent.RetryClicked.INSTANCE)) {
                        StateFlowKt.emitOrThrow(((RealPayDataLoader) payHomePresenter.payDataLoader).refreshTrigger, Unit.INSTANCE);
                    } else if (!(payHomeViewEvent instanceof PayHomeViewEvent.PastPayStubClicked)) {
                        if (Intrinsics.areEqual(payHomeViewEvent, PayHomeViewEvent.SeeMoreClicked.INSTANCE)) {
                            screenNavigator2.goTo(WorkPayHistoryListScreen.INSTANCE);
                        } else if (Intrinsics.areEqual(payHomeViewEvent, PayHomeViewEvent.TaxFormsClicked.INSTANCE)) {
                            screenNavigator2.goTo(WorkTaxFormsListScreen.INSTANCE);
                        } else if (Intrinsics.areEqual(payHomeViewEvent, PayHomeViewEvent.DirectDepositClicked.INSTANCE)) {
                            MerchantIdentifier merchantIdentifier2 = (MerchantIdentifier) state.getValue();
                            if (merchantIdentifier2 != null && (str2 = merchantIdentifier2.token) != null) {
                                screenNavigator2.goTo(new WorkWebScreen("https://app.squareupstaging.com".concat(String.format(Locale.US, "/team/member/m/%s/deposit-settings?arcade=true", Arrays.copyOf(new Object[]{str2}, 1))), true, WorkWebKey.DIRECT_DEPOSIT, str2));
                            }
                        } else {
                            if (!Intrinsics.areEqual(payHomeViewEvent, PayHomeViewEvent.LinkedAccountsClicked.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            MerchantIdentifier merchantIdentifier3 = (MerchantIdentifier) state.getValue();
                            if (merchantIdentifier3 != null && (str = merchantIdentifier3.token) != null) {
                                screenNavigator2.goTo(new WorkWebScreen("https://app.squareupstaging.com".concat(String.format(Locale.US, "/team/member/m/%s/linked-accounts?arcade=true", Arrays.copyOf(new Object[]{str}, 1))), true, WorkWebKey.LINKED_ACCOUNTS, str));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 10:
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) ((WorkHomePresenter) obj3).titleBarPresenter;
                    TaxFormsListViewEvent taxFormsListViewEvent = (TaxFormsListViewEvent) obj;
                    if (Intrinsics.areEqual(taxFormsListViewEvent, TaxFormsListViewEvent.BackPressed.INSTANCE)) {
                        screenNavigator3.goTo(back);
                    } else if (Intrinsics.areEqual(taxFormsListViewEvent, TaxFormsListViewEvent.RetryClicked.INSTANCE)) {
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                        Okio.boxInt(intValue);
                    } else {
                        if (!(taxFormsListViewEvent instanceof TaxFormsListViewEvent.FormClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        TaxFormsListViewEvent.FormClicked formClicked = (TaxFormsListViewEvent.FormClicked) taxFormsListViewEvent;
                        String str5 = formClicked.downloadUrl;
                        if (str5 != null) {
                            screenNavigator3.goTo(new WorkTaxFormDownloaderScreen(formClicked.token, formClicked.title, str5));
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    State state2 = (State) obj2;
                    HCaptcha hCaptcha = (HCaptcha) obj3;
                    WorkHomeViewEvent workHomeViewEvent = (WorkHomeViewEvent) obj;
                    if (workHomeViewEvent instanceof ShiftSection2ViewEvent$ClockInClicked) {
                        if (((ClockInEssentialsState) state2.getValue()) instanceof ClockInEssentials) {
                            ((BetterNavigator.ScreenNavigator) hCaptcha.result).goTo(new ClockInOverlayScreen(((ShiftSection2ViewEvent$ClockInClicked) workHomeViewEvent).shiftId != null));
                        }
                    } else if (workHomeViewEvent instanceof ShiftSection2ViewEvent$DetailsClicked) {
                        ((BetterNavigator.ScreenNavigator) hCaptcha.result).goTo(new ShiftDetailScreen(((ShiftSection2ViewEvent$DetailsClicked) workHomeViewEvent).shiftId));
                    } else if (workHomeViewEvent instanceof ShiftSection2ViewEvent$ClockInUnscheduledClicked) {
                        if (((ClockInEssentialsState) state2.getValue()) instanceof ClockInEssentials) {
                            ((BetterNavigator.ScreenNavigator) hCaptcha.result).goTo(new ClockInOverlayScreen(false));
                        }
                    } else if (workHomeViewEvent instanceof ShiftSection2ViewEvent$DisabledClockInTapped) {
                        ShiftSection2ViewEvent$DisabledClockInTapped shiftSection2ViewEvent$DisabledClockInTapped = (ShiftSection2ViewEvent$DisabledClockInTapped) workHomeViewEvent;
                        ((BetterNavigator.ScreenNavigator) hCaptcha.result).goTo(new ShiftNotStartedDialogScreen(shiftSection2ViewEvent$DisabledClockInTapped.startDateTime, shiftSection2ViewEvent$DisabledClockInTapped.timeZoneId));
                    }
                    return Unit.INSTANCE;
                case 12:
                    BetterNavigator.ScreenNavigator screenNavigator4 = ((CardLockPresenter) obj3).navigator;
                    ShiftDetailViewEvent shiftDetailViewEvent = (ShiftDetailViewEvent) obj;
                    if (Intrinsics.areEqual(shiftDetailViewEvent, ShiftDetailViewEvent.BackClicked.INSTANCE)) {
                        screenNavigator4.goTo(back);
                    } else if (!Intrinsics.areEqual(shiftDetailViewEvent, ShiftDetailViewEvent.OverflowMenuClicked.INSTANCE)) {
                        if (Intrinsics.areEqual(shiftDetailViewEvent, ShiftDetailViewEvent.ClockInClicked.INSTANCE)) {
                            screenNavigator4.goTo(new ClockInOverlayScreen(true));
                        } else {
                            if (!Intrinsics.areEqual(shiftDetailViewEvent, ShiftDetailViewEvent.DisabledClockInTapped.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ClockInEssentialsState clockInEssentialsState = (ClockInEssentialsState) ((State) obj2).getValue();
                            ClockInEssentials.ClockedOutEssentials clockedOutEssentials = clockInEssentialsState instanceof ClockInEssentials.ClockedOutEssentials ? (ClockInEssentials.ClockedOutEssentials) clockInEssentialsState : null;
                            ClockInEssentials.NextShift nextShift = clockedOutEssentials != null ? clockedOutEssentials.nextShift : null;
                            OffsetDateTime offsetDateTime = nextShift != null ? (OffsetDateTime) nextShift.startTime$delegate.getValue() : null;
                            if (offsetDateTime != null) {
                                ShiftSchedule.Version version = nextShift.shift.published_version;
                                if (version != null && (calendarEvent = version.calendar_event) != null) {
                                    str3 = calendarEvent.time_zone;
                                }
                                screenNavigator4.goTo(new ShiftNotStartedDialogScreen(offsetDateTime, str3));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 13:
                    if (continuation instanceof BaseRepositoryKt$events$$inlined$mapNotNull$1$2$1) {
                        baseRepositoryKt$events$$inlined$mapNotNull$1$2$1 = (BaseRepositoryKt$events$$inlined$mapNotNull$1$2$1) continuation;
                        int i25 = baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.label;
                        if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                            baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                            Object obj8 = baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                FlowCollector flowCollector6 = (FlowCollector) obj3;
                                BaseEntityOperation baseEntityOperation = (BaseEntityOperation) obj;
                                KClass kClass = (KClass) obj2;
                                baseEntityOperation.getClass();
                                IBaseEntity iBaseEntity = baseEntityOperation.entity;
                                kClass.getClass();
                                if (kClass.isInstance(iBaseEntity)) {
                                    KClasses.cast(kClass, iBaseEntity);
                                    pair = new Pair(iBaseEntity, EntityOperationType.UPSERT);
                                }
                                if (pair != null) {
                                    baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector6.emit(pair, baseRepositoryKt$events$$inlined$mapNotNull$1$2$1) == coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    baseRepositoryKt$events$$inlined$mapNotNull$1$2$1 = new BaseRepositoryKt$events$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj82 = baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = baseRepositoryKt$events$$inlined$mapNotNull$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 14:
                    if (continuation instanceof RealJobRepository$getByIds$$inlined$getEntities$1$2$1) {
                        realJobRepository$getByIds$$inlined$getEntities$1$2$1 = (RealJobRepository$getByIds$$inlined$getEntities$1$2$1) continuation;
                        int i26 = realJobRepository$getByIds$$inlined$getEntities$1$2$1.label;
                        if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                            realJobRepository$getByIds$$inlined$getEntities$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realJobRepository$getByIds$$inlined$getEntities$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realJobRepository$getByIds$$inlined$getEntities$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                FlowCollector flowCollector7 = (FlowCollector) obj3;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj10 : (List) obj) {
                                    if (((Boolean) ((TextStreamsKt$$ExternalSyntheticLambda0) obj2).invoke(obj10)).booleanValue()) {
                                        arrayList3.add(obj10);
                                    }
                                }
                                realJobRepository$getByIds$$inlined$getEntities$1$2$1.label = 1;
                                if (flowCollector7.emit(arrayList3, realJobRepository$getByIds$$inlined$getEntities$1$2$1) == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj9);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realJobRepository$getByIds$$inlined$getEntities$1$2$1 = new RealJobRepository$getByIds$$inlined$getEntities$1$2$1(this, continuation);
                    Object obj92 = realJobRepository$getByIds$$inlined$getEntities$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realJobRepository$getByIds$$inlined$getEntities$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 15:
                    if (continuation instanceof RealLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1) {
                        realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1 = (RealLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1) continuation;
                        int i27 = realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label;
                        if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                            Object obj11 = realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                FlowCollector flowCollector8 = (FlowCollector) obj3;
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj12 : (List) obj) {
                                    if (((Boolean) ((StateBindingsKt$$ExternalSyntheticLambda0) obj2).invoke(obj12)).booleanValue()) {
                                        arrayList4.add(obj12);
                                    }
                                }
                                realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label = 1;
                                if (flowCollector8.emit(arrayList4, realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1) == coroutineSingletons8) {
                                    return coroutineSingletons8;
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj11);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1 = new RealLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1(this, continuation);
                    Object obj112 = realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realLocationRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 16:
                    if (continuation instanceof RealLocationRepository$getByIds$$inlined$getEntities$1$2$1) {
                        realLocationRepository$getByIds$$inlined$getEntities$1$2$1 = (RealLocationRepository$getByIds$$inlined$getEntities$1$2$1) continuation;
                        int i28 = realLocationRepository$getByIds$$inlined$getEntities$1$2$1.label;
                        if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocationRepository$getByIds$$inlined$getEntities$1$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                            Object obj13 = realLocationRepository$getByIds$$inlined$getEntities$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realLocationRepository$getByIds$$inlined$getEntities$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                FlowCollector flowCollector9 = (FlowCollector) obj3;
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj14 : (List) obj) {
                                    if (((Boolean) ((HeroCardViewKt$$ExternalSyntheticLambda0) obj2).invoke(obj14)).booleanValue()) {
                                        arrayList5.add(obj14);
                                    }
                                }
                                realLocationRepository$getByIds$$inlined$getEntities$1$2$1.label = 1;
                                if (flowCollector9.emit(arrayList5, realLocationRepository$getByIds$$inlined$getEntities$1$2$1) == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj13);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocationRepository$getByIds$$inlined$getEntities$1$2$1 = new RealLocationRepository$getByIds$$inlined$getEntities$1$2$1(this, continuation);
                    Object obj132 = realLocationRepository$getByIds$$inlined$getEntities$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realLocationRepository$getByIds$$inlined$getEntities$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 17:
                    if (continuation instanceof RealMembershipRepository$getMemberships$$inlined$getEntities$1$2$1) {
                        realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1 = (RealMembershipRepository$getMemberships$$inlined$getEntities$1$2$1) continuation;
                        int i29 = realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.label;
                        if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                            realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.label = i29 - PKIFailureInfo.systemUnavail;
                            Object obj15 = realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                FlowCollector flowCollector10 = (FlowCollector) obj3;
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj16 : (List) obj) {
                                    if (((Boolean) ((CardTransitionKt$$ExternalSyntheticLambda4) obj2).invoke(obj16)).booleanValue()) {
                                        arrayList6.add(obj16);
                                    }
                                }
                                realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.label = 1;
                                if (flowCollector10.emit(arrayList6, realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1) == coroutineSingletons10) {
                                    return coroutineSingletons10;
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj15);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1 = new RealMembershipRepository$getMemberships$$inlined$getEntities$1$2$1(this, continuation);
                    Object obj152 = realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realMembershipRepository$getMemberships$$inlined$getEntities$1$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 18:
                    if (continuation instanceof RealMerchantRepository$getAll$$inlined$getEntities$1$2$1) {
                        realMerchantRepository$getAll$$inlined$getEntities$1$2$1 = (RealMerchantRepository$getAll$$inlined$getEntities$1$2$1) continuation;
                        int i30 = realMerchantRepository$getAll$$inlined$getEntities$1$2$1.label;
                        if ((i30 & PKIFailureInfo.systemUnavail) != 0) {
                            realMerchantRepository$getAll$$inlined$getEntities$1$2$1.label = i30 - PKIFailureInfo.systemUnavail;
                            Object obj17 = realMerchantRepository$getAll$$inlined$getEntities$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realMerchantRepository$getAll$$inlined$getEntities$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                FlowCollector flowCollector11 = (FlowCollector) obj3;
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj18 : (List) obj) {
                                    ((StripePaymentController$$ExternalSyntheticLambda1) obj2).invoke(obj18);
                                    if (Boolean.TRUE.booleanValue()) {
                                        arrayList7.add(obj18);
                                    }
                                }
                                realMerchantRepository$getAll$$inlined$getEntities$1$2$1.label = 1;
                                if (flowCollector11.emit(arrayList7, realMerchantRepository$getAll$$inlined$getEntities$1$2$1) == coroutineSingletons11) {
                                    return coroutineSingletons11;
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj17);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realMerchantRepository$getAll$$inlined$getEntities$1$2$1 = new RealMerchantRepository$getAll$$inlined$getEntities$1$2$1(this, continuation);
                    Object obj172 = realMerchantRepository$getAll$$inlined$getEntities$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realMerchantRepository$getAll$$inlined$getEntities$1$2$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof RealSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1) {
                        realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1 = (RealSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1) continuation;
                        int i31 = realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label;
                        if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                            realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label = i31 - PKIFailureInfo.systemUnavail;
                            Object obj19 = realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                FlowCollector flowCollector12 = (FlowCollector) obj3;
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj20 : (List) obj) {
                                    if (((Boolean) ((StateBindingsKt$$ExternalSyntheticLambda0) obj2).invoke(obj20)).booleanValue()) {
                                        arrayList8.add(obj20);
                                    }
                                }
                                realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label = 1;
                                if (flowCollector12.emit(arrayList8, realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1) == coroutineSingletons12) {
                                    return coroutineSingletons12;
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj19);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1 = new RealSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1(this, continuation);
                    Object obj192 = realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realSettingRepository$getAllByMerchantId$$inlined$getEntities$1$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof LifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1) {
                        lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1 = (LifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i32 = lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj21 = lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                FlowCollector flowCollector13 = (FlowCollector) obj3;
                                Boolean valueOf = Boolean.valueOf(((Lifecycle.State) obj).compareTo((Lifecycle.State) obj2) >= 0);
                                lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector13.emit(valueOf, lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons13) {
                                    return coroutineSingletons13;
                                }
                            } else {
                                if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj21);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1 = new LifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = lifecycleKt$LifecycleLaunchedEffect$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    WorkflowAction workflowAction = (WorkflowAction) ((TraceParser$parse$1) obj2).invoke(obj);
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                    cancellableContinuationImpl.initCancellability();
                    ((Sink) obj3).send(new Workflows__WorkflowActionKt$action$2(i19, workflowAction, cancellableContinuationImpl));
                    Object result = cancellableContinuationImpl.getResult();
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (result != coroutineSingletons14) {
                        result = Unit.INSTANCE;
                    }
                    return result == coroutineSingletons14 ? result : Unit.INSTANCE;
                case 22:
                    WorkflowLayout workflowLayout = (WorkflowLayout) obj3;
                    obj.getClass();
                    WorkflowViewStub workflowViewStub = workflowLayout.showing;
                    workflowViewStub.update(obj, (ViewEnvironment) obj2);
                    SparseArray<Parcelable> sparseArray = workflowLayout.restoredChildState;
                    if (sparseArray != null) {
                        workflowLayout.restoredChildState = null;
                        workflowViewStub.actual.restoreHierarchyState(sparseArray);
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (continuation instanceof BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1) {
                        bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1 = (BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1) continuation;
                        int i33 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1.label = i33 - PKIFailureInfo.systemUnavail;
                            BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1;
                            Object obj22 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj22);
                                flowCollector = (FlowCollector) obj3;
                                list2 = (List) obj;
                                try {
                                    ModalBottomSheetState modalBottomSheetState = ((BottomSheetNavigator) obj2).sheetState;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2 = list2;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3 = flowCollector;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0 = 0;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label = 1;
                                    if (modalBottomSheetState.hide(bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12) != coroutineSingletons15) {
                                        flowCollector2 = flowCollector;
                                    }
                                } catch (CancellationException unused) {
                                    flowCollector2 = flowCollector;
                                    Object lastOrNull2 = CollectionsKt.lastOrNull(list2);
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2 = null;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3 = null;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0 = i18;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label = 3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    lastOrNull = CollectionsKt.lastOrNull(list2);
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2 = null;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3 = null;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$4 = th;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0 = i18;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label = 4;
                                    if (flowCollector.emit(lastOrNull, bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12) != coroutineSingletons15) {
                                        throw th;
                                    }
                                    return coroutineSingletons15;
                                }
                                return coroutineSingletons15;
                            }
                            if (i13 != 1) {
                                if (i13 == 2 || i13 == 3) {
                                    List list5 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2;
                                    SafeTrace.throwOnFailure(obj22);
                                    return Unit.INSTANCE;
                                }
                                if (i13 != 4) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Throwable th3 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$4;
                                List list6 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2;
                                SafeTrace.throwOnFailure(obj22);
                                throw th3;
                            }
                            i18 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0;
                            flowCollector2 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3;
                            list2 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2;
                            try {
                                SafeTrace.throwOnFailure(obj22);
                            } catch (CancellationException unused2) {
                                Object lastOrNull22 = CollectionsKt.lastOrNull(list2);
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2 = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3 = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0 = i18;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label = 3;
                                break;
                            } catch (Throwable th4) {
                                flowCollector = flowCollector2;
                                th = th4;
                                lastOrNull = CollectionsKt.lastOrNull(list2);
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2 = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3 = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$4 = th;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0 = i18;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label = 4;
                                if (flowCollector.emit(lastOrNull, bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12) != coroutineSingletons15) {
                                }
                                return coroutineSingletons15;
                            }
                            Object lastOrNull3 = CollectionsKt.lastOrNull(list2);
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$2 = null;
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.L$3 = null;
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.I$0 = i18;
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$12.label = 2;
                            break;
                        }
                    }
                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1 = new BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1(this, continuation);
                    BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1;
                    Object obj222 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122.label;
                    if (i13 != 0) {
                    }
                    Object lastOrNull32 = CollectionsKt.lastOrNull(list2);
                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122.L$2 = null;
                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122.L$3 = null;
                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122.I$0 = i18;
                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$122.label = 2;
                case 24:
                    Async async = (Async) obj;
                    if (async instanceof Async.Success) {
                        Object invoke = ((Function2) obj3).invoke(((Async.Success) async).value, continuation);
                        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.INSTANCE;
                    }
                    if (async instanceof Async.Fail) {
                        Object invoke2 = ((Function2) obj2).invoke(((Async.Fail) async).error, continuation);
                        return invoke2 == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke2 : Unit.INSTANCE;
                    }
                    if ((async instanceof Async.Loading) || Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE)) {
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                case 25:
                    if (continuation instanceof FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1) {
                        financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1 = (FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i34 = financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj23 = financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                Object obj24 = ((KProperty1) obj2).get(obj);
                                financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (((FlowCollector) obj3).emit(obj24, financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons16) {
                                    return coroutineSingletons16;
                                }
                            } else {
                                if (i14 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj23);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1 = new FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj232 = financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = financialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                    return Unit.INSTANCE;
                case 26:
                    Task task = (Task) obj;
                    if (task != null) {
                        ((ActivityResultLauncher) obj3).launch(task);
                        int i35 = GooglePayLauncherActivity.$r8$clinit;
                        GooglePayLauncherViewModel viewModel = ((GooglePayLauncherActivity) obj2).getViewModel();
                        viewModel.savedStateHandle.set(Boolean.TRUE, "has_launched");
                        viewModel._googlePayLaunchTask.tryEmit(null);
                    }
                    return Unit.INSTANCE;
                case 27:
                    SdkFilesManager sdkFilesManager = ((DocumentCameraWorker) obj2).sdkFilesManager;
                    if (continuation instanceof DocumentCameraWorker$run$$inlined$map$1$2$1) {
                        documentCameraWorker$run$$inlined$map$1$2$1 = (DocumentCameraWorker$run$$inlined$map$1$2$1) continuation;
                        int i36 = documentCameraWorker$run$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            documentCameraWorker$run$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj25 = documentCameraWorker$run$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = documentCameraWorker$run$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                FlowCollector flowCollector14 = (FlowCollector) obj3;
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                Object obj26 = DocumentCameraWorker.Output.Cancel.INSTANCE;
                                if (booleanValue) {
                                    File file = sdkFilesManager.sessionDir;
                                    SdkFilesManager.ensureFolder(file);
                                    File file2 = new File(file, "document_camera_photo.jpg");
                                    File newRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
                                    if (file2.renameTo(newRandomSessionFile)) {
                                        String absolutePath = newRandomSessionFile.getAbsolutePath();
                                        absolutePath.getClass();
                                        obj26 = new DocumentCameraWorker.Output.Success(absolutePath);
                                    }
                                }
                                documentCameraWorker$run$$inlined$map$1$2$1.label = 1;
                                if (flowCollector14.emit(obj26, documentCameraWorker$run$$inlined$map$1$2$1) == coroutineSingletons17) {
                                    return coroutineSingletons17;
                                }
                            } else {
                                if (i15 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj25);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    documentCameraWorker$run$$inlined$map$1$2$1 = new DocumentCameraWorker$run$$inlined$map$1$2$1(this, continuation);
                    Object obj252 = documentCameraWorker$run$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = documentCameraWorker$run$$inlined$map$1$2$1.label;
                    if (i15 != 0) {
                    }
                    return Unit.INSTANCE;
                case 28:
                    Object access$handleDocumentResult = DocumentsSelectWorker.access$handleDocumentResult((DocumentsSelectWorker) obj3, (FlowCollector) obj2, (List) obj, continuation);
                    return access$handleDocumentResult == CoroutineSingletons.COROUTINE_SUSPENDED ? access$handleDocumentResult : Unit.INSTANCE;
                default:
                    DocumentWorkflow.Output output = (DocumentWorkflow.Output) obj;
                    DocumentStepFragment documentStepFragment = (DocumentStepFragment) obj3;
                    if (output == null) {
                        return Unit.INSTANCE;
                    }
                    if (documentStepFragment.currentOutputHandler != null) {
                        ((StateFlowImpl) ((DocumentStepStateManager) obj2).prev).setValue(null);
                        HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1 = documentStepFragment.currentOutputHandler;
                        if (hCaptcha$$ExternalSyntheticLambda1 != null) {
                            hCaptcha$$ExternalSyntheticLambda1.invoke(output);
                        }
                    }
                    return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, Object obj, State state, int i) {
            this.$r8$classId = i;
            this.$gate = obj;
            this.$collector = state;
        }

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.$collector = obj2;
            this.$gate = obj;
        }

        public AnonymousClass1(FlowCollector flowCollector, AtomicBoolean atomicBoolean) {
            this.$r8$classId = 6;
            this.$collector = flowCollector;
            this.$gate = atomicBoolean;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (com.squareup.cash.wallet.views.UtilsKt.access$peekFirstTag(r0, r1) != r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r10, r3, r1) == r2) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(boolean z, Continuation continuation) {
            WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1 walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1;
            int i;
            DefaultPagerState defaultPagerState = (DefaultPagerState) this.$gate;
            if (continuation instanceof WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1) {
                walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1 = (WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1) continuation;
                int i2 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label;
                    Continuation continuation2 = null;
                    int i3 = 1;
                    int i4 = 2;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$3$1$$ExternalSyntheticLambda0(defaultPagerState, i3));
                        SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$1 = new SessionWorkerKt$runSession$snapshotMonitor$1(i4, continuation2, 9);
                        walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.Z$0 = z;
                        walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            ((Function1) this.$collector).invoke(WalletHomeViewEvent.NewTagPeekConsumed.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        z = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.Z$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.Z$0 = z;
                    walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label = 2;
                }
            }
            walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1 = new WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1(this, continuation);
            Object obj2 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label;
            Continuation continuation22 = null;
            int i32 = 1;
            int i42 = 2;
            if (i != 0) {
            }
            walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.Z$0 = z;
            walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeUntil$collectSafely$2(RealShiftDataLoader realShiftDataLoader, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.$collector = realShiftDataLoader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TakeUntil$collectSafely$2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = obj;
        this.L$0 = obj2;
        this.this$0 = obj3;
        this.$collector = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TakeUntil$collectSafely$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = obj;
        this.this$0 = obj2;
        this.$collector = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TakeUntil$collectSafely$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$collector = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TakeUntil$collectSafely$2(Flow flow, Continuation continuation, Object obj, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$2 = flow;
        this.this$0 = obj;
        this.$collector = state;
    }
}
