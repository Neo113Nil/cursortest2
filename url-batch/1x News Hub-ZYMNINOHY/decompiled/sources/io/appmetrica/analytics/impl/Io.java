package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Io {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6181a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PublicLogger f6182b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f6182b;
            if (publicLogger == null) {
                this.f6181a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
