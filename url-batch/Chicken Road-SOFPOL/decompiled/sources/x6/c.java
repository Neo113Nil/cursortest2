package x6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements Iterator, r6.a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f8665e;

    /* renamed from: g, reason: collision with root package name */
    public Object f8667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f8668h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8664d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f8666f = -1;

    public c(d dVar) {
        this.f8668h = dVar;
        this.f8665e = new j((i) dVar.f8670b);
    }

    public void a() {
        Object next;
        d dVar = (d) this.f8668h;
        do {
            Iterator it = this.f8665e;
            if (!it.hasNext()) {
                this.f8666f = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((s1) dVar.f8671c).i(next)).booleanValue());
        this.f8667g = next;
        this.f8666f = 1;
    }

    public void b() {
        Iterator it = this.f8665e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((i) this.f8668h).f8677c.i(next)).booleanValue()) {
                this.f8666f = 1;
                this.f8667g = next;
                return;
            }
        }
        this.f8666f = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8664d) {
            case 0:
                if (this.f8666f == -1) {
                    a();
                }
                if (this.f8666f == 1) {
                }
                break;
            default:
                if (this.f8666f == -1) {
                    b();
                }
                if (this.f8666f == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8664d) {
            case 0:
                if (this.f8666f == -1) {
                    a();
                }
                if (this.f8666f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f8667g;
                this.f8667g = null;
                this.f8666f = -1;
                return obj;
            default:
                if (this.f8666f == -1) {
                    b();
                }
                if (this.f8666f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f8667g;
                this.f8667g = null;
                this.f8666f = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8664d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(i iVar) {
        this.f8668h = iVar;
        this.f8665e = iVar.f8676b.iterator();
    }
}
