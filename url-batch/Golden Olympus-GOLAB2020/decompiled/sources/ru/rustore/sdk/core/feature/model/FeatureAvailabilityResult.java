package ru.rustore.sdk.core.feature.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.exception.RuStoreException;

@Metadata
/* loaded from: classes3.dex */
public abstract class FeatureAvailabilityResult {

    @Metadata
    public static final class Available extends FeatureAvailabilityResult {

        @NotNull
        public static final Available INSTANCE = new Available();

        private Available() {
            super(null);
        }
    }

    @Metadata
    public static final class Unavailable extends FeatureAvailabilityResult {

        @NotNull
        private final RuStoreException cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unavailable(@NotNull RuStoreException cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        @NotNull
        public final RuStoreException getCause() {
            return this.cause;
        }
    }

    public /* synthetic */ FeatureAvailabilityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FeatureAvailabilityResult() {
    }
}
