package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Ho {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10386a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PublicLogger f10387b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f10387b;
            if (publicLogger == null) {
                this.f10386a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
