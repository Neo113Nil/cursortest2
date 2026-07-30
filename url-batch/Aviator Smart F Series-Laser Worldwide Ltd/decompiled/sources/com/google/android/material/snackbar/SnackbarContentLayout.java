package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void updateTopBottomPadding(@NonNull View view, int i8, int i9) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i8, view.getPaddingEnd(), i9);
        } else {
            view.setPadding(view.getPaddingLeft(), i8, view.getPaddingRight(), i9);
        }
    }

    private boolean updateViewsWithinLayout(int i8, int i9, int i10) {
        boolean z7;
        if (i8 != getOrientation()) {
            setOrientation(i8);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.messageView.getPaddingTop() == i9 && this.messageView.getPaddingBottom() == i10) {
            return z7;
        }
        updateTopBottomPadding(this.messageView, i9, i10);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i8, int i9) {
        this.messageView.setAlpha(0.0f);
        long j8 = i9;
        long j9 = i8;
        this.messageView.animate().alpha(1.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j9).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j9).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i8, int i9) {
        this.messageView.setAlpha(1.0f);
        long j8 = i9;
        long j9 = i8;
        this.messageView.animate().alpha(0.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j9).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j9).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(R.id.snackbar_text);
        this.actionView = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.messageView.getLayout();
        boolean z7 = layout != null && layout.getLineCount() > 1;
        if (!z7 || this.maxInlineActionWidth <= 0 || this.actionView.getMeasuredWidth() <= this.maxInlineActionWidth) {
            if (!z7) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i8, i9);
    }

    public void setMaxInlineActionWidth(int i8) {
        this.maxInlineActionWidth = i8;
    }

    void updateActionTextColorAlphaIfNeeded(float f8) {
        if (f8 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface), this.actionView.getCurrentTextColor(), f8));
        }
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}
