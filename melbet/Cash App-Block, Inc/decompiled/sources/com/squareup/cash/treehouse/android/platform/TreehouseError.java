package com.squareup.cash.treehouse.android.platform;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.treehouse.errorreporter.ErrorReport;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/treehouse/android/platform/TreehouseError;", "Lcom/squareup/cash/observability/types/ReportedError;", "treehouse-android"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TreehouseError extends ReportedError {
    public final Throwable cause;
    public final ErrorReport errorReport;
    public final Set features;
    public final String groupingDescriptor;
    public final String message;
    public final Map metadata;

    public TreehouseError(String str, String str2, String str3, ErrorReport errorReport) {
        Throwable cause;
        str.getClass();
        this.errorReport = errorReport;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Treehouse.INSTANCE);
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("app", str), new Pair("version", str2));
        if (str3 != null) {
            mutableMapOf.put("committedAt", str3);
        }
        String str4 = errorReport.owner;
        mutableMapOf.put("owner", str4 == null ? "#treehouse-help" : str4);
        Map map = errorReport.customAttributes;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                mutableMapOf.putIfAbsent((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.metadata = MapsKt__MapsJVMKt.mapOf(new Pair("treehouse", mutableMapOf));
        ErrorReport errorReport2 = this.errorReport;
        String str5 = errorReport2.message;
        this.message = str5;
        String str6 = errorReport2.groupingDescriptor;
        this.groupingDescriptor = str6 != null ? str6 : str5;
        Throwable th = errorReport2.throwable;
        this.cause = (th == null || (cause = th.getCause()) == null) ? super.getCause() : cause;
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

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        String message;
        Throwable th = this.errorReport.throwable;
        return (th == null || (message = th.getMessage()) == null) ? super.getLocalizedMessage() : message;
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
        StackTraceElement[] stackTrace;
        Throwable th = this.errorReport.throwable;
        if (th != null && (stackTrace = th.getStackTrace()) != null) {
            return stackTrace;
        }
        StackTraceElement[] stackTrace2 = super.getStackTrace();
        stackTrace2.getClass();
        return stackTrace2;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        printStream.getClass();
        Throwable th = this.errorReport.throwable;
        if (th != null) {
            th.printStackTrace(printStream);
        } else {
            super.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        Throwable th = this.errorReport.throwable;
        if (th != null) {
            th.printStackTrace();
        } else {
            super.printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        printWriter.getClass();
        Throwable th = this.errorReport.throwable;
        if (th != null) {
            th.printStackTrace(printWriter);
        } else {
            super.printStackTrace(printWriter);
        }
    }
}
