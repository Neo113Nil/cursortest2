package O;

import e2.InterfaceC0424c;
import f2.j;
import g2.InterfaceC0439a;
import j.C0519A;
import j.C0551y;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import m2.C0657g;
import m2.k;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3721d;

    /* renamed from: e, reason: collision with root package name */
    public int f3722e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3723f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3724g;

    public c(Object obj, Map map) {
        this.f3721d = 0;
        this.f3723f = obj;
        this.f3724g = map;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [e2.a, f2.k] */
    public void a() {
        Object n3;
        int i3 = this.f3722e;
        k kVar = (k) this.f3724g;
        if (i3 == -2) {
            n3 = kVar.f7010c.b();
        } else {
            InterfaceC0424c interfaceC0424c = (InterfaceC0424c) kVar.f7009b;
            Object obj = this.f3723f;
            j.c(obj);
            n3 = interfaceC0424c.n(obj);
        }
        this.f3723f = n3;
        this.f3722e = n3 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3721d) {
            case 0:
                return this.f3722e < ((Map) this.f3724g).size();
            case 1:
                return ((C0657g) this.f3723f).hasNext();
            default:
                if (this.f3722e < 0) {
                    a();
                }
                return this.f3722e == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3721d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f3723f;
                this.f3722e++;
                Object obj2 = ((Map) this.f3724g).get(obj);
                if (obj2 != null) {
                    this.f3723f = ((a) obj2).f3716b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                return ((C0657g) this.f3723f).next();
            default:
                if (this.f3722e < 0) {
                    a();
                }
                if (this.f3722e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f3723f;
                j.d(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f3722e = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3721d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i3 = this.f3722e;
                if (i3 != -1) {
                    ((C0519A) this.f3724g).k(i3);
                    this.f3722e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(k kVar) {
        this.f3721d = 2;
        this.f3724g = kVar;
        this.f3722e = -2;
    }

    public c(C0519A c0519a) {
        this.f3721d = 1;
        this.f3724g = c0519a;
        this.f3722e = -1;
        this.f3723f = l0.c.F(new C0551y(c0519a, this, null));
    }
}
