package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2640g2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39026a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f39027b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f39028c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f39029d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39030e;

    /* renamed from: f, reason: collision with root package name */
    public final C2613f2 f39031f;

    public C2640g2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f39026a = context;
        this.f39027b = iAppSetIdRetriever;
        this.f39029d = new CountDownLatch(1);
        this.f39030e = 20L;
        this.f39031f = new C2613f2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f39028c == null) {
            try {
                this.f39029d = new CountDownLatch(1);
                this.f39027b.retrieveAppSetId(this.f39026a, this.f39031f);
                this.f39029d.await(this.f39030e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f39028c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f39028c = appSetId;
        }
        return appSetId;
    }

    public C2640g2(@NotNull Context context) {
        this(context, AbstractC2666h2.a());
    }
}
