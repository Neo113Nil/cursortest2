package l;

import K.C0011l;
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

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196P extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f2883a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2884b;

    /* renamed from: c, reason: collision with root package name */
    public final C0188H f2885c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2886e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0195O f2887f;

    /* renamed from: g, reason: collision with root package name */
    public int f2888g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0196P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.glasspulse.glasspulse.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        Q0.a(this, getContext());
        int[] iArr = f.a.f2049u;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, com.glasspulse.glasspulse.R.attr.spinnerStyle);
        this.f2883a = new C0229p(this);
        TypedArray typedArray2 = (TypedArray) r2.f405c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2884b = new C0139c(context, resourceId);
        } else {
            this.f2884b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.glasspulse.glasspulse.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0190J dialogInterfaceOnClickListenerC0190J = new DialogInterfaceOnClickListenerC0190J(this);
            this.f2887f = dialogInterfaceOnClickListenerC0190J;
            dialogInterfaceOnClickListenerC0190J.f2859c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0193M c0193m = new C0193M(this, this.f2884b, attributeSet);
            C0011l r3 = C0011l.r(this.f2884b, attributeSet, iArr, com.glasspulse.glasspulse.R.attr.spinnerStyle);
            this.f2888g = ((TypedArray) r3.f405c).getLayoutDimension(3, -2);
            c0193m.k(r3.h(1));
            c0193m.f2872C = typedArray2.getString(2);
            r3.t();
            this.f2887f = c0193m;
            this.f2885c = new C0188H(this, this, c0193m);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.glasspulse.glasspulse.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2886e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2883a.d(attributeSet, com.glasspulse.glasspulse.R.attr.spinnerStyle);
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
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            c0229p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        return interfaceC0195O != null ? interfaceC0195O.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        return interfaceC0195O != null ? interfaceC0195O.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2887f != null ? this.f2888g : super.getDropDownWidth();
    }

    public final InterfaceC0195O getInternalPopup() {
        return this.f2887f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        return interfaceC0195O != null ? interfaceC0195O.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2884b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        return interfaceC0195O != null ? interfaceC0195O.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O == null || !interfaceC0195O.a()) {
            return;
        }
        interfaceC0195O.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2887f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0194N c0194n = (C0194N) parcelable;
        super.onRestoreInstanceState(c0194n.getSuperState());
        if (!c0194n.f2876a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0148d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0194N c0194n = new C0194N(super.onSaveInstanceState());
        InterfaceC0195O interfaceC0195O = this.f2887f;
        c0194n.f2876a = interfaceC0195O != null && interfaceC0195O.a();
        return c0194n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0188H c0188h = this.f2885c;
        if (c0188h == null || !c0188h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O == null) {
            return super.performClick();
        }
        if (interfaceC0195O.a()) {
            return true;
        }
        this.f2887f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            c0229p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0195O.o(i2);
            interfaceC0195O.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O != null) {
            interfaceC0195O.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2887f != null) {
            this.f2888g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O != null) {
            interfaceC0195O.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(u1.d.D(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O != null) {
            interfaceC0195O.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f2883a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2886e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0195O interfaceC0195O = this.f2887f;
        if (interfaceC0195O != null) {
            Context context = this.f2884b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0191K c0191k = new C0191K();
            c0191k.f2862a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0191k.f2863b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0189I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0195O.n(c0191k);
        }
    }
}
