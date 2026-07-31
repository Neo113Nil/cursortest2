package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0034a2 implements AppSetIdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0060b2 f1155a;

    public C0034a2(C0060b2 c0060b2) {
        this.f1155a = c0060b2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f1155a.c = new AppSetId(str, appSetIdScope);
        this.f1155a.d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f1155a.d.countDown();
    }
}
