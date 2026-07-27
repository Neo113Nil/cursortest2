package A4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class d implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f89a;

    /* renamed from: b, reason: collision with root package name */
    public int f90b = -1;

    /* renamed from: c, reason: collision with root package name */
    public Object f91c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f92d;

    public d(e eVar) {
        this.f92d = eVar;
        this.f89a = eVar.f94b.iterator();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.j, t4.l] */
    public final void a() {
        Object next;
        do {
            Iterator it = this.f89a;
            if (!it.hasNext()) {
                this.f90b = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((kotlin.jvm.internal.j) this.f92d.f95c).invoke(next)).booleanValue());
        this.f91c = next;
        this.f90b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f90b == -1) {
            a();
        }
        return this.f90b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f90b == -1) {
            a();
        }
        if (this.f90b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f91c;
        this.f91c = null;
        this.f90b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
