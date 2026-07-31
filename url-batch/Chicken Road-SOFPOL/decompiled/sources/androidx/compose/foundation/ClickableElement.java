package androidx.compose.foundation;

import a0.q;
import d2.g;
import q6.i;
import t.i0;
import t.u;
import v.j;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class ClickableElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f464a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f465b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f466c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f467d;

    /* renamed from: e, reason: collision with root package name */
    public final g f468e;

    /* renamed from: f, reason: collision with root package name */
    public final p6.a f469f;

    public ClickableElement(j jVar, i0 i0Var, boolean z3, boolean z7, g gVar, p6.a aVar) {
        this.f464a = jVar;
        this.f465b = i0Var;
        this.f466c = z3;
        this.f467d = z7;
        this.f468e = gVar;
        this.f469f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return i.a(this.f464a, clickableElement.f464a) && i.a(this.f465b, clickableElement.f465b) && this.f466c == clickableElement.f466c && this.f467d == clickableElement.f467d && i.a(this.f468e, clickableElement.f468e) && this.f469f == clickableElement.f469f;
    }

    @Override // w1.x0
    public final l f() {
        return new u(this.f464a, this.f465b, this.f466c, this.f467d, this.f468e, this.f469f);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((u) lVar).y0(this.f464a, this.f465b, this.f466c, this.f467d, this.f468e, this.f469f);
    }

    public final int hashCode() {
        j jVar = this.f464a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        i0 i0Var = this.f465b;
        int d8 = q.d(q.d((hashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31, 31, this.f466c), 961, this.f467d);
        g gVar = this.f468e;
        return this.f469f.hashCode() + ((d8 + (gVar != null ? Integer.hashCode(gVar.f2122a) : 0)) * 31);
    }
}
