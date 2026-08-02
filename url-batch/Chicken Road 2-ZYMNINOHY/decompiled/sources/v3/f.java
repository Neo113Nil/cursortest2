package v3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public final class f implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15701a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f15702b;

    /* renamed from: c, reason: collision with root package name */
    public int f15703c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f15705e;

    public f(g gVar) {
        this.f15701a = 0;
        this.f15705e = gVar;
        this.f15702b = gVar.f15706a.iterator();
        this.f15703c = -1;
    }

    public void a() {
        Object next;
        g gVar = (g) this.f15705e;
        do {
            Iterator it = this.f15702b;
            if (!it.hasNext()) {
                this.f15703c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) gVar.f15708c.invoke(next)).booleanValue() != gVar.f15707b);
        this.f15704d = next;
        this.f15703c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f15704d;
        if (it2 != null && it2.hasNext()) {
            this.f15703c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f15702b;
            if (!it3.hasNext()) {
                this.f15703c = 2;
                this.f15704d = null;
                return false;
            }
            Object next = it3.next();
            h hVar = (h) this.f15705e;
            it = (Iterator) hVar.f15711c.invoke(hVar.f15710b.invoke(next));
        } while (!it.hasNext());
        this.f15704d = it;
        this.f15703c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15701a) {
            case 0:
                if (this.f15703c == -1) {
                    a();
                }
                return this.f15703c == 1;
            default:
                int i4 = this.f15703c;
                if (i4 == 1) {
                    return true;
                }
                if (i4 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15701a) {
            case 0:
                if (this.f15703c == -1) {
                    a();
                }
                if (this.f15703c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f15704d;
                this.f15704d = null;
                this.f15703c = -1;
                return obj;
            default:
                int i4 = this.f15703c;
                if (i4 == 2) {
                    throw new NoSuchElementException();
                }
                if (i4 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f15703c = 0;
                Iterator it = (Iterator) this.f15704d;
                kotlin.jvm.internal.i.b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15701a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar) {
        this.f15701a = 1;
        this.f15705e = hVar;
        this.f15702b = hVar.f15709a.iterator();
    }
}
