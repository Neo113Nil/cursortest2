package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3253a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3254b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3255c;

    public d(f fVar) {
        this.f3255c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3253a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3253a = cVar3;
            this.f3254b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3254b) {
            return this.f3255c.f3256a != null;
        }
        c cVar = this.f3253a;
        return (cVar == null || cVar.f3252c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3254b) {
            this.f3254b = false;
            this.f3253a = this.f3255c.f3256a;
        } else {
            c cVar = this.f3253a;
            this.f3253a = cVar != null ? cVar.f3252c : null;
        }
        return this.f3253a;
    }
}
