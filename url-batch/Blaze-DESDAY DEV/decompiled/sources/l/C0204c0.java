package l;

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
import k0.AbstractC0180a;

/* renamed from: l.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0204c0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f2916b;

    /* renamed from: c, reason: collision with root package name */
    public final C0183C f2917c;
    public C0245x d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2918e;

    /* renamed from: f, reason: collision with root package name */
    public C.g f2919f;

    /* renamed from: g, reason: collision with root package name */
    public Future f2920g;

    public C0204c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0245x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0245x(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            c0229p.a();
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }

    public final void g() {
        Future future = this.f2920g;
        if (future == null) {
            return;
        }
        try {
            this.f2920g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            z1.d.P(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f2956c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            return Math.round(y2.i.f2944e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f2956c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            return Math.round(y2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f2956c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            return Math.round(y2.i.f2943c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f2956c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f2916b;
        return y2 != null ? y2.i.f2945f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (i1.f2956c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            return y2.i.f2941a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f729a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Z getSuperCaller() {
        if (this.f2919f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2919f = new C0202b0(this);
            } else if (i >= 28) {
                this.f2919f = new C0200a0(this);
            } else {
                this.f2919f = new C.g(29, this);
            }
        }
        return this.f2919f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2916b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2916b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0183C c0183c;
        if (Build.VERSION.SDK_INT >= 28 || (c0183c = this.f2917c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0183c.f2798c;
        return textClassifier == null ? AbstractC0198S.a((TextView) c0183c.f2797b) : textClassifier;
    }

    public I.d getTextMetricsParamsCompat() {
        return z1.d.P(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2916b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        AbstractC0180a.m(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        Y y2 = this.f2916b;
        if (y2 == null || i1.f2956c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f2916b;
        if (y2 == null || i1.f2956c) {
            return;
        }
        C0214h0 c0214h0 = y2.i;
        if (c0214h0.f()) {
            c0214h0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (i1.f2956c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (i1.f2956c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (i1.f2956c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z1.d.u0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((z1.d) getEmojiTextViewHelper().f3039b.f80b).G(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            z1.d.m0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().v(i);
        } else {
            z1.d.n0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        z1.d.o0(this, i);
    }

    public void setPrecomputedText(I.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        z1.d.P(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f2915a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f2916b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f2916b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0183C c0183c;
        if (Build.VERSION.SDK_INT >= 28 || (c0183c = this.f2917c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0183c.f2798c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.e> future) {
        this.f2920g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f313b;
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
        getPaint().set(dVar.f312a);
        Q.n.e(this, dVar.f314c);
        Q.n.h(this, dVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = i1.f2956c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f2916b;
        if (y2 == null || z2) {
            return;
        }
        C0214h0 c0214h0 = y2.i;
        if (c0214h0.f()) {
            return;
        }
        c0214h0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2918e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            z1.d dVar = C.h.f81a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f2918e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2918e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204c0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S0.a(context);
        this.f2918e = false;
        this.f2919f = null;
        R0.a(this, getContext());
        C0229p c0229p = new C0229p(this);
        this.f2915a = c0229p;
        c0229p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f2916b = y2;
        y2.f(attributeSet, i);
        y2.b();
        C0183C c0183c = new C0183C();
        c0183c.f2797b = this;
        this.f2917c = c0183c;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().n(i, f2);
        } else if (i2 >= 34) {
            Q.q.a(this, i, f2);
        } else {
            z1.d.o0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? z1.l.w(context, i) : null, i2 != 0 ? z1.l.w(context, i2) : null, i3 != 0 ? z1.l.w(context, i3) : null, i4 != 0 ? z1.l.w(context, i4) : null);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? z1.l.w(context, i) : null, i2 != 0 ? z1.l.w(context, i2) : null, i3 != 0 ? z1.l.w(context, i3) : null, i4 != 0 ? z1.l.w(context, i4) : null);
        Y y2 = this.f2916b;
        if (y2 != null) {
            y2.b();
        }
    }
}
