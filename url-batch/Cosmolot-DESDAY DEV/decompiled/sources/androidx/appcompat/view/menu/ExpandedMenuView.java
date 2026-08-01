package androidx.appcompat.view.menu;

import K.C0012l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0159o;
import k.InterfaceC0140A;
import k.InterfaceC0156l;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0156l, InterfaceC0140A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1114b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0157m f1115a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0012l r2 = C0012l.r(context, attributeSet, f1114b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f432c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0156l
    public final boolean b(C0159o c0159o) {
        return this.f1115a.q(c0159o, null, 0);
    }

    @Override // k.InterfaceC0140A
    public final void c(MenuC0157m menuC0157m) {
        this.f1115a = menuC0157m;
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
        b((C0159o) getAdapter().getItem(i));
    }
}
