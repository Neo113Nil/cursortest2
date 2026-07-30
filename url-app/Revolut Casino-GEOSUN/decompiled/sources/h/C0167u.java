package h;

import a.AbstractC0069a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import d.AbstractC0110a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import u.AbstractC0240c;
import u.C0239b;

/* renamed from: h.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0167u extends TextView implements A.c {

    /* renamed from: e, reason: collision with root package name */
    public final C0161n f2305e;

    /* renamed from: f, reason: collision with root package name */
    public final C0166t f2306f;

    /* renamed from: g, reason: collision with root package name */
    public final L.Q f2307g;

    /* renamed from: h, reason: collision with root package name */
    public Future f2308h;

    public C0167u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f2308h;
        if (future == null) {
            return;
        }
        try {
            this.f2308h = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0069a.q(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0161n c0161n = this.f2305e;
        if (c0161n != null) {
            c0161n.a();
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (A.c.f11a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            return Math.round(c0166t.f2293i.f2316e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (A.c.f11a) {
            return super.getAutoSizeMinTextSize();
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            return Math.round(c0166t.f2293i.f2315d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (A.c.f11a) {
            return super.getAutoSizeStepGranularity();
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            return Math.round(c0166t.f2293i.f2314c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (A.c.f11a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0166t c0166t = this.f2306f;
        return c0166t != null ? c0166t.f2293i.f2317f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (A.c.f11a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            return c0166t.f2293i.f2312a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0161n c0161n = this.f2305e;
        if (c0161n == null || (j0Var = c0161n.f2243e) == null) {
            return null;
        }
        return j0Var.f2221a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0161n c0161n = this.f2305e;
        if (c0161n == null || (j0Var = c0161n.f2243e) == null) {
            return null;
        }
        return j0Var.f2222b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j0 j0Var = this.f2306f.f2292h;
        if (j0Var != null) {
            return j0Var.f2221a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j0 j0Var = this.f2306f.f2292h;
        if (j0Var != null) {
            return j0Var.f2222b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        L.Q q2;
        if (Build.VERSION.SDK_INT >= 28 || (q2 = this.f2307g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) q2.f516g;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0167u) q2.f515f).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C0239b getTextMetricsParamsCompat() {
        return AbstractC0069a.q(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0166t c0166t = this.f2306f;
        if (c0166t == null || A.c.f11a) {
            return;
        }
        c0166t.f2293i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0166t c0166t = this.f2306f;
        if (c0166t == null || A.c.f11a) {
            return;
        }
        C0168v c0168v = c0166t.f2293i;
        if (c0168v.f2312a != 0) {
            c0168v.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (A.c.f11a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            C0168v c0168v = c0166t.f2293i;
            DisplayMetrics displayMetrics = c0168v.f2321j.getResources().getDisplayMetrics();
            c0168v.i(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0168v.g()) {
                c0168v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (A.c.f11a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            C0168v c0168v = c0166t.f2293i;
            c0168v.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0168v.f2321j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0168v.f2317f = C0168v.b(iArr2);
                if (!c0168v.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0168v.f2318g = false;
            }
            if (c0168v.g()) {
                c0168v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (A.c.f11a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            C0168v c0168v = c0166t.f2293i;
            if (i2 == 0) {
                c0168v.f2312a = 0;
                c0168v.f2315d = -1.0f;
                c0168v.f2316e = -1.0f;
                c0168v.f2314c = -1.0f;
                c0168v.f2317f = new int[0];
                c0168v.f2313b = false;
                return;
            }
            if (i2 != 1) {
                c0168v.getClass();
                throw new IllegalArgumentException(F0.h.e("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c0168v.f2321j.getResources().getDisplayMetrics();
            c0168v.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0168v.g()) {
                c0168v.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0161n c0161n = this.f2305e;
        if (c0161n != null) {
            c0161n.f2241c = -1;
            c0161n.d(null);
            c0161n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0161n c0161n = this.f2305e;
        if (c0161n != null) {
            c0161n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0069a.N(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            AbstractC0069a.D(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            AbstractC0069a.E(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0240c abstractC0240c) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0069a.q(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0161n c0161n = this.f2305e;
        if (c0161n != null) {
            c0161n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0161n c0161n = this.f2305e;
        if (c0161n != null) {
            c0161n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0166t c0166t = this.f2306f;
        if (c0166t.f2292h == null) {
            c0166t.f2292h = new j0();
        }
        j0 j0Var = c0166t.f2292h;
        j0Var.f2221a = colorStateList;
        j0Var.f2224d = colorStateList != null;
        c0166t.f2286b = j0Var;
        c0166t.f2287c = j0Var;
        c0166t.f2288d = j0Var;
        c0166t.f2289e = j0Var;
        c0166t.f2290f = j0Var;
        c0166t.f2291g = j0Var;
        c0166t.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0166t c0166t = this.f2306f;
        if (c0166t.f2292h == null) {
            c0166t.f2292h = new j0();
        }
        j0 j0Var = c0166t.f2292h;
        j0Var.f2222b = mode;
        j0Var.f2223c = mode != null;
        c0166t.f2286b = j0Var;
        c0166t.f2287c = j0Var;
        c0166t.f2288d = j0Var;
        c0166t.f2289e = j0Var;
        c0166t.f2290f = j0Var;
        c0166t.f2291g = j0Var;
        c0166t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        L.Q q2;
        if (Build.VERSION.SDK_INT >= 28 || (q2 = this.f2307g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q2.f516g = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0240c> future) {
        this.f2308h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0239b c0239b) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0239b.f2995b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c0239b.f2994a);
        A.o.e(this, c0239b.f2996c);
        A.o.h(this, c0239b.f2997d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = A.c.f11a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0166t c0166t = this.f2306f;
        if (c0166t == null || z2) {
            return;
        }
        C0168v c0168v = c0166t.f2293i;
        if (c0168v.f2312a != 0) {
            return;
        }
        c0168v.f(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            o.g gVar = p.d.f2812a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i0.a(context);
        C0161n c0161n = new C0161n(this);
        this.f2305e = c0161n;
        c0161n.b(attributeSet, i2);
        C0166t c0166t = new C0166t(this);
        this.f2306f = c0166t;
        c0166t.d(attributeSet, i2);
        c0166t.b();
        L.Q q2 = new L.Q(10, false);
        q2.f515f = this;
        this.f2307g = q2;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0110a.a(context, i2) : null, i3 != 0 ? AbstractC0110a.a(context, i3) : null, i4 != 0 ? AbstractC0110a.a(context, i4) : null, i5 != 0 ? AbstractC0110a.a(context, i5) : null);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0110a.a(context, i2) : null, i3 != 0 ? AbstractC0110a.a(context, i3) : null, i4 != 0 ? AbstractC0110a.a(context, i4) : null, i5 != 0 ? AbstractC0110a.a(context, i5) : null);
        C0166t c0166t = this.f2306f;
        if (c0166t != null) {
            c0166t.b();
        }
    }
}
