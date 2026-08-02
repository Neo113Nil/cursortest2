package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464b implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f9896a;

    public C0464b(ServiceContext serviceContext) {
        this.f9896a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.f9896a.getActiveNetworkTypeProvider().getNetworkType(this.f9896a.getContext()) == NetworkType.CELL;
    }
}
