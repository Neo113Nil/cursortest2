package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Co implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f37326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37327b = "WebView interface setup failed because of an exception.";

    public Co(Throwable th) {
        this.f37326a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f37326a, this.f37327b, new Object[0]);
    }
}
