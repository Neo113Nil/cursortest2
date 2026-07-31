package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2548ch extends Kh {

    /* renamed from: e, reason: collision with root package name */
    public final Ih f38782e;

    public C2548ch(@NotNull C2793m0 c2793m0, @Nullable Zk zk, @NotNull Ih ih) {
        super(c2793m0, zk);
        this.f38782e = ih;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Ih ih = this.f38782e;
        iAppMetricaService.reportData(ih.f37765c, ih.f37763a.d(ih.f37767e.c()));
    }
}
