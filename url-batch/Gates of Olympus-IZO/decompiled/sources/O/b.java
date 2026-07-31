package O;

import M1.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends h implements L.b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f2978g;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2979d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2980e;

    /* renamed from: f, reason: collision with root package name */
    public final N.c f2981f;

    static {
        P.b bVar = P.b.f3020a;
        f2978g = new b(bVar, bVar, N.c.f2820f);
    }

    public b(Object obj, Object obj2, N.c cVar) {
        this.f2979d = obj;
        this.f2980e = obj2;
        this.f2981f = cVar;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        N.c cVar = this.f2981f;
        cVar.getClass();
        return cVar.f2822e;
    }

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2981f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f2979d, this.f2981f);
    }
}
