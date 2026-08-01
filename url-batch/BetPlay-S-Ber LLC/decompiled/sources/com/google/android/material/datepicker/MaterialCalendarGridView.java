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
import defpackage.ct;
import defpackage.e90;
import defpackage.j1;
import defpackage.l70;
import defpackage.mt;
import defpackage.n20;
import defpackage.r6;
import defpackage.w70;
import defpackage.xs;
import defpackage.zs;
import defpackage.zu;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;
    public zs g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w70.c(null);
        if (mt.i(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.awerser.monnit.betplay.R.id.cancel_button);
            setNextFocusRightId(com.awerser.monnit.betplay.R.id.confirm_button);
        }
        this.f = mt.i(getContext(), com.awerser.monnit.betplay.R.attr.nestedScrollable);
        e90.m(this, new xs(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        zu zuVar = (zu) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.u;
        if (l70.Q(context.getTheme(), com.awerser.monnit.betplay.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            r6 r6Var = zuVar.b;
            if (r6Var != null) {
                focusRingDrawable.t.t = (n20) ((j1) r6Var.b).g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final zu b() {
        return (zu) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        zs zsVar;
        zs zsVar2;
        int a = z ? ((zu) super.getAdapter()).a(i) : ((zu) super.getAdapter()).b(i);
        if (a != -1) {
            setSelection(a);
            return true;
        }
        if (!z && (zsVar2 = this.g) != null) {
            return ct.g(zsVar2.a, false);
        }
        if (!z || (zsVar = this.g) == null) {
            return true;
        }
        return ct.g(zsVar.a, true);
    }

    public final boolean d(int i) {
        zu zuVar = (zu) super.getAdapter();
        if (!zuVar.e(i)) {
            long itemId = zuVar.getItemId(i);
            for (int i2 = 1; i2 < zuVar.a.i; i2++) {
                int i3 = i + i2;
                if ((i3 < zu.e && zuVar.getItemId(i3) == itemId && zuVar.e(i3)) || ((i3 = i - i2) >= 0 && zuVar.getItemId(i3) == itemId && zuVar.e(i3))) {
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
        return (zu) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((zu) super.getAdapter()).notifyDataSetChanged();
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
        zu zuVar = (zu) super.getAdapter();
        zuVar.getClass();
        int max = Math.max(zuVar.c(), getFirstVisiblePosition());
        int min = Math.min(zuVar.f(), getLastVisiblePosition());
        zuVar.getItem(max);
        zuVar.getItem(min);
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
            zu zuVar = (zu) super.getAdapter();
            b = zuVar.b(zuVar.f() + 1);
        } else if (i == 130 || i == 2) {
            zu zuVar2 = (zu) super.getAdapter();
            b = zuVar2.a(zuVar2.c() - 1);
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
            int b = keyEvent.isShiftPressed() ? ((zu) super.getAdapter()).b(selectedItemPosition) : ((zu) super.getAdapter()).a(selectedItemPosition);
            if (b == -1) {
                return false;
            }
            setSelection(b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        zu zuVar = (zu) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || zuVar.e(selectedItemPosition2)) {
            return true;
        }
        zu zuVar2 = (zu) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > zuVar2.f()) {
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
                if (selectedItemPosition2 < zuVar2.c()) {
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
        if (!(listAdapter instanceof zu)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), zu.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((zu) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (zu) super.getAdapter();
    }
}
