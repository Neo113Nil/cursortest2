package androidx.appcompat.view.menu;

import K.C0012m;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0169o;
import k.InterfaceC0150A;
import k.InterfaceC0166l;
import k.MenuC0167m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0166l, InterfaceC0150A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1256b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0167m f1257a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0012m r2 = C0012m.r(context, attributeSet, f1256b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f423c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0166l
    public final boolean b(C0169o c0169o) {
        return this.f1257a.q(c0169o, null, 0);
    }

    @Override // k.InterfaceC0150A
    public final void c(MenuC0167m menuC0167m) {
        this.f1257a = menuC0167m;
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
        b((C0169o) getAdapter().getItem(i));
    }
}
