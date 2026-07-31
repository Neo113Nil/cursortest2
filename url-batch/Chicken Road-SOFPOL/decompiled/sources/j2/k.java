package j2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f3994e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f3995f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f3996g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f3997h;

    /* renamed from: d, reason: collision with root package name */
    public final int f3998d;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f3994e = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f3995f = kVar4;
        f3996g = kVar5;
        f3997h = kVar7;
        s6.a.y(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i) {
        this.f3998d = i;
        boolean z3 = false;
        if (1 <= i && i < 1001) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        l2.a.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return q6.i.f(this.f3998d, ((k) obj).f3998d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f3998d == ((k) obj).f3998d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3998d;
    }

    public final String toString() {
        return a0.q.k(new StringBuilder("FontWeight(weight="), this.f3998d, ')');
    }
}
