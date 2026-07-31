package S1;

import g2.InterfaceC0439a;
import java.util.Iterator;
import m2.C0652b;

/* loaded from: classes.dex */
public final class z implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4327d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f4328e;

    /* renamed from: f, reason: collision with root package name */
    public int f4329f;

    public z(Iterator it) {
        f2.j.f(it, "iterator");
        this.f4328e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f4327d) {
            case 0:
                return this.f4328e.hasNext();
        }
        while (true) {
            int i3 = this.f4329f;
            it = this.f4328e;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f4329f--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f4327d) {
            case 0:
                int i3 = this.f4329f;
                this.f4329f = i3 + 1;
                if (i3 >= 0) {
                    return new x(i3, this.f4328e.next());
                }
                m.D0();
                throw null;
        }
        while (true) {
            int i4 = this.f4329f;
            it = this.f4328e;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f4329f--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4327d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(C0652b c0652b) {
        this.f4328e = c0652b.f6995a.iterator();
        this.f4329f = c0652b.f6996b;
    }
}
