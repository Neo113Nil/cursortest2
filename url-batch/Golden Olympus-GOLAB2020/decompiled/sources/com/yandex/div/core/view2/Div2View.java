package com.yandex.div.core.view2;

import O1.C0839h0;
import O1.C0892k0;
import O1.C1165z4;
import O1.EnumC0979of;
import O1.Z;
import W1.h;
import W1.i;
import W1.l;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.logging.bind.BindingEventReporter;
import com.yandex.div.core.view2.logging.bind.BindingEventReporterProvider;
import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporterProvider;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber$Listener;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.util.DivDataUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k0.AbstractC3204l;
import k0.AbstractC3205m;
import k0.AbstractC3206n;
import k0.C3203k;
import k0.C3208p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class Div2View extends FrameContainerLayout implements DivViewFacade {

    @Nullable
    private DivActionHandler actionHandler;
    private final boolean bindOnAttachEnabled;

    @Nullable
    private SingleTimeOnAttachCallback bindOnAttachRunnable;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private final ViewBindingProvider bindingProvider;

    @NotNull
    private final BindingEventReporterProvider bindingReporterProvider;

    @NotNull
    private final BulkActionHandler bulkActionsHandler;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener clearVariablesListener;
    private final boolean complexRebindEnabled;
    private DivViewConfig config;
    private final long constructorCallTime;

    @NotNull
    private final Div2Context context;

    @NotNull
    private DivDataTag dataTag;

    @NotNull
    private final Div2Component div2Component;

    @NotNull
    private final Div2Builder divBuilder;

    @Nullable
    private C1165z4 divData;

    @NotNull
    private final List<Object> divDataChangedObservers;

    @Nullable
    private DivTimerEventDispatcher divTimerEventDispatcher;

    @NotNull
    private final DivTransitionHandler divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;

    @NotNull
    private final GestureDetector gestureDetector;

    @NotNull
    private final h histogramReporter$delegate;
    private boolean inMiddleOfBind;

    @NotNull
    private final InputFocusTracker inputFocusTracker;

    @NotNull
    private final Map<ExpressionResolver, Map<String, Integer>> layoutSizes;

    @NotNull
    private final List<LoadReference> loadReferences;

    @NotNull
    private final Object monitor;

    @Nullable
    private RuntimeStore oldRuntimeStore;

    @NotNull
    private final List<OverflowMenuSubscriber$Listener> overflowMenuListeners;

    @NotNull
    private final PatchEventReporterProvider patchReporterProvider;

    @NotNull
    private final ObserverList<PersistentDivDataObserver> persistentDivDataObservers;

    @NotNull
    private DivDataTag prevDataTag;

    @NotNull
    private final WeakHashMap<View, C0839h0.c> propagatedAccessibilityModes;

    @Nullable
    private RebindTask rebindTask;

    @NotNull
    private final Function0<RenderConfiguration> renderConfig;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingFinishedRunnable;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingResumedRunnable;

    @Nullable
    private RuntimeStore runtimeStore;

    @Nullable
    private SingleTimeOnAttachCallback setActiveBindingRunnable;
    private long stateId;
    private long timeCreated;

    @NotNull
    private final Map<C1165z4, DivLayoutProviderVariablesHolder> variablesHolders;

    @NotNull
    private final Div2ViewComponent viewComponent;

    @NotNull
    private final String viewCreateCallType;

    @NotNull
    private final WeakHashMap<View, Z> viewToDivBindings;

    @Metadata
    private final class BulkActionHandler {
        private int bulkModeDepth;
        private boolean isPendingStateTemporary = true;

        @NotNull
        private final List<DivStatePath> pendingPaths = new ArrayList();

        @Nullable
        private C1165z4.c pendingState;

        public BulkActionHandler() {
        }

        private final void reset() {
            this.pendingState = null;
            this.isPendingStateTemporary = true;
            this.pendingPaths.clear();
        }

        public final void bulkActions(@NotNull Function0<Unit> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.bulkModeDepth++;
            function.invoke();
            int i4 = this.bulkModeDepth - 1;
            this.bulkModeDepth = i4;
            if (i4 == 0) {
                runBulkActions();
            }
        }

        public final void runBulkActions() {
            C1165z4.c cVar = this.pendingState;
            if (cVar == null) {
                return;
            }
            if (cVar.f8722b != Div2View.this.getStateId$div_release()) {
                Div2View.this.switchToState(cVar.f8722b, this.isPendingStateTemporary);
            } else if (Div2View.this.getChildCount() > 0) {
                try {
                    Div2View.this.getViewComponent$div_release().getStateSwitcher().switchStates(cVar, CollectionsKt.immutableCopy(this.pendingPaths), Div2View.this.getExpressionResolver());
                } catch (StateConflictException e4) {
                    DivActionTypedUtilsKt.logError(Div2View.this, e4);
                    Div2View.this.resetToInitialState();
                }
            }
            reset();
        }

        public final void switchMultipleStates(@Nullable C1165z4.c cVar, @NotNull List<DivStatePath> paths, boolean z4) {
            Intrinsics.checkNotNullParameter(paths, "paths");
            C1165z4.c cVar2 = this.pendingState;
            if (cVar2 != null && !Intrinsics.areEqual(cVar, cVar2)) {
                reset();
            }
            this.pendingState = cVar;
            this.isPendingStateTemporary = this.isPendingStateTemporary && z4;
            List<DivStatePath> list = paths;
            kotlin.collections.CollectionsKt.addAll(this.pendingPaths, list);
            Div2View div2View = Div2View.this;
            for (DivStatePath divStatePath : list) {
                DivStateManager stateManager = div2View.getDiv2Component$div_release().getStateManager();
                String id = div2View.getDivTag().getId();
                Intrinsics.checkNotNullExpressionValue(id, "divTag.id");
                stateManager.updateStates(id, divStatePath, z4);
            }
            if (this.bulkModeDepth == 0) {
                runBulkActions();
            }
        }

        public final void switchState(@Nullable C1165z4.c cVar, @NotNull DivStatePath path, boolean z4) {
            Intrinsics.checkNotNullParameter(path, "path");
            switchMultipleStates(cVar, kotlin.collections.CollectionsKt.listOf(path), z4);
        }
    }

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i4, long j4) {
        super(div2Context, attributeSet, i4);
        this.context = div2Context;
        this.constructorCallTime = j4;
        this.div2Component = getContext$div_release().getDiv2Component$div_release();
        this.viewComponent = getDiv2Component$div_release().viewComponent().divView(this).build();
        this.bindOnAttachEnabled = getDiv2Component$div_release().isBindOnAttachEnabled();
        this.complexRebindEnabled = getDiv2Component$div_release().isComplexRebindEnabled();
        this.bindingProvider = getViewComponent$div_release().getBindingProvider();
        this.bindingReporterProvider = new BindingEventReporterProvider(this);
        this.patchReporterProvider = new PatchEventReporterProvider(this);
        Div2Builder div2Builder = getContext$div_release().getDiv2Component$div_release().getDiv2Builder();
        Intrinsics.checkNotNullExpressionValue(div2Builder, "context.div2Component.div2Builder");
        this.divBuilder = div2Builder;
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new ObserverList<>();
        this.viewToDivBindings = new WeakHashMap<>();
        this.propagatedAccessibilityModes = new WeakHashMap<>();
        this.bulkActionsHandler = new BulkActionHandler();
        this.bindingContext = BindingContext.Companion.createEmpty(this);
        this.monitor = new Object();
        this.stateId = DivDataUtilsKt.getINVALID_STATE_ID(C1165z4.f8706j);
        this.config = DivViewConfig.DEFAULT;
        this.renderConfig = new Div2View$renderConfig$1(this);
        this.histogramReporter$delegate = i.a(l.f9608d, new Div2View$histogramReporter$2(this));
        this.gestureDetector = new GestureDetector(getContext$div_release(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@NotNull MotionEvent e4) {
                Intrinsics.checkNotNullParameter(e4, "e");
                Div2View div2View = Div2View.this;
                BaseDivViewExtensionsKt.clearFocusOnClick(div2View, div2View.getInputFocusTracker$div_release());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.inputFocusTracker = getViewComponent$div_release().getInputFocusTracker();
        this.layoutSizes = new LinkedHashMap();
        this.variablesHolders = new LinkedHashMap();
        DivDataTag INVALID = DivDataTag.INVALID;
        Intrinsics.checkNotNullExpressionValue(INVALID, "INVALID");
        this.dataTag = INVALID;
        Intrinsics.checkNotNullExpressionValue(INVALID, "INVALID");
        this.prevDataTag = INVALID;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component$div_release().getDivCreationTracker().getViewCreateCallType();
        this.drawWasSkipped = true;
        this.divTransitionHandler = new DivTransitionHandler(this);
        this.timeCreated = DivCreationTracker.Companion.getCurrentUptimeMillis();
        getDiv2Component$div_release().getReleaseManager().observeDivLifecycle(this);
    }

    private void addNewStateViewWithTransition(C1165z4 c1165z4, C1165z4 c1165z42, Z z4, C1165z4.c cVar, View view, boolean z5, boolean z6) {
        AbstractC3204l prepareTransition = z5 ? prepareTransition(c1165z4, c1165z42, z4, cVar.f8721a) : null;
        if (prepareTransition != null) {
            C3203k c4 = C3203k.c(this);
            if (c4 != null) {
                c4.g(new Runnable() { // from class: w1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Div2View.addNewStateViewWithTransition$lambda$41(Div2View.this);
                    }
                });
            }
        } else {
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this, this);
        }
        if (z6) {
            getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), view, cVar.f8721a, DivStatePath.Companion.fromState$div_release(cVar));
        }
        if (prepareTransition == null) {
            addView(view);
            getViewComponent$div_release().getErrorMonitor().connect(this);
        } else {
            AbstractC3206n.c(this);
            C3203k c3203k = new C3203k(this, view);
            SceneRootWatcher.INSTANCE.watchFor(c3203k, prepareTransition);
            AbstractC3206n.e(c3203k, prepareTransition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$41(Div2View this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this$0, this$0);
    }

    private void attachVariableTriggers(C1165z4 c1165z4) {
        C1165z4.c state = state(c1165z4);
        if (state == null) {
            return;
        }
        Div2View$attachVariableTriggers$attachTriggers$1 div2View$attachVariableTriggers$attachTriggers$1 = new Div2View$attachVariableTriggers$attachTriggers$1(this, state);
        if (this.bindOnAttachEnabled) {
            this.setActiveBindingRunnable = new SingleTimeOnAttachCallback(this, new Div2View$attachVariableTriggers$1(div2View$attachVariableTriggers$attachTriggers$1));
        } else {
            div2View$attachVariableTriggers$attachTriggers$1.invoke();
        }
    }

    private View buildViewAndUpdateState(C1165z4.c cVar, long j4, boolean z4) {
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j4, z4);
        View buildView = this.divBuilder.buildView(cVar.f8721a, getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(cVar));
        getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
        return buildView;
    }

    static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, C1165z4.c cVar, long j4, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return div2View.buildViewAndUpdateState(cVar, j4, z4);
    }

    private View buildViewAsyncAndUpdateState(C1165z4.c cVar, long j4, boolean z4) {
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j4, z4);
        DivStatePath fromState$div_release = DivStatePath.Companion.fromState$div_release(cVar);
        View createView = this.divBuilder.createView(cVar.f8721a, getBindingContext$div_release(), fromState$div_release);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new Div2View$buildViewAsyncAndUpdateState$1(this, createView, cVar, fromState$div_release)));
            return createView;
        }
        getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), createView, cVar.f8721a, fromState$div_release);
        if (isAttachedToWindow()) {
            getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            return createView;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                this.removeOnAttachStateChangeListener(this);
                this.getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
            }
        });
        return createView;
    }

    static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, C1165z4.c cVar, long j4, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return div2View.buildViewAsyncAndUpdateState(cVar, j4, z4);
    }

    private void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    private boolean complexRebind(C1165z4 c1165z4, C1165z4 c1165z42, ComplexRebindReporter complexRebindReporter) {
        C1165z4.c stateToBind = getStateToBind(c1165z4);
        if (stateToBind == null) {
            complexRebindReporter.onComplexRebindFatalNoState();
            return false;
        }
        getHistogramReporter().onRebindingStarted();
        setDivData$div_release(c1165z4);
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask == null) {
            DivBinder divBinder = getDiv2Component$div_release().getDivBinder();
            Intrinsics.checkNotNullExpressionValue(divBinder, "div2Component.divBinder");
            RebindTask rebindTask2 = new RebindTask(this, divBinder, getOldExpressionResolver$div_release(), getExpressionResolver(), complexRebindReporter);
            this.rebindTask = rebindTask2;
            rebindTask = rebindTask2;
        }
        View childAt = getView().getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        BaseDivViewExtensionsKt.bindLayoutParams(viewGroup, stateToBind.f8721a.b(), getExpressionResolver());
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), stateToBind.f8722b, false);
        if (!rebindTask.prepareAndRebind(c1165z42, c1165z4, viewGroup, DivStatePath.Companion.fromState$div_release(stateToBind))) {
            return false;
        }
        requestLayout();
        getHistogramReporter().onRebindingFinished();
        return true;
    }

    private void discardChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        Intrinsics.checkNotNullExpressionValue(visibilityActionTracker, "div2Component.visibilityActionTracker");
        for (Map.Entry<View, Z> entry : this.viewToDivBindings.entrySet()) {
            View view = entry.getKey();
            Z div = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(view, "view");
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(view);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                Intrinsics.checkNotNullExpressionValue(div, "div");
                DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, div, null, null, 48, null);
            }
        }
    }

    private void discardStateVisibility(C1165z4.c cVar) {
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        Intrinsics.checkNotNullExpressionValue(visibilityActionTracker, "div2Component.visibilityActionTracker");
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, getExpressionResolver(), null, cVar.f8721a, null, null, 48, null);
    }

    private boolean forceSwitchToState(long j4, boolean z4) {
        Object obj;
        Object obj2;
        setStateId$div_release(j4);
        DivViewState currentState = getCurrentState();
        Long valueOf = currentState != null ? Long.valueOf(currentState.getCurrentDivStateId()) : null;
        C1165z4 divData = getDivData();
        if (divData == null) {
            return false;
        }
        Iterator it = divData.f8711c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long j5 = ((C1165z4.c) obj).f8722b;
            if (valueOf != null && j5 == valueOf.longValue()) {
                break;
            }
        }
        C1165z4.c cVar = (C1165z4.c) obj;
        Iterator it2 = divData.f8711c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((C1165z4.c) obj2).f8722b == j4) {
                break;
            }
        }
        C1165z4.c cVar2 = (C1165z4.c) obj2;
        if (cVar2 == null) {
            return false;
        }
        if (cVar != null) {
            discardStateVisibility(cVar);
        }
        trackStateVisibility(cVar2);
        boolean areDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, cVar != null ? cVar.f8721a : null, cVar2.f8721a, getExpressionResolver(), getExpressionResolver(), null, 16, null);
        addNewStateViewWithTransition(divData, divData, cVar != null ? cVar.f8721a : null, cVar2, areDivsReplaceable$default ? updateState(j4, z4) : buildViewAndUpdateState(cVar2, j4, z4), DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver()), areDivsReplaceable$default);
        return true;
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        DivVideoActionHandler divVideoActionHandler = getDiv2Component$div_release().getDivVideoActionHandler();
        Intrinsics.checkNotNullExpressionValue(divVideoActionHandler, "div2Component.divVideoActionHandler");
        return divVideoActionHandler;
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter$delegate.getValue();
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private C1165z4.c getStateToBind(C1165z4 c1165z4) {
        Object obj;
        Iterator it = c1165z4.f8711c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C1165z4.c) obj).f8722b == getStateId$div_release()) {
                break;
            }
        }
        C1165z4.c cVar = (C1165z4.c) obj;
        return cVar == null ? (C1165z4.c) kotlin.collections.CollectionsKt.firstOrNull(c1165z4.f8711c) : cVar;
    }

    private DivTooltipController getTooltipController() {
        DivTooltipController tooltipController = getDiv2Component$div_release().getTooltipController();
        Intrinsics.checkNotNullExpressionValue(tooltipController, "div2Component.tooltipController");
        return tooltipController;
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    private Sequence<DivItemBuilderResult> itemSequenceForTransition(C1165z4 c1165z4, Z z4, ExpressionResolver expressionResolver) {
        EnumC0979of enumC0979of;
        Expression expression;
        C3218h c3218h = new C3218h();
        if (c1165z4 == null || (expression = c1165z4.f8713e) == null || (enumC0979of = (EnumC0979of) expression.evaluate(expressionResolver)) == null) {
            enumC0979of = EnumC0979of.NONE;
        }
        c3218h.addLast(enumC0979of);
        return k.p(DivTreeWalkKt.walk(z4, expressionResolver).onEnter(new Div2View$itemSequenceForTransition$1(c3218h, expressionResolver)).onLeave(new Div2View$itemSequenceForTransition$2(c3218h)), new Div2View$itemSequenceForTransition$3(c3218h));
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onAfterDivDataChanged();
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind$div_release()) {
            DivActionTypedUtilsKt.logError(this, new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDivDataChanged();
        }
    }

    private AbstractC3204l prepareTransition(C1165z4 c1165z4, final C1165z4 c1165z42, Z z4, Z z5) {
        if (z4 == z5) {
            return null;
        }
        final C3208p buildTransitions = getViewComponent$div_release().getTransitionBuilder().buildTransitions(z4 != null ? itemSequenceForTransition(c1165z4, z4, getOldExpressionResolver$div_release()) : null, z5 != null ? itemSequenceForTransition(c1165z42, z5, getExpressionResolver()) : null, getOldExpressionResolver$div_release(), getExpressionResolver());
        if (buildTransitions.s() == 0) {
            return null;
        }
        final DivDataChangeListener divDataChangeListener = getDiv2Component$div_release().getDivDataChangeListener();
        Intrinsics.checkNotNullExpressionValue(divDataChangeListener, "div2Component.divDataChangeListener");
        divDataChangeListener.beforeAnimatedDataChange(this, c1165z42);
        buildTransitions.addListener(new AbstractC3205m() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                divDataChangeListener.afterAnimatedDataChange(this, c1165z42);
                AbstractC3204l.this.removeListener(this);
            }
        });
        return buildTransitions;
    }

    private void rebind(C1165z4 c1165z4, boolean z4, SimpleRebindReporter simpleRebindReporter) {
        try {
            if (getChildCount() == 0) {
                simpleRebindReporter.onSimpleRebindNoChild();
                updateNow(c1165z4, getDataTag(), simpleRebindReporter);
                return;
            }
            C1165z4.c stateToBind = getStateToBind(c1165z4);
            if (stateToBind == null) {
                simpleRebindReporter.onSimpleRebindFatalNoState();
                return;
            }
            getHistogramReporter().onRebindingStarted();
            ErrorCollector orNull = getViewComponent$div_release().getErrorCollectors().getOrNull(getDataTag(), getDivData());
            if (orNull != null) {
                orNull.cleanRuntimeWarningsAndErrors();
            }
            View rootDivView = getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(rootDivView, "rebind$lambda$57");
            BaseDivViewExtensionsKt.bindLayoutParams(rootDivView, stateToBind.f8721a.b(), getExpressionResolver());
            setDivData$div_release(c1165z4);
            getDiv2Component$div_release().getStateManager().updateState(getDataTag(), stateToBind.f8722b, true);
            DivBinder divBinder = getDiv2Component$div_release().getDivBinder();
            BindingContext bindingContext$div_release = getBindingContext$div_release();
            Intrinsics.checkNotNullExpressionValue(rootDivView, "rootDivView");
            divBinder.bind(bindingContext$div_release, rootDivView, stateToBind.f8721a, DivStatePath.Companion.fromState$div_release(stateToBind));
            requestLayout();
            if (z4) {
                getDiv2Component$div_release().getDivStateChangeListener().onDivAnimatedStateChanged(this);
            }
            attachVariableTriggers(c1165z4);
            getHistogramReporter().onRebindingFinished();
            simpleRebindReporter.onSimpleRebindSuccess();
        } catch (Exception e4) {
            simpleRebindReporter.onSimpleRebindException(e4);
            updateNow(c1165z4, getDataTag(), simpleRebindReporter);
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("", e4);
            }
        }
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        DivCreationTracker divCreationTracker = getDiv2Component$div_release().getDivCreationTracker();
        long j4 = this.constructorCallTime;
        long j5 = this.timeCreated;
        HistogramReporter histogramReporter = getDiv2Component$div_release().getHistogramReporter();
        Intrinsics.checkNotNullExpressionValue(histogramReporter, "div2Component.histogramReporter");
        divCreationTracker.sendHistograms(j4, j5, histogramReporter, this.viewCreateCallType);
        this.timeCreated = -1L;
    }

    private C1165z4.c state(C1165z4 c1165z4) {
        Object obj;
        long stateId = stateId(c1165z4);
        Iterator it = c1165z4.f8711c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C1165z4.c) obj).f8722b == stateId) {
                break;
            }
        }
        return (C1165z4.c) obj;
    }

    private long stateId(C1165z4 c1165z4) {
        DivViewState currentState = getCurrentState();
        return currentState != null ? currentState.getCurrentDivStateId() : DivDataUtilsKt.getInitialStateId(c1165z4);
    }

    private void stopLoadAndSubscriptions() {
        this.viewToDivBindings.clear();
        this.propagatedAccessibilityModes.clear();
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    private boolean switchToDivData(C1165z4 c1165z4, C1165z4 c1165z42, ForceRebindReporter forceRebindReporter) {
        Div2View div2View;
        View buildViewAndUpdateState$default;
        C1165z4.c state = c1165z4 != null ? state(c1165z4) : null;
        C1165z4.c state2 = state(c1165z42);
        setStateId$div_release(stateId(c1165z42));
        if (state2 == null) {
            forceRebindReporter.onForceRebindFatalNoState();
            return false;
        }
        if (c1165z4 == null) {
            div2View = this;
            buildViewAndUpdateState$default = buildViewAsyncAndUpdateState$default(div2View, state2, getStateId$div_release(), false, 4, null);
        } else {
            div2View = this;
            buildViewAndUpdateState$default = buildViewAndUpdateState$default(div2View, state2, getStateId$div_release(), false, 4, null);
        }
        View view = buildViewAndUpdateState$default;
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        div2View.addNewStateViewWithTransition(c1165z4, c1165z42, state != null ? state.f8721a : null, state2, view, (c1165z4 != null && DivTransitionsKt.allowsTransitionsOnDataChange(c1165z4, getOldExpressionResolver$div_release())) || DivTransitionsKt.allowsTransitionsOnDataChange(c1165z42, getExpressionResolver()), false);
        if (c1165z4 != null) {
            forceRebindReporter.onForceRebindSuccess();
        } else {
            forceRebindReporter.onFirstBindingCompleted();
        }
        return true;
    }

    private void trackStateVisibility(C1165z4.c cVar) {
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        Intrinsics.checkNotNullExpressionValue(visibilityActionTracker, "div2Component.visibilityActionTracker");
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, getExpressionResolver(), getView(), cVar.f8721a, null, null, 48, null);
    }

    private boolean updateNow(C1165z4 c1165z4, DivDataTag divDataTag, ForceRebindReporter forceRebindReporter) {
        C1165z4 divData = getDivData();
        if (divData == null) {
            getHistogramReporter().onBindingStarted();
        } else {
            getHistogramReporter().onRebindingStarted();
        }
        cleanup(false);
        setDataTag$div_release(divDataTag);
        setDivData$div_release(c1165z4);
        boolean switchToDivData = switchToDivData(divData, c1165z4, forceRebindReporter);
        attachVariableTriggers(c1165z4);
        if (divData != null) {
            getHistogramReporter().onRebindingFinished();
            return switchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().onBindingFinished();
            return switchToDivData;
        }
        getHistogramReporter().onBindingPaused();
        this.reportBindingResumedRunnable = new SingleTimeOnAttachCallback(this, new Div2View$updateNow$1(this));
        this.reportBindingFinishedRunnable = new SingleTimeOnAttachCallback(this, new Div2View$updateNow$2(this));
        return switchToDivData;
    }

    private void updateRuntimeStore(C1165z4 c1165z4, DivDataTag divDataTag) {
        RuntimeStore runtimeStore;
        if (c1165z4 == null) {
            return;
        }
        this.oldRuntimeStore = getRuntimeStore$div_release();
        setRuntimeStore$div_release(getDiv2Component$div_release().getRuntimeStoreProvider().getOrCreate$div_release(divDataTag, c1165z4, this));
        RuntimeStore runtimeStore$div_release = getRuntimeStore$div_release();
        if (runtimeStore$div_release != null) {
            runtimeStore$div_release.updateSubscriptions$div_release();
        }
        if (!Intrinsics.areEqual(this.oldRuntimeStore, getRuntimeStore$div_release()) && (runtimeStore = this.oldRuntimeStore) != null) {
            runtimeStore.clearBindings$div_release(this);
        }
        setBindingContext$div_release(getBindingContext$div_release().getFor(getExpressionResolver()));
    }

    static /* synthetic */ void updateRuntimeStore$default(Div2View div2View, C1165z4 c1165z4, DivDataTag divDataTag, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRuntimeStore");
        }
        if ((i4 & 1) != 0) {
            c1165z4 = div2View.getDivData();
        }
        if ((i4 & 2) != 0) {
            divDataTag = div2View.getDataTag();
        }
        div2View.updateRuntimeStore(c1165z4, divDataTag);
    }

    private View updateState(long j4, boolean z4) {
        View rootView = getView().getChildAt(0);
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j4, z4);
        getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        return rootView;
    }

    private void updateTimers() {
        DivTimerEventDispatcher divTimerEventDispatcher$div_release;
        C1165z4 divData = getDivData();
        if (divData == null) {
            return;
        }
        DivTimerEventDispatcher orCreate$div_release = getDiv2Component$div_release().getDivTimersControllerProvider().getOrCreate$div_release(getDataTag(), divData, getExpressionResolver());
        if (!Intrinsics.areEqual(getDivTimerEventDispatcher$div_release(), orCreate$div_release) && (divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release()) != null) {
            divTimerEventDispatcher$div_release.onDetach(this);
        }
        setDivTimerEventDispatcher$div_release(orCreate$div_release);
        if (orCreate$div_release != null) {
            orCreate$div_release.onAttach(this);
        }
    }

    public void addLoadReference(@NotNull LoadReference loadReference, @NotNull View targetView) {
        Intrinsics.checkNotNullParameter(loadReference, "loadReference");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        synchronized (this.monitor) {
            this.loadReferences.add(loadReference);
        }
    }

    public void addPersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.monitor) {
            this.persistentDivDataObservers.addObserver(observer);
        }
    }

    public void applyTimerCommand(@NotNull String id, @NotNull String command) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(command, "command");
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.changeState(id, command);
        }
    }

    public boolean applyVideoCommand(@NotNull String divId, @NotNull String command, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(divId, "divId");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        return getDivVideoActionHandler().handleAction(this, divId, command, expressionResolver);
    }

    public void bindViewToDiv$div_release(@NotNull View view, @NotNull Z div) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        this.viewToDivBindings.put(view, div);
    }

    public void bulkActions$div_release(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.bulkActionsHandler.bulkActions(function);
    }

    public void cancelTooltips() {
        getTooltipController().cancelTooltips(this);
    }

    public void cleanup() {
        synchronized (this.monitor) {
            cleanup(true);
            Unit unit = Unit.f41027a;
        }
    }

    public void clearSubscriptions() {
        synchronized (this.monitor) {
            this.overflowMenuListeners.clear();
            Unit unit = Unit.f41027a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void discardVisibilityTracking() {
        List list;
        C1165z4 divData = getDivData();
        C1165z4.c cVar = null;
        if (divData != null && (list = divData.f8711c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C1165z4.c) next).f8722b == getStateId$div_release()) {
                    cVar = next;
                    break;
                }
            }
            cVar = cVar;
        }
        if (cVar != null) {
            discardStateVisibility(cVar);
        }
        discardChildrenVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawStarted();
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawFinished();
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.drawWasSkipped = false;
        getHistogramReporter().onDrawStarted();
        super.draw(canvas);
        getHistogramReporter().onDrawFinished();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Nullable
    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    @Nullable
    public SingleTimeOnAttachCallback getBindOnAttachRunnable$div_release() {
        return this.bindOnAttachRunnable;
    }

    @NotNull
    public BindingContext getBindingContext$div_release() {
        return this.bindingContext;
    }

    @Nullable
    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener$div_release() {
        return this.clearVariablesListener;
    }

    public boolean getComplexRebindInProgress$div_release() {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            return rebindTask.getRebindInProgress();
        }
        return false;
    }

    @Nullable
    public String getComponentName() {
        return getHistogramReporter().getComponent();
    }

    @NotNull
    public DivViewConfig getConfig() {
        DivViewConfig config = this.config;
        Intrinsics.checkNotNullExpressionValue(config, "config");
        return config;
    }

    @NotNull
    public Div2Context getContext$div_release() {
        return this.context;
    }

    @Nullable
    public ReusableTokenList getCurrentRebindReusableList$div_release() {
        RebindTask rebindTask;
        if (getComplexRebindInProgress$div_release() && (rebindTask = this.rebindTask) != null) {
            return rebindTask.getReusableList();
        }
        return null;
    }

    @NotNull
    public DivStatePath getCurrentRootPath$div_release() {
        List list;
        Object obj;
        DivStatePath fromState$div_release;
        C1165z4 divData = getDivData();
        if (divData != null && (list = divData.f8711c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C1165z4.c) obj).f8722b == getStateId$div_release()) {
                    break;
                }
            }
            C1165z4.c cVar = (C1165z4.c) obj;
            if (cVar != null && (fromState$div_release = DivStatePath.Companion.fromState$div_release(cVar)) != null) {
                return fromState$div_release;
            }
        }
        return DivStatePath.Companion.fromState(getStateId$div_release());
    }

    @Nullable
    public DivViewState getCurrentState() {
        C1165z4 divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState state = getDiv2Component$div_release().getStateManager().getState(getDataTag());
        List<C1165z4.c> list = divData.f8711c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C1165z4.c cVar : list) {
                if (state != null && cVar.f8722b == state.getCurrentDivStateId()) {
                    return state;
                }
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId$div_release();
    }

    @NotNull
    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        DivCustomContainerChildFactory divCustomContainerChildFactory = getDiv2Component$div_release().getDivCustomContainerChildFactory();
        Intrinsics.checkNotNullExpressionValue(divCustomContainerChildFactory, "div2Component.divCustomContainerChildFactory");
        return divCustomContainerChildFactory;
    }

    @NotNull
    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    @NotNull
    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    @Nullable
    public C1165z4 getDivData() {
        return this.divData;
    }

    @NotNull
    public DivDataTag getDivTag() {
        return getDataTag();
    }

    @Nullable
    public DivTimerEventDispatcher getDivTimerEventDispatcher$div_release() {
        return this.divTimerEventDispatcher;
    }

    @NotNull
    public DivTransitionHandler getDivTransitionHandler$div_release() {
        return this.divTransitionHandler;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public ExpressionResolver getExpressionResolver() {
        ExpressionResolverImpl expressionResolver;
        ExpressionsRuntime expressionsRuntime$div_release = getExpressionsRuntime$div_release();
        return (expressionsRuntime$div_release == null || (expressionResolver = expressionsRuntime$div_release.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    @Nullable
    public ExpressionsRuntime getExpressionsRuntime$div_release() {
        RuntimeStore runtimeStore$div_release = getRuntimeStore$div_release();
        if (runtimeStore$div_release != null) {
            return runtimeStore$div_release.getRootRuntime();
        }
        return null;
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    public boolean getInMiddleOfBind$div_release() {
        return this.inMiddleOfBind;
    }

    @NotNull
    public InputFocusTracker getInputFocusTracker$div_release() {
        return this.inputFocusTracker;
    }

    @NotNull
    public Map<ExpressionResolver, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.layoutSizes;
    }

    @NotNull
    public String getLogId() {
        String str;
        C1165z4 divData = getDivData();
        return (divData == null || (str = divData.f8710b) == null) ? "" : str;
    }

    @NotNull
    public MediaReleaseViewVisitor getMediaReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().getMediaReleaseViewVisitor();
    }

    @NotNull
    public ExpressionResolver getOldExpressionResolver$div_release() {
        ExpressionsRuntime rootRuntime;
        ExpressionResolverImpl expressionResolver;
        RuntimeStore runtimeStore = this.oldRuntimeStore;
        return (runtimeStore == null || (rootRuntime = runtimeStore.getRootRuntime()) == null || (expressionResolver = rootRuntime.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    @NotNull
    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    @Nullable
    public C0839h0.c getPropagatedAccessibilityMode$div_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.propagatedAccessibilityModes.get(view);
    }

    @NotNull
    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().getReleaseViewVisitor();
    }

    @Nullable
    public RuntimeStore getRuntimeStore$div_release() {
        return this.runtimeStore;
    }

    public long getStateId$div_release() {
        return this.stateId;
    }

    @NotNull
    public Map<C1165z4, DivLayoutProviderVariablesHolder> getVariablesHolders$div_release() {
        return this.variablesHolders;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public Div2View getView() {
        return this;
    }

    @NotNull
    public Div2ViewComponent getViewComponent$div_release() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent$div_release().getErrorMonitor().getEnabled$div_release();
    }

    public void handleAction(@NotNull C0892k0 action, @NotNull String reason, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        handleActionWithResult(action, reason, resolver);
    }

    public boolean handleActionWithResult(@NotNull C0892k0 action, @NotNull String reason, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return getDiv2Component$div_release().getActionBinder().handleAction$div_release(this, resolver, action, reason, null, getActionHandler());
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void hideTooltip(@NotNull String tooltipId) {
        Intrinsics.checkNotNullParameter(tooltipId, "tooltipId");
        getTooltipController().hideTooltip(tooltipId, this);
    }

    public boolean isDescendantAccessibilityMode$div_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        return view2 != null && this.propagatedAccessibilityModes.get(view2) == this.propagatedAccessibilityModes.get(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.reportBindingResumedRunnable;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.setActiveBindingRunnable;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.onAttach();
        }
        SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
        if (bindOnAttachRunnable$div_release != null) {
            bindOnAttachRunnable$div_release.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback3 = this.reportBindingFinishedRunnable;
        if (singleTimeOnAttachCallback3 != null) {
            singleTimeOnAttachCallback3.onAttach();
        }
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.onDetach(this);
        }
        getViewComponent$div_release().getAnimatorController().onDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        getHistogramReporter().onLayoutStarted();
        super.onLayout(z4, i4, i5, i6, i7);
        tryLogVisibility();
        getHistogramReporter().onLayoutFinished();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        getHistogramReporter().onMeasureStarted();
        super.onMeasure(i4, i5);
        getHistogramReporter().onMeasureFinished();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (getInputFocusTracker$div_release().isFocusedOnInput()) {
            this.gestureDetector.onTouchEvent(event);
            if (event.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public void removePersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.monitor) {
            this.persistentDivDataObservers.removeObserver(observer);
        }
    }

    public void resetToInitialState() {
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            currentState.reset();
        }
        TemporaryDivStateCache temporaryDivStateCache = getDiv2Component$div_release().getTemporaryDivStateCache();
        String id = getDivTag().getId();
        Intrinsics.checkNotNullExpressionValue(id, "divTag.id");
        temporaryDivStateCache.resetCard(id);
        switchToInitialState();
    }

    @Nullable
    public Z rootDiv$div_release() {
        C1165z4.c state;
        C1165z4 divData = getDivData();
        if (divData == null || (state = state(divData)) == null) {
            return null;
        }
        return state.f8721a;
    }

    public void setActionHandler(@Nullable DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    public void setBindOnAttachRunnable$div_release(@Nullable SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    public void setBindingContext$div_release(@NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(bindingContext, "<set-?>");
        this.bindingContext = bindingContext;
    }

    public void setClearVariablesListener$div_release(@Nullable ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.clearVariablesListener = onPreDrawListener;
    }

    public void setComponentName(@Nullable String str) {
        getHistogramReporter().setComponent(str);
    }

    public void setConfig(@NotNull DivViewConfig viewConfig) {
        Intrinsics.checkNotNullParameter(viewConfig, "viewConfig");
        this.config = viewConfig;
    }

    public boolean setData(@Nullable C1165z4 c1165z4, @NotNull DivDataTag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return setData(c1165z4, getDivData(), tag);
    }

    public void setDataTag$div_release(@NotNull DivDataTag value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = value;
        this.bindingProvider.update(value, getDivData());
    }

    public void setDivData$div_release(@Nullable C1165z4 c1165z4) {
        this.divData = c1165z4;
        updateRuntimeStore$default(this, null, null, 3, null);
        updateTimers();
        this.bindingProvider.update(getDataTag(), this.divData);
    }

    public void setDivTimerEventDispatcher$div_release(@Nullable DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public void setForceCanvasClipping(boolean z4) {
        this.forceCanvasClipping = z4;
    }

    public void setInMiddleOfBind$div_release(boolean z4) {
        this.inMiddleOfBind = z4;
    }

    public void setPrevDataTag$div_release(@NotNull DivDataTag divDataTag) {
        Intrinsics.checkNotNullParameter(divDataTag, "<set-?>");
        this.prevDataTag = divDataTag;
    }

    public void setPropagatedAccessibilityMode$div_release(@NotNull View view, @NotNull C0839h0.c mode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.propagatedAccessibilityModes.put(view, mode);
    }

    public void setRuntimeStore$div_release(@Nullable RuntimeStore runtimeStore) {
        this.runtimeStore = runtimeStore;
    }

    public void setStateId$div_release(long j4) {
        this.stateId = j4;
    }

    @Nullable
    public VariableMutationException setVariable(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return VariableMutationHandler.Companion.setVariable(this, name, value, getExpressionResolver());
    }

    public void setVisualErrorsEnabled(boolean z4) {
        getViewComponent$div_release().getErrorMonitor().setEnabled$div_release(z4);
    }

    public void showTooltip(@NotNull String tooltipId) {
        Intrinsics.checkNotNullParameter(tooltipId, "tooltipId");
        DivTooltipController.showTooltip$default(getTooltipController(), tooltipId, getBindingContext$div_release(), false, 4, null);
    }

    @Nullable
    public C1165z4.c stateToBind(@NotNull C1165z4 divData) {
        Intrinsics.checkNotNullParameter(divData, "divData");
        return getStateToBind(divData);
    }

    public void subscribe(@NotNull OverflowMenuSubscriber$Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.monitor) {
            this.overflowMenuListeners.add(listener);
        }
    }

    public void switchToInitialState() {
        C1165z4 divData = getDivData();
        if (divData == null) {
            return;
        }
        long initialStateId = DivDataUtilsKt.getInitialStateId(divData);
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            initialStateId = currentState.getCurrentDivStateId();
        }
        switchToState(initialStateId);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(long j4, boolean z4) {
        synchronized (this.monitor) {
            try {
                if (j4 != DivDataUtilsKt.getINVALID_STATE_ID(C1165z4.f8706j)) {
                    SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                    if (bindOnAttachRunnable$div_release != null) {
                        bindOnAttachRunnable$div_release.cancel();
                    }
                    forceSwitchToState(j4, z4);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public Z takeBindingDiv$div_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.viewToDivBindings.get(view);
    }

    public void trackChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        Intrinsics.checkNotNullExpressionValue(visibilityActionTracker, "div2Component.visibilityActionTracker");
        for (Map.Entry<View, Z> entry : this.viewToDivBindings.entrySet()) {
            View view = entry.getKey();
            Z div = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(view, "view");
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(view);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                if (AbstractC1281a0.S(view)) {
                    Intrinsics.checkNotNullExpressionValue(div, "div");
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, view, div, null, null, 48, null);
                } else {
                    Intrinsics.checkNotNullExpressionValue(div, "div");
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, div, null, null, 48, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void tryLogVisibility() {
        List list;
        C1165z4 divData = getDivData();
        C1165z4.c cVar = null;
        if (divData != null && (list = divData.f8711c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C1165z4.c) next).f8722b == getStateId$div_release()) {
                    cVar = next;
                    break;
                }
            }
            cVar = cVar;
        }
        if (cVar != null) {
            trackStateVisibility(cVar);
        }
        trackChildrenVisibility();
    }

    @Nullable
    public Z unbindViewFromDiv$div_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.viewToDivBindings.remove(view);
    }

    public boolean setData(@Nullable C1165z4 c1165z4, @Nullable C1165z4 c1165z42, @NotNull DivDataTag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.monitor) {
            C1165z4 c1165z43 = c1165z42;
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(c1165z43, c1165z4);
            boolean z4 = false;
            if (c1165z4 == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == c1165z4) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
            if (bindOnAttachRunnable$div_release != null) {
                bindOnAttachRunnable$div_release.cancel();
            }
            getHistogramReporter().onRenderStarted();
            C1165z4 divData = getDivData();
            if (divData != null) {
                c1165z43 = divData;
            }
            updateRuntimeStore(c1165z4, tag);
            setDataTag$div_release(tag);
            for (C1165z4.c cVar : c1165z4.f8711c) {
                DivViewDataPreloader divViewDataPreloader = getDiv2Component$div_release().getDivViewDataPreloader();
                Intrinsics.checkNotNullExpressionValue(divViewDataPreloader, "div2Component.divViewDataPreloader");
                DivViewDataPreloader.preload$default(divViewDataPreloader, cVar.f8721a, getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(cVar), null, 8, null);
            }
            boolean isDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(c1165z43, c1165z4, getStateId$div_release(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            if (c1165z43 != null && !DivTransitionsKt.allowsTransitionsOnDataChange(c1165z4, getExpressionResolver())) {
                if (isDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(c1165z4, c1165z43, bindingEventReporter)) {
                    if (isDivDataReplaceable) {
                        rebind(c1165z4, false, bindingEventReporter);
                    } else {
                        z4 = updateNow(c1165z4, tag, bindingEventReporter);
                    }
                }
                getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
                sendCreationHistograms();
                this.oldRuntimeStore = getRuntimeStore$div_release();
                notifyBindEnded();
                return z4;
            }
            z4 = updateNow(c1165z4, tag, bindingEventReporter);
            getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            this.oldRuntimeStore = getRuntimeStore$div_release();
            notifyBindEnded();
            return z4;
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(@NotNull String tooltipId, boolean z4) {
        Intrinsics.checkNotNullParameter(tooltipId, "tooltipId");
        getTooltipController().showTooltip(tooltipId, getBindingContext$div_release(), z4);
    }

    private void cleanup(boolean z4) {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            rebindTask.clear();
            Unit unit = Unit.f41027a;
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        ReleaseUtils releaseUtils = ReleaseUtils.INSTANCE;
        releaseUtils.releaseMedia$div_release(this, this);
        stopLoadAndSubscriptions();
        if (z4) {
            releaseUtils.releaseAndRemoveChildren$div_release(this, this);
        }
        ErrorCollector orNull = getViewComponent$div_release().getErrorCollectors().getOrNull(getDataTag(), getDivData());
        if (orNull != null) {
            orNull.cleanRuntimeWarningsAndErrors();
        }
        setDivData$div_release(null);
        DivDataTag INVALID = DivDataTag.INVALID;
        Intrinsics.checkNotNullExpressionValue(INVALID, "INVALID");
        setDataTag$div_release(INVALID);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(@NotNull DivStatePath path, boolean z4) {
        List list;
        Intrinsics.checkNotNullParameter(path, "path");
        synchronized (this.monitor) {
            try {
                C1165z4 divData = getDivData();
                C1165z4.c cVar = null;
                if (divData != null && (list = divData.f8711c) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((C1165z4.c) next).f8722b == path.getTopLevelStateId()) {
                            cVar = next;
                            break;
                        }
                    }
                    cVar = cVar;
                }
                this.bulkActionsHandler.switchState(cVar, path, z4);
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Div2View(@NotNull Div2Context context, @Nullable AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, SystemClock.uptimeMillis());
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
