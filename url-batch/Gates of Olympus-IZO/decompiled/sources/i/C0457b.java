package i;

import java.util.Iterator;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457b extends AbstractC0460e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0458c f5083d;

    /* renamed from: e, reason: collision with root package name */
    public C0458c f5084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5085f;

    public C0457b(C0458c c0458c, C0458c c0458c2, int i3) {
        this.f5085f = i3;
        this.f5083d = c0458c2;
        this.f5084e = c0458c;
    }

    @Override // i.AbstractC0460e
    public final void a(C0458c c0458c) {
        C0458c c0458c2;
        C0458c c0458c3 = null;
        if (this.f5083d == c0458c && c0458c == this.f5084e) {
            this.f5084e = null;
            this.f5083d = null;
        }
        C0458c c0458c4 = this.f5083d;
        if (c0458c4 == c0458c) {
            switch (this.f5085f) {
                case 0:
                    c0458c2 = c0458c4.f5089g;
                    break;
                default:
                    c0458c2 = c0458c4.f5088f;
                    break;
            }
            this.f5083d = c0458c2;
        }
        C0458c c0458c5 = this.f5084e;
        if (c0458c5 == c0458c) {
            C0458c c0458c6 = this.f5083d;
            if (c0458c5 != c0458c6 && c0458c6 != null) {
                c0458c3 = b(c0458c5);
            }
            this.f5084e = c0458c3;
        }
    }

    public final C0458c b(C0458c c0458c) {
        switch (this.f5085f) {
            case 0:
                return c0458c.f5088f;
            default:
                return c0458c.f5089g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5084e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0458c c0458c = this.f5084e;
        C0458c c0458c2 = this.f5083d;
        this.f5084e = (c0458c == c0458c2 || c0458c2 == null) ? null : b(c0458c);
        return c0458c;
    }
}
