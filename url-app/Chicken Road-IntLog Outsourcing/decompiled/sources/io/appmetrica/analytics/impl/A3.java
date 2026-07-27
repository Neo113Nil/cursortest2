package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class A3 implements W7 {

    /* renamed from: a, reason: collision with root package name */
    public final C1148z3 f6497a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6498b;

    public A3(C1148z3 c1148z3, List<C1148z3> list) {
        this.f6497a = c1148z3;
        this.f6498b = list;
    }

    public final A3 a(C1148z3 c1148z3, List<C1148z3> list) {
        return new A3(c1148z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f6497a;
    }

    public final C1148z3 c() {
        return this.f6497a;
    }

    public final List<C1148z3> d() {
        return this.f6498b;
    }

    public final C1148z3 e() {
        return this.f6497a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a32 = (A3) obj;
        return kotlin.jvm.internal.i.a(this.f6497a, a32.f6497a) && kotlin.jvm.internal.i.a(this.f6498b, a32.f6498b);
    }

    public final int hashCode() {
        return this.f6498b.hashCode() + (this.f6497a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f6497a + ", candidates=" + this.f6498b + ')';
    }

    public static A3 a(A3 a32, C1148z3 c1148z3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c1148z3 = a32.f6497a;
        }
        if ((i2 & 2) != 0) {
            list = a32.f6498b;
        }
        a32.getClass();
        return new A3(c1148z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final List<C1148z3> a() {
        return this.f6498b;
    }
}
