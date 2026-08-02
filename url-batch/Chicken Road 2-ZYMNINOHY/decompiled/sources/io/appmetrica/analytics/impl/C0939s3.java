package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939s3 implements Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0913r3 f12715a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12716b;

    public C0939s3(C0913r3 c0913r3, List<C0913r3> list) {
        this.f12715a = c0913r3;
        this.f12716b = list;
    }

    public final C0939s3 a(C0913r3 c0913r3, List<C0913r3> list) {
        return new C0939s3(c0913r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final Object b() {
        return this.f12715a;
    }

    public final C0913r3 c() {
        return this.f12715a;
    }

    public final List<C0913r3> d() {
        return this.f12716b;
    }

    public final C0913r3 e() {
        return this.f12715a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939s3)) {
            return false;
        }
        C0939s3 c0939s3 = (C0939s3) obj;
        return kotlin.jvm.internal.i.a(this.f12715a, c0939s3.f12715a) && kotlin.jvm.internal.i.a(this.f12716b, c0939s3.f12716b);
    }

    public final int hashCode() {
        return this.f12716b.hashCode() + (this.f12715a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f12715a + ", candidates=" + this.f12716b + ')';
    }

    public static C0939s3 a(C0939s3 c0939s3, C0913r3 c0913r3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c0913r3 = c0939s3.f12715a;
        }
        if ((i4 & 2) != 0) {
            list = c0939s3.f12716b;
        }
        c0939s3.getClass();
        return new C0939s3(c0913r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final List<C0913r3> a() {
        return this.f12716b;
    }
}
