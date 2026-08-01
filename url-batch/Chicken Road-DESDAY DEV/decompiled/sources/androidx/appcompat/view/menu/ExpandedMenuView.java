package androidx.appcompat.view.menu;

import K.C0011l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0163o;
import k.InterfaceC0144A;
import k.InterfaceC0160l;
import k.MenuC0161m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0160l, InterfaceC0144A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1177b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0161m f1178a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0011l r2 = C0011l.r(context, attributeSet, f1177b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f423c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0160l
    public final boolean b(C0163o c0163o) {
        return this.f1178a.q(c0163o, null, 0);
    }

    @Override // k.InterfaceC0144A
    public final void c(MenuC0161m menuC0161m) {
        this.f1178a = menuC0161m;
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
        b((C0163o) getAdapter().getItem(i));
    }
}
