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
import defpackage.a6;
import defpackage.d20;
import defpackage.js;
import defpackage.k0;
import defpackage.ku;
import defpackage.ls;
import defpackage.os;
import defpackage.p70;
import defpackage.x80;
import defpackage.xs;
import defpackage.zo;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;
    public ls g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        p70.c(null);
        if (xs.N(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.derinko.gbini.n1casino.R.id.cancel_button);
            setNextFocusRightId(com.derinko.gbini.n1casino.R.id.confirm_button);
        }
        this.f = xs.N(getContext(), com.derinko.gbini.n1casino.R.attr.nestedScrollable);
        x80.m(this, new js(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        ku kuVar = (ku) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.u;
        if (zo.J(context.getTheme(), com.derinko.gbini.n1casino.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            a6 a6Var = kuVar.g;
            if (a6Var != null) {
                focusRingDrawable.t.t = (d20) ((k0) a6Var.b).g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final ku b() {
        return (ku) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        ls lsVar;
        ls lsVar2;
        int a = z ? ((ku) super.getAdapter()).a(i) : ((ku) super.getAdapter()).b(i);
        if (a != -1) {
            setSelection(a);
            return true;
        }
        if (!z && (lsVar2 = this.g) != null) {
            return os.J(lsVar2.a, false);
        }
        if (!z || (lsVar = this.g) == null) {
            return true;
        }
        return os.J(lsVar.a, true);
    }

    public final boolean d(int i) {
        ku kuVar = (ku) super.getAdapter();
        if (!kuVar.e(i)) {
            long itemId = kuVar.getItemId(i);
            for (int i2 = 1; i2 < kuVar.f.i; i2++) {
                int i3 = i + i2;
                if ((i3 < ku.j && kuVar.getItemId(i3) == itemId && kuVar.e(i3)) || ((i3 = i - i2) >= 0 && kuVar.getItemId(i3) == itemId && kuVar.e(i3))) {
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
        return (ku) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((ku) super.getAdapter()).notifyDataSetChanged();
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
        ku kuVar = (ku) super.getAdapter();
        kuVar.getClass();
        int max = Math.max(kuVar.c(), getFirstVisiblePosition());
        int min = Math.min(kuVar.f(), getLastVisiblePosition());
        kuVar.getItem(max);
        kuVar.getItem(min);
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
            ku kuVar = (ku) super.getAdapter();
            b = kuVar.b(kuVar.f() + 1);
        } else if (i == 130 || i == 2) {
            ku kuVar2 = (ku) super.getAdapter();
            b = kuVar2.a(kuVar2.c() - 1);
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
            int b = keyEvent.isShiftPressed() ? ((ku) super.getAdapter()).b(selectedItemPosition) : ((ku) super.getAdapter()).a(selectedItemPosition);
            if (b == -1) {
                return false;
            }
            setSelection(b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        ku kuVar = (ku) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || kuVar.e(selectedItemPosition2)) {
            return true;
        }
        ku kuVar2 = (ku) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > kuVar2.f()) {
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
                if (selectedItemPosition2 < kuVar2.c()) {
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
        if (!(listAdapter instanceof ku)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), ku.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((ku) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (ku) super.getAdapter();
    }
}
