package H0;

/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f2596e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f2597f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f2598g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f2599h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f2600i;

    /* renamed from: d, reason: collision with root package name */
    public final int f2601d;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f2596e = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f2597f = kVar4;
        f2598g = kVar5;
        f2599h = kVar6;
        f2600i = kVar7;
        S1.m.A0(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i3) {
        this.f2601d = i3;
        if (1 > i3 || i3 >= 1001) {
            throw new IllegalArgumentException(A.k.h("Font weight can be in range [1, 1000]. Current value: ", i3).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f2.j.g(this.f2601d, ((k) obj).f2601d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f2601d == ((k) obj).f2601d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2601d;
    }

    public final String toString() {
        return A.k.j(new StringBuilder("FontWeight(weight="), this.f2601d, ')');
    }
}
