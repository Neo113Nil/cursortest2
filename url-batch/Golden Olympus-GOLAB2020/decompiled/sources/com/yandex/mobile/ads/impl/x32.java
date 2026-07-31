package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a42;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x32 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(w32 w32Var, z32 z32Var, String str) {
        a42 a42Var = a42.f23152h;
        Logger a4 = a42.b.a();
        String f4 = z32Var.f();
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        a4.fine(f4 + " " + C2284v0.a(new Object[]{str}, 1, "%-22s", "format(...)") + ": " + w32Var.b());
    }

    @NotNull
    public static final String a(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        return C2284v0.a(new Object[]{str}, 1, "%6s", "format(...)");
    }
}
