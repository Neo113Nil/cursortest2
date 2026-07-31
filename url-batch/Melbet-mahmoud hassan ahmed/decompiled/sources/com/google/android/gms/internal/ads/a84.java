package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a84 implements Comparable<a84> {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2681f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2682g;

    public a84(c0 c0Var, int i7) {
        this.f2681f = 1 == (c0Var.f3652d & 1);
        this.f2682g = k84.m(i7, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a84 a84Var) {
        return t63.i().d(this.f2682g, a84Var.f2682g).d(this.f2681f, a84Var.f2681f).a();
    }
}
