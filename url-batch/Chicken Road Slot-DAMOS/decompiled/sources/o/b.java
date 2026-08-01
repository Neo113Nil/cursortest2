package o;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public c f7296d;

    /* renamed from: e, reason: collision with root package name */
    public c f7297e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7298i;

    public b(c cVar, c cVar2, int i3) {
        this.f7298i = i3;
        this.f7296d = cVar2;
        this.f7297e = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f7296d == cVar && cVar == this.f7297e) {
            this.f7297e = null;
            this.f7296d = null;
        }
        c cVar4 = this.f7296d;
        if (cVar4 == cVar) {
            switch (this.f7298i) {
                case 0:
                    cVar2 = cVar4.f7302r;
                    break;
                default:
                    cVar2 = cVar4.f7301i;
                    break;
            }
            this.f7296d = cVar2;
        }
        c cVar5 = this.f7297e;
        if (cVar5 == cVar) {
            c cVar6 = this.f7296d;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f7297e = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f7298i) {
            case 0:
                return cVar.f7301i;
            default:
                return cVar.f7302r;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7297e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f7297e;
        c cVar2 = this.f7296d;
        this.f7297e = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
