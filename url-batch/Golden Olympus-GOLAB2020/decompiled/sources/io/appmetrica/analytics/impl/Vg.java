package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes3.dex */
public final class Vg implements Kl {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f38425a;

    public Vg(@NonNull Bm bm) {
        this.f38425a = bm;
    }

    @Override // io.appmetrica.analytics.impl.Kl
    public final void a() {
        NetworkTask c4 = this.f38425a.c();
        if (c4 != null) {
            Ia.f37730F.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c4);
        }
    }
}
