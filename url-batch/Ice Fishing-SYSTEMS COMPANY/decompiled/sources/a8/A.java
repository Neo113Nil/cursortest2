package a8;

import java.util.List;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class A implements Y7.e {

    /* renamed from: a, reason: collision with root package name */
    public final Y7.e f4425a;

    /* renamed from: b, reason: collision with root package name */
    public final Y7.e f4426b;

    public A(Y7.e keyDesc, Y7.e valueDesc) {
        kotlin.jvm.internal.h.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.h.e(valueDesc, "valueDesc");
        this.f4425a = keyDesc;
        this.f4426b = valueDesc;
    }

    @Override // Y7.e
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // Y7.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer J = M7.q.J(name);
        if (J != null) {
            return J.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // Y7.e
    public final com.bumptech.glide.e d() {
        return Y7.i.i;
    }

    @Override // Y7.e
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        a9.getClass();
        return kotlin.jvm.internal.h.a(this.f4425a, a9.f4425a) && kotlin.jvm.internal.h.a(this.f4426b, a9.f4426b);
    }

    @Override // Y7.e
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // Y7.e
    public final boolean g() {
        return false;
    }

    @Override // Y7.e
    public final List getAnnotations() {
        return C4985p.f40358n;
    }

    @Override // Y7.e
    public final List h(int i) {
        if (i >= 0) {
            return C4985p.f40358n;
        }
        throw new IllegalArgumentException(D.y.i(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f4426b.hashCode() + ((this.f4425a.hashCode() + 710441009) * 31);
    }

    @Override // Y7.e
    public final Y7.e i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(D.y.i(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i4 = i % 2;
        if (i4 == 0) {
            return this.f4425a;
        }
        if (i4 == 1) {
            return this.f4426b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // Y7.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(D.y.i(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f4425a + ", " + this.f4426b + ')';
    }

    @Override // Y7.e
    public final void b() {
    }
}
