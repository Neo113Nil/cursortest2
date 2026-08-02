package j;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
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
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import y.C0333a;

/* renamed from: j.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245v extends TextView implements F.r, F.c {

    /* renamed from: e, reason: collision with root package name */
    public final C0238n f3077e;

    /* renamed from: f, reason: collision with root package name */
    public final C0244u f3078f;

    /* renamed from: g, reason: collision with root package name */
    public final P.O f3079g;

    /* renamed from: h, reason: collision with root package name */
    public Future f3080h;

    public C0245v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f3080h;
        if (future == null) {
            return;
        }
        try {
            this.f3080h = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            i1.a.r(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0238n c0238n = this.f3077e;
        if (c0238n != null) {
            c0238n.a();
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (F.c.f434b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            return Math.round(c0244u.f3061i.f3095e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (F.c.f434b) {
            return super.getAutoSizeMinTextSize();
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            return Math.round(c0244u.f3061i.f3094d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (F.c.f434b) {
            return super.getAutoSizeStepGranularity();
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            return Math.round(c0244u.f3061i.f3093c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (F.c.f434b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0244u c0244u = this.f3078f;
        return c0244u != null ? c0244u.f3061i.f3096f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (F.c.f434b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            return c0244u.f3061i.f3091a;
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
        l0 l0Var;
        C0238n c0238n = this.f3077e;
        if (c0238n == null || (l0Var = c0238n.f3011e) == null) {
            return null;
        }
        return l0Var.f3000a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0238n c0238n = this.f3077e;
        if (c0238n == null || (l0Var = c0238n.f3011e) == null) {
            return null;
        }
        return l0Var.f3001b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        l0 l0Var = this.f3078f.f3060h;
        if (l0Var != null) {
            return l0Var.f3000a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        l0 l0Var = this.f3078f.f3060h;
        if (l0Var != null) {
            return l0Var.f3001b;
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
        P.O o2;
        if (Build.VERSION.SDK_INT >= 28 || (o2 = this.f3079g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) o2.f876g;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0245v) o2.f875f).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C0333a getTextMetricsParamsCompat() {
        return i1.a.r(this);
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
        C0244u c0244u = this.f3078f;
        if (c0244u == null || F.c.f434b) {
            return;
        }
        c0244u.f3061i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0244u c0244u = this.f3078f;
        if (c0244u == null || F.c.f434b) {
            return;
        }
        C0247x c0247x = c0244u.f3061i;
        if (c0247x.f3091a != 0) {
            c0247x.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (F.c.f434b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            C0247x c0247x = c0244u.f3061i;
            DisplayMetrics displayMetrics = c0247x.f3100j.getResources().getDisplayMetrics();
            c0247x.i(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0247x.g()) {
                c0247x.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (F.c.f434b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            C0247x c0247x = c0244u.f3061i;
            c0247x.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0247x.f3100j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0247x.f3096f = C0247x.b(iArr2);
                if (!c0247x.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0247x.f3097g = false;
            }
            if (c0247x.g()) {
                c0247x.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (F.c.f434b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            C0247x c0247x = c0244u.f3061i;
            if (i2 == 0) {
                c0247x.f3091a = 0;
                c0247x.f3094d = -1.0f;
                c0247x.f3095e = -1.0f;
                c0247x.f3093c = -1.0f;
                c0247x.f3096f = new int[0];
                c0247x.f3092b = false;
                return;
            }
            if (i2 != 1) {
                c0247x.getClass();
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = c0247x.f3100j.getResources().getDisplayMetrics();
            c0247x.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0247x.g()) {
                c0247x.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0238n c0238n = this.f3077e;
        if (c0238n != null) {
            c0238n.f3009c = -1;
            c0238n.d(null);
            c0238n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0238n c0238n = this.f3077e;
        if (c0238n != null) {
            c0238n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i1.a.J(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            i1.a.x(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            i1.a.y(this, i2);
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

    public void setPrecomputedText(y.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i1.a.r(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0238n c0238n = this.f3077e;
        if (c0238n != null) {
            c0238n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0238n c0238n = this.f3077e;
        if (c0238n != null) {
            c0238n.f(mode);
        }
    }

    @Override // F.r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0244u c0244u = this.f3078f;
        if (c0244u.f3060h == null) {
            c0244u.f3060h = new l0();
        }
        l0 l0Var = c0244u.f3060h;
        l0Var.f3000a = colorStateList;
        l0Var.f3003d = colorStateList != null;
        c0244u.f3054b = l0Var;
        c0244u.f3055c = l0Var;
        c0244u.f3056d = l0Var;
        c0244u.f3057e = l0Var;
        c0244u.f3058f = l0Var;
        c0244u.f3059g = l0Var;
        c0244u.b();
    }

    @Override // F.r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0244u c0244u = this.f3078f;
        if (c0244u.f3060h == null) {
            c0244u.f3060h = new l0();
        }
        l0 l0Var = c0244u.f3060h;
        l0Var.f3001b = mode;
        l0Var.f3002c = mode != null;
        c0244u.f3054b = l0Var;
        c0244u.f3055c = l0Var;
        c0244u.f3056d = l0Var;
        c0244u.f3057e = l0Var;
        c0244u.f3058f = l0Var;
        c0244u.f3059g = l0Var;
        c0244u.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        P.O o2;
        if (Build.VERSION.SDK_INT >= 28 || (o2 = this.f3079g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o2.f876g = textClassifier;
        }
    }

    public void setTextFuture(Future<y.b> future) {
        this.f3080h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0333a c0333a) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0333a.f3592b;
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
        int i3 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c0333a.f3591a;
        if (i3 >= 23) {
            getPaint().set(textPaint);
            F.n.e(this, c0333a.f3593c);
            F.n.h(this, c0333a.f3594d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = F.c.f434b;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0244u c0244u = this.f3078f;
        if (c0244u == null || z2) {
            return;
        }
        C0247x c0247x = c0244u.f3061i;
        if (c0247x.f3091a != 0) {
            return;
        }
        c0247x.f(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            i1.a aVar = t.e.f3443a;
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
    public C0245v(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        k0.a(context);
        C0238n c0238n = new C0238n(this);
        this.f3077e = c0238n;
        c0238n.b(attributeSet, i2);
        C0244u c0244u = new C0244u(this);
        this.f3078f = c0244u;
        c0244u.d(attributeSet, i2);
        c0244u.b();
        P.O o2 = new P.O(9, false);
        o2.f875f = this;
        this.f3079g = o2;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? d.b.c(context, i2) : null, i3 != 0 ? d.b.c(context, i3) : null, i4 != 0 ? d.b.c(context, i4) : null, i5 != 0 ? d.b.c(context, i5) : null);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? d.b.c(context, i2) : null, i3 != 0 ? d.b.c(context, i3) : null, i4 != 0 ? d.b.c(context, i4) : null, i5 != 0 ? d.b.c(context, i5) : null);
        C0244u c0244u = this.f3078f;
        if (c0244u != null) {
            c0244u.b();
        }
    }
}
