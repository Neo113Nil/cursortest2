package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473a2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11409a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f11410b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f11411c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f11412d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11413e;

    /* renamed from: f, reason: collision with root package name */
    public final Z1 f11414f;

    public C0473a2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f11409a = context;
        this.f11410b = iAppSetIdRetriever;
        this.f11412d = new CountDownLatch(1);
        this.f11413e = 20L;
        this.f11414f = new Z1(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f11411c == null) {
            try {
                this.f11412d = new CountDownLatch(1);
                this.f11410b.retrieveAppSetId(this.f11409a, this.f11414f);
                this.f11412d.await(this.f11413e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f11411c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f11411c = appSetId;
        }
        return appSetId;
    }

    public C0473a2(Context context) {
        this(context, AbstractC0499b2.a());
    }
}
