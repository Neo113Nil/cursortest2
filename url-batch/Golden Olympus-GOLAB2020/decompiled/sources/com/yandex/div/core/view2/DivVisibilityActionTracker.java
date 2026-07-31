package com.yandex.div.core.view2;

import O1.M4;
import O1.Wf;
import O1.Xb;
import O1.Z;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.h;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.util.SynchronizedWeakHashMap;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivSightExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivVisibilityActionTracker {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DivVisibilityTokenHolder appearTrackedTokens;

    @NotNull
    private final WeakHashMap<View, Set<M4>> appearedForDisappearActions;

    @NotNull
    private final DivVisibilityTokenHolder disappearTrackedTokens;

    @NotNull
    private final SynchronizedWeakHashMap<View, Z> divWithWaitingDisappearActions;

    @NotNull
    private final WeakHashMap<View, Z> enqueuedVisibilityActions;

    @NotNull
    private final Handler handler;
    private boolean hasPostedUpdateVisibilityTask;

    @NotNull
    private final SightActionIsEnabledObserver isEnabledObserver;

    @NotNull
    private final WeakHashMap<View, Boolean> previousVisibilityIsFull;

    @NotNull
    private final Runnable updateVisibilityTask;

    @NotNull
    private final ViewVisibilityCalculator viewVisibilityCalculator;

    @NotNull
    private final DivVisibilityActionDispatcher visibilityActionDispatcher;

    @NotNull
    private final WeakHashMap<View, Z> visibleActions;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivVisibilityActionTracker(@NotNull ViewVisibilityCalculator viewVisibilityCalculator, @NotNull DivVisibilityActionDispatcher visibilityActionDispatcher) {
        Intrinsics.checkNotNullParameter(viewVisibilityCalculator, "viewVisibilityCalculator");
        Intrinsics.checkNotNullParameter(visibilityActionDispatcher, "visibilityActionDispatcher");
        this.viewVisibilityCalculator = viewVisibilityCalculator;
        this.visibilityActionDispatcher = visibilityActionDispatcher;
        this.handler = new Handler(Looper.getMainLooper());
        this.appearTrackedTokens = new DivVisibilityTokenHolder();
        this.disappearTrackedTokens = new DivVisibilityTokenHolder();
        this.isEnabledObserver = new SightActionIsEnabledObserver(new DivVisibilityActionTracker$isEnabledObserver$1(this), new DivVisibilityActionTracker$isEnabledObserver$2(this));
        this.visibleActions = new WeakHashMap<>();
        this.enqueuedVisibilityActions = new WeakHashMap<>();
        this.previousVisibilityIsFull = new WeakHashMap<>();
        this.divWithWaitingDisappearActions = new SynchronizedWeakHashMap<>();
        this.appearedForDisappearActions = new WeakHashMap<>();
        this.updateVisibilityTask = new Runnable() { // from class: w1.u
            @Override // java.lang.Runnable
            public final void run() {
                DivVisibilityActionTracker.updateVisibilityTask$lambda$0(DivVisibilityActionTracker.this);
            }
        };
    }

    private void cancelTracking(CompositeLogId compositeLogId, View view, Xb xb, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "DivVisibilityActionTracker", "cancelTracking: id=" + compositeLogId);
        }
        divVisibilityTokenHolder.remove(compositeLogId, new DivVisibilityActionTracker$cancelTracking$2(this));
        Set<M4> set = this.appearedForDisappearActions.get(view);
        if (!(xb instanceof M4) || view == null || set == null) {
            return;
        }
        set.remove(xb);
        if (set.isEmpty()) {
            this.appearedForDisappearActions.remove(view);
            this.divWithWaitingDisappearActions.remove(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (r12 <= ((java.lang.Number) ((O1.M4) r11).f3841k.evaluate(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r12 >= ((java.lang.Number) ((O1.Wf) r11).f5187k.evaluate(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldTrackVisibilityAction(Div2View div2View, ExpressionResolver expressionResolver, View view, Xb xb, int i4, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        boolean z4;
        if (!(xb instanceof Wf)) {
            if (xb instanceof M4) {
                Set<M4> set = this.appearedForDisappearActions.get(view);
                if (set != null ? set.contains(xb) : false) {
                }
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Trying to check visibility for class without known visibility range");
                }
            }
            z4 = false;
        }
        CompositeLogId logId = divVisibilityTokenHolder.getLogId(CompositeLogIdKt.compositeLogIdOf(div2View, (String) xb.g().evaluate(expressionResolver)));
        if (view != null && logId == null && z4) {
            return true;
        }
        if ((view == null || logId != null || z4) && (view == null || logId == null || !z4)) {
            if (view != null && logId != null && !z4) {
                cancelTracking(logId, view, xb, divVisibilityTokenHolder);
            } else if (view == null && logId != null) {
                cancelTracking(logId, null, xb, divVisibilityTokenHolder);
            }
        }
        return false;
    }

    private void startTracking(final Div2View div2View, final ExpressionResolver expressionResolver, final View view, final List<? extends Xb> list, long j4, DivVisibilityTokenHolder divVisibilityTokenHolder) {
        HashMap hashMap = new HashMap(list.size(), 1.0f);
        for (Xb xb : list) {
            CompositeLogId compositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(div2View, (String) xb.g().evaluate(expressionResolver));
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, "DivVisibilityActionTracker", "startTracking: id=" + compositeLogIdOf);
            }
            Pair pair = TuplesKt.to(compositeLogIdOf, xb);
            hashMap.put(pair.getFirst(), pair.getSecond());
        }
        final Map<CompositeLogId, Xb> logIds = Collections.synchronizedMap(hashMap);
        Intrinsics.checkNotNullExpressionValue(logIds, "logIds");
        divVisibilityTokenHolder.add(logIds);
        final String logId = div2View.getLogId();
        h.a(this.handler, new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTracking$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                WeakHashMap weakHashMap;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher;
                WeakHashMap weakHashMap2;
                SynchronizedWeakHashMap synchronizedWeakHashMap;
                KLog kLog2 = KLog.INSTANCE;
                if (kLog2.isAtLeast(Severity.INFO)) {
                    kLog2.print(4, "DivVisibilityActionTracker", "dispatchActions: id=" + CollectionsKt.joinToString$default(logIds.keySet(), null, null, null, 0, null, null, 63, null));
                }
                weakHashMap = DivVisibilityActionTracker.this.appearedForDisappearActions;
                Set waitingActions = (Set) weakHashMap.get(view);
                if (waitingActions != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof M4) {
                            arrayList.add(obj);
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(waitingActions, "waitingActions");
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        waitingActions.remove((M4) obj2);
                    }
                    if (waitingActions.isEmpty()) {
                        weakHashMap2 = DivVisibilityActionTracker.this.appearedForDisappearActions;
                        weakHashMap2.remove(view);
                        synchronizedWeakHashMap = DivVisibilityActionTracker.this.divWithWaitingDisappearActions;
                        synchronizedWeakHashMap.remove(view);
                    }
                }
                if (Intrinsics.areEqual(div2View.getLogId(), logId)) {
                    divVisibilityActionDispatcher = DivVisibilityActionTracker.this.visibilityActionDispatcher;
                    divVisibilityActionDispatcher.dispatchActions(div2View, expressionResolver, view, (Xb[]) logIds.values().toArray(new Xb[0]));
                }
            }
        }, logIds, j4);
    }

    private void trackViewsHierarchy(BindingContext bindingContext, View view, Z z4, Function2<? super View, ? super Z, Boolean> function2) {
        if (((Boolean) function2.invoke(view, z4)).booleanValue() && (view instanceof ViewGroup)) {
            for (View view2 : AbstractC1293g0.b((ViewGroup) view)) {
                trackViewsHierarchy(bindingContext, view2, bindingContext.getDivView().takeBindingDiv$div_release(view2), function2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackVisibilityActions(Div2View div2View, ExpressionResolver expressionResolver, View view, Z z4, List<Wf> list, List<M4> list2) {
        DivVisibilityActionTracker divVisibilityActionTracker = this;
        ExpressionResolver expressionResolver2 = expressionResolver;
        View view2 = view;
        Assert.assertMainThread();
        int calculateVisibilityPercentage = divVisibilityActionTracker.viewVisibilityCalculator.calculateVisibilityPercentage(view2);
        divVisibilityActionTracker.updateVisibility(view2, z4, calculateVisibilityPercentage);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long valueOf = Long.valueOf(DivSightExtensionsKt.getDuration((Wf) obj).evaluate(expressionResolver2).longValue());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list3 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list3.size());
            for (Object obj3 : list3) {
                int i4 = calculateVisibilityPercentage;
                if (divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver2, view2, (Wf) obj3, calculateVisibilityPercentage, divVisibilityActionTracker.appearTrackedTokens)) {
                    arrayList.add(obj3);
                }
                expressionResolver2 = expressionResolver;
                view2 = view;
                calculateVisibilityPercentage = i4;
            }
            int i5 = calculateVisibilityPercentage;
            if (arrayList.isEmpty()) {
                expressionResolver2 = expressionResolver;
                view2 = view;
            } else {
                expressionResolver2 = expressionResolver;
                view2 = view;
                divVisibilityActionTracker.startTracking(div2View, expressionResolver2, view2, arrayList, longValue, divVisibilityActionTracker.appearTrackedTokens);
            }
            calculateVisibilityPercentage = i5;
        }
        int i6 = calculateVisibilityPercentage;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj4 : list2) {
            Long valueOf2 = Long.valueOf(DivSightExtensionsKt.getDuration((M4) obj4).evaluate(expressionResolver2).longValue());
            Object obj5 = linkedHashMap2.get(valueOf2);
            if (obj5 == null) {
                obj5 = new ArrayList();
                linkedHashMap2.put(valueOf2, obj5);
            }
            ((List) obj5).add(obj4);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long longValue2 = ((Number) entry2.getKey()).longValue();
            List list4 = (List) entry2.getValue();
            List<M4> list5 = list4;
            boolean z5 = false;
            for (M4 m4 : list5) {
                boolean z6 = z5;
                z5 = true;
                boolean z7 = ((long) i6) > ((Number) m4.f3841k.evaluate(expressionResolver2)).longValue();
                if (!z6 && !z7) {
                    z5 = false;
                }
                if (z7) {
                    WeakHashMap<View, Set<M4>> weakHashMap = divVisibilityActionTracker.appearedForDisappearActions;
                    Set<M4> set = weakHashMap.get(view2);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        weakHashMap.put(view2, set);
                    }
                    set.add(m4);
                }
            }
            if (z5) {
                divVisibilityActionTracker.divWithWaitingDisappearActions.put(view2, z4);
            }
            ArrayList arrayList2 = new ArrayList(list4.size());
            for (Object obj6 : list5) {
                if (divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver2, view2, (M4) obj6, i6, divVisibilityActionTracker.disappearTrackedTokens)) {
                    arrayList2.add(obj6);
                }
                expressionResolver2 = expressionResolver;
                view2 = view;
            }
            if (!arrayList2.isEmpty()) {
                divVisibilityActionTracker.startTracking(div2View, expressionResolver, view, arrayList2, longValue2, divVisibilityActionTracker.disappearTrackedTokens);
            }
            divVisibilityActionTracker = this;
            expressionResolver2 = expressionResolver;
            view2 = view;
        }
    }

    public static /* synthetic */ void trackVisibilityActionsOf$default(DivVisibilityActionTracker divVisibilityActionTracker, Div2View div2View, ExpressionResolver expressionResolver, View view, Z z4, List list, List list2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityActionsOf");
        }
        if ((i4 & 16) != 0) {
            list = BaseDivViewExtensionsKt.getAllAppearActions(z4.b());
        }
        List list3 = list;
        if ((i4 & 32) != 0) {
            list2 = BaseDivViewExtensionsKt.getAllDisappearActions(z4.b());
        }
        divVisibilityActionTracker.trackVisibilityActionsOf(div2View, expressionResolver, view, z4, list3, list2);
    }

    private void updateVisibility(View view, Z z4, int i4) {
        if (i4 > 0) {
            this.visibleActions.put(view, z4);
        } else {
            this.visibleActions.remove(view);
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVisibilityTask$lambda$0(DivVisibilityActionTracker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.visibilityActionDispatcher.dispatchVisibleViewsChanged(this$0.visibleActions);
        this$0.hasPostedUpdateVisibilityTask = false;
    }

    public void cancelTrackingViewsHierarchy(@NotNull BindingContext context, @NotNull View root, @Nullable Z z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(root, "root");
        trackViewsHierarchy(context, root, z4, new DivVisibilityActionTracker$cancelTrackingViewsHierarchy$1(this, context));
    }

    @NotNull
    public Map<View, Z> getDivWithWaitingDisappearActions() {
        return this.divWithWaitingDisappearActions.createMap();
    }

    public void startTrackingViewsHierarchy(@NotNull BindingContext context, @NotNull View root, @Nullable Z z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(root, "root");
        trackViewsHierarchy(context, root, z4, new DivVisibilityActionTracker$startTrackingViewsHierarchy$1(this, context));
    }

    public void trackDetachedView(@NotNull BindingContext context, @NotNull View view, @NotNull Z div) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        List a4 = div.b().a();
        if (a4 == null) {
            return;
        }
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        trackVisibilityActions(context.getDivView(), expressionResolver, view, div, CollectionsKt.emptyList(), BaseDivViewExtensionsKt.filterEnabled(a4, expressionResolver));
    }

    public void trackVisibilityActionsOf(@NotNull final Div2View scope, @NotNull final ExpressionResolver resolver, @Nullable final View view, @NotNull final Z div, @NotNull final List<Wf> appearActions, @NotNull final List<M4> disappearActions) {
        View farthestLayoutCaller;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(appearActions, "appearActions");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        List<M4> list = disappearActions;
        final List<? extends Xb> plus = CollectionsKt.plus((Collection) appearActions, (Iterable) list);
        if (plus.isEmpty()) {
            return;
        }
        final DivDataTag dataTag = scope.getDataTag();
        if (view == null) {
            this.isEnabledObserver.cancelObserving(plus);
            Iterator<T> it = appearActions.iterator();
            while (it.hasNext()) {
                shouldTrackVisibilityAction(scope, resolver, null, (Wf) it.next(), 0, this.appearTrackedTokens);
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                shouldTrackVisibilityAction(scope, resolver, null, (M4) it2.next(), 0, this.disappearTrackedTokens);
            }
            return;
        }
        if (this.enqueuedVisibilityActions.containsKey(view)) {
            return;
        }
        if (ViewsKt.isHierarchyLaidOut(view) && !view.isLayoutRequested()) {
            if (Intrinsics.areEqual(scope.getDataTag(), dataTag)) {
                this.isEnabledObserver.observe(view, scope, resolver, div, plus);
                trackVisibilityActions(scope, resolver, view, div, BaseDivViewExtensionsKt.filterEnabled(appearActions, resolver), BaseDivViewExtensionsKt.filterEnabled(disappearActions, resolver));
            }
            this.enqueuedVisibilityActions.remove(view);
            return;
        }
        farthestLayoutCaller = ViewsKt.farthestLayoutCaller(view);
        if (farthestLayoutCaller != null) {
            farthestLayoutCaller.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    if (Intrinsics.areEqual(Div2View.this.getDataTag(), dataTag)) {
                        this.isEnabledObserver.observe(view, Div2View.this, resolver, div, plus);
                        DivVisibilityActionTracker divVisibilityActionTracker = this;
                        Div2View div2View = Div2View.this;
                        ExpressionResolver expressionResolver = resolver;
                        divVisibilityActionTracker.trackVisibilityActions(div2View, expressionResolver, view, div, BaseDivViewExtensionsKt.filterEnabled(appearActions, expressionResolver), BaseDivViewExtensionsKt.filterEnabled(disappearActions, resolver));
                    }
                    this.enqueuedVisibilityActions.remove(view);
                }
            });
            Unit unit = Unit.f41027a;
        }
        this.enqueuedVisibilityActions.put(view, div);
    }

    public void updateVisibleViews(@NotNull List<? extends View> viewList) {
        Intrinsics.checkNotNullParameter(viewList, "viewList");
        Iterator<Map.Entry<View, Z>> it = this.visibleActions.entrySet().iterator();
        while (it.hasNext()) {
            if (!viewList.contains(it.next().getKey())) {
                it.remove();
            }
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }
}
