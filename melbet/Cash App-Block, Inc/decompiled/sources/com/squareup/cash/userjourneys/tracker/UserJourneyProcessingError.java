package com.squareup.cash.userjourneys.tracker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/userjourneys/tracker/UserJourneyProcessingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "UserJourneyProcessingChannelFailed", "UserJourneyProcessingChannelClosed", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UserJourneyProcessingError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.UserJourneys.INSTANCE);
    public final String message;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/userjourneys/tracker/UserJourneyProcessingError$UserJourneyProcessingChannelClosed;", "Lcom/squareup/cash/userjourneys/tracker/UserJourneyProcessingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserJourneyProcessingChannelClosed extends UserJourneyProcessingError {
        public final String message;

        public UserJourneyProcessingChannelClosed(String str) {
            super(str);
            this.message = Recorder$$ExternalSyntheticOutline2.m$1(super.message, " Channel closed.");
        }

        @Override // com.squareup.cash.userjourneys.tracker.UserJourneyProcessingError, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/userjourneys/tracker/UserJourneyProcessingError$UserJourneyProcessingChannelFailed;", "Lcom/squareup/cash/userjourneys/tracker/UserJourneyProcessingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserJourneyProcessingChannelFailed extends UserJourneyProcessingError {
        public final String message;

        public UserJourneyProcessingChannelFailed(String str, Throwable th) {
            super(str);
            this.message = super.message + " Error: " + th;
        }

        @Override // com.squareup.cash.userjourneys.tracker.UserJourneyProcessingError, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    public UserJourneyProcessingError(String str) {
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to process user journey event: ", str, ".");
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
