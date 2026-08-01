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
import k.ViewTreeObserverOnGlobalLayoutListenerC0193d;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249S extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0280p f3293a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3294b;

    /* renamed from: c, reason: collision with root package name */
    public final C0241J f3295c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f3296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3297e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0248Q f3298f;

    /* renamed from: g, reason: collision with root package name */
    public int f3299g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0249S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckyarcade.spinthrow.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f2409u;
        T.r r2 = T.r.r(context, attributeSet, iArr, com.luckyarcade.spinthrow.R.attr.spinnerStyle);
        this.f3293a = new C0280p(this);
        TypedArray typedArray2 = (TypedArray) r2.f812c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3294b = new j.d(context, resourceId);
        } else {
            this.f3294b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.luckyarcade.spinthrow.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0243L dialogInterfaceOnClickListenerC0243L = new DialogInterfaceOnClickListenerC0243L(this);
            this.f3298f = dialogInterfaceOnClickListenerC0243L;
            dialogInterfaceOnClickListenerC0243L.f3266c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0246O c0246o = new C0246O(this, this.f3294b, attributeSet);
            T.r r3 = T.r.r(this.f3294b, attributeSet, iArr, com.luckyarcade.spinthrow.R.attr.spinnerStyle);
            this.f3299g = ((TypedArray) r3.f812c).getLayoutDimension(3, -2);
            c0246o.k(r3.h(1));
            c0246o.f3281C = typedArray2.getString(2);
            r3.t();
            this.f3298f = c0246o;
            this.f3295c = new C0241J(this, this, c0246o);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.luckyarcade.spinthrow.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f3297e = true;
        SpinnerAdapter spinnerAdapter = this.f3296d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f3296d = null;
        }
        this.f3293a.d(attributeSet, com.luckyarcade.spinthrow.R.attr.spinnerStyle);
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
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            c0280p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        return interfaceC0248Q != null ? interfaceC0248Q.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        return interfaceC0248Q != null ? interfaceC0248Q.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3298f != null ? this.f3299g : super.getDropDownWidth();
    }

    public final InterfaceC0248Q getInternalPopup() {
        return this.f3298f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        return interfaceC0248Q != null ? interfaceC0248Q.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3294b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        return interfaceC0248Q != null ? interfaceC0248Q.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            return c0280p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            return c0280p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q == null || !interfaceC0248Q.a()) {
            return;
        }
        interfaceC0248Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3298f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0247P c0247p = (C0247P) parcelable;
        super.onRestoreInstanceState(c0247p.getSuperState());
        if (!c0247p.f3285a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0193d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0247P c0247p = new C0247P(super.onSaveInstanceState());
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        c0247p.f3285a = interfaceC0248Q != null && interfaceC0248Q.a();
        return c0247p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0241J c0241j = this.f3295c;
        if (c0241j == null || !c0241j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q == null) {
            return super.performClick();
        }
        if (interfaceC0248Q.a()) {
            return true;
        }
        this.f3298f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            c0280p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            c0280p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0248Q.o(i2);
            interfaceC0248Q.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q != null) {
            interfaceC0248Q.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3298f != null) {
            this.f3299g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q != null) {
            interfaceC0248Q.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(q1.d.z(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q != null) {
            interfaceC0248Q.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            c0280p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280p c0280p = this.f3293a;
        if (c0280p != null) {
            c0280p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3297e) {
            this.f3296d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0248Q interfaceC0248Q = this.f3298f;
        if (interfaceC0248Q != null) {
            Context context = this.f3294b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0244M c0244m = new C0244M();
            c0244m.f3270a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0244m.f3271b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0242K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0248Q.n(c0244m);
        }
    }
}
