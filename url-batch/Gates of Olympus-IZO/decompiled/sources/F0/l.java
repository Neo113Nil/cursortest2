package F0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final l f1453e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f1454f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f1455g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f1456h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f1457i;

    /* renamed from: d, reason: collision with root package name */
    public final int f1458d;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        f1453e = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f1454f = lVar4;
        f1455g = lVar5;
        f1456h = lVar6;
        f1457i = lVar7;
        M1.m.c0(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i3) {
        this.f1458d = i3;
        if (1 > i3 || i3 >= 1001) {
            throw new IllegalArgumentException(AbstractC0080b.h("Font weight can be in range [1, 1000]. Current value: ", i3).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Z1.i.g(this.f1458d, ((l) obj).f1458d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f1458d == ((l) obj).f1458d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1458d;
    }

    public final String toString() {
        return AbstractC0080b.k(new StringBuilder("FontWeight(weight="), this.f1458d, ')');
    }
}
