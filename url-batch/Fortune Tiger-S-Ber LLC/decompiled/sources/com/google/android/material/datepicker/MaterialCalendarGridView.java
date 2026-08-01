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
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1272f;
    public h g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a0.c(null);
        if (p.J(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.gglhk.bofio.fortunetiger.R.id.cancel_button);
            setNextFocusRightId(com.gglhk.bofio.fortunetiger.R.id.confirm_button);
        }
        this.f1272f = p.J(getContext(), com.gglhk.bofio.fortunetiger.R.attr.nestedScrollable);
        j0.m(this, new f(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        s sVar = (s) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f1345u;
        if (k3.d.Y(context.getTheme(), com.gglhk.bofio.fortunetiger.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            androidx.emoji2.text.s sVar2 = sVar.f1332b;
            if (sVar2 != null) {
                focusRingDrawable.f1361t.f3676t = (g2.o) ((a2.e) sVar2.f357b).g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final s b() {
        return (s) super.getAdapter();
    }

    public final boolean c(int i4, boolean z3) {
        h hVar;
        h hVar2;
        int a4 = z3 ? ((s) super.getAdapter()).a(i4) : ((s) super.getAdapter()).b(i4);
        if (a4 != -1) {
            setSelection(a4);
            return true;
        }
        if (!z3 && (hVar2 = this.g) != null) {
            return l.H(hVar2.f1288a, false);
        }
        if (!z3 || (hVar = this.g) == null) {
            return true;
        }
        return l.H(hVar.f1288a, true);
    }

    public final boolean d(int i4) {
        s sVar = (s) super.getAdapter();
        if (!sVar.e(i4)) {
            long itemId = sVar.getItemId(i4);
            for (int i5 = 1; i5 < sVar.f1331a.f1325i; i5++) {
                int i6 = i4 + i5;
                if ((i6 < s.f1330e && sVar.getItemId(i6) == itemId && sVar.e(i6)) || ((i6 = i4 - i5) >= 0 && sVar.getItemId(i6) == itemId && sVar.e(i6))) {
                    i4 = i6;
                    break;
                }
            }
            i4 = -1;
        }
        if (i4 == -1) {
            return false;
        }
        setSelection(i4);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((s) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.m
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(MaterialCalendarGridView.this);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        s sVar = (s) super.getAdapter();
        sVar.getClass();
        int max = Math.max(sVar.c(), getFirstVisiblePosition());
        int min = Math.min(sVar.f(), getLastVisiblePosition());
        sVar.getItem(max);
        sVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        int b2;
        if (!z3) {
            super.onFocusChanged(false, i4, rect);
            return;
        }
        if (i4 == 33 || i4 == 1) {
            s sVar = (s) super.getAdapter();
            b2 = sVar.b(sVar.f() + 1);
        } else if (i4 == 130 || i4 == 2) {
            s sVar2 = (s) super.getAdapter();
            b2 = sVar2.a(sVar2.c() - 1);
        } else {
            b2 = -1;
        }
        if (b2 != -1) {
            setSelection(b2);
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i4, keyEvent);
        }
        boolean z3 = getLayoutDirection() == 1;
        if (i4 == 21) {
            return c(selectedItemPosition, z3);
        }
        if (i4 == 22) {
            return c(selectedItemPosition, !z3);
        }
        if (i4 == 61) {
            int b2 = keyEvent.isShiftPressed() ? ((s) super.getAdapter()).b(selectedItemPosition) : ((s) super.getAdapter()).a(selectedItemPosition);
            if (b2 == -1) {
                return false;
            }
            setSelection(b2);
            return true;
        }
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        s sVar = (s) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || sVar.e(selectedItemPosition2)) {
            return true;
        }
        s sVar2 = (s) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i4) {
                if (i4 == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > sVar2.f()) {
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
                if (selectedItemPosition2 < sVar2.c()) {
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
    public final void onMeasure(int i4, int i5) {
        if (!this.f1272f) {
            super.onMeasure(i4, i5);
            return;
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i4) {
        super.setSelection(Math.max(i4, ((s) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof s)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), s.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
