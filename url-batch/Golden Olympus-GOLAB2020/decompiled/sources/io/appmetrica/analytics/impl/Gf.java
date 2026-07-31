package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Gf implements Jm {
    @NotNull
    public final C2937rf a(@NotNull Ef ef, @NotNull List<? extends C2912qf> list) {
        return new C2937rf(ef, list);
    }

    @Override // io.appmetrica.analytics.impl.Jm, kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2937rf((Ef) obj, (List) obj2);
    }
}
