package O;

import Z1.i;
import a2.InterfaceC0184a;
import g2.C0411g;
import g2.l;
import j.C0475A;
import j.C0507y;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2982d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2983e;

    /* renamed from: f, reason: collision with root package name */
    public int f2984f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2985g;

    public c(Object obj, Map map) {
        this.f2982d = 0;
        this.f2983e = obj;
        this.f2985g = map;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Y1.a, Z1.j] */
    public void a() {
        Object j3;
        int i3 = this.f2984f;
        l lVar = (l) this.f2985g;
        if (i3 == -2) {
            j3 = lVar.f4855c.b();
        } else {
            Y1.c cVar = (Y1.c) lVar.f4854b;
            Object obj = this.f2983e;
            i.c(obj);
            j3 = cVar.j(obj);
        }
        this.f2983e = j3;
        this.f2984f = j3 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2982d) {
            case 0:
                return this.f2984f < ((Map) this.f2985g).size();
            case 1:
                if (this.f2984f < 0) {
                    a();
                }
                return this.f2984f == 1;
            default:
                return ((C0411g) this.f2983e).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2982d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f2983e;
                this.f2984f++;
                Object obj2 = ((Map) this.f2985g).get(obj);
                if (obj2 != null) {
                    this.f2983e = ((a) obj2).f2977b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f2984f < 0) {
                    a();
                }
                if (this.f2984f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f2983e;
                i.d(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f2984f = -1;
                return obj3;
            default:
                return ((C0411g) this.f2983e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2982d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i3 = this.f2984f;
                if (i3 != -1) {
                    ((C0475A) this.f2985g).k(i3);
                    this.f2984f = -1;
                    return;
                }
                return;
        }
    }

    public c(l lVar) {
        this.f2982d = 1;
        this.f2985g = lVar;
        this.f2984f = -2;
    }

    public c(C0475A c0475a) {
        this.f2982d = 2;
        this.f2985g = c0475a;
        this.f2984f = -1;
        this.f2983e = g2.i.S(new C0507y(c0475a, this, null));
    }
}
