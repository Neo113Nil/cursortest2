package androidx.compose.foundation.layout;

import U.p;
import m.AbstractC0625j;
import r.C0878z;
import t0.U;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final int f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4807b;

    public FillElement(float f3, int i3) {
        this.f4806a = i3;
        this.f4807b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f4806a == fillElement.f4806a && this.f4807b == fillElement.f4807b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4807b) + (AbstractC0625j.b(this.f4806a) * 31);
    }

    @Override // t0.U
    public final p l() {
        C0878z c0878z = new C0878z();
        c0878z.f8096q = this.f4806a;
        c0878z.f8097r = this.f4807b;
        return c0878z;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0878z c0878z = (C0878z) pVar;
        c0878z.f8096q = this.f4806a;
        c0878z.f8097r = this.f4807b;
    }
}
