package com.moat.analytics.mobile.tjy;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
class bp implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bo f7273a;

    /* renamed from: b, reason: collision with root package name */
    private int f7274b;

    private bp(bo boVar) {
        this.f7273a = boVar;
        this.f7274b = -1;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public View next() {
        ViewGroup viewGroup;
        this.f7274b++;
        viewGroup = this.f7273a.f7272a;
        return viewGroup.getChildAt(this.f7274b);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ViewGroup viewGroup;
        int i = this.f7274b + 1;
        viewGroup = this.f7273a.f7272a;
        return i < viewGroup.getChildCount();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Not implemented. Under development.");
    }
}
