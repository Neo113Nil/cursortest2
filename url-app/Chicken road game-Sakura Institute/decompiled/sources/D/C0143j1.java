package D;

import kotlin.jvm.internal.Intrinsics;
import v.C1233d;

/* renamed from: D.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143j1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1233d f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final C1233d f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final C1233d f1864c;

    /* renamed from: d, reason: collision with root package name */
    public final C1233d f1865d;

    /* renamed from: e, reason: collision with root package name */
    public final C1233d f1866e;

    public C0143j1() {
        C1233d c1233d = AbstractC0140i1.f1834a;
        C1233d c1233d2 = AbstractC0140i1.f1835b;
        C1233d c1233d3 = AbstractC0140i1.f1836c;
        C1233d c1233d4 = AbstractC0140i1.f1837d;
        C1233d c1233d5 = AbstractC0140i1.f1838e;
        this.f1862a = c1233d;
        this.f1863b = c1233d2;
        this.f1864c = c1233d3;
        this.f1865d = c1233d4;
        this.f1866e = c1233d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0143j1)) {
            return false;
        }
        C0143j1 c0143j1 = (C0143j1) obj;
        return Intrinsics.a(this.f1862a, c0143j1.f1862a) && Intrinsics.a(this.f1863b, c0143j1.f1863b) && Intrinsics.a(this.f1864c, c0143j1.f1864c) && Intrinsics.a(this.f1865d, c0143j1.f1865d) && Intrinsics.a(this.f1866e, c0143j1.f1866e);
    }

    public final int hashCode() {
        return this.f1866e.hashCode() + ((this.f1865d.hashCode() + ((this.f1864c.hashCode() + ((this.f1863b.hashCode() + (this.f1862a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f1862a + ", small=" + this.f1863b + ", medium=" + this.f1864c + ", large=" + this.f1865d + ", extraLarge=" + this.f1866e + ')';
    }
}
