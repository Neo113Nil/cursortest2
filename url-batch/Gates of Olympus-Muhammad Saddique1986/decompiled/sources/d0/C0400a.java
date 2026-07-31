package d0;

import O0.k;
import a0.C0241f;
import b0.r;
import f2.j;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400a {

    /* renamed from: a, reason: collision with root package name */
    public O0.b f5644a;

    /* renamed from: b, reason: collision with root package name */
    public k f5645b;

    /* renamed from: c, reason: collision with root package name */
    public r f5646c;

    /* renamed from: d, reason: collision with root package name */
    public long f5647d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0400a)) {
            return false;
        }
        C0400a c0400a = (C0400a) obj;
        return j.a(this.f5644a, c0400a.f5644a) && this.f5645b == c0400a.f5645b && j.a(this.f5646c, c0400a.f5646c) && C0241f.a(this.f5647d, c0400a.f5647d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5647d) + ((this.f5646c.hashCode() + ((this.f5645b.hashCode() + (this.f5644a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f5644a + ", layoutDirection=" + this.f5645b + ", canvas=" + this.f5646c + ", size=" + ((Object) C0241f.f(this.f5647d)) + ')';
    }
}
