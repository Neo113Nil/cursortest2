package m2;

import S1.s;
import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655e implements Iterator, InterfaceC0439a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f6999e;

    /* renamed from: g, reason: collision with root package name */
    public Object f7001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0656f f7002h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6998d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f7000f = -1;

    public C0655e(s sVar) {
        this.f7002h = sVar;
        this.f6999e = new l((k) sVar.f4318b);
    }

    public void a() {
        Object next;
        do {
            Iterator it = this.f6999e;
            if (!it.hasNext()) {
                this.f7000f = 0;
                return;
            } else {
                next = it.next();
                ((s) this.f7002h).getClass();
            }
        } while (((Boolean) j.f7006f.n(next)).booleanValue());
        this.f7001g = next;
        this.f7000f = 1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [e2.c, f2.k] */
    public void b() {
        Iterator it = this.f6999e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((k) this.f7002h).f7010c.n(next)).booleanValue()) {
                this.f7000f = 1;
                this.f7001g = next;
                return;
            }
        }
        this.f7000f = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6998d) {
            case 0:
                if (this.f7000f == -1) {
                    a();
                }
                if (this.f7000f == 1) {
                }
                break;
            default:
                if (this.f7000f == -1) {
                    b();
                }
                if (this.f7000f == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6998d) {
            case 0:
                if (this.f7000f == -1) {
                    a();
                }
                if (this.f7000f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f7001g;
                this.f7001g = null;
                this.f7000f = -1;
                return obj;
            default:
                if (this.f7000f == -1) {
                    b();
                }
                if (this.f7000f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f7001g;
                this.f7001g = null;
                this.f7000f = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6998d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0655e(k kVar) {
        this.f7002h = kVar;
        this.f6999e = ((InterfaceC0656f) kVar.f7009b).iterator();
    }
}
