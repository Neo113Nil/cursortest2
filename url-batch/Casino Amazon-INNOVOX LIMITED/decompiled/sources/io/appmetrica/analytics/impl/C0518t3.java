package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0518t3 implements R7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0493s3 f1494a;
    public final List b;

    public C0518t3(C0493s3 c0493s3, List<C0493s3> list) {
        this.f1494a = c0493s3;
        this.b = list;
    }

    public final C0518t3 a(C0493s3 c0493s3, List<C0493s3> list) {
        return new C0518t3(c0493s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f1494a;
    }

    public final C0493s3 c() {
        return this.f1494a;
    }

    public final List<C0493s3> d() {
        return this.b;
    }

    public final C0493s3 e() {
        return this.f1494a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0518t3)) {
            return false;
        }
        C0518t3 c0518t3 = (C0518t3) obj;
        return Intrinsics.areEqual(this.f1494a, c0518t3.f1494a) && Intrinsics.areEqual(this.b, c0518t3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1494a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f1494a + ", candidates=" + this.b + ')';
    }

    public static C0518t3 a(C0518t3 c0518t3, C0493s3 c0493s3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c0493s3 = c0518t3.f1494a;
        }
        if ((i & 2) != 0) {
            list = c0518t3.b;
        }
        c0518t3.getClass();
        return new C0518t3(c0493s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final List<C0493s3> a() {
        return this.b;
    }
}
