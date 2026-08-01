package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o0 extends Spinner {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2604n = {R.attr.spinnerMode};

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f2605f;
    public final Context g;
    public final g0 h;

    /* renamed from: i, reason: collision with root package name */
    public SpinnerAdapter f2606i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2607j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f2608k;

    /* renamed from: l, reason: collision with root package name */
    public int f2609l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2610m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f2610m = new Rect();
        o2.a(this, getContext());
        int[] iArr = e.a.f1512u;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(com.gglhk.bofio.fortunetiger.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) r3.c;
        this.f2605f = new b1.b(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.g = new i.c(context, resourceId);
        } else {
            this.g = context;
        }
        int i4 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f2604n, com.gglhk.bofio.fortunetiger.R.attr.spinnerStyle, 0);
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
            i0 i0Var = new i0(this);
            this.f2608k = i0Var;
            i0Var.h = typedArray2.getString(2);
        } else if (i4 == 1) {
            l0 l0Var = new l0(this, this.g, attributeSet);
            androidx.emoji2.text.s r4 = androidx.emoji2.text.s.r(com.gglhk.bofio.fortunetiger.R.attr.spinnerStyle, 0, this.g, attributeSet, iArr);
            this.f2609l = ((TypedArray) r4.c).getLayoutDimension(3, -2);
            l0Var.h(r4.i(1));
            l0Var.H = typedArray2.getString(2);
            r4.t();
            this.f2608k = l0Var;
            this.h = new g0(this, this, l0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.gglhk.bofio.fortunetiger.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r3.t();
        this.f2607j = true;
        SpinnerAdapter spinnerAdapter = this.f2606i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f2606i = null;
        }
        this.f2605f.l(attributeSet, com.gglhk.bofio.fortunetiger.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        Rect rect = this.f2610m;
        drawable.getPadding(rect);
        return rect.left + rect.right + i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        n0 n0Var = this.f2608k;
        return n0Var != null ? n0Var.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        n0 n0Var = this.f2608k;
        return n0Var != null ? n0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2608k != null ? this.f2609l : super.getDropDownWidth();
    }

    public final n0 getInternalPopup() {
        return this.f2608k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        n0 n0Var = this.f2608k;
        return n0Var != null ? n0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        n0 n0Var = this.f2608k;
        return n0Var != null ? n0Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n0 n0Var = this.f2608k;
        if (n0Var == null || !n0Var.b()) {
            return;
        }
        n0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f2608k == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        m0 m0Var = (m0) parcelable;
        super.onRestoreInstanceState(m0Var.getSuperState());
        if (!m0Var.f2600f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new j.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        m0 m0Var = new m0(super.onSaveInstanceState());
        n0 n0Var = this.f2608k;
        m0Var.f2600f = n0Var != null && n0Var.b();
        return m0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var = this.h;
        if (g0Var == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        n0 n0Var = this.f2608k;
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
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        n0 n0Var = this.f2608k;
        if (n0Var == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            n0Var.j(i4);
            n0Var.l(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        n0 n0Var = this.f2608k;
        if (n0Var != null) {
            n0Var.i(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f2608k != null) {
            this.f2609l = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        n0 n0Var = this.f2608k;
        if (n0Var != null) {
            n0Var.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(k3.m.w(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        n0 n0Var = this.f2608k;
        if (n0Var != null) {
            n0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.f2605f;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2607j) {
            this.f2606i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        n0 n0Var = this.f2608k;
        if (n0Var != null) {
            Context context = this.g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            j0 j0Var = new j0();
            j0Var.f2558a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                j0Var.f2559b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                h0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n0Var.p(j0Var);
        }
    }
}
