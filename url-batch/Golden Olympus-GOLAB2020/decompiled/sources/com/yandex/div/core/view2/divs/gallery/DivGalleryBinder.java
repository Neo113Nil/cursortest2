package com.yandex.div.core.view2.divs.gallery;

import O1.C0970o6;
import O1.H3;
import O1.Z;
import V1.a;
import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.GalleryState;
import com.yandex.div.core.state.UpdateStateScrollListener;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.PaddingItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivGalleryBinder extends DivViewBinder<Z.e, C0970o6, DivRecyclerView> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final a divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;
    private final float recyclerScrollInterceptionAngle;

    @NotNull
    private final DivViewCreator viewCreator;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C0970o6.e.values().length];
            try {
                iArr[C0970o6.e.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C0970o6.e.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivGalleryBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull a divBinder, @NotNull DivPatchCache divPatchCache, float f4) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        this.baseBinder = baseBinder;
        this.viewCreator = viewCreator;
        this.divBinder = divBinder;
        this.divPatchCache = divPatchCache;
        this.recyclerScrollInterceptionAngle = f4;
    }

    private final void bind(DivRecyclerView divRecyclerView, BindingContext bindingContext, C0970o6 c0970o6, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivGalleryBinder$bind$reusableObserver$1 divGalleryBinder$bind$reusableObserver$1 = new DivGalleryBinder$bind$reusableObserver$1(this, divRecyclerView, bindingContext, c0970o6);
        divRecyclerView.addSubscription(c0970o6.f7314x.observe(expressionResolver, divGalleryBinder$bind$reusableObserver$1));
        divRecyclerView.addSubscription(c0970o6.f7275D.observe(expressionResolver, divGalleryBinder$bind$reusableObserver$1));
        divRecyclerView.addSubscription(c0970o6.f7274C.observe(expressionResolver, divGalleryBinder$bind$reusableObserver$1));
        divRecyclerView.addSubscription(c0970o6.f7310t.observe(expressionResolver, divGalleryBinder$bind$reusableObserver$1));
        divRecyclerView.addSubscription(c0970o6.f7316z.observe(expressionResolver, divGalleryBinder$bind$reusableObserver$1));
        Expression expression = c0970o6.f7298h;
        if (expression != null) {
            divRecyclerView.addSubscription(expression.observe(expressionResolver, divGalleryBinder$bind$reusableObserver$1));
        }
        divRecyclerView.setRecycledViewPool(new ReleasingViewPool(bindingContext.getDivView().getReleaseViewVisitor$div_release()));
        divRecyclerView.setScrollingTouchSlop(1);
        divRecyclerView.setClipToPadding(false);
        divRecyclerView.setOverScrollMode(2);
        List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(c0970o6, bindingContext.getDivView(), expressionResolver);
        Object obj = this.divBinder.get();
        Intrinsics.checkNotNullExpressionValue(obj, "divBinder.get()");
        divRecyclerView.setAdapter(new DivGalleryAdapter(buildItems, bindingContext, (DivBinder) obj, this.viewCreator, divStatePath));
        bindItemBuilder(divRecyclerView, bindingContext, c0970o6);
        resetAnimatorAndRestoreOnLayout(divRecyclerView);
        updateDecorations(divRecyclerView, bindingContext, c0970o6);
    }

    private final void bindItemBuilder(DivRecyclerView divRecyclerView, BindingContext bindingContext, C0970o6 c0970o6) {
        H3 h32 = c0970o6.f7309s;
        if (h32 == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(h32, bindingContext.getExpressionResolver(), new DivGalleryBinder$bindItemBuilder$1(divRecyclerView, h32, bindingContext));
    }

    private final void removeItemDecorations(DivRecyclerView divRecyclerView) {
        int itemDecorationCount = divRecyclerView.getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                return;
            } else {
                divRecyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
    }

    private final void resetAnimatorAndRestoreOnLayout(final DivRecyclerView divRecyclerView) {
        final RecyclerView.m itemAnimator = divRecyclerView.getItemAnimator();
        divRecyclerView.setItemAnimator(null);
        if (!ViewsKt.isActuallyLaidOut(divRecyclerView) || divRecyclerView.isLayoutRequested()) {
            divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$resetAnimatorAndRestoreOnLayout$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view.removeOnLayoutChangeListener(this);
                    if (DivRecyclerView.this.getItemAnimator() == null) {
                        DivRecyclerView.this.setItemAnimator(itemAnimator);
                    }
                }
            });
        } else if (divRecyclerView.getItemAnimator() == null) {
            divRecyclerView.setItemAnimator(itemAnimator);
        }
    }

    private final void scrollToPositionInternal(DivRecyclerView divRecyclerView, int i4, int i5, ScrollPosition scrollPosition) {
        Object layoutManager = divRecyclerView.getLayoutManager();
        DivGalleryItemHelper divGalleryItemHelper = layoutManager instanceof DivGalleryItemHelper ? (DivGalleryItemHelper) layoutManager : null;
        if (divGalleryItemHelper == null) {
            return;
        }
        if (i5 == 0 && i4 == 0) {
            divGalleryItemHelper.instantScrollToPosition(i4, scrollPosition);
        } else {
            divGalleryItemHelper.instantScrollToPositionWithOffset(i4, i5, scrollPosition);
        }
    }

    private final void setItemDecoration(DivRecyclerView divRecyclerView, RecyclerView.o oVar) {
        removeItemDecorations(divRecyclerView);
        divRecyclerView.addItemDecoration(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDecorations(DivRecyclerView divRecyclerView, BindingContext bindingContext, C0970o6 c0970o6) {
        int i4;
        PaddingItemDecoration paddingItemDecoration;
        int i5;
        DisplayMetrics metrics = divRecyclerView.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int i6 = ((C0970o6.d) c0970o6.f7314x.evaluate(expressionResolver)) == C0970o6.d.HORIZONTAL ? 0 : 1;
        boolean z4 = c0970o6.f7275D.evaluate(expressionResolver) == C0970o6.f.AUTO;
        divRecyclerView.setVerticalScrollBarEnabled(z4 && i6 == 1);
        divRecyclerView.setHorizontalScrollBarEnabled(z4 && i6 == 0);
        divRecyclerView.setScrollbarFadingEnabled(false);
        Expression expression = c0970o6.f7298h;
        long longValue = expression != null ? ((Number) expression.evaluate(expressionResolver)).longValue() : 1L;
        divRecyclerView.setClipChildren(false);
        if (longValue == 1) {
            Long l4 = (Long) c0970o6.f7310t.evaluate(expressionResolver);
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            int i7 = i6;
            paddingItemDecoration = new PaddingItemDecoration(0, BaseDivViewExtensionsKt.dpToPx(l4, metrics), 0, 0, 0, 0, i7, 61, null);
            i4 = i7;
        } else {
            int i8 = i6;
            Long l5 = (Long) c0970o6.f7310t.evaluate(expressionResolver);
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            int dpToPx = BaseDivViewExtensionsKt.dpToPx(l5, metrics);
            Expression expression2 = c0970o6.f7301k;
            if (expression2 == null) {
                expression2 = c0970o6.f7310t;
            }
            PaddingItemDecoration paddingItemDecoration2 = new PaddingItemDecoration(0, dpToPx, BaseDivViewExtensionsKt.dpToPx((Long) expression2.evaluate(expressionResolver), metrics), 0, 0, 0, i8, 57, null);
            i4 = i8;
            paddingItemDecoration = paddingItemDecoration2;
        }
        setItemDecoration(divRecyclerView, paddingItemDecoration);
        C0970o6.e eVar = (C0970o6.e) c0970o6.f7274C.evaluate(expressionResolver);
        divRecyclerView.setScrollMode(eVar);
        int i9 = WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i9 == 1) {
            PagerSnapStartHelper pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.attachToRecyclerView(null);
            }
        } else if (i9 == 2) {
            Long l6 = (Long) c0970o6.f7310t.evaluate(expressionResolver);
            DisplayMetrics displayMetrics = divRecyclerView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(l6, displayMetrics);
            PagerSnapStartHelper pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.setItemSpacing(dpToPx2);
            } else {
                pagerSnapStartHelper2 = new PagerSnapStartHelper(dpToPx2);
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.attachToRecyclerView(divRecyclerView);
        }
        DivGalleryItemHelper divLinearLayoutManager = longValue == 1 ? new DivLinearLayoutManager(bindingContext, divRecyclerView, c0970o6, i4) : new DivGridLayoutManager(bindingContext, divRecyclerView, c0970o6, i4);
        divRecyclerView.setLayoutManager(divLinearLayoutManager.toLayoutManager());
        divRecyclerView.setScrollInterceptionAngle(this.recyclerScrollInterceptionAngle);
        divRecyclerView.clearOnScrollListeners();
        DivViewState currentState = bindingContext.getDivView().getCurrentState();
        if (currentState != null) {
            String id = c0970o6.getId();
            if (id == null) {
                id = String.valueOf(c0970o6.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id);
            GalleryState galleryState = blockState instanceof GalleryState ? (GalleryState) blockState : null;
            if (galleryState != null) {
                i5 = galleryState.getVisibleItemIndex();
            } else {
                long longValue2 = ((Number) c0970o6.f7302l.evaluate(expressionResolver)).longValue();
                long j4 = longValue2 >> 31;
                if (j4 == 0 || j4 == -1) {
                    i5 = (int) longValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue2 + "' to Int");
                    }
                    i5 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            scrollToPositionInternal(divRecyclerView, i5, galleryState != null ? galleryState.getScrollOffset() : i5 != 0 ? 0 : i4 == 0 ? divRecyclerView.getPaddingStart() : divRecyclerView.getPaddingTop(), ScrollPositionKt.toScrollPosition(eVar));
            divRecyclerView.addOnScrollListener(new UpdateStateScrollListener(id, currentState, divLinearLayoutManager));
        }
        divRecyclerView.addOnScrollListener(new DivGalleryScrollListener(bindingContext, divRecyclerView, divLinearLayoutManager, c0970o6));
        divRecyclerView.setOnInterceptTouchEventListener(((Boolean) c0970o6.f7316z.evaluate(expressionResolver)).booleanValue() ? ParentScrollRestrictor.INSTANCE : null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void bindView(@NotNull BindingContext context, @NotNull DivRecyclerView view, @NotNull Z.e div, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        Z.e div2 = view != null ? view.getDiv() : null;
        if (div != div2) {
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.c(), path);
            return;
        }
        RecyclerView.h adapter = view.getAdapter();
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return;
        }
        divGalleryAdapter.applyPatch(view, this.divPatchCache, context);
        Object obj = this.divBinder.get();
        Intrinsics.checkNotNullExpressionValue(obj, "divBinder.get()");
        BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) obj);
    }
}
