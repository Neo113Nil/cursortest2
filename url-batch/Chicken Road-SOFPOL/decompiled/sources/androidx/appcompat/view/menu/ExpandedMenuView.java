package androidx.appcompat.view.menu;

import a0.g1;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.h;
import k.j;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f341d = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g1 E = g1.E(context, attributeSet, f341d, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) E.f85c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(E.q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(E.q(1));
        }
        E.G();
    }

    @Override // k.h
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        throw null;
    }
}
