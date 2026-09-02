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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class c1 extends TextView {

    /* renamed from: f, reason: collision with root package name */
    public final f1.b f2256f;

    /* renamed from: g, reason: collision with root package name */
    public final y0 f2257g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f2258h;
    public x i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2259j;

    /* renamed from: k, reason: collision with root package name */
    public a0.a f2260k;

    /* renamed from: l, reason: collision with root package name */
    public Future f2261l;

    public c1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private x getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new x(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            bVar.a();
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l3.f2383c) {
            return super.getAutoSizeMaxTextSize();
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            return Math.round(y0Var.i.f2331e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l3.f2383c) {
            return super.getAutoSizeMinTextSize();
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            return Math.round(y0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l3.f2383c) {
            return super.getAutoSizeStepGranularity();
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            return Math.round(y0Var.i.f2330c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l3.f2383c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y0 y0Var = this.f2257g;
        return y0Var != null ? y0Var.i.f2332f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (l3.f2383c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            return y0Var.i.f2328a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.a.q0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public z0 getSuperCaller() {
        if (this.f2260k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2260k = new b1(this);
            } else if (i >= 28) {
                this.f2260k = new a1(this);
            } else if (i >= 26) {
                this.f2260k = new a0.a(18, this);
            }
        }
        return this.f2260k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2257g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2257g.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2261l;
        if (future != null) {
            try {
                this.f2261l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                h.a.H(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f2258h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f2255c;
        return textClassifier == null ? s0.a((TextView) c0Var.f2254b) : textClassifier;
    }

    public l0.c getTextMetricsParamsCompat() {
        return h.a.H(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2257g.getClass();
        y0.h(editorInfo, onCreateInputConnection, this);
        h.a.T(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        y0 y0Var = this.f2257g;
        if (y0Var == null || l3.f2383c) {
            return;
        }
        y0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        Future future = this.f2261l;
        if (future != null) {
            try {
                this.f2261l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                h.a.H(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            h1 h1Var = y0Var.i;
            if (l3.f2383c || !h1Var.f()) {
                return;
            }
            h1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i5, int i6) {
        if (l3.f2383c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i5, i6);
            return;
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.i(i, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (l3.f2383c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (l3.f2383c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a.s0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((t0.d) getEmojiTextViewHelper().f2491b.f3355a).g(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().p(i);
        } else {
            h.a.g0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().n(i);
        } else {
            h.a.i0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        h.a.j0(this, i);
    }

    public void setPrecomputedText(l0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        h.a.H(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f1.b bVar = this.f2256f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f2257g;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f2257g;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f2258h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f2255c = textClassifier;
        }
    }

    public void setTextFuture(Future<l0.d> future) {
        this.f2261l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f2538b;
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
        getPaint().set(cVar.f2537a);
        setBreakStrategy(cVar.f2539c);
        setHyphenationFrequency(cVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z3 = l3.f2383c;
        if (z3) {
            super.setTextSize(i, f2);
            return;
        }
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            h1 h1Var = y0Var.i;
            if (z3 || h1Var.f()) {
                return;
            }
            h1Var.g(i, f2);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2259j) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            a.y yVar = f0.g.f1272a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f2259j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2259j = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        this.f2259j = false;
        this.f2260k = null;
        r2.a(this, getContext());
        f1.b bVar = new f1.b(this);
        this.f2256f = bVar;
        bVar.k(attributeSet, i);
        y0 y0Var = new y0(this);
        this.f2257g = y0Var;
        y0Var.f(attributeSet, i);
        y0Var.b();
        c0 c0Var = new c0();
        c0Var.f2254b = this;
        this.f2258h = c0Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().u(i, f2);
        } else if (i4 >= 34) {
            n0.u.h(this, i, f2);
        } else {
            h.a.j0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? h.a.x(context, i) : null, i4 != 0 ? h.a.x(context, i4) : null, i5 != 0 ? h.a.x(context, i5) : null, i6 != 0 ? h.a.x(context, i6) : null);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? h.a.x(context, i) : null, i4 != 0 ? h.a.x(context, i4) : null, i5 != 0 ? h.a.x(context, i5) : null, i6 != 0 ? h.a.x(context, i6) : null);
        y0 y0Var = this.f2257g;
        if (y0Var != null) {
            y0Var.b();
        }
    }
}
