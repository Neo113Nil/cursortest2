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
import j.C0141c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0151d;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0235p f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2905b;

    /* renamed from: c, reason: collision with root package name */
    public final C0195I f2906c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2907e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0202P f2908f;

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
    public C0203Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.neonpulse.gridlogic.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        R0.a(this, getContext());
        int[] iArr = f.a.f2074u;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, com.neonpulse.gridlogic.R.attr.spinnerStyle);
        this.f2904a = new C0235p(this);
        TypedArray typedArray2 = (TypedArray) r2.f476c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2905b = new C0141c(context, resourceId);
        } else {
            this.f2905b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.neonpulse.gridlogic.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0197K dialogInterfaceOnClickListenerC0197K = new DialogInterfaceOnClickListenerC0197K(this);
            this.f2908f = dialogInterfaceOnClickListenerC0197K;
            dialogInterfaceOnClickListenerC0197K.f2880c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0200N c0200n = new C0200N(this, this.f2905b, attributeSet);
            C0011l r3 = C0011l.r(this.f2905b, attributeSet, iArr, com.neonpulse.gridlogic.R.attr.spinnerStyle);
            this.f2909g = ((TypedArray) r3.f476c).getLayoutDimension(3, -2);
            c0200n.k(r3.h(1));
            c0200n.f2893C = typedArray2.getString(2);
            r3.t();
            this.f2908f = c0200n;
            this.f2906c = new C0195I(this, this, c0200n);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.neonpulse.gridlogic.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2907e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2904a.d(attributeSet, com.neonpulse.gridlogic.R.attr.spinnerStyle);
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
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            c0235p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        return interfaceC0202P != null ? interfaceC0202P.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        return interfaceC0202P != null ? interfaceC0202P.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2908f != null ? this.f2909g : super.getDropDownWidth();
    }

    public final InterfaceC0202P getInternalPopup() {
        return this.f2908f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        return interfaceC0202P != null ? interfaceC0202P.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2905b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        return interfaceC0202P != null ? interfaceC0202P.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            return c0235p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            return c0235p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P == null || !interfaceC0202P.a()) {
            return;
        }
        interfaceC0202P.dismiss();
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
        C0201O c0201o = (C0201O) parcelable;
        super.onRestoreInstanceState(c0201o.getSuperState());
        if (!c0201o.f2897a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0151d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0201O c0201o = new C0201O(super.onSaveInstanceState());
        InterfaceC0202P interfaceC0202P = this.f2908f;
        c0201o.f2897a = interfaceC0202P != null && interfaceC0202P.a();
        return c0201o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0195I c0195i = this.f2906c;
        if (c0195i == null || !c0195i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P == null) {
            return super.performClick();
        }
        if (interfaceC0202P.a()) {
            return true;
        }
        this.f2908f.f(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            c0235p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            c0235p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0202P.o(i2);
            interfaceC0202P.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P != null) {
            interfaceC0202P.l(i2);
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
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P != null) {
            interfaceC0202P.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(x1.l.z(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P != null) {
            interfaceC0202P.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            c0235p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235p c0235p = this.f2904a;
        if (c0235p != null) {
            c0235p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2907e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0202P interfaceC0202P = this.f2908f;
        if (interfaceC0202P != null) {
            Context context = this.f2905b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0198L c0198l = new C0198L();
            c0198l.f2883a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0198l.f2884b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0196J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0202P.n(c0198l);
        }
    }
}
