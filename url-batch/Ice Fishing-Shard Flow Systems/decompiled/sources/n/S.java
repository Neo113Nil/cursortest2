package n;

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
import h.AbstractC0454a;
import l.C0649e;
import m.ViewTreeObserverOnGlobalLayoutListenerC0679d;

/* loaded from: classes.dex */
public final class S extends Spinner {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f6698q = {R.attr.spinnerMode};

    /* renamed from: d, reason: collision with root package name */
    public final C0726o f6699d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6700e;

    /* renamed from: i, reason: collision with root package name */
    public final G f6701i;

    /* renamed from: l, reason: collision with root package name */
    public SpinnerAdapter f6702l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6703m;

    /* renamed from: n, reason: collision with root package name */
    public final Q f6704n;

    /* renamed from: o, reason: collision with root package name */
    public int f6705o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f6706p;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f6706p = new Rect();
        i1.a(this, getContext());
        int[] iArr = AbstractC0454a.f5057v;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, com.icefishing.icefish.ice.fishing.s294s.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) R4.f331i;
        this.f6699d = new C0726o(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f6700e = new C0649e(context, resourceId);
        } else {
            this.f6700e = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f6698q, com.icefishing.icefish.ice.fishing.s294s.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i2 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e7) {
                    e = e7;
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
        } catch (Exception e8) {
            e = e8;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 == 0) {
            K k7 = new K(this);
            this.f6704n = k7;
            k7.f6670i = typedArray2.getString(2);
        } else if (i2 == 1) {
            O o7 = new O(this, this.f6700e, attributeSet);
            D0.j R7 = D0.j.R(this.f6700e, attributeSet, iArr, com.icefishing.icefish.ice.fishing.s294s.R.attr.spinnerStyle);
            this.f6705o = ((TypedArray) R7.f331i).getLayoutDimension(3, -2);
            o7.h(R7.J(1));
            o7.f6682J = typedArray2.getString(2);
            R7.W();
            this.f6704n = o7;
            this.f6701i = new G(this, this, o7);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.icefishing.icefish.ice.fishing.s294s.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        R4.W();
        this.f6703m = true;
        SpinnerAdapter spinnerAdapter = this.f6702l;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f6702l = null;
        }
        this.f6699d.d(attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
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
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
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
        Rect rect = this.f6706p;
        drawable.getPadding(rect);
        return rect.left + rect.right + i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            c0726o.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        Q q4 = this.f6704n;
        return q4 != null ? q4.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        Q q4 = this.f6704n;
        return q4 != null ? q4.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f6704n != null ? this.f6705o : super.getDropDownWidth();
    }

    public final Q getInternalPopup() {
        return this.f6704n;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        Q q4 = this.f6704n;
        return q4 != null ? q4.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f6700e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        Q q4 = this.f6704n;
        return q4 != null ? q4.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q q4 = this.f6704n;
        if (q4 == null || !q4.b()) {
            return;
        }
        q4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        if (this.f6704n == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        P p7 = (P) parcelable;
        super.onRestoreInstanceState(p7.getSuperState());
        if (!p7.f6689d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0679d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        P p7 = new P(super.onSaveInstanceState());
        Q q4 = this.f6704n;
        p7.f6689d = q4 != null && q4.b();
        return p7;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        G g7 = this.f6701i;
        if (g7 == null || !g7.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        Q q4 = this.f6704n;
        if (q4 == null) {
            return super.performClick();
        }
        if (q4.b()) {
            return true;
        }
        this.f6704n.l(I.b(this), I.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        Q q4 = this.f6704n;
        if (q4 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            q4.j(i2);
            q4.k(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        Q q4 = this.f6704n;
        if (q4 != null) {
            q4.i(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f6704n != null) {
            this.f6705o = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        Q q4 = this.f6704n;
        if (q4 != null) {
            q4.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(O6.g.M(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        Q q4 = this.f6704n;
        if (q4 != null) {
            q4.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6699d;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6703m) {
            this.f6702l = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        Q q4 = this.f6704n;
        if (q4 != null) {
            Context context = this.f6700e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            L l7 = new L();
            l7.f6672d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                l7.f6673e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q4.p(l7);
        }
    }
}
