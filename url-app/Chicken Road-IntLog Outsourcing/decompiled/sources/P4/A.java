package P4;

import g4.C0471p;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class A implements N4.e {

    /* renamed from: a, reason: collision with root package name */
    public final N4.e f2318a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.e f2319b;

    public A(N4.e keyDesc, N4.e valueDesc) {
        kotlin.jvm.internal.i.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.i.e(valueDesc, "valueDesc");
        this.f2318a = keyDesc;
        this.f2319b = valueDesc;
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer P5 = B4.r.P(name);
        if (P5 != null) {
            return P5.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // N4.e
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        return N4.j.f2192d;
    }

    @Override // N4.e
    public final int d() {
        return 2;
    }

    @Override // N4.e
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        a6.getClass();
        return kotlin.jvm.internal.i.a(this.f2318a, a6.f2318a) && kotlin.jvm.internal.i.a(this.f2319b, a6.f2319b);
    }

    @Override // N4.e
    public final List g(int i2) {
        if (i2 >= 0) {
            return C0471p.f5750a;
        }
        throw new IllegalArgumentException(B0.o.g(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // N4.e
    public final List getAnnotations() {
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final N4.e h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(B0.o.g(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i3 = i2 % 2;
        if (i3 == 0) {
            return this.f2318a;
        }
        if (i3 == 1) {
            return this.f2319b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f2319b.hashCode() + ((this.f2318a.hashCode() + 710441009) * 31);
    }

    @Override // N4.e
    public final boolean i(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(B0.o.g(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // N4.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f2318a + ", " + this.f2319b + ')';
    }

    @Override // N4.e
    public final void f() {
    }
}
