package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f9954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9955b = "id_sync";

    public p(ServiceContext serviceContext) {
        this.f9954a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(String str, SdkIdentifiers sdkIdentifiers) {
        this.f9954a.getSelfReporter().reportEvent(this.f9955b, str);
    }
}
