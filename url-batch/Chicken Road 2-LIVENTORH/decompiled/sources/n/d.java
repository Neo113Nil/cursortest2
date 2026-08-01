package n;

import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f2703f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2704g = true;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f2705h;

    public d(f fVar) {
        this.f2705h = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f2703f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.i;
            this.f2703f = cVar3;
            this.f2704g = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2704g) {
            return this.f2705h.f2706f != null;
        }
        c cVar = this.f2703f;
        return (cVar == null || cVar.f2702h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2704g) {
            this.f2704g = false;
            this.f2703f = this.f2705h.f2706f;
        } else {
            c cVar = this.f2703f;
            this.f2703f = cVar != null ? cVar.f2702h : null;
        }
        return this.f2703f;
    }
}
