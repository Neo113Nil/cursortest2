package h;

import java.util.Iterator;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641b extends AbstractC0644e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0642c f6812d;

    /* renamed from: e, reason: collision with root package name */
    public C0642c f6813e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6814i;

    public C0641b(C0642c c0642c, C0642c c0642c2, int i2) {
        this.f6814i = i2;
        this.f6812d = c0642c2;
        this.f6813e = c0642c;
    }

    @Override // h.AbstractC0644e
    public final void a(C0642c c0642c) {
        C0642c c0642c2;
        C0642c c0642c3 = null;
        if (this.f6812d == c0642c && c0642c == this.f6813e) {
            this.f6813e = null;
            this.f6812d = null;
        }
        C0642c c0642c4 = this.f6812d;
        if (c0642c4 == c0642c) {
            switch (this.f6814i) {
                case 0:
                    c0642c2 = c0642c4.f6818j;
                    break;
                default:
                    c0642c2 = c0642c4.f6817i;
                    break;
            }
            this.f6812d = c0642c2;
        }
        C0642c c0642c5 = this.f6813e;
        if (c0642c5 == c0642c) {
            C0642c c0642c6 = this.f6812d;
            if (c0642c5 != c0642c6 && c0642c6 != null) {
                c0642c3 = b(c0642c5);
            }
            this.f6813e = c0642c3;
        }
    }

    public final C0642c b(C0642c c0642c) {
        switch (this.f6814i) {
            case 0:
                return c0642c.f6817i;
            default:
                return c0642c.f6818j;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6813e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0642c c0642c = this.f6813e;
        C0642c c0642c2 = this.f6812d;
        this.f6813e = (c0642c == c0642c2 || c0642c2 == null) ? null : b(c0642c);
        return c0642c;
    }
}
