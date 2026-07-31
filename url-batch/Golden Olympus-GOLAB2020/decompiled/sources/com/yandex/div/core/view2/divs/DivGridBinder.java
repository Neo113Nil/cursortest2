package com.yandex.div.core.view2.divs;

import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.G6;
import O1.InterfaceC0752c3;
import O1.Z;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivGridBinder extends DivViewBinder<Z.g, G6, DivGridLayout> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final V1.a divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final V1.a divViewCreator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivGridBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivPatchManager divPatchManager, @NotNull V1.a divBinder, @NotNull V1.a divViewCreator) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(divPatchManager, "divPatchManager");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        this.baseBinder = baseBinder;
        this.divPatchManager = divPatchManager;
        this.divBinder = divBinder;
        this.divViewCreator = divViewCreator;
    }

    private final void applyColumnSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i4 = 1;
        }
        if (divLayoutParams.getColumnSpan() != i4) {
            divLayoutParams.setColumnSpan(i4);
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGridLayoutParams(View view, ExpressionResolver expressionResolver, InterfaceC0752c3 interfaceC0752c3) {
        applyColumnSpan(view, expressionResolver, interfaceC0752c3.e());
        applyRowSpan(view, expressionResolver, interfaceC0752c3.h());
    }

    private final List<Z> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Z z4, int i4) {
        Div2View divView = bindingContext.getDivView();
        String id = z4.b().getId();
        if (id == null || divView.getComplexRebindInProgress$div_release()) {
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
            viewGroup.addView(it.next().getValue(), i5 + i4, new DivLayoutParams(-2, -2));
            i5++;
        }
        return CollectionsKt.toList(createViewsForId.keySet());
    }

    private final void applyRowSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i4 = 1;
        }
        if (divLayoutParams.getRowSpan() != i4) {
            divLayoutParams.setRowSpan(i4);
            view.requestLayout();
        }
    }

    private final void bindItems(DivGridLayout divGridLayout, BindingContext bindingContext, G6 g6, G6 g62, DivStatePath divStatePath) {
        List list;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<Z> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(g6);
        RebindUtilsKt.tryRebindPlainContainerChildren(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(nonNullItems, expressionResolver), this.divViewCreator);
        BaseDivViewExtensionsKt.trackVisibilityActions(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(dispatchBinding(divGridLayout, bindingContext, nonNullItems, divStatePath), expressionResolver), (g62 == null || (list = g62.f2887y) == null) ? null : DivCollectionExtensionsKt.toDivItemBuilderResult(list, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindLayoutParams(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        this.baseBinder.bindLayoutParams$div_release(view, interfaceC0752c3, null, expressionResolver, ReleasablesKt.getExpressionSubscriber(view));
        applyGridLayoutParams(view, expressionResolver, interfaceC0752c3);
        if (view instanceof ExpressionSubscriber) {
            DivGridBinder$bindLayoutParams$callback$1 divGridBinder$bindLayoutParams$callback$1 = new DivGridBinder$bindLayoutParams$callback$1(this, view, expressionResolver, interfaceC0752c3);
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            Expression e4 = interfaceC0752c3.e();
            expressionSubscriber.addSubscription(e4 != null ? e4.observe(expressionResolver, divGridBinder$bindLayoutParams$callback$1) : null);
            Expression h4 = interfaceC0752c3.h();
            expressionSubscriber.addSubscription(h4 != null ? h4.observe(expressionResolver, divGridBinder$bindLayoutParams$callback$1) : null);
        }
    }

    private final List<Z> dispatchBinding(DivGridLayout divGridLayout, BindingContext bindingContext, List<? extends Z> list, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (Object obj : list) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<Z> applyPatchToChild = applyPatchToChild(divGridLayout, bindingContext, (Z) obj, i5 + i6);
            i6 += applyPatchToChild.size() - 1;
            CollectionsKt.addAll(arrayList, applyPatchToChild);
            i5 = i7;
        }
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            int i9 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Z z4 = (Z) obj2;
            View childView = divGridLayout.getChildAt(i4);
            InterfaceC0752c3 b4 = z4.b();
            DivStatePath resolvePath = BaseDivViewExtensionsKt.resolvePath(b4, i4, divStatePath);
            childView.setLayoutParams(new DivLayoutParams(-2, -2));
            DivBinder divBinder = (DivBinder) this.divBinder.get();
            Intrinsics.checkNotNullExpressionValue(childView, "childView");
            divBinder.bind(bindingContext, childView, z4, resolvePath);
            bindLayoutParams(childView, b4, expressionResolver);
            if (BaseDivViewExtensionsKt.getHasSightActions(b4)) {
                divView.bindViewToDiv$div_release(childView, z4);
            } else {
                divView.unbindViewFromDiv$div_release(childView);
            }
            i4 = i9;
        }
        return arrayList;
    }

    private final void observeContentAlignment(DivGridLayout divGridLayout, Expression<EnumC1091v2> expression, Expression<EnumC1109w2> expression2, ExpressionResolver expressionResolver) {
        divGridLayout.setGravity(BaseDivViewExtensionsKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
        DivGridBinder$observeContentAlignment$callback$1 divGridBinder$observeContentAlignment$callback$1 = new DivGridBinder$observeContentAlignment$callback$1(divGridLayout, expression, expressionResolver, expression2);
        divGridLayout.addSubscription(expression.observe(expressionResolver, divGridBinder$observeContentAlignment$callback$1));
        divGridLayout.addSubscription(expression2.observe(expressionResolver, divGridBinder$observeContentAlignment$callback$1));
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivGridLayout view, @NotNull Z.g div, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        super.bindView(context, (BindingContext) view, (DivGridLayout) div, path);
        G6 c4 = div.c();
        Z.g div2 = view.getDiv();
        bindItems(view, context, c4, div2 != null ? div2.c() : null, path);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivGridLayout divGridLayout, @NotNull BindingContext bindingContext, @NotNull G6 div, @Nullable G6 g6) {
        Intrinsics.checkNotNullParameter(divGridLayout, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        divGridLayout.setReleaseViewVisitor$div_release(bindingContext.getDivView().getReleaseViewVisitor$div_release());
        BaseDivViewExtensionsKt.applyDivActions(divGridLayout, bindingContext, div.f2864b, div.f2866d, div.f2841A, div.f2879q, div.f2885w, div.f2884v, div.f2845E, div.f2844D, div.f2865c, div.d(), div.f2873k);
        divGridLayout.addSubscription(div.f2874l.observeAndGet(bindingContext.getExpressionResolver(), new DivGridBinder$bind$1(divGridLayout)));
        observeContentAlignment(divGridLayout, div.f2876n, div.f2877o, bindingContext.getExpressionResolver());
    }
}
