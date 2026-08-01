package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3278a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3279b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3280c;

    public d(f fVar) {
        this.f3280c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3278a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3278a = cVar3;
            this.f3279b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3279b) {
            return this.f3280c.f3281a != null;
        }
        c cVar = this.f3278a;
        return (cVar == null || cVar.f3277c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3279b) {
            this.f3279b = false;
            this.f3278a = this.f3280c.f3281a;
        } else {
            c cVar = this.f3278a;
            this.f3278a = cVar != null ? cVar.f3277c : null;
        }
        return this.f3278a;
    }
}
