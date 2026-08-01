package androidx.appcompat.view.menu;

import T.r;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0204o;
import k.InterfaceC0185A;
import k.InterfaceC0201l;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0201l, InterfaceC0185A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f965b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0202m f966a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        r r2 = r.r(context, attributeSet, f965b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f812c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0201l
    public final boolean b(C0204o c0204o) {
        return this.f966a.q(c0204o, null, 0);
    }

    @Override // k.InterfaceC0185A
    public final void c(MenuC0202m menuC0202m) {
        this.f966a = menuC0202m;
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
        b((C0204o) getAdapter().getItem(i));
    }
}
