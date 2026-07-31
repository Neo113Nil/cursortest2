package androidx.compose.foundation;

import U.p;
import b0.Q;
import b0.T;
import f2.j;
import n.C0693t;
import t0.U;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final float f4755a;

    /* renamed from: b, reason: collision with root package name */
    public final T f4756b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f4757c;

    public BorderModifierNodeElement(float f3, T t3, Q q3) {
        this.f4755a = f3;
        this.f4756b = t3;
        this.f4757c = q3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return O0.e.a(this.f4755a, borderModifierNodeElement.f4755a) && this.f4756b.equals(borderModifierNodeElement.f4756b) && j.a(this.f4757c, borderModifierNodeElement.f4757c);
    }

    public final int hashCode() {
        return this.f4757c.hashCode() + ((this.f4756b.hashCode() + (Float.hashCode(this.f4755a) * 31)) * 31);
    }

    @Override // t0.U
    public final p l() {
        return new C0693t(this.f4755a, this.f4756b, this.f4757c);
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0693t c0693t = (C0693t) pVar;
        float f3 = c0693t.f7203t;
        float f4 = this.f4755a;
        boolean a3 = O0.e.a(f3, f4);
        Y.b bVar = c0693t.f7206w;
        if (!a3) {
            c0693t.f7203t = f4;
            bVar.y0();
        }
        T t3 = c0693t.f7204u;
        T t4 = this.f4756b;
        if (!j.a(t3, t4)) {
            c0693t.f7204u = t4;
            bVar.y0();
        }
        Q q3 = c0693t.f7205v;
        Q q4 = this.f4757c;
        if (j.a(q3, q4)) {
            return;
        }
        c0693t.f7205v = q4;
        bVar.y0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) O0.e.b(this.f4755a)) + ", brush=" + this.f4756b + ", shape=" + this.f4757c + ')';
    }
}
