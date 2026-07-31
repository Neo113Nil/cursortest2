package com.yandex.mobile.ads.impl;

import android.util.LruCache;

/* loaded from: classes3.dex */
public final class u60 extends LruCache<ob2<?>, ga1> {
    public u60(int i4) {
        super(i4);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z4, ob2<?> ob2Var, ga1 ga1Var, ga1 ga1Var2) {
        ga1 ga1Var3 = ga1Var;
        if (ga1Var3 != null) {
            ga1Var3.a();
        }
    }
}
