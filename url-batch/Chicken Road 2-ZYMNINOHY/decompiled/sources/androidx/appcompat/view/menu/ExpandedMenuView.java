package androidx.appcompat.view.menu;

import B1.j;
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

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4305a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j v = j.v(context, attributeSet, f4305a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) v.f202c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(v.o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(v.o(1));
        }
        v.x();
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
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        throw null;
    }
}
