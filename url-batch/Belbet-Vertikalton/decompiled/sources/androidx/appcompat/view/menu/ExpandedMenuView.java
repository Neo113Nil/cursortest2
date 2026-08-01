package androidx.appcompat.view.menu;

import I0.h;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import m.C0231o;
import m.InterfaceC0212A;
import m.InterfaceC0228l;
import m.MenuC0229m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0228l, InterfaceC0212A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1685b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0229m f1686a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        h r2 = h.r(context, attributeSet, f1685b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f592c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // m.InterfaceC0212A
    public final void b(MenuC0229m menuC0229m) {
        this.f1686a = menuC0229m;
    }

    @Override // m.InterfaceC0228l
    public final boolean c(C0231o c0231o) {
        return this.f1686a.q(c0231o, null, 0);
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
        c((C0231o) getAdapter().getItem(i));
    }
}
