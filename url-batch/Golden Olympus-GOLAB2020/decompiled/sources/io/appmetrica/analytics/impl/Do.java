package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Do {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f37389a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PublicLogger f37390b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f37390b;
            if (publicLogger == null) {
                this.f37389a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
