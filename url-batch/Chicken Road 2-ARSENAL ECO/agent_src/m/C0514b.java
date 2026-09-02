package m;

import java.util.Iterator;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514b extends AbstractC0517e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public C0515c f5312f;

    /* renamed from: g, reason: collision with root package name */
    public C0515c f5313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5314h;

    public C0514b(C0515c c0515c, C0515c c0515c2, int i7) {
        this.f5314h = i7;
        this.f5312f = c0515c2;
        this.f5313g = c0515c;
    }

    @Override // m.AbstractC0517e
    public final void a(C0515c c0515c) {
        C0515c c0515c2;
        C0515c c0515c3 = null;
        if (this.f5312f == c0515c && c0515c == this.f5313g) {
            this.f5313g = null;
            this.f5312f = null;
        }
        C0515c c0515c4 = this.f5312f;
        if (c0515c4 == c0515c) {
            switch (this.f5314h) {
                case 0:
                    c0515c2 = c0515c4.f5318i;
                    break;
                default:
                    c0515c2 = c0515c4.f5317h;
                    break;
            }
            this.f5312f = c0515c2;
        }
        C0515c c0515c5 = this.f5313g;
        if (c0515c5 == c0515c) {
            C0515c c0515c6 = this.f5312f;
            if (c0515c5 != c0515c6 && c0515c6 != null) {
                c0515c3 = b(c0515c5);
            }
            this.f5313g = c0515c3;
        }
    }

    public final C0515c b(C0515c c0515c) {
        switch (this.f5314h) {
            case 0:
                return c0515c.f5317h;
            default:
                return c0515c.f5318i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5313g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0515c c0515c = this.f5313g;
        C0515c c0515c2 = this.f5312f;
        this.f5313g = (c0515c == c0515c2 || c0515c2 == null) ? null : b(c0515c);
        return c0515c;
    }
}
