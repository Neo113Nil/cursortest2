package n;

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

/* renamed from: n.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0267c0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0294q f3604a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3605b;

    /* renamed from: c, reason: collision with root package name */
    public final C0247C f3606c;

    /* renamed from: d, reason: collision with root package name */
    public C0308x f3607d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public C0288n f3608f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3609g;

    public C0267c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0308x getEmojiTextViewHelper() {
        if (this.f3607d == null) {
            this.f3607d = new C0308x(this);
        }
        return this.f3607d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            c0294q.a();
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }

    public final void g() {
        Future future = this.f3609g;
        if (future == null) {
            return;
        }
        try {
            this.f3609g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            H1.l.A(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (n1.f3685c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            return Math.round(y2.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (n1.f3685c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            return Math.round(y2.i.f3625d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (n1.f3685c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            return Math.round(y2.i.f3624c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (n1.f3685c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3605b;
        return y2 != null ? y2.i.f3626f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (n1.f3685c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            return y2.i.f3622a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return H1.l.h0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Z getSuperCaller() {
        if (this.f3608f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f3608f = new C0265b0(this);
            } else if (i >= 28) {
                this.f3608f = new C0263a0(this);
            } else {
                this.f3608f = new C0288n(1, this);
            }
        }
        return this.f3608f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            return c0294q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            return c0294q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3605b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3605b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0247C c0247c;
        if (Build.VERSION.SDK_INT >= 28 || (c0247c = this.f3606c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0247c.f3442c;
        return textClassifier == null ? S.a((TextView) c0247c.f3441b) : textClassifier;
    }

    public K.e getTextMetricsParamsCompat() {
        return H1.l.A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3605b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        H1.l.K(editorInfo, onCreateInputConnection, this);
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
        Y y2 = this.f3605b;
        if (y2 == null || n1.f3685c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f3605b;
        if (y2 == null || n1.f3685c) {
            return;
        }
        C0277h0 c0277h0 = y2.i;
        if (c0277h0.f()) {
            c0277h0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (n1.f3685c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (n1.f3685c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (n1.f3685c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            c0294q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            c0294q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.l.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            H1.l.Y(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            H1.l.a0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        H1.l.b0(this, i);
    }

    public void setPrecomputedText(K.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        H1.l.A(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            c0294q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0294q c0294q = this.f3604a;
        if (c0294q != null) {
            c0294q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3605b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3605b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0247C c0247c;
        if (Build.VERSION.SDK_INT >= 28 || (c0247c = this.f3606c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0247c.f3442c = textClassifier;
        }
    }

    public void setTextFuture(Future<K.f> future) {
        this.f3609g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(K.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f662b;
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
        getPaint().set(eVar.f661a);
        S.m.e(this, eVar.f663c);
        S.m.h(this, eVar.f664d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = n1.f3685c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3605b;
        if (y2 == null || z2) {
            return;
        }
        C0277h0 c0277h0 = y2.i;
        if (c0277h0.f()) {
            return;
        }
        c0277h0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            H1.d dVar = E.g.f286a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267c0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.a(context);
        this.e = false;
        this.f3608f = null;
        W0.a(this, getContext());
        C0294q c0294q = new C0294q(this);
        this.f3604a = c0294q;
        c0294q.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3605b = y2;
        y2.f(attributeSet, i);
        y2.b();
        C0247C c0247c = new C0247C();
        c0247c.f3441b = this;
        this.f3606c = c0247c;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().d(i, f2);
        } else if (i2 >= 34) {
            S.p.a(this, i, f2);
        } else {
            H1.l.b0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? H1.d.F(context, i) : null, i2 != 0 ? H1.d.F(context, i2) : null, i3 != 0 ? H1.d.F(context, i3) : null, i4 != 0 ? H1.d.F(context, i4) : null);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? H1.d.F(context, i) : null, i2 != 0 ? H1.d.F(context, i2) : null, i3 != 0 ? H1.d.F(context, i3) : null, i4 != 0 ? H1.d.F(context, i4) : null);
        Y y2 = this.f3605b;
        if (y2 != null) {
            y2.b();
        }
    }
}
