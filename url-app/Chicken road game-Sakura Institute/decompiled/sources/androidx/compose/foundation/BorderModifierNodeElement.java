package androidx.compose.foundation;

import S.n;
import Z.P;
import Z.S;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.C0846t;
import r0.T;

@Metadata
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f5008a;

    /* renamed from: b, reason: collision with root package name */
    public final S f5009b;

    /* renamed from: c, reason: collision with root package name */
    public final P f5010c;

    public BorderModifierNodeElement(float f4, S s4, P p4) {
        this.f5008a = f4;
        this.f5009b = s4;
        this.f5010c = p4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return M0.e.a(this.f5008a, borderModifierNodeElement.f5008a) && this.f5009b.equals(borderModifierNodeElement.f5009b) && Intrinsics.a(this.f5010c, borderModifierNodeElement.f5010c);
    }

    public final int hashCode() {
        return this.f5010c.hashCode() + ((this.f5009b.hashCode() + (Float.hashCode(this.f5008a) * 31)) * 31);
    }

    @Override // r0.T
    public final n l() {
        return new C0846t(this.f5008a, this.f5009b, this.f5010c);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0846t c0846t = (C0846t) nVar;
        float f4 = c0846t.f8185w;
        float f5 = this.f5008a;
        boolean a4 = M0.e.a(f4, f5);
        W.b bVar = c0846t.f8188z;
        if (!a4) {
            c0846t.f8185w = f5;
            bVar.B0();
        }
        S s4 = c0846t.f8186x;
        S s5 = this.f5009b;
        if (!Intrinsics.a(s4, s5)) {
            c0846t.f8186x = s5;
            bVar.B0();
        }
        P p4 = c0846t.f8187y;
        P p5 = this.f5010c;
        if (Intrinsics.a(p4, p5)) {
            return;
        }
        c0846t.f8187y = p5;
        bVar.B0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) M0.e.c(this.f5008a)) + ", brush=" + this.f5009b + ", shape=" + this.f5010c + ')';
    }
}
