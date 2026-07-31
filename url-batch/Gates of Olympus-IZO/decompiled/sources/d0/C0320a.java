package d0;

import M0.j;
import Z1.i;
import b0.InterfaceC0285r;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320a {

    /* renamed from: a, reason: collision with root package name */
    public M0.b f4439a;

    /* renamed from: b, reason: collision with root package name */
    public j f4440b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0285r f4441c;

    /* renamed from: d, reason: collision with root package name */
    public long f4442d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0320a)) {
            return false;
        }
        C0320a c0320a = (C0320a) obj;
        return i.a(this.f4439a, c0320a.f4439a) && this.f4440b == c0320a.f4440b && i.a(this.f4441c, c0320a.f4441c) && a0.f.a(this.f4442d, c0320a.f4442d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4442d) + ((this.f4441c.hashCode() + ((this.f4440b.hashCode() + (this.f4439a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f4439a + ", layoutDirection=" + this.f4440b + ", canvas=" + this.f4441c + ", size=" + ((Object) a0.f.f(this.f4442d)) + ')';
    }
}
