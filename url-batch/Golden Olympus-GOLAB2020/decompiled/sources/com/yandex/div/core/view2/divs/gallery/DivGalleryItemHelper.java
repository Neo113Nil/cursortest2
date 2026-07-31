package com.yandex.div.core.view2.divs.gallery;

import O1.C0970o6;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.InterfaceC0752c3;
import O1.Z;
import W1.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.R$id;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivGalleryItemHelper {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[C0970o6.c.values().length];
                try {
                    iArr[C0970o6.c.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C0970o6.c.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C0970o6.c.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[EnumC1091v2.values().length];
                try {
                    iArr2[EnumC1091v2.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[EnumC1091v2.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EnumC1091v2.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[EnumC1091v2.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EnumC1091v2.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[EnumC1109w2.values().length];
                try {
                    iArr3[EnumC1109w2.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[EnumC1109w2.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[EnumC1109w2.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[EnumC1109w2.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0970o6.c asCrossContentAlignment(EnumC1091v2 enumC1091v2) {
            int i4 = WhenMappings.$EnumSwitchMapping$1[enumC1091v2.ordinal()];
            if (i4 == 1) {
                return C0970o6.c.START;
            }
            if (i4 == 2) {
                return C0970o6.c.CENTER;
            }
            if (i4 == 3) {
                return C0970o6.c.END;
            }
            if (i4 == 4) {
                return C0970o6.c.START;
            }
            if (i4 == 5) {
                return C0970o6.c.END;
            }
            throw new m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateOffset(int i4, int i5, C0970o6.c cVar) {
            int i6 = i4 - i5;
            int i7 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return i6 / 2;
            }
            if (i7 == 3) {
                return i6;
            }
            throw new m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0970o6.c asCrossContentAlignment(EnumC1109w2 enumC1109w2) {
            int i4 = WhenMappings.$EnumSwitchMapping$2[enumC1109w2.ordinal()];
            if (i4 == 1 || i4 == 2) {
                return C0970o6.c.START;
            }
            if (i4 == 3) {
                return C0970o6.c.CENTER;
            }
            if (i4 == 4) {
                return C0970o6.c.END;
            }
            throw new m();
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollPosition.values().length];
            try {
                iArr[ScrollPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static /* synthetic */ void _layoutDecoratedWithMargins$default(DivGalleryItemHelper divGalleryItemHelper, View view, int i4, int i5, int i6, int i7, boolean z4, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
        }
        if ((i8 & 32) != 0) {
            z4 = false;
        }
        divGalleryItemHelper._layoutDecoratedWithMargins(view, i4, i5, i6, i7, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default int getScrollOffset(View view) {
        int marginStart;
        int paddingStart;
        if (isHorizontal()) {
            int width = ViewsKt.isLayoutRtl(view) ? getView().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            paddingStart = getView().getPaddingStart();
        } else {
            int top = view.getTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            marginStart = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingStart = getView().getPaddingTop();
        }
        return marginStart - paddingStart;
    }

    static /* synthetic */ void instantScroll$default(DivGalleryItemHelper divGalleryItemHelper, int i4, ScrollPosition scrollPosition, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantScroll");
        }
        if ((i6 & 2) != 0) {
            scrollPosition = ScrollPosition.DEFAULT;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        divGalleryItemHelper.instantScroll(i4, scrollPosition, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default boolean isHorizontal() {
        return getLayoutManagerOrientation() == 0;
    }

    static /* synthetic */ void trackVisibilityAction$default(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        divGalleryItemHelper.trackVisibilityAction(view, z4);
    }

    default void _detachViewAt(int i4) {
        View _getChildAt = _getChildAt(i4);
        if (_getChildAt == null) {
            return;
        }
        trackVisibilityAction(_getChildAt, true);
    }

    @Nullable
    View _getChildAt(int i4);

    int _getPosition(@NotNull View view);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if (r2 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void _layoutDecoratedWithMargins(@NotNull View child, int i4, int i5, int i6, int i7, boolean z4) {
        ExpressionResolver expressionResolver;
        int i8;
        int i9;
        C0970o6.c cVar;
        Object evaluate;
        C0970o6.c cVar2;
        Object evaluate2;
        Z div;
        Intrinsics.checkNotNullParameter(child, "child");
        int layoutManagerOrientation = getLayoutManagerOrientation();
        int measuredWidth = (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight();
        int measuredHeight = (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom();
        if (layoutManagerOrientation == 0 ? getView().getMeasuredHeight() == 0 || measuredHeight == 0 || child.getMeasuredHeight() == 0 : layoutManagerOrientation == 1 && (getView().getMeasuredWidth() == 0 || measuredWidth == 0 || child.getMeasuredWidth() == 0)) {
            superLayoutDecoratedWithMargins(child, i4, i5, i6, i7);
            if (z4) {
                return;
            }
            getChildrenToRelayout().add(child);
            return;
        }
        Integer num = (Integer) child.getTag(R$id.div_gallery_item_index);
        DivItemBuilderResult itemDiv = num != null ? getItemDiv(num.intValue()) : null;
        InterfaceC0752c3 b4 = (itemDiv == null || (div = itemDiv.getDiv()) == null) ? null : div.b();
        if (itemDiv == null || (expressionResolver = itemDiv.getExpressionResolver()) == null) {
            expressionResolver = getBindingContext().getExpressionResolver();
        }
        Expression expression = getDiv().f7300j;
        if (layoutManagerOrientation == 1) {
            Expression l4 = b4 != null ? b4.l() : null;
            if (l4 != null && (evaluate2 = l4.evaluate(expressionResolver)) != null) {
                cVar2 = Companion.asCrossContentAlignment((EnumC1091v2) evaluate2);
            }
            cVar2 = (C0970o6.c) expression.evaluate(expressionResolver);
            i8 = Companion.calculateOffset(measuredWidth, i6 - i4, cVar2);
        } else {
            i8 = 0;
        }
        if (layoutManagerOrientation == 0) {
            Expression s4 = b4 != null ? b4.s() : null;
            if (s4 != null && (evaluate = s4.evaluate(expressionResolver)) != null) {
                cVar = Companion.asCrossContentAlignment((EnumC1109w2) evaluate);
            }
            cVar = (C0970o6.c) expression.evaluate(expressionResolver);
            i9 = Companion.calculateOffset(measuredHeight, i7 - i5, cVar);
        } else {
            i9 = 0;
        }
        superLayoutDecoratedWithMargins(child, i4 + i8, i5 + i9, i6 + i8, i7 + i9);
        trackVisibilityAction$default(this, child, false, 2, null);
        if (z4) {
            return;
        }
        getChildrenToRelayout().remove(child);
    }

    default void _onAttachedToWindow(@NotNull RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int childCount = view.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            trackVisibilityAction$default(this, view.getChildAt(i4), false, 2, null);
        }
    }

    default void _onDetachedFromWindow(@NotNull RecyclerView view, @NotNull RecyclerView.w recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        int childCount = view.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            trackVisibilityAction(view.getChildAt(i4), true);
        }
    }

    default void _onLayoutCompleted(@Nullable RecyclerView.A a4) {
        for (View view : getChildrenToRelayout()) {
            _layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getChildrenToRelayout().clear();
    }

    default void _removeAndRecycleAllViews(@NotNull RecyclerView.w recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            trackVisibilityAction(view.getChildAt(i4), true);
        }
    }

    default void _removeView(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        trackVisibilityAction(child, true);
    }

    default void _removeViewAt(int i4) {
        View _getChildAt = _getChildAt(i4);
        if (_getChildAt == null) {
            return;
        }
        trackVisibilityAction(_getChildAt, true);
    }

    default int calcScrollOffset(@NotNull View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        return getScrollOffset(targetView);
    }

    int firstCompletelyVisibleItemPosition();

    int firstVisibleItemPosition();

    @NotNull
    BindingContext getBindingContext();

    default int getChildMeasureSpec(int i4, int i5, int i6, int i7, int i8, boolean z4) {
        int d4 = g.d(i4 - i6, 0);
        return (i7 < 0 || i7 > Integer.MAX_VALUE) ? i7 == -1 ? (z4 && i5 == 0) ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : View.MeasureSpec.makeMeasureSpec(d4, i5) : i7 == -2 ? i8 == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(i8) : i7 == -3 ? (i5 == Integer.MIN_VALUE || i5 == 1073741824) ? com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(Math.min(d4, i8)) : i8 == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(i8) : com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeExactSpec(i7);
    }

    @NotNull
    Set<View> getChildrenToRelayout();

    @NotNull
    C0970o6 getDiv();

    @Nullable
    DivItemBuilderResult getItemDiv(int i4);

    int getLayoutManagerOrientation();

    @NotNull
    RecyclerView getView();

    default void instantScroll(final int i4, @NotNull final ScrollPosition scrollPosition, final int i5) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        RecyclerView view = getView();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                    view2.removeOnLayoutChangeListener(this);
                    if (i4 == 0) {
                        int i14 = (this.isHorizontal() && ViewsKt.isLayoutRtl(this.getView())) ? i5 : -i5;
                        this.getView().scrollBy(i14, i14);
                        return;
                    }
                    this.getView().scrollBy(-this.getView().getScrollX(), -this.getView().getScrollY());
                    RecyclerView.p layoutManager = this.getView().getLayoutManager();
                    View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i4) : null;
                    while (findViewByPosition == null && (this.getView().canScrollVertically(1) || this.getView().canScrollHorizontally(1))) {
                        RecyclerView.p layoutManager2 = this.getView().getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.requestLayout();
                        }
                        RecyclerView.p layoutManager3 = this.getView().getLayoutManager();
                        findViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i4) : null;
                        if (findViewByPosition != null) {
                            break;
                        } else {
                            this.getView().scrollBy(this.getView().getWidth(), this.getView().getHeight());
                        }
                    }
                    if (findViewByPosition != null) {
                        int i15 = DivGalleryItemHelper.WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                        if (i15 != 1) {
                            if (i15 != 2) {
                                return;
                            }
                            int scrollOffset = this.getScrollOffset(findViewByPosition) - i5;
                            if (ViewsKt.isLayoutRtl(this.getView())) {
                                scrollOffset = -scrollOffset;
                            }
                            this.getView().scrollBy(scrollOffset, scrollOffset);
                            return;
                        }
                        int[] iArr = {0, 0};
                        int[] iArr2 = {0, 0};
                        this.getView().getLocationOnScreen(iArr2);
                        findViewByPosition.getLocationOnScreen(iArr);
                        this.getView().scrollBy(((findViewByPosition.getWidth() - this.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((findViewByPosition.getHeight() - this.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                    }
                }
            });
            return;
        }
        if (i4 == 0) {
            if (!isHorizontal() || !ViewsKt.isLayoutRtl(getView())) {
                i5 = -i5;
            }
            getView().scrollBy(i5, i5);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.p layoutManager = getView().getLayoutManager();
        View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i4) : null;
        while (findViewByPosition == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.p layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.requestLayout();
            }
            RecyclerView.p layoutManager3 = getView().getLayoutManager();
            findViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i4) : null;
            if (findViewByPosition != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (findViewByPosition != null) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
                int scrollOffset = getScrollOffset(findViewByPosition) - i5;
                if (ViewsKt.isLayoutRtl(getView())) {
                    scrollOffset = -scrollOffset;
                }
                getView().scrollBy(scrollOffset, scrollOffset);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            getView().getLocationOnScreen(iArr2);
            findViewByPosition.getLocationOnScreen(iArr);
            getView().scrollBy(((findViewByPosition.getWidth() - getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((findViewByPosition.getHeight() - getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    void instantScrollToPosition(int i4, @NotNull ScrollPosition scrollPosition);

    void instantScrollToPositionWithOffset(int i4, int i5, @NotNull ScrollPosition scrollPosition);

    int lastCompletelyVisibleItemPosition();

    int lastVisibleItemPosition();

    void superLayoutDecoratedWithMargins(@NotNull View view, int i4, int i5, int i6, int i7);

    @NotNull
    RecyclerView.p toLayoutManager();

    /* JADX WARN: Multi-variable type inference failed */
    default void trackVisibilityAction(@NotNull View child, boolean z4) {
        View view;
        BindingContext bindingContext;
        Intrinsics.checkNotNullParameter(child, "child");
        int _getPosition = _getPosition(child);
        if (_getPosition == -1) {
            return;
        }
        ViewGroup viewGroup = child instanceof ViewGroup ? (ViewGroup) child : null;
        if (viewGroup == null || (view = (View) k.s(AbstractC1293g0.b(viewGroup))) == 0) {
            return;
        }
        Div2View divView = getBindingContext().getDivView();
        if (!z4) {
            DivItemBuilderResult itemDiv = getItemDiv(_getPosition);
            if (itemDiv == null) {
                return;
            }
            divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(getBindingContext().getFor(itemDiv.getExpressionResolver()), view, itemDiv.getDiv());
            divView.bindViewToDiv$div_release(view, itemDiv.getDiv());
            return;
        }
        Z takeBindingDiv$div_release = divView.takeBindingDiv$div_release(view);
        if (takeBindingDiv$div_release == null) {
            return;
        }
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView == null || (bindingContext = divHolderView.getBindingContext()) == null) {
            return;
        }
        divView.getDiv2Component$div_release().getVisibilityActionTracker().cancelTrackingViewsHierarchy(bindingContext, view, takeBindingDiv$div_release);
        divView.unbindViewFromDiv$div_release(view);
    }

    int width();
}
