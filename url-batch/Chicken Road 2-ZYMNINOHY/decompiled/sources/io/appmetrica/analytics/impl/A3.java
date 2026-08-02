package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class A3 extends R7 {
    @Override // io.appmetrica.analytics.impl.R7
    public final boolean a(C0913r3 c0913r3, C0913r3 c0913r32) {
        if (AbstractC0779lo.a(c0913r32.f12644a)) {
            return true;
        }
        if (AbstractC0779lo.a(c0913r3.f12644a)) {
            return false;
        }
        S7 s7 = c0913r3.f12645b;
        if (s7 == S7.f10933c) {
            if (((Number) this.f10875a.a(s7)).intValue() >= ((Number) this.f10875a.a(c0913r32.f12645b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f10875a.a(s7)).intValue() > ((Number) this.f10875a.a(c0913r32.f12645b)).intValue()) {
            return true;
        }
        return false;
    }
}
