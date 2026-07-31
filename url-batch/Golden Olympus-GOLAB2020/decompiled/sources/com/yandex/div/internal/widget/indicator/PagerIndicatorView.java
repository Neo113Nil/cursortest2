package com.yandex.div.internal.widget.indicator;

import W1.m;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimatorKt;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class PagerIndicatorView extends View {

    @Nullable
    private DivPagerView divPager;

    @NotNull
    private final ViewPager2.i onPageChangeListener;

    @Nullable
    private IndicatorsStripDrawer stripDrawer;

    @Nullable
    private IndicatorParams$Style style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onPageChangeListener = new ViewPager2.i() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            private final int toRealPosition(int i5) {
                DivPagerView divPagerView;
                ViewPager2 viewPager;
                divPagerView = PagerIndicatorView.this.divPager;
                RecyclerView.h adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
                DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
                if (divPagerAdapter == null) {
                    return i5;
                }
                int size = divPagerAdapter.getVisibleItems().size();
                return (divPagerAdapter.getRealPosition(i5) + size) % size;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            
                if (r5 > 1.0f) goto L6;
             */
            @Override // androidx.viewpager2.widget.ViewPager2.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPageScrolled(int i5, float f4, int i6) {
                IndicatorsStripDrawer indicatorsStripDrawer;
                indicatorsStripDrawer = PagerIndicatorView.this.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                    float f5 = f4 >= 0.0f ? 1.0f : 0.0f;
                    f4 = f5;
                    indicatorsStripDrawer.onPageScrolled(toRealPosition(i5), f4);
                    pagerIndicatorView.invalidate();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int i5) {
                IndicatorsStripDrawer indicatorsStripDrawer;
                indicatorsStripDrawer = PagerIndicatorView.this.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                    indicatorsStripDrawer.onPageSelected(toRealPosition(i5));
                    pagerIndicatorView.invalidate();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IndicatorsStripDrawer indicatorsStripDrawer = this$0.stripDrawer;
        if (indicatorsStripDrawer != null) {
            this$0.update(indicatorsStripDrawer);
        }
    }

    private final void update(IndicatorsStripDrawer indicatorsStripDrawer) {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.h adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter != null) {
            indicatorsStripDrawer.setItemsCount(divPagerAdapter.getVisibleItems().size());
            indicatorsStripDrawer.onPageSelected(divPagerAdapter.getCurrentRealItem());
            invalidate();
        }
    }

    public final void attachPager(@NotNull DivPagerView newDivPager) {
        Intrinsics.checkNotNullParameter(newDivPager, "newDivPager");
        DivPagerView divPagerView = this.divPager;
        if (divPagerView != null) {
            divPagerView.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        newDivPager.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (newDivPager == this.divPager) {
            return;
        }
        this.divPager = newDivPager;
        if (newDivPager.getViewPager().getAdapter() == null) {
            throw new IllegalArgumentException("Attached pager adapter is null!");
        }
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            update(indicatorsStripDrawer);
        }
        newDivPager.setPagerOnItemsCountChange$div_release(new DivPagerView.OnItemsUpdatedCallback() { // from class: I1.a
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OnItemsUpdatedCallback
            public final void onItemsUpdated() {
                PagerIndicatorView.attachPager$lambda$3(PagerIndicatorView.this);
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.onDraw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i4, int i5) {
        int paddingLeft;
        int paddingRight;
        int i6;
        IndicatorsStripDrawer indicatorsStripDrawer;
        ViewPager2 viewPager;
        RecyclerView.h adapter;
        IndicatorParams$Shape activeShape;
        IndicatorParams$ItemSize itemSize;
        IndicatorParams$Shape activeShape2;
        IndicatorParams$ItemSize itemSize2;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        IndicatorParams$Style indicatorParams$Style = this.style;
        float f4 = 0.0f;
        int height = (int) (((indicatorParams$Style == null || (activeShape2 = indicatorParams$Style.getActiveShape()) == null || (itemSize2 = activeShape2.getItemSize()) == null) ? 0.0f : itemSize2.getHeight()) + getPaddingTop() + getPaddingBottom());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(height, size);
        } else if (mode != 1073741824) {
            size = height;
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        IndicatorParams$Style indicatorParams$Style2 = this.style;
        if (indicatorParams$Style2 != null && (activeShape = indicatorParams$Style2.getActiveShape()) != null && (itemSize = activeShape.getItemSize()) != null) {
            f4 = itemSize.getWidth();
        }
        IndicatorParams$Style indicatorParams$Style3 = this.style;
        IndicatorParams$ItemPlacement itemsPlacement = indicatorParams$Style3 != null ? indicatorParams$Style3.getItemsPlacement() : null;
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            float spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            DivPagerView divPagerView = this.divPager;
            paddingLeft = ((int) ((spaceBetweenCenters * ((divPagerView == null || (viewPager = divPagerView.getViewPager()) == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.getItemCount())) + f4)) + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
                i6 = size2;
                if (mode2 != Integer.MIN_VALUE) {
                    size2 = Math.min(i6, size2);
                } else if (mode2 != 1073741824) {
                    size2 = i6;
                }
                setMeasuredDimension(size2, size);
                indicatorsStripDrawer = this.stripDrawer;
                if (indicatorsStripDrawer == null) {
                    indicatorsStripDrawer.calculateMaximumVisibleItems((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
                    return;
                }
                return;
            }
            if (itemsPlacement != null) {
                throw new m();
            }
            paddingLeft = ((int) f4) + getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        i6 = paddingLeft + paddingRight;
        if (mode2 != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size2, size);
        indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer == null) {
        }
    }

    public final void setStyle(@NotNull IndicatorParams$Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(style, SingleIndicatorDrawerKt.getIndicatorDrawer(style), IndicatorAnimatorKt.getIndicatorAnimator(style), this);
        indicatorsStripDrawer.calculateMaximumVisibleItems((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(indicatorsStripDrawer);
        this.stripDrawer = indicatorsStripDrawer;
        requestLayout();
    }
}
