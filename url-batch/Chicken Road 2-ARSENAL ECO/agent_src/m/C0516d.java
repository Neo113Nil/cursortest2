package m;

import java.util.Iterator;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516d extends AbstractC0517e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public C0515c f5319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5320g = true;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0518f f5321h;

    public C0516d(C0518f c0518f) {
        this.f5321h = c0518f;
    }

    @Override // m.AbstractC0517e
    public final void a(C0515c c0515c) {
        C0515c c0515c2 = this.f5319f;
        if (c0515c == c0515c2) {
            C0515c c0515c3 = c0515c2.f5318i;
            this.f5319f = c0515c3;
            this.f5320g = c0515c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5320g) {
            return this.f5321h.f5322f != null;
        }
        C0515c c0515c = this.f5319f;
        return (c0515c == null || c0515c.f5317h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5320g) {
            this.f5320g = false;
            this.f5319f = this.f5321h.f5322f;
        } else {
            C0515c c0515c = this.f5319f;
            this.f5319f = c0515c != null ? c0515c.f5317h : null;
        }
        return this.f5319f;
    }
}
