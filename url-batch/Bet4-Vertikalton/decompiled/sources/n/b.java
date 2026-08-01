package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3190a;

    /* renamed from: b, reason: collision with root package name */
    public c f3191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3192c;

    public b(c cVar, c cVar2, int i) {
        this.f3192c = i;
        this.f3190a = cVar2;
        this.f3191b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3190a == cVar && cVar == this.f3191b) {
            this.f3191b = null;
            this.f3190a = null;
        }
        c cVar4 = this.f3190a;
        if (cVar4 == cVar) {
            switch (this.f3192c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f3195c;
                    break;
            }
            this.f3190a = cVar2;
        }
        c cVar5 = this.f3191b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3190a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3191b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3192c) {
            case 0:
                return cVar.f3195c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3191b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3191b;
        c cVar2 = this.f3190a;
        this.f3191b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
