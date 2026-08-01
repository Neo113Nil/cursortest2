package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o0 extends Spinner {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2514n = {R.attr.spinnerMode};

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2515f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2516g;
    public final f0 h;
    public SpinnerAdapter i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2517j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f2518k;

    /* renamed from: l, reason: collision with root package name */
    public int f2519l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2520m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gdmhkmf.belbet.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f2520m = new Rect();
        o2.a(this, getContext());
        int[] iArr = f.a.f1407u;
        androidx.emoji2.text.t i = androidx.emoji2.text.t.i(com.gdmhkmf.belbet.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) i.f473b;
        this.f2515f = new com.google.android.material.datepicker.c(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2516g = new j.c(context, resourceId);
        } else {
            this.f2516g = context;
        }
        int i4 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f2514n, com.gdmhkmf.belbet.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i4 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e4) {
                    e = e4;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i4 == 0) {
            h0 h0Var = new h0(this);
            this.f2518k = h0Var;
            h0Var.h = typedArray2.getString(2);
        } else if (i4 == 1) {
            l0 l0Var = new l0(this, this.f2516g, attributeSet);
            androidx.emoji2.text.t i5 = androidx.emoji2.text.t.i(com.gdmhkmf.belbet.R.attr.spinnerStyle, 0, this.f2516g, attributeSet, iArr);
            this.f2519l = ((TypedArray) i5.f473b).getLayoutDimension(3, -2);
            l0Var.i(i5.d(1));
            l0Var.H = typedArray2.getString(2);
            i5.k();
            this.f2518k = l0Var;
            this.h = new f0(this, this, l0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.gdmhkmf.belbet.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i.k();
        this.f2517j = true;
        SpinnerAdapter spinnerAdapter = this.i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.i = null;
        }
        this.f2515f.m(attributeSet, com.gdmhkmf.belbet.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i4 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i4;
        }
        Rect rect = this.f2520m;
        drawable.getPadding(rect);
        return rect.left + rect.right + i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        n0 n0Var = this.f2518k;
        return n0Var != null ? n0Var.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        n0 n0Var = this.f2518k;
        return n0Var != null ? n0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2518k != null ? this.f2519l : super.getDropDownWidth();
    }

    public final n0 getInternalPopup() {
        return this.f2518k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        n0 n0Var = this.f2518k;
        return n0Var != null ? n0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2516g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        n0 n0Var = this.f2518k;
        return n0Var != null ? n0Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n0 n0Var = this.f2518k;
        if (n0Var == null || !n0Var.b()) {
            return;
        }
        n0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f2518k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        m0 m0Var = (m0) parcelable;
        super.onRestoreInstanceState(m0Var.getSuperState());
        if (!m0Var.f2507f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new k.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        m0 m0Var = new m0(super.onSaveInstanceState());
        n0 n0Var = this.f2518k;
        m0Var.f2507f = n0Var != null && n0Var.b();
        return m0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.h;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        n0 n0Var = this.f2518k;
        if (n0Var == null) {
            return super.performClick();
        }
        if (n0Var.b()) {
            return true;
        }
        n0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            cVar.p(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        n0 n0Var = this.f2518k;
        if (n0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            n0Var.k(i);
            n0Var.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        n0 n0Var = this.f2518k;
        if (n0Var != null) {
            n0Var.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2518k != null) {
            this.f2519l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        n0 n0Var = this.f2518k;
        if (n0Var != null) {
            n0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(b4.d.y(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        n0 n0Var = this.f2518k;
        if (n0Var != null) {
            n0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2515f;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2517j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        n0 n0Var = this.f2518k;
        if (n0Var != null) {
            Context context = this.f2516g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            i0 i0Var = new i0();
            i0Var.f2460a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                i0Var.f2461b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                g0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n0Var.p(i0Var);
        }
    }
}
