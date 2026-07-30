package kotlin.collections;

import f6.InterfaceC0406a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6120d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f6121e;

    /* renamed from: i, reason: collision with root package name */
    public int f6122i;

    public E(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f6121e = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f6120d) {
            case 0:
                return this.f6121e.hasNext();
        }
        while (true) {
            int i2 = this.f6122i;
            it = this.f6121e;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f6122i--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f6120d) {
            case 0:
                int i2 = this.f6122i;
                this.f6122i = i2 + 1;
                if (i2 >= 0) {
                    return new IndexedValue(i2, this.f6121e.next());
                }
                r.f();
                throw null;
        }
        while (true) {
            int i5 = this.f6122i;
            it = this.f6121e;
            if (i5 > 0 && it.hasNext()) {
                it.next();
                this.f6122i--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6120d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public E(l6.b bVar) {
        this.f6121e = bVar.f6307a.iterator();
        this.f6122i = bVar.f6308b;
    }
}
