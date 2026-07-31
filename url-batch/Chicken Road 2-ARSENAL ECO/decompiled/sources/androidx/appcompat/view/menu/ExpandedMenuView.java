package androidx.appcompat.view.menu;

import B0.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j.i;
import j.k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3232f = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c r6 = c.r(context, attributeSet, f3232f, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r6.f73i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r6.m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r6.m(1));
        }
        r6.v();
    }

    @Override // j.i
    public final boolean a(k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j4) {
        throw null;
    }
}
