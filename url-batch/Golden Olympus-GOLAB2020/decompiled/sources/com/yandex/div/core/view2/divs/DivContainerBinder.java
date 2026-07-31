package com.yandex.div.core.view2.divs;

import O1.C0754c5;
import O1.EnumC0717a4;
import O1.EnumC0779dc;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.H3;
import O1.InterfaceC0752c3;
import O1.R3;
import O1.T2;
import O1.X4;
import O1.Yb;
import O1.Z;
import O1.Z3;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import com.ironsource.b9;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivContainerBinder extends DivViewBinder<Z.c, R3, ViewGroup> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final V1.a divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final V1.a divViewCreator;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Rect tempRect;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[R3.d.values().length];
            try {
                iArr[R3.d.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivContainerBinder(@NotNull DivBaseBinder baseBinder, @NotNull V1.a divViewCreator, @NotNull DivPatchManager divPatchManager, @NotNull V1.a divBinder, @NotNull ErrorCollectors errorCollectors) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        Intrinsics.checkNotNullParameter(divPatchManager, "divPatchManager");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.baseBinder = baseBinder;
        this.divViewCreator = divViewCreator;
        this.divPatchManager = divPatchManager;
        this.divBinder = divBinder;
        this.errorCollectors = errorCollectors;
        this.tempRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyChildAlignment(View view, R3 r32, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Expression l4 = interfaceC0752c3.l();
        EnumC1109w2 enumC1109w2 = null;
        EnumC1091v2 alignmentHorizontal = l4 != null ? (EnumC1091v2) l4.evaluate(expressionResolver2) : BaseDivViewExtensionsKt.isWrapContainer(r32, expressionResolver) ? null : BaseDivViewExtensionsKt.toAlignmentHorizontal((Z3) r32.f4552o.evaluate(expressionResolver));
        Expression s4 = interfaceC0752c3.s();
        if (s4 != null) {
            enumC1109w2 = (EnumC1109w2) s4.evaluate(expressionResolver2);
        } else if (!BaseDivViewExtensionsKt.isWrapContainer(r32, expressionResolver)) {
            enumC1109w2 = BaseDivViewExtensionsKt.toAlignmentVertical((EnumC0717a4) r32.f4553p.evaluate(expressionResolver));
        }
        BaseDivViewExtensionsKt.applyAlignment(view, alignmentHorizontal, enumC1109w2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItems(ViewGroup viewGroup, BindingContext bindingContext, R3 r32, R3 r33, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath, ErrorCollector errorCollector) {
        RebindUtilsKt.tryRebindPlainContainerChildren(viewGroup, bindingContext.getDivView(), list, this.divViewCreator);
        validateChildren(viewGroup, r32, list, bindingContext.getExpressionResolver(), errorCollector);
        dispatchItems(viewGroup, bindingContext, r32, r33, list, list2, divStatePath);
    }

    private final List<Z> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Z z4, int i4) {
        String id = z4.b().getId();
        if (id == null) {
            return CollectionsKt.listOf(z4);
        }
        Map<Z, View> createViewsForId = this.divPatchManager.createViewsForId(bindingContext, id);
        if (createViewsForId == null) {
            return CollectionsKt.listOf(z4);
        }
        viewGroup.removeViewAt(i4);
        Iterator<Map.Entry<Z, View>> it = createViewsForId.entrySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i5 + i4);
            i5++;
        }
        return CollectionsKt.toList(createViewsForId.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindChild(View view, BindingContext bindingContext, Z z4, ExpressionResolver expressionResolver, R3 r32, R3 r33, DivStatePath divStatePath, int i4) {
        ExpressionResolverImpl expressionResolver2;
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        Z div = divHolderView != null ? divHolderView.getDiv() : null;
        DivStatePath resolvePath = BaseDivViewExtensionsKt.resolvePath(z4.b(), i4, divStatePath);
        Div2View divView = bindingContext.getDivView();
        RuntimeStore runtimeStore = bindingContext.getRuntimeStore();
        ExpressionsRuntime resolveRuntimeWith$div_release = runtimeStore != null ? runtimeStore.resolveRuntimeWith$div_release(divView, resolvePath.getFullPath$div_release(), z4, expressionResolver, bindingContext.getExpressionResolver()) : null;
        Z z5 = div;
        ExpressionResolver expressionResolver3 = expressionResolver;
        ((DivBinder) this.divBinder.get()).bind(bindingContext.getFor(expressionResolver), view, z4, resolvePath);
        InterfaceC0752c3 b4 = z4.b();
        InterfaceC0752c3 b5 = z5 != null ? z5.b() : null;
        ExpressionResolver expressionResolver4 = bindingContext.getExpressionResolver();
        if (resolveRuntimeWith$div_release != null && (expressionResolver2 = resolveRuntimeWith$div_release.getExpressionResolver()) != null) {
            expressionResolver3 = expressionResolver2;
        }
        bindChildAlignment(view, r32, r33, b4, b5, expressionResolver4, expressionResolver3, ReleasablesKt.getExpressionSubscriber(view), divView);
        if (BaseDivViewExtensionsKt.getHasSightActions(z4.b())) {
            divView.bindViewToDiv$div_release(view, z4);
        } else {
            divView.unbindViewFromDiv$div_release(view);
        }
    }

    private final void bindChildAlignment(View view, R3 r32, R3 r33, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, ExpressionSubscriber expressionSubscriber, Div2View div2View) {
        if (!div2View.getComplexRebindInProgress$div_release() && interfaceC0752c32 != null) {
            if (ExpressionsKt.equalsToConstant(r32.f4552o, r33 != null ? r33.f4552o : null)) {
                if (ExpressionsKt.equalsToConstant(r32.f4553p, r33 != null ? r33.f4553p : null) && ExpressionsKt.equalsToConstant(interfaceC0752c3.l(), interfaceC0752c32.l()) && ExpressionsKt.equalsToConstant(interfaceC0752c3.s(), interfaceC0752c32.s())) {
                    return;
                }
            }
        }
        applyChildAlignment(view, r32, interfaceC0752c3, expressionResolver, expressionResolver2);
        if (ExpressionsKt.isConstant(r32.f4552o) && ExpressionsKt.isConstant(r32.f4553p) && ExpressionsKt.isConstantOrNull(interfaceC0752c3.l()) && ExpressionsKt.isConstantOrNull(interfaceC0752c3.s())) {
            return;
        }
        DivContainerBinder$bindChildAlignment$callback$1 divContainerBinder$bindChildAlignment$callback$1 = new DivContainerBinder$bindChildAlignment$callback$1(this, view, r32, interfaceC0752c3, expressionResolver, expressionResolver2);
        expressionSubscriber.addSubscription(r32.f4552o.observe(expressionResolver, divContainerBinder$bindChildAlignment$callback$1));
        expressionSubscriber.addSubscription(r32.f4553p.observe(expressionResolver, divContainerBinder$bindChildAlignment$callback$1));
        Expression l4 = interfaceC0752c3.l();
        expressionSubscriber.addSubscription(l4 != null ? l4.observe(expressionResolver2, divContainerBinder$bindChildAlignment$callback$1) : null);
        Expression s4 = interfaceC0752c3.s();
        expressionSubscriber.addSubscription(s4 != null ? s4.observe(expressionResolver2, divContainerBinder$bindChildAlignment$callback$1) : null);
    }

    private final void bindItemBuilder(ViewGroup viewGroup, BindingContext bindingContext, R3 r32, DivStatePath divStatePath, ErrorCollector errorCollector) {
        H3 h32 = r32.f4563z;
        if (h32 == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(h32, bindingContext.getExpressionResolver(), new DivContainerBinder$bindItemBuilder$1(h32, bindingContext, viewGroup, this, r32, divStatePath, errorCollector));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r11, r12, r13, null, 4, null) != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindItems(ViewGroup viewGroup, BindingContext bindingContext, R3 r32, R3 r33, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list;
        Div2View divView = bindingContext.getDivView();
        List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(r32, bindingContext.getDivView(), bindingContext.getExpressionResolver());
        Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        List<DivItemBuilderResult> items = ((DivCollectionHolder) viewGroup).getItems();
        if (items == null) {
            for (DivItemBuilderResult divItemBuilderResult : buildItems) {
                viewGroup.addView(((DivViewCreator) this.divViewCreator.get()).create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver()));
            }
        } else if (r32 != r33) {
            if (!divView.getComplexRebindInProgress$div_release()) {
                if (r33 != null) {
                    DivComparator divComparator = DivComparator.INSTANCE;
                    if (DivComparator.areValuesReplaceable$default(divComparator, r33, r32, expressionResolver, bindingContext.getExpressionResolver(), null, 16, null)) {
                    }
                }
                replaceWithReuse(viewGroup, divView, items, buildItems);
            }
            list = null;
            ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
            bindItemBuilder(viewGroup, bindingContext, r32, divStatePath, orCreate);
            applyItems(viewGroup, bindingContext, r32, r33, buildItems, list, divStatePath, orCreate);
        }
        list = items;
        ErrorCollector orCreate2 = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        bindItemBuilder(viewGroup, bindingContext, r32, divStatePath, orCreate2);
        applyItems(viewGroup, bindingContext, r32, r33, buildItems, list, divStatePath, orCreate2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006a, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1 != null ? r1.f4590b : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r1 != null ? r1.f4590b : null, r0 != null ? r0.f4590b : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindLineSeparator(DivWrapLayout divWrapLayout, R3 r32, R3 r33, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Drawable drawable;
        R3.e eVar = r32.f4513D;
        R3.e eVar2 = r33 != null ? r33.f4513D : null;
        if (ExpressionsKt.equalsToConstant(eVar != null ? eVar.f4591c : null, eVar2 != null ? eVar2.f4591c : null)) {
            if (ExpressionsKt.equalsToConstant(eVar != null ? eVar.f4592d : null, eVar2 != null ? eVar2.f4592d : null)) {
            }
        }
        divWrapLayout.setShowLineSeparators(toSeparatorMode(eVar, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(eVar != null ? eVar.f4591c : null)) {
            if (ExpressionsKt.isConstantOrNull(eVar != null ? eVar.f4592d : null)) {
            }
        }
        DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1 divContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1 = new DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1(eVar, expressionResolver, divWrapLayout, this, expressionResolver);
        divWrapLayout.addSubscription((eVar == null || (expression3 = eVar.f4591c) == null) ? null : expression3.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1));
        divWrapLayout.addSubscription((eVar == null || (expression2 = eVar.f4592d) == null) ? null : expression2.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1));
        divWrapLayout.addSubscription((eVar == null || (expression = eVar.f4590b) == null) ? null : expression.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1));
        R3.e eVar3 = r32.f4513D;
        R3.e eVar4 = r33 != null ? r33.f4513D : null;
        if (!DivDataExtensionsKt.equalsToConstant(eVar3 != null ? eVar3.f4593e : null, eVar4 != null ? eVar4.f4593e : null)) {
            X4 x4 = eVar3 != null ? eVar3.f4593e : null;
            if (x4 != null) {
                DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                drawable = BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver);
            } else {
                drawable = null;
            }
            divWrapLayout.setLineSeparatorDrawable(drawable);
            if (!DivDataExtensionsKt.isConstant(eVar3 != null ? eVar3.f4593e : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, eVar3 != null ? eVar3.f4593e : null, expressionResolver, new DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1(eVar3, expressionResolver, divWrapLayout, expressionResolver));
            }
        }
        R3.e eVar5 = r32.f4513D;
        R3.e eVar6 = r33 != null ? r33.f4513D : null;
        if (DivDataExtensionsKt.equalsToConstant(eVar5 != null ? eVar5.f4589a : null, eVar6 != null ? eVar6.f4589a : null)) {
            return;
        }
        C0754c5 c0754c5 = eVar5 != null ? eVar5.f4589a : null;
        Resources resources = divWrapLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Rect rect = toRect(c0754c5, resources, expressionResolver);
        divWrapLayout.setLineSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        C0754c5 c0754c52 = eVar5 != null ? eVar5.f4589a : null;
        if (c0754c52 == null || DivDataExtensionsKt.isConstant(c0754c52)) {
            return;
        }
        DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1 divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1 = new DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1(c0754c52, expressionResolver, this, divWrapLayout, expressionResolver);
        divWrapLayout.addSubscription(c0754c52.f5855f.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1));
        divWrapLayout.addSubscription(c0754c52.f5850a.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1));
        Expression expression4 = c0754c52.f5854e;
        if (expression4 == null && c0754c52.f5851b == null) {
            divWrapLayout.addSubscription(c0754c52.f5852c.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1));
            divWrapLayout.addSubscription(c0754c52.f5853d.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1));
        } else {
            divWrapLayout.addSubscription(expression4 != null ? expression4.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1) : null);
            Expression expression5 = c0754c52.f5851b;
            divWrapLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, divContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1) : null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r5.f4553p, r6 != null ? r6.f4553p : null) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindProperties(DivLinearLayout divLinearLayout, R3 r32, R3 r33, ExpressionResolver expressionResolver) {
        if (!ExpressionsKt.equalsToConstant(r32.f4516G, r33 != null ? r33.f4516G : null)) {
            divLinearLayout.setOrientation(toOrientationMode((R3.d) r32.f4516G.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(r32.f4516G)) {
                divLinearLayout.addSubscription(r32.f4516G.observe(expressionResolver, new DivContainerBinder$bindProperties$$inlined$bindOrientation$1(divLinearLayout, this)));
            }
        }
        if (ExpressionsKt.equalsToConstant(r32.f4552o, r33 != null ? r33.f4552o : null)) {
        }
        divLinearLayout.setGravity(BaseDivViewExtensionsKt.evaluateGravity((Z3) r32.f4552o.evaluate(expressionResolver), (EnumC0717a4) r32.f4553p.evaluate(expressionResolver)));
        if (!ExpressionsKt.isConstant(r32.f4552o) || !ExpressionsKt.isConstant(r32.f4553p)) {
            DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1 divContainerBinder$bindProperties$$inlined$bindContentAlignment$1 = new DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1(r32, expressionResolver, divLinearLayout);
            divLinearLayout.addSubscription(r32.f4552o.observe(expressionResolver, divContainerBinder$bindProperties$$inlined$bindContentAlignment$1));
            divLinearLayout.addSubscription(r32.f4553p.observe(expressionResolver, divContainerBinder$bindProperties$$inlined$bindContentAlignment$1));
        }
        bindSeparator(divLinearLayout, r32, r33, expressionResolver);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006a, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1 != null ? r1.f4590b : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r1 != null ? r1.f4590b : null, r0 != null ? r0.f4590b : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSeparator(DivLinearLayout divLinearLayout, R3 r32, R3 r33, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Drawable drawable;
        R3.e eVar = r32.f4523N;
        R3.e eVar2 = r33 != null ? r33.f4523N : null;
        if (ExpressionsKt.equalsToConstant(eVar != null ? eVar.f4591c : null, eVar2 != null ? eVar2.f4591c : null)) {
            if (ExpressionsKt.equalsToConstant(eVar != null ? eVar.f4592d : null, eVar2 != null ? eVar2.f4592d : null)) {
            }
        }
        divLinearLayout.setShowDividers(toSeparatorMode(eVar, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(eVar != null ? eVar.f4591c : null)) {
            if (ExpressionsKt.isConstantOrNull(eVar != null ? eVar.f4592d : null)) {
            }
        }
        DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1 divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1 = new DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1(eVar, expressionResolver, divLinearLayout, this, expressionResolver);
        divLinearLayout.addSubscription((eVar == null || (expression3 = eVar.f4591c) == null) ? null : expression3.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1));
        divLinearLayout.addSubscription((eVar == null || (expression2 = eVar.f4592d) == null) ? null : expression2.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1));
        divLinearLayout.addSubscription((eVar == null || (expression = eVar.f4590b) == null) ? null : expression.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1));
        R3.e eVar3 = r32.f4523N;
        R3.e eVar4 = r33 != null ? r33.f4523N : null;
        if (!DivDataExtensionsKt.equalsToConstant(eVar3 != null ? eVar3.f4593e : null, eVar4 != null ? eVar4.f4593e : null)) {
            X4 x4 = eVar3 != null ? eVar3.f4593e : null;
            if (x4 != null) {
                DisplayMetrics displayMetrics = divLinearLayout.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                drawable = BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver);
            } else {
                drawable = null;
            }
            divLinearLayout.setDividerDrawable(drawable);
            if (!DivDataExtensionsKt.isConstant(eVar3 != null ? eVar3.f4593e : null)) {
                ExpressionSubscribersKt.observeDrawable(divLinearLayout, eVar3 != null ? eVar3.f4593e : null, expressionResolver, new DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$1(eVar3, expressionResolver, divLinearLayout, expressionResolver));
            }
        }
        R3.e eVar5 = r32.f4523N;
        R3.e eVar6 = r33 != null ? r33.f4523N : null;
        if (DivDataExtensionsKt.equalsToConstant(eVar5 != null ? eVar5.f4589a : null, eVar6 != null ? eVar6.f4589a : null)) {
            return;
        }
        C0754c5 c0754c5 = eVar5 != null ? eVar5.f4589a : null;
        Resources resources = divLinearLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Rect rect = toRect(c0754c5, resources, expressionResolver);
        divLinearLayout.setDividerMargins(rect.left, rect.top, rect.right, rect.bottom);
        C0754c5 c0754c52 = eVar5 != null ? eVar5.f4589a : null;
        if (c0754c52 == null || DivDataExtensionsKt.isConstant(c0754c52)) {
            return;
        }
        DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1 divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1 = new DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1(c0754c52, expressionResolver, this, divLinearLayout, expressionResolver);
        divLinearLayout.addSubscription(c0754c52.f5855f.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1));
        divLinearLayout.addSubscription(c0754c52.f5850a.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1));
        Expression expression4 = c0754c52.f5854e;
        if (expression4 == null && c0754c52.f5851b == null) {
            divLinearLayout.addSubscription(c0754c52.f5852c.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1));
            divLinearLayout.addSubscription(c0754c52.f5853d.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1));
        } else {
            divLinearLayout.addSubscription(expression4 != null ? expression4.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1) : null);
            Expression expression5 = c0754c52.f5851b;
            divLinearLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1) : null);
        }
    }

    private final void checkCrossAxisSize(R3 r32, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (BaseDivViewExtensionsKt.isHorizontal(r32, expressionResolver)) {
            checkCrossAxisSize(interfaceC0752c3.getHeight(), interfaceC0752c3, errorCollector);
        } else {
            checkCrossAxisSize(interfaceC0752c3.getWidth(), interfaceC0752c3, errorCollector);
        }
    }

    private final void checkMainAxisSize(R3 r32, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (BaseDivViewExtensionsKt.isHorizontal(r32, expressionResolver)) {
            if (r32.getWidth() instanceof Yb.e) {
                checkMainAxisSize(interfaceC0752c3.getWidth(), interfaceC0752c3, errorCollector);
            }
        } else if (r32.getHeight() instanceof Yb.e) {
            T2 t22 = r32.f4546i;
            if (t22 == null || ((float) ((Number) t22.f4859a.evaluate(expressionResolver)).doubleValue()) == 0.0f) {
                checkMainAxisSize(interfaceC0752c3.getHeight(), interfaceC0752c3, errorCollector);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void checkSize(Yb yb, InterfaceC0752c3 interfaceC0752c3, ErrorCollector errorCollector, String str, String str2) {
        String str3;
        if (yb instanceof Yb.d) {
            String id = interfaceC0752c3.getId();
            if (id != null) {
                str3 = " with id='" + id + '\'';
            }
            str3 = "";
            String format = String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, str3, str2}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            errorCollector.logWarning(new Throwable(format));
        }
    }

    private final List<DivItemBuilderResult> dispatchBinding(ViewGroup viewGroup, BindingContext bindingContext, R3 r32, R3 r33, List<DivItemBuilderResult> list, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list2;
        R3 r34 = r32;
        if (r34.f4563z == null || list == null) {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                List<Z> applyPatchToChild = applyPatchToChild(viewGroup, bindingContext, divItemBuilderResult.getDiv(), i4 + i5);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(applyPatchToChild, 10));
                Iterator<T> it = applyPatchToChild.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DivItemBuilderResult((Z) it.next(), divItemBuilderResult.getExpressionResolver()));
                }
                i5 += arrayList2.size() - 1;
                CollectionsKt.addAll(arrayList, arrayList2);
                i4 = i6;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        int i7 = 0;
        for (Object obj2 : list2) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) obj2;
            View childAt = viewGroup.getChildAt(i7);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            bindChild(childAt, bindingContext, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver(), r34, r33, divStatePath, i7);
            r34 = r32;
            i7 = i8;
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dispatchItems(ViewGroup viewGroup, BindingContext bindingContext, R3 r32, R3 r33, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> dispatchBinding = dispatchBinding(viewGroup, bindingContext, r32, r33, list, divStatePath);
        Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        ((DivCollectionHolder) viewGroup).setItems(dispatchBinding);
        BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, bindingContext.getDivView(), dispatchBinding, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceWithReuse(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<DivItemBuilderResult> list3 = list;
        List D4 = k.D(AbstractC1293g0.b(viewGroup));
        Iterator<T> it = list3.iterator();
        Iterator it2 = D4.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list3, 10), CollectionsKt.collectionSizeOrDefault(D4, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((DivItemBuilderResult) it.next()).getDiv(), (View) it2.next());
            arrayList.add(Unit.f41027a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            Object obj2 = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) next;
            Iterator it4 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                Z z4 = (Z) next2;
                if (DivUtilKt.isBranch(z4) ? Intrinsics.areEqual(DivUtilKt.getType(divItemBuilderResult.getDiv()), DivUtilKt.getType(z4)) : DivUtilKt.canBeReused(z4, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                    obj2 = next2;
                    break;
                }
            }
            View view = (View) M.d(linkedHashMap).remove((Z) obj2);
            if (view != null) {
                viewGroup.addView(view);
            } else {
                arrayList2.add(Integer.valueOf(i5));
            }
            i5 = i6;
        }
        int size = arrayList2.size();
        while (i4 < size) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            int intValue = ((Number) obj3).intValue();
            DivItemBuilderResult divItemBuilderResult2 = list2.get(intValue);
            Iterator it5 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it5.next();
                    if (Intrinsics.areEqual(DivUtilKt.getType((Z) obj), DivUtilKt.getType(divItemBuilderResult2.getDiv()))) {
                        break;
                    }
                }
            }
            View view2 = (View) M.d(linkedHashMap).remove((Z) obj);
            if (view2 == null) {
                view2 = ((DivViewCreator) this.divViewCreator.get()).create(divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver());
            }
            viewGroup.addView(view2, intValue);
        }
        Iterator it6 = linkedHashMap.values().iterator();
        while (it6.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it6.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toOrientationMode(R3.d dVar) {
        return WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect toRect(C0754c5 c0754c5, Resources resources, ExpressionResolver expressionResolver) {
        if (c0754c5 == null) {
            this.tempRect.set(0, 0, 0, 0);
            return this.tempRect;
        }
        DisplayMetrics metrics = resources.getDisplayMetrics();
        EnumC0779dc enumC0779dc = (EnumC0779dc) c0754c5.f5856g.evaluate(expressionResolver);
        if (c0754c5.f5854e == null && c0754c5.f5851b == null) {
            Rect rect = this.tempRect;
            Long l4 = (Long) c0754c5.f5852c.evaluate(expressionResolver);
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            rect.left = BaseDivViewExtensionsKt.unitToPx(l4, metrics, enumC0779dc);
            this.tempRect.right = BaseDivViewExtensionsKt.unitToPx((Long) c0754c5.f5853d.evaluate(expressionResolver), metrics, enumC0779dc);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                Rect rect2 = this.tempRect;
                Expression expression = c0754c5.f5854e;
                Long l5 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
                Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
                rect2.left = BaseDivViewExtensionsKt.unitToPx(l5, metrics, enumC0779dc);
                Rect rect3 = this.tempRect;
                Expression expression2 = c0754c5.f5851b;
                rect3.right = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, metrics, enumC0779dc);
            } else {
                Rect rect4 = this.tempRect;
                Expression expression3 = c0754c5.f5851b;
                Long l6 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
                rect4.left = BaseDivViewExtensionsKt.unitToPx(l6, metrics, enumC0779dc);
                Rect rect5 = this.tempRect;
                Expression expression4 = c0754c5.f5854e;
                rect5.right = BaseDivViewExtensionsKt.unitToPx(expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null, metrics, enumC0779dc);
            }
        }
        this.tempRect.top = BaseDivViewExtensionsKt.unitToPx((Long) c0754c5.f5855f.evaluate(expressionResolver), metrics, enumC0779dc);
        this.tempRect.bottom = BaseDivViewExtensionsKt.unitToPx((Long) c0754c5.f5850a.evaluate(expressionResolver), metrics, enumC0779dc);
        return this.tempRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int toSeparatorMode(R3.e eVar, ExpressionResolver expressionResolver) {
        if (eVar == null) {
            return 0;
        }
        boolean booleanValue = ((Boolean) eVar.f4591c.evaluate(expressionResolver)).booleanValue();
        ?? r02 = booleanValue;
        if (((Boolean) eVar.f4592d.evaluate(expressionResolver)).booleanValue()) {
            r02 = (booleanValue ? 1 : 0) | 2;
        }
        return ((Boolean) eVar.f4590b.evaluate(expressionResolver)).booleanValue() ? r02 | 4 : r02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toWrapDirection(R3.d dVar) {
        return WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()] == 1 ? 0 : 1;
    }

    private final void validateChildren(ViewGroup viewGroup, R3 r32, List<DivItemBuilderResult> list, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (viewGroup instanceof DivFrameLayout) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0752c3 b4 = ((DivItemBuilderResult) it.next()).getDiv().b();
            if (viewGroup instanceof DivWrapLayout) {
                checkCrossAxisSize(r32, b4, expressionResolver, errorCollector);
            } else if (viewGroup instanceof DivLinearLayout) {
                checkMainAxisSize(r32, b4, expressionResolver, errorCollector);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bindView(@NotNull BindingContext context, @NotNull ViewGroup view, @NotNull Z.c div, @NotNull DivStatePath path) {
        ExpressionResolver oldExpressionResolver$div_release;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        DivHolderView divHolderView = (DivHolderView) view;
        Z.c cVar = (Z.c) divHolderView.getDiv();
        BindingContext bindingContext = divHolderView.getBindingContext();
        if (bindingContext == null || (oldExpressionResolver$div_release = bindingContext.getExpressionResolver()) == null) {
            oldExpressionResolver$div_release = context.getDivView().getOldExpressionResolver$div_release();
        }
        ExpressionResolver expressionResolver = oldExpressionResolver$div_release;
        if (div == cVar) {
            List<DivItemBuilderResult> items = ((DivCollectionHolder) view).getItems();
            if (items == null) {
                return;
            }
            dispatchItems(view, context, div.c(), cVar.c(), items, items, path);
            return;
        }
        this.baseBinder.bindView(context, view, div, cVar);
        bind(view, context, div.c(), cVar != null ? cVar.c() : null);
        Iterator it = AbstractC1293g0.b(view).iterator();
        while (it.hasNext()) {
            context.getDivView().unbindViewFromDiv$div_release((View) it.next());
        }
        bindItems(view, context, div.c(), cVar != null ? cVar.c() : null, expressionResolver, path);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull ViewGroup viewGroup, @NotNull BindingContext bindingContext, @NotNull R3 div, @Nullable R3 r32) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        BaseDivViewExtensionsKt.applyDivActions(viewGroup, bindingContext, div.f4538b, div.f4541d, div.f4514E, div.f4555r, div.f4561x, div.f4560w, div.f4519J, div.f4518I, div.f4540c, div.d(), div.f4549l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        BaseDivViewExtensionsKt.bindAspectRatio(viewGroup, div.f4546i, r32 != null ? r32.f4546i : null, expressionResolver);
        BaseDivViewExtensionsKt.bindClipChildren(viewGroup, div.f4550m, r32 != null ? r32.f4550m : null, expressionResolver);
        if (viewGroup instanceof DivLinearLayout) {
            bindProperties((DivLinearLayout) viewGroup, div, r32, expressionResolver);
        } else if (viewGroup instanceof DivWrapLayout) {
            bindProperties((DivWrapLayout) viewGroup, div, r32, expressionResolver);
        }
    }

    private final void checkCrossAxisSize(Yb yb, InterfaceC0752c3 interfaceC0752c3, ErrorCollector errorCollector) {
        checkSize(yb, interfaceC0752c3, errorCollector, "wrap layout mode", "cross");
    }

    private final void checkMainAxisSize(Yb yb, InterfaceC0752c3 interfaceC0752c3, ErrorCollector errorCollector) {
        checkSize(yb, interfaceC0752c3, errorCollector, "wrap_content size", b9.h.f15466Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r5.f4553p, r6 != null ? r6.f4553p : null) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindProperties(DivWrapLayout divWrapLayout, R3 r32, R3 r33, ExpressionResolver expressionResolver) {
        if (!ExpressionsKt.equalsToConstant(r32.f4516G, r33 != null ? r33.f4516G : null)) {
            divWrapLayout.setWrapDirection(toWrapDirection((R3.d) r32.f4516G.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(r32.f4516G)) {
                divWrapLayout.addSubscription(r32.f4516G.observe(expressionResolver, new DivContainerBinder$bindProperties$$inlined$bindOrientation$2(divWrapLayout, this)));
            }
        }
        if (ExpressionsKt.equalsToConstant(r32.f4552o, r33 != null ? r33.f4552o : null)) {
        }
        divWrapLayout.setGravity(BaseDivViewExtensionsKt.evaluateGravity((Z3) r32.f4552o.evaluate(expressionResolver), (EnumC0717a4) r32.f4553p.evaluate(expressionResolver)));
        if (!ExpressionsKt.isConstant(r32.f4552o) || !ExpressionsKt.isConstant(r32.f4553p)) {
            DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2 divContainerBinder$bindProperties$$inlined$bindContentAlignment$2 = new DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2(r32, expressionResolver, divWrapLayout);
            divWrapLayout.addSubscription(r32.f4552o.observe(expressionResolver, divContainerBinder$bindProperties$$inlined$bindContentAlignment$2));
            divWrapLayout.addSubscription(r32.f4553p.observe(expressionResolver, divContainerBinder$bindProperties$$inlined$bindContentAlignment$2));
        }
        bindSeparator(divWrapLayout, r32, r33, expressionResolver);
        bindLineSeparator(divWrapLayout, r32, r33, expressionResolver);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006a, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1 != null ? r1.f4590b : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r1 != null ? r1.f4590b : null, r0 != null ? r0.f4590b : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSeparator(DivWrapLayout divWrapLayout, R3 r32, R3 r33, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Drawable drawable;
        R3.e eVar = r32.f4523N;
        R3.e eVar2 = r33 != null ? r33.f4523N : null;
        if (ExpressionsKt.equalsToConstant(eVar != null ? eVar.f4591c : null, eVar2 != null ? eVar2.f4591c : null)) {
            if (ExpressionsKt.equalsToConstant(eVar != null ? eVar.f4592d : null, eVar2 != null ? eVar2.f4592d : null)) {
            }
        }
        divWrapLayout.setShowSeparators(toSeparatorMode(eVar, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(eVar != null ? eVar.f4591c : null)) {
            if (ExpressionsKt.isConstantOrNull(eVar != null ? eVar.f4592d : null)) {
            }
        }
        DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2 divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2 = new DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2(eVar, expressionResolver, divWrapLayout, this, expressionResolver);
        divWrapLayout.addSubscription((eVar == null || (expression3 = eVar.f4591c) == null) ? null : expression3.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2));
        divWrapLayout.addSubscription((eVar == null || (expression2 = eVar.f4592d) == null) ? null : expression2.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2));
        divWrapLayout.addSubscription((eVar == null || (expression = eVar.f4590b) == null) ? null : expression.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2));
        R3.e eVar3 = r32.f4523N;
        R3.e eVar4 = r33 != null ? r33.f4523N : null;
        if (!DivDataExtensionsKt.equalsToConstant(eVar3 != null ? eVar3.f4593e : null, eVar4 != null ? eVar4.f4593e : null)) {
            X4 x4 = eVar3 != null ? eVar3.f4593e : null;
            if (x4 != null) {
                DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                drawable = BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver);
            } else {
                drawable = null;
            }
            divWrapLayout.setSeparatorDrawable(drawable);
            if (!DivDataExtensionsKt.isConstant(eVar3 != null ? eVar3.f4593e : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, eVar3 != null ? eVar3.f4593e : null, expressionResolver, new DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$2(eVar3, expressionResolver, divWrapLayout, expressionResolver));
            }
        }
        R3.e eVar5 = r32.f4523N;
        R3.e eVar6 = r33 != null ? r33.f4523N : null;
        if (DivDataExtensionsKt.equalsToConstant(eVar5 != null ? eVar5.f4589a : null, eVar6 != null ? eVar6.f4589a : null)) {
            return;
        }
        C0754c5 c0754c5 = eVar5 != null ? eVar5.f4589a : null;
        Resources resources = divWrapLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Rect rect = toRect(c0754c5, resources, expressionResolver);
        divWrapLayout.setSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        C0754c5 c0754c52 = eVar5 != null ? eVar5.f4589a : null;
        if (c0754c52 == null || DivDataExtensionsKt.isConstant(c0754c52)) {
            return;
        }
        DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2 divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2 = new DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2(c0754c52, expressionResolver, this, divWrapLayout, expressionResolver);
        divWrapLayout.addSubscription(c0754c52.f5855f.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2));
        divWrapLayout.addSubscription(c0754c52.f5850a.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2));
        Expression expression4 = c0754c52.f5854e;
        if (expression4 == null && c0754c52.f5851b == null) {
            divWrapLayout.addSubscription(c0754c52.f5852c.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2));
            divWrapLayout.addSubscription(c0754c52.f5853d.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2));
        } else {
            divWrapLayout.addSubscription(expression4 != null ? expression4.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2) : null);
            Expression expression5 = c0754c52.f5851b;
            divWrapLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, divContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2) : null);
        }
    }
}
