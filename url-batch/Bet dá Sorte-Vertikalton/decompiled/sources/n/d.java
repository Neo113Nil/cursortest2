package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3311a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3312b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3313c;

    public d(f fVar) {
        this.f3313c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3311a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3311a = cVar3;
            this.f3312b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3312b) {
            return this.f3313c.f3314a != null;
        }
        c cVar = this.f3311a;
        return (cVar == null || cVar.f3310c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3312b) {
            this.f3312b = false;
            this.f3311a = this.f3313c.f3314a;
        } else {
            c cVar = this.f3311a;
            this.f3311a = cVar != null ? cVar.f3310c : null;
        }
        return this.f3311a;
    }
}
