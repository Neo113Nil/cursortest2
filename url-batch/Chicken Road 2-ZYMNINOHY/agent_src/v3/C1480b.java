package v3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480b implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15695a;

    /* renamed from: b, reason: collision with root package name */
    public int f15696b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f15697c;

    public C1480b(o oVar) {
        this.f15695a = 1;
        this.f15696b = 10;
        this.f15697c = oVar.f15720a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f15695a) {
            case 0:
                break;
            default:
                return this.f15696b > 0 && this.f15697c.hasNext();
        }
        while (true) {
            int i4 = this.f15696b;
            it = this.f15697c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f15696b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f15695a) {
            case 0:
                break;
            default:
                int i4 = this.f15696b;
                if (i4 == 0) {
                    throw new NoSuchElementException();
                }
                this.f15696b = i4 - 1;
                return this.f15697c.next();
        }
        while (true) {
            int i5 = this.f15696b;
            it = this.f15697c;
            if (i5 > 0 && it.hasNext()) {
                it.next();
                this.f15696b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15695a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1480b(c cVar) {
        this.f15695a = 0;
        this.f15697c = cVar.f15698a.iterator();
        this.f15696b = cVar.f15699b;
    }
}
