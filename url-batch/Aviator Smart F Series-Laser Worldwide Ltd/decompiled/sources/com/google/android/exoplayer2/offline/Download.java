package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes3.dex */
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    final DownloadProgress progress;
    public final DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(DownloadRequest downloadRequest, int i8, long j8, long j9, long j10, int i9, int i10) {
        this(downloadRequest, i8, j8, j9, j10, i9, i10, new DownloadProgress());
    }

    public long getBytesDownloaded() {
        return this.progress.bytesDownloaded;
    }

    public float getPercentDownloaded() {
        return this.progress.percentDownloaded;
    }

    public boolean isTerminalState() {
        int i8 = this.state;
        return i8 == 3 || i8 == 4;
    }

    public Download(DownloadRequest downloadRequest, int i8, long j8, long j9, long j10, int i9, int i10, DownloadProgress downloadProgress) {
        Assertions.checkNotNull(downloadProgress);
        Assertions.checkArgument((i10 == 0) == (i8 != 4));
        if (i9 != 0) {
            Assertions.checkArgument((i8 == 2 || i8 == 0) ? false : true);
        }
        this.request = downloadRequest;
        this.state = i8;
        this.startTimeMs = j8;
        this.updateTimeMs = j9;
        this.contentLength = j10;
        this.stopReason = i9;
        this.failureReason = i10;
        this.progress = downloadProgress;
    }
}
