package com.startapp.sdk.internal;

import java.util.Comparator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t5 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f434a;
    public final Comparator b;

    public t5(Comparator comparator, Comparator comparator2) {
        this.f434a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f434a.compare(obj, obj2);
        return compare == 0 ? this.b.compare(obj, obj2) : compare;
    }
}
