package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class io extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public in b;
    int c;
    final Rect d;
    private final hs f;
    private jt g;
    private SpinnerAdapter h;
    private final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.apps.authenticator2.R.attr.spinnerStyle);
        TypedArray typedArray;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        this.d = new Rect();
        mb.d(this, getContext());
        byo u = byo.u(context, attributeSet, em.v, com.google.android.apps.authenticator2.R.attr.spinnerStyle, 0);
        this.f = new hs(this);
        int h = u.h(4, 0);
        if (h != 0) {
            this.a = new on(context, h);
        } else {
            this.a = context;
        }
        TypedArray typedArray2 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, e, com.google.android.apps.authenticator2.R.attr.spinnerStyle, 0);
            try {
                int i = typedArray.hasValue(0) ? typedArray.getInt(0, 0) : -1;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                if (i == 0) {
                    ii iiVar = new ii(this);
                    this.b = iiVar;
                    iiVar.i(u.m(2));
                } else if (i == 1) {
                    il ilVar = new il(this, this.a, attributeSet);
                    byo u2 = byo.u(this.a, attributeSet, em.v, com.google.android.apps.authenticator2.R.attr.spinnerStyle, 0);
                    this.c = u2.g(3, -2);
                    ilVar.f(u2.j(1));
                    ilVar.a = u.m(2);
                    u2.n();
                    this.b = ilVar;
                    this.g = new ih(this, this, ilVar);
                }
            } catch (Exception unused) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                textArray = ((TypedArray) u.a).getTextArray(0);
                if (textArray != null) {
                }
                u.n();
                this.i = true;
                spinnerAdapter = this.h;
                if (spinnerAdapter != null) {
                }
                this.f.b(attributeSet, com.google.android.apps.authenticator2.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
        }
        textArray = ((TypedArray) u.a).getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.google.android.apps.authenticator2.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        u.n();
        this.i = true;
        spinnerAdapter = this.h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.h = null;
        }
        this.f.b(attributeSet, com.google.android.apps.authenticator2.R.attr.spinnerStyle);
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            int i3 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max2++;
            i = i3;
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.d;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public final void b() {
        this.b.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hs hsVar = this.f;
        if (hsVar != null) {
            hsVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        in inVar = this.b;
        return inVar != null ? inVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        in inVar = this.b;
        return inVar != null ? inVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        in inVar = this.b;
        return inVar != null ? inVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        in inVar = this.b;
        return inVar != null ? inVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        in inVar = this.b;
        if (inVar == null || !inVar.x()) {
            return;
        }
        this.b.m();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        im imVar = (im) parcelable;
        super.onRestoreInstanceState(imVar.getSuperState());
        if (!imVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new gu(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        im imVar = new im(super.onSaveInstanceState());
        in inVar = this.b;
        boolean z = false;
        if (inVar != null && inVar.x()) {
            z = true;
        }
        imVar.a = z;
        return imVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jt jtVar = this.g;
        if (jtVar == null || !jtVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        in inVar = this.b;
        if (inVar == null) {
            return super.performClick();
        }
        if (inVar.x()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new ij(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.f;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.f;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        in inVar = this.b;
        if (inVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            inVar.h(i);
            this.b.g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        in inVar = this.b;
        if (inVar != null) {
            inVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        in inVar = this.b;
        if (inVar != null) {
            inVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(e.f(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        in inVar = this.b;
        if (inVar != null) {
            inVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }
}
