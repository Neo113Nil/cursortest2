package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476a5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11422a;

    public C0476a5(String str) {
        this.f11422a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f11422a);
    }
}
