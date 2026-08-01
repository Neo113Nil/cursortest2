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

/* renamed from: l.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0257e0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0280q f3345a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249a0 f3346b;

    /* renamed from: c, reason: collision with root package name */
    public final C0234E f3347c;

    /* renamed from: d, reason: collision with root package name */
    public C0298z f3348d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3349e;

    /* renamed from: f, reason: collision with root package name */
    public C0274n f3350f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3351g;

    public C0257e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0298z getEmojiTextViewHelper() {
        if (this.f3348d == null) {
            this.f3348d = new C0298z(this);
        }
        return this.f3348d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            c0280q.a();
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    public final void g() {
        Future future = this.f3351g;
        if (future == null) {
            return;
        }
        try {
            this.f3351g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            q1.d.G(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f3385c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            return Math.round(c0249a0.i.f3378e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j1.f3385c) {
            return super.getAutoSizeMinTextSize();
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            return Math.round(c0249a0.i.f3377d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j1.f3385c) {
            return super.getAutoSizeStepGranularity();
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            return Math.round(c0249a0.i.f3376c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j1.f3385c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0249a0 c0249a0 = this.f3346b;
        return c0249a0 != null ? c0249a0.i.f3379f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (j1.f3385c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            return c0249a0.i.f3374a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f727a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0251b0 getSuperCaller() {
        if (this.f3350f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f3350f = new C0255d0(this);
            } else if (i >= 28) {
                this.f3350f = new C0253c0(this);
            } else {
                this.f3350f = new C0274n(this);
            }
        }
        return this.f3350f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3346b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3346b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0234E c0234e;
        if (Build.VERSION.SDK_INT >= 28 || (c0234e = this.f3347c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0234e.f3218c;
        return textClassifier == null ? U.a((TextView) c0234e.f3217b) : textClassifier;
    }

    public I.d getTextMetricsParamsCompat() {
        return q1.d.G(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3346b.getClass();
        C0249a0.h(editorInfo, onCreateInputConnection, this);
        i1.r.m(editorInfo, onCreateInputConnection, this);
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
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 == null || j1.f3385c) {
            return;
        }
        c0249a0.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 == null || j1.f3385c) {
            return;
        }
        C0267j0 c0267j0 = c0249a0.i;
        if (c0267j0.f()) {
            c0267j0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (j1.f3385c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (j1.f3385c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (j1.f3385c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.d.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3489b.f67b).y(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            q1.d.S(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            q1.d.T(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        q1.d.U(this, i);
    }

    public void setPrecomputedText(I.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        q1.d.G(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3345a;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3346b;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3346b;
        c0249a0.m(mode);
        c0249a0.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0234E c0234e;
        if (Build.VERSION.SDK_INT >= 28 || (c0234e = this.f3347c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0234e.f3218c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.e> future) {
        this.f3351g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f360b;
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
        getPaint().set(dVar.f359a);
        Q.n.e(this, dVar.f361c);
        Q.n.h(this, dVar.f362d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = j1.f3385c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 == null || z2) {
            return;
        }
        C0267j0 c0267j0 = c0249a0.i;
        if (c0267j0.f()) {
            return;
        }
        c0267j0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f3349e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            q1.l lVar = C.h.f165a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f3349e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3349e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257e0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U0.a(context);
        this.f3349e = false;
        this.f3350f = null;
        T0.a(this, getContext());
        C0280q c0280q = new C0280q(this);
        this.f3345a = c0280q;
        c0280q.d(attributeSet, i);
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3346b = c0249a0;
        c0249a0.f(attributeSet, i);
        c0249a0.b();
        C0234E c0234e = new C0234E();
        c0234e.f3217b = this;
        this.f3347c = c0234e;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().d(i, f2);
        } else if (i2 >= 34) {
            Q.q.a(this, i, f2);
        } else {
            q1.d.U(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? q1.d.z(context, i) : null, i2 != 0 ? q1.d.z(context, i2) : null, i3 != 0 ? q1.d.z(context, i3) : null, i4 != 0 ? q1.d.z(context, i4) : null);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? q1.d.z(context, i) : null, i2 != 0 ? q1.d.z(context, i2) : null, i3 != 0 ? q1.d.z(context, i3) : null, i4 != 0 ? q1.d.z(context, i4) : null);
        C0249a0 c0249a0 = this.f3346b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }
}
