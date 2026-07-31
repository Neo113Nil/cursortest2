package U0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f857e;

    /* renamed from: f, reason: collision with root package name */
    public int f858f = -1;

    /* renamed from: g, reason: collision with root package name */
    public Object f859g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f860h;

    public b(c cVar) {
        this.f860h = cVar;
        this.f857e = cVar.f861a.iterator();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [O0.l, P0.i] */
    public final void a() {
        Object next;
        do {
            Iterator it = this.f857e;
            if (!it.hasNext()) {
                this.f858f = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) this.f860h.f862b.j(next)).booleanValue());
        this.f859g = next;
        this.f858f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f858f == -1) {
            a();
        }
        return this.f858f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f858f == -1) {
            a();
        }
        if (this.f858f == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f859g;
        this.f859g = null;
        this.f858f = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
