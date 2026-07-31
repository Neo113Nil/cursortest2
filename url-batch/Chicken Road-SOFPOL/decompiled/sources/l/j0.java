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
import android.text.TextUtils;
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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class j0 extends TextView {

    /* renamed from: d, reason: collision with root package name */
    public final n f4290d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f4291e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.a0 f4292f;

    /* renamed from: g, reason: collision with root package name */
    public v f4293g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4294h;
    public b1.b i;

    /* renamed from: j, reason: collision with root package name */
    public Future f4295j;

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private v getEmojiTextViewHelper() {
        if (this.f4293g == null) {
            this.f4293g = new v(this);
        }
        return this.f4293g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4290d;
        if (nVar != null) {
            nVar.a();
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p2.f4378a) {
            return super.getAutoSizeMaxTextSize();
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            return Math.round(f0Var.i.f4368e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p2.f4378a) {
            return super.getAutoSizeMinTextSize();
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            return Math.round(f0Var.i.f4367d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p2.f4378a) {
            return super.getAutoSizeStepGranularity();
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            return Math.round(f0Var.i.f4366c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p2.f4378a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f0 f0Var = this.f4291e;
        return f0Var != null ? f0Var.i.f4369f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p2.f4378a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            return f0Var.i.f4364a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r2.o.v0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public g0 getSuperCaller() {
        if (this.i == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.i = new i0(this);
            } else if (i >= 28) {
                this.i = new h0(this);
            } else if (i >= 26) {
                this.i = new b1.b(21, this);
            }
        }
        return this.i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f4290d;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f4290d;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x1 x1Var = this.f4291e.f4239h;
        if (x1Var != null) {
            return x1Var.f4452a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x1 x1Var = this.f4291e.f4239h;
        if (x1Var != null) {
            return x1Var.f4453b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f4295j;
        if (future != null) {
            try {
                this.f4295j = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                r2.o.R(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0.a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f4292f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.f12f;
        return textClassifier == null ? a0.a((TextView) a0Var.f11e) : textClassifier;
    }

    public o3.c getTextMetricsParamsCompat() {
        return r2.o.R(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4291e.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                s3.b.a(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    s3.b.a(editorInfo, text);
                } else {
                    int i8 = editorInfo.initialSelStart;
                    int i9 = editorInfo.initialSelEnd;
                    int i10 = i8 > i9 ? i9 : i8;
                    if (i8 <= i9) {
                        i8 = i9;
                    }
                    int length = text.length();
                    if (i10 < 0 || i8 > length) {
                        s3.c.a(editorInfo, null, 0, 0);
                    } else {
                        int i11 = editorInfo.inputType & 4095;
                        if (i11 == 129 || i11 == 225 || i11 == 18) {
                            s3.c.a(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            s3.c.a(editorInfo, text, i10, i8);
                        } else {
                            int i12 = i8 - i10;
                            int i13 = i12 > 1024 ? 0 : i12;
                            int i14 = 2048 - i13;
                            int min = Math.min(text.length() - i8, i14 - Math.min(i10, (int) (i14 * 0.8d)));
                            int min2 = Math.min(i10, i14 - min);
                            int i15 = i10 - min2;
                            if (Character.isLowSurrogate(text.charAt(i15))) {
                                i15++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i8 + min) - 1))) {
                                min--;
                            }
                            int i16 = min2 + i13;
                            s3.c.a(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i8, min + i8)) : text.subSequence(i15, i16 + min + i15), min2, i16);
                        }
                    }
                }
            }
        }
        h0.a.Q(onCreateInputConnection, editorInfo, this);
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
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        f0 f0Var = this.f4291e;
        if (f0Var == null || p2.f4378a) {
            return;
        }
        f0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i8) {
        Future future = this.f4295j;
        if (future != null) {
            try {
                this.f4295j = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                r2.o.R(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        super.onTextChanged(charSequence, i, i8, i9);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            o0 o0Var = f0Var.i;
            if (p2.f4378a || !o0Var.f()) {
                return;
            }
            o0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        ((s6.a) getEmojiTextViewHelper().f4423b.f1050e).E(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i8, int i9, int i10) {
        if (p2.f4378a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i8, i9, i10);
            return;
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.f(i, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (p2.f4378a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (p2.f4378a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4290d;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n nVar = this.f4290d;
        if (nVar != null) {
            nVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r2.o.y0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        ((s6.a) getEmojiTextViewHelper().f4423b.f1050e).F(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((s6.a) getEmojiTextViewHelper().f4423b.f1050e).s(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            r2.o.k0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            r2.o.l0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        r2.o.m0(this, i);
    }

    public void setPrecomputedText(o3.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        r2.o.R(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4290d;
        if (nVar != null) {
            nVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4290d;
        if (nVar != null) {
            nVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f4291e;
        f0Var.i(colorStateList);
        f0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f4291e;
        f0Var.j(mode);
        f0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0.a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f4292f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f12f = textClassifier;
        }
    }

    public void setTextFuture(Future<o3.d> future) {
        this.f4295j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(o3.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f5610b;
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
        getPaint().set(cVar.f5609a);
        setBreakStrategy(cVar.f5611c);
        setHyphenationFrequency(cVar.f5612d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        boolean z3 = p2.f4378a;
        if (z3) {
            super.setTextSize(i, f6);
            return;
        }
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            o0 o0Var = f0Var.i;
            if (z3 || o0Var.f()) {
                return;
            }
            o0Var.g(i, f6);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f4294h) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            h0.a aVar = i3.g.f3428a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f4294h = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f4294h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w1.a(context);
        this.f4294h = false;
        this.i = null;
        v1.a(this, getContext());
        n nVar = new n(this);
        this.f4290d = nVar;
        nVar.d(attributeSet, i);
        f0 f0Var = new f0(this);
        this.f4291e = f0Var;
        f0Var.d(attributeSet, i);
        f0Var.b();
        a0.a0 a0Var = new a0.a0(11, false);
        a0Var.f11e = this;
        this.f4292f = a0Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f6) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            getSuperCaller().o(i, f6);
        } else if (i8 >= 34) {
            q3.v.k(this, i, f6);
        } else {
            r2.o.m0(this, Math.round(TypedValue.applyDimension(i, f6, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? h0.a.D(context, i) : null, i8 != 0 ? h0.a.D(context, i8) : null, i9 != 0 ? h0.a.D(context, i9) : null, i10 != 0 ? h0.a.D(context, i10) : null);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? h0.a.D(context, i) : null, i8 != 0 ? h0.a.D(context, i8) : null, i9 != 0 ? h0.a.D(context, i9) : null, i10 != 0 ? h0.a.D(context, i10) : null);
        f0 f0Var = this.f4291e;
        if (f0Var != null) {
            f0Var.b();
        }
    }
}
