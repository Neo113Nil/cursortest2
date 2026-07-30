package androidx.compose.foundation;

import a0.m;
import m.l0;
import m.q;
import p.j;
import r1.s0;
import r6.k;
import s0.n;
import y1.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class ClickableElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f585a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f586b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f587c;

    /* renamed from: d, reason: collision with root package name */
    public final String f588d;

    /* renamed from: e, reason: collision with root package name */
    public final f f589e;

    /* renamed from: f, reason: collision with root package name */
    public final q6.a f590f;

    public ClickableElement(j jVar, l0 l0Var, boolean z8, String str, f fVar, q6.a aVar) {
        this.f585a = jVar;
        this.f586b = l0Var;
        this.f587c = z8;
        this.f588d = str;
        this.f589e = fVar;
        this.f590f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return k.a(this.f585a, clickableElement.f585a) && k.a(this.f586b, clickableElement.f586b) && this.f587c == clickableElement.f587c && k.a(this.f588d, clickableElement.f588d) && k.a(this.f589e, clickableElement.f589e) && this.f590f == clickableElement.f590f;
    }

    public final int hashCode() {
        j jVar = this.f585a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        l0 l0Var = this.f586b;
        int e9 = m.e((hashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31, 31, this.f587c);
        String str = this.f588d;
        int hashCode2 = (e9 + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.f589e;
        return this.f590f.hashCode() + ((hashCode2 + (fVar != null ? Integer.hashCode(fVar.f9803a) : 0)) * 31);
    }

    @Override // r1.s0
    public final n l() {
        return new q(this.f585a, this.f586b, this.f587c, this.f588d, this.f589e, this.f590f);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((q) nVar).G0(this.f585a, this.f586b, this.f587c, this.f588d, this.f589e, this.f590f);
    }
}
