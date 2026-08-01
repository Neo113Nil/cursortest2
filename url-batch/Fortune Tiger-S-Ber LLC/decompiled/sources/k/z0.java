package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class z0 extends TextView {

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f2693f;
    public final v0 g;
    public final a0 h;

    /* renamed from: i, reason: collision with root package name */
    public v f2694i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2695j;

    /* renamed from: k, reason: collision with root package name */
    public a2.e f2696k;

    /* renamed from: l, reason: collision with root package name */
    public Future f2697l;

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private v getEmojiTextViewHelper() {
        if (this.f2694i == null) {
            this.f2694i = new v(this);
        }
        return this.f2694i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            bVar.a();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (e3.c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return Math.round(v0Var.f2676i.f2533e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (e3.c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return Math.round(v0Var.f2676i.f2532d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (e3.c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return Math.round(v0Var.f2676i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (e3.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.g;
        return v0Var != null ? v0Var.f2676i.f2534f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (e3.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return v0Var.f2676i.f2530a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o0.h ? ((o0.h) customSelectionActionModeCallback).f2981a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public w0 getSuperCaller() {
        if (this.f2696k == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                this.f2696k = new y0(this);
            } else if (i4 >= 28) {
                this.f2696k = new x0(this);
            } else {
                this.f2696k = new a2.e(21, this);
            }
        }
        return this.f2696k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            return bVar.i();
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
        Future future = this.f2697l;
        if (future != null) {
            try {
                this.f2697l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                l0.g.k(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.c;
        return textClassifier == null ? p0.a((TextView) a0Var.f2499b) : textClassifier;
    }

    public i0.c getTextMetricsParamsCompat() {
        return l0.g.k(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        v0.h(editorInfo, onCreateInputConnection, this);
        k3.m.I(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        v0 v0Var = this.g;
        if (v0Var == null || e3.c) {
            return;
        }
        v0Var.f2676i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        Future future = this.f2697l;
        if (future != null) {
            try {
                this.f2697l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                l0.g.k(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        v0 v0Var = this.g;
        if (v0Var != null) {
            e1 e1Var = v0Var.f2676i;
            if (e3.c || !e1Var.f()) {
                return;
            }
            e1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (e3.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.i(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (e3.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.j(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (e3.c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l0.g.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((m0.a) getEmojiTextViewHelper().f2670b.f3139f).k(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i4);
        } else {
            l0.g.u(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i4);
        } else {
            l0.g.v(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        l0.g.w(this, i4);
    }

    public void setPrecomputedText(i0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        l0.g.k(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.f2693f;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.c = textClassifier;
        }
    }

    public void setTextFuture(Future<i0.d> future) {
        this.f2697l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(i0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f2089b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(cVar.f2088a);
        setBreakStrategy(cVar.c);
        setHyphenationFrequency(cVar.f2090d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        boolean z3 = e3.c;
        if (z3) {
            super.setTextSize(i4, f4);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            e1 e1Var = v0Var.f2676i;
            if (z3 || e1Var.f()) {
                return;
            }
            e1Var.g(i4, f4);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (this.f2695j) {
            return;
        }
        if (typeface == null || i4 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            k3.d dVar = c0.f.f984a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i4);
        }
        this.f2695j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f2695j = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        p2.a(context);
        this.f2695j = false;
        this.f2696k = null;
        o2.a(this, getContext());
        b1.b bVar = new b1.b(this);
        this.f2693f = bVar;
        bVar.l(attributeSet, i4);
        v0 v0Var = new v0(this);
        this.g = v0Var;
        v0Var.f(attributeSet, i4);
        v0Var.b();
        a0 a0Var = new a0();
        a0Var.f2499b = this;
        this.h = a0Var;
        getEmojiTextViewHelper().a(attributeSet, i4);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i4, float f4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            getSuperCaller().r(i4, f4);
        } else if (i5 >= 34) {
            androidx.activity.a.i(this, i4, f4);
        } else {
            l0.g.w(this, Math.round(TypedValue.applyDimension(i4, f4, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? k3.m.w(context, i4) : null, i5 != 0 ? k3.m.w(context, i5) : null, i6 != 0 ? k3.m.w(context, i6) : null, i7 != 0 ? k3.m.w(context, i7) : null);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? k3.m.w(context, i4) : null, i5 != 0 ? k3.m.w(context, i5) : null, i6 != 0 ? k3.m.w(context, i6) : null, i7 != 0 ? k3.m.w(context, i7) : null);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }
}
