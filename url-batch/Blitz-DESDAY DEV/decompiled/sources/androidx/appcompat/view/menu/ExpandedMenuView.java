package androidx.appcompat.view.menu;

import A1.j;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC0158A;
import k.l;
import k.m;
import k.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, InterfaceC0158A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1324b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public m f1325a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j t2 = j.t(context, attributeSet, f1324b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) t2.f81c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(t2.j(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(t2.j(1));
        }
        t2.v();
    }

    @Override // k.l
    public final boolean b(o oVar) {
        return this.f1325a.q(oVar, null, 0);
    }

    @Override // k.InterfaceC0158A
    public final void c(m mVar) {
        this.f1325a = mVar;
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
        b((o) getAdapter().getItem(i));
    }
}
