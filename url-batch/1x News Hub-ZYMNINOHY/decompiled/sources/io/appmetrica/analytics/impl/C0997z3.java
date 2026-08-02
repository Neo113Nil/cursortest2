package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997z3 implements Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8660a;

    /* renamed from: b, reason: collision with root package name */
    public final Y7 f8661b;

    public C0997z3(Map<String, String> map, Y7 y7) {
        this.f8660a = map;
        this.f8661b = y7;
    }

    public final C0997z3 a(Map<String, String> map, Y7 y7) {
        return new C0997z3(map, y7);
    }

    public final Map<String, String> b() {
        return this.f8660a;
    }

    public final Y7 c() {
        return this.f8661b;
    }

    public final Map<String, String> d() {
        return this.f8660a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0997z3)) {
            return false;
        }
        C0997z3 c0997z3 = (C0997z3) obj;
        return kotlin.jvm.internal.j.a(this.f8660a, c0997z3.f8660a) && this.f8661b == c0997z3.f8661b;
    }

    public final int hashCode() {
        Map map = this.f8660a;
        return this.f8661b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f8660a + ", source=" + this.f8661b + ')';
    }

    public static C0997z3 a(C0997z3 c0997z3, Map map, Y7 y7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c0997z3.f8660a;
        }
        if ((i3 & 2) != 0) {
            y7 = c0997z3.f8661b;
        }
        c0997z3.getClass();
        return new C0997z3(map, y7);
    }

    @Override // io.appmetrica.analytics.impl.Z7
    public final Y7 a() {
        return this.f8661b;
    }
}
