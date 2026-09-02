package m;

import java.util.Iterator;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274b extends AbstractC1277e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1275c f14278a;

    /* renamed from: b, reason: collision with root package name */
    public C1275c f14279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14280c;

    public C1274b(C1275c c1275c, C1275c c1275c2, int i4) {
        this.f14280c = i4;
        this.f14278a = c1275c2;
        this.f14279b = c1275c;
    }

    @Override // m.AbstractC1277e
    public final void a(C1275c c1275c) {
        C1275c c1275c2;
        C1275c c1275c3 = null;
        if (this.f14278a == c1275c && c1275c == this.f14279b) {
            this.f14279b = null;
            this.f14278a = null;
        }
        C1275c c1275c4 = this.f14278a;
        if (c1275c4 == c1275c) {
            switch (this.f14280c) {
                case 0:
                    c1275c2 = c1275c4.f14284d;
                    break;
                default:
                    c1275c2 = c1275c4.f14283c;
                    break;
            }
            this.f14278a = c1275c2;
        }
        C1275c c1275c5 = this.f14279b;
        if (c1275c5 == c1275c) {
            C1275c c1275c6 = this.f14278a;
            if (c1275c5 != c1275c6 && c1275c6 != null) {
                c1275c3 = b(c1275c5);
            }
            this.f14279b = c1275c3;
        }
    }

    public final C1275c b(C1275c c1275c) {
        switch (this.f14280c) {
            case 0:
                return c1275c.f14283c;
            default:
                return c1275c.f14284d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14279b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1275c c1275c = this.f14279b;
        C1275c c1275c2 = this.f14278a;
        this.f14279b = (c1275c == c1275c2 || c1275c2 == null) ? null : b(c1275c);
        return c1275c;
    }
}
