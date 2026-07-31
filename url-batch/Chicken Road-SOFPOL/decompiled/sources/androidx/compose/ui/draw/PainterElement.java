package androidx.compose.ui.draw;

import a0.q;
import c1.h;
import f1.m;
import l1.a0;
import q6.i;
import u1.j;
import w1.f;
import w1.x0;
import y0.b;
import y0.e;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class PainterElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f541a;

    /* renamed from: b, reason: collision with root package name */
    public final m f542b;

    public PainterElement(a0 a0Var, m mVar) {
        this.f541a = a0Var;
        this.f542b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!i.a(this.f541a, painterElement.f541a)) {
            return false;
        }
        e eVar = b.f8685h;
        if (!eVar.equals(eVar)) {
            return false;
        }
        Object obj2 = j.f7225a;
        return obj2.equals(obj2) && Float.compare(1.0f, 1.0f) == 0 && i.a(this.f542b, painterElement.f542b);
    }

    @Override // w1.x0
    public final l f() {
        e eVar = b.f8685h;
        h hVar = new h();
        hVar.f1569r = this.f541a;
        hVar.f1570s = true;
        hVar.f1571t = eVar;
        hVar.f1572u = j.f7225a;
        hVar.f1573v = 1.0f;
        hVar.f1574w = this.f542b;
        return hVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        h hVar = (h) lVar;
        boolean z3 = hVar.f1570s;
        a0 a0Var = this.f541a;
        boolean z7 = (z3 && e1.e.a(hVar.f1569r.b(), a0Var.b())) ? false : true;
        hVar.f1569r = a0Var;
        hVar.f1570s = true;
        hVar.f1571t = b.f8685h;
        hVar.f1572u = j.f7225a;
        hVar.f1573v = 1.0f;
        hVar.f1574w = this.f542b;
        if (z7) {
            f.m(hVar);
        }
        f.l(hVar);
    }

    public final int hashCode() {
        int a8 = q.a(1.0f, (j.f7225a.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + q.d(this.f541a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        m mVar = this.f542b;
        return a8 + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f541a + ", sizeToIntrinsics=true, alignment=" + b.f8685h + ", contentScale=" + j.f7225a + ", alpha=1.0, colorFilter=" + this.f542b + ')';
    }
}
