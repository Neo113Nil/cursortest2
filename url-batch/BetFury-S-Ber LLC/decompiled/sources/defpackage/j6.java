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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class j6 extends TextView {
    public final f2 f;
    public final f6 g;
    public final i5 h;
    public d5 i;
    public boolean j;
    public o0 k;
    public Future l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ji0.a(context);
        this.j = false;
        this.k = null;
        yh0.a(this, getContext());
        f2 f2Var = new f2(this);
        this.f = f2Var;
        f2Var.l(attributeSet, i);
        f6 f6Var = new f6(this);
        this.g = f6Var;
        f6Var.f(attributeSet, i);
        f6Var.b();
        i5 i5Var = new i5(6, false);
        i5Var.g = this;
        this.h = i5Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private d5 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new d5(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.a();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (dn0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return Math.round(f6Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (dn0.c) {
            return super.getAutoSizeMinTextSize();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return Math.round(f6Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (dn0.c) {
            return super.getAutoSizeStepGranularity();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return Math.round(f6Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (dn0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f6 f6Var = this.g;
        return f6Var != null ? f6Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (dn0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return f6Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof vh0 ? ((vh0) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public g6 getSuperCaller() {
        if (this.k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.k = new i6(this);
            } else if (i >= 28) {
                this.k = new h6(this);
            } else {
                this.k = new o0(7, this);
            }
        }
        return this.k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.l;
        if (future != null) {
            try {
                this.l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                xc0.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        i5 i5Var;
        if (Build.VERSION.SDK_INT >= 28 || (i5Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) i5Var.h;
        return textClassifier == null ? z5.a((TextView) i5Var.g) : textClassifier;
    }

    public i60 getTextMetricsParamsCompat() {
        return xc0.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        f6.h(editorInfo, onCreateInputConnection, this);
        mv.F(editorInfo, onCreateInputConnection, this);
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
        f6 f6Var = this.g;
        if (f6Var == null || dn0.c) {
            return;
        }
        f6Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.l;
        if (future != null) {
            try {
                this.l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                xc0.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f6 f6Var = this.g;
        if (f6Var != null) {
            o6 o6Var = f6Var.i;
            if (dn0.c || !o6Var.f()) {
                return;
            }
            o6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (dn0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (dn0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (dn0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? d50.v(context, i) : null, i2 != 0 ? d50.v(context, i2) : null, i3 != 0 ? d50.v(context, i3) : null, i4 != 0 ? d50.v(context, i4) : null);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? d50.v(context, i) : null, i2 != 0 ? d50.v(context, i2) : null, i3 != 0 ? d50.v(context, i3) : null, i4 != 0 ? d50.v(context, i4) : null);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xc0.i(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((d50) getEmojiTextViewHelper().b.g).w(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().p(i);
        } else {
            xc0.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            xc0.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().s(i, f);
        } else if (i2 >= 34) {
            j0.h(this, i, f);
        } else {
            xc0.e(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(j60 j60Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        xc0.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f6 f6Var = this.g;
        f6Var.l(colorStateList);
        f6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f6 f6Var = this.g;
        f6Var.m(mode);
        f6Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        i5 i5Var;
        if (Build.VERSION.SDK_INT >= 28 || (i5Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            i5Var.h = textClassifier;
        }
    }

    public void setTextFuture(Future<j60> future) {
        this.l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(i60 i60Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = i60Var.b;
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
        getPaint().set(i60Var.a);
        setBreakStrategy(i60Var.c);
        setHyphenationFrequency(i60Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = dn0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            o6 o6Var = f6Var.i;
            if (z || o6Var.f()) {
                return;
            }
            o6Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.j) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            ud0 ud0Var = ik0.a;
            if (context == null) {
                s9.k("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.j = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        xc0.e(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    public j6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
