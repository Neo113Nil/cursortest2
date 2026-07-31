package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0025b implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f728a;

    public C0025b(ServiceContext serviceContext) {
        this.f728a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.f728a.getActiveNetworkTypeProvider().getNetworkType(this.f728a.getContext()) == NetworkType.CELL;
    }
}
