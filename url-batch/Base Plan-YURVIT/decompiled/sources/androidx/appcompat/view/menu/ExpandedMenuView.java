package androidx.appcompat.view.menu;

import B0.C0008i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import h.InterfaceC0142i;
import h.MenuItemC0144k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0142i, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1188e = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0008i D2 = C0008i.D(context, attributeSet, f1188e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) D2.f84f;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(D2.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(D2.v(1));
        }
        D2.G();
    }

    @Override // h.InterfaceC0142i
    public final boolean a(MenuItemC0144k menuItemC0144k) {
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
