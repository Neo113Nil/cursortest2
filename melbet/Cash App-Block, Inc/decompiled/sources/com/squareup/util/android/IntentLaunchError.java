package com.squareup.util.android;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.types.ErrorImpact;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/util/android/IntentLaunchError;", "Lcom/squareup/cash/observability/types/ReportedError;", "util-android"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class IntentLaunchError extends ReportedError {
    public final RuntimeException cause;
    public final Set features;
    public final String groupingDescriptor;
    public final ErrorImpact impact;
    public final String message;
    public final Map metadata;
    public final String samplingKey;
    public final Set targets;

    public IntentLaunchError(String str, Map map, RuntimeException runtimeException) {
        EmptySet emptySet = EmptySet.INSTANCE;
        ErrorImpact errorImpact = ErrorImpact.GRACEFUL_DEGRADATION;
        map.getClass();
        emptySet.getClass();
        errorImpact.getClass();
        this.message = str;
        this.metadata = map;
        this.features = emptySet;
        this.cause = runtimeException;
        this.groupingDescriptor = "IntentLaunchError";
        this.impact = errorImpact;
        this.samplingKey = "intent_launch_error";
        this.targets = SetsKt__SetsJVMKt.setOf(ReportedError.ErrorReportingTarget.DATADOG);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentLaunchError)) {
            return false;
        }
        IntentLaunchError intentLaunchError = (IntentLaunchError) obj;
        return Intrinsics.areEqual(this.message, intentLaunchError.message) && Intrinsics.areEqual(this.metadata, intentLaunchError.metadata) && Intrinsics.areEqual(this.features, intentLaunchError.features) && Intrinsics.areEqual(this.cause, intentLaunchError.cause) && Intrinsics.areEqual(this.groupingDescriptor, intentLaunchError.groupingDescriptor) && this.impact == intentLaunchError.impact && Intrinsics.areEqual(this.samplingKey, intentLaunchError.samplingKey);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getContext() {
        return null;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final ErrorImpact getImpact() {
        return this.impact;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getSamplingKey() {
        return this.samplingKey;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.message.hashCode() * 31, this.metadata, 31), 31, this.features);
        RuntimeException runtimeException = this.cause;
        int hashCode = (m + (runtimeException == null ? 0 : runtimeException.hashCode())) * 31;
        String str = this.groupingDescriptor;
        return this.samplingKey.hashCode() + ((this.impact.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 961)) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntentLaunchError(message=");
        sb.append(this.message);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", features=");
        sb.append(this.features);
        sb.append(", cause=");
        sb.append(this.cause);
        sb.append(", groupingDescriptor=");
        sb.append(this.groupingDescriptor);
        sb.append(", context=null, impact=");
        sb.append(this.impact);
        sb.append(", samplingKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.samplingKey, ")");
    }
}
