package n;

import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2697f;

    /* renamed from: g, reason: collision with root package name */
    public c f2698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2699h;

    public b(c cVar, c cVar2, int i) {
        this.f2699h = i;
        this.f2697f = cVar2;
        this.f2698g = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f2697f == cVar && cVar == this.f2698g) {
            this.f2698g = null;
            this.f2697f = null;
        }
        c cVar4 = this.f2697f;
        if (cVar4 == cVar) {
            switch (this.f2699h) {
                case 0:
                    cVar2 = cVar4.i;
                    break;
                default:
                    cVar2 = cVar4.f2702h;
                    break;
            }
            this.f2697f = cVar2;
        }
        c cVar5 = this.f2698g;
        if (cVar5 == cVar) {
            c cVar6 = this.f2697f;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f2698g = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f2699h) {
            case 0:
                return cVar.f2702h;
            default:
                return cVar.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2698g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f2698g;
        c cVar2 = this.f2697f;
        this.f2698g = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
