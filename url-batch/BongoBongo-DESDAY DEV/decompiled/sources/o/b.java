package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3395a;

    /* renamed from: b, reason: collision with root package name */
    public c f3396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3397c;

    public b(c cVar, c cVar2, int i) {
        this.f3397c = i;
        this.f3395a = cVar2;
        this.f3396b = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3395a == cVar && cVar == this.f3396b) {
            this.f3396b = null;
            this.f3395a = null;
        }
        c cVar4 = this.f3395a;
        if (cVar4 == cVar) {
            switch (this.f3397c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f3400c;
                    break;
            }
            this.f3395a = cVar2;
        }
        c cVar5 = this.f3396b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3395a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3396b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3397c) {
            case 0:
                return cVar.f3400c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3396b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3396b;
        c cVar2 = this.f3395a;
        this.f3396b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
