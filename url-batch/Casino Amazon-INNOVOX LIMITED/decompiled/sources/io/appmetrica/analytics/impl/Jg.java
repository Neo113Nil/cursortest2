package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes3.dex */
public final class Jg implements Ll {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f907a;

    public Jg(Bm bm) {
        this.f907a = bm;
    }

    @Override // io.appmetrica.analytics.impl.Ll
    public final void a() {
        NetworkTask c = this.f907a.c();
        if (c != null) {
            C0401oa.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c);
        }
    }
}
