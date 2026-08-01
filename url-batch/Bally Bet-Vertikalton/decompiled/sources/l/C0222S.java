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
import j.C0140c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0149d;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222S extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0255q f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2905b;

    /* renamed from: c, reason: collision with root package name */
    public final C0214J f2906c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2907e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0221Q f2908f;

    /* renamed from: g, reason: collision with root package name */
    public int f2909g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0222S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.skydrop.fallring.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f1943u;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, com.skydrop.fallring.R.attr.spinnerStyle);
        this.f2904a = new C0255q(this);
        TypedArray typedArray2 = (TypedArray) r2.f432c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2905b = new C0140c(context, resourceId);
        } else {
            this.f2905b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.skydrop.fallring.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0216L dialogInterfaceOnClickListenerC0216L = new DialogInterfaceOnClickListenerC0216L(this);
            this.f2908f = dialogInterfaceOnClickListenerC0216L;
            dialogInterfaceOnClickListenerC0216L.f2880c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0219O c0219o = new C0219O(this, this.f2905b, attributeSet);
            C0012l r3 = C0012l.r(this.f2905b, attributeSet, iArr, com.skydrop.fallring.R.attr.spinnerStyle);
            this.f2909g = ((TypedArray) r3.f432c).getLayoutDimension(3, -2);
            c0219o.k(r3.h(1));
            c0219o.f2893C = typedArray2.getString(2);
            r3.t();
            this.f2908f = c0219o;
            this.f2906c = new C0214J(this, this, c0219o);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.skydrop.fallring.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2907e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2904a.d(attributeSet, com.skydrop.fallring.R.attr.spinnerStyle);
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
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            c0255q.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        return interfaceC0221Q != null ? interfaceC0221Q.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        return interfaceC0221Q != null ? interfaceC0221Q.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2908f != null ? this.f2909g : super.getDropDownWidth();
    }

    public final InterfaceC0221Q getInternalPopup() {
        return this.f2908f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        return interfaceC0221Q != null ? interfaceC0221Q.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2905b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        return interfaceC0221Q != null ? interfaceC0221Q.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            return c0255q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            return c0255q.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q == null || !interfaceC0221Q.a()) {
            return;
        }
        interfaceC0221Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2908f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0220P c0220p = (C0220P) parcelable;
        super.onRestoreInstanceState(c0220p.getSuperState());
        if (!c0220p.f2897a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0149d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0220P c0220p = new C0220P(super.onSaveInstanceState());
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        c0220p.f2897a = interfaceC0221Q != null && interfaceC0221Q.a();
        return c0220p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0214J c0214j = this.f2906c;
        if (c0214j == null || !c0214j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q == null) {
            return super.performClick();
        }
        if (interfaceC0221Q.a()) {
            return true;
        }
        this.f2908f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            c0255q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            c0255q.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0221Q.o(i2);
            interfaceC0221Q.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q != null) {
            interfaceC0221Q.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2908f != null) {
            this.f2909g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q != null) {
            interfaceC0221Q.k(drawable);
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
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q != null) {
            interfaceC0221Q.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            c0255q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0255q c0255q = this.f2904a;
        if (c0255q != null) {
            c0255q.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2907e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0221Q interfaceC0221Q = this.f2908f;
        if (interfaceC0221Q != null) {
            Context context = this.f2905b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0217M c0217m = new C0217M();
            c0217m.f2883a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0217m.f2884b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0215K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0221Q.n(c0217m);
        }
    }
}
