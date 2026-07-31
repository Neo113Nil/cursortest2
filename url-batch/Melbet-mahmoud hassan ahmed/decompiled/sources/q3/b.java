package q3;

import androidx.annotation.RecentlyNonNull;
import p3.a;
import p3.a.d;

/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f20222a;

    /* renamed from: b, reason: collision with root package name */
    private final p3.a<O> f20223b;

    /* renamed from: c, reason: collision with root package name */
    private final O f20224c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20225d;

    private b(p3.a<O> aVar, O o7, String str) {
        this.f20223b = aVar;
        this.f20224c = o7;
        this.f20225d = str;
        this.f20222a = r3.n.b(aVar, o7, str);
    }

    @RecentlyNonNull
    public static <O extends a.d> b<O> a(@RecentlyNonNull p3.a<O> aVar, O o7, String str) {
        return new b<>(aVar, o7, str);
    }

    @RecentlyNonNull
    public final String b() {
        return this.f20223b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r3.n.a(this.f20223b, bVar.f20223b) && r3.n.a(this.f20224c, bVar.f20224c) && r3.n.a(this.f20225d, bVar.f20225d);
    }

    public final int hashCode() {
        return this.f20222a;
    }
}
