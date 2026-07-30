package y6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f9912f;

    /* renamed from: g, reason: collision with root package name */
    public int f9913g = -1;

    /* renamed from: h, reason: collision with root package name */
    public Object f9914h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f9915i;

    public j(k kVar) {
        this.f9915i = kVar;
        this.f9912f = kVar.f9917b.iterator();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [q6.c, r6.l] */
    public final void a() {
        Iterator it = this.f9912f;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) this.f9915i.f9918c.f(next)).booleanValue()) {
                this.f9913g = 1;
                this.f9914h = next;
                return;
            }
        }
        this.f9913g = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9913g == -1) {
            a();
        }
        return this.f9913g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9913g == -1) {
            a();
        }
        if (this.f9913g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f9914h;
        this.f9914h = null;
        this.f9913g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
