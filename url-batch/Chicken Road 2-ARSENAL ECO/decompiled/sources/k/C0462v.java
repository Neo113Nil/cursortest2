package k;

import a.AbstractC0219a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import h.AbstractC0401a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import u0.C0675e;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0462v extends TextView implements I.b {

    /* renamed from: f, reason: collision with root package name */
    public final C0455n f5131f;

    /* renamed from: g, reason: collision with root package name */
    public final C0461u f5132g;

    /* renamed from: h, reason: collision with root package name */
    public final C0675e f5133h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5134i;

    /* renamed from: j, reason: collision with root package name */
    public Future f5135j;

    public C0462v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0455n c0455n = this.f5131f;
        if (c0455n != null) {
            c0455n.a();
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (I.b.f1133a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            return Math.round(c0461u.f5115i.f5150e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (I.b.f1133a) {
            return super.getAutoSizeMinTextSize();
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            return Math.round(c0461u.f5115i.f5149d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (I.b.f1133a) {
            return super.getAutoSizeStepGranularity();
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            return Math.round(c0461u.f5115i.f5148c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (I.b.f1133a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0461u c0461u = this.f5132g;
        return c0461u != null ? c0461u.f5115i.f5151f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (I.b.f1133a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            return c0461u.f5115i.f5146a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        X5.h hVar;
        C0455n c0455n = this.f5131f;
        if (c0455n == null || (hVar = c0455n.f5066e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2938c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        X5.h hVar;
        C0455n c0455n = this.f5131f;
        if (c0455n == null || (hVar = c0455n.f5066e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2939d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        X5.h hVar = this.f5132g.f5114h;
        if (hVar != null) {
            return (ColorStateList) hVar.f2938c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        X5.h hVar = this.f5132g.f5114h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f2939d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f5135j;
        if (future != null) {
            try {
                this.f5135j = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                A3.c.Q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0675e c0675e;
        if (Build.VERSION.SDK_INT >= 28 || (c0675e = this.f5133h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0675e.f5976c;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0462v) c0675e.f5975b).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public B.c getTextMetricsParamsCompat() {
        return A3.c.Q(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5132g.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i7 >= 30) {
                H.a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i7 >= 30) {
                    H.a.a(editorInfo, text);
                } else {
                    int i8 = editorInfo.initialSelStart;
                    int i9 = editorInfo.initialSelEnd;
                    int i10 = i8 > i9 ? i9 : i8;
                    if (i8 <= i9) {
                        i8 = i9;
                    }
                    int length = text.length();
                    if (i10 < 0 || i8 > length) {
                        i6.g.x(editorInfo, null, 0, 0);
                    } else {
                        int i11 = editorInfo.inputType & 4095;
                        if (i11 == 129 || i11 == 225 || i11 == 18) {
                            i6.g.x(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            i6.g.x(editorInfo, text, i10, i8);
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
                            i6.g.x(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i8, min + i8)) : text.subSequence(i15, i16 + min + i15), min2, i16);
                        }
                    }
                }
            }
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        super.onLayout(z5, i7, i8, i9, i10);
        C0461u c0461u = this.f5132g;
        if (c0461u == null || I.b.f1133a) {
            return;
        }
        c0461u.f5115i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        Future future = this.f5135j;
        if (future != null) {
            try {
                this.f5135j = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                A3.c.Q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C0461u c0461u = this.f5132g;
        if (c0461u == null || I.b.f1133a) {
            return;
        }
        C0466z c0466z = c0461u.f5115i;
        if (c0466z.f5146a != 0) {
            c0466z.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (I.b.f1133a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            C0466z c0466z = c0461u.f5115i;
            DisplayMetrics displayMetrics = c0466z.f5155j.getResources().getDisplayMetrics();
            c0466z.i(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c0466z.g()) {
                c0466z.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (I.b.f1133a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            C0466z c0466z = c0461u.f5115i;
            c0466z.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0466z.f5155j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                c0466z.f5151f = C0466z.b(iArr2);
                if (!c0466z.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0466z.f5152g = false;
            }
            if (c0466z.g()) {
                c0466z.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (I.b.f1133a) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            C0466z c0466z = c0461u.f5115i;
            if (i7 == 0) {
                c0466z.f5146a = 0;
                c0466z.f5149d = -1.0f;
                c0466z.f5150e = -1.0f;
                c0466z.f5148c = -1.0f;
                c0466z.f5151f = new int[0];
                c0466z.f5147b = false;
                return;
            }
            if (i7 != 1) {
                c0466z.getClass();
                throw new IllegalArgumentException(W4.o.c("Unknown auto-size text type: ", i7));
            }
            DisplayMetrics displayMetrics = c0466z.f5155j.getResources().getDisplayMetrics();
            c0466z.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0466z.g()) {
                c0466z.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0455n c0455n = this.f5131f;
        if (c0455n != null) {
            c0455n.f5064c = -1;
            c0455n.d(null);
            c0455n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0455n c0455n = this.f5131f;
        if (c0455n != null) {
            c0455n.c(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27 && !(callback instanceof I.p) && callback != null) {
            callback = new I.p(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i7);
        } else {
            A3.c.e0(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i7);
        } else {
            A3.c.f0(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i7 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(B.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        A3.c.Q(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0455n c0455n = this.f5131f;
        if (c0455n != null) {
            c0455n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0455n c0455n = this.f5131f;
        if (c0455n != null) {
            c0455n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0461u c0461u = this.f5132g;
        if (c0461u.f5114h == null) {
            c0461u.f5114h = new X5.h();
        }
        X5.h hVar = c0461u.f5114h;
        hVar.f2938c = colorStateList;
        hVar.f2937b = colorStateList != null;
        c0461u.f5108b = hVar;
        c0461u.f5109c = hVar;
        c0461u.f5110d = hVar;
        c0461u.f5111e = hVar;
        c0461u.f5112f = hVar;
        c0461u.f5113g = hVar;
        c0461u.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0461u c0461u = this.f5132g;
        if (c0461u.f5114h == null) {
            c0461u.f5114h = new X5.h();
        }
        X5.h hVar = c0461u.f5114h;
        hVar.f2939d = mode;
        hVar.f2936a = mode != null;
        c0461u.f5108b = hVar;
        c0461u.f5109c = hVar;
        c0461u.f5110d = hVar;
        c0461u.f5111e = hVar;
        c0461u.f5112f = hVar;
        c0461u.f5113g = hVar;
        c0461u.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.e(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0675e c0675e;
        if (Build.VERSION.SDK_INT >= 28 || (c0675e = this.f5133h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0675e.f5976c = textClassifier;
        }
    }

    public void setTextFuture(Future<B.d> future) {
        this.f5135j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(B.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f59b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(cVar.f58a);
        I.m.e(this, cVar.f60c);
        I.m.h(this, cVar.f61d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z5 = I.b.f1133a;
        if (z5) {
            super.setTextSize(i7, f7);
            return;
        }
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            C0466z c0466z = c0461u.f5115i;
            if (z5 || c0466z.f5146a != 0) {
                return;
            }
            c0466z.f(i7, f7);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f5134i) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0219a abstractC0219a = w.d.f6131a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i7);
        }
        this.f5134i = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f5134i = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462v(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        l0.a(context);
        this.f5134i = false;
        k0.a(this, getContext());
        C0455n c0455n = new C0455n(this);
        this.f5131f = c0455n;
        c0455n.b(attributeSet, i7);
        C0461u c0461u = new C0461u(this);
        this.f5132g = c0461u;
        c0461u.d(attributeSet, i7);
        c0461u.b();
        C0675e c0675e = new C0675e(11);
        c0675e.f5975b = this;
        this.f5133h = c0675e;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC0401a.a(context, i7) : null, i8 != 0 ? AbstractC0401a.a(context, i8) : null, i9 != 0 ? AbstractC0401a.a(context, i9) : null, i10 != 0 ? AbstractC0401a.a(context, i10) : null);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC0401a.a(context, i7) : null, i8 != 0 ? AbstractC0401a.a(context, i8) : null, i9 != 0 ? AbstractC0401a.a(context, i9) : null, i10 != 0 ? AbstractC0401a.a(context, i10) : null);
        C0461u c0461u = this.f5132g;
        if (c0461u != null) {
            c0461u.b();
        }
    }
}
