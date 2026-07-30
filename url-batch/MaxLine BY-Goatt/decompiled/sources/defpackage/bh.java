package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class bh extends TextView {
    public final te m;
    public final xg n;
    public final t21 o;
    public wf p;
    public boolean q;
    public ar0 r;
    public Future s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.a(context);
        this.q = false;
        this.r = null;
        xw2.a(this, getContext());
        te teVar = new te(this);
        this.m = teVar;
        teVar.e(attributeSet, i);
        xg xgVar = new xg(this);
        this.n = xgVar;
        xgVar.f(attributeSet, i);
        xgVar.b();
        t21 t21Var = new t21(5);
        t21Var.n = this;
        this.o = t21Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private wf getEmojiTextViewHelper() {
        if (this.p == null) {
            this.p = new wf(this);
        }
        return this.p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.m;
        if (teVar != null) {
            teVar.a();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c63.c) {
            return super.getAutoSizeMaxTextSize();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return Math.round(xgVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c63.c) {
            return super.getAutoSizeMinTextSize();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return Math.round(xgVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c63.c) {
            return super.getAutoSizeStepGranularity();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return Math.round(xgVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c63.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        xg xgVar = this.n;
        return xgVar != null ? xgVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (c63.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return xgVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ti2.m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public yg getSuperCaller() {
        if (this.r == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.r = new ah(this);
            } else if (i >= 28) {
                this.r = new zg(this);
            } else if (i >= 26) {
                this.r = new ar0(7, this);
            }
        }
        return this.r;
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.s;
        if (future != null) {
            try {
                this.s = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                ti2.h(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        t21 t21Var;
        if (Build.VERSION.SDK_INT >= 28 || (t21Var = this.o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) t21Var.o;
        return textClassifier == null ? rg.a((TextView) t21Var.n) : textClassifier;
    }

    public t32 getTextMetricsParamsCompat() {
        return ti2.h(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.n.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            tf0.c(editorInfo, getText());
        }
        zm3.F(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xg xgVar = this.n;
        if (xgVar == null || c63.c) {
            return;
        }
        xgVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.s;
        if (future != null) {
            try {
                this.s = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                ti2.h(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        xg xgVar = this.n;
        if (xgVar != null) {
            gh ghVar = xgVar.i;
            if (c63.c || !ghVar.f()) {
                return;
            }
            ghVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (c63.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (c63.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (c63.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.m;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.m;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? j8.F(context, i) : null, i2 != 0 ? j8.F(context, i2) : null, i3 != 0 ? j8.F(context, i3) : null, i4 != 0 ? j8.F(context, i4) : null);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? j8.F(context, i) : null, i2 != 0 ? j8.F(context, i2) : null, i3 != 0 ? j8.F(context, i3) : null, i4 != 0 ? j8.F(context, i4) : null);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ti2.n(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((tk3) getEmojiTextViewHelper().b.n).O(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            ti2.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            ti2.k(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().m(i, f);
        } else if (i2 >= 34) {
            v1.p(this, i, f);
        } else {
            ti2.l(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(u32 u32Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        ti2.h(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        xg xgVar = this.n;
        xgVar.k(colorStateList);
        xgVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.n;
        xgVar.l(mode);
        xgVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        t21 t21Var;
        if (Build.VERSION.SDK_INT >= 28 || (t21Var = this.o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            t21Var.o = textClassifier;
        }
    }

    public void setTextFuture(Future<u32> future) {
        this.s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(t32 t32Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = t32Var.b;
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
        getPaint().set(t32Var.a);
        setBreakStrategy(t32Var.c);
        setHyphenationFrequency(t32Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = c63.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            gh ghVar = xgVar.i;
            if (z || ghVar.f()) {
                return;
            }
            ghVar.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.q) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            th2 th2Var = w03.a;
            if (context == null) {
                lh.e("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.q = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.q = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ti2.l(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    public bh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
