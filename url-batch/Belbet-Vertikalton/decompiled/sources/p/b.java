package p;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3775a;

    /* renamed from: b, reason: collision with root package name */
    public c f3776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3777c;

    public b(c cVar, c cVar2, int i) {
        this.f3777c = i;
        this.f3775a = cVar2;
        this.f3776b = cVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3775a == cVar && cVar == this.f3776b) {
            this.f3776b = null;
            this.f3775a = null;
        }
        c cVar4 = this.f3775a;
        if (cVar4 == cVar) {
            switch (this.f3777c) {
                case 0:
                    cVar2 = cVar4.f3781d;
                    break;
                default:
                    cVar2 = cVar4.f3780c;
                    break;
            }
            this.f3775a = cVar2;
        }
        c cVar5 = this.f3776b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3775a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3776b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3777c) {
            case 0:
                return cVar.f3780c;
            default:
                return cVar.f3781d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3776b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3776b;
        c cVar2 = this.f3775a;
        this.f3776b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
