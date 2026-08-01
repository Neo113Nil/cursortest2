package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3275a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3276b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3277c;

    public d(f fVar) {
        this.f3277c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3275a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3275a = cVar3;
            this.f3276b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3276b) {
            return this.f3277c.f3278a != null;
        }
        c cVar = this.f3275a;
        return (cVar == null || cVar.f3274c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3276b) {
            this.f3276b = false;
            this.f3275a = this.f3277c.f3278a;
        } else {
            c cVar = this.f3275a;
            this.f3275a = cVar != null ? cVar.f3274c : null;
        }
        return this.f3275a;
    }
}
