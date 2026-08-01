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
import j.C0142c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0152d;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0236p f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2850b;

    /* renamed from: c, reason: collision with root package name */
    public final C0196I f2851c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2852e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0203P f2853f;

    /* renamed from: g, reason: collision with root package name */
    public int f2854g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0204Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playgen.securelock.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f2007u;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, com.playgen.securelock.R.attr.spinnerStyle);
        this.f2849a = new C0236p(this);
        TypedArray typedArray2 = (TypedArray) r2.f423c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2850b = new C0142c(context, resourceId);
        } else {
            this.f2850b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.playgen.securelock.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0198K dialogInterfaceOnClickListenerC0198K = new DialogInterfaceOnClickListenerC0198K(this);
            this.f2853f = dialogInterfaceOnClickListenerC0198K;
            dialogInterfaceOnClickListenerC0198K.f2821c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0201N c0201n = new C0201N(this, this.f2850b, attributeSet);
            C0011l r3 = C0011l.r(this.f2850b, attributeSet, iArr, com.playgen.securelock.R.attr.spinnerStyle);
            this.f2854g = ((TypedArray) r3.f423c).getLayoutDimension(3, -2);
            c0201n.k(r3.h(1));
            c0201n.f2832C = typedArray2.getString(2);
            r3.t();
            this.f2853f = c0201n;
            this.f2851c = new C0196I(this, this, c0201n);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.playgen.securelock.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2852e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2849a.d(attributeSet, com.playgen.securelock.R.attr.spinnerStyle);
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
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            c0236p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        return interfaceC0203P != null ? interfaceC0203P.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        return interfaceC0203P != null ? interfaceC0203P.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2853f != null ? this.f2854g : super.getDropDownWidth();
    }

    public final InterfaceC0203P getInternalPopup() {
        return this.f2853f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        return interfaceC0203P != null ? interfaceC0203P.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2850b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        return interfaceC0203P != null ? interfaceC0203P.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            return c0236p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            return c0236p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P == null || !interfaceC0203P.a()) {
            return;
        }
        interfaceC0203P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2853f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0202O c0202o = (C0202O) parcelable;
        super.onRestoreInstanceState(c0202o.getSuperState());
        if (!c0202o.f2842a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0152d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0202O c0202o = new C0202O(super.onSaveInstanceState());
        InterfaceC0203P interfaceC0203P = this.f2853f;
        c0202o.f2842a = interfaceC0203P != null && interfaceC0203P.a();
        return c0202o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0196I c0196i = this.f2851c;
        if (c0196i == null || !c0196i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P == null) {
            return super.performClick();
        }
        if (interfaceC0203P.a()) {
            return true;
        }
        this.f2853f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            c0236p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            c0236p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0203P.o(i2);
            interfaceC0203P.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P != null) {
            interfaceC0203P.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2853f != null) {
            this.f2854g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P != null) {
            interfaceC0203P.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(u1.d.G(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P != null) {
            interfaceC0203P.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            c0236p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236p c0236p = this.f2849a;
        if (c0236p != null) {
            c0236p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2852e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0203P interfaceC0203P = this.f2853f;
        if (interfaceC0203P != null) {
            Context context = this.f2850b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0199L c0199l = new C0199L();
            c0199l.f2826a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0199l.f2827b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0197J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0203P.n(c0199l);
        }
    }
}
