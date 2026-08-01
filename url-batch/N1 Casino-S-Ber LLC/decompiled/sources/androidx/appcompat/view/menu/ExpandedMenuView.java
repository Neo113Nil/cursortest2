package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.a6;
import defpackage.eu;
import defpackage.lt;
import defpackage.mt;
import defpackage.pt;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements lt, eu, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public mt f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a6 u = a6.u(R.attr.listViewStyle, 0, context, attributeSet, g);
        TypedArray typedArray = (TypedArray) u.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(u.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(u.k(1));
        }
        u.w();
    }

    @Override // defpackage.lt
    public final boolean a(pt ptVar) {
        return this.f.q(ptVar, null, 0);
    }

    @Override // defpackage.eu
    public final void b(mt mtVar) {
        this.f = mtVar;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((pt) getAdapter().getItem(i));
    }
}
