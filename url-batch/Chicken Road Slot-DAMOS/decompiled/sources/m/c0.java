package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
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
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c0 extends TextView {

    /* renamed from: d, reason: collision with root package name */
    public final c2.w1 f6032d;

    /* renamed from: e, reason: collision with root package name */
    public final y f6033e;

    /* renamed from: i, reason: collision with root package name */
    public final c6.e f6034i;

    /* renamed from: r, reason: collision with root package name */
    public p f6035r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6036s;

    /* renamed from: t, reason: collision with root package name */
    public l.d f6037t;

    /* renamed from: u, reason: collision with root package name */
    public Future f6038u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        p1.a(context);
        this.f6036s = false;
        this.f6037t = null;
        o1.a(this, getContext());
        c2.w1 w1Var = new c2.w1(this);
        this.f6032d = w1Var;
        w1Var.b(attributeSet, i3);
        y yVar = new y(this);
        this.f6033e = yVar;
        yVar.d(attributeSet, i3);
        yVar.b();
        c6.e eVar = new c6.e(8);
        eVar.f1814e = this;
        this.f6034i = eVar;
        p emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray obtainStyledAttributes = emojiTextViewHelper.f6152a.getContext().obtainStyledAttributes(attributeSet, i.a.g, i3, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((a.a) emojiTextViewHelper.f6153b.f3701e).X(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private p getEmojiTextViewHelper() {
        if (this.f6035r == null) {
            this.f6035r = new p(this);
        }
        return this.f6035r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c2.w1 w1Var = this.f6032d;
        if (w1Var != null) {
            w1Var.a();
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j2.f6117a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            return Math.round(yVar.f6213i.f6091e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j2.f6117a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            return Math.round(yVar.f6213i.f6090d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j2.f6117a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            return Math.round(yVar.f6213i.f6089c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j2.f6117a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f6033e;
        return yVar != null ? yVar.f6213i.f6092f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (j2.f6117a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            return yVar.f6213i.f6087a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return (!(customSelectionActionModeCallback instanceof t3.h) || Build.VERSION.SDK_INT < 26) ? customSelectionActionModeCallback : ((t3.h) customSelectionActionModeCallback).f9274a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public z getSuperCaller() {
        if (this.f6037t == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f6037t = new b0(this);
            } else if (i3 >= 28) {
                this.f6037t = new a0(this);
            } else if (i3 >= 26) {
                this.f6037t = new l.d(7, this);
            }
        }
        return this.f6037t;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q1 q1Var;
        c2.w1 w1Var = this.f6032d;
        if (w1Var == null || (q1Var = (q1) w1Var.f1698e) == null) {
            return null;
        }
        return q1Var.f6171a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q1 q1Var;
        c2.w1 w1Var = this.f6032d;
        if (w1Var == null || (q1Var = (q1) w1Var.f1698e) == null) {
            return null;
        }
        return q1Var.f6172b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        q1 q1Var = this.f6033e.f6212h;
        if (q1Var != null) {
            return q1Var.f6171a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        q1 q1Var = this.f6033e.f6212h;
        if (q1Var != null) {
            return q1Var.f6172b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f6038u;
        if (future != null) {
            try {
                this.f6038u = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a.a.L(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c6.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f6034i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) eVar.f1815i;
        return textClassifier == null ? t.a((c0) eVar.f1814e) : textClassifier;
    }

    public m3.a getTextMetricsParamsCompat() {
        return a.a.L(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6033e.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i3 >= 30) {
                f2.b.h(editorInfo, text);
            } else {
                text.getClass();
                if (i3 >= 30) {
                    f2.b.h(editorInfo, text);
                } else {
                    int i10 = editorInfo.initialSelStart;
                    int i11 = editorInfo.initialSelEnd;
                    int i12 = i10 > i11 ? i11 : i10;
                    if (i10 <= i11) {
                        i10 = i11;
                    }
                    int length = text.length();
                    if (i12 < 0 || i10 > length) {
                        c6.f.b0(editorInfo, null, 0, 0);
                    } else {
                        int i13 = editorInfo.inputType & 4095;
                        if (i13 == 129 || i13 == 225 || i13 == 18) {
                            c6.f.b0(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            c6.f.b0(editorInfo, text, i12, i10);
                        } else {
                            int i14 = i10 - i12;
                            int i15 = i14 > 1024 ? 0 : i14;
                            int i16 = 2048 - i15;
                            int min = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
                            int min2 = Math.min(i12, i16 - min);
                            int i17 = i12 - min2;
                            if (Character.isLowSurrogate(text.charAt(i17))) {
                                i17++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
                                min--;
                            }
                            int i18 = min2 + i15;
                            c6.f.b0(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i10, min + i10)) : text.subSequence(i17, i18 + min + i17), min2, i18);
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

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        y yVar = this.f6033e;
        if (yVar == null || j2.f6117a) {
            return;
        }
        yVar.f6213i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        Future future = this.f6038u;
        if (future != null) {
            try {
                this.f6038u = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a.a.L(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        y yVar = this.f6033e;
        if (yVar == null || j2.f6117a) {
            return;
        }
        h0 h0Var = yVar.f6213i;
        if (h0Var.f6087a != 0) {
            h0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        ((a.a) getEmojiTextViewHelper().f6153b.f3701e).W(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i10, int i11, int i12) {
        if (j2.f6117a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i10, i11, i12);
            return;
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            h0 h0Var = yVar.f6213i;
            DisplayMetrics displayMetrics = h0Var.j.getResources().getDisplayMetrics();
            h0Var.i(TypedValue.applyDimension(i12, i3, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (h0Var.g()) {
                h0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (j2.f6117a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            h0 h0Var = yVar.f6213i;
            h0Var.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h0Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i3, iArr[i10], displayMetrics));
                    }
                }
                h0Var.f6092f = h0.b(iArr2);
                if (!h0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h0Var.g = false;
            }
            if (h0Var.g()) {
                h0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (j2.f6117a) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            h0 h0Var = yVar.f6213i;
            if (i3 == 0) {
                h0Var.f6087a = 0;
                h0Var.f6090d = -1.0f;
                h0Var.f6091e = -1.0f;
                h0Var.f6089c = -1.0f;
                h0Var.f6092f = new int[0];
                h0Var.f6088b = false;
                return;
            }
            if (i3 != 1) {
                h0Var.getClass();
                te.a1.e(v4.a.j(i3, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = h0Var.j.getResources().getDisplayMetrics();
            h0Var.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h0Var.g()) {
                h0Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c2.w1 w1Var = this.f6032d;
        if (w1Var != null) {
            w1Var.f1694a = -1;
            w1Var.e(null);
            w1Var.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        c2.w1 w1Var = this.f6032d;
        if (w1Var != null) {
            w1Var.d(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? z4.w.v(context, i3) : null, i10 != 0 ? z4.w.v(context, i10) : null, i11 != 0 ? z4.w.v(context, i11) : null, i12 != 0 ? z4.w.v(context, i12) : null);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? z4.w.v(context, i3) : null, i10 != 0 ? z4.w.v(context, i10) : null, i11 != 0 ? z4.w.v(context, i11) : null, i12 != 0 ? z4.w.v(context, i12) : null);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 <= 27 && !(callback instanceof t3.h) && callback != null) {
            callback = new t3.h(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((a.a) getEmojiTextViewHelper().f6153b.f3701e).X(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f6153b.f3701e).A(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i3);
        } else {
            a.a.Y(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i3);
        } else {
            a.a.Z(this, i3);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i3, float f3) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().l(i3, f3);
        } else if (i10 >= 34) {
            o3.q.k(this, i3, f3);
        } else {
            a.a.a0(this, Math.round(TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(m3.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a.a.L(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c2.w1 w1Var = this.f6032d;
        if (w1Var != null) {
            w1Var.f(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c2.w1 w1Var = this.f6032d;
        if (w1Var != null) {
            w1Var.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y yVar = this.f6033e;
        if (yVar.f6212h == null) {
            yVar.f6212h = new q1();
        }
        q1 q1Var = yVar.f6212h;
        q1Var.f6171a = colorStateList;
        q1Var.f6174d = colorStateList != null;
        yVar.f6207b = q1Var;
        yVar.f6208c = q1Var;
        yVar.f6209d = q1Var;
        yVar.f6210e = q1Var;
        yVar.f6211f = q1Var;
        yVar.g = q1Var;
        yVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y yVar = this.f6033e;
        if (yVar.f6212h == null) {
            yVar.f6212h = new q1();
        }
        q1 q1Var = yVar.f6212h;
        q1Var.f6172b = mode;
        q1Var.f6173c = mode != null;
        yVar.f6207b = q1Var;
        yVar.f6208c = q1Var;
        yVar.f6209d = q1Var;
        yVar.f6210e = q1Var;
        yVar.f6211f = q1Var;
        yVar.g = q1Var;
        yVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c6.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f6034i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f1815i = textClassifier;
        }
    }

    public void setTextFuture(Future<m3.b> future) {
        this.f6038u = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m3.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f6550b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(aVar.f6549a);
        setBreakStrategy(aVar.f6551c);
        setHyphenationFrequency(aVar.f6552d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z10 = j2.f6117a;
        if (z10) {
            super.setTextSize(i3, f3);
            return;
        }
        y yVar = this.f6033e;
        if (yVar != null) {
            h0 h0Var = yVar.f6213i;
            if (z10 || h0Var.f6087a != 0) {
                return;
            }
            h0Var.f(i3, f3);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (this.f6036s) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            a.a aVar = h3.c.f4447a;
            if (context == null) {
                te.a1.e("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i3);
        }
        this.f6036s = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f6036s = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        a.a.a0(this, i3);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f6033e;
        if (yVar != null) {
            yVar.b();
        }
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
