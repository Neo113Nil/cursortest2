package com.onesignal.core.internal.backend;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IFeatureFlagsBackendService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome;", "", "()V", "Success", "Unavailable", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome$Success;", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome$Unavailable;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RemoteFeatureFlagsFetchOutcome {
    public /* synthetic */ RemoteFeatureFlagsFetchOutcome(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: IFeatureFlagsBackendService.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome$Success;", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome;", "result", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;", "(Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;)V", "getResult", "()Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends RemoteFeatureFlagsFetchOutcome {
        private final RemoteFeatureFlagsResult result;

        public static /* synthetic */ Success copy$default(Success success, RemoteFeatureFlagsResult remoteFeatureFlagsResult, int i, Object obj) {
            if ((i & 1) != 0) {
                remoteFeatureFlagsResult = success.result;
            }
            return success.copy(remoteFeatureFlagsResult);
        }

        /* renamed from: component1, reason: from getter */
        public final RemoteFeatureFlagsResult getResult() {
            return this.result;
        }

        public final Success copy(RemoteFeatureFlagsResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Success(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.result, ((Success) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(RemoteFeatureFlagsResult result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final RemoteFeatureFlagsResult getResult() {
            return this.result;
        }
    }

    private RemoteFeatureFlagsFetchOutcome() {
    }

    /* compiled from: IFeatureFlagsBackendService.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome$Unavailable;", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unavailable extends RemoteFeatureFlagsFetchOutcome {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unavailable)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 259983066;
        }

        public String toString() {
            return "Unavailable";
        }

        private Unavailable() {
            super(null);
        }
    }
}
