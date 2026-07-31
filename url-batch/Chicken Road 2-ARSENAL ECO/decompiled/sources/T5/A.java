package T5;

import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public final class A implements R5.e {

    /* renamed from: a, reason: collision with root package name */
    public final R5.e f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final R5.e f2382b;

    public A(R5.e keyDesc, R5.e valueDesc) {
        kotlin.jvm.internal.i.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.i.e(valueDesc, "valueDesc");
        this.f2381a = keyDesc;
        this.f2382b = valueDesc;
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer J3 = F5.q.J(name);
        if (J3 != null) {
            return J3.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // R5.e
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // R5.e
    public final A3.c c() {
        return R5.i.f2174d;
    }

    @Override // R5.e
    public final int d() {
        return 2;
    }

    @Override // R5.e
    public final String e(int i7) {
        return String.valueOf(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        a7.getClass();
        return kotlin.jvm.internal.i.a(this.f2381a, a7.f2381a) && kotlin.jvm.internal.i.a(this.f2382b, a7.f2382b);
    }

    @Override // R5.e
    public final List g(int i7) {
        if (i7 >= 0) {
            return C0512p.f5303f;
        }
        throw new IllegalArgumentException(C1.c.g("Illegal index ", i7, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // R5.e
    public final List getAnnotations() {
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final R5.e h(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(C1.c.g("Illegal index ", i7, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i8 = i7 % 2;
        if (i8 == 0) {
            return this.f2381a;
        }
        if (i8 == 1) {
            return this.f2382b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f2382b.hashCode() + ((this.f2381a.hashCode() + 710441009) * 31);
    }

    @Override // R5.e
    public final boolean i(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(C1.c.g("Illegal index ", i7, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // R5.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f2381a + ", " + this.f2382b + ')';
    }

    @Override // R5.e
    public final void f() {
    }
}
