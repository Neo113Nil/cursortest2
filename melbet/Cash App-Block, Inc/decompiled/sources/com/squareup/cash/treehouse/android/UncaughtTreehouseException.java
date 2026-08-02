package com.squareup.cash.treehouse.android;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorImpact;
import com.squareup.cash.observability.types.ReportedError;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/treehouse/android/UncaughtTreehouseException;", "Lcom/squareup/cash/observability/types/ReportedError;", "treehouse-android"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UncaughtTreehouseException extends ReportedError {
    public final Throwable cause;
    public final Throwable exception;
    public final Set features;
    public final String groupingDescriptor;
    public final ErrorImpact impact;
    public final String message;
    public final Map metadata;
    public final LinkedHashSet targets;

    public UncaughtTreehouseException(String str, String str2, String str3, Throwable th) {
        str.getClass();
        th.getClass();
        this.exception = th;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Treehouse.INSTANCE);
        this.targets = SetsKt___SetsKt.minus(super.targets, ReportedError.ErrorReportingTarget.DATADOG);
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("app", str), new Pair("version", str2));
        if (str3 != null) {
            mutableMapOf.put("committedAt", str3);
        }
        this.metadata = MapsKt__MapsJVMKt.mapOf(new Pair("treehouse", mutableMapOf));
        this.impact = ErrorImpact.FEATURE_FAILURE;
        String message = th.getMessage();
        this.groupingDescriptor = message == null ? null : message;
        this.message = th.getMessage();
        this.cause = th.getCause();
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
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
    public final String getLocalizedMessage() {
        return this.exception.getLocalizedMessage();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // java.lang.Throwable
    public final StackTraceElement[] getStackTrace() {
        StackTraceElement[] stackTrace = this.exception.getStackTrace();
        stackTrace.getClass();
        return stackTrace;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        printStream.getClass();
        this.exception.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        this.exception.printStackTrace();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        printWriter.getClass();
        this.exception.printStackTrace(printWriter);
    }
}
