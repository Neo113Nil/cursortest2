package k;

import E.AbstractC0005f;
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
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import d2.C0389g;
import g.AbstractC0432a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import x.AbstractC1516e;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1233t extends TextView implements H.b {

    /* renamed from: a, reason: collision with root package name */
    public final K3.n f14103a;

    /* renamed from: b, reason: collision with root package name */
    public final C1232s f14104b;

    /* renamed from: c, reason: collision with root package name */
    public final C0389g f14105c;

    /* renamed from: d, reason: collision with root package name */
    public Future f14106d;

    public C1233t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        K3.n nVar = this.f14103a;
        if (nVar != null) {
            nVar.b();
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (H.b.f1058u0) {
            return super.getAutoSizeMaxTextSize();
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            return Math.round(c1232s.f14098i.f14114e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (H.b.f1058u0) {
            return super.getAutoSizeMinTextSize();
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            return Math.round(c1232s.f14098i.f14113d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (H.b.f1058u0) {
            return super.getAutoSizeStepGranularity();
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            return Math.round(c1232s.f14098i.f14112c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (H.b.f1058u0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1232s c1232s = this.f14104b;
        return c1232s != null ? c1232s.f14098i.f14115f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (H.b.f1058u0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            return c1232s.f14098i.f14110a;
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
        G3.h hVar;
        K3.n nVar = this.f14103a;
        if (nVar == null || (hVar = (G3.h) nVar.f1595a) == null) {
            return null;
        }
        return (ColorStateList) hVar.f909c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G3.h hVar;
        K3.n nVar = this.f14103a;
        if (nVar == null || (hVar = (G3.h) nVar.f1595a) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f910d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        G3.h hVar = this.f14104b.f14097h;
        if (hVar != null) {
            return (ColorStateList) hVar.f909c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        G3.h hVar = this.f14104b.f14097h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f910d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f14106d;
        if (future != null) {
            try {
                this.f14106d = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0347t0.l(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0389g c0389g;
        if (Build.VERSION.SDK_INT >= 28 || (c0389g = this.f14105c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0389g.f8265c;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C1233t) c0389g.f8264b).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C.c getTextMetricsParamsCompat() {
        return AbstractC0347t0.l(this);
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
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        super.onLayout(z, i4, i5, i6, i7);
        C1232s c1232s = this.f14104b;
        if (c1232s == null || H.b.f1058u0) {
            return;
        }
        c1232s.f14098i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        Future future = this.f14106d;
        if (future != null) {
            try {
                this.f14106d = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0347t0.l(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C1232s c1232s = this.f14104b;
        if (c1232s == null || H.b.f1058u0) {
            return;
        }
        C1234u c1234u = c1232s.f14098i;
        if (c1234u.f14110a != 0) {
            c1234u.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (H.b.f1058u0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            C1234u c1234u = c1232s.f14098i;
            DisplayMetrics displayMetrics = c1234u.f14119j.getResources().getDisplayMetrics();
            c1234u.i(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (c1234u.g()) {
                c1234u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (H.b.f1058u0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            C1234u c1234u = c1232s.f14098i;
            c1234u.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1234u.f14119j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                c1234u.f14115f = C1234u.b(iArr2);
                if (!c1234u.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1234u.f14116g = false;
            }
            if (c1234u.g()) {
                c1234u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (H.b.f1058u0) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            C1234u c1234u = c1232s.f14098i;
            if (i4 == 0) {
                c1234u.f14110a = 0;
                c1234u.f14113d = -1.0f;
                c1234u.f14114e = -1.0f;
                c1234u.f14112c = -1.0f;
                c1234u.f14115f = new int[0];
                c1234u.f14111b = false;
                return;
            }
            if (i4 != 1) {
                c1234u.getClass();
                throw new IllegalArgumentException(AbstractC0005f.j(i4, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1234u.f14119j.getResources().getDisplayMetrics();
            c1234u.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1234u.g()) {
                c1234u.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        K3.n nVar = this.f14103a;
        if (nVar != null) {
            nVar.f1596b = -1;
            nVar.h(null);
            nVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        K3.n nVar = this.f14103a;
        if (nVar != null) {
            nVar.f(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0347t0.u(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            AbstractC0347t0.r(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            AbstractC0347t0.s(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i4 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(C.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0347t0.l(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        K3.n nVar = this.f14103a;
        if (nVar != null) {
            nVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        K3.n nVar = this.f14103a;
        if (nVar != null) {
            nVar.k(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1232s c1232s = this.f14104b;
        if (c1232s.f14097h == null) {
            c1232s.f14097h = new G3.h();
        }
        G3.h hVar = c1232s.f14097h;
        hVar.f909c = colorStateList;
        hVar.f908b = colorStateList != null;
        c1232s.f14091b = hVar;
        c1232s.f14092c = hVar;
        c1232s.f14093d = hVar;
        c1232s.f14094e = hVar;
        c1232s.f14095f = hVar;
        c1232s.f14096g = hVar;
        c1232s.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1232s c1232s = this.f14104b;
        if (c1232s.f14097h == null) {
            c1232s.f14097h = new G3.h();
        }
        G3.h hVar = c1232s.f14097h;
        hVar.f910d = mode;
        hVar.f907a = mode != null;
        c1232s.f14091b = hVar;
        c1232s.f14092c = hVar;
        c1232s.f14093d = hVar;
        c1232s.f14094e = hVar;
        c1232s.f14095f = hVar;
        c1232s.f14096g = hVar;
        c1232s.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.e(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0389g c0389g;
        if (Build.VERSION.SDK_INT >= 28 || (c0389g = this.f14105c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0389g.f8265c = textClassifier;
        }
    }

    public void setTextFuture(Future<C.d> future) {
        this.f14106d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f256b;
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
        getPaint().set(cVar.f255a);
        setBreakStrategy(cVar.f257c);
        setHyphenationFrequency(cVar.f258d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        boolean z = H.b.f1058u0;
        if (z) {
            super.setTextSize(i4, f4);
            return;
        }
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            C1234u c1234u = c1232s.f14098i;
            if (z || c1234u.f14110a != 0) {
                return;
            }
            c1234u.f(f4, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (typeface == null || i4 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            O3.l lVar = AbstractC1516e.f15959a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i4);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233t(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        AbstractC1215g0.a(context);
        K3.n nVar = new K3.n(this);
        this.f14103a = nVar;
        nVar.e(attributeSet, i4);
        C1232s c1232s = new C1232s(this);
        this.f14104b = c1232s;
        c1232s.d(attributeSet, i4);
        c1232s.b();
        C0389g c0389g = new C0389g(7, false);
        c0389g.f8264b = this;
        this.f14105c = c0389g;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? AbstractC0432a.a(context, i4) : null, i5 != 0 ? AbstractC0432a.a(context, i5) : null, i6 != 0 ? AbstractC0432a.a(context, i6) : null, i7 != 0 ? AbstractC0432a.a(context, i7) : null);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? AbstractC0432a.a(context, i4) : null, i5 != 0 ? AbstractC0432a.a(context, i5) : null, i6 != 0 ? AbstractC0432a.a(context, i6) : null, i7 != 0 ? AbstractC0432a.a(context, i7) : null);
        C1232s c1232s = this.f14104b;
        if (c1232s != null) {
            c1232s.b();
        }
    }
}
