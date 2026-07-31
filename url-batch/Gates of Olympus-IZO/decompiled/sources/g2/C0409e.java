package g2;

import M1.s;
import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409e implements Iterator, InterfaceC0184a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f4844e;

    /* renamed from: g, reason: collision with root package name */
    public Object f4846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0410f f4847h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4843d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4845f = -1;

    public C0409e(s sVar) {
        this.f4847h = sVar;
        this.f4844e = new m((l) sVar.f2801b);
    }

    public void a() {
        Object next;
        do {
            Iterator it = this.f4844e;
            if (!it.hasNext()) {
                this.f4845f = 0;
                return;
            } else {
                next = it.next();
                ((s) this.f4847h).getClass();
            }
        } while (((Boolean) k.f4851f.j(next)).booleanValue());
        this.f4846g = next;
        this.f4845f = 1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y1.c, Z1.j] */
    public void b() {
        Iterator it = this.f4844e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((l) this.f4847h).f4855c.j(next)).booleanValue()) {
                this.f4845f = 1;
                this.f4846g = next;
                return;
            }
        }
        this.f4845f = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4843d) {
            case 0:
                if (this.f4845f == -1) {
                    a();
                }
                if (this.f4845f == 1) {
                }
                break;
            default:
                if (this.f4845f == -1) {
                    b();
                }
                if (this.f4845f == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4843d) {
            case 0:
                if (this.f4845f == -1) {
                    a();
                }
                if (this.f4845f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f4846g;
                this.f4846g = null;
                this.f4845f = -1;
                return obj;
            default:
                if (this.f4845f == -1) {
                    b();
                }
                if (this.f4845f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f4846g;
                this.f4846g = null;
                this.f4845f = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4843d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0409e(l lVar) {
        this.f4847h = lVar;
        this.f4844e = ((InterfaceC0410f) lVar.f4854b).iterator();
    }
}
