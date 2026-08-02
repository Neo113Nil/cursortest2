package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535h5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7428a;

    public C0535h5(String str) {
        this.f7428a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f7428a);
    }
}
