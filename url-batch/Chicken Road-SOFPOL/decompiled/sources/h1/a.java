package h1;

import f1.q;
import q6.i;
import r2.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public r2.c f3070a;

    /* renamed from: b, reason: collision with root package name */
    public l f3071b;

    /* renamed from: c, reason: collision with root package name */
    public q f3072c;

    /* renamed from: d, reason: collision with root package name */
    public long f3073d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f3070a, aVar.f3070a) && this.f3071b == aVar.f3071b && i.a(this.f3072c, aVar.f3072c) && e1.e.a(this.f3073d, aVar.f3073d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f3073d) + ((this.f3072c.hashCode() + ((this.f3071b.hashCode() + (this.f3070a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f3070a + ", layoutDirection=" + this.f3071b + ", canvas=" + this.f3072c + ", size=" + ((Object) e1.e.d(this.f3073d)) + ')';
    }
}
