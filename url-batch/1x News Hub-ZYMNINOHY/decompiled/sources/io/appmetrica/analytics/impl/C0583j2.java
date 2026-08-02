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
public final class C0583j2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7586a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f7587b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f7588c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f7589d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7590e;
    public final C0558i2 f;

    public C0583j2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f7586a = context;
        this.f7587b = iAppSetIdRetriever;
        this.f7589d = new CountDownLatch(1);
        this.f7590e = 20L;
        this.f = new C0558i2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f7588c == null) {
            try {
                this.f7589d = new CountDownLatch(1);
                this.f7587b.retrieveAppSetId(this.f7586a, this.f);
                this.f7589d.await(this.f7590e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f7588c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f7588c = appSetId;
        }
        return appSetId;
    }

    public C0583j2(Context context) {
        this(context, AbstractC0609k2.a());
    }
}
