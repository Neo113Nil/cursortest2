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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class r5 extends TextView {
    public final x1 f;
    public final n5 g;
    public final q4 h;
    public k4 i;
    public boolean j;
    public k0 k;
    public Future l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w50.a(context);
        this.j = false;
        this.k = null;
        s50.a(this, getContext());
        x1 x1Var = new x1(this);
        this.f = x1Var;
        x1Var.l(attributeSet, i);
        n5 n5Var = new n5(this);
        this.g = n5Var;
        n5Var.f(attributeSet, i);
        n5Var.b();
        q4 q4Var = new q4(7, false);
        q4Var.g = this;
        this.h = q4Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private k4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new k4(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.a();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (v90.c) {
            return super.getAutoSizeMaxTextSize();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return Math.round(n5Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (v90.c) {
            return super.getAutoSizeMinTextSize();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return Math.round(n5Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (v90.c) {
            return super.getAutoSizeStepGranularity();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return Math.round(n5Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (v90.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        n5 n5Var = this.g;
        return n5Var != null ? n5Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (v90.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return n5Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof p50 ? ((p50) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public o5 getSuperCaller() {
        if (this.k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.k = new q5(this);
            } else if (i >= 28) {
                this.k = new p5(this);
            } else {
                this.k = new k0(6, this);
            }
        }
        return this.k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.i();
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
                jw.B(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        q4 q4Var;
        if (Build.VERSION.SDK_INT >= 28 || (q4Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) q4Var.h;
        return textClassifier == null ? h5.a((TextView) q4Var.g) : textClassifier;
    }

    public bx getTextMetricsParamsCompat() {
        return jw.B(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        n5.h(editorInfo, onCreateInputConnection, this);
        o8.Y(editorInfo, onCreateInputConnection, this);
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
        n5 n5Var = this.g;
        if (n5Var == null || v90.c) {
            return;
        }
        n5Var.i.a();
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
                jw.B(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        n5 n5Var = this.g;
        if (n5Var != null) {
            w5 w5Var = n5Var.i;
            if (v90.c || !w5Var.f()) {
                return;
            }
            w5Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (v90.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (v90.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (v90.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? zo.s(context, i) : null, i2 != 0 ? zo.s(context, i2) : null, i3 != 0 ? zo.s(context, i3) : null, i4 != 0 ? zo.s(context, i4) : null);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? zo.s(context, i) : null, i2 != 0 ? zo.s(context, i2) : null, i3 != 0 ? zo.s(context, i3) : null, i4 != 0 ? zo.s(context, i4) : null);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jw.f0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((e70) getEmojiTextViewHelper().b.g).A(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().t(i);
        } else {
            jw.Z(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            jw.b0(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().w(i, f);
        } else if (i2 >= 34) {
            f0.h(this, i, f);
        } else {
            jw.c0(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(cx cxVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        jw.B(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        n5 n5Var = this.g;
        n5Var.l(colorStateList);
        n5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        n5 n5Var = this.g;
        n5Var.m(mode);
        n5Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        q4 q4Var;
        if (Build.VERSION.SDK_INT >= 28 || (q4Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q4Var.h = textClassifier;
        }
    }

    public void setTextFuture(Future<cx> future) {
        this.l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(bx bxVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bxVar.b;
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
        getPaint().set(bxVar.a);
        setBreakStrategy(bxVar.c);
        setHyphenationFrequency(bxVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = v90.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            w5 w5Var = n5Var.i;
            if (z || w5Var.f()) {
                return;
            }
            w5Var.g(i, f);
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
            e70 e70Var = g70.a;
            if (context == null) {
                t8.k("Context cannot be null");
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
        jw.c0(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    public r5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
