package m;

import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2898f;
    public c g;
    public final /* synthetic */ int h;

    public b(c cVar, c cVar2, int i4) {
        this.h = i4;
        this.f2898f = cVar2;
        this.g = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f2898f == cVar && cVar == this.g) {
            this.g = null;
            this.f2898f = null;
        }
        c cVar4 = this.f2898f;
        if (cVar4 == cVar) {
            switch (this.h) {
                case 0:
                    cVar2 = cVar4.f2900i;
                    break;
                default:
                    cVar2 = cVar4.h;
                    break;
            }
            this.f2898f = cVar2;
        }
        c cVar5 = this.g;
        if (cVar5 == cVar) {
            c cVar6 = this.f2898f;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.g = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.h) {
            case 0:
                return cVar.h;
            default:
                return cVar.f2900i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.g;
        c cVar2 = this.f2898f;
        this.g = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
