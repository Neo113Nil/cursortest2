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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f133g = {R.attr.background, R.attr.divider};

    /* renamed from: f, reason: collision with root package name */
    public m f134f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t w3 = t.w(context, attributeSet, f133g, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) w3.f356c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(w3.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(w3.n(1));
        }
        w3.y();
    }

    @Override // k.l
    public final boolean a(o oVar) {
        return this.f134f.q(oVar, null, 0);
    }

    @Override // k.a0
    public final void c(m mVar) {
        this.f134f = mVar;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        a((o) getAdapter().getItem(i));
    }
}
