package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Fe extends Kh {

    /* renamed from: e, reason: collision with root package name */
    public final Pf f37536e;

    public Fe(@NotNull C2793m0 c2793m0, @Nullable Zk zk, @NotNull Pf pf) {
        super(c2793m0, zk);
        this.f37536e = pf;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Pf pf = this.f37536e;
        synchronized (pf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", pf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
