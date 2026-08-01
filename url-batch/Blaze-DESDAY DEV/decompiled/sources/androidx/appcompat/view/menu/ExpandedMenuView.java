package androidx.appcompat.view.menu;

import K.C0014l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0168o;
import k.InterfaceC0149A;
import k.InterfaceC0165l;
import k.MenuC0166m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0165l, InterfaceC0149A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1267b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0166m f1268a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0014l i = C0014l.i(context, attributeSet, f1267b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) i.f492b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i.c(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i.c(1));
        }
        i.k();
    }

    @Override // k.InterfaceC0165l
    public final boolean b(C0168o c0168o) {
        return this.f1268a.q(c0168o, null, 0);
    }

    @Override // k.InterfaceC0149A
    public final void c(MenuC0166m menuC0166m) {
        this.f1268a = menuC0166m;
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
        b((C0168o) getAdapter().getItem(i));
    }
}
