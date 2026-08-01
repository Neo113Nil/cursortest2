package l;

import K.C0014l;
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
import g0.C0116b;
import j.C0144c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0155d;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193P extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0116b f2841a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2842b;

    /* renamed from: c, reason: collision with root package name */
    public final C0185H f2843c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2844e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0192O f2845f;

    /* renamed from: g, reason: collision with root package name */
    public int f2846g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0193P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playbag.tripgear.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        R0.a(this, getContext());
        int[] iArr = f.a.f2072u;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, com.playbag.tripgear.R.attr.spinnerStyle);
        this.f2841a = new C0116b(this);
        TypedArray typedArray2 = (TypedArray) i2.f475b;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2842b = new C0144c(context, resourceId);
        } else {
            this.f2842b = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.playbag.tripgear.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i3 = typedArray.getInt(0, 0);
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
        if (i3 == 0) {
            DialogInterfaceOnClickListenerC0187J dialogInterfaceOnClickListenerC0187J = new DialogInterfaceOnClickListenerC0187J(this);
            this.f2845f = dialogInterfaceOnClickListenerC0187J;
            dialogInterfaceOnClickListenerC0187J.f2813c = typedArray2.getString(2);
        } else if (i3 == 1) {
            C0190M c0190m = new C0190M(this, this.f2842b, attributeSet);
            C0014l i4 = C0014l.i(this.f2842b, attributeSet, iArr, com.playbag.tripgear.R.attr.spinnerStyle);
            this.f2846g = ((TypedArray) i4.f475b).getLayoutDimension(3, -2);
            c0190m.k(i4.c(1));
            c0190m.f2824C = typedArray2.getString(2);
            i4.k();
            this.f2845f = c0190m;
            this.f2843c = new C0185H(this, this, c0190m);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.playbag.tripgear.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i2.k();
        this.f2844e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2841a.k(attributeSet, com.playbag.tripgear.R.attr.spinnerStyle);
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
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            c0116b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        return interfaceC0192O != null ? interfaceC0192O.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        return interfaceC0192O != null ? interfaceC0192O.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2845f != null ? this.f2846g : super.getDropDownWidth();
    }

    public final InterfaceC0192O getInternalPopup() {
        return this.f2845f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        return interfaceC0192O != null ? interfaceC0192O.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2842b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        return interfaceC0192O != null ? interfaceC0192O.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O == null || !interfaceC0192O.a()) {
            return;
        }
        interfaceC0192O.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2845f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0191N c0191n = (C0191N) parcelable;
        super.onRestoreInstanceState(c0191n.getSuperState());
        if (!c0191n.f2834a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0155d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0191N c0191n = new C0191N(super.onSaveInstanceState());
        InterfaceC0192O interfaceC0192O = this.f2845f;
        c0191n.f2834a = interfaceC0192O != null && interfaceC0192O.a();
        return c0191n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0185H c0185h = this.f2843c;
        if (c0185h == null || !c0185h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O == null) {
            return super.performClick();
        }
        if (interfaceC0192O.a()) {
            return true;
        }
        this.f2845f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            c0116b.n(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0192O.o(i2);
            interfaceC0192O.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O != null) {
            interfaceC0192O.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2845f != null) {
            this.f2846g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O != null) {
            interfaceC0192O.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(w1.l.z(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O != null) {
            interfaceC0192O.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f2841a;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2844e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0192O interfaceC0192O = this.f2845f;
        if (interfaceC0192O != null) {
            Context context = this.f2842b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0188K c0188k = new C0188K();
            c0188k.f2818a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0188k.f2819b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0186I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0192O.n(c0188k);
        }
    }
}
