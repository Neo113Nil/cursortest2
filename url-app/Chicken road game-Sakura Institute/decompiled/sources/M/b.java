package M;

import J.f;
import java.util.Iterator;
import z2.AbstractC1431o;

/* loaded from: classes.dex */
public final class b extends AbstractC1431o implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final b f3531k;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3532e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3533i;

    /* renamed from: j, reason: collision with root package name */
    public final L.c f3534j;

    static {
        N.b bVar = N.b.f3612a;
        f3531k = new b(bVar, bVar, L.c.f3459l);
    }

    public b(Object obj, Object obj2, L.c cVar) {
        this.f3532e = obj;
        this.f3533i = obj2;
        this.f3534j = cVar;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3534j.containsKey(obj);
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f3534j.d();
    }

    @Override // z2.AbstractC1431o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f3532e, this.f3534j);
    }
}
