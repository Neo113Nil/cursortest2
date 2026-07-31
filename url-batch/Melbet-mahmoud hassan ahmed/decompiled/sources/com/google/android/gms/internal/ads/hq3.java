package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public final class hq3<F, T> extends AbstractList<T> {

    /* renamed from: f, reason: collision with root package name */
    private final List<F> f6386f;

    /* renamed from: g, reason: collision with root package name */
    private final gq3<F, T> f6387g;

    public hq3(List<F> list, gq3<F, T> gq3Var) {
        this.f6386f = list;
        this.f6387g = gq3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i7) {
        T t6 = (T) xr.b(((Integer) this.f6386f.get(i7)).intValue());
        return t6 == null ? (T) xr.AD_FORMAT_TYPE_UNSPECIFIED : t6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6386f.size();
    }
}
