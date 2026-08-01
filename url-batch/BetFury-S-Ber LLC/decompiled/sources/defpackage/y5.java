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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y5 extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};
    public final f2 f;
    public final Context g;
    public final o5 h;
    public SpinnerAdapter i;
    public final boolean j;
    public final x5 k;
    public int l;
    public final Rect m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.trembin.nirefon.betfury.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.m = new Rect();
        yh0.a(this, getContext());
        int[] iArr = d70.v;
        s6 t = s6.t(com.trembin.nirefon.betfury.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) t.b;
        this.f = new f2(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.g = new cg(context, resourceId);
        } else {
            this.g = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, n, com.trembin.nirefon.betfury.R.attr.spinnerStyle, 0);
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
            r5 r5Var = new r5(this);
            this.k = r5Var;
            r5Var.h = typedArray2.getString(2);
        } else if (i == 1) {
            v5 v5Var = new v5(this, this.g, attributeSet);
            s6 t2 = s6.t(com.trembin.nirefon.betfury.R.attr.spinnerStyle, 0, this.g, attributeSet, iArr);
            this.l = ((TypedArray) t2.b).getLayoutDimension(3, -2);
            v5Var.g(t2.j(1));
            v5Var.H = typedArray2.getString(2);
            t2.v();
            this.k = v5Var;
            this.h = new o5(this, this, v5Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.trembin.nirefon.betfury.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        t.v();
        this.j = true;
        SpinnerAdapter spinnerAdapter = this.i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.i = null;
        }
        this.f.l(attributeSet, com.trembin.nirefon.betfury.R.attr.spinnerStyle);
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
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        x5 x5Var = this.k;
        return x5Var != null ? x5Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        x5 x5Var = this.k;
        return x5Var != null ? x5Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.k != null ? this.l : super.getDropDownWidth();
    }

    public final x5 getInternalPopup() {
        return this.k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        x5 x5Var = this.k;
        return x5Var != null ? x5Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        x5 x5Var = this.k;
        return x5Var != null ? x5Var.p() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x5 x5Var = this.k;
        if (x5Var == null || !x5Var.b()) {
            return;
        }
        x5Var.dismiss();
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
        w5 w5Var = (w5) parcelable;
        super.onRestoreInstanceState(w5Var.getSuperState());
        if (!w5Var.f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new p5(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        w5 w5Var = new w5(super.onSaveInstanceState());
        x5 x5Var = this.k;
        w5Var.f = x5Var != null && x5Var.b();
        return w5Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o5 o5Var = this.h;
        if (o5Var == null || !o5Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        x5 x5Var = this.k;
        if (x5Var == null) {
            return super.performClick();
        }
        if (x5Var.b()) {
            return true;
        }
        x5Var.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        x5 x5Var = this.k;
        if (x5Var != null) {
            Context context = this.g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            s5 s5Var = new s5();
            s5Var.f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                s5Var.g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                q5.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            x5Var.q(s5Var);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        x5 x5Var = this.k;
        if (x5Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            x5Var.l(i);
            x5Var.m(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        x5 x5Var = this.k;
        if (x5Var != null) {
            x5Var.k(i);
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
        x5 x5Var = this.k;
        if (x5Var != null) {
            x5Var.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(d50.v(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        x5 x5Var = this.k;
        if (x5Var != null) {
            x5Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
