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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qg extends Spinner {
    public static final int[] u = {R.attr.spinnerMode};
    public final te m;
    public final Context n;
    public final gg o;
    public SpinnerAdapter p;
    public final boolean q;
    public final pg r;
    public int s;
    public final Rect t;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.majelw.libystne.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.t = new Rect();
        xw2.a(this, getContext());
        int[] iArr = b62.u;
        mh z = mh.z(context, attributeSet, iArr, com.majelw.libystne.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) z.n;
        this.m = new te(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.n = new n30(context, resourceId);
        } else {
            this.n = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, u, com.majelw.libystne.R.attr.spinnerStyle, 0);
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
            jg jgVar = new jg(this);
            this.r = jgVar;
            jgVar.o = typedArray2.getString(2);
        } else if (i == 1) {
            ng ngVar = new ng(this, this.n, attributeSet);
            mh z2 = mh.z(this.n, attributeSet, iArr, com.majelw.libystne.R.attr.spinnerStyle);
            this.s = ((TypedArray) z2.n).getLayoutDimension(3, -2);
            ngVar.g(z2.q(1));
            ngVar.N = typedArray2.getString(2);
            z2.B();
            this.r = ngVar;
            this.o = new gg(this, this, ngVar);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.majelw.libystne.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        z.B();
        this.q = true;
        SpinnerAdapter spinnerAdapter = this.p;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.p = null;
        }
        this.m.e(attributeSet, com.majelw.libystne.R.attr.spinnerStyle);
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
        Rect rect = this.t;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.m;
        if (teVar != null) {
            teVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        pg pgVar = this.r;
        return pgVar != null ? pgVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        pg pgVar = this.r;
        return pgVar != null ? pgVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.r != null ? this.s : super.getDropDownWidth();
    }

    public final pg getInternalPopup() {
        return this.r;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        pg pgVar = this.r;
        return pgVar != null ? pgVar.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.n;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        pg pgVar = this.r;
        return pgVar != null ? pgVar.o() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pg pgVar = this.r;
        if (pgVar == null || !pgVar.a()) {
            return;
        }
        pgVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        og ogVar = (og) parcelable;
        super.onRestoreInstanceState(ogVar.getSuperState());
        if (!ogVar.m || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new hg(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        og ogVar = new og(super.onSaveInstanceState());
        pg pgVar = this.r;
        ogVar.m = pgVar != null && pgVar.a();
        return ogVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gg ggVar = this.o;
        if (ggVar == null || !ggVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        pg pgVar = this.r;
        if (pgVar == null) {
            return super.performClick();
        }
        if (pgVar.a()) {
            return true;
        }
        pgVar.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.q) {
            this.p = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        pg pgVar = this.r;
        if (pgVar != null) {
            Context context = this.n;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            kg kgVar = new kg();
            kgVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                kgVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ig.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            pgVar.p(kgVar);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        pg pgVar = this.r;
        if (pgVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            pgVar.k(i);
            pgVar.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        pg pgVar = this.r;
        if (pgVar != null) {
            pgVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.r != null) {
            this.s = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        pg pgVar = this.r;
        if (pgVar != null) {
            pgVar.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(j8.F(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        pg pgVar = this.r;
        if (pgVar != null) {
            pgVar.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
