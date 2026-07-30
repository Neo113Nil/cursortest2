package m0;

import e6.h;
import i.z;
import java.util.Iterator;
import l0.c;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends h implements j0.b {

    /* renamed from: i, reason: collision with root package name */
    public static final b f6291i;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6292f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6293g;

    /* renamed from: h, reason: collision with root package name */
    public final c f6294h;

    static {
        n0.b bVar = n0.b.f6497a;
        f6291i = new b(bVar, bVar, c.f5746h);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f6292f = obj;
        this.f6293g = obj2;
        this.f6294h = cVar;
    }

    @Override // e6.a
    public final int a() {
        c cVar = this.f6294h;
        cVar.getClass();
        return cVar.f5748g;
    }

    @Override // e6.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6294h.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new z(this.f6292f, this.f6294h);
    }
}
