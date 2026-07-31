package n;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public c f5238d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5239e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f5240f;

    public d(f fVar) {
        this.f5240f = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f5238d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f5237g;
            this.f5238d = cVar3;
            this.f5239e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5239e) {
            return this.f5240f.f5241d != null;
        }
        c cVar = this.f5238d;
        return (cVar == null || cVar.f5236f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5239e) {
            this.f5239e = false;
            this.f5238d = this.f5240f.f5241d;
        } else {
            c cVar = this.f5238d;
            this.f5238d = cVar != null ? cVar.f5236f : null;
        }
        return this.f5238d;
    }
}
