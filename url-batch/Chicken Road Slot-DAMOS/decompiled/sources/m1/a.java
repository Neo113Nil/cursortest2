package m1;

import k1.n;
import kotlin.jvm.internal.Intrinsics;
import x2.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public x2.c f6401a;

    /* renamed from: b, reason: collision with root package name */
    public l f6402b;

    /* renamed from: c, reason: collision with root package name */
    public n f6403c;

    /* renamed from: d, reason: collision with root package name */
    public long f6404d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f6401a, aVar.f6401a) && this.f6402b == aVar.f6402b && Intrinsics.a(this.f6403c, aVar.f6403c) && j1.e.a(this.f6404d, aVar.f6404d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6404d) + ((this.f6403c.hashCode() + ((this.f6402b.hashCode() + (this.f6401a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f6401a + ", layoutDirection=" + this.f6402b + ", canvas=" + this.f6403c + ", size=" + ((Object) j1.e.d(this.f6404d)) + ')';
    }
}
