package p;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3782a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3783b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3784c;

    public d(f fVar) {
        this.f3784c = fVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2 = this.f3782a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3781d;
            this.f3782a = cVar3;
            this.f3783b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3783b) {
            return this.f3784c.f3785a != null;
        }
        c cVar = this.f3782a;
        return (cVar == null || cVar.f3780c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3783b) {
            this.f3783b = false;
            this.f3782a = this.f3784c.f3785a;
        } else {
            c cVar = this.f3782a;
            this.f3782a = cVar != null ? cVar.f3780c : null;
        }
        return this.f3782a;
    }
}
