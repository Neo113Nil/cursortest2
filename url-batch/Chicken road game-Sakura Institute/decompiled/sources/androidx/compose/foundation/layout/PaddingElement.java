package androidx.compose.foundation.layout;

import a0.m;
import m2.e;
import q.g0;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class PaddingElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f622a;

    /* renamed from: b, reason: collision with root package name */
    public final float f623b;

    /* renamed from: c, reason: collision with root package name */
    public final float f624c;

    /* renamed from: d, reason: collision with root package name */
    public final float f625d;

    public PaddingElement(float f9, float f10, float f11, float f12) {
        this.f622a = f9;
        this.f623b = f10;
        this.f624c = f11;
        this.f625d = f12;
        if ((f9 < 0.0f && !e.a(f9, Float.NaN)) || ((f10 < 0.0f && !e.a(f10, Float.NaN)) || ((f11 < 0.0f && !e.a(f11, Float.NaN)) || (f12 < 0.0f && !e.a(f12, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f622a, paddingElement.f622a) && e.a(this.f623b, paddingElement.f623b) && e.a(this.f624c, paddingElement.f624c) && e.a(this.f625d, paddingElement.f625d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + m.a(this.f625d, m.a(this.f624c, m.a(this.f623b, Float.hashCode(this.f622a) * 31, 31), 31), 31);
    }

    @Override // r1.s0
    public final n l() {
        g0 g0Var = new g0();
        g0Var.f7280s = this.f622a;
        g0Var.f7281t = this.f623b;
        g0Var.f7282u = this.f624c;
        g0Var.f7283v = this.f625d;
        g0Var.f7284w = true;
        return g0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        g0 g0Var = (g0) nVar;
        g0Var.f7280s = this.f622a;
        g0Var.f7281t = this.f623b;
        g0Var.f7282u = this.f624c;
        g0Var.f7283v = this.f625d;
        g0Var.f7284w = true;
    }
}
