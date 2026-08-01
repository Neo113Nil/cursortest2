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
import c1.AbstractC0091d;
import j.C0166c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0180d;
import u0.C0372k;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219P extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3321a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3322b;

    /* renamed from: c, reason: collision with root package name */
    public final C0211H f3323c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3324e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0218O f3325f;

    /* renamed from: g, reason: collision with root package name */
    public int f3326g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0219P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortunequest.neontrack.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        Q0.a(this, getContext());
        int[] iArr = f.a.f2531u;
        C0372k j2 = C0372k.j(context, attributeSet, iArr, com.fortunequest.neontrack.R.attr.spinnerStyle);
        this.f3321a = new C0252p(this);
        TypedArray typedArray2 = (TypedArray) j2.f4191b;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3322b = new C0166c(context, resourceId);
        } else {
            this.f3322b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.fortunequest.neontrack.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0213J dialogInterfaceOnClickListenerC0213J = new DialogInterfaceOnClickListenerC0213J(this);
            this.f3325f = dialogInterfaceOnClickListenerC0213J;
            dialogInterfaceOnClickListenerC0213J.f3297c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0216M c0216m = new C0216M(this, this.f3322b, attributeSet);
            C0372k j3 = C0372k.j(this.f3322b, attributeSet, iArr, com.fortunequest.neontrack.R.attr.spinnerStyle);
            this.f3326g = ((TypedArray) j3.f4191b).getLayoutDimension(3, -2);
            c0216m.k(j3.d(1));
            c0216m.f3310C = typedArray2.getString(2);
            j3.l();
            this.f3325f = c0216m;
            this.f3323c = new C0211H(this, this, c0216m);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.fortunequest.neontrack.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        j2.l();
        this.f3324e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f3321a.d(attributeSet, com.fortunequest.neontrack.R.attr.spinnerStyle);
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
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            c0252p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        return interfaceC0218O != null ? interfaceC0218O.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        return interfaceC0218O != null ? interfaceC0218O.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3325f != null ? this.f3326g : super.getDropDownWidth();
    }

    public final InterfaceC0218O getInternalPopup() {
        return this.f3325f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        return interfaceC0218O != null ? interfaceC0218O.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3322b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        return interfaceC0218O != null ? interfaceC0218O.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O == null || !interfaceC0218O.a()) {
            return;
        }
        interfaceC0218O.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3325f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0217N c0217n = (C0217N) parcelable;
        super.onRestoreInstanceState(c0217n.getSuperState());
        if (!c0217n.f3314a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0180d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0217N c0217n = new C0217N(super.onSaveInstanceState());
        InterfaceC0218O interfaceC0218O = this.f3325f;
        c0217n.f3314a = interfaceC0218O != null && interfaceC0218O.a();
        return c0217n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0211H c0211h = this.f3323c;
        if (c0211h == null || !c0211h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O == null) {
            return super.performClick();
        }
        if (interfaceC0218O.a()) {
            return true;
        }
        this.f3325f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            c0252p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0218O.p(i2);
            interfaceC0218O.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O != null) {
            interfaceC0218O.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3325f != null) {
            this.f3326g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O != null) {
            interfaceC0218O.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0091d.j(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O != null) {
            interfaceC0218O.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3321a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3324e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0218O interfaceC0218O = this.f3325f;
        if (interfaceC0218O != null) {
            Context context = this.f3322b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0214K c0214k = new C0214K();
            c0214k.f3300a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0214k.f3301b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0212I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0218O.o(c0214k);
        }
    }
}
