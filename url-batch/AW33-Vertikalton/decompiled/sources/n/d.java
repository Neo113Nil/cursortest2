package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3270a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3271b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3272c;

    public d(f fVar) {
        this.f3272c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3270a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3270a = cVar3;
            this.f3271b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3271b) {
            return this.f3272c.f3273a != null;
        }
        c cVar = this.f3270a;
        return (cVar == null || cVar.f3269c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3271b) {
            this.f3271b = false;
            this.f3270a = this.f3272c.f3273a;
        } else {
            c cVar = this.f3270a;
            this.f3270a = cVar != null ? cVar.f3269c : null;
        }
        return this.f3270a;
    }
}
