package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f11270a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11271b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f11272c;

    public d(f fVar) {
        this.f11272c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f11270a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f11269d;
            this.f11270a = cVar3;
            this.f11271b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11271b) {
            return this.f11272c.f11273a != null;
        }
        c cVar = this.f11270a;
        return (cVar == null || cVar.f11268c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11271b) {
            this.f11271b = false;
            this.f11270a = this.f11272c.f11273a;
        } else {
            c cVar = this.f11270a;
            this.f11270a = cVar != null ? cVar.f11268c : null;
        }
        return this.f11270a;
    }
}
