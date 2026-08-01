package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3274a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3275b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3276c;

    public d(f fVar) {
        this.f3276c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3274a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3274a = cVar3;
            this.f3275b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3275b) {
            return this.f3276c.f3277a != null;
        }
        c cVar = this.f3274a;
        return (cVar == null || cVar.f3273c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3275b) {
            this.f3275b = false;
            this.f3274a = this.f3276c.f3277a;
        } else {
            c cVar = this.f3274a;
            this.f3274a = cVar != null ? cVar.f3273c : null;
        }
        return this.f3274a;
    }
}
