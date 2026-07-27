package androidx.compose.foundation.text.input.internal;

import A.a0;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.T;
import w.P;
import y.C1316f;
import y.v;

@Metadata
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C1316f f5127a;

    /* renamed from: b, reason: collision with root package name */
    public final P f5128b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f5129c;

    public LegacyAdaptingPlatformTextInputModifier(C1316f c1316f, P p4, a0 a0Var) {
        this.f5127a = c1316f;
        this.f5128b = p4;
        this.f5129c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.a(this.f5127a, legacyAdaptingPlatformTextInputModifier.f5127a) && Intrinsics.a(this.f5128b, legacyAdaptingPlatformTextInputModifier.f5128b) && Intrinsics.a(this.f5129c, legacyAdaptingPlatformTextInputModifier.f5129c);
    }

    public final int hashCode() {
        return this.f5129c.hashCode() + ((this.f5128b.hashCode() + (this.f5127a.hashCode() * 31)) * 31);
    }

    @Override // r0.T
    public final n l() {
        a0 a0Var = this.f5129c;
        return new v(this.f5127a, this.f5128b, a0Var);
    }

    @Override // r0.T
    public final void m(n nVar) {
        v vVar = (v) nVar;
        if (vVar.f3990s) {
            vVar.f11499t.d();
            vVar.f11499t.k(vVar);
        }
        C1316f c1316f = this.f5127a;
        vVar.f11499t = c1316f;
        if (vVar.f3990s) {
            if (c1316f.f11475a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            c1316f.f11475a = vVar;
        }
        vVar.f11500u = this.f5128b;
        vVar.f11501v = this.f5129c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f5127a + ", legacyTextFieldState=" + this.f5128b + ", textFieldSelectionManager=" + this.f5129c + ')';
    }
}
