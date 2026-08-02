package androidx.appcompat.view.menu;

import B0.C0031i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import i.InterfaceC0210h;
import i.MenuItemC0212j;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0210h, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1346e = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0031i J = C0031i.J(context, attributeSet, f1346e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) J.f154f;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(J.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(J.A(1));
        }
        J.N();
    }

    @Override // i.InterfaceC0210h
    public final boolean a(MenuItemC0212j menuItemC0212j) {
        throw null;
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        throw null;
    }
}
