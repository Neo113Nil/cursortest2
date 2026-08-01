package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.fx;
import defpackage.k6;
import defpackage.lw;
import defpackage.mw;
import defpackage.qw;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements lw, fx, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public mw f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k6 z = k6.z(R.attr.listViewStyle, 0, context, attributeSet, g);
        TypedArray typedArray = (TypedArray) z.g;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(z.o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(z.o(1));
        }
        z.B();
    }

    @Override // defpackage.lw
    public final boolean a(qw qwVar) {
        return this.f.q(qwVar, null, 0);
    }

    @Override // defpackage.fx
    public final void b(mw mwVar) {
        this.f = mwVar;
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
        a((qw) getAdapter().getItem(i));
    }
}
