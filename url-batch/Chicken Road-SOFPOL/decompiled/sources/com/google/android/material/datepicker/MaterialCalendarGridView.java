package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1918d;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.a(null);
        if (c.i(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.snovikpovik.vuevnxsj.R.id.cancel_button);
            setNextFocusRightId(com.snovikpovik.vuevnxsj.R.id.confirm_button);
        }
        this.f1918d = c.i(getContext(), com.snovikpovik.vuevnxsj.R.attr.nestedScrollable);
        k0.k(this, new b(0));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (e) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((e) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ((e) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        if (!z3) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            ((e) super.getAdapter()).getClass();
            throw null;
        }
        if (i != 130) {
            super.onFocusChanged(true, i, rect);
        } else {
            ((e) super.getAdapter()).getClass();
            throw null;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1) {
            return true;
        }
        ((e) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i8) {
        if (!this.f1918d) {
            super.onMeasure(i, i8);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        ((e) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (e) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof e)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), e.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
