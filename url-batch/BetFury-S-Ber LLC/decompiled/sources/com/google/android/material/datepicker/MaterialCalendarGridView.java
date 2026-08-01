package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.b10;
import defpackage.gd0;
import defpackage.hm0;
import defpackage.n00;
import defpackage.n9;
import defpackage.o0;
import defpackage.p00;
import defpackage.p20;
import defpackage.s00;
import defpackage.s6;
import defpackage.xk0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;
    public p00 g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        xk0.c(null);
        if (b10.N(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.trembin.nirefon.betfury.R.id.cancel_button);
            setNextFocusRightId(com.trembin.nirefon.betfury.R.id.confirm_button);
        }
        this.f = b10.N(getContext(), com.trembin.nirefon.betfury.R.attr.nestedScrollable);
        hm0.m(this, new n00(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        p20 p20Var = (p20) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.u;
        if (n9.K(context.getTheme(), com.trembin.nirefon.betfury.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            s6 s6Var = p20Var.g;
            if (s6Var != null) {
                focusRingDrawable.t.t = (gd0) ((o0) s6Var.b).g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final p20 b() {
        return (p20) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        p00 p00Var;
        p00 p00Var2;
        int a = z ? ((p20) super.getAdapter()).a(i) : ((p20) super.getAdapter()).b(i);
        if (a != -1) {
            setSelection(a);
            return true;
        }
        if (!z && (p00Var2 = this.g) != null) {
            return s00.J(p00Var2.a, false);
        }
        if (!z || (p00Var = this.g) == null) {
            return true;
        }
        return s00.J(p00Var.a, true);
    }

    public final boolean d(int i) {
        p20 p20Var = (p20) super.getAdapter();
        if (!p20Var.e(i)) {
            long itemId = p20Var.getItemId(i);
            for (int i2 = 1; i2 < p20Var.f.i; i2++) {
                int i3 = i + i2;
                if ((i3 < p20.j && p20Var.getItemId(i3) == itemId && p20Var.e(i3)) || ((i3 = i - i2) >= 0 && p20Var.getItemId(i3) == itemId && p20Var.e(i3))) {
                    i = i3;
                    break;
                }
            }
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (p20) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p20) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(MaterialCalendarGridView.this);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p20 p20Var = (p20) super.getAdapter();
        p20Var.getClass();
        int max = Math.max(p20Var.c(), getFirstVisiblePosition());
        int min = Math.min(p20Var.f(), getLastVisiblePosition());
        p20Var.getItem(max);
        p20Var.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int b;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            p20 p20Var = (p20) super.getAdapter();
            b = p20Var.b(p20Var.f() + 1);
        } else if (i == 130 || i == 2) {
            p20 p20Var2 = (p20) super.getAdapter();
            b = p20Var2.a(p20Var2.c() - 1);
        } else {
            b = -1;
        }
        if (b != -1) {
            setSelection(b);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return c(selectedItemPosition, z);
        }
        if (i == 22) {
            return c(selectedItemPosition, !z);
        }
        if (i == 61) {
            int b = keyEvent.isShiftPressed() ? ((p20) super.getAdapter()).b(selectedItemPosition) : ((p20) super.getAdapter()).a(selectedItemPosition);
            if (b == -1) {
                return false;
            }
            setSelection(b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        p20 p20Var = (p20) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || p20Var.e(selectedItemPosition2)) {
            return true;
        }
        p20 p20Var2 = (p20) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > p20Var2.f()) {
                            break;
                        }
                        if (d(numColumns)) {
                            break;
                        }
                        selectedItemPosition2 = getNumColumns();
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < p20Var2.c()) {
                    break;
                }
                if (d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof p20)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p20.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((p20) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (p20) super.getAdapter();
    }
}
