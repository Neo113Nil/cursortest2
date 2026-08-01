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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r0 extends Spinner {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2424n = {R.attr.spinnerMode};

    /* renamed from: f, reason: collision with root package name */
    public final f1.b f2425f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2426g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f2427h;
    public SpinnerAdapter i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2428j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f2429k;

    /* renamed from: l, reason: collision with root package name */
    public int f2430l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2431m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f2431m = new Rect();
        r2.a(this, getContext());
        int[] iArr = f.a.f1258u;
        androidx.emoji2.text.t w3 = androidx.emoji2.text.t.w(context, attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) w3.f356c;
        this.f2425f = new f1.b(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2426g = new j.c(context, resourceId);
        } else {
            this.f2426g = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f2424n, com.oriondriftchasers.arordrft.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
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
        if (i == 0) {
            k0 k0Var = new k0(this);
            this.f2429k = k0Var;
            k0Var.f2358h = typedArray2.getString(2);
        } else if (i == 1) {
            o0 o0Var = new o0(this, this.f2426g, attributeSet);
            androidx.emoji2.text.t w4 = androidx.emoji2.text.t.w(this.f2426g, attributeSet, iArr, com.oriondriftchasers.arordrft.R.attr.spinnerStyle);
            this.f2430l = ((TypedArray) w4.f356c).getLayoutDimension(3, -2);
            o0Var.m(w4.n(1));
            o0Var.H = typedArray2.getString(2);
            w4.y();
            this.f2429k = o0Var;
            this.f2427h = new i0(this, this, o0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.oriondriftchasers.arordrft.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        w3.y();
        this.f2428j = true;
        SpinnerAdapter spinnerAdapter = this.i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.i = null;
        }
        this.f2425f.k(attributeSet, com.oriondriftchasers.arordrft.R.attr.spinnerStyle);
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
        Rect rect = this.f2431m;
        drawable.getPadding(rect);
        return rect.left + rect.right + i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.f2429k;
        return q0Var != null ? q0Var.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.f2429k;
        return q0Var != null ? q0Var.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2429k != null ? this.f2430l : super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.f2429k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        q0 q0Var = this.f2429k;
        return q0Var != null ? q0Var.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2426g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        q0 q0Var = this.f2429k;
        return q0Var != null ? q0Var.i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.f2429k;
        if (q0Var == null || !q0Var.b()) {
            return;
        }
        q0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f2429k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (!p0Var.f2415f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new k.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        p0 p0Var = new p0(super.onSaveInstanceState());
        q0 q0Var = this.f2429k;
        p0Var.f2415f = q0Var != null && q0Var.b();
        return p0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f2427h;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        q0 q0Var = this.f2429k;
        if (q0Var == null) {
            return super.performClick();
        }
        if (q0Var.b()) {
            return true;
        }
        q0Var.e(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        q0 q0Var = this.f2429k;
        if (q0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            q0Var.p(i);
            q0Var.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        q0 q0Var = this.f2429k;
        if (q0Var != null) {
            q0Var.n(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2429k != null) {
            this.f2430l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.f2429k;
        if (q0Var != null) {
            q0Var.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(h.a.x(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.f2429k;
        if (q0Var != null) {
            q0Var.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f1.b bVar = this.f2425f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2428j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        q0 q0Var = this.f2429k;
        if (q0Var != null) {
            Context context = this.f2426g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            l0 l0Var = new l0();
            l0Var.f2379a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                l0Var.f2380b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                j0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q0Var.o(l0Var);
        }
    }
}
