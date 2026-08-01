package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class b6 extends TextView {
    public final y1 f;
    public final x5 g;
    public final a5 h;
    public u4 i;
    public boolean j;
    public rc0 k;
    public Future l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g90.a(context);
        this.j = false;
        this.k = null;
        z80.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, i);
        x5 x5Var = new x5(this);
        this.g = x5Var;
        x5Var.f(attributeSet, i);
        x5Var.b();
        a5 a5Var = new a5(7, false);
        a5Var.g = this;
        this.h = a5Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new u4(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ed0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return Math.round(x5Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ed0.c) {
            return super.getAutoSizeMinTextSize();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return Math.round(x5Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ed0.c) {
            return super.getAutoSizeStepGranularity();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return Math.round(x5Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ed0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x5 x5Var = this.g;
        return x5Var != null ? x5Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ed0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return x5Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof w80 ? ((w80) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public y5 getSuperCaller() {
        if (this.k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.k = new a6(this);
            } else if (i >= 28) {
                this.k = new z5(this);
            } else {
                this.k = new rc0(8, this);
            }
        }
        return this.k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.l;
        if (future != null) {
            try {
                this.l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                xf.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a5 a5Var;
        if (Build.VERSION.SDK_INT >= 28 || (a5Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a5Var.h;
        return textClassifier == null ? r5.a((TextView) a5Var.g) : textClassifier;
    }

    public e00 getTextMetricsParamsCompat() {
        return xf.u(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        x5.h(editorInfo, onCreateInputConnection, this);
        kr.M(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x5 x5Var = this.g;
        if (x5Var == null || ed0.c) {
            return;
        }
        x5Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.l;
        if (future != null) {
            try {
                this.l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                xf.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        x5 x5Var = this.g;
        if (x5Var != null) {
            g6 g6Var = x5Var.i;
            if (ed0.c || !g6Var.f()) {
                return;
            }
            g6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ed0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ed0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ed0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? mz.m(context, i) : null, i2 != 0 ? mz.m(context, i2) : null, i3 != 0 ? mz.m(context, i3) : null, i4 != 0 ? mz.m(context, i4) : null);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? mz.m(context, i) : null, i2 != 0 ? mz.m(context, i2) : null, i3 != 0 ? mz.m(context, i3) : null, i4 != 0 ? mz.m(context, i4) : null);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xf.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((kr) getEmojiTextViewHelper().b.g).z(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().s(i);
        } else {
            xf.I(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            xf.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().v(i, f);
        } else if (i2 >= 34) {
            h0.h(this, i, f);
        } else {
            xf.K(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(f00 f00Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        xf.u(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.g;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.g;
        x5Var.m(mode);
        x5Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a5 a5Var;
        if (Build.VERSION.SDK_INT >= 28 || (a5Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a5Var.h = textClassifier;
        }
    }

    public void setTextFuture(Future<f00> future) {
        this.l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(e00 e00Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = e00Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(e00Var.a);
        setBreakStrategy(e00Var.c);
        setHyphenationFrequency(e00Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = ed0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            g6 g6Var = x5Var.i;
            if (z || g6Var.f()) {
                return;
            }
            g6Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.j) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            xf xfVar = na0.a;
            if (context == null) {
                g9.i("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.j = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        xf.K(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    public b6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
