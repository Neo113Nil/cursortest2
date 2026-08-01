package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0192p;
import k.InterfaceC0172B;
import k.InterfaceC0188l;
import k.MenuC0189m;
import u0.C0372k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0188l, InterfaceC0172B, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1640b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0189m f1641a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0372k j2 = C0372k.j(context, attributeSet, f1640b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) j2.f4191b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(j2.d(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(j2.d(1));
        }
        j2.l();
    }

    @Override // k.InterfaceC0188l
    public final boolean b(C0192p c0192p) {
        return this.f1641a.q(c0192p, null, 0);
    }

    @Override // k.InterfaceC0172B
    public final void c(MenuC0189m menuC0189m) {
        this.f1641a = menuC0189m;
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
        b((C0192p) getAdapter().getItem(i));
    }
}
