package com.squareup.workflow1;

import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.EditText;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.glance.session.SessionWorker$doWork$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser$parse$1;
import com.datadog.android.trace.model.SpanEvent;
import com.datadog.trace.core.util.JsonObjectUtils;
import com.google.android.gms.common.zzz;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.squareup.cash.R;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.work.data.api.TaxFormData;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository$getById$1;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository$getMembership$1;
import com.squareup.cash.work.viewmodels.TaxFormItemViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.webview.presenters.OtkRedirectUseCase;
import com.squareup.cash.work.webview.presenters.OtkRedirectUseCaseState;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewEvent;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.util.coroutines.UNDEFINED;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.WorkflowLayout;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.PaymentRelayStarter$Args;
import com.stripe.android.PaymentRelayStarter$Legacy;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepositoryKt;
import com.stripe.android.core.frauddetection.FraudDetectionDataRequest;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.utils.HostedAuthUrlBuilder;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.json.JSONObject;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class WorkerWorkflow$render$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $context;
    public final /* synthetic */ int $r8$classId;
    public Object $renderProps;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWorkflow$render$1(StripePaymentController stripePaymentController, ActivityHost activityHost, Throwable th, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 20;
        this.$renderProps = stripePaymentController;
        this.this$0 = activityHost;
        this.$context = th;
        this.label = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$context;
        switch (i) {
            case 0:
                return new WorkerWorkflow$render$1((Worker) this.$renderProps, (WorkerWorkflow) this.this$0, (StatefulWorkflow.RenderContext) obj2, continuation, 0);
            case 1:
                WorkerWorkflow$render$1 workerWorkflow$render$1 = new WorkerWorkflow$render$1((Flow) this.this$0, continuation, (WorkHomePresenter) obj2, 1);
                workerWorkflow$render$1.$renderProps = obj;
                return workerWorkflow$render$1;
            case 2:
                return new WorkerWorkflow$render$1((WorkHomePresenter) this.$renderProps, (MutableState) this.this$0, (MutableState) obj2, continuation, 2);
            case 3:
                return new WorkerWorkflow$render$1((Function1) this.$renderProps, (String) this.this$0, (Function0) obj2, continuation, 3);
            case 4:
                WorkerWorkflow$render$1 workerWorkflow$render$12 = new WorkerWorkflow$render$1((Flow) this.this$0, continuation, (WorkHomePresenter) obj2, 4);
                workerWorkflow$render$12.$renderProps = obj;
                return workerWorkflow$render$12;
            case 5:
                WorkerWorkflow$render$1 workerWorkflow$render$13 = new WorkerWorkflow$render$1((Flow) this.this$0, continuation, (AddAliasPresenter) obj2, 5);
                workerWorkflow$render$13.$renderProps = obj;
                return workerWorkflow$render$13;
            case 6:
                WorkerWorkflow$render$1 workerWorkflow$render$14 = new WorkerWorkflow$render$1((Function1) obj2, continuation, 6);
                workerWorkflow$render$14.this$0 = obj;
                return workerWorkflow$render$14;
            case 7:
                WorkerWorkflow$render$1 workerWorkflow$render$15 = new WorkerWorkflow$render$1((SessionWorker$doWork$2$1) obj2, continuation, 7);
                workerWorkflow$render$15.this$0 = obj;
                return workerWorkflow$render$15;
            case 8:
                WorkerWorkflow$render$1 workerWorkflow$render$16 = new WorkerWorkflow$render$1((RealLocationRepository$getById$1) obj2, continuation, 8);
                workerWorkflow$render$16.this$0 = obj;
                return workerWorkflow$render$16;
            case 9:
                WorkerWorkflow$render$1 workerWorkflow$render$17 = new WorkerWorkflow$render$1((RealMembershipRepository$getMembership$1) obj2, continuation, 9);
                workerWorkflow$render$17.this$0 = obj;
                return workerWorkflow$render$17;
            case 10:
                WorkerWorkflow$render$1 workerWorkflow$render$18 = new WorkerWorkflow$render$1((SessionWorker$doWork$2$1) obj2, continuation, 10);
                workerWorkflow$render$18.this$0 = obj;
                return workerWorkflow$render$18;
            case 11:
                WorkerWorkflow$render$1 workerWorkflow$render$19 = new WorkerWorkflow$render$1((SessionWorker$doWork$2$1) obj2, continuation, 11);
                workerWorkflow$render$19.this$0 = obj;
                return workerWorkflow$render$19;
            case 12:
                return new WorkerWorkflow$render$1((Long) this.$renderProps, (Function0) this.this$0, (MutableState) obj2, continuation, 12);
            case 13:
                return new WorkerWorkflow$render$1((WorkHomePresenter) this.$renderProps, (MutableState) this.this$0, (MutableState) obj2, continuation, 13);
            case 14:
                return new WorkerWorkflow$render$1((Function1) this.$renderProps, (MutableState) this.this$0, (MutableState) obj2, continuation, 14);
            case 15:
                return new WorkerWorkflow$render$1((RealIntentFactory) this.$renderProps, (String) this.this$0, (Ref$ObjectRef) obj2, continuation, 15);
            case 16:
                WorkerWorkflow$render$1 workerWorkflow$render$110 = new WorkerWorkflow$render$1((SafeFlow) this.this$0, (Function2) obj2, continuation, 16);
                workerWorkflow$render$110.$renderProps = obj;
                return workerWorkflow$render$110;
            case 17:
                return new WorkerWorkflow$render$1((Worker) this.$renderProps, (Sink) this.this$0, (String) obj2, continuation, 17);
            case 18:
                WorkerWorkflow$render$1 workerWorkflow$render$111 = new WorkerWorkflow$render$1((TextControllerImpl) this.this$0, (EditText) obj2, continuation, 18);
                workerWorkflow$render$111.$renderProps = obj;
                return workerWorkflow$render$111;
            case 19:
                return new WorkerWorkflow$render$1((ReadonlyStateFlow) this.$renderProps, (WorkflowLayout) this.this$0, (ViewEnvironment) obj2, continuation, 19);
            case 20:
                return new WorkerWorkflow$render$1((StripePaymentController) this.$renderProps, (ActivityHost) this.this$0, (Throwable) obj2, this.label, continuation);
            case 21:
                WorkerWorkflow$render$1 workerWorkflow$render$112 = new WorkerWorkflow$render$1((DefaultFraudDetectionDataRepository) obj2, continuation, 21);
                workerWorkflow$render$112.this$0 = obj;
                return workerWorkflow$render$112;
            case 22:
                WorkerWorkflow$render$1 workerWorkflow$render$113 = new WorkerWorkflow$render$1((DefaultAnalyticsRequestExecutor) this.this$0, (AnalyticsRequest) obj2, continuation, 22);
                workerWorkflow$render$113.$renderProps = obj;
                return workerWorkflow$render$113;
            case 23:
                WorkerWorkflow$render$1 workerWorkflow$render$114 = new WorkerWorkflow$render$1((FinancialConnectionsSheetViewModel) this.this$0, (FinancialConnectionsSheetActivityResult) obj2, continuation, 23);
                workerWorkflow$render$114.$renderProps = obj;
                return workerWorkflow$render$114;
            case 24:
                WorkerWorkflow$render$1 workerWorkflow$render$115 = new WorkerWorkflow$render$1((FinancialConnectionsSheetViewModel) this.this$0, (ElementsSessionContext.PrefillDetails) obj2, continuation, 24);
                workerWorkflow$render$115.$renderProps = obj;
                return workerWorkflow$render$115;
            case 25:
                WorkerWorkflow$render$1 workerWorkflow$render$116 = new WorkerWorkflow$render$1((SaveAccountToLink) this.this$0, (String) obj2, continuation, 25);
                workerWorkflow$render$116.$renderProps = obj;
                return workerWorkflow$render$116;
            case 26:
                return new WorkerWorkflow$render$1((String) this.this$0, (FinancialConnectionsLiteViewModel) obj2, continuation, 26);
            case 27:
                WorkerWorkflow$render$1 workerWorkflow$render$117 = new WorkerWorkflow$render$1((Flow) this.this$0, continuation, (BottomSheetNavigator) obj2, 27);
                workerWorkflow$render$117.$renderProps = obj;
                return workerWorkflow$render$117;
            case 28:
                return new WorkerWorkflow$render$1((FinancialConnectionsSheetNativeViewModel) obj2, continuation, 28);
            default:
                WorkerWorkflow$render$1 workerWorkflow$render$118 = new WorkerWorkflow$render$1((DefaultGooglePayRepository) obj2, continuation, 29);
                workerWorkflow$render$118.this$0 = obj;
                return workerWorkflow$render$118;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 19:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((WorkerWorkflow$render$1) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((WorkerWorkflow$render$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((WorkerWorkflow$render$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r2 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x037d, code lost:
    
        if (r0 == r2) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06f7, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x06ea, code lost:
    
        if (r2 == r1) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x073a, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x072d, code lost:
    
        if (r2 == r1) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x077d, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0770, code lost:
    
        if (r2 == r1) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x07c0, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x07b3, code lost:
    
        if (r2 == r1) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0803, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x07f6, code lost:
    
        if (r2 == r1) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0846, code lost:
    
        if (r0.emit(r2, r15) == r1) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0839, code lost:
    
        if (r2 == r1) goto L395;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03bd A[Catch: all -> 0x035b, TryCatch #4 {all -> 0x035b, blocks: (B:181:0x0355, B:183:0x03b3, B:187:0x03bd, B:188:0x03c9), top: B:180:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object access$fetchTaxForms;
        Object error;
        Object invoke;
        Object invoke2;
        Object invoke3;
        Object invoke4;
        Object invoke5;
        Object invoke6;
        Object refreshCookie$suspendImpl;
        Object withContext;
        DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository;
        Object executeRequest;
        FraudDetectionData fraudDetectionData;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        StripeResponse stripeResponse;
        Object failure2;
        Object executeRequest2;
        Object failure3;
        DefaultFinancialConnectionsEventReporter.Event event;
        Object invoke$default;
        Object failure4;
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        Object invoke$default2;
        Object m2000fromUriIoAF18A;
        Object obj2;
        Throwable m4120exceptionOrNullimpl2;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
        MutexImpl mutexImpl;
        Object value2;
        Object access$isReadyAsync;
        int i = this.$r8$classId;
        int i2 = 10;
        int i3 = 2;
        Object obj3 = this.$context;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Worker worker = (Worker) this.$renderProps;
                    String str2 = ((WorkerWorkflow) this.this$0).key;
                    Sink actionSink = ((StatefulWorkflow.RenderContext) obj3).$$delegate_0.getActionSink();
                    this.label = 1;
                    String obj5 = worker.toString();
                    if (!StringsKt.isBlank(str2)) {
                        obj5 = obj5 + ':' + str2;
                    }
                    Object withContext2 = JobKt.withContext(new CoroutineName(obj5), new WorkerWorkflow$render$1(worker, actionSink, str2, (Continuation) null, 17), this);
                    Object obj6 = withContext2;
                    if (withContext2 != obj4) {
                        obj6 = Unit.INSTANCE;
                    }
                    if (obj6 == obj4) {
                        return obj4;
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
                CoroutineScope coroutineScope = (CoroutineScope) this.$renderProps;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope, (WorkHomePresenter) obj3, 9);
                    this.$renderProps = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                MutableState mutableState = (MutableState) obj3;
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.$renderProps;
                AndroidStringManager androidStringManager = (AndroidStringManager) workHomePresenter.shiftSection2Presenter;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantIdentifier merchantIdentifier = (MerchantIdentifier) ((MutableState) this.this$0).getValue();
                    if (merchantIdentifier == null || (str = merchantIdentifier.token) == null) {
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(TaxFormsListViewModel.Loading.INSTANCE);
                    this.label = 1;
                    access$fetchTaxForms = WorkHomePresenter.access$fetchTaxForms(workHomePresenter, str, this);
                    if (access$fetchTaxForms == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$fetchTaxForms = obj;
                }
                List list = (List) access$fetchTaxForms;
                if (list == null) {
                    error = new TaxFormsListViewModel.Error(androidStringManager.get(R.string.work_tax_forms_error_message));
                } else if (list.isEmpty()) {
                    error = new TaxFormsListViewModel.Empty(androidStringManager.get(R.string.work_tax_forms_empty_title), androidStringManager.get(R.string.work_tax_forms_empty_message));
                } else {
                    List<TaxFormData> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (TaxFormData taxFormData : list2) {
                        String str3 = taxFormData.id;
                        String str4 = taxFormData.displayTitle;
                        if (str4 == null) {
                            str4 = androidStringManager.get(R.string.work_tax_forms_default_title);
                        }
                        arrayList.add(new TaxFormItemViewModel(str3, str4, taxFormData.downloadUrl));
                    }
                    error = new TaxFormsListViewModel.Loaded(arrayList);
                }
                mutableState.setValue(error);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                try {
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Function1 function1 = (Function1) this.$renderProps;
                        this.label = 1;
                        if (function1.invoke(this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Timber.Forest.w((String) this.this$0, new Object[0], e2);
                    ((Function0) obj3).invoke();
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$renderProps;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass12 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope2, (WorkHomePresenter) obj3, i2);
                    this.$renderProps = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass12, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$renderProps;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass13 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope3, (AddAliasPresenter) obj3, 11);
                    this.$renderProps = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass13, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
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
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector;
                    this.label = 1;
                    invoke = ((Function1) obj3).invoke(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
            case 7:
                FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector2;
                    this.label = 1;
                    invoke2 = ((SessionWorker$doWork$2$1) obj3).invoke(this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector2 = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    invoke2 = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
            case 8:
                FlowCollector flowCollector3 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector3;
                    this.label = 1;
                    invoke3 = ((RealLocationRepository$getById$1) obj3).invoke(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector3 = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    invoke3 = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
            case 9:
                FlowCollector flowCollector4 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector4;
                    this.label = 1;
                    invoke4 = ((RealMembershipRepository$getMembership$1) obj3).invoke(this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector4 = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    invoke4 = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
            case 10:
                FlowCollector flowCollector5 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector5;
                    this.label = 1;
                    invoke5 = ((SessionWorker$doWork$2$1) obj3).invoke(this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector5 = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    invoke5 = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
            case 11:
                FlowCollector flowCollector6 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector6;
                    this.label = 1;
                    invoke6 = ((SessionWorker$doWork$2$1) obj3).invoke(this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector6 = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    invoke6 = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
            case 12:
                MutableState mutableState2 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    long longValue = ((Long) this.$renderProps).longValue() - ((Number) ((Function0) this.this$0).invoke()).longValue();
                    if (longValue > 0) {
                        this.label = 1;
                        if (JobKt.delay(longValue, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState2.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState3 = (MutableState) obj3;
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) this.$renderProps;
                WorkWebScreen workWebScreen = (WorkWebScreen) workHomePresenter2.shiftsAnalytics;
                MutableState mutableState4 = (MutableState) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((WorkWebViewModel) mutableState4.getValue()) instanceof WorkWebViewModel.OtkInitializing) {
                        OtkRedirectUseCase otkRedirectUseCase = (OtkRedirectUseCase) workHomePresenter2.payPresenter;
                        String str5 = workWebScreen.merchantToken;
                        boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                        this.label = 1;
                        refreshCookie$suspendImpl = OtkRedirectUseCase.refreshCookie$suspendImpl(otkRedirectUseCase, str5, booleanValue, this);
                        if (refreshCookie$suspendImpl == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                refreshCookie$suspendImpl = obj;
                OtkRedirectUseCaseState otkRedirectUseCaseState = (OtkRedirectUseCaseState) refreshCookie$suspendImpl;
                if (!Intrinsics.areEqual(otkRedirectUseCaseState, OtkRedirectUseCaseState.Ready.INSTANCE) && !Intrinsics.areEqual(otkRedirectUseCaseState, OtkRedirectUseCaseState.Failed.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                mutableState4.setValue(WorkHomePresenter.validateAndLoadUrl(workWebScreen.url));
                mutableState3.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(30000L, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) ((MutableState) this.this$0).getValue()).booleanValue() && !((Boolean) ((MutableState) obj3).getValue()).booleanValue()) {
                    ((Function1) this.$renderProps).invoke(new WorkWebViewEvent.PageError(true));
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 != 0) {
                    if (i19 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                Luhn$$ExternalSyntheticLambda0 luhn$$ExternalSyntheticLambda0 = new Luhn$$ExternalSyntheticLambda0(8);
                WorkflowLayout$start$1 workflowLayout$start$1 = new WorkflowLayout$start$1((RealIntentFactory) this.$renderProps, (String) this.this$0, (Ref$ObjectRef) obj3, null, 23);
                this.label = 1;
                Object m3995withTimeoutOrThrowrnQQ1Ag = StateFlowKt.m3995withTimeoutOrThrowrnQQ1Ag(duration, luhn$$ExternalSyntheticLambda0, workflowLayout$start$1, this);
                return m3995withTimeoutOrThrowrnQQ1Ag == coroutineSingletons15 ? coroutineSingletons15 : m3995withTimeoutOrThrowrnQQ1Ag;
            case 16:
                FlowCollector flowCollector7 = (FlowCollector) this.$renderProps;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    m.element = UNDEFINED.INSTANCE;
                    SafeFlow safeFlow = (SafeFlow) this.this$0;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass14 = new BufferCountKt$bufferSkip$1.AnonymousClass1(m, flowCollector7, (Function2) obj3);
                    this.$renderProps = null;
                    this.label = 1;
                    if (safeFlow.collect(anonymousClass14, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                Worker worker2 = (Worker) this.$renderProps;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow work = worker2.getWork();
                    if (work == null) {
                        throw new NullPointerException("Worker " + worker2 + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
                    }
                    Sink sink = (Sink) this.this$0;
                    TraceParser$parse$1 traceParser$parse$1 = new TraceParser$parse$1(13, worker2, (String) obj3);
                    this.label = 1;
                    Object collect = work.collect(new TakeUntil$collectSafely$2.AnonymousClass1(21, sink, traceParser$parse$1), this);
                    if (collect != coroutineSingletons17) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                EditText editText = (EditText) obj3;
                TextControllerImpl textControllerImpl = (TextControllerImpl) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 != 0) {
                    if (i22 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FlowKt.launchIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(textControllerImpl.onTextChanged, new WorkflowNode$tick$1$1((Object) editText, (Continuation) (z ? 1 : 0), 27), 3), (CoroutineScope) this.$renderProps);
                InterceptedRenderContext$send$1 interceptedRenderContext$send$1 = new InterceptedRenderContext$send$1(textControllerImpl, 5);
                this.label = 1;
                zzna.access$listenForTextChangesUntilCancelled(editText, interceptedRenderContext$send$1, this);
                return coroutineSingletons18;
            case 19:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow readonlyStateFlow = (ReadonlyStateFlow) this.$renderProps;
                    TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass15 = new TakeUntil$collectSafely$2.AnonymousClass1(22, (WorkflowLayout) this.this$0, (ViewEnvironment) obj3);
                    this.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(anonymousClass15, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaymentRelayStarter$Legacy paymentRelayStarter$Legacy = (PaymentRelayStarter$Legacy) ((StripePaymentController) this.$renderProps).paymentRelayStarterFactory.invoke((ActivityHost) this.this$0);
                int i24 = StripeException.$r8$clinit;
                paymentRelayStarter$Legacy.start(new PaymentRelayStarter$Args.ErrorArgs(SpanEvent.Account.create((Throwable) obj3), this.label));
                return Unit.INSTANCE;
            case 21:
                DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository2 = (DefaultFraudDetectionDataRepository) obj3;
                AndroidFileSaver androidFileSaver = defaultFraudDetectionDataRepository2.localStore;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = coroutineScope4;
                    this.label = 1;
                    withContext = JobKt.withContext(androidFileSaver.ioContext, new WorkflowNode$tick$1$1((Object) androidFileSaver, (Continuation) (z2 ? 1 : 0), 28), this);
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defaultFraudDetectionDataRepository = (DefaultFraudDetectionDataRepository) this.$renderProps;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            executeRequest = obj;
                            stripeResponse = (StripeResponse) executeRequest;
                            if (stripeResponse.isOk) {
                                stripeResponse = null;
                            }
                            failure = stripeResponse == null ? FraudDetectionDataRepositoryKt.fraudDetectionJsonParser.mo4026parse(JsonUtilsKt.responseJson(stripeResponse)) : null;
                            Result.Companion companion2 = Result.Companion;
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion3 = Result.Companion;
                            failure = new Result.Failure(th);
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                            }
                            fraudDetectionData = (FraudDetectionData) (failure instanceof Result.Failure ? null : failure);
                            if (!Intrinsics.areEqual(defaultFraudDetectionDataRepository2.cachedFraudDetectionData, fraudDetectionData)) {
                            }
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            int i26 = StripeException.$r8$clinit;
                            defaultFraudDetectionDataRepository.errorReporter.reportFraudDetectionError(SpanEvent.Account.create(m4120exceptionOrNullimpl));
                        }
                        fraudDetectionData = (FraudDetectionData) (failure instanceof Result.Failure ? null : failure);
                        if (!Intrinsics.areEqual(defaultFraudDetectionDataRepository2.cachedFraudDetectionData, fraudDetectionData) && fraudDetectionData != null) {
                            defaultFraudDetectionDataRepository2.cachedFraudDetectionData = fraudDetectionData;
                            SharedPreferences.Editor edit = ((SharedPreferences) androidFileSaver.contentResolver$delegate.getValue()).edit();
                            JSONObject put = new JSONObject().put("guid", fraudDetectionData.guid).put("muid", fraudDetectionData.muid).put("sid", fraudDetectionData.sid).put("timestamp", fraudDetectionData.timestamp);
                            put.getClass();
                            edit.putString("key_fraud_detection_data", put.toString()).apply();
                            return fraudDetectionData;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                FraudDetectionData fraudDetectionData2 = (FraudDetectionData) withContext;
                if (fraudDetectionData2 == null || Calendar.getInstance().getTimeInMillis() - fraudDetectionData2.timestamp > 1800000) {
                    try {
                        Result.Companion companion4 = Result.Companion;
                        DefaultStripeNetworkClient defaultStripeNetworkClient = defaultFraudDetectionDataRepository2.stripeNetworkClient;
                        FraudDetectionDataRequest create = defaultFraudDetectionDataRepository2.fraudDetectionDataRequestFactory.create(fraudDetectionData2);
                        this.this$0 = null;
                        this.$renderProps = defaultFraudDetectionDataRepository2;
                        this.label = 2;
                        executeRequest = defaultStripeNetworkClient.executeRequest(create, this);
                    } catch (Throwable th2) {
                        th = th2;
                        defaultFraudDetectionDataRepository = defaultFraudDetectionDataRepository2;
                        Result.Companion companion32 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        fraudDetectionData = (FraudDetectionData) (failure instanceof Result.Failure ? null : failure);
                        if (!Intrinsics.areEqual(defaultFraudDetectionDataRepository2.cachedFraudDetectionData, fraudDetectionData)) {
                        }
                    }
                    if (executeRequest != coroutineSingletons21) {
                        defaultFraudDetectionDataRepository = defaultFraudDetectionDataRepository2;
                        stripeResponse = (StripeResponse) executeRequest;
                        if (stripeResponse.isOk) {
                        }
                        if (stripeResponse == null) {
                        }
                        Result.Companion companion22 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        fraudDetectionData = (FraudDetectionData) (failure instanceof Result.Failure ? null : failure);
                        return !Intrinsics.areEqual(defaultFraudDetectionDataRepository2.cachedFraudDetectionData, fraudDetectionData) ? fraudDetectionData : fraudDetectionData;
                    }
                    return coroutineSingletons21;
                }
                fraudDetectionData = fraudDetectionData2;
                if (!Intrinsics.areEqual(defaultFraudDetectionDataRepository2.cachedFraudDetectionData, fraudDetectionData)) {
                }
                break;
            case 22:
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (DefaultAnalyticsRequestExecutor) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                try {
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AnalyticsRequest analyticsRequest = (AnalyticsRequest) obj3;
                        Result.Companion companion5 = Result.Companion;
                        DefaultStripeNetworkClient defaultStripeNetworkClient2 = defaultAnalyticsRequestExecutor.stripeNetworkClient;
                        this.$renderProps = null;
                        this.label = 1;
                        executeRequest2 = defaultStripeNetworkClient2.executeRequest(analyticsRequest, this);
                        if (executeRequest2 == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        executeRequest2 = obj;
                    }
                    failure2 = (StripeResponse) executeRequest2;
                    Result.Companion companion6 = Result.Companion;
                } catch (Throwable th3) {
                    Result.Companion companion7 = Result.Companion;
                    failure2 = new Result.Failure(th3);
                }
                Throwable m4120exceptionOrNullimpl3 = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl3 != null) {
                    defaultAnalyticsRequestExecutor.logger.error("Exception while making analytics request", m4120exceptionOrNullimpl3);
                }
                return Unit.INSTANCE;
            case 23:
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                try {
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion8 = Result.Companion;
                        GetOrFetchSync getOrFetchSync = financialConnectionsSheetViewModel.getOrFetchSync;
                        this.$renderProps = null;
                        this.label = 1;
                        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                        if (invoke$default == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default = obj;
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default).manifest;
                    Result.Companion companion9 = Result.Companion;
                    failure3 = financialConnectionsSessionManifest;
                } catch (Throwable th4) {
                    Result.Companion companion10 = Result.Companion;
                    failure3 = new Result.Failure(th4);
                }
                FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) obj3;
                if (!(failure3 instanceof Result.Failure)) {
                    DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter = financialConnectionsSheetViewModel.eventReporter;
                    String str6 = ((FinancialConnectionsSessionManifest) failure3).id;
                    defaultFinancialConnectionsEventReporter.getClass();
                    str6.getClass();
                    if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
                        event = new DefaultFinancialConnectionsEventReporter.Event(DefaultFinancialConnectionsEventReporter.Event.Code.SheetClosed, MapsKt__MapsKt.mapOf(new Pair("las_id", str6), new Pair("session_result", "completed")));
                    } else if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
                        event = new DefaultFinancialConnectionsEventReporter.Event(DefaultFinancialConnectionsEventReporter.Event.Code.SheetClosed, MapsKt__MapsKt.mapOf(new Pair("las_id", str6), new Pair("session_result", "cancelled")));
                    } else {
                        if (!(financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        event = new DefaultFinancialConnectionsEventReporter.Event(DefaultFinancialConnectionsEventReporter.Event.Code.SheetFailed, MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(new Pair("las_id", str6), new Pair("session_result", "failure")), MooncakeHeaderViewKt.filterNotNullValues(JsonObjectUtils.toEventParams(null, ((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).error))));
                    }
                    JobKt.launch$default(JobKt.CoroutineScope(defaultFinancialConnectionsEventReporter.workContext), null, null, new InquiryViewModel.AnonymousClass1(defaultFinancialConnectionsEventReporter, event, z3 ? 1 : 0, i3), 3);
                }
                return Unit.INSTANCE;
            case 24:
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = (FinancialConnectionsSheetViewModel) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                try {
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion11 = Result.Companion;
                        GetOrFetchSync getOrFetchSync2 = financialConnectionsSheetViewModel2.getOrFetchSync;
                        this.$renderProps = null;
                        this.label = 1;
                        invoke$default2 = GetOrFetchSync.invoke$default(getOrFetchSync2, null, this, 3);
                        if (invoke$default2 == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default2 = obj;
                    }
                    failure4 = (SynchronizeSessionResponse) invoke$default2;
                    Result.Companion companion12 = Result.Companion;
                } catch (Throwable th5) {
                    Result.Companion companion13 = Result.Companion;
                    failure4 = new Result.Failure(th5);
                }
                ElementsSessionContext.PrefillDetails prefillDetails = (ElementsSessionContext.PrefillDetails) obj3;
                if (!(failure4 instanceof Result.Failure)) {
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = ((SynchronizeSessionResponse) failure4).manifest;
                    String create2 = HostedAuthUrlBuilder.create(financialConnectionsSheetViewModel2.initialState.initialArgs, financialConnectionsSessionManifest2.hostedAuthUrl, prefillDetails);
                    if (create2 != null) {
                        StateFlowImpl stateFlowImpl = financialConnectionsSheetViewModel2._stateFlow;
                        do {
                            value = stateFlowImpl.getValue();
                            financialConnectionsSheetState = (FinancialConnectionsSheetState) value;
                            financialConnectionsSheetState.getClass();
                        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, false, financialConnectionsSessionManifest2, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl(create2), 3)));
                    } else {
                        FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel2, new FinancialConnectionsSheetActivityResult.Failed(new IllegalArgumentException("hostedAuthUrl is required to switch to web flow!")), 6);
                    }
                }
                Throwable m4120exceptionOrNullimpl4 = Result.m4120exceptionOrNullimpl(failure4);
                if (m4120exceptionOrNullimpl4 != null) {
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel2, new FinancialConnectionsSheetActivityResult.Failed(m4120exceptionOrNullimpl4), 6);
                }
                return Unit.INSTANCE;
            case 25:
                Set set = (Set) this.$renderProps;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SaveAccountToLink saveAccountToLink = (SaveAccountToLink) this.this$0;
                this.$renderProps = null;
                this.label = 1;
                Object postSaveAccountsToLink = saveAccountToLink.repository.postSaveAccountsToLink(saveAccountToLink.configuration.financialConnectionsSessionClientSecret, null, null, null, null, (String) obj3, set, this);
                return postSaveAccountsToLink == coroutineSingletons25 ? coroutineSingletons25 : postSaveAccountsToLink;
            case 26:
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) obj3;
                String str7 = (String) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    m2000fromUriIoAF18A = zzz.m2000fromUriIoAF18A(Uri.parse(str7));
                    Result.Companion companion14 = Result.Companion;
                    if (!(m2000fromUriIoAF18A instanceof Result.Failure)) {
                        SharedFlowImpl sharedFlowImpl = financialConnectionsLiteViewModel._viewEffects;
                        FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Completed((InstantDebitsResult) m2000fromUriIoAF18A, null, null));
                        this.$renderProps = m2000fromUriIoAF18A;
                        this.label = 1;
                        if (sharedFlowImpl.emit(finishWithResult, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                        obj2 = m2000fromUriIoAF18A;
                    }
                    m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(m2000fromUriIoAF18A);
                    if (m4120exceptionOrNullimpl2 != null) {
                        financialConnectionsLiteViewModel.handleError("Failed to parse instant debits result from url: ".concat(str7), m4120exceptionOrNullimpl2);
                    }
                    return Unit.INSTANCE;
                }
                if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.$renderProps;
                SafeTrace.throwOnFailure(obj);
                m2000fromUriIoAF18A = obj2;
                m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(m2000fromUriIoAF18A);
                if (m4120exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector8 = (FlowCollector) this.$renderProps;
                    Flow flow4 = (Flow) this.this$0;
                    TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass16 = new TakeUntil$collectSafely$2.AnonymousClass1(23, flowCollector8, (BottomSheetNavigator) obj3);
                    this.$renderProps = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass16, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2 = (FinancialConnectionsSheetNativeViewModel) obj3;
                    MutexImpl mutexImpl2 = financialConnectionsSheetNativeViewModel2.mutex;
                    this.$renderProps = mutexImpl2;
                    this.this$0 = financialConnectionsSheetNativeViewModel2;
                    this.label = 1;
                    if (mutexImpl2.lock(this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                    financialConnectionsSheetNativeViewModel = financialConnectionsSheetNativeViewModel2;
                    mutexImpl = mutexImpl2;
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.this$0;
                    mutexImpl = (MutexImpl) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                }
                try {
                    if (((FinancialConnectionsSheetNativeState) financialConnectionsSheetNativeViewModel.stateFlow.$$delegate_0.getValue()).webAuthFlow instanceof WebAuthFlowState.InProgress) {
                        StateFlowImpl stateFlowImpl2 = financialConnectionsSheetNativeViewModel._stateFlow;
                        do {
                            value2 = stateFlowImpl2.getValue();
                        } while (!stateFlowImpl2.compareAndSet(value2, FinancialConnectionsSheetNativeState.copy$default((FinancialConnectionsSheetNativeState) value2, new WebAuthFlowState.Canceled(null), null, null, 16381)));
                    }
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th6) {
                    mutexImpl.unlock(null);
                    throw th6;
                }
            default:
                FlowCollector flowCollector9 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.$renderProps = flowCollector9;
                    this.label = 1;
                    access$isReadyAsync = DefaultGooglePayRepository.access$isReadyAsync((DefaultGooglePayRepository) obj3, this);
                    break;
                } else {
                    if (i34 != 1) {
                        if (i34 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector9 = (FlowCollector) this.$renderProps;
                    SafeTrace.throwOnFailure(obj);
                    access$isReadyAsync = obj;
                }
                this.this$0 = null;
                this.$renderProps = null;
                this.label = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkerWorkflow$render$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$renderProps = obj;
        this.this$0 = obj2;
        this.$context = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkerWorkflow$render$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$context = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkerWorkflow$render$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$context = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkerWorkflow$render$1(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$context = obj;
    }
}
