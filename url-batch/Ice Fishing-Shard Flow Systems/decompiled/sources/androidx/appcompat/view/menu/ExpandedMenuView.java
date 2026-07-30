package androidx.appcompat.view.menu;

import D0.j;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import m.InterfaceC0673B;
import m.l;
import m.m;
import m.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, InterfaceC0673B, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3119e = {R.attr.background, R.attr.divider};

    /* renamed from: d, reason: collision with root package name */
    public m f3120d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j R4 = j.R(context, attributeSet, f3119e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) R4.f331i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(R4.J(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(R4.J(1));
        }
        R4.W();
    }

    @Override // m.InterfaceC0673B
    public final void a(m mVar) {
        this.f3120d = mVar;
    }

    @Override // m.l
    public final boolean b(o oVar) {
        return this.f3120d.q(oVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        b((o) getAdapter().getItem(i2));
    }
}
