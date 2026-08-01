package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3246a;

    /* renamed from: b, reason: collision with root package name */
    public c f3247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3248c;

    public b(c cVar, c cVar2, int i) {
        this.f3248c = i;
        this.f3246a = cVar2;
        this.f3247b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3246a == cVar && cVar == this.f3247b) {
            this.f3247b = null;
            this.f3246a = null;
        }
        c cVar4 = this.f3246a;
        if (cVar4 == cVar) {
            switch (this.f3248c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f3251c;
                    break;
            }
            this.f3246a = cVar2;
        }
        c cVar5 = this.f3247b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3246a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3247b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3248c) {
            case 0:
                return cVar.f3251c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3247b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3247b;
        c cVar2 = this.f3246a;
        this.f3247b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
