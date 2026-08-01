package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3614a;

    /* renamed from: b, reason: collision with root package name */
    public c f3615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3616c;

    public b(c cVar, c cVar2, int i) {
        this.f3616c = i;
        this.f3614a = cVar2;
        this.f3615b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3614a == cVar && cVar == this.f3615b) {
            this.f3615b = null;
            this.f3614a = null;
        }
        c cVar4 = this.f3614a;
        if (cVar4 == cVar) {
            switch (this.f3616c) {
                case 0:
                    cVar2 = cVar4.f3620d;
                    break;
                default:
                    cVar2 = cVar4.f3619c;
                    break;
            }
            this.f3614a = cVar2;
        }
        c cVar5 = this.f3615b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3614a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3615b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3616c) {
            case 0:
                return cVar.f3619c;
            default:
                return cVar.f3620d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3615b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3615b;
        c cVar2 = this.f3614a;
        this.f3615b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
