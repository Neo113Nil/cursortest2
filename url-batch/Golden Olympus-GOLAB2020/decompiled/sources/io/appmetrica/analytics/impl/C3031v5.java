package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3031v5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39960a;

    public C3031v5(String str) {
        this.f39960a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f39960a);
    }
}
