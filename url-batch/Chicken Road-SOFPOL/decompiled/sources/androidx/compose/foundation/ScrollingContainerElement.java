package androidx.compose.foundation;

import a0.q;
import t.v0;
import u.i;
import u.j0;
import u.y0;
import v.j;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class ScrollingContainerElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f472a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f473b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f474c;

    /* renamed from: d, reason: collision with root package name */
    public final i f475d;

    /* renamed from: e, reason: collision with root package name */
    public final j f476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f477f;

    /* renamed from: g, reason: collision with root package name */
    public final t.j f478g;

    public ScrollingContainerElement(t.j jVar, i iVar, j0 j0Var, y0 y0Var, j jVar2, boolean z3, boolean z7) {
        this.f472a = y0Var;
        this.f473b = j0Var;
        this.f474c = z3;
        this.f475d = iVar;
        this.f476e = jVar2;
        this.f477f = z7;
        this.f478g = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return q6.i.a(this.f472a, scrollingContainerElement.f472a) && this.f473b == scrollingContainerElement.f473b && this.f474c == scrollingContainerElement.f474c && q6.i.a(this.f475d, scrollingContainerElement.f475d) && q6.i.a(this.f476e, scrollingContainerElement.f476e) && this.f477f == scrollingContainerElement.f477f && q6.i.a(this.f478g, scrollingContainerElement.f478g);
    }

    @Override // w1.x0
    public final l f() {
        v0 v0Var = new v0();
        v0Var.f6877t = this.f472a;
        v0Var.f6878u = this.f473b;
        v0Var.f6879v = this.f474c;
        v0Var.f6880w = this.f475d;
        v0Var.f6881x = this.f476e;
        v0Var.f6882y = this.f477f;
        v0Var.f6883z = this.f478g;
        return v0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((v0) lVar).w0(this.f478g, this.f475d, this.f473b, this.f472a, this.f476e, this.f477f, this.f474c);
    }

    public final int hashCode() {
        int d8 = q.d(q.d((this.f473b.hashCode() + (this.f472a.hashCode() * 31)) * 31, 31, this.f474c), 31, false);
        i iVar = this.f475d;
        int hashCode = (d8 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        j jVar = this.f476e;
        int d9 = q.d((hashCode + (jVar != null ? jVar.hashCode() : 0)) * 961, 31, this.f477f);
        t.j jVar2 = this.f478g;
        return d9 + (jVar2 != null ? jVar2.hashCode() : 0);
    }
}
