package com.squareup.cash.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.resources.R$styleable;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.squareup.cash.ui.widget.text.LineSpacingTextView;
import com.squareup.util.android.animation.AnimationListenerAdapter;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class TextSwapper extends FrameLayout {
    public final boolean allowShrinking;
    public final boolean animateFirstView;
    public final boolean autoSizeEnabled;
    public final int autoSizeMaxTextSize;
    public final int autoSizeMinTextSize;
    public final int autoSizeTextType;
    public final Animation backInAnimation;
    public final Animation backOutAnimation;
    public int currentChild;
    public boolean firstTime;
    public int gravity;
    public final Animation inAnimation;
    public int minLines;
    public final Animation outAnimation;
    public final int textColor;
    public final int textPadding;
    public final float textSize;
    public final int textType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSwapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.firstTime = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextSwapper);
        obtainStyledAttributes.getClass();
        this.animateFirstView = obtainStyledAttributes.getBoolean(5, true);
        this.gravity = obtainStyledAttributes.getInt(2, -1);
        this.minLines = obtainStyledAttributes.getInt(4, -1);
        this.textColor = obtainStyledAttributes.getColor(1, 0);
        this.textSize = obtainStyledAttributes.getDimension(0, RecyclerView.DECELERATION_RATE);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        this.allowShrinking = z;
        this.autoSizeEnabled = z && obtainStyledAttributes.hasValue(9) && obtainStyledAttributes.hasValue(8) && obtainStyledAttributes.hasValue(7);
        this.autoSizeTextType = obtainStyledAttributes.getInt(9, 0);
        this.autoSizeMinTextSize = obtainStyledAttributes.getDimensionPixelSize(8, -1);
        this.autoSizeMaxTextSize = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        this.textPadding = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.textType = obtainStyledAttributes.getInt(15, 0);
        String string2 = obtainStyledAttributes.getString(3);
        int resourceId = obtainStyledAttributes.getResourceId(12, 0);
        if (resourceId != 0) {
            this.inAnimation = AnimationUtils.loadAnimation(context, resourceId);
        } else {
            this.inAnimation = null;
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.outAnimation = AnimationUtils.loadAnimation(context, resourceId2);
        } else {
            this.outAnimation = null;
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(10, 0);
        if (resourceId3 != 0) {
            this.backInAnimation = AnimationUtils.loadAnimation(context, resourceId3);
        } else {
            this.backInAnimation = this.inAnimation;
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(11, 0);
        if (resourceId4 != 0) {
            this.backOutAnimation = AnimationUtils.loadAnimation(context, resourceId4);
        } else {
            this.backOutAnimation = this.outAnimation;
        }
        obtainStyledAttributes.recycle();
        addView(createTextView());
        addView(createTextView());
        if (string2 != null) {
            setCurrentText(string2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        if (getChildCount() >= 2) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't add more than 2 views to a TextSwapper");
        } else {
            super.addView(view, i, layoutParams);
            view.setVisibility(getChildCount() == 1 ? 0 : 8);
        }
    }

    public final LineSpacingTextView createTextView() {
        LineSpacingTextView lineSpacingTextView;
        int i = 2;
        AttributeSet attributeSet = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (this.textType == 0) {
            Context context = getContext();
            context.getClass();
            lineSpacingTextView = new LineSpacingTextView(context, attributeSet, i, z3 ? 1 : 0);
        } else {
            Context context2 = getContext();
            context2.getClass();
            lineSpacingTextView = new BalancedLineTextView(context2, z2 ? 1 : 0, i, z ? 1 : 0);
        }
        int i2 = this.textPadding;
        lineSpacingTextView.setPadding(i2, i2, i2, i2);
        lineSpacingTextView.setTextColor(this.textColor);
        lineSpacingTextView.setTextSize(0, this.textSize);
        if (this.autoSizeEnabled) {
            lineSpacingTextView.setAutoSizeTextTypeWithDefaults(this.autoSizeTextType);
            lineSpacingTextView.setAutoSizeTextTypeUniformWithConfiguration(this.autoSizeMinTextSize, this.autoSizeMaxTextSize, 1, 0);
        }
        lineSpacingTextView.setGravity(this.gravity);
        if (this.gravity != -1) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.gravity;
            lineSpacingTextView.setLayoutParams(layoutParams);
        }
        lineSpacingTextView.setMinLines(this.minLines);
        return lineSpacingTextView;
    }

    public final void setCurrentText(CharSequence charSequence) {
        View childAt = getChildAt(this.currentChild);
        childAt.getClass();
        ((TextView) childAt).setText(charSequence);
        updateHeight();
    }

    public final void setGravity(int i) {
        this.gravity = i;
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            View view = (View) viewGroupKt$iterator$1.next();
            view.getClass();
            TextView textView = (TextView) view;
            textView.setGravity(this.gravity);
            if (this.gravity != -1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.gravity;
                textView.setLayoutParams(layoutParams);
            }
        }
    }

    public final void setMinLines(int i) {
        this.minLines = i;
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.getClass();
            ((TextView) view).setMinLines(this.minLines);
        }
        updateHeight();
    }

    public final void setMovementMethod(MovementMethod movementMethod) {
        movementMethod.getClass();
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.getClass();
            ((TextView) view).setMovementMethod(movementMethod);
        }
    }

    public final void setText(CharSequence charSequence, boolean z) {
        final int i = 0;
        View childAt = getChildAt(this.currentChild == 0 ? 1 : 0);
        childAt.getClass();
        ((TextView) childAt).setText(charSequence);
        updateHeight();
        View childAt2 = getChildAt(this.currentChild);
        childAt2.getClass();
        final TextView textView = (TextView) childAt2;
        View childAt3 = getChildAt(this.currentChild == 0 ? 1 : 0);
        childAt3.getClass();
        final TextView textView2 = (TextView) childAt3;
        Animation animation = this.inAnimation;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.outAnimation;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.backInAnimation;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.backOutAnimation;
        if (animation4 != null) {
            animation4.cancel();
        }
        if (z) {
            animation = animation3;
        }
        if (animation == null || (this.firstTime && !this.animateFirstView)) {
            textView2.setVisibility(0);
        } else {
            animation.setAnimationListener(new AnimationListenerAdapter() { // from class: com.squareup.cash.ui.widget.TextSwapper$animateToNext$1
                @Override // com.squareup.util.android.animation.AnimationListenerAdapter, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation5) {
                    switch (i) {
                        case 1:
                            animation5.getClass();
                            textView2.setVisibility(8);
                            break;
                        default:
                            super.onAnimationEnd(animation5);
                            break;
                    }
                }

                @Override // com.squareup.util.android.animation.AnimationListenerAdapter, android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation5) {
                    switch (i) {
                        case 0:
                            animation5.getClass();
                            textView2.setVisibility(0);
                            break;
                        default:
                            super.onAnimationStart(animation5);
                            break;
                    }
                }
            });
            textView2.startAnimation(animation);
        }
        if (z) {
            animation2 = animation4;
        }
        if (animation2 == null || this.firstTime) {
            textView.setVisibility(8);
        } else {
            animation2.setAnimationListener(new AnimationListenerAdapter() { // from class: com.squareup.cash.ui.widget.TextSwapper$animateToNext$1
                @Override // com.squareup.util.android.animation.AnimationListenerAdapter, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation5) {
                    switch (r2) {
                        case 1:
                            animation5.getClass();
                            textView.setVisibility(8);
                            break;
                        default:
                            super.onAnimationEnd(animation5);
                            break;
                    }
                }

                @Override // com.squareup.util.android.animation.AnimationListenerAdapter, android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation5) {
                    switch (r2) {
                        case 0:
                            animation5.getClass();
                            textView.setVisibility(0);
                            break;
                        default:
                            super.onAnimationStart(animation5);
                            break;
                    }
                }
            });
            textView.startAnimation(animation2);
        }
        this.currentChild = this.currentChild != 0 ? 0 : 1;
        this.firstTime = false;
    }

    public final void setTextColor(int i) {
        View childAt = getChildAt(this.currentChild);
        childAt.getClass();
        ((TextView) childAt).setTextColor(i);
        View childAt2 = getChildAt(this.currentChild == 0 ? 1 : 0);
        childAt2.getClass();
        ((TextView) childAt2).setTextColor(i);
    }

    public final void updateHeight() {
        int max;
        if (this.allowShrinking || (max = Math.max(getChildAt(0).getHeight(), getChildAt(1).getHeight())) <= getMinimumHeight()) {
            return;
        }
        setMinimumHeight(max);
    }

    public final void setCurrentText(int i) {
        setCurrentText(getContext().getString(i));
    }

    public final void setText(CharSequence charSequence) {
        setText(charSequence, false);
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }
}
