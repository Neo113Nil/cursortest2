package androidx.compose.ui.layout;

import I2.l;
import U.k;
import Y1.c;
import r0.E;
import t0.T;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends T {

    /* renamed from: a, reason: collision with root package name */
    public final c f3736a;

    public OnSizeChangedModifier(c cVar) {
        this.f3736a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f3736a == ((OnSizeChangedModifier) obj).f3736a;
        }
        return false;
    }

    @Override // t0.T
    public final k h() {
        E e3 = new E();
        e3.f7110q = this.f3736a;
        e3.f7111r = l.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return e3;
    }

    public final int hashCode() {
        return this.f3736a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        E e3 = (E) kVar;
        e3.f7110q = this.f3736a;
        e3.f7111r = l.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
