package r2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10265a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f10266b;

    /* renamed from: c, reason: collision with root package name */
    public int f10267c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f10269e;

    public b(c cVar) {
        this.f10265a = 0;
        this.f10269e = cVar;
        this.f10266b = cVar.f10270a.iterator();
        this.f10267c = -1;
    }

    public void a() {
        Object next;
        c cVar;
        do {
            Iterator it = this.f10266b;
            if (!it.hasNext()) {
                this.f10267c = 0;
                return;
            } else {
                next = it.next();
                cVar = (c) this.f10269e;
            }
        } while (((Boolean) cVar.f10272c.invoke(next)).booleanValue() != cVar.f10271b);
        this.f10268d = next;
        this.f10267c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f10268d;
        if (it2 != null && it2.hasNext()) {
            this.f10267c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f10266b;
            if (!it3.hasNext()) {
                this.f10267c = 2;
                this.f10268d = null;
                return false;
            }
            Object next = it3.next();
            d dVar = (d) this.f10269e;
            it = (Iterator) dVar.f10275c.invoke(dVar.f10274b.invoke(next));
        } while (!it.hasNext());
        this.f10268d = it;
        this.f10267c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10265a) {
            case 0:
                if (this.f10267c == -1) {
                    a();
                }
                return this.f10267c == 1;
            default:
                int i3 = this.f10267c;
                if (i3 == 1) {
                    return true;
                }
                if (i3 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10265a) {
            case 0:
                if (this.f10267c == -1) {
                    a();
                }
                if (this.f10267c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f10268d;
                this.f10268d = null;
                this.f10267c = -1;
                return obj;
            default:
                int i3 = this.f10267c;
                if (i3 == 2) {
                    throw new NoSuchElementException();
                }
                if (i3 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f10267c = 0;
                Iterator it = (Iterator) this.f10268d;
                kotlin.jvm.internal.j.b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10265a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d dVar) {
        this.f10265a = 1;
        this.f10269e = dVar;
        this.f10266b = dVar.f10273a.iterator();
    }
}
