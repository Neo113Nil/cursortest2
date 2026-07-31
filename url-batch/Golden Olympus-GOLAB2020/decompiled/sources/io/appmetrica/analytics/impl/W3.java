package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class W3 extends AbstractC2749k8 {
    @Override // io.appmetrica.analytics.impl.AbstractC2749k8
    public final boolean a(@NotNull N3 n32, @NotNull N3 n33) {
        if (AbstractC2713io.a(n33.f37991a)) {
            return true;
        }
        if (AbstractC2713io.a(n32.f37991a)) {
            return false;
        }
        EnumC2775l8 enumC2775l8 = n32.f37992b;
        if (enumC2775l8 == EnumC2775l8.f39393c) {
            if (((Number) this.f39329a.a(enumC2775l8)).intValue() >= ((Number) this.f39329a.a(n33.f37992b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f39329a.a(enumC2775l8)).intValue() > ((Number) this.f39329a.a(n33.f37992b)).intValue()) {
            return true;
        }
        return false;
    }
}
