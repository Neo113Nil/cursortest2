package a3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Iterator, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public Object f74f;
    public int g = -2;
    public final /* synthetic */ e h;

    public d(e eVar) {
        this.h = eVar;
    }

    public final void a() {
        Object b2;
        if (this.g == -2) {
            w2.a aVar = w2.d.f3588f;
            b2 = Integer.valueOf(w2.d.f3588f.a().nextInt(2147418112) + 65536);
        } else {
            g gVar = (g) this.h.f76b;
            Object obj = this.f74f;
            u2.c.b(obj);
            b2 = gVar.b(obj);
        }
        this.f74f = b2;
        this.g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g < 0) {
            a();
        }
        return this.g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g < 0) {
            a();
        }
        if (this.g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f74f;
        u2.c.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
