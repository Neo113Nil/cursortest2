package androidx.appcompat.view.menu;

import K.C0011l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0162o;
import k.InterfaceC0143A;
import k.InterfaceC0159l;
import k.MenuC0160m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0159l, InterfaceC0143A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1222b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0160m f1223a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0011l r2 = C0011l.r(context, attributeSet, f1222b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f476c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0159l
    public final boolean b(C0162o c0162o) {
        return this.f1223a.q(c0162o, null, 0);
    }

    @Override // k.InterfaceC0143A
    public final void c(MenuC0160m menuC0160m) {
        this.f1223a = menuC0160m;
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
        b((C0162o) getAdapter().getItem(i));
    }
}
