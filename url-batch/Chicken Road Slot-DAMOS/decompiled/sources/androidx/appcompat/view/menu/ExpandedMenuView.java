package androidx.appcompat.view.menu;

import a1.n;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.h;
import l.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f381d = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        n z10 = n.z(context, attributeSet, f381d, i3);
        TypedArray typedArray = (TypedArray) z10.f40e;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(z10.r(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(z10.r(1));
        }
        z10.D();
    }

    @Override // l.h
    public final boolean a(j jVar) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        throw null;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
