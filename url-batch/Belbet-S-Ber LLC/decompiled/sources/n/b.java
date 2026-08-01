package n;

import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2740f;

    /* renamed from: g, reason: collision with root package name */
    public c f2741g;
    public final /* synthetic */ int h;

    public b(c cVar, c cVar2, int i) {
        this.h = i;
        this.f2740f = cVar2;
        this.f2741g = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f2740f == cVar && cVar == this.f2741g) {
            this.f2741g = null;
            this.f2740f = null;
        }
        c cVar4 = this.f2740f;
        if (cVar4 == cVar) {
            switch (this.h) {
                case 0:
                    cVar2 = cVar4.i;
                    break;
                default:
                    cVar2 = cVar4.h;
                    break;
            }
            this.f2740f = cVar2;
        }
        c cVar5 = this.f2741g;
        if (cVar5 == cVar) {
            c cVar6 = this.f2740f;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f2741g = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.h) {
            case 0:
                return cVar.h;
            default:
                return cVar.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2741g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f2741g;
        c cVar2 = this.f2740f;
        this.f2741g = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
