package n;

import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2744f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2745g = true;
    public final /* synthetic */ f h;

    public d(f fVar) {
        this.h = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f2744f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.i;
            this.f2744f = cVar3;
            this.f2745g = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2745g) {
            return this.h.f2746f != null;
        }
        c cVar = this.f2744f;
        return (cVar == null || cVar.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2745g) {
            this.f2745g = false;
            this.f2744f = this.h.f2746f;
        } else {
            c cVar = this.f2744f;
            this.f2744f = cVar != null ? cVar.h : null;
        }
        return this.f2744f;
    }
}
