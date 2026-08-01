package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3618a;

    /* renamed from: b, reason: collision with root package name */
    public c f3619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3620c;

    public b(c cVar, c cVar2, int i) {
        this.f3620c = i;
        this.f3618a = cVar2;
        this.f3619b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3618a == cVar && cVar == this.f3619b) {
            this.f3619b = null;
            this.f3618a = null;
        }
        c cVar4 = this.f3618a;
        if (cVar4 == cVar) {
            switch (this.f3620c) {
                case 0:
                    cVar2 = cVar4.f3624d;
                    break;
                default:
                    cVar2 = cVar4.f3623c;
                    break;
            }
            this.f3618a = cVar2;
        }
        c cVar5 = this.f3619b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3618a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3619b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3620c) {
            case 0:
                return cVar.f3623c;
            default:
                return cVar.f3624d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3619b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3619b;
        c cVar2 = this.f3618a;
        this.f3619b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
