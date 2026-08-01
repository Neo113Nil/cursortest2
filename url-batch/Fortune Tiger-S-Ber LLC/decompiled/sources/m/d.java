package m;

import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2901f;
    public boolean g = true;
    public final /* synthetic */ f h;

    public d(f fVar) {
        this.h = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = this.f2901f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f2900i;
            this.f2901f = cVar3;
            this.g = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f2902f != null;
        }
        c cVar = this.f2901f;
        return (cVar == null || cVar.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f2901f = this.h.f2902f;
        } else {
            c cVar = this.f2901f;
            this.f2901f = cVar != null ? cVar.h : null;
        }
        return this.f2901f;
    }
}
