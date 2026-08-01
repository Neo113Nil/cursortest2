package n;

import java.util.Iterator;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243d extends AbstractC0244e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0242c f3220a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3221b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0245f f3222c;

    public C0243d(C0245f c0245f) {
        this.f3222c = c0245f;
    }

    @Override // n.AbstractC0244e
    public final void a(C0242c c0242c) {
        C0242c c0242c2 = this.f3220a;
        if (c0242c == c0242c2) {
            C0242c c0242c3 = c0242c2.d;
            this.f3220a = c0242c3;
            this.f3221b = c0242c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3221b) {
            return this.f3222c.f3223a != null;
        }
        C0242c c0242c = this.f3220a;
        return (c0242c == null || c0242c.f3219c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3221b) {
            this.f3221b = false;
            this.f3220a = this.f3222c.f3223a;
        } else {
            C0242c c0242c = this.f3220a;
            this.f3220a = c0242c != null ? c0242c.f3219c : null;
        }
        return this.f3220a;
    }
}
