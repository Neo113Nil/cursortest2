package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.byo;
import defpackage.gc;
import defpackage.gd;
import defpackage.gf;
import defpackage.gr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, gc, gr {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private gd b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        byo u = byo.u(context, attributeSet, a, i, 0);
        if (u.p(0)) {
            setBackgroundDrawable(u.j(0));
        }
        if (u.p(1)) {
            setDivider(u.j(1));
        }
        u.n();
    }

    @Override // defpackage.gr
    public final void a(gd gdVar) {
        this.b = gdVar;
    }

    @Override // defpackage.gc
    public final boolean b(gf gfVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((gf) getAdapter().getItem(i), null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
