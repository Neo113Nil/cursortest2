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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import i.C0511M;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: n.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0703c0 extends TextView {

    /* renamed from: d, reason: collision with root package name */
    public final C0726o f6744d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f6745e;

    /* renamed from: i, reason: collision with root package name */
    public final C0695A f6746i;

    /* renamed from: l, reason: collision with root package name */
    public C0739v f6747l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6748m;

    /* renamed from: n, reason: collision with root package name */
    public C0511M f6749n;

    /* renamed from: o, reason: collision with root package name */
    public Future f6750o;

    public C0703c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0739v getEmojiTextViewHelper() {
        if (this.f6747l == null) {
            this.f6747l = new C0739v(this);
        }
        return this.f6747l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            c0726o.a();
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z1.f6968b) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            return Math.round(z7.f6733i.f6822e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z1.f6968b) {
            return super.getAutoSizeMinTextSize();
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            return Math.round(z7.f6733i.f6821d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z1.f6968b) {
            return super.getAutoSizeStepGranularity();
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            return Math.round(z7.f6733i.f6820c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z1.f6968b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z7 = this.f6745e;
        return z7 != null ? z7.f6733i.f6823f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (z1.f6968b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            return z7.f6733i.f6818a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P0.f.N(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0699a0 getSuperCaller() {
        if (this.f6749n == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                this.f6749n = new C0701b0(this);
            } else if (i2 >= 26) {
                this.f6749n = new C0511M(7, this);
            }
        }
        return this.f6749n;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6745e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6745e.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f6750o;
        if (future != null) {
            try {
                this.f6750o = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                P0.f.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0695A c0695a;
        if (Build.VERSION.SDK_INT >= 28 || (c0695a = this.f6746i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0695a.f6606c;
        return textClassifier == null ? T.a((TextView) c0695a.f6605b) : textClassifier;
    }

    public G.a getTextMetricsParamsCompat() {
        return P0.f.u(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6745e.getClass();
        Z.h(editorInfo, onCreateInputConnection, this);
        O6.g.W(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        super.onLayout(z7, i2, i5, i7, i8);
        Z z8 = this.f6745e;
        if (z8 == null || z1.f6968b) {
            return;
        }
        z8.f6733i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i5) {
        Future future = this.f6750o;
        if (future != null) {
            try {
                this.f6750o = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                P0.f.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
        super.onTextChanged(charSequence, i2, i5, i7);
        Z z7 = this.f6745e;
        if (z7 != null) {
            C0717j0 c0717j0 = z7.f6733i;
            if (z1.f6968b || !c0717j0.f()) {
                return;
            }
            c0717j0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i5, int i7, int i8) {
        if (z1.f6968b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i5, i7, i8);
            return;
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.i(i2, i5, i7, i8);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (z1.f6968b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.j(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (z1.f6968b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(P0.f.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i2);
        } else {
            P0.f.K(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i2);
        } else {
            P0.f.L(this, i2);
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

    public void setPrecomputedText(G.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        P0.f.u(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6744d;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z7 = this.f6745e;
        z7.l(colorStateList);
        z7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z7 = this.f6745e;
        z7.m(mode);
        z7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0695A c0695a;
        if (Build.VERSION.SDK_INT >= 28 || (c0695a = this.f6746i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0695a.f6606c = textClassifier;
        }
    }

    public void setTextFuture(Future<G.b> future) {
        this.f6750o = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(G.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f767b;
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
        getPaint().set(aVar.f766a);
        setBreakStrategy(aVar.f768c);
        setHyphenationFrequency(aVar.f769d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f7) {
        boolean z7 = z1.f6968b;
        if (z7) {
            super.setTextSize(i2, f7);
            return;
        }
        Z z8 = this.f6745e;
        if (z8 != null) {
            C0717j0 c0717j0 = z8.f6733i;
            if (z7 || c0717j0.f()) {
                return;
            }
            c0717j0.g(i2, f7);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (this.f6748m) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            V6.b bVar = B.g.f153a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        this.f6748m = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f6748m = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0703c0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        j1.a(context);
        this.f6748m = false;
        this.f6749n = null;
        i1.a(this, getContext());
        C0726o c0726o = new C0726o(this);
        this.f6744d = c0726o;
        c0726o.d(attributeSet, i2);
        Z z7 = new Z(this);
        this.f6745e = z7;
        z7.f(attributeSet, i2);
        z7.b();
        C0695A c0695a = new C0695A();
        c0695a.f6605b = this;
        this.f6746i = c0695a;
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i5, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? O6.g.M(context, i2) : null, i5 != 0 ? O6.g.M(context, i5) : null, i7 != 0 ? O6.g.M(context, i7) : null, i8 != 0 ? O6.g.M(context, i8) : null);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i5, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? O6.g.M(context, i2) : null, i5 != 0 ? O6.g.M(context, i5) : null, i7 != 0 ? O6.g.M(context, i7) : null, i8 != 0 ? O6.g.M(context, i8) : null);
        Z z7 = this.f6745e;
        if (z7 != null) {
            z7.b();
        }
    }
}
