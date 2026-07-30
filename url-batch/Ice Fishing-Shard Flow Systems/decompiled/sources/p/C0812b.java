package p;

import java.util.Iterator;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812b extends AbstractC0815e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0813c f7137d;

    /* renamed from: e, reason: collision with root package name */
    public C0813c f7138e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7139i;

    public C0812b(C0813c c0813c, C0813c c0813c2, int i2) {
        this.f7139i = i2;
        this.f7137d = c0813c2;
        this.f7138e = c0813c;
    }

    @Override // p.AbstractC0815e
    public final void a(C0813c c0813c) {
        C0813c c0813c2;
        C0813c c0813c3 = null;
        if (this.f7137d == c0813c && c0813c == this.f7138e) {
            this.f7138e = null;
            this.f7137d = null;
        }
        C0813c c0813c4 = this.f7137d;
        if (c0813c4 == c0813c) {
            switch (this.f7139i) {
                case 0:
                    c0813c2 = c0813c4.f7143l;
                    break;
                default:
                    c0813c2 = c0813c4.f7142i;
                    break;
            }
            this.f7137d = c0813c2;
        }
        C0813c c0813c5 = this.f7138e;
        if (c0813c5 == c0813c) {
            C0813c c0813c6 = this.f7137d;
            if (c0813c5 != c0813c6 && c0813c6 != null) {
                c0813c3 = b(c0813c5);
            }
            this.f7138e = c0813c3;
        }
    }

    public final C0813c b(C0813c c0813c) {
        switch (this.f7139i) {
            case 0:
                return c0813c.f7142i;
            default:
                return c0813c.f7143l;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7138e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0813c c0813c = this.f7138e;
        C0813c c0813c2 = this.f7137d;
        this.f7138e = (c0813c == c0813c2 || c0813c2 == null) ? null : b(c0813c);
        return c0813c;
    }
}
