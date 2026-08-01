package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3401a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3402b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3403c;

    public d(f fVar) {
        this.f3403c = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.f3401a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3401a = cVar3;
            this.f3402b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3402b) {
            return this.f3403c.f3404a != null;
        }
        c cVar = this.f3401a;
        return (cVar == null || cVar.f3400c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3402b) {
            this.f3402b = false;
            this.f3401a = this.f3403c.f3404a;
        } else {
            c cVar = this.f3401a;
            this.f3401a = cVar != null ? cVar.f3400c : null;
        }
        return this.f3401a;
    }
}
