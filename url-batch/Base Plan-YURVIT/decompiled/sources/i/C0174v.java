package i;

import a.AbstractC0086a;
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
import e.AbstractC0121a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import w.AbstractC0246b;
import w.C0245a;

/* renamed from: i.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0174v extends TextView implements C.c {

    /* renamed from: e, reason: collision with root package name */
    public final C0167n f2334e;

    /* renamed from: f, reason: collision with root package name */
    public final C0173u f2335f;

    /* renamed from: g, reason: collision with root package name */
    public final N.P f2336g;

    /* renamed from: h, reason: collision with root package name */
    public Future f2337h;

    public C0174v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0167n c0167n = this.f2334e;
        if (c0167n != null) {
            c0167n.a();
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C.c.f159b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            return Math.round(c0173u.f2328i.f2344e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C.c.f159b) {
            return super.getAutoSizeMinTextSize();
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            return Math.round(c0173u.f2328i.f2343d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C.c.f159b) {
            return super.getAutoSizeStepGranularity();
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            return Math.round(c0173u.f2328i.f2342c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C.c.f159b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0173u c0173u = this.f2335f;
        return c0173u != null ? c0173u.f2328i.f2345f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C.c.f159b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            return c0173u.f2328i.f2340a;
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
        C0167n c0167n = this.f2334e;
        if (c0167n == null || (j0Var = c0167n.f2271e) == null) {
            return null;
        }
        return j0Var.f2249a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0167n c0167n = this.f2334e;
        if (c0167n == null || (j0Var = c0167n.f2271e) == null) {
            return null;
        }
        return j0Var.f2250b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j0 j0Var = this.f2335f.f2327h;
        if (j0Var != null) {
            return j0Var.f2249a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j0 j0Var = this.f2335f.f2327h;
        if (j0Var != null) {
            return j0Var.f2250b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2337h;
        if (future != null) {
            try {
                this.f2337h = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0086a.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        N.P p2;
        if (Build.VERSION.SDK_INT >= 28 || (p2 = this.f2336g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) p2.f699g;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0174v) p2.f698f).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C0245a getTextMetricsParamsCompat() {
        return AbstractC0086a.t(this);
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
        C0173u c0173u = this.f2335f;
        if (c0173u == null || C.c.f159b) {
            return;
        }
        c0173u.f2328i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future future = this.f2337h;
        if (future != null) {
            try {
                this.f2337h = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0086a.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0173u c0173u = this.f2335f;
        if (c0173u == null || C.c.f159b) {
            return;
        }
        C0175w c0175w = c0173u.f2328i;
        if (c0175w.f2340a != 0) {
            c0175w.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (C.c.f159b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            C0175w c0175w = c0173u.f2328i;
            DisplayMetrics displayMetrics = c0175w.f2349j.getResources().getDisplayMetrics();
            c0175w.i(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0175w.g()) {
                c0175w.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (C.c.f159b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            C0175w c0175w = c0173u.f2328i;
            c0175w.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0175w.f2349j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0175w.f2345f = C0175w.b(iArr2);
                if (!c0175w.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0175w.f2346g = false;
            }
            if (c0175w.g()) {
                c0175w.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (C.c.f159b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            C0175w c0175w = c0173u.f2328i;
            if (i2 == 0) {
                c0175w.f2340a = 0;
                c0175w.f2343d = -1.0f;
                c0175w.f2344e = -1.0f;
                c0175w.f2342c = -1.0f;
                c0175w.f2345f = new int[0];
                c0175w.f2341b = false;
                return;
            }
            if (i2 != 1) {
                c0175w.getClass();
                throw new IllegalArgumentException(L.d.e("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c0175w.f2349j.getResources().getDisplayMetrics();
            c0175w.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0175w.g()) {
                c0175w.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0167n c0167n = this.f2334e;
        if (c0167n != null) {
            c0167n.f2269c = -1;
            c0167n.d(null);
            c0167n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0167n c0167n = this.f2334e;
        if (c0167n != null) {
            c0167n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0086a.K(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            AbstractC0086a.E(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            AbstractC0086a.F(this, i2);
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

    public void setPrecomputedText(AbstractC0246b abstractC0246b) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0086a.t(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0167n c0167n = this.f2334e;
        if (c0167n != null) {
            c0167n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0167n c0167n = this.f2334e;
        if (c0167n != null) {
            c0167n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0173u c0173u = this.f2335f;
        if (c0173u.f2327h == null) {
            c0173u.f2327h = new j0();
        }
        j0 j0Var = c0173u.f2327h;
        j0Var.f2249a = colorStateList;
        j0Var.f2252d = colorStateList != null;
        c0173u.f2321b = j0Var;
        c0173u.f2322c = j0Var;
        c0173u.f2323d = j0Var;
        c0173u.f2324e = j0Var;
        c0173u.f2325f = j0Var;
        c0173u.f2326g = j0Var;
        c0173u.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0173u c0173u = this.f2335f;
        if (c0173u.f2327h == null) {
            c0173u.f2327h = new j0();
        }
        j0 j0Var = c0173u.f2327h;
        j0Var.f2250b = mode;
        j0Var.f2251c = mode != null;
        c0173u.f2321b = j0Var;
        c0173u.f2322c = j0Var;
        c0173u.f2323d = j0Var;
        c0173u.f2324e = j0Var;
        c0173u.f2325f = j0Var;
        c0173u.f2326g = j0Var;
        c0173u.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        N.P p2;
        if (Build.VERSION.SDK_INT >= 28 || (p2 = this.f2336g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            p2.f699g = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0246b> future) {
        this.f2337h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0245a c0245a) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0245a.f3096b;
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
        getPaint().set(c0245a.f3095a);
        C.n.e(this, c0245a.f3097c);
        C.n.h(this, c0245a.f3098d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = C.c.f159b;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            C0175w c0175w = c0173u.f2328i;
            if (z2 || c0175w.f2340a != 0) {
                return;
            }
            c0175w.f(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            androidx.datastore.preferences.protobuf.k0 k0Var = r.d.f2965a;
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
    public C0174v(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i0.a(context);
        C0167n c0167n = new C0167n(this);
        this.f2334e = c0167n;
        c0167n.b(attributeSet, i2);
        C0173u c0173u = new C0173u(this);
        this.f2335f = c0173u;
        c0173u.d(attributeSet, i2);
        c0173u.b();
        N.P p2 = new N.P(9, false);
        p2.f698f = this;
        this.f2336g = p2;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0121a.a(context, i2) : null, i3 != 0 ? AbstractC0121a.a(context, i3) : null, i4 != 0 ? AbstractC0121a.a(context, i4) : null, i5 != 0 ? AbstractC0121a.a(context, i5) : null);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0121a.a(context, i2) : null, i3 != 0 ? AbstractC0121a.a(context, i3) : null, i4 != 0 ? AbstractC0121a.a(context, i4) : null, i5 != 0 ? AbstractC0121a.a(context, i5) : null);
        C0173u c0173u = this.f2335f;
        if (c0173u != null) {
            c0173u.b();
        }
    }
}
