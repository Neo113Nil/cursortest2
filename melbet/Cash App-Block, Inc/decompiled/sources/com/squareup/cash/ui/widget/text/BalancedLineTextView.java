package com.squareup.cash.ui.widget.text;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class BalancedLineTextView extends LineSpacingTextView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public float compatLineSpacingExtra;
    public float compatLineSpacingMultiplier;
    public boolean formatting;
    public AppCompatSpinner.AnonymousClass2 layoutListener;
    public int preferredLineCount;
    public CharSequence unbalancedText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalancedLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.preferredLineCount = 1;
        this.compatLineSpacingMultiplier = getLineSpacingMultiplier();
        this.compatLineSpacingExtra = getLineSpacingExtra();
        if (this.preferredLineCount > 1) {
            setBreakStrategy(1);
            setHyphenationFrequency(1);
        } else {
            setBreakStrategy(2);
            setHyphenationFrequency(0);
        }
    }

    public final void balanceText() {
        this.formatting = true;
        try {
            if (getWidth() == 0) {
                return;
            }
            int lineCount = getLineCount();
            int i = this.preferredLineCount;
            if (lineCount < i) {
                lineCount = i;
            }
            if (lineCount < 2) {
                setLineSpacing(RecyclerView.DECELERATION_RATE, 1.0f);
                return;
            }
            setLineSpacing(this.compatLineSpacingExtra, this.compatLineSpacingMultiplier);
            String obj = getText().toString();
            if (StringsKt.contains((CharSequence) obj, (CharSequence) "\n", false)) {
                return;
            }
            String replace$default = StringsKt__StringsJVMKt.replace$default(obj, "\n", " ");
            int length = replace$default.length();
            int i2 = length / lineCount;
            int i3 = lineCount - 1;
            String str = replace$default;
            while (i3 > 0) {
                int roundToInt = MathKt__MathJVMKt.roundToInt((length * i3) / (i3 + 1));
                int lastIndexOf$default = StringsKt.lastIndexOf$default(' ', roundToInt, 4, (CharSequence) replace$default);
                int indexOf$default = StringsKt.indexOf$default((CharSequence) replace$default, ' ', roundToInt, false, 4);
                length = (lastIndexOf$default != -1 ? roundToInt - lastIndexOf$default : Integer.MAX_VALUE) < (indexOf$default != -1 ? indexOf$default - roundToInt : Integer.MAX_VALUE) ? lastIndexOf$default : indexOf$default;
                if (length < (i3 - 1) * i2) {
                    i3--;
                }
                if (length != -1) {
                    str = str.substring(0, length) + "\n" + str.substring(length + 1);
                }
                i3--;
            }
            setText(str);
        } finally {
            this.formatting = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getViewTreeObserver().isAlive()) {
            if (this.layoutListener == null) {
                this.layoutListener = new AppCompatSpinner.AnonymousClass2(this, 4);
            }
            getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.layoutListener == null || !getViewTreeObserver().isAlive()) {
            return;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.formatting) {
            return;
        }
        this.unbalancedText = charSequence;
        if (this.preferredLineCount > 1) {
            post(new Task$$ExternalSyntheticLambda0(this, 4));
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        if (this.formatting) {
            return;
        }
        this.compatLineSpacingExtra = f;
        this.compatLineSpacingMultiplier = f2;
    }

    public final void setPreferredLineCount(int i) {
        this.preferredLineCount = i;
        if (i > 1) {
            setBreakStrategy(1);
            setHyphenationFrequency(1);
        } else {
            setBreakStrategy(2);
            setHyphenationFrequency(0);
        }
    }

    public final void setTextIfChanged(CharSequence charSequence) {
        if (Intrinsics.areEqual(charSequence, this.unbalancedText)) {
            return;
        }
        setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BalancedLineTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ BalancedLineTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
