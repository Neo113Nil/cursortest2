package h;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public c f4580f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4581g = true;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f4582h;

    public d(f fVar) {
        this.f4582h = fVar;
    }

    @Override // h.e
    public final void a(c cVar) {
        c cVar2 = this.f4580f;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f4579i;
            this.f4580f = cVar3;
            this.f4581g = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4581g) {
            return this.f4582h.f4583f != null;
        }
        c cVar = this.f4580f;
        return (cVar == null || cVar.f4578h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4581g) {
            this.f4581g = false;
            this.f4580f = this.f4582h.f4583f;
        } else {
            c cVar = this.f4580f;
            this.f4580f = cVar != null ? cVar.f4578h : null;
        }
        return this.f4580f;
    }
}
