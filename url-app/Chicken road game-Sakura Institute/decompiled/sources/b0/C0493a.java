package b0;

import M0.k;
import Z.r;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493a {

    /* renamed from: a, reason: collision with root package name */
    public M0.b f5598a;

    /* renamed from: b, reason: collision with root package name */
    public k f5599b;

    /* renamed from: c, reason: collision with root package name */
    public r f5600c;

    /* renamed from: d, reason: collision with root package name */
    public long f5601d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493a)) {
            return false;
        }
        C0493a c0493a = (C0493a) obj;
        return Intrinsics.a(this.f5598a, c0493a.f5598a) && this.f5599b == c0493a.f5599b && Intrinsics.a(this.f5600c, c0493a.f5600c) && Y.f.a(this.f5601d, c0493a.f5601d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5601d) + ((this.f5600c.hashCode() + ((this.f5599b.hashCode() + (this.f5598a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f5598a + ", layoutDirection=" + this.f5599b + ", canvas=" + this.f5600c + ", size=" + ((Object) Y.f.f(this.f5601d)) + ')';
    }
}
