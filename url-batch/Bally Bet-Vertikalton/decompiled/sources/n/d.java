package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3258a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3259b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3260c;

    public d(f fVar) {
        this.f3260c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3258a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3258a = cVar3;
            this.f3259b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3259b) {
            return this.f3260c.f3261a != null;
        }
        c cVar = this.f3258a;
        return (cVar == null || cVar.f3257c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3259b) {
            this.f3259b = false;
            this.f3258a = this.f3260c.f3261a;
        } else {
            c cVar = this.f3258a;
            this.f3258a = cVar != null ? cVar.f3257c : null;
        }
        return this.f3258a;
    }
}
