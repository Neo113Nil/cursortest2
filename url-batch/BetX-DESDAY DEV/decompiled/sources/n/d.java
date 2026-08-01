package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3625a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3626b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3627c;

    public d(f fVar) {
        this.f3627c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3625a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3624d;
            this.f3625a = cVar3;
            this.f3626b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3626b) {
            return this.f3627c.f3628a != null;
        }
        c cVar = this.f3625a;
        return (cVar == null || cVar.f3623c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3626b) {
            this.f3626b = false;
            this.f3625a = this.f3627c.f3628a;
        } else {
            c cVar = this.f3625a;
            this.f3625a = cVar != null ? cVar.f3623c : null;
        }
        return this.f3625a;
    }
}
