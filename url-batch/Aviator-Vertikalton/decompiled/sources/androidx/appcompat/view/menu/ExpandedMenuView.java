package androidx.appcompat.view.menu;

import T.r;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0202o;
import k.InterfaceC0183A;
import k.InterfaceC0199l;
import k.MenuC0200m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0199l, InterfaceC0183A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f964b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0200m f965a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        r r2 = r.r(context, attributeSet, f964b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f811c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0199l
    public final boolean b(C0202o c0202o) {
        return this.f965a.q(c0202o, null, 0);
    }

    @Override // k.InterfaceC0183A
    public final void c(MenuC0200m menuC0200m) {
        this.f965a = menuC0200m;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        b((C0202o) getAdapter().getItem(i));
    }
}
