package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class q5 extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};
    public final y1 f;
    public final Context g;
    public final g5 h;
    public SpinnerAdapter i;
    public final boolean j;
    public final p5 k;
    public int l;
    public final Rect m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.m = new Rect();
        z80.a(this, getContext());
        int[] iArr = z00.u;
        k6 z = k6.z(com.moontiko.really.admiralcasino.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) z.g;
        this.f = new y1(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.g = new ke(context, resourceId);
        } else {
            this.g = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, n, com.moontiko.really.admiralcasino.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
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
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            j5 j5Var = new j5(this);
            this.k = j5Var;
            j5Var.h = typedArray2.getString(2);
        } else if (i == 1) {
            n5 n5Var = new n5(this, this.g, attributeSet);
            k6 z2 = k6.z(com.moontiko.really.admiralcasino.R.attr.spinnerStyle, 0, this.g, attributeSet, iArr);
            this.l = ((TypedArray) z2.g).getLayoutDimension(3, -2);
            n5Var.g(z2.o(1));
            n5Var.H = typedArray2.getString(2);
            z2.B();
            this.k = n5Var;
            this.h = new g5(this, this, n5Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.moontiko.really.admiralcasino.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        z.B();
        this.j = true;
        SpinnerAdapter spinnerAdapter = this.i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.i = null;
        }
        this.f.l(attributeSet, com.moontiko.really.admiralcasino.R.attr.spinnerStyle);
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
        int i2 = 0;
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
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.m;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        p5 p5Var = this.k;
        return p5Var != null ? p5Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        p5 p5Var = this.k;
        return p5Var != null ? p5Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.k != null ? this.l : super.getDropDownWidth();
    }

    public final p5 getInternalPopup() {
        return this.k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        p5 p5Var = this.k;
        return p5Var != null ? p5Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        p5 p5Var = this.k;
        return p5Var != null ? p5Var.p() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.k;
        if (p5Var == null || !p5Var.b()) {
            return;
        }
        p5Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o5 o5Var = (o5) parcelable;
        super.onRestoreInstanceState(o5Var.getSuperState());
        if (!o5Var.f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new h5(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        o5 o5Var = new o5(super.onSaveInstanceState());
        p5 p5Var = this.k;
        o5Var.f = p5Var != null && p5Var.b();
        return o5Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g5 g5Var = this.h;
        if (g5Var == null || !g5Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        p5 p5Var = this.k;
        if (p5Var == null) {
            return super.performClick();
        }
        if (p5Var.b()) {
            return true;
        }
        p5Var.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p5 p5Var = this.k;
        if (p5Var != null) {
            Context context = this.g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            k5 k5Var = new k5();
            k5Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                k5Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                i5.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p5Var.q(k5Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        p5 p5Var = this.k;
        if (p5Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            p5Var.l(i);
            p5Var.m(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        p5 p5Var = this.k;
        if (p5Var != null) {
            p5Var.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.k != null) {
            this.l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p5 p5Var = this.k;
        if (p5Var != null) {
            p5Var.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(mz.m(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        p5 p5Var = this.k;
        if (p5Var != null) {
            p5Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }
}
