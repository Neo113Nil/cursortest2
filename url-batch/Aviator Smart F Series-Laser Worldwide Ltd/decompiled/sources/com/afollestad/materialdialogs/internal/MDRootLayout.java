package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$dimen;
import com.afollestad.materialdialogs.R$id;
import com.afollestad.materialdialogs.R$styleable;
import com.afollestad.materialdialogs.StackingBehavior;

/* loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {
    private static final int INDEX_NEGATIVE = 1;
    private static final int INDEX_NEUTRAL = 0;
    private static final int INDEX_POSITIVE = 2;
    private ViewTreeObserver.OnScrollChangedListener bottomOnScrollChangedListener;
    private int buttonBarHeight;
    private GravityEnum buttonGravity;
    private int buttonHorizontalEdgeMargin;
    private int buttonPaddingFull;
    private final MDButton[] buttons;
    private View content;
    private Paint dividerPaint;
    private int dividerWidth;
    private boolean drawBottomDivider;
    private boolean drawTopDivider;
    private boolean isStacked;
    private int maxHeight;
    private boolean noTitleNoPadding;
    private int noTitlePaddingFull;
    private boolean reducePaddingNoTitleNoButtons;
    private StackingBehavior stackBehavior;
    private View titleBar;
    private ViewTreeObserver.OnScrollChangedListener topOnScrollChangedListener;
    private boolean useFullPadding;

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ boolean val$setForBottom;
        final /* synthetic */ boolean val$setForTop;
        final /* synthetic */ View val$view;

        a(View view, boolean z7, boolean z8) {
            this.val$view = view;
            this.val$setForTop = z7;
            this.val$setForBottom = z8;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.val$view.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.canWebViewScroll((WebView) this.val$view)) {
                MDRootLayout.this.addScrollListener((ViewGroup) this.val$view, this.val$setForTop, this.val$setForBottom);
            } else {
                if (this.val$setForTop) {
                    MDRootLayout.this.drawTopDivider = false;
                }
                if (this.val$setForBottom) {
                    MDRootLayout.this.drawBottomDivider = false;
                }
            }
            this.val$view.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    class b extends RecyclerView.OnScrollListener {
        final /* synthetic */ boolean val$setForBottom;
        final /* synthetic */ boolean val$setForTop;
        final /* synthetic */ ViewGroup val$vg;

        b(ViewGroup viewGroup, boolean z7, boolean z8) {
            this.val$vg = viewGroup;
            this.val$setForTop = z7;
            this.val$setForBottom = z8;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
            MDButton[] mDButtonArr = MDRootLayout.this.buttons;
            int length = mDButtonArr.length;
            boolean z7 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    MDButton mDButton = mDButtonArr[i10];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z7 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.invalidateDividersForScrollingView(this.val$vg, this.val$setForTop, this.val$setForBottom, z7);
            MDRootLayout.this.invalidate();
        }
    }

    class c implements ViewTreeObserver.OnScrollChangedListener {
        final /* synthetic */ boolean val$setForBottom;
        final /* synthetic */ boolean val$setForTop;
        final /* synthetic */ ViewGroup val$vg;

        c(ViewGroup viewGroup, boolean z7, boolean z8) {
            this.val$vg = viewGroup;
            this.val$setForTop = z7;
            this.val$setForBottom = z8;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.buttons;
            int length = mDButtonArr.length;
            boolean z7 = false;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    MDButton mDButton = mDButtonArr[i8];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z7 = true;
                        break;
                    }
                    i8++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.val$vg;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.invalidateDividersForWebView((WebView) viewGroup, this.val$setForTop, this.val$setForBottom, z7);
            } else {
                MDRootLayout.this.invalidateDividersForScrollingView(viewGroup, this.val$setForTop, this.val$setForBottom, z7);
            }
            MDRootLayout.this.invalidate();
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] $SwitchMap$com$afollestad$materialdialogs$GravityEnum;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            $SwitchMap$com$afollestad$materialdialogs$GravityEnum = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$GravityEnum[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context) {
        super(context);
        this.buttons = new MDButton[3];
        this.drawTopDivider = false;
        this.drawBottomDivider = false;
        this.stackBehavior = StackingBehavior.ADAPTIVE;
        this.isStacked = false;
        this.useFullPadding = true;
        this.buttonGravity = GravityEnum.START;
        init(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addScrollListener(ViewGroup viewGroup, boolean z7, boolean z8) {
        if ((z8 || this.topOnScrollChangedListener != null) && !(z8 && this.bottomOnScrollChangedListener == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            b bVar = new b(viewGroup, z7, z8);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(bVar);
            bVar.onScrolled(recyclerView, 0, 0);
            return;
        }
        c cVar = new c(viewGroup, z7, z8);
        if (z8) {
            this.bottomOnScrollChangedListener = cVar;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.bottomOnScrollChangedListener);
        } else {
            this.topOnScrollChangedListener = cVar;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.topOnScrollChangedListener);
        }
        cVar.onScrollChanged();
    }

    private static boolean canAdapterViewScroll(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    public static boolean canRecyclerViewScroll(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    private static boolean canScrollViewScroll(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean canWebViewScroll(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    @Nullable
    private static View getBottomView(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    @Nullable
    private static View getTopView(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    private void init(Context context, AttributeSet attributeSet, int i8) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i8, 0);
        this.reducePaddingNoTitleNoButtons = obtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.noTitlePaddingFull = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.buttonPaddingFull = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.buttonHorizontalEdgeMargin = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.buttonBarHeight = resources.getDimensionPixelSize(R$dimen.md_button_height);
        this.dividerPaint = new Paint();
        this.dividerWidth = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.dividerPaint.setColor(com.afollestad.materialdialogs.util.a.resolveColor(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateDividersForScrollingView(ViewGroup viewGroup, boolean z7, boolean z8, boolean z9) {
        if (z7 && viewGroup.getChildCount() > 0) {
            View view = this.titleBar;
            this.drawTopDivider = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z8 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.drawBottomDivider = z9 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateDividersForWebView(WebView webView, boolean z7, boolean z8, boolean z9) {
        boolean z10 = false;
        if (z7) {
            View view = this.titleBar;
            this.drawTopDivider = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z8) {
            if (z9 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z10 = true;
            }
            this.drawBottomDivider = z10;
        }
    }

    private void invertGravityIfNecessary() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i8 = d.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[this.buttonGravity.ordinal()];
            if (i8 == 1) {
                this.buttonGravity = GravityEnum.END;
            } else {
                if (i8 != 2) {
                    return;
                }
                this.buttonGravity = GravityEnum.START;
            }
        }
    }

    private static boolean isVisible(View view) {
        boolean z7 = (view == null || view.getVisibility() == 8) ? false : true;
        if (z7 && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z7;
    }

    private void setUpDividersVisibility(View view, boolean z7, boolean z8) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (canScrollViewScroll(scrollView)) {
                addScrollListener(scrollView, z7, z8);
                return;
            }
            if (z7) {
                this.drawTopDivider = false;
            }
            if (z8) {
                this.drawBottomDivider = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (canAdapterViewScroll(adapterView)) {
                addScrollListener(adapterView, z7, z8);
                return;
            }
            if (z7) {
                this.drawTopDivider = false;
            }
            if (z8) {
                this.drawBottomDivider = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, z7, z8));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean canRecyclerViewScroll = canRecyclerViewScroll((RecyclerView) view);
            if (z7) {
                this.drawTopDivider = canRecyclerViewScroll;
            }
            if (z8) {
                this.drawBottomDivider = canRecyclerViewScroll;
            }
            if (canRecyclerViewScroll) {
                addScrollListener((ViewGroup) view, z7, z8);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View topView = getTopView(viewGroup);
            setUpDividersVisibility(topView, z7, z8);
            View bottomView = getBottomView(viewGroup);
            if (bottomView != topView) {
                setUpDividersVisibility(bottomView, false, true);
            }
        }
    }

    public void noTitleNoPadding() {
        this.noTitleNoPadding = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.content;
        if (view != null) {
            if (this.drawTopDivider) {
                canvas.drawRect(0.0f, r0 - this.dividerWidth, getMeasuredWidth(), view.getTop(), this.dividerPaint);
            }
            if (this.drawBottomDivider) {
                canvas.drawRect(0.0f, this.content.getBottom(), getMeasuredWidth(), r0 + this.dividerWidth, this.dividerPaint);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.titleBar = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.buttons[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.buttons[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.buttons[2] = (MDButton) childAt;
            } else {
                this.content = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        int measuredWidth2;
        int measuredWidth3;
        int i17;
        if (isVisible(this.titleBar)) {
            int measuredHeight = this.titleBar.getMeasuredHeight() + i9;
            this.titleBar.layout(i8, i9, i10, measuredHeight);
            i9 = measuredHeight;
        } else if (!this.noTitleNoPadding && this.useFullPadding) {
            i9 += this.noTitlePaddingFull;
        }
        if (isVisible(this.content)) {
            View view = this.content;
            view.layout(i8, i9, i10, view.getMeasuredHeight() + i9);
        }
        if (this.isStacked) {
            int i18 = i11 - this.buttonPaddingFull;
            for (MDButton mDButton : this.buttons) {
                if (isVisible(mDButton)) {
                    mDButton.layout(i8, i18 - mDButton.getMeasuredHeight(), i10, i18);
                    i18 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.useFullPadding) {
                i11 -= this.buttonPaddingFull;
            }
            int i19 = i11 - this.buttonBarHeight;
            int i20 = this.buttonHorizontalEdgeMargin;
            if (isVisible(this.buttons[2])) {
                if (this.buttonGravity == GravityEnum.END) {
                    measuredWidth3 = i8 + i20;
                    i17 = this.buttons[2].getMeasuredWidth() + measuredWidth3;
                    i12 = -1;
                } else {
                    int i21 = i10 - i20;
                    measuredWidth3 = i21 - this.buttons[2].getMeasuredWidth();
                    i17 = i21;
                    i12 = measuredWidth3;
                }
                this.buttons[2].layout(measuredWidth3, i19, i17, i11);
                i20 += this.buttons[2].getMeasuredWidth();
            } else {
                i12 = -1;
            }
            if (isVisible(this.buttons[1])) {
                GravityEnum gravityEnum = this.buttonGravity;
                if (gravityEnum == GravityEnum.END) {
                    i16 = i20 + i8;
                    measuredWidth2 = this.buttons[1].getMeasuredWidth() + i16;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth2 = i10 - i20;
                    i16 = measuredWidth2 - this.buttons[1].getMeasuredWidth();
                } else {
                    i16 = this.buttonHorizontalEdgeMargin + i8;
                    measuredWidth2 = this.buttons[1].getMeasuredWidth() + i16;
                    i13 = measuredWidth2;
                    this.buttons[1].layout(i16, i19, measuredWidth2, i11);
                }
                i13 = -1;
                this.buttons[1].layout(i16, i19, measuredWidth2, i11);
            } else {
                i13 = -1;
            }
            if (isVisible(this.buttons[0])) {
                GravityEnum gravityEnum2 = this.buttonGravity;
                if (gravityEnum2 == GravityEnum.END) {
                    i14 = i10 - this.buttonHorizontalEdgeMargin;
                    i15 = i14 - this.buttons[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    i15 = i8 + this.buttonHorizontalEdgeMargin;
                    i14 = this.buttons[0].getMeasuredWidth() + i15;
                } else {
                    if (i13 != -1 || i12 == -1) {
                        if (i12 == -1 && i13 != -1) {
                            measuredWidth = this.buttons[0].getMeasuredWidth();
                        } else if (i12 == -1) {
                            i13 = ((i10 - i8) / 2) - (this.buttons[0].getMeasuredWidth() / 2);
                            measuredWidth = this.buttons[0].getMeasuredWidth();
                        }
                        i12 = i13 + measuredWidth;
                    } else {
                        i13 = i12 - this.buttons[0].getMeasuredWidth();
                    }
                    i14 = i12;
                    i15 = i13;
                }
                this.buttons[0].layout(i15, i19, i14, i11);
            }
        }
        setUpDividersVisibility(this.content, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i8, int i9) {
        boolean z7;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int i14 = this.maxHeight;
        if (size2 > i14) {
            size2 = i14;
        }
        this.useFullPadding = true;
        StackingBehavior stackingBehavior = this.stackBehavior;
        int i15 = 0;
        if (stackingBehavior == StackingBehavior.ALWAYS) {
            z8 = true;
        } else {
            if (stackingBehavior != StackingBehavior.NEVER) {
                int i16 = 0;
                z7 = false;
                for (MDButton mDButton : this.buttons) {
                    if (mDButton != null && isVisible(mDButton)) {
                        mDButton.setStacked(false, false);
                        measureChild(mDButton, i8, i9);
                        i16 += mDButton.getMeasuredWidth();
                        z7 = true;
                    }
                }
                z8 = i16 > size - (getContext().getResources().getDimensionPixelSize(R$dimen.md_neutral_button_margin) * 2);
                this.isStacked = z8;
                if (z8) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    for (MDButton mDButton2 : this.buttons) {
                        if (mDButton2 != null && isVisible(mDButton2)) {
                            mDButton2.setStacked(true, false);
                            measureChild(mDButton2, i8, i9);
                            i10 += mDButton2.getMeasuredHeight();
                            z7 = true;
                        }
                    }
                }
                if (z7) {
                    i11 = this.buttonPaddingFull * 2;
                    i12 = size2;
                } else {
                    if (this.isStacked) {
                        i12 = size2 - i10;
                        int i17 = this.buttonPaddingFull;
                        i11 = i17 * 2;
                        i13 = i17 * 2;
                        if (isVisible(this.titleBar)) {
                            this.titleBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                            i12 -= this.titleBar.getMeasuredHeight();
                        } else if (!this.noTitleNoPadding) {
                            i11 += this.noTitlePaddingFull;
                        }
                        if (isVisible(this.content)) {
                            this.content.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i12 - i13, Integer.MIN_VALUE));
                            if (this.content.getMeasuredHeight() > i12 - i11) {
                                this.useFullPadding = false;
                            } else if (!this.reducePaddingNoTitleNoButtons || isVisible(this.titleBar) || z7) {
                                this.useFullPadding = true;
                                i15 = i12 - (this.content.getMeasuredHeight() + i11);
                            } else {
                                this.useFullPadding = false;
                                i15 = i12 - (this.content.getMeasuredHeight() + i13);
                            }
                        } else {
                            i15 = i12;
                        }
                        setMeasuredDimension(size, size2 - i15);
                    }
                    i12 = size2 - this.buttonBarHeight;
                    i11 = this.buttonPaddingFull * 2;
                }
                i13 = 0;
                if (isVisible(this.titleBar)) {
                }
                if (isVisible(this.content)) {
                }
                setMeasuredDimension(size, size2 - i15);
            }
            z8 = false;
        }
        z7 = false;
        this.isStacked = z8;
        if (z8) {
        }
        if (z7) {
        }
        i13 = 0;
        if (isVisible(this.titleBar)) {
        }
        if (isVisible(this.content)) {
        }
        setMeasuredDimension(size, size2 - i15);
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.buttonGravity = gravityEnum;
        invertGravityIfNecessary();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.buttons) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i8) {
        this.dividerPaint.setColor(i8);
        invalidate();
    }

    public void setMaxHeight(int i8) {
        this.maxHeight = i8;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.stackBehavior = stackingBehavior;
        invalidate();
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.buttons = new MDButton[3];
        this.drawTopDivider = false;
        this.drawBottomDivider = false;
        this.stackBehavior = StackingBehavior.ADAPTIVE;
        this.isStacked = false;
        this.useFullPadding = true;
        this.buttonGravity = GravityEnum.START;
        init(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.buttons = new MDButton[3];
        this.drawTopDivider = false;
        this.drawBottomDivider = false;
        this.stackBehavior = StackingBehavior.ADAPTIVE;
        this.isStacked = false;
        this.useFullPadding = true;
        this.buttonGravity = GravityEnum.START;
        init(context, attributeSet, i8);
    }

    @TargetApi(21)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.buttons = new MDButton[3];
        this.drawTopDivider = false;
        this.drawBottomDivider = false;
        this.stackBehavior = StackingBehavior.ADAPTIVE;
        this.isStacked = false;
        this.useFullPadding = true;
        this.buttonGravity = GravityEnum.START;
        init(context, attributeSet, i8);
    }
}
