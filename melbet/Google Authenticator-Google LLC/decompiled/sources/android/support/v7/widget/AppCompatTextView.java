package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.acv;
import defpackage.afr;
import defpackage.be;
import defpackage.e;
import defpackage.hs;
import defpackage.is;
import defpackage.it;
import defpackage.iu;
import defpackage.iv;
import defpackage.iw;
import defpackage.kt;
import defpackage.mb;
import defpackage.vd;
import defpackage.vl;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppCompatTextView extends TextView {
    private final hs a;
    private final it b;
    private boolean c;
    private is d;
    private iu e;
    private afr f;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.e = null;
        mb.d(this, getContext());
        hs hsVar = new hs(this);
        this.a = hsVar;
        hsVar.b(attributeSet, i);
        it itVar = new it(this);
        this.b = itVar;
        itVar.c(attributeSet, i);
        itVar.a();
        a().r(attributeSet, i);
    }

    private final afr a() {
        afr afrVar = this.f;
        if (afrVar != null) {
            return afrVar;
        }
        afr afrVar2 = new afr(this);
        this.f = afrVar2;
        return afrVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.a();
        }
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    final is g() {
        is isVar = this.d;
        if (isVar != null) {
            return isVar;
        }
        is isVar2 = new is(this, new be(this, 8));
        this.d = isVar2;
        return isVar2;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        zy.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return g().b;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return g().a;
    }

    final iu l() {
        if (this.e == null) {
            this.e = Build.VERSION.SDK_INT >= 34 ? new iw(this) : new iv(this);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        it.f(this, onCreateInputConnection, editorInfo);
        kt.u(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        acv acvVar = acv.a;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? e.f(context, i) : null, i2 != 0 ? e.f(context, i2) : null, i3 != 0 ? e.f(context, i3) : null, i4 != 0 ? e.f(context, i4) : null);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? e.f(context, i) : null, i2 != 0 ? e.f(context, i2) : null, i3 != 0 ? e.f(context, i3) : null, i4 != 0 ? e.f(context, i4) : null);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        acv acvVar = acv.a;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        l().a(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return g().b(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        l().b(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            l().c(i, f);
        } else {
            zy.c(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        it itVar = this.b;
        if (itVar != null) {
            itVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            vl vlVar = vd.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface = Typeface.create(typeface, i);
        }
        this.c = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        zy.b(this, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        g().a(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
