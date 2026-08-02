package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class A3 implements W7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0997z3 f5723a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5724b;

    public A3(C0997z3 c0997z3, List<C0997z3> list) {
        this.f5723a = c0997z3;
        this.f5724b = list;
    }

    public final A3 a(C0997z3 c0997z3, List<C0997z3> list) {
        return new A3(c0997z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f5723a;
    }

    public final C0997z3 c() {
        return this.f5723a;
    }

    public final List<C0997z3> d() {
        return this.f5724b;
    }

    public final C0997z3 e() {
        return this.f5723a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a3 = (A3) obj;
        return kotlin.jvm.internal.j.a(this.f5723a, a3.f5723a) && kotlin.jvm.internal.j.a(this.f5724b, a3.f5724b);
    }

    public final int hashCode() {
        return this.f5724b.hashCode() + (this.f5723a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f5723a + ", candidates=" + this.f5724b + ')';
    }

    public static A3 a(A3 a3, C0997z3 c0997z3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            c0997z3 = a3.f5723a;
        }
        if ((i3 & 2) != 0) {
            list = a3.f5724b;
        }
        a3.getClass();
        return new A3(c0997z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final List<C0997z3> a() {
        return this.f5724b;
    }
}
