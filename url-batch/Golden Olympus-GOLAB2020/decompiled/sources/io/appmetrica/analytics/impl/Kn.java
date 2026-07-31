package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Kn extends Kh {

    /* renamed from: e, reason: collision with root package name */
    public final int f37901e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f37902f;

    public Kn(@NotNull C2793m0 c2793m0, @Nullable Zk zk, int i4, @NotNull Bundle bundle) {
        super(c2793m0, zk);
        this.f37901e = i4;
        this.f37902f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f37901e, this.f37902f);
    }
}
