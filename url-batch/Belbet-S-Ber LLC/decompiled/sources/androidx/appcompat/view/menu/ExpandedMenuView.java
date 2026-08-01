package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.emoji2.text.t;
import k.a0;
import k.l;
import k.m;
import k.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f266g = {R.attr.background, R.attr.divider};

    /* renamed from: f, reason: collision with root package name */
    public m f267f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t i = t.i(R.attr.listViewStyle, 0, context, attributeSet, f266g);
        TypedArray typedArray = (TypedArray) i.f473b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i.d(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i.d(1));
        }
        i.k();
    }

    @Override // k.l
    public final boolean a(o oVar) {
        return this.f267f.q(oVar, null, 0);
    }

    @Override // k.a0
    public final void c(m mVar) {
        this.f267f = mVar;
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
        a((o) getAdapter().getItem(i));
    }
}
