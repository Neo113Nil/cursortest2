package androidx.compose.foundation.layout;

import U.k;
import m.AbstractC0600j;
import r.y;
import t0.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final int f3628a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3629b;

    public FillElement(float f3, int i3) {
        this.f3628a = i3;
        this.f3629b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f3628a == fillElement.f3628a && this.f3629b == fillElement.f3629b;
    }

    @Override // t0.T
    public final k h() {
        y yVar = new y();
        yVar.f7106q = this.f3628a;
        yVar.f7107r = this.f3629b;
        return yVar;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3629b) + (AbstractC0600j.a(this.f3628a) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        y yVar = (y) kVar;
        yVar.f7106q = this.f3628a;
        yVar.f7107r = this.f3629b;
    }
}
