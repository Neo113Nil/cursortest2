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
import defpackage.b9;
import defpackage.f50;
import defpackage.ic0;
import defpackage.k6;
import defpackage.kv;
import defpackage.lx;
import defpackage.mv;
import defpackage.pv;
import defpackage.rc0;
import defpackage.yv;
import defpackage.za0;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;
    public mv g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        za0.c(null);
        if (yv.N(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.moontiko.really.admiralcasino.R.id.cancel_button);
            setNextFocusRightId(com.moontiko.really.admiralcasino.R.id.confirm_button);
        }
        this.f = yv.N(getContext(), com.moontiko.really.admiralcasino.R.attr.nestedScrollable);
        ic0.m(this, new kv(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        lx lxVar = (lx) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.u;
        if (b9.L(context.getTheme(), com.moontiko.really.admiralcasino.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            k6 k6Var = lxVar.b;
            if (k6Var != null) {
                focusRingDrawable.t.t = (f50) ((rc0) k6Var.g).g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final lx b() {
        return (lx) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        mv mvVar;
        mv mvVar2;
        int a = z ? ((lx) super.getAdapter()).a(i) : ((lx) super.getAdapter()).b(i);
        if (a != -1) {
            setSelection(a);
            return true;
        }
        if (!z && (mvVar2 = this.g) != null) {
            return pv.J(mvVar2.a, false);
        }
        if (!z || (mvVar = this.g) == null) {
            return true;
        }
        return pv.J(mvVar.a, true);
    }

    public final boolean d(int i) {
        lx lxVar = (lx) super.getAdapter();
        if (!lxVar.e(i)) {
            long itemId = lxVar.getItemId(i);
            for (int i2 = 1; i2 < lxVar.a.i; i2++) {
                int i3 = i + i2;
                if ((i3 < lx.e && lxVar.getItemId(i3) == itemId && lxVar.e(i3)) || ((i3 = i - i2) >= 0 && lxVar.getItemId(i3) == itemId && lxVar.e(i3))) {
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
        return (lx) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((lx) super.getAdapter()).notifyDataSetChanged();
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
        lx lxVar = (lx) super.getAdapter();
        lxVar.getClass();
        int max = Math.max(lxVar.c(), getFirstVisiblePosition());
        int min = Math.min(lxVar.f(), getLastVisiblePosition());
        lxVar.getItem(max);
        lxVar.getItem(min);
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
            lx lxVar = (lx) super.getAdapter();
            b = lxVar.b(lxVar.f() + 1);
        } else if (i == 130 || i == 2) {
            lx lxVar2 = (lx) super.getAdapter();
            b = lxVar2.a(lxVar2.c() - 1);
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
            int b = keyEvent.isShiftPressed() ? ((lx) super.getAdapter()).b(selectedItemPosition) : ((lx) super.getAdapter()).a(selectedItemPosition);
            if (b == -1) {
                return false;
            }
            setSelection(b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        lx lxVar = (lx) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || lxVar.e(selectedItemPosition2)) {
            return true;
        }
        lx lxVar2 = (lx) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > lxVar2.f()) {
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
                if (selectedItemPosition2 < lxVar2.c()) {
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
        if (!(listAdapter instanceof lx)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), lx.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((lx) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (lx) super.getAdapter();
    }
}
