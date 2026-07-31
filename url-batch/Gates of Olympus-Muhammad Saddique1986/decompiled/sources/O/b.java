package O;

import S1.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends h implements L.b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f3717g;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3718d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3719e;

    /* renamed from: f, reason: collision with root package name */
    public final N.c f3720f;

    static {
        P.b bVar = P.b.f3913a;
        f3717g = new b(bVar, bVar, N.c.f3502f);
    }

    public b(Object obj, Object obj2, N.c cVar) {
        this.f3718d = obj;
        this.f3719e = obj2;
        this.f3720f = cVar;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        N.c cVar = this.f3720f;
        cVar.getClass();
        return cVar.f3504e;
    }

    @Override // S1.AbstractC0222a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3720f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f3718d, this.f3720f);
    }
}
