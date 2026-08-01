package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3253b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3254c;

    public d(f fVar) {
        this.f3254c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3252a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3252a = cVar3;
            this.f3253b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3253b) {
            return this.f3254c.f3255a != null;
        }
        c cVar = this.f3252a;
        return (cVar == null || cVar.f3251c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3253b) {
            this.f3253b = false;
            this.f3252a = this.f3254c.f3255a;
        } else {
            c cVar = this.f3252a;
            this.f3252a = cVar != null ? cVar.f3251c : null;
        }
        return this.f3252a;
    }
}
