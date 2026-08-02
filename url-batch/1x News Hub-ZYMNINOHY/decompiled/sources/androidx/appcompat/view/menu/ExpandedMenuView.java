package androidx.appcompat.view.menu;

import A0.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC1064i;
import k.MenuItemC1066k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1064i, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1976a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f K2 = f.K(context, attributeSet, f1976a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) K2.f24c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(K2.C(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(K2.C(1));
        }
        K2.O();
    }

    @Override // k.InterfaceC1064i
    public final boolean a(MenuItemC1066k menuItemC1066k) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        throw null;
    }
}
