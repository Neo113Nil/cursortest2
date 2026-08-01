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

/* renamed from: l.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0229d0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0254q f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f2968b;

    /* renamed from: c, reason: collision with root package name */
    public final C0207D f2969c;
    public C0270y d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2970e;

    /* renamed from: f, reason: collision with root package name */
    public C0242k f2971f;

    /* renamed from: g, reason: collision with root package name */
    public Future f2972g;

    public C0229d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0270y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0270y(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            c0254q.a();
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void g() {
        Future future = this.f2972g;
        if (future == null) {
            return;
        }
        try {
            this.f2972g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            q1.l.z(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f3003c) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            return Math.round(z2.i.f2996e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f3003c) {
            return super.getAutoSizeMinTextSize();
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            return Math.round(z2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f3003c) {
            return super.getAutoSizeStepGranularity();
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            return Math.round(z2.i.f2995c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f3003c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z2 = this.f2968b;
        return z2 != null ? z2.i.f2997f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (i1.f3003c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            return z2.i.f2993a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f651a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0223a0 getSuperCaller() {
        if (this.f2971f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2971f = new C0227c0(this);
            } else if (i >= 28) {
                this.f2971f = new C0225b0(this);
            } else {
                this.f2971f = new C0242k(this);
            }
        }
        return this.f2971f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2968b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2968b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0207D c0207d;
        if (Build.VERSION.SDK_INT >= 28 || (c0207d = this.f2969c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0207d.f2850c;
        return textClassifier == null ? T.a((TextView) c0207d.f2849b) : textClassifier;
    }

    public I.d getTextMetricsParamsCompat() {
        return q1.l.z(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2968b.getClass();
        Z.h(editorInfo, onCreateInputConnection, this);
        i1.q.h(editorInfo, onCreateInputConnection, this);
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
        Z z3 = this.f2968b;
        if (z3 == null || i1.f3003c) {
            return;
        }
        z3.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Z z2 = this.f2968b;
        if (z2 == null || i1.f3003c) {
            return;
        }
        C0239i0 c0239i0 = z2.i;
        if (c0239i0.f()) {
            c0239i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (i1.f3003c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (i1.f3003c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (i1.f3003c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            c0254q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.l.c0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3090b.f59b).x(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            q1.l.W(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i);
        } else {
            q1.l.X(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        q1.l.Y(this, i);
    }

    public void setPrecomputedText(I.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        q1.l.z(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f2967a;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2968b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2968b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0207D c0207d;
        if (Build.VERSION.SDK_INT >= 28 || (c0207d = this.f2969c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0207d.f2850c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.e> future) {
        this.f2972g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f333b;
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
        getPaint().set(dVar.f332a);
        Q.n.e(this, dVar.f334c);
        Q.n.h(this, dVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = i1.f3003c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Z z3 = this.f2968b;
        if (z3 == null || z2) {
            return;
        }
        C0239i0 c0239i0 = z3.i;
        if (c0239i0.f()) {
            return;
        }
        c0239i0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2970e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            q1.l lVar = C.h.f154a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f2970e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2970e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0229d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f2970e = false;
        this.f2971f = null;
        S0.a(this, getContext());
        C0254q c0254q = new C0254q(this);
        this.f2967a = c0254q;
        c0254q.d(attributeSet, i);
        Z z2 = new Z(this);
        this.f2968b = z2;
        z2.f(attributeSet, i);
        z2.b();
        C0207D c0207d = new C0207D();
        c0207d.f2849b = this;
        this.f2969c = c0207d;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().f(i, f2);
        } else if (i2 >= 34) {
            Q.q.a(this, i, f2);
        } else {
            q1.l.Y(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? q1.l.v(context, i) : null, i2 != 0 ? q1.l.v(context, i2) : null, i3 != 0 ? q1.l.v(context, i3) : null, i4 != 0 ? q1.l.v(context, i4) : null);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? q1.l.v(context, i) : null, i2 != 0 ? q1.l.v(context, i2) : null, i3 != 0 ? q1.l.v(context, i3) : null, i4 != 0 ? q1.l.v(context, i4) : null);
        Z z2 = this.f2968b;
        if (z2 != null) {
            z2.b();
        }
    }
}
