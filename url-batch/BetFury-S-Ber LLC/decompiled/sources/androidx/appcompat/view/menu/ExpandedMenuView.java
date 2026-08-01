package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.j20;
import defpackage.q10;
import defpackage.r10;
import defpackage.s6;
import defpackage.u10;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements q10, j20, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public r10 f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        s6 t = s6.t(R.attr.listViewStyle, 0, context, attributeSet, g);
        TypedArray typedArray = (TypedArray) t.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(t.j(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(t.j(1));
        }
        t.v();
    }

    @Override // defpackage.q10
    public final boolean a(u10 u10Var) {
        return this.f.q(u10Var, null, 0);
    }

    @Override // defpackage.j20
    public final void b(r10 r10Var) {
        this.f = r10Var;
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
        a((u10) getAdapter().getItem(i));
    }
}
