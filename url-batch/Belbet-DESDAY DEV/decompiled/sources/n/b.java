package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3269a;

    /* renamed from: b, reason: collision with root package name */
    public c f3270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3271c;

    public b(c cVar, c cVar2, int i) {
        this.f3271c = i;
        this.f3269a = cVar2;
        this.f3270b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3269a == cVar && cVar == this.f3270b) {
            this.f3270b = null;
            this.f3269a = null;
        }
        c cVar4 = this.f3269a;
        if (cVar4 == cVar) {
            switch (this.f3271c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f3274c;
                    break;
            }
            this.f3269a = cVar2;
        }
        c cVar5 = this.f3270b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3269a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3270b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3271c) {
            case 0:
                return cVar.f3274c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3270b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3270b;
        c cVar2 = this.f3269a;
        this.f3270b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
