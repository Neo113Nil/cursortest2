package l;

import E1.AbstractC0033i;
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
import f0.C0322a;
import h.AbstractC0337a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1098u extends TextView implements H.b {

    /* renamed from: a, reason: collision with root package name */
    public final C1092n f9915a;

    /* renamed from: b, reason: collision with root package name */
    public final C1097t f9916b;

    /* renamed from: c, reason: collision with root package name */
    public final C0322a f9917c;

    /* renamed from: d, reason: collision with root package name */
    public Future f9918d;

    public C1098u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f9918d;
        if (future == null) {
            return;
        }
        try {
            this.f9918d = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            android.support.v4.media.session.a.z(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1092n c1092n = this.f9915a;
        if (c1092n != null) {
            c1092n.a();
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (H.b.f573t0) {
            return super.getAutoSizeMaxTextSize();
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            return Math.round(c1097t.f9904i.f9926e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (H.b.f573t0) {
            return super.getAutoSizeMinTextSize();
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            return Math.round(c1097t.f9904i.f9925d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (H.b.f573t0) {
            return super.getAutoSizeStepGranularity();
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            return Math.round(c1097t.f9904i.f9924c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (H.b.f573t0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1097t c1097t = this.f9916b;
        return c1097t != null ? c1097t.f9904i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (H.b.f573t0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            return c1097t.f9904i.f9922a;
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
        C1092n c1092n = this.f9915a;
        if (c1092n == null || (j0Var = c1092n.f9858e) == null) {
            return null;
        }
        return j0Var.f9837a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C1092n c1092n = this.f9915a;
        if (c1092n == null || (j0Var = c1092n.f9858e) == null) {
            return null;
        }
        return j0Var.f9838b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j0 j0Var = this.f9916b.f9903h;
        if (j0Var != null) {
            return j0Var.f9837a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j0 j0Var = this.f9916b.f9903h;
        if (j0Var != null) {
            return j0Var.f9838b;
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
        C0322a c0322a;
        if (Build.VERSION.SDK_INT >= 28 || (c0322a = this.f9917c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0322a.f4978c;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C1098u) c0322a.f4977b).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C.c getTextMetricsParamsCompat() {
        return android.support.v4.media.session.a.z(this);
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
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        super.onLayout(z, i3, i4, i5, i6);
        C1097t c1097t = this.f9916b;
        if (c1097t == null || H.b.f573t0) {
            return;
        }
        c1097t.f9904i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        d();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C1097t c1097t = this.f9916b;
        if (c1097t == null || H.b.f573t0) {
            return;
        }
        C1099v c1099v = c1097t.f9904i;
        if (c1099v.f9922a != 0) {
            c1099v.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (H.b.f573t0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            C1099v c1099v = c1097t.f9904i;
            DisplayMetrics displayMetrics = c1099v.f9930j.getResources().getDisplayMetrics();
            c1099v.i(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (c1099v.g()) {
                c1099v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (H.b.f573t0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            C1099v c1099v = c1097t.f9904i;
            c1099v.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1099v.f9930j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                c1099v.f = C1099v.b(iArr2);
                if (!c1099v.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1099v.f9927g = false;
            }
            if (c1099v.g()) {
                c1099v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (H.b.f573t0) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            C1099v c1099v = c1097t.f9904i;
            if (i3 == 0) {
                c1099v.f9922a = 0;
                c1099v.f9925d = -1.0f;
                c1099v.f9926e = -1.0f;
                c1099v.f9924c = -1.0f;
                c1099v.f = new int[0];
                c1099v.f9923b = false;
                return;
            }
            if (i3 != 1) {
                c1099v.getClass();
                throw new IllegalArgumentException(AbstractC0033i.h(i3, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1099v.f9930j.getResources().getDisplayMetrics();
            c1099v.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1099v.g()) {
                c1099v.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1092n c1092n = this.f9915a;
        if (c1092n != null) {
            c1092n.f9856c = -1;
            c1092n.d(null);
            c1092n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1092n c1092n = this.f9915a;
        if (c1092n != null) {
            c1092n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.W(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i3);
        } else {
            android.support.v4.media.session.a.M(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i3);
        } else {
            android.support.v4.media.session.a.N(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i3 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(C.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        android.support.v4.media.session.a.z(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1092n c1092n = this.f9915a;
        if (c1092n != null) {
            c1092n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1092n c1092n = this.f9915a;
        if (c1092n != null) {
            c1092n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1097t c1097t = this.f9916b;
        if (c1097t.f9903h == null) {
            c1097t.f9903h = new j0();
        }
        j0 j0Var = c1097t.f9903h;
        j0Var.f9837a = colorStateList;
        j0Var.f9840d = colorStateList != null;
        c1097t.f9898b = j0Var;
        c1097t.f9899c = j0Var;
        c1097t.f9900d = j0Var;
        c1097t.f9901e = j0Var;
        c1097t.f = j0Var;
        c1097t.f9902g = j0Var;
        c1097t.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1097t c1097t = this.f9916b;
        if (c1097t.f9903h == null) {
            c1097t.f9903h = new j0();
        }
        j0 j0Var = c1097t.f9903h;
        j0Var.f9838b = mode;
        j0Var.f9839c = mode != null;
        c1097t.f9898b = j0Var;
        c1097t.f9899c = j0Var;
        c1097t.f9900d = j0Var;
        c1097t.f9901e = j0Var;
        c1097t.f = j0Var;
        c1097t.f9902g = j0Var;
        c1097t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0322a c0322a;
        if (Build.VERSION.SDK_INT >= 28 || (c0322a = this.f9917c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0322a.f4978c = textClassifier;
        }
    }

    public void setTextFuture(Future<C.d> future) {
        this.f9918d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f189b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(cVar.f188a);
        setBreakStrategy(cVar.f190c);
        setHyphenationFrequency(cVar.f191d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f) {
        boolean z = H.b.f573t0;
        if (z) {
            super.setTextSize(i3, f);
            return;
        }
        C1097t c1097t = this.f9916b;
        if (c1097t == null || z) {
            return;
        }
        C1099v c1099v = c1097t.f9904i;
        if (c1099v.f9922a != 0) {
            return;
        }
        c1099v.f(i3, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            android.support.v4.media.session.a aVar = x.c.f10698a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i3);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098u(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        i0.a(context);
        C1092n c1092n = new C1092n(this);
        this.f9915a = c1092n;
        c1092n.b(attributeSet, i3);
        C1097t c1097t = new C1097t(this);
        this.f9916b = c1097t;
        c1097t.d(attributeSet, i3);
        c1097t.b();
        C0322a c0322a = new C0322a(5);
        c0322a.f4977b = this;
        this.f9917c = c0322a;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC0337a.a(context, i3) : null, i4 != 0 ? AbstractC0337a.a(context, i4) : null, i5 != 0 ? AbstractC0337a.a(context, i5) : null, i6 != 0 ? AbstractC0337a.a(context, i6) : null);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC0337a.a(context, i3) : null, i4 != 0 ? AbstractC0337a.a(context, i4) : null, i5 != 0 ? AbstractC0337a.a(context, i5) : null, i6 != 0 ? AbstractC0337a.a(context, i6) : null);
        C1097t c1097t = this.f9916b;
        if (c1097t != null) {
            c1097t.b();
        }
    }
}
