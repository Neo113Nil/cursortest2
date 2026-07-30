package f2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final k f3277g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f3278h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f3279i;

    /* renamed from: f, reason: collision with root package name */
    public final int f3280f;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f3277g = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f3278h = kVar4;
        f3279i = kVar5;
        e6.m.X(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i7) {
        this.f3280f = i7;
        if (1 > i7 || i7 >= 1001) {
            throw new IllegalArgumentException(a0.m.i("Font weight can be in range [1, 1000]. Current value: ", i7).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return r6.k.g(this.f3280f, ((k) obj).f3280f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f3280f == ((k) obj).f3280f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3280f;
    }

    public final String toString() {
        return a0.m.l(new StringBuilder("FontWeight(weight="), this.f3280f, ')');
    }
}
