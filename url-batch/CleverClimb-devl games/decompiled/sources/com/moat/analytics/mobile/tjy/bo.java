package com.moat.analytics.mobile.tjy;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
class bo implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f7272a;

    private bo(ViewGroup viewGroup) {
        this.f7272a = viewGroup;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new bp(this);
    }
}
