package l;

import K.C0012l;
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
import j.C0139c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0148d;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221S extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0254q f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final C0213J f2901c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2902e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0220Q f2903f;

    /* renamed from: g, reason: collision with root package name */
    public int f2904g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0221S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.molarmass.wincalc.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f1938u;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, com.molarmass.wincalc.R.attr.spinnerStyle);
        this.f2899a = new C0254q(this);
        TypedArray typedArray2 = (TypedArray) r2.f432c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2900b = new C0139c(context, resourceId);
        } else {
            this.f2900b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.molarmass.wincalc.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i2 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
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
        } catch (Exception e3) {
            e = e3;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 == 0) {
            DialogInterfaceOnClickListenerC0215L dialogInterfaceOnClickListenerC0215L = new DialogInterfaceOnClickListenerC0215L(this);
            this.f2903f = dialogInterfaceOnClickListenerC0215L;
            dialogInterfaceOnClickListenerC0215L.f2875c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0218O c0218o = new C0218O(this, this.f2900b, attributeSet);
            C0012l r3 = C0012l.r(this.f2900b, attributeSet, iArr, com.molarmass.wincalc.R.attr.spinnerStyle);
            this.f2904g = ((TypedArray) r3.f432c).getLayoutDimension(3, -2);
            c0218o.k(r3.h(1));
            c0218o.f2888C = typedArray2.getString(2);
            r3.t();
            this.f2903f = c0218o;
            this.f2901c = new C0213J(this, this, c0218o);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.molarmass.wincalc.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2902e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2899a.d(attributeSet, com.molarmass.wincalc.R.attr.spinnerStyle);
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
        int i3 = 0;
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
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            c0254q.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        return interfaceC0220Q != null ? interfaceC0220Q.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        return interfaceC0220Q != null ? interfaceC0220Q.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2903f != null ? this.f2904g : super.getDropDownWidth();
    }

    public final InterfaceC0220Q getInternalPopup() {
        return this.f2903f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        return interfaceC0220Q != null ? interfaceC0220Q.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2900b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        return interfaceC0220Q != null ? interfaceC0220Q.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q == null || !interfaceC0220Q.a()) {
            return;
        }
        interfaceC0220Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2903f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0219P c0219p = (C0219P) parcelable;
        super.onRestoreInstanceState(c0219p.getSuperState());
        if (!c0219p.f2892a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0148d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0219P c0219p = new C0219P(super.onSaveInstanceState());
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        c0219p.f2892a = interfaceC0220Q != null && interfaceC0220Q.a();
        return c0219p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0213J c0213j = this.f2901c;
        if (c0213j == null || !c0213j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q == null) {
            return super.performClick();
        }
        if (interfaceC0220Q.a()) {
            return true;
        }
        this.f2903f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            c0254q.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0220Q.p(i2);
            interfaceC0220Q.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q != null) {
            interfaceC0220Q.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2903f != null) {
            this.f2904g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q != null) {
            interfaceC0220Q.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(q1.l.v(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q != null) {
            interfaceC0220Q.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f2899a;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2902e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0220Q interfaceC0220Q = this.f2903f;
        if (interfaceC0220Q != null) {
            Context context = this.f2900b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0216M c0216m = new C0216M();
            c0216m.f2878a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0216m.f2879b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0214K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0220Q.n(c0216m);
        }
    }
}
