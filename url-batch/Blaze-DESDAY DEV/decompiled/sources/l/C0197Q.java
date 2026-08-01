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
import j.C0146c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0157d;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f2868a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2869b;

    /* renamed from: c, reason: collision with root package name */
    public final C0189I f2870c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2871e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0196P f2872f;

    /* renamed from: g, reason: collision with root package name */
    public int f2873g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0197Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winworm.neongrid.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        R0.a(this, getContext());
        int[] iArr = f.a.f2115u;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, com.winworm.neongrid.R.attr.spinnerStyle);
        this.f2868a = new C0229p(this);
        TypedArray typedArray2 = (TypedArray) i2.f492b;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2869b = new C0146c(context, resourceId);
        } else {
            this.f2869b = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.winworm.neongrid.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0191K dialogInterfaceOnClickListenerC0191K = new DialogInterfaceOnClickListenerC0191K(this);
            this.f2872f = dialogInterfaceOnClickListenerC0191K;
            dialogInterfaceOnClickListenerC0191K.f2844c = typedArray2.getString(2);
        } else if (i3 == 1) {
            C0194N c0194n = new C0194N(this, this.f2869b, attributeSet);
            C0014l i4 = C0014l.i(this.f2869b, attributeSet, iArr, com.winworm.neongrid.R.attr.spinnerStyle);
            this.f2873g = ((TypedArray) i4.f492b).getLayoutDimension(3, -2);
            c0194n.k(i4.c(1));
            c0194n.f2857C = typedArray2.getString(2);
            i4.k();
            this.f2872f = c0194n;
            this.f2870c = new C0189I(this, this, c0194n);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.winworm.neongrid.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i2.k();
        this.f2871e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2868a.d(attributeSet, com.winworm.neongrid.R.attr.spinnerStyle);
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
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            c0229p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        return interfaceC0196P != null ? interfaceC0196P.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        return interfaceC0196P != null ? interfaceC0196P.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2872f != null ? this.f2873g : super.getDropDownWidth();
    }

    public final InterfaceC0196P getInternalPopup() {
        return this.f2872f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        return interfaceC0196P != null ? interfaceC0196P.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2869b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        return interfaceC0196P != null ? interfaceC0196P.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P == null || !interfaceC0196P.a()) {
            return;
        }
        interfaceC0196P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2872f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0195O c0195o = (C0195O) parcelable;
        super.onRestoreInstanceState(c0195o.getSuperState());
        if (!c0195o.f2861a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0157d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0195O c0195o = new C0195O(super.onSaveInstanceState());
        InterfaceC0196P interfaceC0196P = this.f2872f;
        c0195o.f2861a = interfaceC0196P != null && interfaceC0196P.a();
        return c0195o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0189I c0189i = this.f2870c;
        if (c0189i == null || !c0189i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P == null) {
            return super.performClick();
        }
        if (interfaceC0196P.a()) {
            return true;
        }
        this.f2872f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            c0229p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0196P.o(i2);
            interfaceC0196P.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P != null) {
            interfaceC0196P.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2872f != null) {
            this.f2873g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P != null) {
            interfaceC0196P.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(z1.l.w(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P != null) {
            interfaceC0196P.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f2868a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2871e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0196P interfaceC0196P = this.f2872f;
        if (interfaceC0196P != null) {
            Context context = this.f2869b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0192L c0192l = new C0192L();
            c0192l.f2847a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0192l.f2848b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0190J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0196P.n(c0192l);
        }
    }
}
