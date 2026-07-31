package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0493s3 implements U7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1477a;
    public final T7 b;

    public C0493s3(Map<String, String> map, T7 t7) {
        this.f1477a = map;
        this.b = t7;
    }

    public final C0493s3 a(Map<String, String> map, T7 t7) {
        return new C0493s3(map, t7);
    }

    public final Map<String, String> b() {
        return this.f1477a;
    }

    public final T7 c() {
        return this.b;
    }

    public final Map<String, String> d() {
        return this.f1477a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493s3)) {
            return false;
        }
        C0493s3 c0493s3 = (C0493s3) obj;
        return Intrinsics.areEqual(this.f1477a, c0493s3.f1477a) && this.b == c0493s3.b;
    }

    public final int hashCode() {
        Map map = this.f1477a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f1477a + ", source=" + this.b + ')';
    }

    public static C0493s3 a(C0493s3 c0493s3, Map map, T7 t7, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c0493s3.f1477a;
        }
        if ((i & 2) != 0) {
            t7 = c0493s3.b;
        }
        c0493s3.getClass();
        return new C0493s3(map, t7);
    }

    @Override // io.appmetrica.analytics.impl.U7
    public final T7 a() {
        return this.b;
    }
}
