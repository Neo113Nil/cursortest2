package m;

import java.util.Iterator;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276d extends AbstractC1277e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1275c f14285a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14286b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1278f f14287c;

    public C1276d(C1278f c1278f) {
        this.f14287c = c1278f;
    }

    @Override // m.AbstractC1277e
    public final void a(C1275c c1275c) {
        C1275c c1275c2 = this.f14285a;
        if (c1275c == c1275c2) {
            C1275c c1275c3 = c1275c2.f14284d;
            this.f14285a = c1275c3;
            this.f14286b = c1275c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14286b) {
            return this.f14287c.f14288a != null;
        }
        C1275c c1275c = this.f14285a;
        return (c1275c == null || c1275c.f14283c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14286b) {
            this.f14286b = false;
            this.f14285a = this.f14287c.f14288a;
        } else {
            C1275c c1275c = this.f14285a;
            this.f14285a = c1275c != null ? c1275c.f14283c : null;
        }
        return this.f14285a;
    }
}
