package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3196a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3197b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3198c;

    public d(f fVar) {
        this.f3198c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3196a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3196a = cVar3;
            this.f3197b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3197b) {
            return this.f3198c.f3199a != null;
        }
        c cVar = this.f3196a;
        return (cVar == null || cVar.f3195c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3197b) {
            this.f3197b = false;
            this.f3196a = this.f3198c.f3199a;
        } else {
            c cVar = this.f3196a;
            this.f3196a = cVar != null ? cVar.f3195c : null;
        }
        return this.f3196a;
    }
}
