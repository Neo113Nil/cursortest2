package androidx.compose.foundation.selection;

import a0.q;
import d2.g;
import q6.i;
import v.j;
import w1.f;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class SelectableElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f525a;

    /* renamed from: b, reason: collision with root package name */
    public final j f526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f527c;

    /* renamed from: d, reason: collision with root package name */
    public final g f528d;

    /* renamed from: e, reason: collision with root package name */
    public final p6.a f529e;

    public SelectableElement(boolean z3, j jVar, boolean z7, g gVar, p6.a aVar) {
        this.f525a = z3;
        this.f526b = jVar;
        this.f527c = z7;
        this.f528d = gVar;
        this.f529e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f525a == selectableElement.f525a && i.a(this.f526b, selectableElement.f526b) && this.f527c == selectableElement.f527c && this.f528d.equals(selectableElement.f528d) && this.f529e == selectableElement.f529e;
    }

    @Override // w1.x0
    public final l f() {
        c0.a aVar = new c0.a(this.f526b, null, false, this.f527c, this.f528d, this.f529e);
        aVar.M = this.f525a;
        return aVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        c0.a aVar = (c0.a) lVar;
        boolean z3 = aVar.M;
        boolean z7 = this.f525a;
        if (z3 != z7) {
            aVar.M = z7;
            f.n(aVar);
        }
        aVar.y0(this.f526b, null, false, this.f527c, this.f528d, this.f529e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f525a) * 31;
        j jVar = this.f526b;
        return this.f529e.hashCode() + q.b(this.f528d.f2122a, q.d(q.d((hashCode + (jVar != null ? jVar.hashCode() : 0)) * 961, 31, false), 31, this.f527c), 31);
    }
}
