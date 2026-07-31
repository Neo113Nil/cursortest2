package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0063b5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1177a;

    public C0063b5(String str) {
        this.f1177a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f1177a);
    }
}
