package com.yandex.div.core.view2.divs.pager;

import O1.C0754c5;
import O1.E9;
import O1.H3;
import O1.L9;
import O1.S5;
import O1.Z;
import V1.a;
import W1.m;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.PagerState;
import com.yandex.div.core.state.UpdateStateChangePageCallback;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerBinder extends DivViewBinder<Z.k, E9, DivPagerView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final a divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull a divBinder, @NotNull DivPatchCache divPatchCache, @NotNull DivActionBinder divActionBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        Intrinsics.checkNotNullParameter(pagerIndicatorConnector, "pagerIndicatorConnector");
        Intrinsics.checkNotNullParameter(accessibilityStateProvider, "accessibilityStateProvider");
        this.baseBinder = baseBinder;
        this.viewCreator = viewCreator;
        this.divBinder = divBinder;
        this.divPatchCache = divPatchCache;
        this.divActionBinder = divActionBinder;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDecorations(DivPagerView divPagerView, E9 e9, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, DivPagerAdapter divPagerAdapter) {
        DivPagerPaddingsHolder divPagerPaddingsHolder;
        int i4;
        DivPagerPageSizeProvider wrapContentPageSizeProvider;
        boolean z4;
        E9.c cVar;
        DivPagerPageSizeProvider divPagerPageSizeProvider;
        int i5;
        RecyclerView.o wrapContentPageSizeItemDecoration;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        boolean isHorizontal = isHorizontal(e9, expressionResolver);
        divPagerView.setOrientation(!isHorizontal ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment((E9.c) e9.f2583i.evaluate(expressionResolver));
        if (ViewsKt.isActuallyLaidOut(divPagerView)) {
            DisplayMetrics metrics = divPagerView.getResources().getDisplayMetrics();
            ViewPager2 viewPager = divPagerView.getViewPager();
            int width = isHorizontal ? viewPager.getWidth() : viewPager.getHeight();
            S5 s5 = e9.f2593s;
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            float pxF = BaseDivViewExtensionsKt.toPxF(s5, metrics, expressionResolver);
            boolean booleanValue = ((Boolean) e9.f2591q.evaluate(expressionResolver)).booleanValue();
            E9.c cVar2 = (E9.c) e9.f2559D.evaluate(expressionResolver);
            DivPagerPaddingsHolder divPagerPaddingsHolder2 = new DivPagerPaddingsHolder(e9.i(), expressionResolver, divPagerView, metrics, isHorizontal, cVar2);
            L9 l9 = e9.f2595u;
            if (l9 instanceof L9.e) {
                PercentagePageSizeProvider percentagePageSizeProvider = new PercentagePageSizeProvider(((L9.e) l9).c(), expressionResolver, width, divPagerPaddingsHolder2, cVar2);
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                cVar = cVar2;
                z4 = isHorizontal ? 1 : 0;
                divPagerPageSizeProvider = percentagePageSizeProvider;
                i4 = width;
            } else {
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                i4 = width;
                if (l9 instanceof L9.c) {
                    wrapContentPageSizeProvider = new NeighbourPageSizeProvider(((L9.c) l9).c(), expressionResolver, metrics, i4, pxF, divPagerPaddingsHolder, cVar2);
                    cVar = cVar2;
                    z4 = isHorizontal ? 1 : 0;
                } else {
                    if (!(l9 instanceof L9.d)) {
                        throw new m();
                    }
                    wrapContentPageSizeProvider = new WrapContentPageSizeProvider(recyclerView, isHorizontal, i4, divPagerPaddingsHolder, cVar2);
                    z4 = isHorizontal ? 1 : 0;
                    cVar = cVar2;
                    i4 = i4;
                }
                divPagerPageSizeProvider = wrapContentPageSizeProvider;
            }
            if (divPagerPageSizeProvider instanceof FixedPageSizeProvider) {
                int i6 = i4;
                FixedPageSizeProvider fixedPageSizeProvider = (FixedPageSizeProvider) divPagerPageSizeProvider;
                new FixedPageSizeOffScreenPagesController(divPagerView, i6, pxF, fixedPageSizeProvider, divPagerPaddingsHolder, booleanValue, divPagerAdapter);
                i5 = i6;
                wrapContentPageSizeItemDecoration = new FixedPageSizeItemDecoration(divPagerPaddingsHolder, fixedPageSizeProvider);
            } else {
                i5 = i4;
                new WrapContentPageSizeOffScreenPagesController(divPagerView, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, divPagerAdapter);
                wrapContentPageSizeItemDecoration = new WrapContentPageSizeItemDecoration(i5, divPagerPaddingsHolder, cVar);
            }
            setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
            E9.c cVar3 = cVar;
            int i7 = i5;
            divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, i7, e9.f2600z, new DivPagerPageOffsetProvider(i7, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, booleanValue, divPagerAdapter, cVar3), z4));
        }
    }

    private final void bind(DivPagerView divPagerView, BindingContext bindingContext, E9 e9, DivStatePath divStatePath) {
        int i4;
        int position;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        SparseArray sparseArray = new SparseArray();
        AccessibilityStateProvider accessibilityStateProvider = this.accessibilityStateProvider;
        Context context = divPagerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        boolean isAccessibilityEnabled = accessibilityStateProvider.isAccessibilityEnabled(context);
        divPagerView.setRecycledViewPool(new ReleasingViewPool(divView.getReleaseViewVisitor$div_release()));
        List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(e9, bindingContext.getDivView(), expressionResolver);
        Object obj = this.divBinder.get();
        Intrinsics.checkNotNullExpressionValue(obj, "divBinder.get()");
        DivPagerAdapter divPagerAdapter = new DivPagerAdapter(buildItems, bindingContext, (DivBinder) obj, sparseArray, this.viewCreator, divStatePath, isAccessibilityEnabled, divPagerView);
        divPagerView.getViewPager().setAdapter(divPagerAdapter);
        bindInfiniteScroll(divPagerView, e9, expressionResolver);
        DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView.getPagerOnItemsCountChange$div_release();
        if (pagerOnItemsCountChange$div_release != null) {
            pagerOnItemsCountChange$div_release.onItemsUpdated();
        }
        divPagerView.setClipToPage$div_release(divView.getDiv2Component$div_release().isPagerPageClipEnabled());
        divPagerView.setOrientation(!isHorizontal(e9, expressionResolver) ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment((E9.c) e9.f2583i.evaluate(expressionResolver));
        DivPagerBinder$bind$reusableObserver$1 divPagerBinder$bind$reusableObserver$1 = new DivPagerBinder$bind$reusableObserver$1(this, divPagerView, e9, expressionResolver, sparseArray, divPagerAdapter);
        C0754c5 i5 = e9.i();
        divPagerView.addSubscription((i5 == null || (expression4 = i5.f5852c) == null) ? null : expression4.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        C0754c5 i6 = e9.i();
        divPagerView.addSubscription((i6 == null || (expression3 = i6.f5853d) == null) ? null : expression3.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        C0754c5 i7 = e9.i();
        divPagerView.addSubscription((i7 == null || (expression2 = i7.f5855f) == null) ? null : expression2.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        C0754c5 i8 = e9.i();
        divPagerView.addSubscription((i8 == null || (expression = i8.f5850a) == null) ? null : expression.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        divPagerView.addSubscription(e9.f2593s.f4715b.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        divPagerView.addSubscription(e9.f2593s.f4714a.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        divPagerView.addSubscription(e9.f2559D.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        divPagerView.addSubscription(e9.f2583i.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        divPagerView.addSubscription(e9.f2598x.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        divPagerView.addSubscription(observeSizeChange(divPagerView.getViewPager(), e9, divPagerBinder$bind$reusableObserver$1));
        L9 l9 = e9.f2595u;
        if (l9 instanceof L9.c) {
            L9.c cVar = (L9.c) l9;
            divPagerView.addSubscription(cVar.c().f3873a.f4715b.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
            divPagerView.addSubscription(cVar.c().f3873a.f4714a.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        } else if (l9 instanceof L9.e) {
            divPagerView.addSubscription(((L9.e) l9).c().f6241a.f5399a.observe(expressionResolver, divPagerBinder$bind$reusableObserver$1));
        } else {
            boolean z4 = l9 instanceof L9.d;
        }
        divPagerView.setPagerSelectedActionsDispatcher$div_release(new PagerSelectedActionsDispatcher(divView, divPagerAdapter.getItemsToShow(), this.divActionBinder));
        divPagerView.setChangePageCallbackForLogger$div_release(new DivPagerPageChangeCallback(e9, divPagerAdapter.getItemsToShow(), bindingContext, recyclerView, divPagerView));
        DivViewState currentState = divView.getCurrentState();
        if (currentState != null) {
            String id = e9.getId();
            if (id == null) {
                id = String.valueOf(e9.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id);
            PagerState pagerState = blockState instanceof PagerState ? (PagerState) blockState : null;
            divPagerView.setChangePageCallbackForState$div_release(new UpdateStateChangePageCallback(id, currentState));
            if (pagerState != null) {
                Integer valueOf = Integer.valueOf(pagerState.getCurrentPageIndex());
                Integer num = valueOf.intValue() < divPagerAdapter.getRealPosition(divPagerAdapter.getItemsToShow().size()) ? valueOf : null;
                if (num != null) {
                    position = num.intValue();
                    divPagerView.setCurrentItem$div_release(position);
                }
            }
            long longValue = ((Number) e9.f2584j.evaluate(expressionResolver)).longValue();
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
            position = divPagerAdapter.getPosition(i4);
            divPagerView.setCurrentItem$div_release(position);
        }
        divPagerView.addSubscription(e9.f2556A.observeAndGet(expressionResolver, new DivPagerBinder$bind$2(divPagerView)));
        bindItemBuilder(divPagerView, bindingContext, e9);
        if (isAccessibilityEnabled) {
            divPagerView.enableAccessibility();
        }
    }

    private final void bindInfiniteScroll(DivPagerView divPagerView, E9 e9, ExpressionResolver expressionResolver) {
        View childAt = divPagerView.getViewPager().getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        e9.f2591q.observeAndGet(expressionResolver, new DivPagerBinder$bindInfiniteScroll$1(divPagerView, new G(), this, (RecyclerView) childAt));
    }

    private final void bindItemBuilder(DivPagerView divPagerView, BindingContext bindingContext, E9 e9) {
        H3 h32 = e9.f2592r;
        if (h32 == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(h32, bindingContext.getExpressionResolver(), new DivPagerBinder$bindItemBuilder$1(divPagerView, h32, bindingContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
    public final DivPagerBinder$createInfiniteScrollListener$1 createInfiniteScrollListener(final DivPagerView divPagerView) {
        return new RecyclerView.u() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrolled(@NotNull RecyclerView recyclerView, int i4, int i5) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
                RecyclerView.p layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView.h adapter = DivPagerView.this.getViewPager().getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition == itemCount - 2 && i4 > 0) {
                    recyclerView.scrollToPosition(2);
                } else {
                    if (findLastVisibleItemPosition != 1 || i4 >= 0) {
                        return;
                    }
                    recyclerView.scrollToPosition(itemCount - 3);
                }
            }
        };
    }

    private final boolean isHorizontal(E9 e9, ExpressionResolver expressionResolver) {
        return e9.f2598x.evaluate(expressionResolver) == E9.d.HORIZONTAL;
    }

    private final Disposable observeSizeChange(ViewPager2 viewPager2, E9 e9, Function1<Object, Unit> function1) {
        return new DivPagerBinder$observeSizeChange$1(viewPager2, function1, e9);
    }

    private final void removeItemDecorations(ViewPager2 viewPager2) {
        int itemDecorationCount = viewPager2.getItemDecorationCount();
        for (int i4 = 0; i4 < itemDecorationCount; i4++) {
            viewPager2.i(i4);
        }
    }

    private final void setItemDecoration(ViewPager2 viewPager2, RecyclerView.o oVar) {
        removeItemDecorations(viewPager2);
        viewPager2.a(oVar);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivPagerView view, @NotNull Z.k div, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        this.pagerIndicatorConnector.submitPager$div_release(view, div.c());
        Z.k div2 = view.getDiv();
        if (div != div2) {
            if (div2 != null) {
                view.setChangePageCallbackForOffScreenPages$div_release(null);
                removeItemDecorations(view.getViewPager());
                view.setPageTransformer$div_release(null);
            }
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.c(), path);
            return;
        }
        final ViewPager2 viewPager = view.getViewPager();
        RecyclerView.h adapter = viewPager.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        if (divPagerAdapter.applyPatch(view.getRecyclerView(), this.divPatchCache, context)) {
            DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = view.getPagerOnItemsCountChange$div_release();
            if (pagerOnItemsCountChange$div_release != null) {
                pagerOnItemsCountChange$div_release.onItemsUpdated();
                return;
            }
            return;
        }
        Object obj = this.divBinder.get();
        Intrinsics.checkNotNullExpressionValue(obj, "divBinder.get()");
        BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) obj);
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                view2.removeOnLayoutChangeListener(this);
                ViewPager2.this.j();
            }
        });
    }
}
