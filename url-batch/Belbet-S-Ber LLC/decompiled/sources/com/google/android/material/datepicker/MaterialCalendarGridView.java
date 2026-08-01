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
import java.util.ArrayList;
import java.util.Iterator;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1023f;

    /* renamed from: g, reason: collision with root package name */
    public l f1024g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i0.e(null);
        if (v.L(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.gdmhkmf.belbet.R.id.cancel_button);
            setNextFocusRightId(com.gdmhkmf.belbet.R.id.confirm_button);
        }
        this.f1023f = v.L(getContext(), com.gdmhkmf.belbet.R.attr.nestedScrollable);
        p0.m(this, new j(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        y yVar = (y) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f1152u;
        if (b4.d.P(context.getTheme(), com.gdmhkmf.belbet.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            d dVar = yVar.d;
            if (dVar != null) {
                focusRingDrawable.f1168t.f1990t = (o2.o) dVar.f1049a.f1044f;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final y b() {
        return (y) super.getAdapter();
    }

    public final boolean c(int i, boolean z4) {
        l lVar;
        l lVar2;
        int a5 = z4 ? ((y) super.getAdapter()).a(i) : ((y) super.getAdapter()).b(i);
        if (a5 != -1) {
            setSelection(a5);
            return true;
        }
        if (!z4 && (lVar2 = this.f1024g) != null) {
            return q.H(lVar2.f1079a, false);
        }
        if (!z4 || (lVar = this.f1024g) == null) {
            return true;
        }
        return q.H(lVar.f1079a, true);
    }

    public final boolean d(int i) {
        y yVar = (y) super.getAdapter();
        if (!yVar.e(i)) {
            long itemId = yVar.getItemId(i);
            for (int i4 = 1; i4 < yVar.f1129a.i; i4++) {
                int i5 = i + i4;
                if ((i5 < y.f1128g && yVar.getItemId(i5) == itemId && yVar.e(i5)) || ((i5 = i - i4) >= 0 && yVar.getItemId(i5) == itemId && yVar.e(i5))) {
                    i = i5;
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
        return (y) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((y) super.getAdapter()).notifyDataSetChanged();
        post(new r(this, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        y yVar = (y) super.getAdapter();
        f0 f0Var = yVar.f1130b;
        int max = Math.max(yVar.c(), getFirstVisiblePosition());
        int min = Math.min(yVar.f(), getLastVisiblePosition());
        yVar.getItem(max);
        yVar.getItem(min);
        f0Var.getClass();
        Iterator it = new ArrayList().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        int b2;
        if (!z4) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            y yVar = (y) super.getAdapter();
            b2 = yVar.b(yVar.f() + 1);
        } else if (i == 130 || i == 2) {
            y yVar2 = (y) super.getAdapter();
            b2 = yVar2.a(yVar2.c() - 1);
        } else {
            b2 = -1;
        }
        if (b2 != -1) {
            setSelection(b2);
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
        boolean z4 = getLayoutDirection() == 1;
        if (i == 21) {
            return c(selectedItemPosition, z4);
        }
        if (i == 22) {
            return c(selectedItemPosition, !z4);
        }
        if (i == 61) {
            int b2 = keyEvent.isShiftPressed() ? ((y) super.getAdapter()).b(selectedItemPosition) : ((y) super.getAdapter()).a(selectedItemPosition);
            if (b2 == -1) {
                return false;
            }
            setSelection(b2);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        y yVar = (y) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || yVar.e(selectedItemPosition2)) {
            return true;
        }
        y yVar2 = (y) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > yVar2.f()) {
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
                if (selectedItemPosition2 < yVar2.c()) {
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
    public final void onMeasure(int i, int i4) {
        if (!this.f1023f) {
            super.onMeasure(i, i4);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((y) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (y) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof y)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), y.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
