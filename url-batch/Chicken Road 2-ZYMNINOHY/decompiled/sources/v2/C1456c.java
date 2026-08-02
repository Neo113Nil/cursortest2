package v2;

import a.AbstractC0124a;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1456c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15610a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f15611b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15613d;

    public C1456c(C1465l c1465l) {
        this.f15613d = c1465l;
        Collection collection = c1465l.f15654b;
        this.f15612c = collection;
        this.f15611b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C1465l c1465l = (C1465l) this.f15613d;
        c1465l.c();
        if (c1465l.f15654b != ((Collection) this.f15612c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15610a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f15611b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15610a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f15611b.next();
                this.f15612c = (Collection) entry.getValue();
                return ((C1457d) this.f15613d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f15611b.next();
                this.f15612c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f15611b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15610a) {
            case 0:
                AbstractC0124a.s("no calls to next() since the last call to remove()", ((Collection) this.f15612c) != null);
                this.f15611b.remove();
                ((C1457d) this.f15613d).f15620d.f15595e -= ((Collection) this.f15612c).size();
                ((Collection) this.f15612c).clear();
                this.f15612c = null;
                break;
            case 1:
                AbstractC0124a.s("no calls to next() since the last call to remove()", ((Map.Entry) this.f15612c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f15612c).getValue();
                this.f15611b.remove();
                ((C1458e) this.f15613d).f15624b.f15595e -= collection.size();
                collection.clear();
                this.f15612c = null;
                break;
            default:
                this.f15611b.remove();
                C1465l c1465l = (C1465l) this.f15613d;
                W w4 = c1465l.f15657e;
                w4.f15595e--;
                c1465l.d();
                break;
        }
    }

    public C1456c(C1465l c1465l, ListIterator listIterator) {
        this.f15613d = c1465l;
        this.f15612c = c1465l.f15654b;
        this.f15611b = listIterator;
    }

    public C1456c(C1458e c1458e, Iterator it) {
        this.f15611b = it;
        this.f15613d = c1458e;
    }

    public C1456c(C1457d c1457d) {
        this.f15613d = c1457d;
        this.f15611b = c1457d.f15619c.entrySet().iterator();
    }
}
