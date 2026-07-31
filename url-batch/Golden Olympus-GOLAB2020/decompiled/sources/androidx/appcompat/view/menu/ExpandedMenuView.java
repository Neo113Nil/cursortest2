package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Z;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f10308c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    private e f10309a;

    /* renamed from: b, reason: collision with root package name */
    private int f10310b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.f10309a.performItemAction(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f10310b;
    }

    @Override // androidx.appcompat.view.menu.k
    public void initialize(e eVar) {
        this.f10309a = eVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        a((g) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        Z v4 = Z.v(context, attributeSet, f10308c, i4, 0);
        if (v4.s(0)) {
            setBackgroundDrawable(v4.g(0));
        }
        if (v4.s(1)) {
            setDivider(v4.g(1));
        }
        v4.x();
    }
}
