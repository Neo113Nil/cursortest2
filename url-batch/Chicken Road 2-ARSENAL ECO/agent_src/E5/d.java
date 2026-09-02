package E5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class d implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f692f;

    /* renamed from: g, reason: collision with root package name */
    public int f693g = -1;

    /* renamed from: h, reason: collision with root package name */
    public Object f694h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f695i;

    public d(e eVar) {
        this.f695i = eVar;
        this.f692f = ((Iterable) ((h) eVar.f698c).f700b).iterator();
    }

    public final void a() {
        Object next;
        boolean booleanValue;
        do {
            Iterator it = this.f692f;
            if (!it.hasNext()) {
                this.f693g = 0;
                return;
            }
            next = it.next();
            e eVar = this.f695i;
            booleanValue = ((Boolean) eVar.f697b.invoke(next)).booleanValue();
            eVar.getClass();
        } while (!booleanValue);
        this.f694h = next;
        this.f693g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f693g == -1) {
            a();
        }
        return this.f693g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f693g == -1) {
            a();
        }
        if (this.f693g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f694h;
        this.f694h = null;
        this.f693g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
