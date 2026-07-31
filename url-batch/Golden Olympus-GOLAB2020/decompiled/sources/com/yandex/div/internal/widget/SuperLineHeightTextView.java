package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean isTightenWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
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
        int min = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(i5)) {
            textView = fixedLineHeightHelper.view;
            if (min >= textView.getLineCount()) {
                i7 = fixedLineHeightHelper.textPaddingTop;
                i8 = fixedLineHeightHelper.textPaddingBottom;
                i6 = i7 + i8;
            } else {
                i6 = 0;
            }
            textView2 = fixedLineHeightHelper.view;
            int textHeight = TextViewsKt.textHeight(textView2, min) + i6;
            textView3 = fixedLineHeightHelper.view;
            int paddingTop = textHeight + textView3.getPaddingTop();
            textView4 = fixedLineHeightHelper.view;
            int paddingBottom = paddingTop + textView4.getPaddingBottom();
            textView5 = fixedLineHeightHelper.view;
            int d4 = g.d(paddingBottom, textView5.getMinimumHeight());
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(d4, View.MeasureSpec.getSize(i5))) : ViewsKt.makeExactSpec(d4));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float f4 = 0.0f;
            for (int i9 = 0; i9 < lineCount; i9++) {
                f4 = Math.max(f4, getLayout().getLineWidth(i9));
            }
            int ceil = (int) Math.ceil(f4 + getCompoundPaddingLeft() + getCompoundPaddingRight());
            if (ceil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(ceil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i4) {
        this.fixedLineHeightHelper.setLineHeight(i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i4, float f4) {
        super.setTextSize(i4, f4);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }

    public final void setTightenWidth(boolean z4) {
        boolean z5 = this.isTightenWidth;
        this.isTightenWidth = z4;
        if (z5 != z4) {
            requestLayout();
        }
    }
}
