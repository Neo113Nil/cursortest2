package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.au;
import defpackage.eu;
import defpackage.r6;
import defpackage.tu;
import defpackage.zt;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements zt, tu, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public au f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        r6 u = r6.u(R.attr.listViewStyle, 0, context, attributeSet, g);
        TypedArray typedArray = (TypedArray) u.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(u.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(u.k(1));
        }
        u.w();
    }

    @Override // defpackage.zt
    public final boolean a(eu euVar) {
        return this.f.q(euVar, null, 0);
    }

    @Override // defpackage.tu
    public final void b(au auVar) {
        this.f = auVar;
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
        a((eu) getAdapter().getItem(i));
    }
}
