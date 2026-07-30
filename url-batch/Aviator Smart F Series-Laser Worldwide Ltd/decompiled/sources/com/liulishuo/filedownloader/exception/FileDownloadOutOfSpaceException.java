package com.liulishuo.filedownloader.exception;

import android.annotation.TargetApi;
import com.liulishuo.filedownloader.util.f;
import java.io.IOException;

/* loaded from: classes4.dex */
public class FileDownloadOutOfSpaceException extends IOException {
    private long breakpointBytes;
    private long freeSpaceBytes;
    private long requiredSpaceBytes;

    @TargetApi(9)
    public FileDownloadOutOfSpaceException(long j8, long j9, long j10, Throwable th) {
        super(f.formatString("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j10), Long.valueOf(j9), Long.valueOf(j8)), th);
        init(j8, j9, j10);
    }

    private void init(long j8, long j9, long j10) {
        this.freeSpaceBytes = j8;
        this.requiredSpaceBytes = j9;
        this.breakpointBytes = j10;
    }

    public long getBreakpointBytes() {
        return this.breakpointBytes;
    }

    public long getFreeSpaceBytes() {
        return this.freeSpaceBytes;
    }

    public long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }

    public FileDownloadOutOfSpaceException(long j8, long j9, long j10) {
        super(f.formatString("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j10), Long.valueOf(j9), Long.valueOf(j8)));
        init(j8, j9, j10);
    }
}
