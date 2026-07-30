package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4821d extends AbstractC4822e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4820c f39667n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39668u = true;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4823f f39669v;

    public C4821d(C4823f c4823f) {
        this.f39669v = c4823f;
    }

    @Override // o.AbstractC4822e
    public final void a(C4820c c4820c) {
        C4820c c4820c2 = this.f39667n;
        if (c4820c == c4820c2) {
            C4820c c4820c3 = c4820c2.f39666w;
            this.f39667n = c4820c3;
            this.f39668u = c4820c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39668u) {
            return this.f39669v.f39670n != null;
        }
        C4820c c4820c = this.f39667n;
        return (c4820c == null || c4820c.f39665v == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f39668u) {
            this.f39668u = false;
            this.f39667n = this.f39669v.f39670n;
        } else {
            C4820c c4820c = this.f39667n;
            this.f39667n = c4820c != null ? c4820c.f39665v : null;
        }
        return this.f39667n;
    }
}
