package androidx.appcompat.view.menu;

import L.C0014l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.C0171o;
import l.InterfaceC0152A;
import l.InterfaceC0168l;
import l.MenuC0169m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0168l, InterfaceC0152A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1317b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0169m f1318a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0014l i = C0014l.i(context, attributeSet, f1317b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) i.f543b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i.c(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i.c(1));
        }
        i.k();
    }

    @Override // l.InterfaceC0152A
    public final void a(MenuC0169m menuC0169m) {
        this.f1318a = menuC0169m;
    }

    @Override // l.InterfaceC0168l
    public final boolean b(C0171o c0171o) {
        return this.f1318a.q(c0171o, null, 0);
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
        b((C0171o) getAdapter().getItem(i));
    }
}
