package ru.rustore.sdk.metrics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public abstract class MetricsException extends Exception {

    @Metadata
    public static final class MetricsDbError extends MetricsException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetricsDbError(String message, Throwable cause) {
            super(message, cause, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    @Metadata
    public static final class NetworkError extends MetricsException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public /* synthetic */ NetworkError(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : th);
        }
    }

    @Metadata
    public static final class SaveMetricsEventError extends MetricsException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SaveMetricsEventError(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public /* synthetic */ MetricsException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    private MetricsException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ MetricsException(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : th, null);
    }
}
