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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class z0 extends TextView {

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2611f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f2612g;
    public final z h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2613j;

    /* renamed from: k, reason: collision with root package name */
    public a0.a f2614k;

    /* renamed from: l, reason: collision with root package name */
    public Future f2615l;

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new u(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            cVar.a();
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f3.f2450c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            return Math.round(v0Var.i.f2437e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f3.f2450c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            return Math.round(v0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f3.f2450c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            return Math.round(v0Var.i.f2436c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f3.f2450c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.f2612g;
        return v0Var != null ? v0Var.i.f2438f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f3.f2450c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            return v0Var.i.f2434a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof r0.g ? ((r0.g) customSelectionActionModeCallback).f3200a : customSelectionActionModeCallback;
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
        if (this.f2614k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2614k = new y0(this);
            } else if (i >= 28) {
                this.f2614k = new x0(this);
            } else {
                this.f2614k = new a0.a(22, this);
            }
        }
        return this.f2614k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2612g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2612g.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2615l;
        if (future != null) {
            try {
                this.f2615l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                b4.l.H(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) zVar.f2610c;
        return textClassifier == null ? p0.a((TextView) zVar.f2609b) : textClassifier;
    }

    public l0.c getTextMetricsParamsCompat() {
        return b4.l.H(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2612g.getClass();
        v0.h(editorInfo, onCreateInputConnection, this);
        b4.l.S(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        v0 v0Var = this.f2612g;
        if (v0Var == null || f3.f2450c) {
            return;
        }
        v0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        Future future = this.f2615l;
        if (future != null) {
            try {
                this.f2615l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                b4.l.H(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            e1 e1Var = v0Var.i;
            if (f3.f2450c || !e1Var.f()) {
                return;
            }
            e1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i5, int i6) {
        if (f3.f2450c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i5, i6);
            return;
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.i(i, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f3.f2450c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3.f2450c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            cVar.p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b4.l.k0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((r1.b) getEmojiTextViewHelper().f2571b.f3172a).l(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().v(i);
        } else {
            b4.l.b0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i);
        } else {
            b4.l.c0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        b4.l.d0(this, i);
    }

    public void setPrecomputedText(l0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        b4.l.H(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2611f;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f2612g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f2612g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f2610c = textClassifier;
        }
    }

    public void setTextFuture(Future<l0.d> future) {
        this.f2615l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f2628b;
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
        getPaint().set(cVar.f2627a);
        setBreakStrategy(cVar.f2629c);
        setHyphenationFrequency(cVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f5) {
        boolean z4 = f3.f2450c;
        if (z4) {
            super.setTextSize(i, f5);
            return;
        }
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            e1 e1Var = v0Var.i;
            if (z4 || e1Var.f()) {
                return;
            }
            e1Var.g(i, f5);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2613j) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            b4.d dVar = f0.f.f1420a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f2613j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2613j = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p2.a(context);
        this.f2613j = false;
        this.f2614k = null;
        o2.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f2611f = cVar;
        cVar.m(attributeSet, i);
        v0 v0Var = new v0(this);
        this.f2612g = v0Var;
        v0Var.f(attributeSet, i);
        v0Var.b();
        z zVar = new z();
        zVar.f2609b = this;
        this.h = zVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f5) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().y(i, f5);
        } else if (i4 >= 34) {
            n0.y.h(this, i, f5);
        } else {
            b4.l.d0(this, Math.round(TypedValue.applyDimension(i, f5, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? b4.d.y(context, i) : null, i4 != 0 ? b4.d.y(context, i4) : null, i5 != 0 ? b4.d.y(context, i5) : null, i6 != 0 ? b4.d.y(context, i6) : null);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? b4.d.y(context, i) : null, i4 != 0 ? b4.d.y(context, i4) : null, i5 != 0 ? b4.d.y(context, i5) : null, i6 != 0 ? b4.d.y(context, i6) : null);
        v0 v0Var = this.f2612g;
        if (v0Var != null) {
            v0Var.b();
        }
    }
}
