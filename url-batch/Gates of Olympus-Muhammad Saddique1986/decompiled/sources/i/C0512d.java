package i;

import java.util.Iterator;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512d extends AbstractC0513e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0511c f6230d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6231e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0514f f6232f;

    public C0512d(C0514f c0514f) {
        this.f6232f = c0514f;
    }

    @Override // i.AbstractC0513e
    public final void a(C0511c c0511c) {
        C0511c c0511c2 = this.f6230d;
        if (c0511c == c0511c2) {
            C0511c c0511c3 = c0511c2.f6229g;
            this.f6230d = c0511c3;
            this.f6231e = c0511c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6231e) {
            return this.f6232f.f6233d != null;
        }
        C0511c c0511c = this.f6230d;
        return (c0511c == null || c0511c.f6228f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6231e) {
            this.f6231e = false;
            this.f6230d = this.f6232f.f6233d;
        } else {
            C0511c c0511c = this.f6230d;
            this.f6230d = c0511c != null ? c0511c.f6228f : null;
        }
        return this.f6230d;
    }
}
