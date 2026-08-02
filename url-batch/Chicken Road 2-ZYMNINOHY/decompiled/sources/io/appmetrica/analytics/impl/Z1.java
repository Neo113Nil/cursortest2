package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* loaded from: classes.dex */
public final class Z1 implements AppSetIdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0473a2 f11334a;

    public Z1(C0473a2 c0473a2) {
        this.f11334a = c0473a2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f11334a.f11411c = new AppSetId(str, appSetIdScope);
        this.f11334a.f11412d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f11334a.f11412d.countDown();
    }
}
