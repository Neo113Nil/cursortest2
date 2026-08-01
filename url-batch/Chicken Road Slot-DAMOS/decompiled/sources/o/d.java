package o;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public c f7303d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7304e = true;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f7305i;

    public d(f fVar) {
        this.f7305i = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.f7303d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f7302r;
            this.f7303d = cVar3;
            this.f7304e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7304e) {
            return this.f7305i.f7306d != null;
        }
        c cVar = this.f7303d;
        return (cVar == null || cVar.f7301i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7304e) {
            this.f7304e = false;
            this.f7303d = this.f7305i.f7306d;
        } else {
            c cVar = this.f7303d;
            this.f7303d = cVar != null ? cVar.f7301i : null;
        }
        return this.f7303d;
    }
}
