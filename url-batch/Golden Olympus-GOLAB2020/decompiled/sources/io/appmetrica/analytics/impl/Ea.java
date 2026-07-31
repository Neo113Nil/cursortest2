package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Ea implements InterfaceC2909qc {
    @Override // io.appmetrica.analytics.impl.InterfaceC2909qc
    @Nullable
    public final C3009u9 a(@Nullable E7 e7) {
        C3009u9 c3009u9 = null;
        if ((e7 != null ? e7.f37408b : null) != null && e7.f37409c != null) {
            c3009u9 = new C3009u9();
            c3009u9.f39923b = e7.f37408b.doubleValue();
            c3009u9.f39922a = e7.f37409c.doubleValue();
            Integer num = e7.f37410d;
            if (num != null) {
                c3009u9.f39928g = num.intValue();
            }
            Integer num2 = e7.f37411e;
            if (num2 != null) {
                c3009u9.f39926e = num2.intValue();
            }
            Integer num3 = e7.f37412f;
            if (num3 != null) {
                c3009u9.f39925d = num3.intValue();
            }
            Integer num4 = e7.f37413g;
            if (num4 != null) {
                c3009u9.f39927f = num4.intValue();
            }
            Long l4 = e7.f37414h;
            if (l4 != null) {
                c3009u9.f39924c = TimeUnit.MILLISECONDS.toSeconds(l4.longValue());
            }
            String str = e7.f37415i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    c3009u9.f39929h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    c3009u9.f39929h = 2;
                }
            }
            String str2 = e7.f37416j;
            if (str2 != null) {
                c3009u9.f39930i = str2;
            }
        }
        return c3009u9;
    }
}
