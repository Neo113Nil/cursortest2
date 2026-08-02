package com.startapp.sdk.internal;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class c6 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f6744a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f6745b;

    public c6(Comparator comparator, Comparator comparator2) {
        this.f6744a = comparator;
        this.f6745b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f6744a.compare(obj, obj2);
        return compare == 0 ? this.f6745b.compare(obj, obj2) : compare;
    }
}
