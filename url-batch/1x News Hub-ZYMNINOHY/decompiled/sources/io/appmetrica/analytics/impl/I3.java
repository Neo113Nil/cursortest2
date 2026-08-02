package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I3 extends X7 {
    @Override // io.appmetrica.analytics.impl.X7
    public final boolean a(C0997z3 c0997z3, C0997z3 c0997z32) {
        if (AbstractC0709no.a(c0997z32.f8660a)) {
            return true;
        }
        if (AbstractC0709no.a(c0997z3.f8660a)) {
            return false;
        }
        Y7 y7 = c0997z3.f8661b;
        if (y7 == Y7.f6892c) {
            if (((Number) this.f6862a.a(y7)).intValue() >= ((Number) this.f6862a.a(c0997z32.f8661b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f6862a.a(y7)).intValue() > ((Number) this.f6862a.a(c0997z32.f8661b)).intValue()) {
            return true;
        }
        return false;
    }
}
