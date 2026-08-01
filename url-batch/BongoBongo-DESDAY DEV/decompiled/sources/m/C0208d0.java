package m;

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
import h.AbstractC0112a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: m.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0208d0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3077a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3078b;

    /* renamed from: c, reason: collision with root package name */
    public final C0185C f3079c;
    public C0247x d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3080e;

    /* renamed from: f, reason: collision with root package name */
    public C0202a0 f3081f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3082g;

    public C0208d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0247x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0247x(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            c0231p.a();
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }

    public final void g() {
        Future future = this.f3082g;
        if (future == null) {
            return;
        }
        try {
            this.f3082g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            A1.m.E(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o1.f3160c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            return Math.round(y2.i.f3099e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (o1.f3160c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            return Math.round(y2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (o1.f3160c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            return Math.round(y2.i.f3098c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (o1.f3160c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3078b;
        return y2 != null ? y2.i.f3100f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (o1.f3160c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            return y2.i.f3096a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A1.m.n0(super.getCustomSelectionActionModeCallback());
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
        if (this.f3081f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f3081f = new C0206c0(this);
            } else if (i >= 28) {
                this.f3081f = new C0204b0(this);
            } else {
                this.f3081f = new C0202a0(this);
            }
        }
        return this.f3081f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3078b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3078b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0185C c0185c;
        if (Build.VERSION.SDK_INT >= 28 || (c0185c = this.f3079c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0185c.f2911c;
        return textClassifier == null ? AbstractC0200S.a((TextView) c0185c.f2910b) : textClassifier;
    }

    public J.d getTextMetricsParamsCompat() {
        return A1.m.E(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3078b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        h0.d0.l(editorInfo, onCreateInputConnection, this);
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
        Y y2 = this.f3078b;
        if (y2 == null || o1.f3160c) {
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
        Y y2 = this.f3078b;
        if (y2 == null || o1.f3160c) {
            return;
        }
        C0218i0 c0218i0 = y2.i;
        if (c0218i0.f()) {
            c0218i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (o1.f3160c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (o1.f3160c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o1.f3160c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A1.m.p0(callback, this));
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
            A1.m.d0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            A1.m.e0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        A1.m.f0(this, i);
    }

    public void setPrecomputedText(J.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        A1.m.E(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3077a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3078b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3078b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0185C c0185c;
        if (Build.VERSION.SDK_INT >= 28 || (c0185c = this.f3079c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0185c.f2911c = textClassifier;
        }
    }

    public void setTextFuture(Future<J.e> future) {
        this.f3082g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(J.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f356b;
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
        getPaint().set(dVar.f355a);
        R.n.e(this, dVar.f357c);
        R.n.h(this, dVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = o1.f3160c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3078b;
        if (y2 == null || z2) {
            return;
        }
        C0218i0 c0218i0 = y2.i;
        if (c0218i0.f()) {
            return;
        }
        c0218i0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f3080e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            A1.m mVar = D.h.f123a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f3080e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3080e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Y0.a(context);
        this.f3080e = false;
        this.f3081f = null;
        X0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f3077a = c0231p;
        c0231p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3078b = y2;
        y2.f(attributeSet, i);
        y2.b();
        C0185C c0185c = new C0185C();
        c0185c.f2910b = this;
        this.f3079c = c0185c;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().c(i, f2);
        } else if (i2 >= 34) {
            R.q.a(this, i, f2);
        } else {
            A1.m.f0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0112a.l(context, i) : null, i2 != 0 ? AbstractC0112a.l(context, i2) : null, i3 != 0 ? AbstractC0112a.l(context, i3) : null, i4 != 0 ? AbstractC0112a.l(context, i4) : null);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0112a.l(context, i) : null, i2 != 0 ? AbstractC0112a.l(context, i2) : null, i3 != 0 ? AbstractC0112a.l(context, i3) : null, i4 != 0 ? AbstractC0112a.l(context, i4) : null);
        Y y2 = this.f3078b;
        if (y2 != null) {
            y2.b();
        }
    }
}
