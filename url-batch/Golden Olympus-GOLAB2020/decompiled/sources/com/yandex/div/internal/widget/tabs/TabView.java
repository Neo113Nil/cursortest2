package com.yandex.div.internal.widget.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AbstractC1250a;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightTextView;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* loaded from: classes2.dex */
public final class TabView extends SuperLineHeightTextView {
    private DivTypefaceType mActiveTypefaceType;
    private boolean mBoldTextOnSelection;
    private boolean mEllipsizeEnabled;
    private DivTypefaceType mInactiveTypefaceType;
    private InputFocusTracker mInputFocusTracker;
    private boolean mIsActiveType;

    @NonNull
    private MaxWidthProvider mMaxWidthProvider;
    private OnUpdateListener mOnUpdateListener;
    private BaseIndicatorTabLayout.Tab mTab;
    private int mTextAppearance;
    private DivTypefaceProvider mTypefaceProvider;

    interface MaxWidthProvider {
        int getMaxWidth();
    }

    interface OnUpdateListener {
        void onUpdated(@NonNull TabView tabView);
    }

    public TabView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ int d() {
        return Integer.MAX_VALUE;
    }

    public static /* synthetic */ void e(View view) {
    }

    @SuppressLint({"WrongCall"})
    private void fixTextEllipsis(int i4, int i5) {
        BaseIndicatorTabLayout.Tab tab;
        CharSequence text;
        TextPaint paint;
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (tab = this.mTab) == null || (text = tab.getText()) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, this);
        }
        if (text == null) {
            return;
        }
        setText(TextUtils.ellipsize(text, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i4, i5);
    }

    private Typeface getDefaultTypeface() {
        DivTypefaceProvider divTypefaceProvider = this.mTypefaceProvider;
        if (divTypefaceProvider != null) {
            if (this.mIsActiveType) {
                DivTypefaceType divTypefaceType = this.mActiveTypefaceType;
                if (divTypefaceType != null) {
                    return divTypefaceType.getTypeface(divTypefaceProvider);
                }
            } else {
                DivTypefaceType divTypefaceType2 = this.mInactiveTypefaceType;
                if (divTypefaceType2 != null) {
                    return divTypefaceType2.getTypeface(divTypefaceProvider);
                }
            }
        }
        if (divTypefaceProvider != null) {
            return divTypefaceProvider.getMedium();
        }
        return null;
    }

    private void setupTypeface() {
        if (isSelected()) {
            return;
        }
        setTextAppearance(getContext(), this.mTextAppearance);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC1250a.b.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC1250a.b.class.getName());
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        Typeface defaultTypeface;
        TextPaint paint = getPaint();
        if (paint != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint.setTypeface(defaultTypeface);
        }
        if (!this.mEllipsizeEnabled) {
            super.onMeasure(i4, i5);
            return;
        }
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int maxWidth = this.mMaxWidthProvider.getMaxWidth();
        if (maxWidth > 0 && (mode == 0 || size > maxWidth)) {
            i4 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        fixTextEllipsis(i4, i5);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        InputFocusTracker inputFocusTracker = this.mInputFocusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(this, inputFocusTracker);
        }
        BaseIndicatorTabLayout.Tab tab = this.mTab;
        if (tab == null) {
            return performClick;
        }
        tab.select();
        return true;
    }

    void reset() {
        setTab(null);
        setSelected(false);
    }

    public void setActiveTypefaceType(DivTypefaceType divTypefaceType) {
        this.mActiveTypefaceType = divTypefaceType;
    }

    void setBoldTextOnSelection(boolean z4) {
        this.mBoldTextOnSelection = z4;
    }

    void setEllipsizeEnabled(boolean z4) {
        this.mEllipsizeEnabled = z4;
        setEllipsize(z4 ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        setAlpha(z4 ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(DivTypefaceType divTypefaceType) {
        this.mInactiveTypefaceType = divTypefaceType;
    }

    void setInputFocusTracker(InputFocusTracker inputFocusTracker) {
        this.mInputFocusTracker = inputFocusTracker;
    }

    public void setMaxWidthProvider(@NonNull MaxWidthProvider maxWidthProvider) {
        this.mMaxWidthProvider = maxWidthProvider;
    }

    void setOnUpdateListener(OnUpdateListener onUpdateListener) {
        this.mOnUpdateListener = onUpdateListener;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z4) {
        boolean z5 = isSelected() != z4;
        super.setSelected(z4);
        setTypefaceType(z4);
        if (this.mBoldTextOnSelection && z5) {
            setupTypeface();
        }
        if (z5 && z4) {
            sendAccessibilityEvent(4);
        }
    }

    void setTab(BaseIndicatorTabLayout.Tab tab) {
        if (tab != this.mTab) {
            this.mTab = tab;
            update();
        }
    }

    public void setTabPadding(int i4, int i5, int i6, int i7) {
        AbstractC1281a0.F0(this, i4, i5, i6, i7);
    }

    void setTextColorList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    void setTextTypeface(DivTypefaceProvider divTypefaceProvider, int i4) {
        this.mTypefaceProvider = divTypefaceProvider;
        this.mTextAppearance = i4;
        setupTypeface();
    }

    public void setTypefaceType(boolean z4) {
        boolean z5 = this.mIsActiveType != z4;
        this.mIsActiveType = z4;
        if (z5) {
            requestLayout();
        }
    }

    void update() {
        BaseIndicatorTabLayout.Tab tab = this.mTab;
        setText(tab == null ? null : tab.getText());
        OnUpdateListener onUpdateListener = this.mOnUpdateListener;
        if (onUpdateListener != null) {
            onUpdateListener.onUpdated(this);
        }
    }

    public TabView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabView(@NonNull Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mMaxWidthProvider = new MaxWidthProvider() { // from class: com.yandex.div.internal.widget.tabs.j
            @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
            public final int getMaxWidth() {
                return TabView.d();
            }
        };
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.tabs.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TabView.e(view);
            }
        });
    }
}
