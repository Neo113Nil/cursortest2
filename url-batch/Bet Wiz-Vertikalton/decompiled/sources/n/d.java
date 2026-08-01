package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3191a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3192b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3193c;

    public d(f fVar) {
        this.f3193c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3191a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3191a = cVar3;
            this.f3192b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3192b) {
            return this.f3193c.f3194a != null;
        }
        c cVar = this.f3191a;
        return (cVar == null || cVar.f3190c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3192b) {
            this.f3192b = false;
            this.f3191a = this.f3193c.f3194a;
        } else {
            c cVar = this.f3191a;
            this.f3191a = cVar != null ? cVar.f3190c : null;
        }
        return this.f3191a;
    }
}
