package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f5624a;

    public C0347b(ServiceContext serviceContext) {
        this.f5624a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f5624a.getActiveNetworkTypeProvider().getNetworkType(this.f5624a.getContext()) == NetworkType.CELL;
    }
}
