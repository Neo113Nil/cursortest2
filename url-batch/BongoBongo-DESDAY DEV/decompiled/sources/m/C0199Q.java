package m;

import L.C0014l;
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
import f.AbstractC0097a;
import h.AbstractC0112a;
import k.C0149c;
import l.ViewTreeObserverOnGlobalLayoutListenerC0160d;

/* renamed from: m.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f2974a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final C0191I f2976c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2977e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0198P f2978f;

    /* renamed from: g, reason: collision with root package name */
    public int f2979g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2980h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0199Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.winrandom.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f2980h = new Rect();
        X0.a(this, getContext());
        int[] iArr = AbstractC0097a.f2154u;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, com.winfour.winrandom.R.attr.spinnerStyle);
        this.f2974a = new C0231p(this);
        TypedArray typedArray2 = (TypedArray) i2.f543b;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2975b = new C0149c(context, resourceId);
        } else {
            this.f2975b = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.winfour.winrandom.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0193K dialogInterfaceOnClickListenerC0193K = new DialogInterfaceOnClickListenerC0193K(this);
            this.f2978f = dialogInterfaceOnClickListenerC0193K;
            dialogInterfaceOnClickListenerC0193K.f2958c = typedArray2.getString(2);
        } else if (i3 == 1) {
            C0196N c0196n = new C0196N(this, this.f2975b, attributeSet);
            C0014l i4 = C0014l.i(this.f2975b, attributeSet, iArr, com.winfour.winrandom.R.attr.spinnerStyle);
            this.f2979g = ((TypedArray) i4.f543b).getLayoutDimension(3, -2);
            c0196n.l(i4.c(1));
            c0196n.f2963C = typedArray2.getString(2);
            i4.k();
            this.f2978f = c0196n;
            this.f2976c = new C0191I(this, this, c0196n);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.winfour.winrandom.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i2.k();
        this.f2977e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2974a.d(attributeSet, com.winfour.winrandom.R.attr.spinnerStyle);
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
        Rect rect = this.f2980h;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            c0231p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        return interfaceC0198P != null ? interfaceC0198P.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        return interfaceC0198P != null ? interfaceC0198P.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2978f != null ? this.f2979g : super.getDropDownWidth();
    }

    public final InterfaceC0198P getInternalPopup() {
        return this.f2978f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        return interfaceC0198P != null ? interfaceC0198P.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2975b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        return interfaceC0198P != null ? interfaceC0198P.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P == null || !interfaceC0198P.a()) {
            return;
        }
        interfaceC0198P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2978f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0197O c0197o = (C0197O) parcelable;
        super.onRestoreInstanceState(c0197o.getSuperState());
        if (!c0197o.f2971a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0160d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0197O c0197o = new C0197O(super.onSaveInstanceState());
        InterfaceC0198P interfaceC0198P = this.f2978f;
        c0197o.f2971a = interfaceC0198P != null && interfaceC0198P.a();
        return c0197o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0191I c0191i = this.f2976c;
        if (c0191i == null || !c0191i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P == null) {
            return super.performClick();
        }
        if (interfaceC0198P.a()) {
            return true;
        }
        this.f2978f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            c0231p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0198P.p(i2);
            interfaceC0198P.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P != null) {
            interfaceC0198P.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2978f != null) {
            this.f2979g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P != null) {
            interfaceC0198P.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0112a.l(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P != null) {
            interfaceC0198P.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f2974a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2977e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0198P interfaceC0198P = this.f2978f;
        if (interfaceC0198P != null) {
            Context context = this.f2975b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0194L c0194l = new C0194L();
            c0194l.f2959a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0194l.f2960b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0192J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0198P.o(c0194l);
        }
    }
}
