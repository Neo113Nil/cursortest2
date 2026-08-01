package v0;

import de.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends p implements Set, Collection, xd.a {

    /* renamed from: s, reason: collision with root package name */
    public static final b f9929s;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9930e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f9931i;

    /* renamed from: r, reason: collision with root package name */
    public final u0.b f9932r;

    static {
        w0.b bVar = w0.b.f10002a;
        f9929s = new b(bVar, bVar, u0.b.f9576t);
    }

    public b(Object obj, Object obj2, u0.b bVar) {
        this.f9930e = obj;
        this.f9931i = obj2;
        this.f9932r = bVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f9932r.f9578s;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9932r.containsKey(obj);
    }

    @Override // kotlin.collections.p, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e(this.f9930e, this.f9932r);
    }
}
