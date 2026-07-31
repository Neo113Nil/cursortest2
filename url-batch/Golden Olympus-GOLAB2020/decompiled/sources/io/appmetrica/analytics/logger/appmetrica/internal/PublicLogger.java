package io.appmetrica.analytics.logger.appmetrica.internal;

import com.ironsource.b9;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class PublicLogger extends BaseReleaseLogger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final PublicLogger f40486a = new PublicLogger("");

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f40486a;
        }

        private Companion() {
        }
    }

    public PublicLogger(@NotNull String str) {
        super("AppMetrica", b9.i.f15550d + str + ']');
    }

    @NotNull
    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
