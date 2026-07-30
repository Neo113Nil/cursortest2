package com.artillery.ctc.base;

import androidx.annotation.Keep;
import androidx.collection.a;

@Keep
/* loaded from: classes.dex */
public final class ProgressReportModel {
    private final long progressReportIntervalInMilliseconds;

    public ProgressReportModel(long j8) {
        this.progressReportIntervalInMilliseconds = j8;
    }

    public static /* synthetic */ ProgressReportModel copy$default(ProgressReportModel progressReportModel, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = progressReportModel.progressReportIntervalInMilliseconds;
        }
        return progressReportModel.copy(j8);
    }

    public final long component1() {
        return this.progressReportIntervalInMilliseconds;
    }

    public final ProgressReportModel copy(long j8) {
        return new ProgressReportModel(j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressReportModel) && this.progressReportIntervalInMilliseconds == ((ProgressReportModel) obj).progressReportIntervalInMilliseconds;
    }

    public final long getProgressReportIntervalInMilliseconds() {
        return this.progressReportIntervalInMilliseconds;
    }

    public int hashCode() {
        return a.a(this.progressReportIntervalInMilliseconds);
    }

    public String toString() {
        return "ProgressReportModel(progressReportIntervalInMilliseconds=" + this.progressReportIntervalInMilliseconds + ')';
    }
}
