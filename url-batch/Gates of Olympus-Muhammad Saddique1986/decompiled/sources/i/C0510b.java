package i;

import java.util.Iterator;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510b extends AbstractC0513e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0511c f6223d;

    /* renamed from: e, reason: collision with root package name */
    public C0511c f6224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6225f;

    public C0510b(C0511c c0511c, C0511c c0511c2, int i3) {
        this.f6225f = i3;
        this.f6223d = c0511c2;
        this.f6224e = c0511c;
    }

    @Override // i.AbstractC0513e
    public final void a(C0511c c0511c) {
        C0511c c0511c2;
        C0511c c0511c3 = null;
        if (this.f6223d == c0511c && c0511c == this.f6224e) {
            this.f6224e = null;
            this.f6223d = null;
        }
        C0511c c0511c4 = this.f6223d;
        if (c0511c4 == c0511c) {
            switch (this.f6225f) {
                case 0:
                    c0511c2 = c0511c4.f6229g;
                    break;
                default:
                    c0511c2 = c0511c4.f6228f;
                    break;
            }
            this.f6223d = c0511c2;
        }
        C0511c c0511c5 = this.f6224e;
        if (c0511c5 == c0511c) {
            C0511c c0511c6 = this.f6223d;
            if (c0511c5 != c0511c6 && c0511c6 != null) {
                c0511c3 = b(c0511c5);
            }
            this.f6224e = c0511c3;
        }
    }

    public final C0511c b(C0511c c0511c) {
        switch (this.f6225f) {
            case 0:
                return c0511c.f6228f;
            default:
                return c0511c.f6229g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6224e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0511c c0511c = this.f6224e;
        C0511c c0511c2 = this.f6223d;
        this.f6224e = (c0511c == c0511c2 || c0511c2 == null) ? null : b(c0511c);
        return c0511c;
    }
}
