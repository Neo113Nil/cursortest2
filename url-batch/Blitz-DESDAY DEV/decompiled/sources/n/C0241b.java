package n;

import java.util.Iterator;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241b extends AbstractC0244e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0242c f3214a;

    /* renamed from: b, reason: collision with root package name */
    public C0242c f3215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3216c;

    public C0241b(C0242c c0242c, C0242c c0242c2, int i) {
        this.f3216c = i;
        this.f3214a = c0242c2;
        this.f3215b = c0242c;
    }

    @Override // n.AbstractC0244e
    public final void a(C0242c c0242c) {
        C0242c c0242c2;
        C0242c c0242c3 = null;
        if (this.f3214a == c0242c && c0242c == this.f3215b) {
            this.f3215b = null;
            this.f3214a = null;
        }
        C0242c c0242c4 = this.f3214a;
        if (c0242c4 == c0242c) {
            switch (this.f3216c) {
                case 0:
                    c0242c2 = c0242c4.d;
                    break;
                default:
                    c0242c2 = c0242c4.f3219c;
                    break;
            }
            this.f3214a = c0242c2;
        }
        C0242c c0242c5 = this.f3215b;
        if (c0242c5 == c0242c) {
            C0242c c0242c6 = this.f3214a;
            if (c0242c5 != c0242c6 && c0242c6 != null) {
                c0242c3 = b(c0242c5);
            }
            this.f3215b = c0242c3;
        }
    }

    public final C0242c b(C0242c c0242c) {
        switch (this.f3216c) {
            case 0:
                return c0242c.f3219c;
            default:
                return c0242c.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3215b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0242c c0242c = this.f3215b;
        C0242c c0242c2 = this.f3214a;
        this.f3215b = (c0242c == c0242c2 || c0242c2 == null) ? null : b(c0242c);
        return c0242c;
    }
}
