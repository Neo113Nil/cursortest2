package n;

import java.util.Iterator;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118d extends AbstractC1119e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1117c f9978a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9979b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1120f f9980c;

    public C1118d(C1120f c1120f) {
        this.f9980c = c1120f;
    }

    @Override // n.AbstractC1119e
    public final void a(C1117c c1117c) {
        C1117c c1117c2 = this.f9978a;
        if (c1117c == c1117c2) {
            C1117c c1117c3 = c1117c2.f9977d;
            this.f9978a = c1117c3;
            this.f9979b = c1117c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9979b) {
            return this.f9980c.f9981a != null;
        }
        C1117c c1117c = this.f9978a;
        return (c1117c == null || c1117c.f9976c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9979b) {
            this.f9979b = false;
            this.f9978a = this.f9980c.f9981a;
        } else {
            C1117c c1117c = this.f9978a;
            this.f9978a = c1117c != null ? c1117c.f9976c : null;
        }
        return this.f9978a;
    }
}
