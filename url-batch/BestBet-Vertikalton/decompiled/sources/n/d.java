package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3548a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3549b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3550c;

    public d(f fVar) {
        this.f3550c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3548a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3548a = cVar3;
            this.f3549b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3549b) {
            return this.f3550c.f3551a != null;
        }
        c cVar = this.f3548a;
        return (cVar == null || cVar.f3547c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3549b) {
            this.f3549b = false;
            this.f3548a = this.f3550c.f3551a;
        } else {
            c cVar = this.f3548a;
            this.f3548a = cVar != null ? cVar.f3547c : null;
        }
        return this.f3548a;
    }
}
