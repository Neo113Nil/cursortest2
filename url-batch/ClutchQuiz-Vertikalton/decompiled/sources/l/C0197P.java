package l;

import K.C0012m;
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
import j.C0149c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0158d;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197P extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f2898a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2899b;

    /* renamed from: c, reason: collision with root package name */
    public final C0189H f2900c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2901e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0196O f2902f;

    /* renamed from: g, reason: collision with root package name */
    public int f2903g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0197P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.clutchquizarena.app.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        Q0.a(this, getContext());
        int[] iArr = f.a.f2126u;
        C0012m r2 = C0012m.r(context, attributeSet, iArr, com.clutchquizarena.app.R.attr.spinnerStyle);
        this.f2898a = new C0231p(this);
        TypedArray typedArray2 = (TypedArray) r2.f423c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2899b = new C0149c(context, resourceId);
        } else {
            this.f2899b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.clutchquizarena.app.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0191J dialogInterfaceOnClickListenerC0191J = new DialogInterfaceOnClickListenerC0191J(this);
            this.f2902f = dialogInterfaceOnClickListenerC0191J;
            dialogInterfaceOnClickListenerC0191J.f2874c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0194M c0194m = new C0194M(this, this.f2899b, attributeSet);
            C0012m r3 = C0012m.r(this.f2899b, attributeSet, iArr, com.clutchquizarena.app.R.attr.spinnerStyle);
            this.f2903g = ((TypedArray) r3.f423c).getLayoutDimension(3, -2);
            c0194m.k(r3.h(1));
            c0194m.f2887C = typedArray2.getString(2);
            r3.t();
            this.f2902f = c0194m;
            this.f2900c = new C0189H(this, this, c0194m);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.clutchquizarena.app.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2901e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2898a.d(attributeSet, com.clutchquizarena.app.R.attr.spinnerStyle);
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
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            c0231p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        return interfaceC0196O != null ? interfaceC0196O.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        return interfaceC0196O != null ? interfaceC0196O.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2902f != null ? this.f2903g : super.getDropDownWidth();
    }

    public final InterfaceC0196O getInternalPopup() {
        return this.f2902f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        return interfaceC0196O != null ? interfaceC0196O.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2899b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        return interfaceC0196O != null ? interfaceC0196O.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O == null || !interfaceC0196O.a()) {
            return;
        }
        interfaceC0196O.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2902f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0195N c0195n = (C0195N) parcelable;
        super.onRestoreInstanceState(c0195n.getSuperState());
        if (!c0195n.f2891a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0158d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0195N c0195n = new C0195N(super.onSaveInstanceState());
        InterfaceC0196O interfaceC0196O = this.f2902f;
        c0195n.f2891a = interfaceC0196O != null && interfaceC0196O.a();
        return c0195n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0189H c0189h = this.f2900c;
        if (c0189h == null || !c0189h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O == null) {
            return super.performClick();
        }
        if (interfaceC0196O.a()) {
            return true;
        }
        this.f2902f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            c0231p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0196O.o(i2);
            interfaceC0196O.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O != null) {
            interfaceC0196O.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2902f != null) {
            this.f2903g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O != null) {
            interfaceC0196O.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(T.d.t(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O != null) {
            interfaceC0196O.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f2898a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2901e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0196O interfaceC0196O = this.f2902f;
        if (interfaceC0196O != null) {
            Context context = this.f2899b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0192K c0192k = new C0192K();
            c0192k.f2877a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0192k.f2878b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0190I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0196O.n(c0192k);
        }
    }
}
