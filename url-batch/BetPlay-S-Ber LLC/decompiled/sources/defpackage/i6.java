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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class i6 extends TextView {
    public final t3 f;
    public final e6 g;
    public final h5 h;
    public b5 i;
    public boolean j;
    public j1 k;
    public Future l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e60.a(context);
        this.j = false;
        this.k = null;
        a60.a(this, getContext());
        t3 t3Var = new t3(this);
        this.f = t3Var;
        t3Var.d(attributeSet, i);
        e6 e6Var = new e6(this);
        this.g = e6Var;
        e6Var.f(attributeSet, i);
        e6Var.b();
        h5 h5Var = new h5(5, false);
        h5Var.g = this;
        this.h = h5Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private b5 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new b5(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.a();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ca0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return Math.round(e6Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ca0.c) {
            return super.getAutoSizeMinTextSize();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return Math.round(e6Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ca0.c) {
            return super.getAutoSizeStepGranularity();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return Math.round(e6Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ca0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e6 e6Var = this.g;
        return e6Var != null ? e6Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ca0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return e6Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof x50 ? ((x50) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public f6 getSuperCaller() {
        if (this.k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.k = new h6(this);
            } else if (i >= 28) {
                this.k = new g6(this);
            } else {
                this.k = new j1(3, this);
            }
        }
        return this.k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.c();
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
                j8.w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        h5 h5Var;
        if (Build.VERSION.SDK_INT >= 28 || (h5Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) h5Var.h;
        return textClassifier == null ? y5.a((TextView) h5Var.g) : textClassifier;
    }

    public ox getTextMetricsParamsCompat() {
        return j8.w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        e6.h(editorInfo, onCreateInputConnection, this);
        vw.a0(editorInfo, onCreateInputConnection, this);
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
        e6 e6Var = this.g;
        if (e6Var == null || ca0.c) {
            return;
        }
        e6Var.i.a();
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
                j8.w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e6 e6Var = this.g;
        if (e6Var != null) {
            n6 n6Var = e6Var.i;
            if (ca0.c || !n6Var.f()) {
                return;
            }
            n6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ca0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ca0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ca0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? l70.p(context, i) : null, i2 != 0 ? l70.p(context, i2) : null, i3 != 0 ? l70.p(context, i3) : null, i4 != 0 ? l70.p(context, i4) : null);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? l70.p(context, i) : null, i2 != 0 ? l70.p(context, i2) : null, i3 != 0 ? l70.p(context, i3) : null, i4 != 0 ? l70.p(context, i4) : null);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j8.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vw) getEmojiTextViewHelper().b.g).B(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i);
        } else {
            j8.N(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            j8.P(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().r(i, f);
        } else if (i2 >= 34) {
            f0.h(this, i, f);
        } else {
            j8.Q(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(px pxVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        j8.w(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e6 e6Var = this.g;
        e6Var.l(colorStateList);
        e6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e6 e6Var = this.g;
        e6Var.m(mode);
        e6Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        h5 h5Var;
        if (Build.VERSION.SDK_INT >= 28 || (h5Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            h5Var.h = textClassifier;
        }
    }

    public void setTextFuture(Future<px> future) {
        this.l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(ox oxVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = oxVar.b;
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
        getPaint().set(oxVar.a);
        setBreakStrategy(oxVar.c);
        setHyphenationFrequency(oxVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = ca0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            n6 n6Var = e6Var.i;
            if (z || n6Var.f()) {
                return;
            }
            n6Var.g(i, f);
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
            op opVar = n70.a;
            if (context == null) {
                o8.j("Context cannot be null");
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
        j8.Q(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    public i6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
