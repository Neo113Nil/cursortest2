package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C1260i;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SuperLineHeightEditText extends C1260i implements FixedLineHeightView {
    private int currentLineCount;

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean horizontalScrollingEnabled;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isTextFitting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isTextFitting = true;
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.horizontalScrollingEnabled || this.isTextFitting) ? false : true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    private final void remeasureWrapContentConstrained() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -3) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            return;
        }
        if (this.currentLineCount != (getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount())) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            requestLayout();
        }
    }

    private final void requestDisallowInterceptTouchEvent(boolean z4) {
        this.isDisallowInterceptTouchEvent = z4;
        getParent().requestDisallowInterceptTouchEvent(z4);
    }

    private final void updateFittingText(int i4) {
        if (getLayout() == null || i4 == 0) {
            return;
        }
        this.isTextFitting = (i4 - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= TextViewsKt.textHeight(this, getLayout().getLineCount());
    }

    static /* synthetic */ void updateFittingText$default(SuperLineHeightEditText superLineHeightEditText, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFittingText");
        }
        if ((i5 & 1) != 0) {
            i4 = superLineHeightEditText.getHeight();
        }
        superLineHeightEditText.updateFittingText(i4);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.getExtraPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.getExtraPaddingTop();
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        TextView textView;
        int i6;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        int i7;
        int i8;
        super.onMeasure(i4, i5);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int maxLines = getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
        if (fixedLineHeightHelper.getLineHeight() == -1 || ViewsKt.isExact(i5)) {
            return;
        }
        textView = fixedLineHeightHelper.view;
        if (maxLines >= textView.getLineCount()) {
            i7 = fixedLineHeightHelper.textPaddingTop;
            i8 = fixedLineHeightHelper.textPaddingBottom;
            i6 = i7 + i8;
        } else {
            i6 = 0;
        }
        textView2 = fixedLineHeightHelper.view;
        int textHeight = TextViewsKt.textHeight(textView2, maxLines) + i6;
        textView3 = fixedLineHeightHelper.view;
        int paddingTop = textHeight + textView3.getPaddingTop();
        textView4 = fixedLineHeightHelper.view;
        int paddingBottom = paddingTop + textView4.getPaddingBottom();
        textView5 = fixedLineHeightHelper.view;
        int d4 = g.d(paddingBottom, textView5.getMinimumHeight());
        super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(d4, View.MeasureSpec.getSize(i5))) : ViewsKt.makeExactSpec(d4));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        updateFittingText(i5);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        if (Build.VERSION.SDK_INT < 28) {
            remeasureWrapContentConstrained();
        }
        updateFittingText$default(this, 0, 1, null);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!getInterceptTouchEventNeeded()) {
            if (this.isDisallowInterceptTouchEvent) {
                requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i4) {
        this.fixedLineHeightHelper.setLineHeight(i4);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z4) {
        this.horizontalScrollingEnabled = z4;
        super.setHorizontallyScrolling(z4);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        super.setTextSize(i4, f4);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }
}
