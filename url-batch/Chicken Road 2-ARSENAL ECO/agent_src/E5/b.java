package E5;

import java.util.Iterator;
import l5.AbstractC0507k;
import l5.s;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f687f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f688g;

    /* renamed from: h, reason: collision with root package name */
    public int f689h;

    public b(Iterator iterator) {
        kotlin.jvm.internal.i.e(iterator, "iterator");
        this.f688g = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f687f) {
            case 0:
                break;
            default:
                return this.f688g.hasNext();
        }
        while (true) {
            int i7 = this.f689h;
            it = this.f688g;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f689h--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f687f) {
            case 0:
                break;
            default:
                int i7 = this.f689h;
                this.f689h = i7 + 1;
                if (i7 >= 0) {
                    return new s(i7, this.f688g.next());
                }
                AbstractC0507k.B();
                throw null;
        }
        while (true) {
            int i8 = this.f689h;
            it = this.f688g;
            if (i8 > 0 && it.hasNext()) {
                it.next();
                this.f689h--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f687f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f688g = cVar.f690a.iterator();
        this.f689h = cVar.f691b;
    }
}
