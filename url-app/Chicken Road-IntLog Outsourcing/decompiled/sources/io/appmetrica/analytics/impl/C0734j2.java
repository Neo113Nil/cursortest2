package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734j2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8475a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f8476b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f8477c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f8478d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8479e;

    /* renamed from: f, reason: collision with root package name */
    public final C0709i2 f8480f;

    public C0734j2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f8475a = context;
        this.f8476b = iAppSetIdRetriever;
        this.f8478d = new CountDownLatch(1);
        this.f8479e = 20L;
        this.f8480f = new C0709i2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f8477c == null) {
            try {
                this.f8478d = new CountDownLatch(1);
                this.f8476b.retrieveAppSetId(this.f8475a, this.f8480f);
                this.f8478d.await(this.f8479e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f8477c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f8477c = appSetId;
        }
        return appSetId;
    }

    public C0734j2(Context context) {
        this(context, AbstractC0760k2.a());
    }
}
