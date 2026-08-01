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
import j.C0140c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0149d;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202S extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0235q f2999a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3000b;

    /* renamed from: c, reason: collision with root package name */
    public final C0194J f3001c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3002e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0201Q f3003f;

    /* renamed from: g, reason: collision with root package name */
    public int f3004g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0202S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.visualfortune.eyerest.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f2006u;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, com.visualfortune.eyerest.R.attr.spinnerStyle);
        this.f2999a = new C0235q(this);
        TypedArray typedArray2 = (TypedArray) r2.f416c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3000b = new C0140c(context, resourceId);
        } else {
            this.f3000b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.visualfortune.eyerest.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0196L dialogInterfaceOnClickListenerC0196L = new DialogInterfaceOnClickListenerC0196L(this);
            this.f3003f = dialogInterfaceOnClickListenerC0196L;
            dialogInterfaceOnClickListenerC0196L.f2975c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0199O c0199o = new C0199O(this, this.f3000b, attributeSet);
            C0011l r3 = C0011l.r(this.f3000b, attributeSet, iArr, com.visualfortune.eyerest.R.attr.spinnerStyle);
            this.f3004g = ((TypedArray) r3.f416c).getLayoutDimension(3, -2);
            c0199o.k(r3.h(1));
            c0199o.f2988C = typedArray2.getString(2);
            r3.t();
            this.f3003f = c0199o;
            this.f3001c = new C0194J(this, this, c0199o);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.visualfortune.eyerest.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f3002e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2999a.d(attributeSet, com.visualfortune.eyerest.R.attr.spinnerStyle);
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
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            c0235q.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        return interfaceC0201Q != null ? interfaceC0201Q.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        return interfaceC0201Q != null ? interfaceC0201Q.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3003f != null ? this.f3004g : super.getDropDownWidth();
    }

    public final InterfaceC0201Q getInternalPopup() {
        return this.f3003f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        return interfaceC0201Q != null ? interfaceC0201Q.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3000b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        return interfaceC0201Q != null ? interfaceC0201Q.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            return c0235q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            return c0235q.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q == null || !interfaceC0201Q.a()) {
            return;
        }
        interfaceC0201Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3003f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0200P c0200p = (C0200P) parcelable;
        super.onRestoreInstanceState(c0200p.getSuperState());
        if (!c0200p.f2992a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0149d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0200P c0200p = new C0200P(super.onSaveInstanceState());
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        c0200p.f2992a = interfaceC0201Q != null && interfaceC0201Q.a();
        return c0200p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0194J c0194j = this.f3001c;
        if (c0194j == null || !c0194j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q == null) {
            return super.performClick();
        }
        if (interfaceC0201Q.a()) {
            return true;
        }
        this.f3003f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            c0235q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            c0235q.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0201Q.o(i2);
            interfaceC0201Q.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q != null) {
            interfaceC0201Q.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3003f != null) {
            this.f3004g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q != null) {
            interfaceC0201Q.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(s1.l.z(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q != null) {
            interfaceC0201Q.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            c0235q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235q c0235q = this.f2999a;
        if (c0235q != null) {
            c0235q.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3002e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0201Q interfaceC0201Q = this.f3003f;
        if (interfaceC0201Q != null) {
            Context context = this.f3000b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0197M c0197m = new C0197M();
            c0197m.f2978a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0197m.f2979b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0195K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0201Q.n(c0197m);
        }
    }
}
