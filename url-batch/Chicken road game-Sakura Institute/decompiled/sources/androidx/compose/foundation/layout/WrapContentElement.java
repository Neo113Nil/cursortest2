package androidx.compose.foundation.layout;

import a0.m;
import l.h;
import q.y0;
import q6.e;
import r1.s0;
import r6.l;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class WrapContentElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f634a;

    /* renamed from: b, reason: collision with root package name */
    public final l f635b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f636c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i7, e eVar, Object obj) {
        this.f634a = i7;
        this.f635b = (l) eVar;
        this.f636c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f634a == wrapContentElement.f634a && this.f636c.equals(wrapContentElement.f636c);
    }

    public final int hashCode() {
        return this.f636c.hashCode() + m.e(h.d(this.f634a) * 31, 31, false);
    }

    @Override // r1.s0
    public final n l() {
        y0 y0Var = new y0();
        y0Var.f7380s = this.f634a;
        y0Var.f7381t = this.f635b;
        return y0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        y0 y0Var = (y0) nVar;
        y0Var.f7380s = this.f634a;
        y0Var.f7381t = this.f635b;
    }
}
