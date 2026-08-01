package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3621a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3622b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3623c;

    public d(f fVar) {
        this.f3623c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3621a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3620d;
            this.f3621a = cVar3;
            this.f3622b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3622b) {
            return this.f3623c.f3624a != null;
        }
        c cVar = this.f3621a;
        return (cVar == null || cVar.f3619c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3622b) {
            this.f3622b = false;
            this.f3621a = this.f3623c.f3624a;
        } else {
            c cVar = this.f3621a;
            this.f3621a = cVar != null ? cVar.f3619c : null;
        }
        return this.f3621a;
    }
}
