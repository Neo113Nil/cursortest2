package androidx.compose.foundation;

import M0.e;
import U.k;
import Z1.i;
import b0.C0265P;
import b0.InterfaceC0263N;
import n.C0664t;
import t0.T;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3588a;

    /* renamed from: b, reason: collision with root package name */
    public final C0265P f3589b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0263N f3590c;

    public BorderModifierNodeElement(float f3, C0265P c0265p, InterfaceC0263N interfaceC0263N) {
        this.f3588a = f3;
        this.f3589b = c0265p;
        this.f3590c = interfaceC0263N;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return e.a(this.f3588a, borderModifierNodeElement.f3588a) && this.f3589b.equals(borderModifierNodeElement.f3589b) && i.a(this.f3590c, borderModifierNodeElement.f3590c);
    }

    @Override // t0.T
    public final k h() {
        return new C0664t(this.f3588a, this.f3589b, this.f3590c);
    }

    public final int hashCode() {
        return this.f3590c.hashCode() + ((this.f3589b.hashCode() + (Float.hashCode(this.f3588a) * 31)) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0664t c0664t = (C0664t) kVar;
        float f3 = c0664t.f6158t;
        float f4 = this.f3588a;
        boolean a3 = e.a(f3, f4);
        Y.b bVar = c0664t.f6161w;
        if (!a3) {
            c0664t.f6158t = f4;
            bVar.v0();
        }
        C0265P c0265p = c0664t.f6159u;
        C0265P c0265p2 = this.f3589b;
        if (!i.a(c0265p, c0265p2)) {
            c0664t.f6159u = c0265p2;
            bVar.v0();
        }
        InterfaceC0263N interfaceC0263N = c0664t.f6160v;
        InterfaceC0263N interfaceC0263N2 = this.f3590c;
        if (i.a(interfaceC0263N, interfaceC0263N2)) {
            return;
        }
        c0664t.f6160v = interfaceC0263N2;
        bVar.v0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) e.b(this.f3588a)) + ", brush=" + this.f3589b + ", shape=" + this.f3590c + ')';
    }
}
