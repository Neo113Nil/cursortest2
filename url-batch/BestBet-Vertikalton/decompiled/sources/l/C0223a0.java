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
import c1.AbstractC0091d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k.C0191o;

/* renamed from: l.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0223a0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3362a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3363b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205B f3364c;
    public C0266w d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3365e;

    /* renamed from: f, reason: collision with root package name */
    public C0191o f3366f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3367g;

    public C0223a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0266w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0266w(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            c0252p.a();
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }

    public final void g() {
        Future future = this.f3367g;
        if (future == null) {
            return;
        }
        try {
            this.f3367g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            H1.d.I(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f3405c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            return Math.round(w2.i.f3394e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h1.f3405c) {
            return super.getAutoSizeMinTextSize();
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            return Math.round(w2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h1.f3405c) {
            return super.getAutoSizeStepGranularity();
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            return Math.round(w2.i.f3393c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f3405c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        W w2 = this.f3363b;
        return w2 != null ? w2.i.f3395f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h1.f3405c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            return w2.i.f3391a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f883a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public X getSuperCaller() {
        if (this.f3366f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f3366f = new Z(this);
            } else if (i >= 28) {
                this.f3366f = new Y(this);
            } else {
                this.f3366f = new C0191o(this);
            }
        }
        return this.f3366f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3363b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3363b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0205B c0205b;
        if (Build.VERSION.SDK_INT >= 28 || (c0205b = this.f3364c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0205b.f3251c;
        return textClassifier == null ? AbstractC0220Q.a((TextView) c0205b.f3250b) : textClassifier;
    }

    public I.e getTextMetricsParamsCompat() {
        return H1.d.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3363b.getClass();
        W.h(editorInfo, onCreateInputConnection, this);
        b1.g.u(editorInfo, onCreateInputConnection, this);
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
        W w2 = this.f3363b;
        if (w2 == null || h1.f3405c) {
            return;
        }
        w2.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        W w2 = this.f3363b;
        if (w2 == null || h1.f3405c) {
            return;
        }
        C0235g0 c0235g0 = w2.i;
        if (c0235g0.f()) {
            c0235g0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h1.f3405c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h1.f3405c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h1.f3405c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.d.x0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((H1.l) getEmojiTextViewHelper().f3485b.f6b).H(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            H1.d.k0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            H1.d.m0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        H1.d.n0(this, i);
    }

    public void setPrecomputedText(I.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        H1.d.I(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3362a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3363b;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3363b;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0205B c0205b;
        if (Build.VERSION.SDK_INT >= 28 || (c0205b = this.f3364c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0205b.f3251c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.f> future) {
        this.f3367g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f536b;
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
        getPaint().set(eVar.f535a);
        Q.m.e(this, eVar.f537c);
        Q.m.h(this, eVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = h1.f3405c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        W w2 = this.f3363b;
        if (w2 == null || z2) {
            return;
        }
        C0235g0 c0235g0 = w2.i;
        if (c0235g0.f()) {
            return;
        }
        c0235g0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f3365e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            H1.d dVar = C.h.f74a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f3365e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3365e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223a0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f3365e = false;
        this.f3366f = null;
        Q0.a(this, getContext());
        C0252p c0252p = new C0252p(this);
        this.f3362a = c0252p;
        c0252p.d(attributeSet, i);
        W w2 = new W(this);
        this.f3363b = w2;
        w2.f(attributeSet, i);
        w2.b();
        C0205B c0205b = new C0205B();
        c0205b.f3250b = this;
        this.f3364c = c0205b;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().e(i, f2);
        } else if (i2 >= 34) {
            Q.p.a(this, i, f2);
        } else {
            H1.d.n0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0091d.j(context, i) : null, i2 != 0 ? AbstractC0091d.j(context, i2) : null, i3 != 0 ? AbstractC0091d.j(context, i3) : null, i4 != 0 ? AbstractC0091d.j(context, i4) : null);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0091d.j(context, i) : null, i2 != 0 ? AbstractC0091d.j(context, i2) : null, i3 != 0 ? AbstractC0091d.j(context, i3) : null, i4 != 0 ? AbstractC0091d.j(context, i4) : null);
        W w2 = this.f3363b;
        if (w2 != null) {
            w2.b();
        }
    }
}
