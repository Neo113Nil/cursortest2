package n;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public c f5231d;

    /* renamed from: e, reason: collision with root package name */
    public c f5232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5233f;

    public b(c cVar, c cVar2, int i) {
        this.f5233f = i;
        this.f5231d = cVar2;
        this.f5232e = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f5231d == cVar && cVar == this.f5232e) {
            this.f5232e = null;
            this.f5231d = null;
        }
        c cVar4 = this.f5231d;
        if (cVar4 == cVar) {
            switch (this.f5233f) {
                case 0:
                    cVar2 = cVar4.f5237g;
                    break;
                default:
                    cVar2 = cVar4.f5236f;
                    break;
            }
            this.f5231d = cVar2;
        }
        c cVar5 = this.f5232e;
        if (cVar5 == cVar) {
            c cVar6 = this.f5231d;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f5232e = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f5233f) {
            case 0:
                return cVar.f5236f;
            default:
                return cVar.f5237g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5232e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f5232e;
        c cVar2 = this.f5231d;
        this.f5232e = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
