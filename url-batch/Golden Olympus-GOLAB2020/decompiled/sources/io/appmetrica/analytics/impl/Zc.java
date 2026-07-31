package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Zc implements Y8 {

    /* renamed from: a, reason: collision with root package name */
    public final Ie f38614a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f38615b;

    public Zc(@NotNull Ie ie, @NotNull Function0<Integer> function0) {
        this.f38614a = ie;
        this.f38615b = function0;
    }

    @Override // io.appmetrica.analytics.impl.Y8
    public final boolean b() {
        return ((He) this.f38614a).f37637b.get() >= ((long) ((Number) this.f38615b.invoke()).intValue());
    }
}
