package com.yandex.div.core.view2.divs;

import O1.Bc;
import O1.C0892k0;
import O1.C1127x2;
import O1.EnumC0717a4;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.EnumC1163z2;
import O1.InterfaceC0752c3;
import O1.Z;
import O1.Z3;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div.state.DivStateCache;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC3204l;
import k0.AbstractC3206n;
import k0.C3208p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivStateBinder extends DivViewBinder<Z.o, Bc, DivStateLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    @NotNull
    private final V1.a viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStateBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull V1.a viewBinder, @NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryStateCache, @NotNull DivActionBinder divActionBinder, @NotNull DivActionBeaconSender divActionBeaconSender, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull ErrorCollectors errorCollectors, @NotNull TwoWayStringVariableBinder variableBinder, @NotNull DivRuntimeVisitor runtimeVisitor) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(divStateCache, "divStateCache");
        Intrinsics.checkNotNullParameter(temporaryStateCache, "temporaryStateCache");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        Intrinsics.checkNotNullParameter(divActionBeaconSender, "divActionBeaconSender");
        Intrinsics.checkNotNullParameter(divPatchManager, "divPatchManager");
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        Intrinsics.checkNotNullParameter(div2Logger, "div2Logger");
        Intrinsics.checkNotNullParameter(divVisibilityActionTracker, "divVisibilityActionTracker");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        Intrinsics.checkNotNullParameter(variableBinder, "variableBinder");
        Intrinsics.checkNotNullParameter(runtimeVisitor, "runtimeVisitor");
        this.baseBinder = baseBinder;
        this.viewCreator = viewCreator;
        this.viewBinder = viewBinder;
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryStateCache;
        this.divActionBinder = divActionBinder;
        this.divActionBeaconSender = divActionBeaconSender;
        this.divPatchManager = divPatchManager;
        this.divPatchCache = divPatchCache;
        this.div2Logger = div2Logger;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.errorCollectors = errorCollectors;
        this.variableBinder = variableBinder;
        this.runtimeVisitor = runtimeVisitor;
    }

    private final void bind(DivStateLayout divStateLayout, BindingContext bindingContext, Bc bc, Bc bc2, Bc.c cVar, DivStatePath divStatePath) {
        DivStateLayout divStateLayout2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        fixAlignment(divStateLayout, bc, bc2, expressionResolver);
        observeStateIdVariable(divStateLayout, bc, bindingContext, divStatePath);
        DivStateBinder$bind$1$1 divStateBinder$bind$1$1 = null;
        BaseDivViewExtensionsKt.bindClipChildren(divStateLayout, bc.f1512h, bc2 != null ? bc2.f1512h : null, expressionResolver);
        List list = cVar.f1538e;
        if (list != null) {
            divStateLayout2 = divStateLayout;
            divStateBinder$bind$1$1 = new DivStateBinder$bind$1$1(this, divStateLayout2, bindingContext, expressionResolver, list);
        } else {
            divStateLayout2 = divStateLayout;
        }
        divStateLayout2.setSwipeOutCallback(divStateBinder$bind$1$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindState(DivStateLayout divStateLayout, BindingContext bindingContext, Bc bc, Bc.c cVar, Bc bc2, Bc.c cVar2, Z z4, DivStatePath divStatePath, ExpressionResolver expressionResolver, String str) {
        BindingContext bindingContext2;
        Bc.c cVar3;
        Bc bc3;
        Div2View div2View;
        DivStatePath divStatePath2;
        ExpressionResolver expressionResolver2;
        View view;
        boolean z5;
        ExpressionResolver expressionResolver3;
        Div2View div2View2;
        final Z z6;
        BindingContext bindingContext3;
        ExpressionResolver expressionResolver4;
        Z z7;
        Div2View div2View3;
        Bc bc4;
        InterfaceC0752c3 b4;
        String id;
        List<View> buildViewsForId;
        View view2;
        Z z8;
        View view3;
        BindingContext bindingContext4;
        Bc bc5;
        Bc.c cVar4;
        ReusableTokenList currentRebindReusableList$div_release;
        DivStateBinder divStateBinder = this;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver5 = bindingContext.getExpressionResolver();
        DivStatePath append = divStatePath.append(str, cVar.f1537d);
        Z z9 = cVar.f1536c;
        InterfaceC0752c3 b5 = z9 != null ? z9.b() : null;
        View childAt = divStateLayout.getChildCount() != 0 ? divStateLayout.getChildAt(0) : null;
        View uniqueViewForDiv = (z9 == null || (currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release()) == null) ? null : currentRebindReusableList$div_release.getUniqueViewForDiv(z9);
        if (Intrinsics.areEqual(divStateLayout.getStateId(), cVar.f1537d)) {
            bindingContext2 = bindingContext;
            cVar3 = cVar;
            bc3 = bc;
            if (b5 != null) {
                if (childAt == null || expressionResolver == null) {
                    div2View = divView;
                    divStatePath2 = append;
                    expressionResolver2 = expressionResolver5;
                } else {
                    div2View = divView;
                    divStatePath2 = append;
                    expressionResolver2 = expressionResolver5;
                    if (DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, z4, z9, expressionResolver, expressionResolver5, null, 16, null)) {
                        z5 = true;
                        view = !z5 ? childAt : divStateBinder.getIncomingView(uniqueViewForDiv, z9, expressionResolver2);
                        if (!z5) {
                            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                            divStateLayout.addView(view);
                        }
                        if (view != null) {
                            ((DivBinder) divStateBinder.viewBinder.get()).bind(bindingContext2, view, z9, divStatePath2);
                        }
                    }
                }
                z5 = false;
                if (!z5) {
                }
                if (!z5) {
                }
                if (view != null) {
                }
            } else {
                div2View = divView;
                divStatePath2 = append;
                expressionResolver2 = expressionResolver5;
                ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                view = null;
            }
        } else {
            if (z9 != null) {
                view3 = divStateBinder.getIncomingView(uniqueViewForDiv, z9, expressionResolver5);
                bc5 = bc;
                cVar4 = cVar2;
                bindingContext4 = bindingContext;
            } else {
                view3 = null;
                bindingContext4 = bindingContext;
                bc5 = bc;
                cVar4 = cVar2;
            }
            AbstractC3204l replaceViewsAnimated = divStateBinder.replaceViewsAnimated(bindingContext4, bc5, cVar, cVar4, view3, childAt);
            cVar3 = cVar;
            bc3 = bc5;
            bindingContext2 = bindingContext4;
            view = view3;
            if (replaceViewsAnimated != null) {
                AbstractC3206n.c(divStateLayout);
                SceneRootWatcher.INSTANCE.watchFor(divStateLayout, replaceViewsAnimated);
                AbstractC3206n.a(divStateLayout, replaceViewsAnimated);
            }
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, divView);
            if (view != null) {
                divStateLayout.addView(view);
                if (z9 != null) {
                    ((DivBinder) divStateBinder.viewBinder.get()).bind(bindingContext2, view, z9, append);
                }
            }
            if (childAt != null) {
                divView.getDivTransitionHandler$div_release().runTransitions(divStateLayout, false);
            }
            div2View = divView;
            divStatePath2 = append;
            expressionResolver2 = expressionResolver5;
        }
        if (childAt != null) {
            childAt.startAnimation(new AnimationSet(false));
            if (!Intrinsics.areEqual(bc2, bc3) || !Intrinsics.areEqual(cVar3, cVar2)) {
                div2View.unbindViewFromDiv$div_release(childAt);
                if (z4 != null && expressionResolver != null) {
                    expressionResolver3 = expressionResolver2;
                    div2View2 = div2View;
                    z6 = z9;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divStateBinder.divVisibilityActionTracker, div2View2, expressionResolver, null, z4, null, null, 48, null);
                    divStateBinder.untrackRecursively(childAt, div2View2, expressionResolver);
                    if (view != null || b5 == null || (b5.q() == null && b5.c() == null)) {
                        bindingContext3 = bindingContext2;
                        expressionResolver4 = expressionResolver3;
                        z7 = z6;
                        div2View3 = div2View2;
                        bc4 = bc3;
                    } else {
                        div2View2.bindViewToDiv$div_release(view, z6);
                        bindingContext3 = bindingContext2;
                        final Div2View div2View4 = div2View2;
                        bc4 = bc3;
                        final ExpressionResolver expressionResolver6 = expressionResolver3;
                        final View view4 = view;
                        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindState$$inlined$doOnNextLayout$1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(@NotNull View view5, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                                DivVisibilityActionTracker divVisibilityActionTracker;
                                view5.removeOnLayoutChangeListener(this);
                                divVisibilityActionTracker = DivStateBinder.this.divVisibilityActionTracker;
                                DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, div2View4, expressionResolver6, view4, z6, null, null, 48, null);
                            }
                        };
                        divStateBinder = this;
                        expressionResolver4 = expressionResolver6;
                        z7 = z6;
                        div2View3 = div2View4;
                        view4.addOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    if (z4 != null && (b4 = z4.b()) != null && (id = b4.getId()) != null) {
                        buildViewsForId = divStateBinder.divPatchManager.buildViewsForId(bindingContext3, id);
                        if (buildViewsForId != null) {
                            if (buildViewsForId.size() > 1) {
                                KLog kLog = KLog.INSTANCE;
                                if (kLog.isAtLeast(Severity.ERROR)) {
                                    kLog.print(6, "DivStateBinder", "Unable to patch state because there is more than 1 div in the patch");
                                }
                            } else {
                                view2 = (View) CollectionsKt.firstOrNull((List) buildViewsForId);
                                List<Z> patchDivListById = divStateBinder.divPatchCache.getPatchDivListById(div2View3.getDataTag(), id);
                                z8 = patchDivListById != null ? (Z) CollectionsKt.firstOrNull((List) patchDivListById) : null;
                                if (view2 != null && z8 != null) {
                                    ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View3);
                                    divStateLayout.addView(view2);
                                    if (BaseDivViewExtensionsKt.getHasSightActions(z8.b())) {
                                        div2View3.bindViewToDiv$div_release(view2, z8);
                                    }
                                    ((DivBinder) divStateBinder.viewBinder.get()).bind(bindingContext3, view2, z8, divStatePath2);
                                }
                            }
                        }
                        view2 = null;
                        List<Z> patchDivListById2 = divStateBinder.divPatchCache.getPatchDivListById(div2View3.getDataTag(), id);
                        z8 = patchDivListById2 != null ? (Z) CollectionsKt.firstOrNull((List) patchDivListById2) : null;
                        if (view2 != null) {
                            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View3);
                            divStateLayout.addView(view2);
                            if (BaseDivViewExtensionsKt.getHasSightActions(z8.b())) {
                            }
                            ((DivBinder) divStateBinder.viewBinder.get()).bind(bindingContext3, view2, z8, divStatePath2);
                        }
                    }
                    divStateLayout.setActiveStateDiv$div_release(z7);
                    divStateLayout.setPath(divStatePath2);
                    if (childAt == null) {
                        divStateBinder.runtimeVisitor.createAndAttachRuntimesToState(div2View3, bc4, divStatePath, expressionResolver4);
                        return;
                    }
                    return;
                }
            }
        }
        expressionResolver3 = expressionResolver2;
        div2View2 = div2View;
        z6 = z9;
        if (view != null) {
        }
        bindingContext3 = bindingContext2;
        expressionResolver4 = expressionResolver3;
        z7 = z6;
        div2View3 = div2View2;
        bc4 = bc3;
        if (z4 != null) {
            buildViewsForId = divStateBinder.divPatchManager.buildViewsForId(bindingContext3, id);
            if (buildViewsForId != null) {
            }
            view2 = null;
            List<Z> patchDivListById22 = divStateBinder.divPatchCache.getPatchDivListById(div2View3.getDataTag(), id);
            z8 = patchDivListById22 != null ? (Z) CollectionsKt.firstOrNull((List) patchDivListById22) : null;
            if (view2 != null) {
            }
        }
        divStateLayout.setActiveStateDiv$div_release(z7);
        divStateLayout.setPath(divStatePath2);
        if (childAt == null) {
        }
    }

    private final void createLayoutParams(View view) {
        view.setLayoutParams(new DivLayoutParams(-1, -2));
    }

    private final void fixAlignment(DivStateLayout divStateLayout, Bc bc, Bc bc2, ExpressionResolver expressionResolver) {
        EnumC1091v2 alignmentHorizontal;
        EnumC1109w2 enumC1109w2;
        Expression l4 = bc.l();
        Expression s4 = bc.s();
        EnumC1109w2 enumC1109w22 = null;
        if (Intrinsics.areEqual(l4, bc2 != null ? bc2.l() : null)) {
            if (Intrinsics.areEqual(s4, bc2 != null ? bc2.s() : null)) {
                return;
            }
        }
        if (l4 == null || (alignmentHorizontal = (EnumC1091v2) l4.evaluate(expressionResolver)) == null) {
            Z3 extractParentContentAlignmentHorizontal = BaseDivViewExtensionsKt.extractParentContentAlignmentHorizontal(divStateLayout, expressionResolver);
            alignmentHorizontal = extractParentContentAlignmentHorizontal != null ? BaseDivViewExtensionsKt.toAlignmentHorizontal(extractParentContentAlignmentHorizontal) : null;
        }
        if (s4 == null || (enumC1109w2 = (EnumC1109w2) s4.evaluate(expressionResolver)) == null) {
            EnumC0717a4 extractParentContentAlignmentVertical = BaseDivViewExtensionsKt.extractParentContentAlignmentVertical(divStateLayout, expressionResolver);
            if (extractParentContentAlignmentVertical != null) {
                enumC1109w22 = BaseDivViewExtensionsKt.toAlignmentVertical(extractParentContentAlignmentVertical);
            }
        } else {
            enumC1109w22 = enumC1109w2;
        }
        BaseDivViewExtensionsKt.applyAlignment(divStateLayout, alignmentHorizontal, enumC1109w22);
    }

    private final View getIncomingView(View view, Z z4, ExpressionResolver expressionResolver) {
        if (view != null) {
            return view;
        }
        View create = this.viewCreator.create(z4, expressionResolver);
        createLayoutParams(create);
        return create;
    }

    private final Pair<Bc.c, Bc.c> getStates(Bc bc, BindingContext bindingContext, DivStateLayout divStateLayout, DivStatePath divStatePath, String str) {
        Object obj;
        String id = bindingContext.getDivView().getDivTag().getId();
        Intrinsics.checkNotNullExpressionValue(id, "context.divView.divTag.id");
        String str2 = divStatePath.getStatesString$div_release() + '/' + str;
        String state = this.temporaryStateCache.getState(id, str2);
        if (state == null) {
            state = this.divStateCache.getState(id, str2);
        }
        Object obj2 = null;
        if (state != null) {
            Function1<String, Unit> variableUpdater = divStateLayout.getVariableUpdater();
            if (variableUpdater != null) {
                variableUpdater.invoke(state);
            }
        } else {
            String str3 = bc.f1528x;
            state = str3 != null ? getValueFromVariable(bindingContext, str3) : null;
        }
        Iterator it = bc.f1529y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Bc.c) obj).f1537d, divStateLayout.getStateId())) {
                break;
            }
        }
        Bc.c cVar = (Bc.c) obj;
        if (cVar == null) {
            cVar = DivUtilKt.getDefaultState(bc, bindingContext.getExpressionResolver());
        }
        Iterator it2 = bc.f1529y.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.areEqual(((Bc.c) next).f1537d, state)) {
                obj2 = next;
                break;
            }
        }
        Bc.c cVar2 = (Bc.c) obj2;
        if (cVar2 == null) {
            cVar2 = DivUtilKt.getDefaultState(bc, bindingContext.getExpressionResolver());
        }
        return new Pair<>(cVar, cVar2);
    }

    private final String getValueFromVariable(BindingContext bindingContext, String str) {
        Variable mutableVariable;
        Object value;
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null || (mutableVariable = variableController.getMutableVariable(str)) == null || (value = mutableVariable.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    private final void observeStateIdVariable(final DivStateLayout divStateLayout, final Bc bc, final BindingContext bindingContext, final DivStatePath divStatePath) {
        String str = bc.f1528x;
        if (str == null) {
            return;
        }
        divStateLayout.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$observeStateIdVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1<? super String, Unit> valueUpdater) {
                Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
                DivStateLayout.this.setVariableUpdater(valueUpdater);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable String str2) {
                if (str2 == null || DivStateLayout.this.getStateId() == null || Intrinsics.areEqual(str2, DivStateLayout.this.getStateId())) {
                    return;
                }
                bindingContext.getDivView().switchToState(divStatePath.append(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, bc, null, 1, null), str2), true);
            }
        }, divStatePath));
    }

    private final AbstractC3204l replaceViewsAnimated(BindingContext bindingContext, Bc bc, Bc.c cVar, Bc.c cVar2, View view, View view2) {
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        Z z4;
        Z z5;
        if (view2 == null || (bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(view2)) == null || (expressionResolver = bindingContext2.getExpressionResolver()) == null) {
            return setupAnimation(bindingContext, cVar, cVar2, view, view2);
        }
        ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        return (!DivTransitionsKt.allowsTransitionsOnStateChange(bc, expressionResolver2) || ((cVar2 == null || (z5 = cVar2.f1536c) == null || !DivUtilKt.containsStateInnerTransitions(z5, expressionResolver)) && ((z4 = cVar.f1536c) == null || !DivUtilKt.containsStateInnerTransitions(z4, expressionResolver2)))) ? setupAnimation(bindingContext, cVar, cVar2, view, view2) : setupTransitions(bindingContext.getDivView().getViewComponent$div_release().getTransitionBuilder(), bindingContext.getDivView().getViewComponent$div_release().getStateTransitionHolder(), cVar, cVar2, expressionResolver2, expressionResolver);
    }

    private final AbstractC3204l setupAnimation(BindingContext bindingContext, Bc.c cVar, Bc.c cVar2, View view, View view2) {
        List<C1127x2> list;
        AbstractC3204l transition;
        BindingContext bindingContext2;
        List<C1127x2> list2;
        AbstractC3204l transition2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        C1127x2 c1127x2 = cVar.f1534a;
        ExpressionResolver expressionResolver2 = null;
        C1127x2 c1127x22 = cVar2 != null ? cVar2.f1535b : null;
        if (c1127x2 == null && c1127x22 == null) {
            return null;
        }
        C3208p c3208p = new C3208p();
        if (c1127x2 != null && view != null) {
            if (c1127x2.f8406e.evaluate(expressionResolver) != C1127x2.c.SET) {
                list2 = CollectionsKt.listOf(c1127x2);
            } else {
                list2 = c1127x2.f8405d;
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
            }
            for (C1127x2 c1127x23 : list2) {
                transition2 = DivStateBinderKt.toTransition(c1127x23, true, expressionResolver);
                if (transition2 != null) {
                    c3208p.p(transition2.addTarget(view).setDuration(((Number) c1127x23.f8402a.evaluate(expressionResolver)).longValue()).setStartDelay(((Number) c1127x23.f8408g.evaluate(expressionResolver)).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) c1127x23.f8404c.evaluate(expressionResolver))));
                }
            }
        }
        if (view2 != null && (bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(view2)) != null) {
            expressionResolver2 = bindingContext2.getExpressionResolver();
        }
        if (c1127x22 != null && expressionResolver2 != null) {
            if (c1127x22.f8406e.evaluate(expressionResolver2) != C1127x2.c.SET) {
                list = CollectionsKt.listOf(c1127x22);
            } else {
                list = c1127x22.f8405d;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
            }
            for (C1127x2 c1127x24 : list) {
                transition = DivStateBinderKt.toTransition(c1127x24, false, expressionResolver2);
                if (transition != null) {
                    c3208p.p(transition.addTarget(view2).setDuration(((Number) c1127x24.f8402a.evaluate(expressionResolver2)).longValue()).setStartDelay(((Number) c1127x24.f8408g.evaluate(expressionResolver2)).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) c1127x24.f8404c.evaluate(expressionResolver2))));
                }
            }
        }
        if (view2 != null) {
            view2.clearAnimation();
        }
        return c3208p;
    }

    private final AbstractC3204l setupTransitions(DivTransitionBuilder divTransitionBuilder, DivStateTransitionHolder divStateTransitionHolder, Bc.c cVar, Bc.c cVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        DivTreeWalk walk;
        DivTreeWalk onEnter;
        Z z4;
        DivTreeWalk walk2;
        DivTreeWalk onEnter2;
        Sequence<DivItemBuilderResult> sequence = null;
        if (Intrinsics.areEqual(cVar, cVar2)) {
            return null;
        }
        Sequence<DivItemBuilderResult> p4 = (cVar2 == null || (z4 = cVar2.f1536c) == null || (walk2 = DivTreeWalkKt.walk(z4, expressionResolver2)) == null || (onEnter2 = walk2.onEnter(DivStateBinder$setupTransitions$transition$1.INSTANCE)) == null) ? null : k.p(onEnter2, DivStateBinder$setupTransitions$transition$2.INSTANCE);
        Z z5 = cVar.f1536c;
        if (z5 != null && (walk = DivTreeWalkKt.walk(z5, expressionResolver)) != null && (onEnter = walk.onEnter(DivStateBinder$setupTransitions$transition$3.INSTANCE)) != null) {
            sequence = k.p(onEnter, DivStateBinder$setupTransitions$transition$4.INSTANCE);
        }
        C3208p buildTransitions = divTransitionBuilder.buildTransitions(p4, sequence, expressionResolver2, expressionResolver);
        divStateTransitionHolder.append(buildTransitions);
        return buildTransitions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeOut(DivStateLayout divStateLayout, Div2View div2View, ExpressionResolver expressionResolver, List<C0892k0> list) {
        div2View.bulkActions$div_release(new DivStateBinder$swipeOut$1(this, div2View, expressionResolver, list, divStateLayout));
    }

    private final void untrackRecursively(View view, Div2View div2View, ExpressionResolver expressionResolver) {
        Div2View div2View2;
        ExpressionResolver expressionResolver2;
        if (view instanceof ViewGroup) {
            for (View view2 : AbstractC1293g0.b((ViewGroup) view)) {
                Z unbindViewFromDiv$div_release = div2View.unbindViewFromDiv$div_release(view2);
                if (unbindViewFromDiv$div_release != null) {
                    div2View2 = div2View;
                    expressionResolver2 = expressionResolver;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View2, expressionResolver2, null, unbindViewFromDiv$div_release, null, null, 48, null);
                } else {
                    div2View2 = div2View;
                    expressionResolver2 = expressionResolver;
                }
                untrackRecursively(view2, div2View2, expressionResolver2);
                div2View = div2View2;
                expressionResolver = expressionResolver2;
            }
        }
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivStateLayout view, @NotNull Z.o div, @NotNull DivStatePath path) {
        Bc bc;
        DivStateBinder divStateBinder;
        BindingContext bindingContext;
        DivStateLayout divStateLayout;
        DivStatePath divStatePath;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        Bc c4 = div.c();
        Z.o div2 = view.getDiv();
        BindingContext bindingContext2 = view.getBindingContext();
        ExpressionResolver expressionResolver = bindingContext2 != null ? bindingContext2.getExpressionResolver() : null;
        String id$div_release = DivPathUtils.INSTANCE.getId$div_release(c4, new DivStateBinder$bindView$id$1(this, context, path));
        Pair<Bc.c, Bc.c> states = getStates(c4, context, view, path, id$div_release);
        Bc.c component1 = states.component1();
        Bc.c component2 = states.component2();
        if (component1 == null || component2 == null) {
            return;
        }
        Z activeStateDiv$div_release = view.getActiveStateDiv$div_release();
        if (div2 != div) {
            this.baseBinder.bindView(context, view, div, activeStateDiv$div_release);
            if (div2 != null) {
                bc = div2.c();
                bindingContext = context;
                divStateLayout = view;
                divStatePath = path;
                divStateBinder = this;
            } else {
                bc = null;
                divStateBinder = this;
                bindingContext = context;
                divStateLayout = view;
                divStatePath = path;
            }
            divStateBinder.bind(divStateLayout, bindingContext, c4, bc, component2, divStatePath);
        }
        bindState(view, context, c4, component2, div2 != null ? div2.c() : null, component1, activeStateDiv$div_release, path, expressionResolver, id$div_release);
    }
}
