package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3230b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3231c;

    public d(f fVar) {
        this.f3231c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3229a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3229a = cVar3;
            this.f3230b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3230b) {
            return this.f3231c.f3232a != null;
        }
        c cVar = this.f3229a;
        return (cVar == null || cVar.f3228c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3230b) {
            this.f3230b = false;
            this.f3229a = this.f3231c.f3232a;
        } else {
            c cVar = this.f3229a;
            this.f3229a = cVar != null ? cVar.f3228c : null;
        }
        return this.f3229a;
    }
}
