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

/* renamed from: l.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0204b0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f2943a;

    /* renamed from: b, reason: collision with root package name */
    public final X f2944b;

    /* renamed from: c, reason: collision with root package name */
    public final C0183B f2945c;
    public C0245w d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2946e;

    /* renamed from: f, reason: collision with root package name */
    public A0.h f2947f;

    /* renamed from: g, reason: collision with root package name */
    public Future f2948g;

    public C0204b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0245w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0245w(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            c0231p.a();
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }

    public final void g() {
        Future future = this.f2948g;
        if (future == null) {
            return;
        }
        try {
            this.f2948g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            A.c.V(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f2984c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            return Math.round(x2.i.f2973e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h1.f2984c) {
            return super.getAutoSizeMinTextSize();
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            return Math.round(x2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h1.f2984c) {
            return super.getAutoSizeStepGranularity();
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            return Math.round(x2.i.f2972c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f2984c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x2 = this.f2944b;
        return x2 != null ? x2.i.f2974f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h1.f2984c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            return x2.i.f2970a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f632a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Y getSuperCaller() {
        if (this.f2947f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2947f = new C0202a0(this);
            } else if (i >= 28) {
                this.f2947f = new Z(this);
            } else {
                this.f2947f = new A0.h(28, this);
            }
        }
        return this.f2947f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2944b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2944b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0183B c0183b;
        if (Build.VERSION.SDK_INT >= 28 || (c0183b = this.f2945c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0183b.f2828c;
        return textClassifier == null ? AbstractC0198Q.a((TextView) c0183b.f2827b) : textClassifier;
    }

    public I.e getTextMetricsParamsCompat() {
        return A.c.V(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2944b.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        h0.g.h(editorInfo, onCreateInputConnection, this);
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
        X x2 = this.f2944b;
        if (x2 == null || h1.f2984c) {
            return;
        }
        x2.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        X x2 = this.f2944b;
        if (x2 == null || h1.f2984c) {
            return;
        }
        C0214g0 c0214g0 = x2.i;
        if (c0214g0.f()) {
            c0214g0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h1.f2984c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h1.f2984c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h1.f2984c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A.c.L0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((T.d) getEmojiTextViewHelper().f3066b.f30b).v(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            A.c.B0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().t(i);
        } else {
            A.c.D0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        A.c.E0(this, i);
    }

    public void setPrecomputedText(I.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        A.c.V(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f2943a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2944b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2944b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0183B c0183b;
        if (Build.VERSION.SDK_INT >= 28 || (c0183b = this.f2945c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0183b.f2828c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.f> future) {
        this.f2948g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f259b;
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
        getPaint().set(eVar.f258a);
        Q.n.e(this, eVar.f260c);
        Q.n.h(this, eVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = h1.f2984c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        X x2 = this.f2944b;
        if (x2 == null || z2) {
            return;
        }
        C0214g0 c0214g0 = x2.i;
        if (c0214g0.f()) {
            return;
        }
        c0214g0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2946e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            A.c cVar = C.h.f100a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f2946e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2946e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f2946e = false;
        this.f2947f = null;
        Q0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f2943a = c0231p;
        c0231p.d(attributeSet, i);
        X x2 = new X(this);
        this.f2944b = x2;
        x2.f(attributeSet, i);
        x2.b();
        C0183B c0183b = new C0183B();
        c0183b.f2827b = this;
        this.f2945c = c0183b;
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
            A.c.E0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? T.d.t(context, i) : null, i2 != 0 ? T.d.t(context, i2) : null, i3 != 0 ? T.d.t(context, i3) : null, i4 != 0 ? T.d.t(context, i4) : null);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? T.d.t(context, i) : null, i2 != 0 ? T.d.t(context, i2) : null, i3 != 0 ? T.d.t(context, i3) : null, i4 != 0 ? T.d.t(context, i4) : null);
        X x2 = this.f2944b;
        if (x2 != null) {
            x2.b();
        }
    }
}
