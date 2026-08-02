package r2;

import Y1.C0120q;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f10276a;

    /* renamed from: b, reason: collision with root package name */
    public int f10277b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.d f10278c;

    public e(c2.d dVar) {
        this.f10278c = dVar;
    }

    public final void a() {
        Object invoke;
        int i3 = this.f10277b;
        c2.d dVar = this.f10278c;
        if (i3 == -2) {
            dVar.getClass();
            invoke = Integer.valueOf(n2.e.f10172a.a() + 65536);
        } else {
            C0120q c0120q = (C0120q) dVar.f2635b;
            Object obj = this.f10276a;
            kotlin.jvm.internal.j.b(obj);
            invoke = c0120q.invoke(obj);
        }
        this.f10276a = invoke;
        this.f10277b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10277b < 0) {
            a();
        }
        return this.f10277b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10277b < 0) {
            a();
        }
        if (this.f10277b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f10276a;
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f10277b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
