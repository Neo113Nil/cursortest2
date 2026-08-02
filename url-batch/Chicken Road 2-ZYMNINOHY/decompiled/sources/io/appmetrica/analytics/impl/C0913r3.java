package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913r3 implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12644a;

    /* renamed from: b, reason: collision with root package name */
    public final S7 f12645b;

    public C0913r3(Map<String, String> map, S7 s7) {
        this.f12644a = map;
        this.f12645b = s7;
    }

    public final C0913r3 a(Map<String, String> map, S7 s7) {
        return new C0913r3(map, s7);
    }

    public final Map<String, String> b() {
        return this.f12644a;
    }

    public final S7 c() {
        return this.f12645b;
    }

    public final Map<String, String> d() {
        return this.f12644a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0913r3)) {
            return false;
        }
        C0913r3 c0913r3 = (C0913r3) obj;
        return kotlin.jvm.internal.i.a(this.f12644a, c0913r3.f12644a) && this.f12645b == c0913r3.f12645b;
    }

    public final int hashCode() {
        Map map = this.f12644a;
        return this.f12645b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f12644a + ", source=" + this.f12645b + ')';
    }

    public static C0913r3 a(C0913r3 c0913r3, Map map, S7 s7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            map = c0913r3.f12644a;
        }
        if ((i4 & 2) != 0) {
            s7 = c0913r3.f12645b;
        }
        c0913r3.getClass();
        return new C0913r3(map, s7);
    }

    @Override // io.appmetrica.analytics.impl.T7
    public final S7 a() {
        return this.f12645b;
    }
}
