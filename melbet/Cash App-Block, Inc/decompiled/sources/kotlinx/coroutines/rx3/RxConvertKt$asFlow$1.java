package kotlinx.coroutines.rx3;

import androidx.activity.ComponentActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.scannerview.SizeMap;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$1;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.workflows.TimerWorker;
import dev.chrisbanes.haze.HazeSourceNode;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import papa.Choreographers$$ExternalSyntheticLambda1;
import papa.SafeTrace;
import xyz.block.genie.GenieFetchSceneResponse;
import xyz.block.genie.GenieSession;
import xyz.block.genie.SessionHTTPPayload;

/* loaded from: classes9.dex */
public final class RxConvertKt$asFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_asFlow;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asFlow$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$this_asFlow = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_asFlow;
        switch (i) {
            case 0:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1((ObservableSource) obj2, continuation, 0);
                rxConvertKt$asFlow$1.L$0 = obj;
                return rxConvertKt$asFlow$1;
            case 1:
                return new RxConvertKt$asFlow$1((SupervisorJobImpl) this.L$0, (UiStepBottomSheet$$ExternalSyntheticLambda4) obj2, continuation, 1);
            case 2:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$12 = new RxConvertKt$asFlow$1((UiStepFileSelectWorker) obj2, continuation, 2);
                rxConvertKt$asFlow$12.L$0 = obj;
                return rxConvertKt$asFlow$12;
            case 3:
                return new RxConvertKt$asFlow$1((UiStepStateManager) this.L$0, (UiState) obj2, continuation, 3);
            case 4:
                return new RxConvertKt$asFlow$1((UiStepStateManager) this.L$0, (UiWorkflow.Screen.EntryScreen) obj2, continuation, 4);
            case 5:
                return new RxConvertKt$asFlow$1((UiStepStateManager) this.L$0, (UiStepFragment) obj2, continuation, 5);
            case 6:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$13 = new RxConvertKt$asFlow$1((TimerWorker) obj2, continuation, 6);
                rxConvertKt$asFlow$13.L$0 = obj;
                return rxConvertKt$asFlow$13;
            case 7:
                return new RxConvertKt$asFlow$1((ComponentActivity) this.L$0, (HazeSourceNode) obj2, continuation, 7);
            case 8:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$14 = new RxConvertKt$asFlow$1((ChannelFlowOperator) obj2, continuation, 8);
                rxConvertKt$asFlow$14.L$0 = obj;
                return rxConvertKt$asFlow$14;
            default:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$15 = new RxConvertKt$asFlow$1((GenieSession) obj2, continuation, 9);
                rxConvertKt$asFlow$15.L$0 = obj;
                return rxConvertKt$asFlow$15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RxConvertKt$asFlow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RxConvertKt$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RxConvertKt$asFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RxConvertKt$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RxConvertKt$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                ((RxConvertKt$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 6:
                return ((RxConvertKt$asFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                ((RxConvertKt$asFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 8:
                return ((RxConvertKt$asFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RxConvertKt$asFlow$1) create((byte[]) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x021f, code lost:
    
        if (com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker.access$handleResult(r4, r0, (java.util.List) r15, r14) == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0212, code lost:
    
        if (r15 == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ed, code lost:
    
        if (com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker.access$handleResult(r4, r0, r15, r14) == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0205, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r15, r1, r14) == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01de, code lost:
    
        if (r15 == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025c, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r15, r0, r14) == r14) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0248, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r14) == r14) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (r0.emit(r15, r14) == r14) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r6, r14) == r14) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        int i = this.$r8$classId;
        int i2 = 2;
        Object obj2 = this.$this_asFlow;
        Continuation continuation = null;
        switch (i) {
            case 0:
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AtomicReference atomicReference = new AtomicReference();
                    ((Observable) ((ObservableSource) obj2)).subscribe(new RealWebSocket$connect$1(11, producerScope, atomicReference));
                    Choreographers$$ExternalSyntheticLambda1 choreographers$$ExternalSyntheticLambda1 = new Choreographers$$ExternalSyntheticLambda1(atomicReference, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, choreographers$$ExternalSyntheticLambda1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ((SupervisorJobImpl) this.L$0).cancel(null);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                InputSelectBottomSheetController$runAfterKeyboardShown$1$1.AnonymousClass2 anonymousClass2 = new InputSelectBottomSheetController$runAfterKeyboardShown$1$1.AnonymousClass2((UiStepBottomSheet$$ExternalSyntheticLambda4) obj2, continuation, i2);
                this.label = 2;
                break;
            case 2:
                UiStepFileSelectWorker uiStepFileSelectWorker = (UiStepFileSelectWorker) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    HazeSourceNode$launchPreDraw$1 hazeSourceNode$launchPreDraw$1 = new HazeSourceNode$launchPreDraw$1(uiStepFileSelectWorker, continuation, 25);
                    this.L$0 = flowCollector;
                    this.label = 1;
                    obj = JobKt.withTimeoutOrNull(100L, hazeSourceNode$launchPreDraw$1, this);
                    break;
                } else if (i5 == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i5 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i5 == 3) {
                        flowCollector = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        UiStepFileSelectWorker$Factory$create$2 uiStepFileSelectWorker$Factory$create$2 = uiStepFileSelectWorker.collectResult;
                        this.L$0 = flowCollector;
                        this.label = 4;
                        obj = uiStepFileSelectWorker$Factory$create$2.invoke(this);
                        break;
                    } else if (i5 == 4) {
                        flowCollector = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 5;
                        break;
                    } else {
                        if (i5 == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                List list = (List) obj;
                if (list == null) {
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
                    UiStepFileSelectWorker$run$1$1 uiStepFileSelectWorker$run$1$1 = new UiStepFileSelectWorker$run$1$1(uiStepFileSelectWorker, continuation, 0);
                    this.L$0 = flowCollector;
                    this.label = 3;
                    break;
                } else {
                    this.L$0 = null;
                    this.label = 2;
                    break;
                }
                return coroutineSingletons3;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiStepStateManager uiStepStateManager = (UiStepStateManager) this.L$0;
                    this.label = 1;
                    if (UiStepStateManager.access$handleState(uiStepStateManager, (UiWorkflow.Input) ((StateFlowImpl) uiStepStateManager.firstChild).getValue(), (UiState) obj2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) ((UiStepStateManager) this.L$0).next;
                    this.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, (UiWorkflow.Screen.EntryScreen) obj2);
                    if (Unit.INSTANCE == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                UiStepStateManager uiStepStateManager2 = (UiStepStateManager) this.L$0;
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) uiStepStateManager2.prev;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass22 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(10, (UiStepFragment) obj2, uiStepStateManager2);
                this.label = 1;
                stateFlowImpl2.collect(anonymousClass22, this);
                return coroutineSingletons6;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector2 = (FlowCollector) this.L$0;
                    long j = ((TimerWorker) obj2).delayMs;
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector2 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 2;
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow currentStateFlow = ((ComponentActivity) this.L$0).getLifecycle().getCurrentStateFlow();
                    final HazeSourceNode hazeSourceNode = (HazeSourceNode) obj2;
                    FlowCollector flowCollector3 = new FlowCollector() { // from class: dev.chrisbanes.haze.HazeSourceNode_androidKt$clearHazeAreaLayerOnStop$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj3, Continuation continuation2) {
                            if (((Lifecycle.State) obj3).compareTo(Lifecycle.State.CREATED) <= 0) {
                                HazeSourceNode hazeSourceNode2 = HazeSourceNode.this;
                                HazeArea hazeArea = hazeSourceNode2.area;
                                hazeArea.getClass();
                                GraphicsLayer contentLayer = hazeArea.getContentLayer();
                                if (contentLayer != null) {
                                    ((GraphicsContext) DepthSortedSetKt.currentValueOf(hazeSourceNode2, CompositionLocalsKt.LocalGraphicsContext)).releaseGraphicsLayer(contentLayer);
                                }
                                hazeArea.contentLayer$delegate.setValue(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (currentStateFlow.$$delegate_0.collect(flowCollector3, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 8:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (((ChannelFlowOperator) obj2).flowCollect(flowCollector4, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                GenieSession genieSession = (GenieSession) obj2;
                byte[] bArr = (byte[]) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SizeMap sizeMap = genieSession.handler;
                    String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(genieSession.baseUrl, "/2.0/cash/genie/get-scene");
                    String str = genieSession.token;
                    bArr.getClass();
                    this.L$0 = null;
                    this.label = 1;
                    sizeMap.getClass();
                    obj = sizeMap.execute(m$1, bArr, "application/x-protobuf", "application/x-protobuf", str, new CashMapViewKt$$ExternalSyntheticLambda1(i2), this);
                    if (obj == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                GenieFetchSceneResponse genieFetchSceneResponse = (GenieFetchSceneResponse) obj;
                return new SessionHTTPPayload(genieFetchSceneResponse.body, genieFetchSceneResponse.statusCode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asFlow$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_asFlow = obj;
    }
}
