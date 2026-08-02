package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* renamed from: io.appmetrica.analytics.impl.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558i2 implements AppSetIdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0583j2 f7495a;

    public C0558i2(C0583j2 c0583j2) {
        this.f7495a = c0583j2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f7495a.f7588c = new AppSetId(str, appSetIdScope);
        this.f7495a.f7589d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f7495a.f7589d.countDown();
    }
}
