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
import com.google.android.gms.internal.ads.C2728Pl;
import g1.C4523c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class Z extends TextView {

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f39367n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39368u;

    /* renamed from: v, reason: collision with root package name */
    public final C4714A f39369v;

    /* renamed from: w, reason: collision with root package name */
    public C4764v f39370w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39371x;

    /* renamed from: y, reason: collision with root package name */
    public C4523c f39372y;

    /* renamed from: z, reason: collision with root package name */
    public Future f39373z;

    public Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C4764v getEmojiTextViewHelper() {
        if (this.f39370w == null) {
            this.f39370w = new C4764v(this);
        }
        return this.f39370w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f39421c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            return Math.round(v6.i.f39408e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f39421c) {
            return super.getAutoSizeMinTextSize();
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            return Math.round(v6.i.f39407d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f39421c) {
            return super.getAutoSizeStepGranularity();
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            return Math.round(v6.i.f39406c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f39421c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v6 = this.f39368u;
        return v6 != null ? v6.i.f39409f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (g1.f39421c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            return v6.i.f39404a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.z(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public W getSuperCaller() {
        if (this.f39372y == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f39372y = new Y(this);
            } else if (i >= 28) {
                this.f39372y = new X(this);
            } else if (i >= 26) {
                this.f39372y = new C4523c(26, this);
            }
        }
        return this.f39372y;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39368u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39368u.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        i();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C4714A c4714a;
        if (Build.VERSION.SDK_INT >= 28 || (c4714a = this.f39369v) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c4714a.f39227c;
        return textClassifier == null ? P.a((TextView) c4714a.f39226b) : textClassifier;
    }

    public M.e getTextMetricsParamsCompat() {
        return com.bumptech.glide.d.t(this);
    }

    public final void i() {
        Future future = this.f39373z;
        if (future == null) {
            return;
        }
        try {
            this.f39373z = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            com.bumptech.glide.d.t(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f39368u.getClass();
        V.h(editorInfo, onCreateInputConnection, this);
        w8.a.g(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        V v6 = this.f39368u;
        if (v6 == null || g1.f39421c) {
            return;
        }
        v6.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        i();
        super.onMeasure(i, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        super.onTextChanged(charSequence, i, i4, i9);
        V v6 = this.f39368u;
        if (v6 == null || g1.f39421c) {
            return;
        }
        C4732e0 c4732e0 = v6.i;
        if (c4732e0.f()) {
            c4732e0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().b(z8);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i9, int i10) {
        if (g1.f39421c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i9, i10);
            return;
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.i(i, i4, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (g1.f39421c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (g1.f39421c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w8.a) getEmojiTextViewHelper().f39527b.f1233u).e(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            com.bumptech.glide.d.v(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            com.bumptech.glide.d.w(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        com.bumptech.glide.d.x(this, i);
    }

    public void setPrecomputedText(M.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        com.bumptech.glide.d.t(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39367n;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v6 = this.f39368u;
        v6.l(colorStateList);
        v6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v6 = this.f39368u;
        v6.m(mode);
        v6.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C4714A c4714a;
        if (Build.VERSION.SDK_INT >= 28 || (c4714a = this.f39369v) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c4714a.f39227c = textClassifier;
        }
    }

    public void setTextFuture(Future<M.f> future) {
        this.f39373z = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(M.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f1823b;
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
        getPaint().set(eVar.f1822a);
        U.m.e(this, eVar.f1824c);
        U.m.h(this, eVar.f1825d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        boolean z8 = g1.f39421c;
        if (z8) {
            super.setTextSize(i, f6);
            return;
        }
        V v6 = this.f39368u;
        if (v6 == null || z8) {
            return;
        }
        C4732e0 c4732e0 = v6.i;
        if (c4732e0.f()) {
            return;
        }
        c4732e0.g(f6, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f39371x) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            com.bumptech.glide.d dVar = G.j.f1158a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f39371x = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f39371x = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        this.f39371x = false;
        this.f39372y = null;
        N0.a(getContext(), this);
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39367n = c2728Pl;
        c2728Pl.d(attributeSet, i);
        V v6 = new V(this);
        this.f39368u = v6;
        v6.f(attributeSet, i);
        v6.b();
        C4714A c4714a = new C4714A();
        c4714a.f39226b = this;
        this.f39369v = c4714a;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f6) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().o(i, f6);
        } else if (i4 >= 34) {
            U.p.a(this, i, f6);
        } else {
            com.bumptech.glide.d.x(this, Math.round(TypedValue.applyDimension(i, f6, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? com.bumptech.glide.f.h(context, i) : null, i4 != 0 ? com.bumptech.glide.f.h(context, i4) : null, i9 != 0 ? com.bumptech.glide.f.h(context, i9) : null, i10 != 0 ? com.bumptech.glide.f.h(context, i10) : null);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? com.bumptech.glide.f.h(context, i) : null, i4 != 0 ? com.bumptech.glide.f.h(context, i4) : null, i9 != 0 ? com.bumptech.glide.f.h(context, i9) : null, i10 != 0 ? com.bumptech.glide.f.h(context, i10) : null);
        V v6 = this.f39368u;
        if (v6 != null) {
            v6.b();
        }
    }
}
