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
import g.AbstractC0122a;
import l.C0206c;
import m.ViewTreeObserverOnGlobalLayoutListenerC0220d;

/* renamed from: n.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0294q f3510a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3511b;

    /* renamed from: c, reason: collision with root package name */
    public final C0253I f3512c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f3513d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0260P f3514f;

    /* renamed from: g, reason: collision with root package name */
    public int f3515g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f3516h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0261Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winpower.neonfit.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f3516h = new Rect();
        W0.a(this, getContext());
        int[] iArr = AbstractC0122a.f2712u;
        I0.h r2 = I0.h.r(context, attributeSet, iArr, com.winpower.neonfit.R.attr.spinnerStyle);
        this.f3510a = new C0294q(this);
        TypedArray typedArray2 = (TypedArray) r2.f592c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3511b = new C0206c(context, resourceId);
        } else {
            this.f3511b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.winpower.neonfit.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i2 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
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
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 == 0) {
            DialogInterfaceOnClickListenerC0255K dialogInterfaceOnClickListenerC0255K = new DialogInterfaceOnClickListenerC0255K(this);
            this.f3514f = dialogInterfaceOnClickListenerC0255K;
            dialogInterfaceOnClickListenerC0255K.f3485c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0258N c0258n = new C0258N(this, this.f3511b, attributeSet);
            I0.h r3 = I0.h.r(this.f3511b, attributeSet, iArr, com.winpower.neonfit.R.attr.spinnerStyle);
            this.f3515g = ((TypedArray) r3.f592c).getLayoutDimension(3, -2);
            c0258n.k(r3.h(1));
            c0258n.f3495C = typedArray2.getString(2);
            r3.t();
            this.f3514f = c0258n;
            this.f3512c = new C0253I(this, this, c0258n);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.winpower.neonfit.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.f3513d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f3513d = null;
        }
        this.f3510a.d(attributeSet, com.winpower.neonfit.R.attr.spinnerStyle);
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
        Rect rect = this.f3516h;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            c0294q.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        return interfaceC0260P != null ? interfaceC0260P.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        return interfaceC0260P != null ? interfaceC0260P.i() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3514f != null ? this.f3515g : super.getDropDownWidth();
    }

    public final InterfaceC0260P getInternalPopup() {
        return this.f3514f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        return interfaceC0260P != null ? interfaceC0260P.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3511b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        return interfaceC0260P != null ? interfaceC0260P.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            return c0294q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            return c0294q.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P == null || !interfaceC0260P.a()) {
            return;
        }
        interfaceC0260P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3514f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0259O c0259o = (C0259O) parcelable;
        super.onRestoreInstanceState(c0259o.getSuperState());
        if (!c0259o.f3502a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0220d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0259O c0259o = new C0259O(super.onSaveInstanceState());
        InterfaceC0260P interfaceC0260P = this.f3514f;
        c0259o.f3502a = interfaceC0260P != null && interfaceC0260P.a();
        return c0259o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0253I c0253i = this.f3512c;
        if (c0253i == null || !c0253i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P == null) {
            return super.performClick();
        }
        if (interfaceC0260P.a()) {
            return true;
        }
        this.f3514f.f(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            c0294q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            c0294q.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0260P.p(i2);
            interfaceC0260P.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P != null) {
            interfaceC0260P.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3514f != null) {
            this.f3515g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P != null) {
            interfaceC0260P.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(H1.d.F(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P != null) {
            interfaceC0260P.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            c0294q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0294q c0294q = this.f3510a;
        if (c0294q != null) {
            c0294q.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.f3513d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0260P interfaceC0260P = this.f3514f;
        if (interfaceC0260P != null) {
            Context context = this.f3511b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0256L c0256l = new C0256L();
            c0256l.f3487a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0256l.f3488b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0254J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0260P.o(c0256l);
        }
    }
}
