package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Z3 implements Jm {
    @NotNull
    public final O3 a(@NotNull N3 n32, @NotNull List<N3> list) {
        return new O3(n32, list);
    }

    @Override // io.appmetrica.analytics.impl.Jm, kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new O3((N3) obj, (List) obj2);
    }
}
