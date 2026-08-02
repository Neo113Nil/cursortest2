package t0;

import T.C0097o;
import a0.AbstractC0135a;
import v2.AbstractC1478z;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435j implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15316a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15317b;

    public C1435j(C0097o c0097o, int i4) {
        this.f15316a = (c0097o.f2860e & 1) != 0;
        this.f15317b = AbstractC0135a.n(i4, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1435j c1435j = (C1435j) obj;
        return AbstractC1478z.f15691a.c(this.f15317b, c1435j.f15317b).c(this.f15316a, c1435j.f15316a).e();
    }
}
