package io.appmetrica.analytics.logger.appmetrica.internal;

import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class PublicLogger extends BaseReleaseLogger {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final PublicLogger f8788a = new PublicLogger("");

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f8788a;
        }

        private Companion() {
        }
    }

    public PublicLogger(String str) {
        super("AppMetrica", "[" + str + ']');
    }

    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
