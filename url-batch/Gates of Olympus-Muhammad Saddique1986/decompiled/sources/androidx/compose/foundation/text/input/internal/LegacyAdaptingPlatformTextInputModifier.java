package androidx.compose.foundation.text.input.internal;

import B.a0;
import U.p;
import f2.j;
import t0.U;
import x.Q;
import z.C1242f;
import z.C1258v;

/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends U {

    /* renamed from: a, reason: collision with root package name */
    public final C1242f f4861a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f4862b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f4863c;

    public LegacyAdaptingPlatformTextInputModifier(C1242f c1242f, Q q3, a0 a0Var) {
        this.f4861a = c1242f;
        this.f4862b = q3;
        this.f4863c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return j.a(this.f4861a, legacyAdaptingPlatformTextInputModifier.f4861a) && j.a(this.f4862b, legacyAdaptingPlatformTextInputModifier.f4862b) && j.a(this.f4863c, legacyAdaptingPlatformTextInputModifier.f4863c);
    }

    public final int hashCode() {
        return this.f4863c.hashCode() + ((this.f4862b.hashCode() + (this.f4861a.hashCode() * 31)) * 31);
    }

    @Override // t0.U
    public final p l() {
        a0 a0Var = this.f4863c;
        return new C1258v(this.f4861a, this.f4862b, a0Var);
    }

    @Override // t0.U
    public final void m(p pVar) {
        C1258v c1258v = (C1258v) pVar;
        if (c1258v.f4501p) {
            c1258v.f10471q.e();
            c1258v.f10471q.k(c1258v);
        }
        C1242f c1242f = this.f4861a;
        c1258v.f10471q = c1242f;
        if (c1258v.f4501p) {
            if (c1242f.f10447a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            c1242f.f10447a = c1258v;
        }
        c1258v.f10472r = this.f4862b;
        c1258v.f10473s = this.f4863c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f4861a + ", legacyTextFieldState=" + this.f4862b + ", textFieldSelectionManager=" + this.f4863c + ')';
    }
}
