package M1;

import a2.InterfaceC0184a;
import g2.C0406b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2810d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f2811e;

    /* renamed from: f, reason: collision with root package name */
    public int f2812f;

    public z(Iterator it) {
        Z1.i.f(it, "iterator");
        this.f2811e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2810d) {
            case 0:
                return this.f2811e.hasNext();
        }
        while (true) {
            int i3 = this.f2812f;
            it = this.f2811e;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f2812f--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2810d) {
            case 0:
                int i3 = this.f2812f;
                this.f2812f = i3 + 1;
                if (i3 >= 0) {
                    return new x(i3, this.f2811e.next());
                }
                m.f0();
                throw null;
        }
        while (true) {
            int i4 = this.f2812f;
            it = this.f2811e;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f2812f--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2810d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(C0406b c0406b) {
        this.f2811e = c0406b.f4840a.iterator();
        this.f2812f = c0406b.f4841b;
    }
}
