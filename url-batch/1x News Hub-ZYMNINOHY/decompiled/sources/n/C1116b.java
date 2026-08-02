package n;

import java.util.Iterator;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116b extends AbstractC1119e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1117c f9971a;

    /* renamed from: b, reason: collision with root package name */
    public C1117c f9972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9973c;

    public C1116b(C1117c c1117c, C1117c c1117c2, int i3) {
        this.f9973c = i3;
        this.f9971a = c1117c2;
        this.f9972b = c1117c;
    }

    @Override // n.AbstractC1119e
    public final void a(C1117c c1117c) {
        C1117c c1117c2;
        C1117c c1117c3 = null;
        if (this.f9971a == c1117c && c1117c == this.f9972b) {
            this.f9972b = null;
            this.f9971a = null;
        }
        C1117c c1117c4 = this.f9971a;
        if (c1117c4 == c1117c) {
            switch (this.f9973c) {
                case 0:
                    c1117c2 = c1117c4.f9977d;
                    break;
                default:
                    c1117c2 = c1117c4.f9976c;
                    break;
            }
            this.f9971a = c1117c2;
        }
        C1117c c1117c5 = this.f9972b;
        if (c1117c5 == c1117c) {
            C1117c c1117c6 = this.f9971a;
            if (c1117c5 != c1117c6 && c1117c6 != null) {
                c1117c3 = b(c1117c5);
            }
            this.f9972b = c1117c3;
        }
    }

    public final C1117c b(C1117c c1117c) {
        switch (this.f9973c) {
            case 0:
                return c1117c.f9976c;
            default:
                return c1117c.f9977d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9972b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1117c c1117c = this.f9972b;
        C1117c c1117c2 = this.f9971a;
        this.f9972b = (c1117c == c1117c2 || c1117c2 == null) ? null : b(c1117c);
        return c1117c;
    }
}
