package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.emoji2.text.s;
import j.a0;
import j.l;
import j.m;
import j.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};

    /* renamed from: f, reason: collision with root package name */
    public m f159f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        s r3 = s.r(R.attr.listViewStyle, 0, context, attributeSet, g);
        TypedArray typedArray = (TypedArray) r3.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r3.i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r3.i(1));
        }
        r3.t();
    }

    @Override // j.a0
    public final void a(m mVar) {
        this.f159f = mVar;
    }

    @Override // j.l
    public final boolean c(o oVar) {
        return this.f159f.q(oVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        c((o) getAdapter().getItem(i4));
    }
}
