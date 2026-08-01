package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3109a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3110b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3111c;

    public d(f fVar) {
        this.f3111c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3109a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3109a = cVar3;
            this.f3110b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3110b) {
            return this.f3111c.f3112a != null;
        }
        c cVar = this.f3109a;
        return (cVar == null || cVar.f3108c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3110b) {
            this.f3110b = false;
            this.f3109a = this.f3111c.f3112a;
        } else {
            c cVar = this.f3109a;
            this.f3109a = cVar != null ? cVar.f3108c : null;
        }
        return this.f3109a;
    }
}
