package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.cl1;
import defpackage.ek1;
import defpackage.fk1;
import defpackage.lk1;
import defpackage.mh;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements ek1, cl1, AdapterView.OnItemClickListener {
    public static final int[] n = {R.attr.background, R.attr.divider};
    public fk1 m;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        mh z = mh.z(context, attributeSet, n, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) z.n;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(z.q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(z.q(1));
        }
        z.B();
    }

    @Override // defpackage.ek1
    public final boolean a(lk1 lk1Var) {
        return this.m.q(lk1Var, null, 0);
    }

    @Override // defpackage.cl1
    public final void b(fk1 fk1Var) {
        this.m = fk1Var;
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
        a((lk1) getAdapter().getItem(i));
    }
}
