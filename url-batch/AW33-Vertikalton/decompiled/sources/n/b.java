package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3264a;

    /* renamed from: b, reason: collision with root package name */
    public c f3265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3266c;

    public b(c cVar, c cVar2, int i) {
        this.f3266c = i;
        this.f3264a = cVar2;
        this.f3265b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3264a == cVar && cVar == this.f3265b) {
            this.f3265b = null;
            this.f3264a = null;
        }
        c cVar4 = this.f3264a;
        if (cVar4 == cVar) {
            switch (this.f3266c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f3269c;
                    break;
            }
            this.f3264a = cVar2;
        }
        c cVar5 = this.f3265b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3264a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3265b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3266c) {
            case 0:
                return cVar.f3269c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3265b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3265b;
        c cVar2 = this.f3264a;
        this.f3265b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
