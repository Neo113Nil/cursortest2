package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class Ig implements Kl {

    /* renamed from: a, reason: collision with root package name */
    public final Am f10437a;

    public Ig(Am am) {
        this.f10437a = am;
    }

    @Override // io.appmetrica.analytics.impl.Kl
    public final void a() {
        NetworkTask c4 = this.f10437a.c();
        if (c4 != null) {
            C0817na.f12417I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c4);
        }
    }
}
