package F0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import z2.C1441y;

/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f2613e;

    /* renamed from: i, reason: collision with root package name */
    public static final k f2614i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f2615j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f2616k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f2617l;

    /* renamed from: d, reason: collision with root package name */
    public final int f2618d;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f2613e = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f2614i = kVar4;
        f2615j = kVar5;
        f2616k = kVar6;
        f2617l = kVar7;
        C1441y.e(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i2) {
        this.f2618d = i2;
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.f2618d, ((k) obj).f2618d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f2618d == ((k) obj).f2618d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2618d;
    }

    public final String toString() {
        return AbstractC0017m.l(new StringBuilder("FontWeight(weight="), this.f2618d, ')');
    }
}
